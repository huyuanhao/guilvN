package com.vivo.push;

import com.vivo.push.C4121p;
import com.vivo.push.util.C4146p;

/* renamed from: com.vivo.push.q */
public final class C4123q implements IPushActionListener {

    /* renamed from: a */
    public final /* synthetic */ C4121p.C4122a f11062a;

    /* renamed from: b */
    public final /* synthetic */ C4121p f11063b;

    public C4123q(C4121p pVar, C4121p.C4122a aVar) {
        this.f11063b = pVar;
        this.f11062a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i) {
        if (i == 0) {
            Object[] b = this.f11062a.mo41139b();
            if (b == null || b.length == 0) {
                C4146p.m11204a("PushClientManager", "bind app result is null");
            } else {
                this.f11063b.mo41097a((String) this.f11062a.mo41139b()[0]);
            }
        } else {
            this.f11063b.f11048l = null;
            this.f11063b.f11047k.mo41186c("APP_TOKEN");
        }
    }
}
