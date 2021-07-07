package com.p118pd.sdk;

import com.p118pd.sdk.LL1LL;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.schedulers.ScheduledAction;
import p293rx.internal.util.RxThreadFactory;

/* renamed from: com.pd.sdk.丨丨l1i  reason: invalid class name and case insensitive filesystem */
public final class C9848l1i extends LL1LL implements AbstractC9688lLiLl {
    public static final long OooO00o = ((long) Integer.getInteger("rx.io-scheduler.keepalive", 60).intValue());

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO00o f23449OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final OooO0OO f23450OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final TimeUnit f23451OooO00o = TimeUnit.SECONDS;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ThreadFactory f23452OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<OooO00o> f23453OooO00o = new AtomicReference<>(f23449OooO00o);

    /* renamed from: com.pd.sdk.丨丨l1i$OooO0O0 */
    public static final class OooO0O0 extends LL1LL.OooO00o implements liii1l {
        public final IIlIIiI1 OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO00o f23460OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO f23461OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f23462OooO00o;

        /* renamed from: com.pd.sdk.丨丨l1i$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {
            public final /* synthetic */ liii1l OooO00o;

            public OooO00o(liii1l r2) {
                this.OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (!OooO0O0.this.isUnsubscribed()) {
                    this.OooO00o.call();
                }
            }
        }

        public OooO0O0(OooO00o oooO00o) {
            this.f23460OooO00o = oooO00o;
            this.f23462OooO00o = new AtomicBoolean();
            this.f23461OooO00o = oooO00o.m21931OooO00o();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r4) {
            return OooO00o(r4, 0, null);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.f23460OooO00o.OooO00o(this.f23461OooO00o);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (this.f23462OooO00o.compareAndSet(false, true)) {
                this.f23461OooO00o.OooO00o(this);
            }
            this.OooO00o.unsubscribe();
        }

        @Override // com.p118pd.sdk.LL1LL.OooO00o
        public LlIiLii OooO00o(liii1l r3, long j, TimeUnit timeUnit) {
            if (this.OooO00o.isUnsubscribed()) {
                return C9638ill.OooO0O0();
            }
            ScheduledAction OooO00o2 = this.f23461OooO00o.m17746OooO00o((liii1l) new OooO00o(r3), j, timeUnit);
            this.OooO00o.OooO00o(OooO00o2);
            OooO00o2.addParent(this.OooO00o);
            return OooO00o2;
        }
    }

    /* renamed from: com.pd.sdk.丨丨l1i$OooO0OO */
    public static final class OooO0OO extends C6655liIlIl {
        public long OooO00o = 0;

        public OooO0OO(ThreadFactory threadFactory) {
            super(threadFactory);
        }

        public void OooO00o(long j) {
            this.OooO00o = j;
        }

        public long OooO0OO() {
            return this.OooO00o;
        }
    }

    static {
        OooO0OO oooO0OO = new OooO0OO(RxThreadFactory.NONE);
        f23450OooO00o = oooO0OO;
        oooO0OO.unsubscribe();
        OooO00o oooO00o = new OooO00o(null, 0, null);
        f23449OooO00o = oooO00o;
        oooO00o.OooO0O0();
    }

    public C9848l1i(ThreadFactory threadFactory) {
        this.f23452OooO00o = threadFactory;
        start();
    }

    @Override // com.p118pd.sdk.LL1LL, com.p118pd.sdk.LL1LL
    public LL1LL.OooO00o OooO00o() {
        return new OooO0O0(this.f23453OooO00o.get());
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void shutdown() {
        OooO00o oooO00o;
        OooO00o oooO00o2;
        do {
            oooO00o = this.f23453OooO00o.get();
            oooO00o2 = f23449OooO00o;
            if (oooO00o == oooO00o2) {
                return;
            }
        } while (!this.f23453OooO00o.compareAndSet(oooO00o, oooO00o2));
        oooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9688lLiLl
    public void start() {
        OooO00o oooO00o = new OooO00o(this.f23452OooO00o, OooO00o, f23451OooO00o);
        if (!this.f23453OooO00o.compareAndSet(f23449OooO00o, oooO00o)) {
            oooO00o.OooO0O0();
        }
    }

    /* renamed from: com.pd.sdk.丨丨l1i$OooO00o */
    public static final class OooO00o {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IIlIIiI1 f23454OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ConcurrentLinkedQueue<OooO0OO> f23455OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Future<?> f23456OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ScheduledExecutorService f23457OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ThreadFactory f23458OooO00o;

        /* renamed from: com.pd.sdk.丨丨l1i$OooO00o$OooO00o  reason: collision with other inner class name */
        public class ThreadFactoryC4982OooO00o implements ThreadFactory {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ ThreadFactory f23459OooO00o;

            public ThreadFactoryC4982OooO00o(ThreadFactory threadFactory) {
                this.f23459OooO00o = threadFactory;
            }

            public Thread newThread(Runnable runnable) {
                Thread newThread = this.f23459OooO00o.newThread(runnable);
                newThread.setName(newThread.getName() + " (Evictor)");
                return newThread;
            }
        }

        /* renamed from: com.pd.sdk.丨丨l1i$OooO00o$OooO0O0 */
        public class OooO0O0 implements Runnable {
            public OooO0O0() {
            }

            public void run() {
                OooO00o.this.m21932OooO00o();
            }
        }

        public OooO00o(ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.f23458OooO00o = threadFactory;
            this.OooO00o = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.f23455OooO00o = new ConcurrentLinkedQueue<>();
            this.f23454OooO00o = new IIlIIiI1();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactoryC4982OooO00o(threadFactory));
                C6655liIlIl.m17745OooO00o(scheduledExecutorService);
                OooO0O0 oooO0O0 = new OooO0O0();
                long j2 = this.OooO00o;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(oooO0O0, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.f23457OooO00o = scheduledExecutorService;
            this.f23456OooO00o = scheduledFuture;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public OooO0OO m21931OooO00o() {
            if (this.f23454OooO00o.isUnsubscribed()) {
                return C9848l1i.f23450OooO00o;
            }
            while (!this.f23455OooO00o.isEmpty()) {
                OooO0OO poll = this.f23455OooO00o.poll();
                if (poll != null) {
                    return poll;
                }
            }
            OooO0OO oooO0OO = new OooO0OO(this.f23458OooO00o);
            this.f23454OooO00o.OooO00o(oooO0OO);
            return oooO0OO;
        }

        public void OooO0O0() {
            try {
                if (this.f23456OooO00o != null) {
                    this.f23456OooO00o.cancel(true);
                }
                if (this.f23457OooO00o != null) {
                    this.f23457OooO00o.shutdownNow();
                }
            } finally {
                this.f23454OooO00o.unsubscribe();
            }
        }

        public void OooO00o(OooO0OO oooO0OO) {
            oooO0OO.OooO00o(OooO00o() + this.OooO00o);
            this.f23455OooO00o.offer(oooO0OO);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m21932OooO00o() {
            if (!this.f23455OooO00o.isEmpty()) {
                long OooO00o2 = OooO00o();
                Iterator<OooO0OO> it = this.f23455OooO00o.iterator();
                while (it.hasNext()) {
                    OooO0OO next = it.next();
                    if (next.OooO0OO() > OooO00o2) {
                        return;
                    }
                    if (this.f23455OooO00o.remove(next)) {
                        this.f23454OooO00o.OooO0O0(next);
                    }
                }
            }
        }

        public long OooO00o() {
            return System.nanoTime();
        }
    }
}
