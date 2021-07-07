package com.facebook.react.modules.network;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.StandardCharsets;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.p118pd.sdk.C9143oooO0oOo;
import com.p118pd.sdk.oOOO0O00;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.JavaNetCookieJar;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.ByteString;

@ReactModule(name = "Networking")
public final class NetworkingModule extends ReactContextBaseJavaModule {
    public static final int CHUNK_TIMEOUT_NS = 100000000;
    public static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    public static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    public static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    public static final String REQUEST_BODY_KEY_BASE64 = "base64";
    public static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    public static final String REQUEST_BODY_KEY_STRING = "string";
    public static final String REQUEST_BODY_KEY_URI = "uri";
    public static final String TAG = "NetworkingModule";
    public static final String USER_AGENT_HEADER_NAME = "user-agent";
    public final OkHttpClient mClient;
    public final ForwardingCookieHandler mCookieHandler;
    public final CookieJarContainer mCookieJarContainer;
    @Nullable
    public final String mDefaultUserAgent;
    public final List<RequestBodyHandler> mRequestBodyHandlers;
    public final Set<Integer> mRequestIds;
    public final List<ResponseHandler> mResponseHandlers;
    public boolean mShuttingDown;
    public final List<UriHandler> mUriHandlers;

    public interface RequestBodyHandler {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    public interface ResponseHandler {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody) throws IOException;
    }

