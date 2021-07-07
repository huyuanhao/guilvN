package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.v */
public final class C4683v extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4517ik f13393a;

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13394a;

    /* renamed from: a */
    public final /* synthetic */ String f13395a;

    /* renamed from: b */
    public final /* synthetic */ String f13396b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4683v(int i, XMPushService xMPushService, C4517ik ikVar, String str, String str2) {
        super(i);
        this.f13394a = xMPushService;
        this.f13393a = ikVar;
        this.f13395a = str;
        this.f13396b = str2;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send wrong message ack for message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14202a() {
        try {
            C4517ik a = C4676p.m14169a((Context) this.f13394a, this.f13393a);
            a.f12688a.mo42118a("error", this.f13395a);
            a.f12688a.mo42118a(MiPushCommandMessage.KEY_REASON, this.f13396b);
            C4684w.m14210a(this.f13394a, a);
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13394a.mo42622a(10, e);
        }
    }
}
