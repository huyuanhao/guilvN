package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4483hg;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.aw */
public class C4629aw {

    /* renamed from: d */
    public static int f13259d = 300000;

    /* renamed from: a */
    public int f13260a;

    /* renamed from: a */
    public long f13261a;

    /* renamed from: a */
    public XMPushService f13262a;

    /* renamed from: b */
    public int f13263b = 0;

    /* renamed from: c */
    public int f13264c = 0;

    public C4629aw(XMPushService xMPushService) {
        this.f13262a = xMPushService;
        this.f13260a = 500;
        this.f13261a = 0;
    }

    /* renamed from: a */
    private int mo42690a() {
        if (this.f13263b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        int i = this.f13263b;
        if (i > 4) {
            return (int) (random * 60000.0d);
        }
        if (i > 1) {
            return (int) (random * 10000.0d);
        }
        if (this.f13261a == 0) {
            return 0;
        }
        if (System.currentTimeMillis() - this.f13261a < 310000) {
            int i2 = this.f13260a;
            int i3 = f13259d;
            if (i2 >= i3) {
                return i2;
            }
            int i4 = this.f13264c + 1;
            this.f13264c = i4;
            if (i4 >= 4) {
                return i3;
            }
            double d = (double) i2;
            Double.isNaN(d);
            this.f13260a = (int) (d * 1.5d);
            return i2;
        }
        this.f13260a = 1000;
        this.f13264c = 0;
        return 0;
    }

    /* renamed from: a */
    public void m14010a() {
        this.f13261a = System.currentTimeMillis();
        this.f13262a.mo42621a(1);
        this.f13263b = 0;
    }

    /* renamed from: a */
    public void mo42691a(boolean z) {
        if (!this.f13262a.m13810a()) {
            AbstractC4163b.m11305c("should not reconnect as no client or network.");
        } else if (z) {
            if (!this.f13262a.m13811a(1)) {
                this.f13263b++;
            }
            this.f13262a.mo42621a(1);
            XMPushService xMPushService = this.f13262a;
            xMPushService.getClass();
            xMPushService.mo42624a(new XMPushService.C4577d());
        } else if (!this.f13262a.m13811a(1)) {
            int a = mo42690a();
            this.f13263b++;
            AbstractC4163b.m11301a("schedule reconnect in " + a + "ms");
            XMPushService xMPushService2 = this.f13262a;
            xMPushService2.getClass();
            xMPushService2.mo42625a(new XMPushService.C4577d(), (long) a);
            if (this.f13263b == 2 && C4483hg.m12882a().m12889a()) {
                C4599ad.m13909b();
            }
            if (this.f13263b == 3) {
                C4599ad.m13906a();
            }
        }
    }
}
