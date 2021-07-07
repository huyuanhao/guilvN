package com.p118pd.sdk;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.pd.sdk.LIiLLL1 */
public class LIiLLL1 extends ReactContextBaseJavaModule {
    public static final String LOG_TYPE = "Router";
    public final String MODULE_NAME = "RouterModule";
    public String key_from_params = "__from_params__";
    public String key_page_params = "__page_params__";
    public ReactApplicationContext mContext;

    public LIiLLL1(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mContext = reactApplicationContext;
    }

    @ReactMethod
    public void finishInstance() {
        AbstractC8681oo0OooO oo0oooo = (AbstractC8681oo0OooO) C8654oo0Oo00.OooO00o().OooO00o(AbstractC8681oo0OooO.class.getSimpleName());
        if (oo0oooo != null) {
            oo0oooo.OooO00o(getCurrentActivity());
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "finishInstance");
        hashMap.put("communication_type", "rn-call-native");
        try {
            Activity currentActivity = getCurrentActivity();
            hashMap.put("clazz", currentActivity.getLocalClassName());
            hashMap.put("desc", "关闭实例");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.CLOSE.getValue(), (Map<String, String>) null);
            currentActivity.finish();
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "关闭实例异常" + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, LOG_TYPE, hashMap2);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RouterModule";
    }

    @ReactMethod
    public void route(String str, ReadableMap readableMap, Promise promise) {
        AbstractC8682oo0OooOO oo0ooooo = (AbstractC8682oo0OooOO) C8654oo0Oo00.OooO00o().OooO00o(AbstractC8682oo0OooOO.class.getSimpleName());
        if (oo0ooooo != null) {
            oo0ooooo.OooO00o(str, readableMap, promise);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "route");
        hashMap.put("communication_type", "rn-call-native");
        HashMap<String, String> OooO00o = C8691oo0o0000.OooO00o(readableMap);
        OooO00o.put("route_path", str);
        hashMap.put("in_params", GsonUtil.toJson(OooO00o));
        try {
            Activity currentActivity = this.mContext.getCurrentActivity();
            HashMap<String, Object> hashMap2 = readableMap.toHashMap();
            if (hashMap2.containsKey(this.key_from_params)) {
                hashMap2.remove(this.key_from_params);
            }
            if (hashMap2.containsKey(this.key_page_params)) {
                hashMap2.remove(this.key_page_params);
            }
            if (currentActivity != null) {
                C8703oo0o0O00.OooO00o().OooO00o(str).OooO00o(hashMap2).OooO00o(BaseJavaModule.METHOD_TYPE_PROMISE, promise).OooO00o(currentActivity);
                hashMap.put("desc", "null != currentActivity");
            } else {
                hashMap.put("desc", "null == currentActivity");
            }
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.API, LOG_TYPE, hashMap);
        } catch (Exception e) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            LogCategory logCategory = LogCategory.API;
            sharedInstance.recordWarn(logCategory, "Router:路由调整报错" + e.getLocalizedMessage());
        }
    }

    public void sendRouterEvent(Bundle bundle) {
        if (bundle != null) {
            Set<String> keySet = bundle.keySet();
            WritableMap createMap = Arguments.createMap();
            for (String str : keySet) {
                if (str.equals(C8651oo0OOooo.OooO0OO)) {
                    createMap.putMap(C8651oo0OOooo.OooO0OO, C8691oo0o0000.OooO00o(bundle.getBundle(C8651oo0OOooo.OooO0OO)));
                } else if (!str.equals(C8713oo0o0o.f21884OooO00o)) {
                    createMap.putString(str, "" + bundle.get(str));
                }
            }
            if (this.mContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("RouterEvent", createMap);
            }
        }
    }
}
