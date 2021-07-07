package com.p118pd.sdk;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.StandardCharsets;
import com.facebook.react.common.network.OkHttpCallUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.HeaderUtil;
import com.facebook.react.modules.network.NetworkInterceptorCreator;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.modules.network.ProgressListener;
import com.facebook.react.modules.network.ProgressResponseBody;
import com.facebook.react.modules.network.ProgressiveStringDecoder;
import com.facebook.react.modules.network.ResponseUtil;
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
import okhttp3.Callback;
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
/* renamed from: com.pd.sdk.I1I */
public final class I1I extends ReactContextBaseJavaModule {
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
    public final List<AbstractC5163OooO0o0> mRequestBodyHandlers;
    public final Set<Integer> mRequestIds;
    public final List<OooO0o> mResponseHandlers;
    public boolean mShuttingDown;
    public final List<AbstractC5164OooO0oO> mUriHandlers;

    /* renamed from: com.pd.sdk.I1I$OooO00o */
    public class OooO00o implements Interceptor {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f15284OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f15286OooO00o;

        /* renamed from: com.pd.sdk.I1I$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4911OooO00o implements ProgressListener {
            public long OooO00o = System.nanoTime();

            public C4911OooO00o() {
            }

            @Override // com.facebook.react.modules.network.ProgressListener
            public void onProgress(long j, long j2, boolean z) {
                long nanoTime = System.nanoTime();
                if ((z || I1I.shouldDispatch(nanoTime, this.OooO00o)) && !OooO00o.this.f15286OooO00o.equals("text")) {
                    OooO00o oooO00o = OooO00o.this;
                    ResponseUtil.onDataReceivedProgress(oooO00o.f15284OooO00o, oooO00o.OooO00o, j, j2);
                    this.OooO00o = nanoTime;
                }
            }
        }

        public OooO00o(String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f15286OooO00o = str;
            this.f15284OooO00o = rCTDeviceEventEmitter;
            this.OooO00o = i;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            Response proceed = chain.proceed(chain.request());
            return proceed.newBuilder().body(new ProgressResponseBody(proceed.body(), new C4911OooO00o())).build();
        }
    }

    /* renamed from: com.pd.sdk.I1I$OooO0O0 */
    public class OooO0O0 implements Callback {
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter OooO00o;
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ String o0ooOOo;

