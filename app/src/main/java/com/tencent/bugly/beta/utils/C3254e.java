package com.tencent.bugly.beta.utils;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.tencent.bugly.beta.utils.e */
public class C3254e {

    /* renamed from: a */
    public static Handler f7561a;

    /* renamed from: a */
    public static Handler m7892a() {
        if (f7561a == null && Looper.getMainLooper() != null) {
            f7561a = new Handler(Looper.getMainLooper());
        }
        return f7561a;
    }

    /* renamed from: b */
    public static void m7895b(Runnable runnable) {
        if (m7892a() != null) {
            f7561a.removeCallbacks(runnable);
        }
    }

    /* renamed from: a */
    public static void m7893a(Runnable runnable) {
        if (m7892a() != null) {
            f7561a.post(runnable);
        }
    }

    /* renamed from: a */
    public static void m7894a(Runnable runnable, long j) {
        if (m7892a() != null) {
            f7561a.postDelayed(runnable, j);
        }
    }
}
