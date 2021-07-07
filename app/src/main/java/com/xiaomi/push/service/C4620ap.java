package com.xiaomi.push.service;

import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ap */
public class C4620ap extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4611am.C4613b.C4616c f13211a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4620ap(C4611am.C4613b.C4616c cVar, int i) {
        super(i);
        this.f13211a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "check peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m13984a() {
        C4611am a = C4611am.mo42670a();
        C4611am.C4613b bVar = this.f13211a.f13203a;
        if (a.mo42671a(bVar.f13194g, bVar.f13188b).f13178a == null) {
            XMPushService xMPushService = C4611am.C4613b.this.f13180a;
            C4611am.C4613b bVar2 = this.f13211a.f13203a;
            xMPushService.mo42628a(bVar2.f13194g, bVar2.f13188b, 2, null, null);
        }
    }
}
