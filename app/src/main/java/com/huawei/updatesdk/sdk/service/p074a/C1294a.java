package com.huawei.updatesdk.sdk.service.p074a;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: com.huawei.updatesdk.sdk.service.a.a */
public class C1294a {

    /* renamed from: b */
    public static C1294a f1457b;

    /* renamed from: d */
    public static final Object f1458d = new Object();

    /* renamed from: a */
    public Context f1459a;

    /* renamed from: c */
    public ConnectivityManager f1460c = null;

    public C1294a(Context context) {
        this.f1459a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C1294a m1650a() {
        C1294a aVar;
        synchronized (f1458d) {
            aVar = f1457b;
        }
        return aVar;
    }

    /* renamed from: a */
    public static void m1651a(Context context) {
        synchronized (f1458d) {
            if (f1457b == null) {
                f1457b = new C1294a(context);
            }
        }
    }

    /* renamed from: b */
    public Context mo15900b() {
        return this.f1459a;
    }

    /* renamed from: c */
    public ConnectivityManager mo15901c() {
        if (this.f1460c == null) {
            this.f1460c = (ConnectivityManager) this.f1459a.getSystemService("connectivity");
        }
        return this.f1460c;
    }
}
