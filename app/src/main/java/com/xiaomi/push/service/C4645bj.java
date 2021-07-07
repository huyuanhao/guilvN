package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bj */
public class C4645bj extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13303a;

    /* renamed from: a */
    public final /* synthetic */ String f13304a;

    /* renamed from: a */
    public final /* synthetic */ byte[] f13305a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4645bj(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f13303a = xMPushService;
        this.f13304a = str;
        this.f13305a = bArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send mi push message";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14067a() {
        try {
            C4684w.m14213a(this.f13303a, this.f13304a, this.f13305a);
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13303a.mo42622a(10, e);
        }
    }
}
