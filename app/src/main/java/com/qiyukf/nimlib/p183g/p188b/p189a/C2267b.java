package com.qiyukf.nimlib.p183g.p188b.p189a;

import com.qiyukf.basesdk.p120b.p132b.p134b.AbstractC1790d;
import com.qiyukf.basesdk.p120b.p132b.p134b.C1789c;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p183g.p188b.C2281d;
import java.nio.ByteBuffer;

/* renamed from: com.qiyukf.nimlib.g.b.a.b */
public final class C2267b extends AbstractC1790d<Object> {

    /* renamed from: b */
    public C2281d f4514b;

    public C2267b(C2281d dVar) {
        super(Object.class);
        this.f4514b = dVar;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p134b.AbstractC1790d
    /* renamed from: a */
    public final ByteBuffer mo34043a(Object obj) {
        C2281d dVar;
        AbstractC2131a.C2132a aVar;
        if (obj instanceof AbstractC2131a) {
            AbstractC2131a aVar2 = (AbstractC2131a) obj;
            dVar = this.f4514b;
            aVar = new AbstractC2131a.C2132a(aVar2.mo34667a(), aVar2.mo34669b().mo34972b());
        } else if (obj instanceof C2227a) {
            C2227a aVar3 = (C2227a) obj;
            dVar = this.f4514b;
            aVar = new AbstractC2131a.C2132a(aVar3.mo34847b(), aVar3.mo34848c());
        } else {
            throw new C1789c("unsupport request type: " + obj.getClass().getName());
        }
        return dVar.mo34922a(aVar).mo34972b();
    }
}