        public OooO0O0(int i, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z) {
            this.o00oO0O = i;
            this.OooO00o = rCTDeviceEventEmitter;
            this.o0ooOOo = str;
            this.OooO0O0 = z;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            String str;
            if (!I1I.this.mShuttingDown) {
                I1I.this.removeRequest(this.o00oO0O);
                if (iOException.getMessage() != null) {
                    str = iOException.getMessage();
                } else {
                    str = "Error while executing request: " + iOException.getClass().getSimpleName();
                }
                ResponseUtil.onRequestError(this.OooO00o, this.o00oO0O, str, iOException);
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            if (!I1I.this.mShuttingDown) {
                I1I.this.removeRequest(this.o00oO0O);
                ResponseUtil.onResponseReceived(this.OooO00o, this.o00oO0O, response.code(), I1I.translateHeaders(response.headers()), response.request().url().toString());
                try {
                    ResponseBody body = response.body();
                    if ("gzip".equalsIgnoreCase(response.header("Content-Encoding")) && body != null) {
                        oOOO0O00 oooo0o00 = new oOOO0O00(body.source());
                        String header = response.header("Content-Type");
                        body = ResponseBody.create(header != null ? MediaType.parse(header) : null, -1, C9143oooO0oOo.OooO00o(oooo0o00));
                    }
                    for (OooO0o oooO0o : I1I.this.mResponseHandlers) {
                        if (oooO0o.supports(this.o0ooOOo)) {
                            ResponseUtil.onDataReceived(this.OooO00o, this.o00oO0O, oooO0o.toResponseData(body));
                            ResponseUtil.onRequestSuccess(this.OooO00o, this.o00oO0O);
                            return;
                        }
                    }
                    if (!this.OooO0O0 || !this.o0ooOOo.equals("text")) {
                        String str = "";
                        if (this.o0ooOOo.equals("text")) {
                            try {
                                str = body.string();
                            } catch (IOException e) {
                                if (!response.request().method().equalsIgnoreCase("HEAD")) {
                                    ResponseUtil.onRequestError(this.OooO00o, this.o00oO0O, e.getMessage(), e);
                                }
                            }
                        } else if (this.o0ooOOo.equals("base64")) {
                            str = Base64.encodeToString(body.bytes(), 2);
                        }
                        ResponseUtil.onDataReceived(this.OooO00o, this.o00oO0O, str);
                        ResponseUtil.onRequestSuccess(this.OooO00o, this.o00oO0O);
                        return;
                    }
                    I1I.this.readWithProgress(this.OooO00o, this.o00oO0O, body);
                    ResponseUtil.onRequestSuccess(this.OooO00o, this.o00oO0O);
                } catch (IOException e2) {
                    ResponseUtil.onRequestError(this.OooO00o, this.o00oO0O, e2.getMessage(), e2);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.I1I$OooO0OO */
    public class OooO0OO implements ProgressListener {
        public final /* synthetic */ int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f15289OooO00o = System.nanoTime();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f15290OooO00o;

        public OooO0OO(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
            this.f15290OooO00o = rCTDeviceEventEmitter;
            this.OooO00o = i;
        }

        @Override // com.facebook.react.modules.network.ProgressListener
        public void onProgress(long j, long j2, boolean z) {
            long nanoTime = System.nanoTime();
            if (z || I1I.shouldDispatch(nanoTime, this.f15289OooO00o)) {
                ResponseUtil.onDataSend(this.f15290OooO00o, this.OooO00o, j, j2);
                this.f15289OooO00o = nanoTime;
            }
        }
    }

    /* renamed from: com.pd.sdk.I1I$OooO0Oo  reason: case insensitive filesystem */
    public class AsyncTaskC5162OooO0Oo extends GuardedAsyncTask<Void, Void> {
        public final /* synthetic */ int OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AsyncTaskC5162OooO0Oo(ReactContext reactContext, int i) {
            super(reactContext);
            this.OooO00o = i;
        }

        public void doInBackgroundGuarded(Void... voidArr) {
            OkHttpCallUtil.cancelTag(I1I.this.mClient, Integer.valueOf(this.OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.I1I$OooO0o */
    public interface OooO0o {
        boolean supports(String str);

        WritableMap toResponseData(ResponseBody responseBody) throws IOException;
    }

    /* renamed from: com.pd.sdk.I1I$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC5163OooO0o0 {
        boolean supports(ReadableMap readableMap);

        RequestBody toRequestBody(ReadableMap readableMap, String str);
    }

    /* renamed from: com.pd.sdk.I1I$OooO0oO  reason: case insensitive filesystem */
    public interface AbstractC5164OooO0oO {
        WritableMap fetch(Uri uri) throws IOException;

        boolean supports(Uri uri, String str);
    }

    public I1I(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient, @Nullable List<NetworkInterceptorCreator> list) {
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

    private void cancelRequest(int i) {
        new AsyncTaskC5162OooO0Oo(getReactApplicationContext(), i).execute(new Void[0]);
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
                InputStream OooO00o2 = C8676oo0OoOoo.OooO00o(getReactApplicationContext(), string);
                if (OooO00o2 == null) {
                    ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                builder.addPart(extractHeaders, C8676oo0OoOoo.OooO00o(mediaType, OooO00o2));
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

    private RequestBody wrapRequestBodyWithProgressEmitter(RequestBody requestBody, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i) {
        if (requestBody == null) {
            return null;
        }
        return C8676oo0OoOoo.OooO00o(requestBody, new OooO0OO(rCTDeviceEventEmitter, i));
    }

    @ReactMethod
    public void abortRequest(int i) {
        cancelRequest(i);
        removeRequest(i);
    }

    public void addRequestBodyHandler(AbstractC5163OooO0o0 oooO0o0) {
        this.mRequestBodyHandlers.add(oooO0o0);
    }

    public void addResponseHandler(OooO0o oooO0o) {
        this.mResponseHandlers.add(oooO0o);
    }

    public void addUriHandler(AbstractC5164OooO0oO oooO0oO) {
        this.mUriHandlers.add(oooO0oO);
    }

    @ReactMethod
    public void clearCookies(com.facebook.react.bridge.Callback callback) {
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

    public void removeRequestBodyHandler(AbstractC5163OooO0o0 oooO0o0) {
        this.mRequestBodyHandlers.remove(oooO0o0);
    }

    public void removeResponseHandler(OooO0o oooO0o) {
        this.mResponseHandlers.remove(oooO0o);
    }

    public void removeUriHandler(AbstractC5164OooO0oO oooO0oO) {
        this.mUriHandlers.remove(oooO0oO);
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

    public void sendRequestInternal(String str, String str2, int i, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z, int i2, boolean z2) {
        AbstractC5163OooO0o0 oooO0o0;
        RequestBody requestBody;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter();
        try {
            Uri parse = Uri.parse(str2);
            for (AbstractC5164OooO0oO oooO0oO : this.mUriHandlers) {
                if (oooO0oO.supports(parse, str3)) {
                    ResponseUtil.onDataReceived(eventEmitter, i, oooO0oO.fetch(parse));
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
                    newBuilder.addNetworkInterceptor(new OooO00o(str3, eventEmitter, i));
                }
                if (i2 != this.mClient.connectTimeoutMillis()) {
                    long j = (long) i2;
                    newBuilder.connectTimeout(j, TimeUnit.MILLISECONDS);
                    newBuilder.readTimeout(j, TimeUnit.MILLISECONDS);
                    newBuilder.writeTimeout(j, TimeUnit.MILLISECONDS);
                }
                if (C8654oo0Oo00.OooO00o().m20278OooO00o(str2) && C8654oo0Oo00.OooO00o().m20275OooO00o() != null) {
                    C8654oo0Oo00.OooO00o().m20275OooO00o().OooO00o(getReactApplicationContext(), newBuilder);
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
                    Iterator<AbstractC5163OooO0o0> it = this.mRequestBodyHandlers.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        oooO0o0 = it.next();
                        if (oooO0o0.supports(readableMap)) {
                            break;
                        }
                    }
                }
                oooO0o0 = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    requestBody = C8676oo0OoOoo.OooO00o(str);
                } else if (oooO0o0 != null) {
                    requestBody = oooO0o0.toRequestBody(readableMap, str4);
                } else if (readableMap.hasKey("string")) {
                    if (str4 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString("string");
                    MediaType parse2 = MediaType.parse(str4);
                    if (C8676oo0OoOoo.m20293OooO00o(str5)) {
                        requestBody = C8676oo0OoOoo.OooO00o(parse2, string);
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
                    InputStream OooO00o2 = C8676oo0OoOoo.OooO00o(getReactApplicationContext(), string2);
                    if (OooO00o2 == null) {
                        ResponseUtil.onRequestError(eventEmitter, i, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    requestBody = C8676oo0OoOoo.OooO00o(MediaType.parse(str4), OooO00o2);
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
                    requestBody = C8676oo0OoOoo.OooO00o(str);
                }
                url.method(str, wrapRequestBodyWithProgressEmitter(requestBody, eventEmitter, i));
                addRequest(i);
                build.newCall(url.build()).enqueue(new OooO0O0(i, eventEmitter, str3, z));
            } catch (Exception e) {
                ResponseUtil.onRequestError(eventEmitter, i, e.getMessage(), null);
            }
        } catch (IOException e2) {
            ResponseUtil.onRequestError(eventEmitter, i, e2.getMessage(), e2);
        }
    }

    public I1I(ReactApplicationContext reactApplicationContext, @Nullable String str, OkHttpClient okHttpClient) {
        this(reactApplicationContext, str, okHttpClient, null);
    }

    public I1I(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }

    public I1I(ReactApplicationContext reactApplicationContext, List<NetworkInterceptorCreator> list) {
        this(reactApplicationContext, null, OkHttpClientProvider.createClient(reactApplicationContext), list);
    }

    public I1I(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, OkHttpClientProvider.createClient(reactApplicationContext), null);
    }
}
