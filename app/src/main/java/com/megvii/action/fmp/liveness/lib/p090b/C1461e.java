package com.megvii.action.fmp.liveness.lib.p090b;

import com.megvii.action.fmp.liveness.lib.p089a.C1456d;

/* renamed from: com.megvii.action.fmp.liveness.lib.b.e */
public final class C1461e {

    /* renamed from: b */
    public static C1461e f1916b;

    /* renamed from: a */
    public C1456d f1917a = new C1456d();

    /* renamed from: a */
    public static synchronized C1461e m2162a() {
        C1461e eVar;
        synchronized (C1461e.class) {
            if (f1916b == null) {
                f1916b = new C1461e();
            }
            eVar = f1916b;
        }
        return eVar;
    }

    /* renamed from: b */
    public final void mo16889b() {
        C1456d dVar = this.f1917a;
        long j = dVar.f1909b;
        if (j != 0) {
            dVar.f1908a.nativeStartFlashLiveDetect(j);
        }
    }

    /* renamed from: c */
    public final void mo16890c() {
        C1456d dVar = this.f1917a;
        long j = dVar.f1909b;
        if (j != 0) {
            dVar.f1908a.nativeStopFlashLiveDetect(j);
        }
    }
}
