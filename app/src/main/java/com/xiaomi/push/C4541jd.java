package com.xiaomi.push;

import com.xiaomi.push.C4544jg;

/* renamed from: com.xiaomi.push.jd */
public class C4541jd {

    /* renamed from: a */
    public final AbstractC4549jk f12998a;

    /* renamed from: a */
    public final C4559jt f12999a;

    public C4541jd() {
        this(new C4544jg.C4545a());
    }

    public C4541jd(AbstractC4551jm jmVar) {
        C4559jt jtVar = new C4559jt();
        this.f12999a = jtVar;
        this.f12998a = jmVar.mo42592a(jtVar);
    }

    /* renamed from: a */
    public void mo42567a(AbstractC4532iz izVar, byte[] bArr) {
        try {
            this.f12999a.mo42599a(bArr);
            izVar.mo41828a(this.f12998a);
        } finally {
            this.f12998a.mo42594k();
        }
    }
}
