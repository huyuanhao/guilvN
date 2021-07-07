package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ao */
public class C4619ao extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4611am.C4613b.C4616c f13210a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4619ao(C4611am.C4613b.C4616c cVar, int i) {
        super(i);
        this.f13210a = cVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "clear peer job";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m13982a() {
        C4611am.C4613b.C4616c cVar = this.f13210a;
        if (cVar.f13202a == cVar.f13203a.f13178a) {
            AbstractC4163b.m11304b("clean peer, chid = " + this.f13210a.f13203a.f13194g);
            this.f13210a.f13203a.f13178a = null;
        }
    }
}
