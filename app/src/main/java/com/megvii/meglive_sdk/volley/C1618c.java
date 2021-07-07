package com.megvii.meglive_sdk.volley;

import android.os.Process;
import com.megvii.meglive_sdk.volley.AbstractC1616b;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.megvii.meglive_sdk.volley.c */
public final class C1618c extends Thread {

    /* renamed from: b */
    public static final boolean f2861b = C1654u.f2957b;

    /* renamed from: a */
    public volatile boolean f2862a = false;

    /* renamed from: c */
    public final BlockingQueue<AbstractC1628m<?>> f2863c;

    /* renamed from: d */
    public final BlockingQueue<AbstractC1628m<?>> f2864d;

    /* renamed from: e */
    public final AbstractC1616b f2865e;

    /* renamed from: f */
    public final AbstractC1634p f2866f;

    /* renamed from: com.megvii.meglive_sdk.volley.c$OooO00o */
    public class OooO00o implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC1628m f15102OooO00o;

        public OooO00o(AbstractC1628m mVar) {
            this.f15102OooO00o = mVar;
        }

        public final void run() {
            try {
                C1618c.this.f2864d.put(this.f15102OooO00o);
            } catch (InterruptedException unused) {
            }
        }
    }

    public C1618c(BlockingQueue<AbstractC1628m<?>> blockingQueue, BlockingQueue<AbstractC1628m<?>> blockingQueue2, AbstractC1616b bVar, AbstractC1634p pVar) {
        this.f2863c = blockingQueue;
        this.f2864d = blockingQueue2;
        this.f2865e = bVar;
        this.f2866f = pVar;
    }

    public final void run() {
        if (f2861b) {
            C1654u.m2872a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f2865e.mo17332a();
        while (true) {
            try {
                AbstractC1628m<?> take = this.f2863c.take();
                take.mo17348a("cache-queue-take");
                if (take.f2890k) {
                    take.mo17349b("cache-discard-canceled");
                } else {
                    AbstractC1616b.C1617a a = this.f2865e.mo17331a(take.f2884e);
                    if (a == null) {
                        take.mo17348a("cache-miss");
                        this.f2864d.put(take);
                    } else {
                        if (a.f2858e < System.currentTimeMillis()) {
                            take.mo17348a("cache-hit-expired");
                            take.f2894o = a;
                            this.f2864d.put(take);
                        } else {
                            take.mo17348a("cache-hit");
                            C1631o<?> a2 = take.mo17346a(new C1625j(a.f2854a, a.f2860g));
                            take.mo17348a("cache-hit-parsed");
                            if (!(a.f2859f < System.currentTimeMillis())) {
                                this.f2866f.mo17339a(take, a2);
                            } else {
                                take.mo17348a("cache-hit-refresh-needed");
                                take.f2894o = a;
                                a2.f2914d = true;
                                this.f2866f.mo17340a(take, a2, new OooO00o(take));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                if (this.f2862a) {
                    return;
                }
            }
        }
    }
}
