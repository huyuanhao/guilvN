package com.tencent.bugly.crashreport.crash;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.bugly.crashreport.biz.C3265b;
import com.tencent.bugly.crashreport.common.info.C3269a;
import com.tencent.bugly.crashreport.common.info.C3270b;
import com.tencent.bugly.crashreport.common.strategy.C3272a;
import com.tencent.bugly.proguard.C3314ak;
import com.tencent.bugly.proguard.C3321an;
import com.tencent.bugly.proguard.C3325ap;

public class BuglyBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: d */
    public static BuglyBroadcastReceiver f7743d;

    /* renamed from: a */
    public IntentFilter f7744a = new IntentFilter();

    /* renamed from: b */
    public Context f7745b;

    /* renamed from: c */
    public String f7746c;

    /* renamed from: e */
    public boolean f7747e = true;

    public static synchronized BuglyBroadcastReceiver getInstance() {
        BuglyBroadcastReceiver buglyBroadcastReceiver;
        synchronized (BuglyBroadcastReceiver.class) {
            if (f7743d == null) {
                f7743d = new BuglyBroadcastReceiver();
            }
            buglyBroadcastReceiver = f7743d;
        }
        return buglyBroadcastReceiver;
    }

    public synchronized void addFilter(String str) {
        if (!this.f7744a.hasAction(str)) {
            this.f7744a.addAction(str);
        }
        C3321an.m8355c("add action %s", str);
    }

    public final void onReceive(Context context, Intent intent) {
        try {
            mo38197a(context, intent);
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    public synchronized void register(Context context) {
        this.f7745b = context;
        C3325ap.m8403a(new Runnable() {
            /* class com.tencent.bugly.crashreport.crash.BuglyBroadcastReceiver.RunnableC32741 */

            public void run() {
                try {
                    C3321an.m8348a(BuglyBroadcastReceiver.f7743d.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                    synchronized (this) {
                        BuglyBroadcastReceiver.this.f7745b.registerReceiver(BuglyBroadcastReceiver.f7743d, BuglyBroadcastReceiver.this.f7744a);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        });
    }

    public synchronized void unregister(Context context) {
        try {
            C3321an.m8348a(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f7745b = context;
        } catch (Throwable th) {
            if (!C3321an.m8350a(th)) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo38197a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f7747e) {
                    this.f7747e = false;
                    return true;
                }
                String f = C3270b.m8040f(this.f7745b);
                C3321an.m8355c("is Connect BC " + f, new Object[0]);
                C3321an.m8349a("network %s changed to %s", "" + this.f7746c, "" + f);
                if (f == null) {
                    this.f7746c = null;
                    return true;
                }
                String str = this.f7746c;
                this.f7746c = f;
                long currentTimeMillis = System.currentTimeMillis();
                C3272a a = C3272a.m8069a();
                C3314ak a2 = C3314ak.m8297a();
                C3269a a3 = C3269a.m7965a(context);
                if (a == null || a2 == null || a3 == null) {
                    C3321an.m8356d("not inited BC not work", new Object[0]);
                    return true;
                }
                if (!f.equals(str)) {
                    if (currentTimeMillis - a2.mo38372a(C3287c.f7842a) > 30000) {
                        C3321an.m8349a("try to upload crash on network changed.", new Object[0]);
                        C3287c a4 = C3287c.m8145a();
                        if (a4 != null) {
                            a4.mo38253a(0);
                        }
                    }
                    if (currentTimeMillis - a2.mo38372a(1001) > 30000) {
                        C3321an.m8349a("try to upload userinfo on network changed.", new Object[0]);
                        C3265b.f7599b.mo38104b();
                    }
                }
                return true;
            }
        }
        return false;
    }
}
