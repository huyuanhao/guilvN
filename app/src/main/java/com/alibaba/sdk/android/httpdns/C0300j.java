package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.p016d.C0276b;
import java.lang.Thread;

/* renamed from: com.alibaba.sdk.android.httpdns.j */
public class C0300j implements Thread.UncaughtExceptionHandler {
    /* renamed from: b */
    private void m537b(Throwable th) {
        C0276b a = C0276b.m496a();
        if (a != null) {
            a.mo3997k(th.getMessage());
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            String str = "Catch an uncaught exception, " + thread.getName() + ", error message: " + th.getMessage();
            m537b(th);
            th.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
