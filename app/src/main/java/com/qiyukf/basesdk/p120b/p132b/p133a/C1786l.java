package com.qiyukf.basesdk.p120b.p132b.p133a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d;

/* renamed from: com.qiyukf.basesdk.b.b.a.l */
public final class C1786l extends AbstractC1771d implements AbstractC1794d {
    public C1786l(C1774g gVar) {
        super(gVar, true, false);
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34031a(AbstractC1771d dVar) {
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: a */
    public final void mo34039a(Object obj) {
        C1709a.m3018d("DefaultChannelPipeline", "Discarded inbound message " + obj + "  that reached at the tail of the pipeline. Please check your pipeline configuration.");
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c
    /* renamed from: a */
    public final void mo34033a(Throwable th) {
        C1709a.m3019d("DefaultChannelPipeline", "An exceptionCaught() event was fired, and it reached at the tail of the pipeline. It usually means the last handler in the pipeline did not handle the exception.", th);
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1771d
    /* renamed from: g */
    public final AbstractC1793c mo34007g() {
        return this;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: h */
    public final void mo34040h() {
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d
    /* renamed from: i */
    public final void mo34041i() {
    }
}
