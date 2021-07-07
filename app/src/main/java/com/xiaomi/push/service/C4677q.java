package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.q */
public final class C4677q extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4517ik f13373a;

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13374a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4677q(int i, XMPushService xMPushService, C4517ik ikVar) {
        super(i);
        this.f13374a = xMPushService;
        this.f13373a = ikVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send app absent message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14189a() {
        try {
            C4684w.m14210a(this.f13374a, C4684w.m14205a(this.f13373a.mo42282b(), this.f13373a.m13277a()));
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13374a.mo42622a(10, e);
        }
    }
}
