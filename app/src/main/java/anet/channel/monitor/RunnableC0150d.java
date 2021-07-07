package anet.channel.monitor;

import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.d */
public class RunnableC0150d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f200a;

    /* renamed from: b */
    public final /* synthetic */ long f201b;

    /* renamed from: c */
    public final /* synthetic */ long f202c;

    /* renamed from: d */
    public final /* synthetic */ C0147b f203d;

    public RunnableC0150d(C0147b bVar, long j, long j2, long j3) {
        this.f203d = bVar;
        this.f200a = j;
        this.f201b = j2;
        this.f202c = j3;
    }

    public void run() {
        C0147b.f184a++;
        C0147b.f188e += this.f200a;
        if (C0147b.f184a == 1) {
            C0147b.f187d = this.f201b - this.f202c;
        }
        int i = C0147b.f184a;
        if (i >= 2 && i <= 3) {
            long j = this.f202c;
            long j2 = C0147b.f186c;
            if (j >= j2) {
                C0147b.f187d += this.f201b - j;
            } else if (j < j2) {
                long j3 = this.f201b;
                if (j3 >= j2) {
                    long j4 = C0147b.f187d + (j3 - j);
                    C0147b.f187d = j4;
                    C0147b.f187d = j4 - (C0147b.f186c - j);
                }
            }
        }
        C0147b.f185b = this.f202c;
        C0147b.f186c = this.f201b;
        if (C0147b.f184a == 3) {
            C0147b.f192i = (double) ((long) C0147b.m102a(this.f203d).mo3516a((double) C0147b.f188e, (double) C0147b.f187d));
            C0147b.f189f++;
            C0147b.m103b(this.f203d);
            if (C0147b.f189f > 30) {
                C0147b.m102a(this.f203d).mo3517a();
                C0147b.f189f = 3;
            }
            double d = (C0147b.f192i * 0.68d) + (C0147b.f191h * 0.27d) + (C0147b.f190g * 0.05d);
            C0147b.f190g = C0147b.f191h;
            C0147b.f191h = C0147b.f192i;
            if (C0147b.f192i < C0147b.f190g * 0.65d || C0147b.f192i > C0147b.f190g * 2.0d) {
                C0147b.f192i = d;
            }
            int i2 = 5;
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(C0147b.f188e), "mKalmanTimeUsed", Long.valueOf(C0147b.f187d), "speed", Double.valueOf(C0147b.f192i), "mSpeedKalmanCount", Long.valueOf(C0147b.f189f));
            }
            if (C0147b.m105c(this.f203d) > 5 || C0147b.f189f == 2) {
                C0146a.m96a().mo3507a(C0147b.f192i);
                C0147b.m100a(this.f203d, 0);
                C0147b bVar = this.f203d;
                if (C0147b.f192i < C0147b.f193j) {
                    i2 = 1;
                }
                C0147b.m104b(bVar, i2);
                ALog.m290i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
            }
            C0147b.f187d = 0;
            C0147b.f188e = 0;
            C0147b.f184a = 0;
        }
    }
}
