package com.p118pd.sdk;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.react.ReactInstanceManager;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oo0Oo0OO  reason: case insensitive filesystem */
public class C8659oo0Oo0OO {
    public static final String OooO00o = "activity_manager";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<String, ReactInstanceManager> f21818OooO00o = new HashMap();
    public static final String OooO0O0 = "activity_root_view";

    public static void OooO00o(Activity activity, String str) {
        if (!f21818OooO00o.containsKey(OooO00o)) {
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "XNReactNativePreLoader;preLoad start");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
            if (!C8655oo0Oo000.m20280OooO00o()) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("desc", "XNReactNativePreLoader;preLoad;bundle文件不存在");
                LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap2);
                return;
            }
            if (C8654oo0Oo00.OooO00o().f21798OooO00o != null) {
                AbstractC8656oo0Oo00O oo0oo00o = C8654oo0Oo00.OooO00o().f21798OooO00o;
                AbstractC8656oo0Oo00O.OooO0O0.clear();
            }
            Bundle bundle = new Bundle();
            bundle.putString(C8651oo0OOooo.OooOO0, "1");
            C9080ooOooO0O oooooo0o = new C9080ooOooO0O(activity);
            ReactInstanceManager createReactInstanceManager = C8654oo0Oo00.OooO00o().f21798OooO00o.createReactInstanceManager();
            oooooo0o.startReactApplication(createReactInstanceManager, str, bundle);
            oooooo0o.unmountReactApplication();
            f21818OooO00o.put(OooO00o, createReactInstanceManager);
            HashMap hashMap3 = new HashMap();
            hashMap3.put("desc", "XNReactNativePreLoader;preLoad;预加载完成");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap3);
        }
    }

    public static ReactInstanceManager OooO00o() {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "XNReactNativePreLoader;获取预加载实例");
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        return f21818OooO00o.get(OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20291OooO00o() {
        HashMap hashMap = new HashMap();
        hashMap.put("desc", "XNReactNativePreLoader;清除预加载的实例");
        LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        f21818OooO00o.remove(OooO00o);
    }
}
