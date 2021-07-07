package com.qiyukf.unicorn.p232k;

import android.os.Handler;
import android.os.Looper;
import com.qiyukf.basesdk.p138c.C1805a;

/* renamed from: com.qiyukf.unicorn.k.k */
public final class C2713k {

    /* renamed from: a */
    public static Handler f5621a;

    /* renamed from: a */
    public static synchronized Handler m6272a() {
        Handler handler;
        synchronized (C2713k.class) {
            if (f5621a == null) {
                f5621a = C1805a.m3404b();
            }
            handler = f5621a;
        }
        return handler;
    }

    /* renamed from: a */
    public static void m6273a(Runnable runnable) {
        m6274b(runnable);
    }

    /* renamed from: b */
    public static void m6274b(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            m6272a().post(runnable);
        }
    }
}
