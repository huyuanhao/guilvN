package com.rxhui.android_log_sdk.p253rn;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.p118pd.sdk.AbstractC8928ooOOO0O;
import com.p118pd.sdk.C8654oo0Oo00;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8908ooOO0OoO;
import com.p118pd.sdk.C8912ooOO0o0;
import com.p118pd.sdk.C8914ooOO0o0O;
import com.p118pd.sdk.C8938ooOOOO00;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.analytics.pro.C3416b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;

/* renamed from: com.rxhui.android_log_sdk.rn.LogModule */
public class LogModule extends ReactContextBaseJavaModule implements AbstractC8928ooOOO0O {
    public static final int CORE_POOL_SIZE;
    public static final int CPU_COUNT;
    public static final String EVENT_TYPE_KEY = "__EVENT_TYPE__";
    public static final String EVENT_TYPE_VALUE = "report";
    public static final long KEEP_ALIVE = 1;
    public static final int MAXIMUM_POOL_SIZE;
    public static final Executor THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1, TimeUnit.SECONDS, workQueue, sThreadFactory);
    public static final ThreadFactory sThreadFactory = new OooO00o();
    public static final BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue(128);
    public final String MODULE_NAME = "LogModule";
    public ReactApplicationContext mContext;

    /* renamed from: com.rxhui.android_log_sdk.rn.LogModule$OooO00o */
    public static class OooO00o implements ThreadFactory {
        public final AtomicInteger OooO00o = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "LogRecord #" + this.OooO00o.getAndIncrement());
        }
    }

    /* renamed from: com.rxhui.android_log_sdk.rn.LogModule$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public final /* synthetic */ Promise OooO00o;

        public OooO0O0(Promise promise) {
            this.OooO00o = promise;
        }

        public void run() {
            this.OooO00o.resolve(Integer.valueOf(C8741oo0oOo0.m20357OooO00o(LogCollectorManager.sharedInstance().getLogParamsManager().OooO0Oo())));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = availableProcessors + 1;
        MAXIMUM_POOL_SIZE = (availableProcessors * 2) + 1;
    }

    public LogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
        C8908ooOO0OoO.OooO00o().OooO00o(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        hashMap.put("startupTime", Long.valueOf(logParamsManager.m20560OooO0O0()));
        hashMap.put("startupTimes", Integer.valueOf(logParamsManager.OooO0O0()));
        return hashMap;
    }

    @ReactMethod
    public void getLogId(ReadableMap readableMap, Promise promise) {
        THREAD_POOL_EXECUTOR.execute(new OooO0O0(promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "LogModule";
    }

    @ReactMethod
    public void getSessionStartTime(ReadableMap readableMap, Promise promise) {
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        promise.resolve(logParamsManager.m20556OooO00o() + "");
    }

    @ReactMethod
    public void getSessionTimes(ReadableMap readableMap, Promise promise) {
        promise.resolve(Integer.valueOf(LogCollectorManager.sharedInstance().getLogParamsManager().OooO00o()));
    }

    @ReactMethod
    public void noticeReport(ReadableMap readableMap, Promise promise) {
        C8908ooOO0OoO.OooO00o().OooO00o(true, false);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        promise.resolve(createMap);
    }

    @Override // com.p118pd.sdk.AbstractC8928ooOOO0O
    public void report() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("__EVENT_TYPE__", "report");
        C8654oo0Oo00.OooO00o().OooO0O0(createMap);
    }

    public void sendLogEvent(WritableMap writableMap) {
        WritableNativeMap makeNativeMap = Arguments.makeNativeMap(writableMap.toHashMap());
        if (this.mContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("LogEvent", makeNativeMap);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8928ooOOO0O
    public void sendSession(int i, long j) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("__EVENT_TYPE__", C3416b.f8468at);
        createMap.putInt(C8912ooOO0o0.OoooO00, i);
        createMap.putString("session_time", j + "");
        C8654oo0Oo00.OooO00o().OooO0O0(createMap);
    }

    @ReactMethod
    public void setPageInfo(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        if (readableMap != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            String str = "";
            String string = readableMap.hasKey("pageUrl") ? readableMap.getString("pageUrl") : str;
            if (readableMap.hasKey("pageParams")) {
                hashMap.putAll(readableMap.getMap("pageParams").toHashMap());
            }
            if (readableMap.hasKey("fromUrl")) {
                str = readableMap.getString("fromUrl");
            }
            if (readableMap.hasKey("fromParams")) {
                hashMap2.putAll(readableMap.getMap("fromParams").toHashMap());
            }
            LogCollectorManager.sharedInstance().getLogParamsManager().OooO0oO(string);
            LogCollectorManager.sharedInstance().getLogParamsManager().OooO0O0(C8938ooOOOO00.OooO00o(hashMap));
            LogCollectorManager.sharedInstance().getLogParamsManager().OooO0O0(str);
            LogCollectorManager.sharedInstance().getLogParamsManager().OooO00o(C8938ooOOOO00.OooO00o(hashMap2));
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        promise.resolve(createMap);
    }
}
