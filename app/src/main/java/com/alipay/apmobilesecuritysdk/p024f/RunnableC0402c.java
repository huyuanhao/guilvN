package com.alipay.apmobilesecuritysdk.p024f;

import android.os.Process;

/* renamed from: com.alipay.apmobilesecuritysdk.f.c */
public final class RunnableC0402c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0401b f894a;

    public RunnableC0402c(C0401b bVar) {
        this.f894a = bVar;
    }

    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!C0401b.m827a(this.f894a).isEmpty()) {
                Runnable runnable = (Runnable) C0401b.m827a(this.f894a).get(0);
                C0401b.m827a(this.f894a).remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            C0401b.m828b(this.f894a);
            throw th;
        }
        C0401b.m828b(this.f894a);
    }
}
