package com.megvii.action.fmp.liveness.lib.p090b;

import com.megvii.action.fmp.liveness.lib.p089a.C1453a;

/* renamed from: com.megvii.action.fmp.liveness.lib.b.a */
public final class C1457a {

    /* renamed from: b */
    public static C1457a f1910b;

    /* renamed from: a */
    public C1453a f1911a = new C1453a();

    /* renamed from: a */
    public static synchronized C1457a m2158a() {
        C1457a aVar;
        synchronized (C1457a.class) {
            if (f1910b == null) {
                f1910b = new C1457a();
            }
            aVar = f1910b;
        }
        return aVar;
    }
}
