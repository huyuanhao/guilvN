package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bk */
public class C4646bk extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13306a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4646bk(XMPushService xMPushService, int i) {
        super(i);
        this.f13306a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "disconnect for service destroy.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14069a() {
        if (this.f13306a.f13081a != null) {
            this.f13306a.f13081a.mo41903b(15, (Exception) null);
            this.f13306a.f13081a = null;
        }
    }
}
