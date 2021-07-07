package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.RNFetchBlobProgressConfig;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import com.jinhui365.util.util.gson.GsonUtil;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7402o0OOOOoo;
import com.p118pd.sdk.C7405o0OOOo00;
import com.p118pd.sdk.C7409o0OOOoO0;
import com.p118pd.sdk.C8736oo0oOOOo;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8742oo0oOo00;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* renamed from: com.RNFetchBlob.RNFetchBlob */
public class C0242RNFetchBlob extends ReactContextBaseJavaModule {
    public static boolean ActionViewVisible = false;
    public static final String LOG_TYPE = "FileManager";
    public static ReactApplicationContext RCTContext;
    public static LinkedBlockingQueue<Runnable> fsTaskQueue = new LinkedBlockingQueue<>();
    public static ThreadPoolExecutor fsThreadPool = new ThreadPoolExecutor(2, 10, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS, taskQueue);
    public static HashMap<Integer, Promise> promiseTable = new HashMap<>();
    public static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    public static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS, TimeUnit.MILLISECONDS, taskQueue);
    public final OkHttpClient mClient = OkHttpClientProvider.getOkHttpClient();
    public final ForwardingCookieHandler mCookieHandler;
    public final CookieJarContainer mCookieJarContainer;

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO */
    public class OooO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f14726OooO00o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO(String str, String str2, Promise promise) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.f14726OooO00o = promise;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.o0ooOoO, this.f14726OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactApplicationContext f14727OooO00o;
        public final /* synthetic */ int o00oO0O;
        public final /* synthetic */ String o0OOO0o;
        public final /* synthetic */ int o0ooOO0;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooO00o(ReactApplicationContext reactApplicationContext, String str, String str2, int i, int i2, String str3) {
            this.f14727OooO00o = reactApplicationContext;
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            this.o0OOO0o = str3;
        }

        public void run() {
            new C7405o0OOOo00(this.f14727OooO00o).OooO00o(this.o0ooOOo, this.o0ooOoO, this.o00oO0O, this.o0ooOO0, this.o0OOO0o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0O0 */
    public class OooO0O0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callback f14728OooO00o;

        public OooO0O0(Callback callback) {
            this.f14728OooO00o = callback;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.f14728OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0OO */
    public class OooO0OO extends OnBasePermissionGrantedListener {
        public final /* synthetic */ Activity OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f14730OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f14731OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(Context context, String str, Promise promise, Activity activity) {
            super(context);
            this.f14731OooO00o = str;
            this.f14730OooO00o = promise;
            this.OooO00o = activity;
        }

        @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
        public void onGranted() {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            String str = this.f14731OooO00o;
            if (str != null) {
                intent.setType(str);
            } else {
                intent.setType("*/*");
            }
            intent.addCategory("android.intent.category.OPENABLE");
            C0242RNFetchBlob.promiseTable.put(C7402o0OOOOoo.OooO00o, this.f14730OooO00o);
            this.OooO00o.startActivityForResult(intent, C7402o0OOOOoo.OooO00o.intValue(), null);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0Oo  reason: case insensitive filesystem */
    public class C5088OooO0Oo implements ActivityEventListener {
        public C5088OooO0Oo() {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
            String str;
            if (i == C7402o0OOOOoo.OooO00o.intValue() && i2 == -1) {
                Uri data = intent.getData();
                if (Build.VERSION.SDK_INT > 19) {
                    str = C7409o0OOOoO0.OooO0OO(activity, data);
                } else {
                    str = data.getPath();
                }
                WritableMap createMap = Arguments.createMap();
                if (C8741oo0oOo0.OooO0Oo(str)) {
                    String substring = str.substring(str.lastIndexOf(C9058ooOoOoOO.OooOO0));
                    if (C7409o0OOOoO0.m18949OooO00o(substring)) {
                        str = C8736oo0oOOOo.m20353OooO00o(str);
                        try {
                            createMap.putString("fileData", C8736oo0oOOOo.m20352OooO00o(C8736oo0oOOOo.OooO00o(activity, data), 100));
                        } catch (IOException e) {
                            e.printStackTrace();
                        } catch (Exception unused) {
                        }
                    }
                    createMap.putString("fileUrl", str);
                    createMap.putString("fileName", str.substring(str.lastIndexOf(C8932ooOOO0o.OooO0OO)).replace(C8932ooOOO0o.OooO0OO, ""));
                    createMap.putString("fileType", substring);
                }
                C0242RNFetchBlob.promiseTable.get(C7402o0OOOOoo.OooO00o).resolve(createMap);
                C0242RNFetchBlob.promiseTable.remove(C7402o0OOOOoo.OooO00o);
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0o */
    public class OooO0o implements LifecycleEventListener {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f14732OooO00o;

        public OooO0o(Promise promise) {
            this.f14732OooO00o = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (C0242RNFetchBlob.ActionViewVisible) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("code", 0);
                this.f14732OooO00o.resolve(createMap);
            }
            C0242RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0o0  reason: case insensitive filesystem */
    public class RunnableC5089OooO0o0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callback f14733OooO00o;
        public final /* synthetic */ String o0OOO0o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public RunnableC5089OooO0o0(String str, String str2, String str3, Callback callback) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.o0OOO0o = str3;
            this.f14733OooO00o = callback;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.o0ooOoO, this.o0OOO0o, this.f14733OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0oO  reason: case insensitive filesystem */
    public class RunnableC5090OooO0oO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callback f14734OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f14735OooO00o;
        public final /* synthetic */ String o0ooOOo;

        public RunnableC5090OooO0oO(String str, ReadableArray readableArray, Callback callback) {
            this.o0ooOOo = str;
            this.f14735OooO00o = readableArray;
            this.f14734OooO00o = callback;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.f14735OooO00o, this.f14734OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooO0oo  reason: case insensitive filesystem */
    public class RunnableC5091OooO0oo implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callback f14736OooO00o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public RunnableC5091OooO0oo(String str, String str2, Callback callback) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.f14736OooO00o = callback;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.o0ooOoO, this.f14736OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooOO0 */
    public class OooOO0 implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f14737OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f14738OooO00o;
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ String o0ooOOo;

        public OooOO0(String str, ReadableArray readableArray, boolean z, Promise promise) {
            this.o0ooOOo = str;
            this.f14738OooO00o = readableArray;
            this.OooO0O0 = z;
            this.f14737OooO00o = promise;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.f14738OooO00o, this.OooO0O0, this.f14737OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooOO0O */
    public class OooOO0O implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Promise f14739OooO00o;
        public final /* synthetic */ boolean OooO0O0;
        public final /* synthetic */ String o0OOO0o;
        public final /* synthetic */ String o0ooOOo;
        public final /* synthetic */ String o0ooOoO;

        public OooOO0O(String str, String str2, String str3, boolean z, Promise promise) {
            this.o0ooOOo = str;
            this.o0ooOoO = str2;
            this.o0OOO0o = str3;
            this.OooO0O0 = z;
            this.f14739OooO00o = promise;
        }

        public void run() {
            C7405o0OOOo00.OooO00o(this.o0ooOOo, this.o0ooOoO, this.o0OOO0o, this.OooO0O0, this.f14739OooO00o);
        }
    }

    /* renamed from: com.RNFetchBlob.RNFetchBlob$OooOO0o  reason: case insensitive filesystem */
    public class RunnableC5092OooOO0o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callback f14740OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReactApplicationContext f14741OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ReadableArray f14742OooO00o;

        public RunnableC5092OooOO0o(ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f14742OooO00o = readableArray;
            this.f14741OooO00o = reactApplicationContext;
            this.f14740OooO00o = callback;
        }

        public void run() {
            int size = this.f14742OooO00o.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i = 0; i < size; i++) {
                ReadableMap map = this.f14742OooO00o.getMap(i);
                if (map.hasKey("path")) {
                    strArr[i] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i] = map.getString("mime");
                    } else {
                        strArr2[i] = null;
                    }
                }
            }
            new C7405o0OOOo00(this.f14741OooO00o).OooO00o(strArr, strArr2, this.f14740OooO00o);
        }
    }

    public C0242RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieHandler = new ForwardingCookieHandler(reactApplicationContext);
        CookieJarContainer cookieJarContainer = (CookieJarContainer) this.mClient.cookieJar();
        this.mCookieJarContainer = cookieJarContainer;
        cookieJarContainer.setCookieJar(new JavaNetCookieJar(this.mCookieHandler));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new C5088OooO0Oo());
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "openFile");
        hashMap.put("communication_type", "rn-call-native");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("path", str);
        hashMap2.put("mime", str2);
        hashMap.put("in_params", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        try {
            Activity currentActivity = getCurrentActivity();
            Uri uriForFile = FileProvider.getUriForFile(currentActivity, C8742oo0oOo00.m20371OooO0O0((Context) getCurrentActivity()) + ".RNFetchBlobFileProvider", new File(str));
            if (Build.VERSION.SDK_INT >= 24) {
                Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uriForFile, str2);
                dataAndType.setFlags(1);
                if (dataAndType.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                    getReactApplicationContext().startActivity(dataAndType);
                }
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                getReactApplicationContext().startActivity(intent.setDataAndType(Uri.parse("file://" + str), str2).setFlags(CommonNetImpl.FLAG_AUTH));
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new OooO0o(promise));
        } catch (Exception e) {
            promise.reject(e.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        String OooO00o2 = C7405o0OOOo00.m18946OooO00o(readableMap.getString("path"));
        if (OooO00o2 == null) {
            promise.reject("RNFetchblob.addCompleteDownload can not resolve URI:" + readableMap.getString("path"), "RNFetchblob.addCompleteDownload can not resolve URI:" + OooO00o2);
            return;
        }
        try {
            WritableMap OooO00o3 = C7405o0OOOo00.OooO00o(OooO00o2);
            String str = "";
            String string = readableMap.hasKey("title") ? readableMap.getString("title") : str;
            if (readableMap.hasKey("description")) {
                str = readableMap.getString("description");
            }
            downloadManager.addCompletedDownload(string, str, true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, OooO00o2, Long.valueOf(OooO00o3.getString(FileAttachment.KEY_SIZE)).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
            promise.resolve(null);
        } catch (Exception e) {
            promise.reject("RNFetchblob.addCompleteDownload failed", e.getStackTrace().toString());
        }
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            RNFetchBlobReq.m14972OooO00o(str);
            callback.invoke(null, str);
        } catch (Exception e) {
            callback.invoke(e.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        C7405o0OOOo00.OooO00o(str, callback);
    }

    @ReactMethod
    /* renamed from: cp */
    public void mo3858cp(String str, String str2, Callback callback) {
        threadPool.execute(new RunnableC5091OooO0oo(str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Callback callback) {
        threadPool.execute(new RunnableC5089OooO0o0(str, str2, str3, callback));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Callback callback) {
        threadPool.execute(new RunnableC5090OooO0oO(str, readableArray, callback));
    }

    @ReactMethod
    /* renamed from: df */
    public void mo3861df(Callback callback) {
        fsThreadPool.execute(new OooO0O0(callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i, int i2) {
        RNFetchBlobReq.OooO0O0.put(str, new RNFetchBlobProgressConfig(true, i, i2, RNFetchBlobProgressConfig.ReportType.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i, int i2) {
        RNFetchBlobReq.OooO0OO.put(str, new RNFetchBlobProgressConfig(true, i, i2, RNFetchBlobProgressConfig.ReportType.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        C7405o0OOOo00.OooO0O0(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new RNFetchBlobReq(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new RNFetchBlobReq(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return C7405o0OOOo00.OooO00o(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "chooseFile");
        hashMap.put("communication_type", "rn-call-native");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("mime", str);
        hashMap.put("in_params", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, "FileManager:getContentIntent；activity null");
            return;
        }
        PermissionManager.OooO00o(currentActivity).OooO00o(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new OooO0OO(currentActivity, str, promise, currentActivity));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFetchBlob";
    }

    @ReactMethod
    /* renamed from: ls */
    public void mo3870ls(String str, Callback callback) {
        C7405o0OOOo00.OooO0OO(str, callback);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        C7405o0OOOo00.OooO0Oo(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Callback callback) {
        C7405o0OOOo00.OooO0o0(str, callback);
    }

    @ReactMethod
    /* renamed from: mv */
    public void mo3873mv(String str, String str2, Callback callback) {
        C7405o0OOOo00.OooO0O0(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        threadPool.execute(new OooO(str, str2, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i, int i2, String str3) {
        fsThreadPool.execute(new OooO00o(getReactApplicationContext(), str, str2, i, i2, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        C7405o0OOOo00.OooO00o(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new RunnableC5092OooOO0o(readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i, int i2, Promise promise) {
        C7405o0OOOo00.OooO00o(str, str2, i, i2, "", promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        C7405o0OOOo00.OooO0o(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        C7405o0OOOo00.OooO0oO(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        C7405o0OOOo00.OooO0O0(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        C7405o0OOOo00.OooO0OO(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z, Promise promise) {
        threadPool.execute(new OooOO0O(str, str2, str3, z, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z, Promise promise) {
        threadPool.execute(new OooOO0(str, readableArray, z, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z, Callback callback) {
        new C7405o0OOOo00(getReactApplicationContext()).OooO00o(str, str2, z, callback);
    }
}
