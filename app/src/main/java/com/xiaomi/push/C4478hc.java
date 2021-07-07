package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.hc */
public class C4478hc extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ C4477hb f12142a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4478hc(C4477hb hbVar, int i) {
        super(i);
        this.f12142a = hbVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "Handling bind stats";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m12865a() {
        C4477hb.m12859a(this.f12142a);
    }
}
