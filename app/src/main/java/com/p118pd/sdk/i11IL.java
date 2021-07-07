package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.CompositeException;

/* renamed from: com.pd.sdk.i丨11I丨L  reason: invalid class name */
public final class i11IL implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final C9349III<C5876LlIl> OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.i丨11I丨L$OooO00o */
    public static final class OooO00o extends AbstractC9508LiLi<C5876LlIl> {
        public final IIlIIiI1 OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6473l1II f18118OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f18119OooO00o = new AtomicBoolean();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f18120OooO00o = new AtomicInteger(1);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Queue<Throwable>> f18121OooO00o = new AtomicReference<>();
        public final boolean OooO0O0;
        public volatile boolean OooO0OO;

        /* renamed from: com.pd.sdk.i丨11I丨L$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4943OooO00o implements AbstractC6473l1II {
            public LlIiLii OooO00o;
            public boolean OooO0O0;

            public C4943OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    OooO00o.this.OooO00o.OooO0O0(this.OooO00o);
                    OooO00o.this.OooO0OO();
                    if (!OooO00o.this.OooO0OO) {
                        OooO00o.this.request(1);
                    }
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                if (this.OooO0O0) {
                    C9714lli.m21756OooO00o(th);
                    return;
                }
                this.OooO0O0 = true;
                OooO00o.this.OooO00o.OooO0O0(this.OooO00o);
                OooO00o.this.OooO00o().offer(th);
                OooO00o.this.OooO0OO();
                OooO00o oooO00o = OooO00o.this;
                if (oooO00o.OooO0O0 && !oooO00o.OooO0OO) {
                    OooO00o.this.request(1);
                }
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                this.OooO00o = llIiLii;
                OooO00o.this.OooO00o.OooO00o(llIiLii);
            }
        }

        public OooO00o(AbstractC6473l1II r1, int i, boolean z) {
            this.f18118OooO00o = r1;
            this.OooO0O0 = z;
            if (i == Integer.MAX_VALUE) {
                request(Long.MAX_VALUE);
            } else {
                request((long) i);
            }
        }

        public void OooO0OO() {
            Queue<Throwable> queue;
            if (this.f18120OooO00o.decrementAndGet() == 0) {
                Queue<Throwable> queue2 = this.f18121OooO00o.get();
                if (queue2 == null || queue2.isEmpty()) {
                    this.f18118OooO00o.onCompleted();
                    return;
                }
                Throwable OooO00o2 = i11IL.OooO00o(queue2);
                if (this.f18119OooO00o.compareAndSet(false, true)) {
                    this.f18118OooO00o.onError(OooO00o2);
                } else {
                    C9714lli.m21756OooO00o(OooO00o2);
                }
            } else if (!this.OooO0O0 && (queue = this.f18121OooO00o.get()) != null && !queue.isEmpty()) {
                Throwable OooO00o3 = i11IL.OooO00o(queue);
                if (this.f18119OooO00o.compareAndSet(false, true)) {
                    this.f18118OooO00o.onError(OooO00o3);
                } else {
                    C9714lli.m21756OooO00o(OooO00o3);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0OO) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            OooO00o().offer(th);
            this.OooO0OO = true;
            OooO0OO();
        }

        public Queue<Throwable> OooO00o() {
            Queue<Throwable> queue = this.f18121OooO00o.get();
            if (queue != null) {
                return queue;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            if (this.f18121OooO00o.compareAndSet(null, concurrentLinkedQueue)) {
                return concurrentLinkedQueue;
            }
            return this.f18121OooO00o.get();
        }

        /* renamed from: OooO00o */
        public void onNext(C5876LlIl r2) {
            if (!this.OooO0OO) {
                this.f18120OooO00o.getAndIncrement();
                r2.OooO0O0(new C4943OooO00o());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨III<? extends com.pd.sdk.L丨lI丨l> */
    /* JADX WARN: Multi-variable type inference failed */
    public i11IL(C9349III<? extends C5876LlIl> r1, int i, boolean z) {
        this.OooO00o = r1;
        this.o00oO0O = i;
        this.OooO0O0 = z;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r4) {
        OooO00o oooO00o = new OooO00o(r4, this.o00oO0O, this.OooO0O0);
        r4.onSubscribe(oooO00o);
        this.OooO00o.OooO0O0(oooO00o);
    }

    public static Throwable OooO00o(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (arrayList.size() == 1) {
            return (Throwable) arrayList.get(0);
        }
        return new CompositeException(arrayList);
    }
}
