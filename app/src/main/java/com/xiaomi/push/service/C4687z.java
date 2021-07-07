package com.xiaomi.push.service;

import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.service.C4611am;

/* renamed from: com.xiaomi.push.service.z */
public final class C4687z implements C4611am.C4613b.AbstractC4614a {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13401a;

    public C4687z(XMPushService xMPushService) {
        this.f13401a = xMPushService;
    }

    @Override // com.xiaomi.push.service.C4611am.C4613b.AbstractC4614a
    /* renamed from: a */
    public void mo41990a(C4611am.EnumC4617c cVar, C4611am.EnumC4617c cVar2, int i) {
        if (cVar2 == C4611am.EnumC4617c.binded) {
            C4675o.m14164a(this.f13401a);
            C4675o.m14166b(this.f13401a);
        } else if (cVar2 == C4611am.EnumC4617c.unbind) {
            C4675o.m14162a(this.f13401a, ErrorCode.ERROR_SERVICE_UNAVAILABLE, " the push is not connected.");
        }
    }
}
