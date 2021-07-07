package com.xiaomi.push.service;

import android.database.ContentObserver;
import android.os.Handler;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bq */
public class C4652bq extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13312a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4652bq(XMPushService xMPushService, Handler handler) {
        super(handler);
        this.f13312a = xMPushService;
    }

    public void onChange(boolean z) {
        super.onChange(z);
        boolean a = XMPushService.m13765a(this.f13312a);
        AbstractC4163b.m11301a("ExtremePowerMode:" + a);
        if (a) {
            XMPushService xMPushService = this.f13312a;
            xMPushService.mo42624a(new XMPushService.C4579f(23, null));
            return;
        }
        this.f13312a.mo42630a(true);
    }
}
