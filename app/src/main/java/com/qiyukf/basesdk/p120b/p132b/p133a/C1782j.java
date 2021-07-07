package com.qiyukf.basesdk.p120b.p132b.p133a;

import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g;
import com.qiyukf.basesdk.p120b.p132b.p136d.C1801a;
import java.net.SocketAddress;
import java.nio.ByteBuffer;

/* renamed from: com.qiyukf.basesdk.b.b.a.j */
public final class C1782j extends AbstractC1771d implements AbstractC1798g {
    public C1782j(C1774g gVar) {
        super(gVar, false, true);
    }

    /* renamed from: h */
    private C1801a m3306h() {
        return this.f3267a.mo34010a().mo33984b();
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final void mo34030a(C1767c cVar) {
        this.f3267a.mo34010a().mo33989g();
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34031a(AbstractC1771d dVar) {
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final void mo34032a(Object obj, C1767c cVar) {
        if (obj instanceof ByteBuffer) {
            m3306h().mo34063a((ByteBuffer) obj, cVar);
        } else {
            cVar.mo33992a(new UnsupportedOperationException("Only ByteBuffer is supported"));
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34033a(Throwable th) {
        if (this.f3269c != null && this.f3269c.mo34007g() != null) {
            this.f3269c.mo34007g().mo34033a(th);
        }
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final boolean mo34034a(SocketAddress socketAddress) {
        return m3306h().mo34065a(socketAddress);
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1771d
    /* renamed from: g */
    public final AbstractC1793c mo34007g() {
        return this;
    }
}
