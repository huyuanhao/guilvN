package com.vivo.push.p282c;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.model.C4118b;
import com.vivo.push.p280a.C4027a;
import com.vivo.push.p281b.C4034ac;
import com.vivo.push.p281b.C4038d;
import com.vivo.push.p281b.C4040f;
import com.vivo.push.util.C4149s;

/* renamed from: com.vivo.push.c.b */
public final class C4074b extends AbstractRunnableC4157v {
    public C4074b(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        boolean z;
        C4118b a = C4149s.m11222a(this.f11150a);
        if (((C4038d) yVar).mo40910d()) {
            try {
                z = C4078f.m11020a(this.f11150a);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        } else {
            z = C4078f.m11021b(this.f11150a);
        }
        if (z) {
            C4118b a2 = C4149s.m11222a(this.f11150a);
            if (a == null || a2 == null || a2.mo41081a() == null || !a2.mo41081a().equals(a.mo41081a())) {
                if (!(a == null || a.mo41081a() == null)) {
                    C4027a.m10883a(this.f11150a, a.mo41081a(), new C4034ac(a.mo41081a()));
                }
                if (a2 != null && a2.mo41081a() != null) {
                    C4027a.m10883a(this.f11150a, a2.mo41081a(), new C4040f());
                }
            }
        }
    }
}
