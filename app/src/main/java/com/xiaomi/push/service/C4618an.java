package com.xiaomi.push.service;

import com.xiaomi.push.service.C4611am;

/* renamed from: com.xiaomi.push.service.an */
public class C4618an implements C4611am.C4613b.AbstractC4614a {

    /* renamed from: a */
    public final /* synthetic */ C4611am.C4613b f13209a;

    public C4618an(C4611am.C4613b bVar) {
        this.f13209a = bVar;
    }

    @Override // com.xiaomi.push.service.C4611am.C4613b.AbstractC4614a
    /* renamed from: a */
    public void mo41990a(C4611am.EnumC4617c cVar, C4611am.EnumC4617c cVar2, int i) {
        if (cVar2 == C4611am.EnumC4617c.binding) {
            this.f13209a.f13180a.mo42625a(C4611am.C4613b.m13961a(this.f13209a), 60000);
        } else {
            this.f13209a.f13180a.mo42634b(C4611am.C4613b.m13961a(this.f13209a));
        }
    }
}
