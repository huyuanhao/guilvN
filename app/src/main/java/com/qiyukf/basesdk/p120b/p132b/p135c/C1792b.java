package com.qiyukf.basesdk.p120b.p132b.p135c;

import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1771d;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1767c;
import java.net.SocketAddress;

/* renamed from: com.qiyukf.basesdk.b.b.c.b */
public class C1792b implements AbstractC1798g {

    /* renamed from: a */
    public AbstractC1771d f3305a;

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final void mo34030a(C1767c cVar) {
        AbstractC1798g e = this.f3305a.mo34005e();
        if (e != null) {
            try {
                e.mo34030a(cVar);
            } catch (Throwable th) {
                this.f3305a.mo34007g().mo34033a(th);
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34031a(AbstractC1771d dVar) {
        this.f3305a = dVar;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public void mo34032a(Object obj, C1767c cVar) {
        AbstractC1798g e = this.f3305a.mo34005e();
        if (e != null) {
            try {
                e.mo34032a(obj, cVar);
            } catch (Throwable th) {
                this.f3305a.mo34007g().mo34033a(th);
            }
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public void mo34033a(Throwable th) {
        if (this.f3305a.mo34001a() != null && this.f3305a.mo34001a().mo34007g() != null) {
            this.f3305a.mo34001a().mo34007g().mo34033a(th);
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final boolean mo34034a(SocketAddress socketAddress) {
        AbstractC1798g e = this.f3305a.mo34005e();
        if (e == null) {
            return false;
        }
        try {
            return e.mo34034a(socketAddress);
        } catch (Throwable th) {
            e.mo34033a(th);
            return false;
        }
    }
}
