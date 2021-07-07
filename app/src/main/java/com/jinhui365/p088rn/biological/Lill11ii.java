package com.jinhui365.p088rn.biological;

import android.app.Activity;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.jinhui365.util.util.gson.GsonUtil;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.AbstractC8666oo0OoO0;
import com.p118pd.sdk.C7047o00O00Oo;
import com.p118pd.sdk.C8660oo0Oo0Oo;
import com.p118pd.sdk.C8664oo0Oo0oo;
import com.p118pd.sdk.C8667oo0OoO00;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

/* renamed from: com.jinhui365.rn.biological.Lill11ii */
public class Lill11ii extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = "BiologicalUnlock";
    public static final String RNType = "__EVENT_TYPE__";
    public static final String UNLOCK_MODULE_NAME = "BiologicalModule";
    public String biologicalEvent_name = "BiologicalEvent";
    public ReactApplicationContext reactContext;

    public Lill11ii(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void authenticateBiological(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "authenticateBiological");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8664oo0Oo0oo.OooO00o(readableMap)));
        LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, LOG_TYPE, hashMap);
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "BiologicalUnlock:authenticateBiological,activity null");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        String OooO00o2 = C8667oo0OoO00.m20292OooO00o(currentActivity);
        if (!"IS_SUPPORTED".equals(OooO00o2)) {
            createMap.putString("code", OooO00o2);
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "BiologicalUnlock:authenticateBiological", C8664oo0Oo0oo.OooO00o(createMap));
            promise.resolve(createMap);
            return;
        }
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap != null) {
            hashMap2 = readableMap.toHashMap();
        }
        C8660oo0Oo0Oo.OooO00o().OooO00o(currentActivity, hashMap2, new OooO00o());
        createMap.putInt("code", 0);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void cancelAuthenticateBiological(ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "cancelAuthenticateBiological");
        hashMap.put("communication_type", "rn-call-native");
        hashMap.put("in_params", GsonUtil.toJson(C8664oo0Oo0oo.OooO00o(readableMap)));
        LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, LOG_TYPE, hashMap);
        HashMap<String, Object> hashMap2 = new HashMap<>();
        if (readableMap != null) {
            hashMap2 = readableMap.toHashMap();
        }
        C8660oo0Oo0Oo.OooO00o().OooO00o(hashMap2);
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("code", 0);
        promise.resolve(createMap);
    }

    @ReactMethod
    public void getInfo(ReadableMap readableMap, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "BiologicalUnlock:authenticateBiological,activity null");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        String OooO00o2 = C8667oo0OoO00.m20292OooO00o(currentActivity);
        if ("IS_SUPPORTED".equals(OooO00o2)) {
            createMap.putString("code", "SUCCESS");
            createMap.putString("biometryType", "TouchID");
        } else {
            createMap.putString("biometryType", "TouchID");
            createMap.putString("code", OooO00o2);
        }
        promise.resolve(createMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return UNLOCK_MODULE_NAME;
    }

    public void sendBiologicalEvent(WritableMap writableMap) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "sendBiologicalEvent");
        hashMap.put("communication_type", "native-call-rn");
        hashMap.put("out_params", GsonUtil.toJson(C8664oo0Oo0oo.OooO00o(writableMap)));
        String string = writableMap.hasKey("__EVENT_TYPE__") ? writableMap.getString("__EVENT_TYPE__") : "";
        hashMap.put("desc", this.biologicalEvent_name + Constants.COLON_SEPARATOR + string);
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        if (this.reactContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.biologicalEvent_name, writableMap);
        }
    }

    /* renamed from: com.jinhui365.rn.biological.Lill11ii$OooO00o */
    public class OooO00o implements AbstractC8666oo0OoO0 {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC8666oo0OoO0
        public void OooO00o(String str, String str2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("code", str);
            createMap.putString("message", str2);
            Lill11ii.this.sendBiologicalEvent(createMap);
        }

        @Override // com.p118pd.sdk.AbstractC8666oo0OoO0
        public void OooO0O0(String str, String str2) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("code", str);
            createMap.putString("message", str2);
            Lill11ii.this.sendBiologicalEvent(createMap);
        }

        @Override // com.p118pd.sdk.AbstractC8666oo0OoO0
        public void OooO00o(C7047o00O00Oo.OooO0OO oooO0OO) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("code", "SUCCESS");
            Lill11ii.this.sendBiologicalEvent(createMap);
        }
    }
}
