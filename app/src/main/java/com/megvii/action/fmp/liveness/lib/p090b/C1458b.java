package com.megvii.action.fmp.liveness.lib.p090b;

import com.megvii.action.fmp.liveness.lib.p089a.C1454b;

/* renamed from: com.megvii.action.fmp.liveness.lib.b.b */
public final class C1458b {

    /* renamed from: a */
    public static C1458b f1912a;

    /* renamed from: b */
    public C1454b f1913b = new C1454b();

    /* renamed from: a */
    public static synchronized C1458b m2159a() {
        C1458b bVar;
        synchronized (C1458b.class) {
            if (f1912a == null) {
                f1912a = new C1458b();
            }
            bVar = f1912a;
        }
        return bVar;
    }
}
