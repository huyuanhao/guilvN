package com.qiyukf.basesdk.p120b.p132b.p135c;

import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1771d;

/* renamed from: com.qiyukf.basesdk.b.b.c.a */
public class C1791a implements AbstractC1794d {

    /* renamed from: a */
    public AbstractC1771d f3304a;

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34031a(AbstractC1771d dVar) {
        this.f3304a = dVar;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: a */
    public void mo34039a(Object obj) {
        AbstractC1794d d = this.f3304a.mo34004d();
        if (d != null) {
            try {
                d.mo34039a(obj);
            } catch (Throwable th) {
                d.mo34033a(th);
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34033a(Throwable th) {
        if (this.f3304a.mo34001a() != null && this.f3304a.mo34001a().mo34007g() != null) {
            this.f3304a.mo34001a().mo34007g().mo34033a(th);
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: h */
    public void mo34040h() {
        AbstractC1794d d = this.f3304a.mo34004d();
        if (d != null) {
            try {
                d.mo34040h();
            } catch (Throwable th) {
                d.mo34033a(th);
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: i */
    public void mo34041i() {
        AbstractC1794d d = this.f3304a.mo34004d();
        if (d != null) {
            try {
                d.mo34041i();
            } catch (Throwable th) {
                d.mo34033a(th);
            }
        }
    }
}
