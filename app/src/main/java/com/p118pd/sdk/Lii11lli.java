package com.p118pd.sdk;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.pd.sdk.Lii11lli */
public class Lii11lli extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = "NativeEventReminder";
    public final String MODULE_NAME = "RNEventModule";
    public ReactApplicationContext mContext;

    public Lii11lli(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNEventModule";
    }

    public void sendAppFABEvent(WritableMap writableMap) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "sendAppFABEvent");
        hashMap.put("communication_type", "native-call-rn");
        hashMap.put("in_params", GsonUtil.toJson(C8691oo0o0000.m20301OooO00o(writableMap)));
        String string = writableMap.hasKey("__EVENT_TYPE__") ? writableMap.getString("__EVENT_TYPE__") : "";
        hashMap.put("desc", "AppFABEvent:" + string);
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.API, LOG_TYPE, hashMap);
        WritableNativeMap makeNativeMap = Arguments.makeNativeMap(writableMap.toHashMap());
        if (this.mContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("AppFABEvent", makeNativeMap);
        }
    }

    public void sendEvent(String str, WritableMap writableMap) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "sendEvent");
        hashMap.put("communication_type", "native-call-rn");
        HashMap<String, String> OooO00o = C8691oo0o0000.m20301OooO00o(writableMap);
        OooO00o.put("eventName", str);
        String string = writableMap.hasKey("__EVENT_TYPE__") ? writableMap.getString("__EVENT_TYPE__") : "";
        hashMap.put("desc", str + Constants.COLON_SEPARATOR + string);
        hashMap.put("in_params", GsonUtil.toJson(OooO00o));
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.API, LOG_TYPE, hashMap);
        WritableNativeMap makeNativeMap = Arguments.makeNativeMap(writableMap.toHashMap());
        if (this.mContext.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, makeNativeMap);
        }
    }

    public void sendRNFABEvent(Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "sendRNFABEvent");
        hashMap.put("communication_type", "native-call-rn");
        HashMap hashMap2 = new HashMap();
        String str = "";
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            WritableMap createMap = Arguments.createMap();
            for (String str2 : keySet) {
                createMap.putString(str2, bundle.get(str2) + str);
                hashMap2.put(str2, bundle.get(str2) + str);
            }
            WritableNativeMap makeNativeMap = Arguments.makeNativeMap(createMap.toHashMap());
            if (this.mContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RNFABEvent", makeNativeMap);
            }
        }
        if (hashMap2.containsKey("__EVENT_TYPE__")) {
            str = (String) hashMap2.get("__EVENT_TYPE__");
        }
        hashMap.put("desc", "RNFABEvent:" + str);
        hashMap.put("in_params", GsonUtil.toJson(hashMap2));
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.API, LOG_TYPE, hashMap);
    }
}
