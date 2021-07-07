package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.c */
public class C4657c extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public XMPushService f13321a = null;

    /* renamed from: a */
    public C4428fn[] f13322a;

    public C4657c(XMPushService xMPushService, C4428fn[] fnVarArr) {
        super(4);
        this.f13321a = xMPushService;
        this.f13322a = fnVarArr;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "batch send message.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14079a() {
        try {
            if (this.f13322a != null) {
                this.f13321a.mo42632a(this.f13322a);
            }
        } catch (C4449gf e) {
            AbstractC4163b.m11303a(e);
            this.f13321a.mo42622a(10, e);
        }
    }
}
