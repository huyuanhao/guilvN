package com.xiaomi.push.service;

import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bp */
public class C4651bp implements C4611am.AbstractC4612a {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13311a;

    public C4651bp(XMPushService xMPushService) {
        this.f13311a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C4611am.AbstractC4612a
    /* renamed from: a */
    public void mo42678a() {
        XMPushService.m13761a(this.f13311a);
        if (C4611am.mo42670a().m13947a() <= 0) {
            XMPushService xMPushService = this.f13311a;
            xMPushService.mo42624a(new XMPushService.C4579f(12, null));
        }
    }
}
