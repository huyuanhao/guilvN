package com.p118pd.sdk;

import android.content.Context;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.jinhui365.template.TemplateApplication;
import com.jinhui365.util.util.gson.GsonUtil;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.L11iill1 */
public class L11iill1 extends ReactContextBaseJavaModule {
    public String MODULE_NAME = "TemplateModule";
    public String apConfig_key = "apConfig";
    public String buildNumber_key = "buildNumber";
    public String channel_key = "channel";
    public String desc_key = "desc";
    public String environment_key = "environment";
    public String httpConfig_key = "httpConfig";
    public String httpUrls_key = "httpUrls";
    public String logFile_key = "logFile";
    public String logUrl_key = "logUrl";
    public String marketChannel_key = "marketChannel";
    public String mobileUrl_key = "mobileUrl";
    public String options_key = "options";
    public ReactApplicationContext reactContext;
    public String rnChannel_key = "rnChannel";
    public String rnDebugMode_key = "debugMode";
    public String userInfo_key = "userInfo";
    public String webUrl_key = "webUrl";

    public L11iill1(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void checkAppVersion(ReadableMap readableMap, Promise promise) {
        promise.resolve(TemplateApplication.OooO00o().OooO00o((Map<String, Object>) readableMap.toHashMap()));
    }

    @ReactMethod
    public void exitApp(ReadableMap readableMap, Promise promise) {
        TemplateApplication.OooO00o().m15115OooO00o();
    }

    @ReactMethod
    public void getAppConfig(ReadableMap readableMap, Promise promise) {
        Map<String, Object> OooO0OO = C8706oo0o0OO0.OooO00o().OooO0OO();
        HashMap hashMap = new HashMap();
        hashMap.put(this.desc_key, "RN获取APP后台配置信息");
        hashMap.put(this.apConfig_key, GsonUtil.toJson(OooO0OO));
        LogCollectorManager.sharedInstance().recordInfo(this.MODULE_NAME, hashMap);
        promise.resolve(C8724oo0o0ooO.m20344OooO00o(GsonUtil.toJson(OooO0OO)));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(this.channel_key, C8706oo0o0OO0.OooO00o().OooO0oo().get(this.rnChannel_key));
        hashMap.put(this.environment_key, C8706oo0o0OO0.OooO00o().OooO00o((Context) this.reactContext));
        hashMap.put(this.httpConfig_key, C8706oo0o0OO0.OooO00o().OooO0o0());
        hashMap.put(this.mobileUrl_key, C8706oo0o0OO0.OooO00o().m20327OooO00o().get(this.mobileUrl_key));
        hashMap.put(this.logFile_key, C8706oo0o0OO0.OooO00o().OooO0o().get(this.logFile_key));
        hashMap.put(this.logUrl_key, C8706oo0o0OO0.OooO00o().OooO0o().get(this.logUrl_key));
        hashMap.put(this.buildNumber_key, C8706oo0o0OO0.OooO00o().OooO0O0(this.reactContext));
        hashMap.put(this.marketChannel_key, TemplateApplication.o0ooOOo);
        hashMap.put(this.options_key, TemplateApplication.OooO00o().OooO0O0());
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.MODULE_NAME;
    }

    @ReactMethod
    public void syncUserInfo(String str, ReadableMap readableMap, Promise promise) {
        HashMap hashMap = new HashMap();
        hashMap.put(this.desc_key, "RN同步原生用户信息");
        hashMap.put(this.userInfo_key, str);
        LogCollectorManager.sharedInstance().recordInfo(this.MODULE_NAME, hashMap);
        if (!C8741oo0oOo0.OooO0Oo(str) || "{}".equals(str)) {
            C8717oo0o0o0O.OooO00o().m20341OooO00o();
            hashMap.put(this.desc_key, "RN同步原生用户信息");
        } else {
            Map<String, String> jsonToMap = GsonUtil.jsonToMap(str, String.class, String.class);
            C8717oo0o0o0O.OooO00o().m20342OooO00o(str);
            C8717oo0o0o0O.OooO00o().f21894OooO00o = jsonToMap;
        }
        C8717oo0o0o0O.OooO00o().OooO0OO();
    }

    @ReactMethod
    public void updateAppVersion(ReadableMap readableMap, Promise promise) {
        TemplateApplication.OooO00o().m15116OooO00o((Map<String, Object>) readableMap.toHashMap());
    }

    @ReactMethod
    public void updateDebugSettings(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        HashMap hashMap = new HashMap();
        String str = "";
        int i = -1;
        if (readableMap != null) {
            if (readableMap.hasKey(this.httpUrls_key)) {
                hashMap.putAll(readableMap.getMap(this.httpUrls_key).toHashMap());
            }
            if (readableMap.hasKey(this.webUrl_key)) {
                str = readableMap.getString(this.webUrl_key);
            }
            if (readableMap.hasKey(this.rnDebugMode_key)) {
                i = readableMap.getInt(this.rnDebugMode_key);
            }
        }
        C8706oo0o0OO0.OooO00o().OooO00o(hashMap, str, i);
        promise.resolve(true);
    }
}
