package com.jinhui365.customer;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.jinhui365.customer.view.QiYuActivity;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.p118pd.sdk.C8620oo0O0oo0;
import com.p118pd.sdk.C8912ooOO0o0;
import com.qiyukf.unicorn.api.YSFUserInfo;
import com.umeng.socialize.handler.UMWXHandler;
import java.util.Map;
import javax.annotation.Nullable;

public class CustomerServiceModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static ReactApplicationContext context;

    public CustomerServiceModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        context = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    public static void sendEventMap(String str, WritableMap writableMap) {
        if (context.hasActiveCatalystInstance()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) context.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @ReactMethod
    public void closeServiceWindow(Promise promise) {
        QiYuActivity.OooO00o();
        promise.resolve(null);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public Map<String, Object> getConstants() {
        return super.getConstants();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CustomerServiceModule";
    }

    @ReactMethod
    public void getUnreadCount(Promise promise) {
        promise.resolve(Integer.valueOf(C8620oo0O0oo0.OooO00o().m20247OooO00o()));
    }

    @ReactMethod
    public void init(String str, ReadableMap readableMap, Promise promise) {
        ReactApplicationContext reactApplicationContext = context;
        if (reactApplicationContext != null && reactApplicationContext.getCurrentActivity() != null && context.getCurrentActivity().getApplication() != null && context.getCurrentActivity().getApplication().getApplicationContext() != null) {
            C8620oo0O0oo0.OooO00o().OooO00o(str, context.getCurrentActivity().getApplication());
        }
    }

    @ReactMethod
    public void isInit(ReadableMap readableMap, Promise promise) {
        promise.resolve(Boolean.valueOf(C8620oo0O0oo0.OooO00o().m20249OooO00o()));
    }

    @ReactMethod
    public void logout(Promise promise) {
        C8620oo0O0oo0.OooO00o().m20248OooO00o();
        promise.resolve(true);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        C8620oo0O0oo0.OooO00o().OooO00o(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @ReactMethod
    public void openServiceWindow(ReadableMap readableMap, Promise promise) {
        if (C8620oo0O0oo0.OooO00o().m20249OooO00o()) {
            String str = "客服";
            String str2 = "";
            if (readableMap != null) {
                if (readableMap.hasKey("title")) {
                    str = readableMap.getString("title");
                }
                if (readableMap.hasKey(C7486o0OoO0oO.f20312OooO0Oo)) {
                    readableMap.getInt(C7486o0OoO0oO.f20312OooO0Oo);
                }
                if (readableMap.hasKey("question")) {
                    str2 = readableMap.getString("question");
                }
            }
            C8620oo0O0oo0.OooO00o().OooO00o(context.getCurrentActivity(), str, str2);
        }
    }

    @ReactMethod
    public void sendQuestion(ReadableMap readableMap, Promise promise) {
        if (readableMap != null && readableMap.hasKey("question")) {
            readableMap.getString("question");
        }
    }

    @ReactMethod
    public void setUserInfo(ReadableMap readableMap, Promise promise) {
        boolean z;
        if (readableMap != null) {
            String str = "";
            String string = readableMap.hasKey("userId") ? readableMap.getString("userId") : str;
            String string2 = readableMap.hasKey(UMWXHandler.NICKNAME) ? readableMap.getString(UMWXHandler.NICKNAME) : str;
            String string3 = readableMap.hasKey(C8912ooOO0o0.Oooo0O0) ? readableMap.getString(C8912ooOO0o0.Oooo0O0) : str;
            if (readableMap.hasKey("fundAccount")) {
                str = readableMap.getString("fundAccount");
            }
            String str2 = "[{'key':'real_name','value':" + string2 + "},{'key':'mobile_phone','value':" + string3 + "},{'key':'fundAccount','label':'客户编号','value':" + str + "}]";
            YSFUserInfo ySFUserInfo = new YSFUserInfo();
            ySFUserInfo.userId = string;
            ySFUserInfo.data = str2;
            z = C8620oo0O0oo0.OooO00o().OooO00o(ySFUserInfo);
        } else {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }
}
