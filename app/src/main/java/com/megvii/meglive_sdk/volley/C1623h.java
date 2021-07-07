package com.megvii.meglive_sdk.volley;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.megvii.meglive_sdk.volley.h */
public final class C1623h extends Thread {

    /* renamed from: a */
    public volatile boolean f2872a = false;

    /* renamed from: b */
    public final BlockingQueue<AbstractC1628m<?>> f2873b;

    /* renamed from: c */
    public final AbstractC1622g f2874c;

    /* renamed from: d */
    public final AbstractC1616b f2875d;

    /* renamed from: e */
    public final AbstractC1634p f2876e;

    public C1623h(BlockingQueue<AbstractC1628m<?>> blockingQueue, AbstractC1622g gVar, AbstractC1616b bVar, AbstractC1634p pVar) {
        this.f2873b = blockingQueue;
        this.f2874c = gVar;
        this.f2875d = bVar;
        this.f2876e = pVar;
    }

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                AbstractC1628m<?> take = this.f2873b.take();
                try {
                    take.mo17348a("network-queue-take");
                    if (take.f2890k) {
                        take.mo17349b("network-discard-cancelled");
                    } else {
                        if (Build.VERSION.SDK_INT >= 14) {
                            TrafficStats.setThreadStatsTag(take.f2885f);
                        }
                        C1625j a = this.f2874c.mo17344a(take);
                        take.mo17348a("network-http-complete");
                        if (!a.f2880d || !take.f2891l) {
                            C1631o<?> a2 = take.mo17346a(a);
                            take.mo17348a("network-parse-complete");
                            if (take.f2889j && a2.f2912b != null) {
                                this.f2875d.mo17333a(take.f2884e, a2.f2912b);
                                take.mo17348a("network-cache-written");
                            }
                            take.f2891l = true;
                            this.f2876e.mo17339a(take, a2);
                        } else {
                            take.mo17349b("not-modified");
                        }
                    }
                } catch (C1638t e) {
                    e.f2916b = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f2876e.mo17341a(take, AbstractC1628m.m2792a(e));
                } catch (Exception e2) {
                    C1654u.m2875d("Unhandled exception %s", e2.toString());
                    C1638t tVar = new C1638t(e2);
                    tVar.f2916b = SystemClock.elapsedRealtime() - elapsedRealtime;
                    this.f2876e.mo17341a(take, tVar);
                }
            } catch (InterruptedException unused) {
                if (this.f2872a) {
                    return;
                }
            }
        }
    }
}
