package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.b */
public class C0147b {

    /* renamed from: a */
    public static int f184a = 0;

    /* renamed from: b */
    public static long f185b = 0;

    /* renamed from: c */
    public static long f186c = 0;

    /* renamed from: d */
    public static long f187d = 0;

    /* renamed from: e */
    public static long f188e = 0;

    /* renamed from: f */
    public static long f189f = 0;

    /* renamed from: g */
    public static double f190g = 0.0d;

    /* renamed from: h */
    public static double f191h = 0.0d;

    /* renamed from: i */
    public static double f192i = 0.0d;

    /* renamed from: j */
    public static double f193j = 40.0d;

    /* renamed from: k */
    public static volatile boolean f194k;

    /* renamed from: l */
    public int f195l;

    /* renamed from: m */
    public int f196m;

    /* renamed from: n */
    public C0151e f197n;

    /* renamed from: anet.channel.monitor.b$a */
    public static class C0148a {

        /* renamed from: a */
        public static C0147b f198a = new C0147b(null);
    }

    public /* synthetic */ C0147b(C0149c cVar) {
        this();
    }

    /* renamed from: b */
    public static /* synthetic */ int m103b(C0147b bVar) {
        int i = bVar.f196m;
        bVar.f196m = i + 1;
        return i;
    }

    /* renamed from: d */
    public synchronized void mo3513d() {
        try {
            ALog.m290i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
            if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
                f194k = false;
                return;
            } else {
                f194k = true;
                return;
            }
        } catch (Exception e) {
            ALog.m291w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e, new Object[0]);
        }
    }

    /* renamed from: e */
    public void mo3514e() {
        f194k = false;
    }

    public C0147b() {
        this.f195l = 5;
        this.f196m = 0;
        this.f197n = new C0151e();
        NetworkStatusHelper.addStatusChangeListener(new C0149c(this));
    }

    /* renamed from: c */
    public double mo3512c() {
        return f192i;
    }

    /* renamed from: a */
    public static C0147b m101a() {
        return C0148a.f198a;
    }

    /* renamed from: b */
    public int mo3511b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f195l;
    }

    /* renamed from: a */
    public void mo3510a(long j, long j2, long j3) {
        if (f194k) {
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j), "mRequestFinishedTime", Long.valueOf(j2), "mRequestDataSize", Long.valueOf(j3));
            }
            if (j3 > 3000 && j < j2) {
                ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0150d(this, j3, j2, j));
            }
        }
    }
}
