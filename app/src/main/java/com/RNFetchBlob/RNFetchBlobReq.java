package com.RNFetchBlob;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.util.Base64;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.TLSSocketFactory;
import com.p118pd.sdk.C7399o0OOOOOo;
import com.p118pd.sdk.C7400o0OOOOo;
import com.p118pd.sdk.C7402o0OOOOoo;
import com.p118pd.sdk.C7403o0OOOo;
import com.p118pd.sdk.C7405o0OOOo00;
import com.p118pd.sdk.C7406o0OOOo0O;
import com.p118pd.sdk.C7407o0OOOo0o;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C7758o0ooooO0;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.message.entity.UMessage;
import com.umeng.message.util.HttpRequest;
import com.umeng.socialize.handler.UMSSOHandler;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.TlsVersion;
import p283fi.iki.elonen.NanoHTTPD;

public class RNFetchBlobReq extends BroadcastReceiver implements Runnable {
    public static HashMap<String, Call> OooO00o = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static ConnectionPool f14746OooO00o = new ConnectionPool();
    public static HashMap<String, RNFetchBlobProgressConfig> OooO0O0 = new HashMap<>();
    public static HashMap<String, RNFetchBlobProgressConfig> OooO0OO = new HashMap<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f14747OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RequestType f14748OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseFormat f14749OooO00o = ResponseFormat.Auto;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ResponseType f14750OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Callback f14751OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReactApplicationContext f14752OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableArray f14753OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ReadableMap f14754OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WritableMap f14755OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7399o0OOOOOo f14756OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7400o0OOOOo f14757OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<String> f14758OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public OkHttpClient f14759OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f14760OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f14761OooO0O0 = false;
    public String o0OO00O;
    public String o0OOO0o;
    public String o0Oo0oo;
    public String o0ooOOo;
    public String o0ooOoO;

