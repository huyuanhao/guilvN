package com.alipay.apmobilesecuritysdk.p024f;

import java.util.LinkedList;

/* renamed from: com.alipay.apmobilesecuritysdk.f.b */
public final class C0401b {

    /* renamed from: a */
    public static C0401b f891a = new C0401b();

    /* renamed from: b */
    public Thread f892b = null;

    /* renamed from: c */
    public LinkedList<Runnable> f893c = new LinkedList<>();

    /* renamed from: a */
    public static C0401b m826a() {
        return f891a;
    }

    /* renamed from: a */
    public final synchronized void mo4198a(Runnable runnable) {
        this.f893c.add(runnable);
        if (this.f892b == null) {
            Thread thread = new Thread(new RunnableC0402c(this));
            this.f892b = thread;
            thread.start();
        }
    }
}
