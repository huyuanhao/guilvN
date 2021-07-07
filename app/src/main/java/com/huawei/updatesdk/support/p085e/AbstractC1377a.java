package com.huawei.updatesdk.support.p085e;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;

/* renamed from: com.huawei.updatesdk.support.e.a */
public abstract class AbstractC1377a {
    /* renamed from: a */
    public static void m2067a(Context context, BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null && context != null) {
            try {
                context.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException e) {
                C1278a.m1584d("ActivityUtil", "unregisterReceiver error:" + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m2068a(Context context, IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        if (intentFilter != null && broadcastReceiver != null && !m2069a(context)) {
            try {
                context.registerReceiver(broadcastReceiver, intentFilter);
            } catch (IllegalArgumentException e) {
                C1278a.m1584d("ActivityUtil", "registerReceiver error:" + e.toString());
            }
        }
    }

    /* renamed from: a */
    public static boolean m2069a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (!activity.isFinishing() && (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed())) {
            return false;
        }
        C1278a.m1584d("ActivityUtil", "activity has bean finished, cannot instance:" + activity);
        return true;
    }
}
