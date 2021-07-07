package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.gd */
public class C4447gd extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ AbstractC4445gb f12008a;

    /* renamed from: a */
    public final /* synthetic */ Exception f12009a;

    /* renamed from: b */
    public final /* synthetic */ int f12010b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4447gd(AbstractC4445gb gbVar, int i, int i2, Exception exc) {
        super(i);
        this.f12008a = gbVar;
        this.f12010b = i2;
        this.f12009a = exc;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "shutdown the connection. " + this.f12010b + ", " + this.f12009a;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m12734a() {
        this.f12008a.f11999b.mo42622a(this.f12010b, this.f12009a);
    }
}