    public class OooO00o implements Interceptor {
        public OooO00o() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            RNFetchBlobReq.this.f14758OooO00o.add(chain.request().url().toString());
            return chain.proceed(chain.request());
        }
    }

    public class OooO0O0 implements Interceptor {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Request f14762OooO00o;

        public OooO0O0(Request request) {
            this.f14762OooO00o = request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            ResponseBody responseBody;
            try {
                Response proceed = chain.proceed(this.f14762OooO00o);
                int i = C5093OooO0Oo.OooO0O0[RNFetchBlobReq.this.f14750OooO00o.ordinal()];
                if (i == 1) {
                    responseBody = new C7407o0OOOo0o(C0242RNFetchBlob.RCTContext, RNFetchBlobReq.this.o0ooOOo, proceed.body(), RNFetchBlobReq.this.f14757OooO00o.OooO0o0.booleanValue());
                } else if (i != 2) {
                    responseBody = new C7407o0OOOo0o(C0242RNFetchBlob.RCTContext, RNFetchBlobReq.this.o0ooOOo, proceed.body(), RNFetchBlobReq.this.f14757OooO00o.OooO0o0.booleanValue());
                } else {
                    responseBody = new C7403o0OOOo(C0242RNFetchBlob.RCTContext, RNFetchBlobReq.this.o0ooOOo, proceed.body(), RNFetchBlobReq.this.o0OO00O, RNFetchBlobReq.this.f14757OooO00o.OooO0Oo.booleanValue());
                }
                return proceed.newBuilder().body(responseBody).build();
            } catch (SocketException unused) {
                RNFetchBlobReq.this.f14761OooO0O0 = true;
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException e) {
                RNFetchBlobReq.this.f14761OooO0O0 = true;
                C7406o0OOOo0O.m18948OooO00o("RNFetchBlob error when sending request : " + e.getLocalizedMessage());
                return chain.proceed(chain.request());
            } catch (Exception unused2) {
                return chain.proceed(chain.request());
            }
        }
    }

    public class OooO0OO implements okhttp3.Callback {
        public OooO0OO() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            RNFetchBlobReq.m14972OooO00o(RNFetchBlobReq.this.o0ooOOo);
            RNFetchBlobReq rNFetchBlobReq = RNFetchBlobReq.this;
            if (rNFetchBlobReq.f14755OooO00o == null) {
                rNFetchBlobReq.f14755OooO00o = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                RNFetchBlobReq.this.f14755OooO00o.putBoolean(C7486o0OoO0oO.f20312OooO0Oo, true);
                RNFetchBlobReq.this.f14751OooO00o.invoke("request timed out.", null, null);
            } else {
                RNFetchBlobReq.this.f14751OooO00o.invoke(iOException.getLocalizedMessage(), null, null);
            }
            RNFetchBlobReq.this.OooO00o();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            ReadableMap readableMap = RNFetchBlobReq.this.f14757OooO00o.f20212OooO00o;
            if (readableMap != null) {
                String str = "";
                String string = readableMap.hasKey("title") ? RNFetchBlobReq.this.f14757OooO00o.f20212OooO00o.getString("title") : str;
                if (readableMap.hasKey("description")) {
                    str = readableMap.getString("description");
                }
                String string2 = readableMap.hasKey("mime") ? readableMap.getString("mime") : NanoHTTPD.MIME_PLAINTEXT;
                boolean z = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z2 = readableMap.hasKey(UMessage.DISPLAY_TYPE_NOTIFICATION) ? readableMap.getBoolean(UMessage.DISPLAY_TYPE_NOTIFICATION) : false;
                DownloadManager downloadManager = (DownloadManager) C0242RNFetchBlob.RCTContext.getSystemService("download");
                RNFetchBlobReq rNFetchBlobReq = RNFetchBlobReq.this;
                downloadManager.addCompletedDownload(string, str, z, string2, rNFetchBlobReq.o0OO00O, rNFetchBlobReq.f14747OooO00o, z2);
            }
            RNFetchBlobReq.this.OooO00o((RNFetchBlobReq) response);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlobReq$OooO0Oo  reason: case insensitive filesystem */
    public static /* synthetic */ class C5093OooO0Oo {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.RNFetchBlob.RNFetchBlobReq$ResponseType[] r0 = com.RNFetchBlob.RNFetchBlobReq.ResponseType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO0O0 = r0
                r1 = 1
                com.RNFetchBlob.RNFetchBlobReq$ResponseType r2 = com.RNFetchBlob.RNFetchBlobReq.ResponseType.KeepInMemory     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO0O0     // Catch:{ NoSuchFieldError -> 0x001d }
                com.RNFetchBlob.RNFetchBlobReq$ResponseType r3 = com.RNFetchBlob.RNFetchBlobReq.ResponseType.FileStorage     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.RNFetchBlob.RNFetchBlobReq$RequestType[] r2 = com.RNFetchBlob.RNFetchBlobReq.RequestType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO00o = r2
                com.RNFetchBlob.RNFetchBlobReq$RequestType r3 = com.RNFetchBlob.RNFetchBlobReq.RequestType.SingleFile     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO00o     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.RNFetchBlob.RNFetchBlobReq$RequestType r2 = com.RNFetchBlob.RNFetchBlobReq.RequestType.AsIs     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO00o     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.RNFetchBlob.RNFetchBlobReq$RequestType r1 = com.RNFetchBlob.RNFetchBlobReq.RequestType.Form     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.OooO00o     // Catch:{ NoSuchFieldError -> 0x004e }
                com.RNFetchBlob.RNFetchBlobReq$RequestType r1 = com.RNFetchBlob.RNFetchBlobReq.RequestType.WithoutBody     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobReq.C5093OooO0Oo.<clinit>():void");
        }
    }

    public enum RequestType {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    public enum ResponseFormat {
        Auto,
        UTF8,
        BASE64
    }

    public enum ResponseType {
        KeepInMemory,
        FileStorage
    }

    public RNFetchBlobReq(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.o0ooOoO = str2.toUpperCase();
        C7400o0OOOOo o0ooooo = new C7400o0OOOOo(readableMap);
        this.f14757OooO00o = o0ooooo;
        this.o0ooOOo = str;
        this.o0OOO0o = str3;
        this.f14754OooO00o = readableMap2;
        this.f14751OooO00o = callback;
        this.o0Oo0oo = str4;
        this.f14753OooO00o = readableArray;
        this.f14759OooO00o = okHttpClient;
        if (o0ooooo.f20213OooO00o.booleanValue() || this.f14757OooO00o.f20214OooO00o != null) {
            this.f14750OooO00o = ResponseType.FileStorage;
        } else {
            this.f14750OooO00o = ResponseType.KeepInMemory;
        }
        if (str4 != null) {
            this.f14748OooO00o = RequestType.SingleFile;
        } else if (readableArray != null) {
            this.f14748OooO00o = RequestType.Form;
        } else {
            this.f14748OooO00o = RequestType.WithoutBody;
        }
    }

    public static RNFetchBlobProgressConfig OooO0O0(String str) {
        if (!OooO0OO.containsKey(str)) {
            return null;
        }
        return OooO0OO.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d5 A[SYNTHETIC, Splitter:B:22:0x00d5] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0112  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
        // Method dump skipped, instructions count: 306
        */
        throw new UnsupportedOperationException("Method not decompiled: com.RNFetchBlob.RNFetchBlobReq.onReceive(android.content.Context, android.content.Intent):void");
    }

    public void run() {
        String str;
        OkHttpClient.Builder builder;
        ReadableMap readableMap = this.f14757OooO00o.f20212OooO00o;
        if (readableMap == null || !readableMap.hasKey("useDownloadManager") || !this.f14757OooO00o.f20212OooO00o.getBoolean("useDownloadManager")) {
            String str2 = this.o0ooOOo;
            if (this.f14757OooO00o.f20215OooO0O0.isEmpty()) {
                str = "";
            } else {
                str = C9058ooOoOoOO.OooOO0 + this.f14757OooO00o.f20215OooO0O0;
            }
            String str3 = this.f14757OooO00o.f20216OooO0OO;
            if (str3 != null) {
                str2 = C7406o0OOOo0O.OooO00o(str3);
                if (str2 == null) {
                    str2 = this.o0ooOOo;
                }
                File file = new File(C7405o0OOOo00.OooO00o(C0242RNFetchBlob.RCTContext, str2) + str);
                if (file.exists()) {
                    this.f14751OooO00o.invoke(null, "path", file.getAbsolutePath());
                    return;
                }
            }
            C7400o0OOOOo o0ooooo = this.f14757OooO00o;
            String str4 = o0ooooo.f20214OooO00o;
            if (str4 != null) {
                this.o0OO00O = str4;
            } else if (o0ooooo.f20213OooO00o.booleanValue()) {
                this.o0OO00O = C7405o0OOOo00.OooO00o(C0242RNFetchBlob.RCTContext, str2) + str;
            }
            try {
                if (this.f14757OooO00o.OooO0O0.booleanValue()) {
                    builder = C7406o0OOOo0O.OooO00o(this.f14759OooO00o);
                } else {
                    builder = this.f14759OooO00o.newBuilder();
                }
                Request.Builder builder2 = new Request.Builder();
                try {
                    builder2.url(new URL(this.o0OOO0o));
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
                HashMap<String, String> hashMap = new HashMap<>();
                if (this.f14754OooO00o != null) {
                    ReadableMapKeySetIterator keySetIterator = this.f14754OooO00o.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        String string = this.f14754OooO00o.getString(nextKey);
                        if (!nextKey.equalsIgnoreCase("RNFB-Response")) {
                            builder2.header(nextKey.toLowerCase(), string);
                            hashMap.put(nextKey.toLowerCase(), string);
                        } else if (string.equalsIgnoreCase("base64")) {
                            this.f14749OooO00o = ResponseFormat.BASE64;
                        } else if (string.equalsIgnoreCase(C7402o0OOOOoo.OooOO0)) {
                            this.f14749OooO00o = ResponseFormat.UTF8;
                        }
                    }
                }
                if (this.o0ooOoO.equalsIgnoreCase("post") || this.o0ooOoO.equalsIgnoreCase("put") || this.o0ooOoO.equalsIgnoreCase("patch")) {
                    String lowerCase = OooO00o(hashMap, "Content-Type").toLowerCase();
                    if (this.f14753OooO00o != null) {
                        this.f14748OooO00o = RequestType.Form;
                    } else if (lowerCase.isEmpty()) {
                        builder2.header("Content-Type", "application/octet-stream");
                        this.f14748OooO00o = RequestType.SingleFile;
                    }
                    if (this.o0Oo0oo != null) {
                        if (this.o0Oo0oo.startsWith(C7402o0OOOOoo.OooO0o0)) {
                            this.f14748OooO00o = RequestType.SingleFile;
                        } else if (lowerCase.toLowerCase().contains(C7758o0ooooO0.OooO0O0) || lowerCase.toLowerCase().startsWith("application/octet")) {
                            String replace = lowerCase.replace(C7758o0ooooO0.OooO0O0, "").replace(";BASE64", "");
                            if (hashMap.containsKey("content-type")) {
                                hashMap.put("content-type", replace);
                            }
                            if (hashMap.containsKey("Content-Type")) {
                                hashMap.put("Content-Type", replace);
                            }
                            this.f14748OooO00o = RequestType.SingleFile;
                        } else {
                            this.f14748OooO00o = RequestType.AsIs;
                        }
                    }
                } else {
                    this.f14748OooO00o = RequestType.WithoutBody;
                }
                boolean equalsIgnoreCase = OooO00o(hashMap, "Transfer-Encoding").equalsIgnoreCase("chunked");
                int i = C5093OooO0Oo.OooO00o[this.f14748OooO00o.ordinal()];
                if (i == 1) {
                    C7399o0OOOOOo OooO00o2 = new C7399o0OOOOOo(this.o0ooOOo).OooO00o(equalsIgnoreCase).OooO00o(this.f14748OooO00o).OooO00o(this.o0Oo0oo).OooO00o(MediaType.parse(OooO00o(hashMap, "content-type")));
                    this.f14756OooO00o = OooO00o2;
                    builder2.method(this.o0ooOoO, OooO00o2);
                } else if (i == 2) {
                    C7399o0OOOOOo OooO00o3 = new C7399o0OOOOOo(this.o0ooOOo).OooO00o(equalsIgnoreCase).OooO00o(this.f14748OooO00o).OooO00o(this.o0Oo0oo).OooO00o(MediaType.parse(OooO00o(hashMap, "content-type")));
                    this.f14756OooO00o = OooO00o3;
                    builder2.method(this.o0ooOoO, OooO00o3);
                } else if (i == 3) {
                    C7399o0OOOOOo OooO00o4 = new C7399o0OOOOOo(this.o0ooOOo).OooO00o(equalsIgnoreCase).OooO00o(this.f14748OooO00o).OooO00o(this.f14753OooO00o);
                    C7399o0OOOOOo OooO00o5 = OooO00o4.OooO00o(MediaType.parse("multipart/form-data; boundary=" + ("RNFetchBlob-" + this.o0ooOOo)));
                    this.f14756OooO00o = OooO00o5;
                    builder2.method(this.o0ooOoO, OooO00o5);
                } else if (i == 4) {
                    if (this.o0ooOoO.equalsIgnoreCase("post") || this.o0ooOoO.equalsIgnoreCase("put") || this.o0ooOoO.equalsIgnoreCase("patch")) {
                        builder2.method(this.o0ooOoO, RequestBody.create((MediaType) null, new byte[0]));
                    } else {
                        builder2.method(this.o0ooOoO, null);
                    }
                }
                Request build = builder2.build();
                builder.addNetworkInterceptor(new OooO00o());
                builder.addInterceptor(new OooO0O0(build));
                if (this.f14757OooO00o.OooO00o >= 0) {
                    builder.connectTimeout(this.f14757OooO00o.OooO00o, TimeUnit.MILLISECONDS);
                    builder.readTimeout(this.f14757OooO00o.OooO00o, TimeUnit.MILLISECONDS);
                }
                builder.connectionPool(f14746OooO00o);
                builder.retryOnConnectionFailure(false);
                builder.followRedirects(this.f14757OooO00o.OooO0o.booleanValue());
                builder.followSslRedirects(this.f14757OooO00o.OooO0o.booleanValue());
                builder.retryOnConnectionFailure(true);
                Call newCall = OooO00o(builder).build().newCall(build);
                OooO00o.put(this.o0ooOOo, newCall);
                newCall.enqueue(new OooO0OO());
            } catch (Exception e2) {
                e2.printStackTrace();
                OooO00o();
                this.f14751OooO00o.invoke("RNFetchBlob request error: " + e2.getMessage() + e2.getCause());
            }
        } else {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.o0OOO0o));
            request.setNotificationVisibility(1);
            if (this.f14757OooO00o.f20212OooO00o.hasKey("title")) {
                request.setTitle(this.f14757OooO00o.f20212OooO00o.getString("title"));
            }
            if (this.f14757OooO00o.f20212OooO00o.hasKey("description")) {
                request.setDescription(this.f14757OooO00o.f20212OooO00o.getString("description"));
            }
            if (this.f14757OooO00o.f20212OooO00o.hasKey("path")) {
                request.setDestinationUri(Uri.parse("file://" + this.f14757OooO00o.f20212OooO00o.getString("path")));
            }
            if (this.f14757OooO00o.f20212OooO00o.hasKey("mime")) {
                request.setMimeType(this.f14757OooO00o.f20212OooO00o.getString("mime"));
            }
            ReadableMapKeySetIterator keySetIterator2 = this.f14754OooO00o.keySetIterator();
            if (this.f14757OooO00o.f20212OooO00o.hasKey("mediaScannable") && this.f14757OooO00o.f20212OooO00o.hasKey("mediaScannable")) {
                request.allowScanningByMediaScanner();
            }
            while (keySetIterator2.hasNextKey()) {
                String nextKey2 = keySetIterator2.nextKey();
                request.addRequestHeader(nextKey2, this.f14754OooO00o.getString(nextKey2));
            }
            Context applicationContext = C0242RNFetchBlob.RCTContext.getApplicationContext();
            this.f14760OooO0O0 = ((DownloadManager) applicationContext.getSystemService("download")).enqueue(request);
            applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m14972OooO00o(String str) {
        if (OooO00o.containsKey(str)) {
            OooO00o.get(str).cancel();
            OooO00o.remove(str);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o() {
        if (OooO00o.containsKey(this.o0ooOOo)) {
            OooO00o.remove(this.o0ooOOo);
        }
        if (OooO0OO.containsKey(this.o0ooOOo)) {
            OooO0OO.remove(this.o0ooOOo);
        }
        if (OooO0O0.containsKey(this.o0ooOOo)) {
            OooO0O0.remove(this.o0ooOOo);
        }
        C7399o0OOOOOo o0oooooo = this.f14756OooO00o;
        if (o0oooooo != null) {
            o0oooooo.m18942OooO00o();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(Response response) {
        boolean OooO00o2 = m14973OooO00o(response);
        OooO00o(OooO00o(response, OooO00o2));
        int i = C5093OooO0Oo.OooO0O0[this.f14750OooO00o.ordinal()];
        if (i == 1) {
            if (OooO00o2) {
                try {
                    if (this.f14757OooO00o.OooO0OO.booleanValue()) {
                        String OooO00o3 = C7405o0OOOo00.OooO00o(this.f14752OooO00o, this.o0ooOOo);
                        InputStream byteStream = response.body().byteStream();
                        FileOutputStream fileOutputStream = new FileOutputStream(new File(OooO00o3));
                        byte[] bArr = new byte[10240];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        byteStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        this.f14751OooO00o.invoke(null, "path", OooO00o3);
                    }
                } catch (IOException unused) {
                    this.f14751OooO00o.invoke("RNFetchBlob failed to encode response data to BASE64 string.", null);
                }
            }
            byte[] bytes = response.body().bytes();
            CharsetEncoder newEncoder = Charset.forName("UTF-8").newEncoder();
            if (this.f14749OooO00o == ResponseFormat.BASE64) {
                this.f14751OooO00o.invoke(null, "base64", Base64.encodeToString(bytes, 2));
                return;
            }
            try {
                newEncoder.encode(ByteBuffer.wrap(bytes).asCharBuffer());
                String str = new String(bytes);
                this.f14751OooO00o.invoke(null, C7402o0OOOOoo.OooOO0, str);
            } catch (CharacterCodingException unused2) {
                if (this.f14749OooO00o == ResponseFormat.UTF8) {
                    this.f14751OooO00o.invoke(null, C7402o0OOOOoo.OooOO0, "");
                } else {
                    this.f14751OooO00o.invoke(null, "base64", Base64.encodeToString(bytes, 2));
                }
            }
        } else if (i != 2) {
            try {
                this.f14751OooO00o.invoke(null, C7402o0OOOOoo.OooOO0, new String(response.body().bytes(), "UTF-8"));
            } catch (IOException unused3) {
                this.f14751OooO00o.invoke("RNFetchBlob failed to encode response data to UTF8 string.", null);
            }
        } else {
            try {
                response.body().bytes();
            } catch (Exception unused4) {
            }
            String replace = this.o0OO00O.replace("?append=true", "");
            this.o0OO00O = replace;
            this.f14751OooO00o.invoke(null, "path", replace);
        }
        response.body().close();
        OooO00o();
    }

    public static RNFetchBlobProgressConfig OooO00o(String str) {
        if (!OooO0O0.containsKey(str)) {
            return null;
        }
        return OooO0O0.get(str);
    }

    private WritableMap OooO00o(Response response, boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("status", response.code());
        createMap.putString("state", "2");
        createMap.putString("taskId", this.o0ooOOo);
        createMap.putBoolean(C7486o0OoO0oO.f20312OooO0Oo, this.f14761OooO0O0);
        WritableMap createMap2 = Arguments.createMap();
        for (int i = 0; i < response.headers().size(); i++) {
            createMap2.putString(response.headers().name(i), response.headers().value(i));
        }
        WritableArray createArray = Arguments.createArray();
        Iterator<String> it = this.f14758OooO00o.iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next());
        }
        createMap.putArray("redirects", createArray);
        createMap.putMap("headers", createMap2);
        Headers headers = response.headers();
        if (z) {
            createMap.putString("respType", "blob");
        } else if (OooO00o(headers, "content-type").equalsIgnoreCase("text/")) {
            createMap.putString("respType", "text");
        } else if (OooO00o(headers, "content-type").contains(HttpRequest.CONTENT_TYPE_JSON)) {
            createMap.putString("respType", UMSSOHandler.JSON);
        } else {
            createMap.putString("respType", "");
        }
        return createMap;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private boolean m14973OooO00o(Response response) {
        boolean z;
        String OooO00o2 = OooO00o(response.headers(), "Content-Type");
        boolean z2 = !OooO00o2.equalsIgnoreCase("text/");
        boolean z3 = !OooO00o2.equalsIgnoreCase(HttpRequest.CONTENT_TYPE_JSON);
        if (this.f14757OooO00o.f20211OooO00o != null) {
            int i = 0;
            while (true) {
                if (i >= this.f14757OooO00o.f20211OooO00o.size()) {
                    break;
                } else if (OooO00o2.toLowerCase().contains(this.f14757OooO00o.f20211OooO00o.getString(i).toLowerCase())) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if ((!z3 || z2) && !z) {
                return false;
            }
            return true;
        }
        z = false;
        if (!z3) {
        }
        return false;
    }

    private String OooO00o(Headers headers, String str) {
        String str2 = headers.get(str);
        if (str2 != null) {
            return str2;
        }
        return headers.get(str.toLowerCase()) == null ? "" : headers.get(str.toLowerCase());
    }

    private String OooO00o(HashMap<String, String> hashMap, String str) {
        String str2 = hashMap.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = hashMap.get(str.toLowerCase());
        return str3 == null ? "" : str3;
    }

    private void OooO00o(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C0242RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C7402o0OOOOoo.OooO0OO, writableMap);
    }

    public static OkHttpClient.Builder OooO00o(OkHttpClient.Builder builder) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && i <= 19) {
            try {
                builder.sslSocketFactory(new TLSSocketFactory());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                FLog.m874e("OkHttpClientProvider", "Error while enabling TLS 1.2", e);
            }
        }
        return builder;
    }
}
