package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.br */
public class C4653br extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13313a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4653br(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f13313a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean b = XMPushService.m13771b(this.f13313a);
        AbstractC4163b.m11301a("SuperPowerMode:" + b);
        XMPushService.m13761a(this.f13313a);
        if (b) {
            XMPushService xMPushService = this.f13313a;
            xMPushService.mo42624a(new XMPushService.C4579f(24, null));
            return;
        }
        this.f13313a.mo42630a(true);
    }
}
