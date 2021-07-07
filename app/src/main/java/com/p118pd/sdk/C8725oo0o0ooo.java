package com.p118pd.sdk;

import android.content.Context;
import com.jinhui365.router.task.ActivityTask;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0o0ooo  reason: case insensitive filesystem */
public class C8725oo0o0ooo {
    public static C8725oo0o0ooo OooO00o = null;
    public static final String OooO0O0 = "RouterUtil";

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21898OooO00o;

    public static C8725oo0o0ooo OooO00o() {
        if (OooO00o == null) {
            synchronized (C8725oo0o0ooo.class) {
                OooO00o = new C8725oo0o0ooo();
            }
        }
        return OooO00o;
    }

    public void OooO00o(Context context) {
        this.f21898OooO00o = C8640oo0OOOoo.OooO00o(context, "config/router.json");
        try {
            C8703oo0o0O00.OooO00o().OooO00o(this.f21898OooO00o, (AbstractC8695oo0o00O0) null, new ActivityTask());
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "初始化路由成功");
            LogCollectorManager.sharedInstance().recordDebug(LogCategory.APPLICATION, LogApplicationType.STARTUP_STEP.getValue(), hashMap);
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap2 = new HashMap();
            hashMap2.put("desc", "初始化路由失败");
            hashMap2.put("error", "RouteManager initialize " + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.APPLICATION, LogApplicationType.EXCEPTION.getValue(), hashMap2);
        }
    }
}
