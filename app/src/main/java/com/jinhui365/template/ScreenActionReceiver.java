package com.jinhui365.template;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;

public class ScreenActionReceiver extends BroadcastReceiver {
    public static final String OooO00o = "ScreenActionReceiver";

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f14979OooO00o = false;

    public void OooO00o(Context context) {
        if (!this.f14979OooO00o) {
            this.f14979OooO00o = true;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            context.registerReceiver(this, intentFilter);
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "屏幕监听注册");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, OooO00o, false, (Map<String, String>) hashMap);
        }
    }

    public void OooO0O0(Context context) {
        if (this.f14979OooO00o) {
            this.f14979OooO00o = false;
            context.unregisterReceiver(this);
            HashMap hashMap = new HashMap();
            hashMap.put("desc", "屏幕监听移除");
            LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, OooO00o, false, (Map<String, String>) hashMap);
        }
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        HashMap hashMap = new HashMap();
        hashMap.put("action", action);
        if (action.equals("android.intent.action.SCREEN_ON")) {
            hashMap.put("desc", "屏幕解锁");
        } else if (action.equals("android.intent.action.SCREEN_OFF")) {
            hashMap.put("desc", "屏幕加锁");
        } else {
            hashMap.put("desc", "其他");
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, OooO00o, false, (Map<String, String>) hashMap);
    }
}
