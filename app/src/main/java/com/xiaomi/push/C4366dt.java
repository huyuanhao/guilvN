package com.xiaomi.push;

import android.content.Context;
import android.content.IntentFilter;
import com.umeng.message.common.C3777a;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.mpcd.receivers.BroadcastActionsReceiver;

/* renamed from: com.xiaomi.push.dt */
public class C4366dt {
    /* renamed from: a */
    public static IntentFilter m12123a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_DATA_CLEARED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme(C3777a.f10045u);
        return intentFilter;
    }

    /* renamed from: a */
    public static AbstractC4371dy m12124a() {
        return new C4367du();
    }

    /* renamed from: a */
    public static void m12125a(Context context) {
        C4372dz.m12135a(context).m12139a();
        try {
            context.registerReceiver(new BroadcastActionsReceiver(m12124a()), m12123a());
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
        }
    }
}
