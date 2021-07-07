package com.vivo.push.p282c;

import com.vivo.push.AbstractC4160y;
import com.vivo.push.AbstractRunnableC4157v;
import com.vivo.push.C4121p;
import com.vivo.push.model.C4118b;
import com.vivo.push.p280a.C4027a;
import com.vivo.push.p281b.C4037c;
import com.vivo.push.p281b.C4039e;
import com.vivo.push.util.C4148r;
import com.vivo.push.util.C4149s;

/* renamed from: com.vivo.push.c.a */
public final class C4062a extends AbstractRunnableC4157v {
    public C4062a(AbstractC4160y yVar) {
        super(yVar);
    }

    @Override // com.vivo.push.AbstractRunnableC4157v
    /* renamed from: a */
    public final void mo40942a(AbstractC4160y yVar) {
        C4037c cVar = (C4037c) yVar;
        C4118b a = C4149s.m11222a(this.f11150a);
        if (a == null) {
            C4121p.m11080a().mo41099a(cVar.mo40909h(), 1005, new Object[0]);
            return;
        }
        String a2 = a.mo41081a();
        if (a.mo41088c()) {
            C4121p.m11080a().mo41099a(cVar.mo40909h(), 1004, new Object[0]);
            yVar = new C4039e();
        } else {
            int a3 = C4148r.m11221a(cVar);
            if (a3 != 0) {
                C4121p.m11080a().mo41099a(cVar.mo40909h(), a3, new Object[0]);
                return;
            }
        }
        C4027a.m10883a(this.f11150a, a2, yVar);
    }
}
