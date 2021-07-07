package com.taobao.accs.p262d;

import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.d.a */
public class C3108a {

    /* renamed from: a */
    public static C3108a f6890a;

    /* renamed from: b */
    public ClassLoader f6891b = null;

    /* renamed from: c */
    public boolean f6892c = false;

    /* renamed from: a */
    public static synchronized C3108a m7327a() {
        C3108a aVar;
        synchronized (C3108a.class) {
            if (f6890a == null) {
                f6890a = new C3108a();
            }
            aVar = f6890a;
        }
        return aVar;
    }

    /* renamed from: b */
    public synchronized ClassLoader mo37554b() {
        if (this.f6891b == null) {
            ALog.m7597d("ACCSClassLoader", "getClassLoader", new Object[0]);
            this.f6891b = C3108a.class.getClassLoader();
        }
        return this.f6891b;
    }
}