    public interface UriHandler {
        WritableMap fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String str);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient, @Nullable List<NetworkInterceptorCreator> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            for (NetworkInterceptorCreator networkInterceptorCreator : list) {
                newBuilder.addNetworkInterceptor(networkInterceptorCreator.create());
            }
            okHttpClient = newBuilder.build();
        }
        this.mClient = okHttpClient;
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        this.mCookieJarContainer = (CookieJarContainer) this.mClient.cookieJar();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i) {
        this.mRequestIds.add(Integer.valueOf(i));
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(final int i) {
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) {
            /* class com.facebook.react.modules.network.NetworkingModule.AsyncTaskC07794 */

            public void doInBackgroundGuarded(Void... voidArr) {
                OkHttpCallUtil.cancelTag(NetworkingModule.this.mClient, Integer.valueOf(i));
            }
        }.execute(new Void[0]);
    }

    @Nullable
    private MultipartBody.Builder constructMultipartBody(ReadableArray readableArray, String str, int i) {
        MediaType mediaType;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        MultipartBody.Builder builder = new MultipartBody.Builder();
        builder.setType(MediaType.parse(str));
        int size = readableArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ReadableMap map = readableArray.getMap(i2);
            Headers extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String str2 = extractHeaders.get("content-type");
            if (str2 != null) {
                mediaType = MediaType.parse(str2);
                extractHeaders = extractHeaders.newBuilder().removeAll("content-type").build();
            } else {
                mediaType = null;
            }
            if (map.hasKey("string")) {
                builder.addPart(extractHeaders, RequestBody.create(mediaType, map.getString("string")));
            } else if (!map.hasKey("uri")) {
                ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized FormData part.", null);
            } else if (mediaType == null) {
                ResponseUtil.onRequestError(eventEmitter, i, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString("uri");
                InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string);
                if (fileInputStream == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(extractHeaders, RequestBodyUtil.create(mediaType, fileInputStream));
            }
        }
        return builder;
    }

    @Nullable
    private Headers extractHeaders(@Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        Headers.Builder builder = new Headers.Builder();
        int size = readableArray.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ReadableArray array = readableArray.getArray(i);
            if (array != null && array.size() == 2) {
                String stripHeaderName = HeaderUtil.stripHeaderName(array.getString(0));
                String stripHeaderValue = HeaderUtil.stripHeaderValue(array.getString(1));
                if (!(stripHeaderName == null || stripHeaderValue == null)) {
                    builder.add(stripHeaderName, stripHeaderValue);
                }
            }
            return null;
        }
        if (builder.get("user-agent") == null && (str = this.mDefaultUserAgent) != null) {
            builder.add("user-agent", str);
        }
        if (readableMap != null && readableMap.hasKey("string")) {
            z = true;
        }
        if (!z) {
            builder.removeAll("content-encoding");
        }
        return builder.build();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter() {
        return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i, ResponseBody responseBody) throws IOException {
        long j;
        Charset charset;
        long j2 = -1;
        try {
            ProgressResponseBody progressResponseBody = (ProgressResponseBody) responseBody;
            j = progressResponseBody.totalBytesRead();
            try {
                j2 = progressResponseBody.contentLength();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j = -1;
        }
        if (responseBody.contentType() == null) {
            charset = StandardCharsets.UTF_8;
        } else {
            charset = responseBody.contentType().charset(StandardCharsets.UTF_8);
        }
        ProgressiveStringDecoder progressiveStringDecoder = new ProgressiveStringDecoder(charset);
        InputStream byteStream = responseBody.byteStream();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = byteStream.read(bArr);
                if (read != -1) {
                    ResponseUtil.onIncrementalDataReceived(rCTDeviceEventEmitter, i, progressiveStringDecoder.decodeNext(bArr, read), j, j2);
                } else {
                    return;
                }
            }
        } finally {
            byteStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void removeRequest(int i) {
        this.mRequestIds.remove(Integer.valueOf(i));
    }

    public static boolean shouldDispatch(long j, long j2) {
        return j2 + 100000000 < j;
    }

    public static WritableMap translateHeaders(Headers headers) {
        WritableMap createMap = Arguments.createMap();
        for (int i = 0; i < headers.size(); i++) {
            String name = headers.name(i);
            if (createMap.hasKey(name)) {
                createMap.putString(name, createMap.getString(name) + ", " + headers.value(i));
            } else {
                createMap.putString(name, headers.value(i));
            }
        }
        return createMap;
    }

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, final DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, final int i) {
        if (requestBody == null) {
            return null;
        }
        return RequestBodyUtil.createProgressRequest(requestBody, new ProgressListener() {
            /* class com.facebook.react.modules.network.NetworkingModule.C07783 */
            public long last = System.nanoTime();

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if (z || NetworkingModule.shouldDispatch(nanoTime, this.last)) {
                    ResponseUtil.onDataSend(rCTDeviceEventEmitter, i, j, j2);
                    this.last = nanoTime;
                }
            }
        });
    }

    @ReactMethod
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public void addRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.add(requestBodyHandler);
    }

    public void addResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.add(responseHandler);
    }

    public void addUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.add(uriHandler);
    }

    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.clearCookies(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Networking";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mCookieJarContainer.setCookieJar(new JavaNetCookieJar(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.destroy();
        this.mCookieJarContainer.removeCookieJar();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    public void removeRequestBodyHandler(RequestBodyHandler requestBodyHandler) {
        this.mRequestBodyHandlers.remove(requestBodyHandler);
    }

    public void removeResponseHandler(ResponseHandler responseHandler) {
        this.mResponseHandlers.remove(responseHandler);
    }

    public void removeUriHandler(UriHandler uriHandler) {
        this.mUriHandlers.remove(uriHandler);
    }

    @ReactMethod
    public void sendRequest(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        try {
            sendRequestInternal(str, str2, i, readableArray, readableMap, str3, z, i2, z2);
        } catch (Throwable th) {
            FLog.m874e("NetworkingModule", "Failed to send url request: " + str2, th);
            ResponseUtil.onRequestError(getEventEmitter(), i, th.getMessage(), th);
        }
    }

    public void sendRequestInternal(String str, String str2, final int i, ReadableArray readableArray, ReadableMap readableMap, final String str3, final boolean z, int i2, boolean z2) {
        RequestBodyHandler requestBodyHandler;
        RequestBody requestBody;
        final DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (UriHandler uriHandler : this.mUriHandlers) {
                if (uriHandler.supports(parse, str3)) {
                    ResponseUtil.onDataReceived(eventEmitter, i, uriHandler.fetch(parse));
                    ResponseUtil.onRequestSuccess(eventEmitter, i);
                    return;
                }
            }
            try {
                Request.Builder url = new Request.Builder().url(str2);
                if (i != 0) {
                    url.tag(Integer.valueOf(i));
                }
                OkHttpClient.Builder newBuilder = this.mClient.newBuilder();
                if (!z2) {
                    newBuilder.cookieJar(CookieJar.NO_COOKIES);
                }
                if (z) {
                    newBuilder.addNetworkInterceptor(new Interceptor() {
                        /* class com.facebook.react.modules.network.NetworkingModule.C07751 */

                        @Override // okhttp3.Interceptor
                        public Response intercept(Interceptor.Chain chain) throws IOException {
                            Response proceed = chain.proceed(chain.request());
                            return proceed.newBuilder().body(new ProgressResponseBody(proceed.body(), new ProgressListener() {
                                /* class com.facebook.react.modules.network.NetworkingModule.C07751.C07761 */
                                public long last = System.nanoTime();

                                @Override // com.facebook.react.modules.network.ProgressListener
                                public void onProgress(long j, long j2, boolean z) {
                                    long nanoTime = System.nanoTime();
                                    if ((z || NetworkingModule.shouldDispatch(nanoTime, this.last)) && !str3.equals("text")) {
                                        C07751 r13 = C07751.this;
                                        ResponseUtil.onDataReceivedProgress(eventEmitter, i, j, j2);
                                        this.last = nanoTime;
                                    }
                                }
                            })).build();
                        }
                    });
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    newBuilder.connectTimeout((long) i2, TimeUnit.MILLISECONDS);
                }
                OkHttpClient build = newBuilder.build();
                Headers extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Unrecognized headers format", null);
                    return;
                }
                String str4 = extractHeaders.get("content-type");
                String str5 = extractHeaders.get("content-encoding");
                url.headers(extractHeaders);
                if (readableMap != null) {
                    Iterator<RequestBodyHandler> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        requestBodyHandler = it.next();
                        if (requestBodyHandler.supports(readableMap)) {
                            break;
                        }
                    }
                }
                requestBodyHandler = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    requestBody = RequestBodyUtil.getEmptyBody(str);
                } else if (requestBodyHandler != null) {
                    requestBody = requestBodyHandler.toRequestBody(readableMap, str4);
                } else if (readableMap.hasKey("string")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString("string");
                    MediaType parse2 = MediaType.parse(str4);
                    if (RequestBodyUtil.isGzipEncoding(str5)) {
                        requestBody = RequestBodyUtil.createGzip(parse2, string);
                        if (requestBody == null) {
                            ResponseUtil.onRequestError(eventEmitter, i, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        Charset charset = StandardCharsets.UTF_8;
                        if (parse2 != null) {
                            charset = parse2.charset(charset);
                        }
                        requestBody = RequestBody.create(parse2, string.getBytes(charset));
                    }
                } else if (readableMap.hasKey("base64")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    requestBody = RequestBody.create(MediaType.parse(str4), ByteString.decodeBase64(readableMap.getString("base64")));
                } else if (readableMap.hasKey("uri")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString("uri");
                    InputStream fileInputStream = RequestBodyUtil.getFileInputStream(getReactApplicationContext(), string2);
                    if (fileInputStream == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    requestBody = RequestBodyUtil.create(MediaType.parse(str4), fileInputStream);
                } else if (readableMap.hasKey("formData")) {
                    if (str4 == null) {
                        str4 = "multipart/form-data";
                    }
                    MultipartBody.Builder constructMultipartBody = constructMultipartBody(readableMap.getArray("formData"), str4, i);
                    if (constructMultipartBody != null) {
                        requestBody = constructMultipartBody.build();
                    } else {
                        return;
                    }
                } else {
                    requestBody = RequestBodyUtil.getEmptyBody(str);
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                build.newCall(url.build()).enqueue(new okhttp3.Callback() {
                    /* class com.facebook.react.modules.network.NetworkingModule.C07772 */

                    @Override // okhttp3.Callback
                    public void onFailure(Call call, IOException iOException) {
                        String str;
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            if (iOException.getMessage() != null) {
                                str = iOException.getMessage();
                            } else {
                                str = "Error while executing request: " + iOException.getClass().getSimpleName();
                            }
                            ResponseUtil.onRequestError(eventEmitter, i, str, iOException);
                        }
                    }

                    @Override // okhttp3.Callback
                    public void onResponse(Call call, Response response) throws IOException {
                        if (!NetworkingModule.this.mShuttingDown) {
                            NetworkingModule.this.removeRequest(i);
                            ResponseUtil.onResponseReceived(eventEmitter, i, response.code(), NetworkingModule.translateHeaders(response.headers()), response.request().url().toString());
                            try {
                                ResponseBody body = response.body();
                                if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                                    oOOO0O00 oooo0o00 = new oOOO0O00(body.source());
                                    String header = response.header("Content-Type");
                                    body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1, C9143oooO0oOo.OooO00o(oooo0o00));
                                }
                                for (ResponseHandler responseHandler : NetworkingModule.this.mResponseHandlers) {
                                    if (responseHandler.supports(str3)) {
                                        ResponseUtil.onDataReceived(eventEmitter, i, responseHandler.toResponseData(body));
                                        ResponseUtil.onRequestSuccess(eventEmitter, i);
                                        return;
                                    }
                                }
                                if (!z || !str3.equals("text")) {
                                    String str = "";
                                    if (str3.equals("text")) {
                                        try {
                                            str = body.string();
                                        } catch (IOException e) {
                                            if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), e);
                                            }
                                        }
                                    } else if (str3.equals("base64")) {
                                        str = Base64.encodeToString(body.bytes(), 2);
                                    }
                                    ResponseUtil.onDataReceived(eventEmitter, i, str);
                                    ResponseUtil.onRequestSuccess(eventEmitter, i);
                                    return;
                                }
                                NetworkingModule.this.readWithProgress(eventEmitter, i, body);
                                ResponseUtil.onRequestSuccess(eventEmitter, i);
                            } catch (IOException e2) {
                                ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
                            }
                        }
                    }
                });
            } catch (Exception e) {
                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
        }
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }
}
