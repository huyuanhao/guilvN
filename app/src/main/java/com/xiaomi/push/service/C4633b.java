package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.service.b */
public class C4633b extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public C4520in f13276a;

    /* renamed from: a */
    public WeakReference<XMPushService> f13277a;

    /* renamed from: a */
    public boolean f13278a = false;

    public C4633b(C4520in inVar, WeakReference<XMPushService> weakReference, boolean z) {
        this.f13276a = inVar;
        this.f13277a = weakReference;
        this.f13278a = z;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 22;
    }

    public void run() {
        XMPushService xMPushService;
        WeakReference<XMPushService> weakReference = this.f13277a;
        if (weakReference != null && this.f13276a != null && (xMPushService = weakReference.get()) != null) {
            this.f13276a.mo42307a(C4609ak.m13938a());
            this.f13276a.mo42310a(false);
            AbstractC4163b.m11305c("MoleInfo aw_ping : send aw_Ping msg " + this.f13276a.mo42312a());
            try {
                String c = this.f13276a.mo42318c();
                xMPushService.mo42629a(c, C4531iy.m13590a(C4684w.m14206a(c, this.f13276a.mo42315b(), this.f13276a, EnumC4494ho.Notification)), this.f13278a);
            } catch (Exception e) {
                AbstractC4163b.m11306d("MoleInfo aw_ping : send help app ping error" + e.toString());
            }
        }
    }
}
