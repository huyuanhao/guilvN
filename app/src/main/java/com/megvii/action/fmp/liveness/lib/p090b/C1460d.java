package com.megvii.action.fmp.liveness.lib.p090b;

import com.megvii.action.fmp.liveness.lib.p089a.C1455c;

/* renamed from: com.megvii.action.fmp.liveness.lib.b.d */
public final class C1460d {

    /* renamed from: b */
    public static C1460d f1914b;

    /* renamed from: a */
    public C1455c f1915a = new C1455c();

    /* renamed from: a */
    public static synchronized C1460d m2161a() {
        C1460d dVar;
        synchronized (C1460d.class) {
            if (f1914b == null) {
                f1914b = new C1460d();
            }
            dVar = f1914b;
        }
        return dVar;
    }
}
