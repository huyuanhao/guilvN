package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.t */
public final class C4681t extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4517ik f13388a;

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13389a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4681t(int i, XMPushService xMPushService, C4517ik ikVar) {
        super(i);
        this.f13389a = xMPushService;
        this.f13388a = ikVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send ack message for unrecognized new miui message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14198a() {
        try {
            C4517ik a = C4676p.m14169a((Context) this.f13389a, this.f13388a);
            a.m13270a().mo42118a("miui_message_unrecognized", "1");
            C4684w.m14210a(this.f13389a, a);
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13389a.mo42622a(10, e);
        }
    }
}
