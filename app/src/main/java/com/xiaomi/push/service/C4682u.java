package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.u */
public final class C4682u extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4517ik f13390a;

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13391a;

    /* renamed from: a */
    public final /* synthetic */ String f13392a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4682u(int i, XMPushService xMPushService, C4517ik ikVar, String str) {
        super(i);
        this.f13391a = xMPushService;
        this.f13390a = ikVar;
        this.f13392a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send app absent ack message for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14200a() {
        try {
            C4517ik a = C4676p.m14169a((Context) this.f13391a, this.f13390a);
            a.m13270a().mo42118a("absent_target_package", this.f13392a);
            C4684w.m14210a(this.f13391a, a);
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13391a.mo42622a(10, e);
        }
    }
}
