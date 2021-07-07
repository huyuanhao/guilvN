package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.gc */
public class C4446gc extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ long f12006a;

    /* renamed from: a */
    public final /* synthetic */ AbstractC4445gb f12007a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4446gc(AbstractC4445gb gbVar, int i, long j) {
        super(i);
        this.f12007a = gbVar;
        this.f12006a = j;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "check the ping-pong." + this.f12006a;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m12732a() {
        Thread.yield();
        if (this.f12007a.m12672c() && !this.f12007a.mo41901a(this.f12006a)) {
            this.f12007a.f11999b.mo42622a(22, (Exception) null);
        }
    }
}
