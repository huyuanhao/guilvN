package com.qiyukf.nimlib.p183g.p184a.p185a;

import com.qiyukf.nimlib.p155a.C2130c;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2111a;
import com.qiyukf.nimlib.p155a.p157b.AbstractC2121c;
import com.qiyukf.nimlib.p155a.p162c.p164b.C2138b;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p155a.p175f.C2175a;
import com.qiyukf.nimlib.p183g.C2307f;
import com.qiyukf.nimlib.p183g.p184a.p187c.C2261d;
import com.qiyukf.nimlib.p183g.p191c.C2289a;

/* renamed from: com.qiyukf.nimlib.g.a.a.d */
public final class C2251d extends AbstractC2111a {

    /* renamed from: a */
    public final boolean f4488a;

    public C2251d(boolean z) {
        this.f4488a = z;
    }

    @Override // com.qiyukf.nimlib.p155a.p157b.AbstractC2111a
    /* renamed from: a */
    public final void mo34639a(AbstractC2148a aVar) {
        C2261d dVar = (C2261d) aVar;
        C2289a g = dVar.mo34890g();
        if (dVar.mo34889f() != 0 && AbstractC2121c.m4299a(this.f4488a).mo34649c(g) != null) {
            C2138b bVar = new C2138b();
            bVar.mo34680a(dVar.mo34889f());
            bVar.mo34681a(dVar.mo34890g());
            if (this.f4488a) {
                C2307f.m4934a().mo34993a(bVar);
            } else {
                C2130c.m4323a().mo34662a(bVar, C2175a.f4338d);
            }
        }
    }
}
