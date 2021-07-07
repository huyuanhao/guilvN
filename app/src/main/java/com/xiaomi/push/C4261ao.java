package com.xiaomi.push;

import android.os.Looper;

/* renamed from: com.xiaomi.push.ao */
public class C4261ao {
    /* renamed from: a */
    public static void m11670a() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new RuntimeException("can't do this on ui thread");
        }
    }
}
