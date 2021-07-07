package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.ax */
public class C4630ax extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public C4428fn f13265a;

    /* renamed from: a */
    public XMPushService f13266a = null;

    public C4630ax(XMPushService xMPushService, C4428fn fnVar) {
        super(4);
        this.f13266a = xMPushService;
        this.f13265a = fnVar;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "send a message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14013a() {
        try {
            if (this.f13265a != null) {
                this.f13266a.mo42623a(this.f13265a);
            }
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13266a.mo42622a(10, e);
        }
    }
}
