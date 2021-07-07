package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.r */
public final class C4678r extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4517ik f13375a;

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13376a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4678r(int i, XMPushService xMPushService, C4517ik ikVar) {
        super(i);
        this.f13376a = xMPushService;
        this.f13375a = ikVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14191a() {
        try {
            C4684w.m14210a(this.f13376a, C4676p.m14169a((Context) this.f13376a, this.f13375a));
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13376a.mo42622a(10, e);
        }
    }
}
