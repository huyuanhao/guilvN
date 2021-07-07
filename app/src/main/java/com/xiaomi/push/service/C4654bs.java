package com.xiaomi.push.service;

import com.xiaomi.push.C4274az;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bs */
public class C4654bs extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13314a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4654bs(XMPushService xMPushService, int i) {
        super(i);
        this.f13314a = xMPushService;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "prepare the mi push account.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14074a() {
        C4684w.m14209a(this.f13314a);
        if (C4274az.m11735b(this.f13314a)) {
            this.f13314a.mo42630a(true);
        }
    }
}
