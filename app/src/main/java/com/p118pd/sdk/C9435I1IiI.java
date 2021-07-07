package com.p118pd.sdk;

import com.p118pd.sdk.C6222ii1l;
import com.p118pd.sdk.C9349III;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.internal.operators.NotificationLite;
import p293rx.internal.util.BackpressureDrainManager;

/* renamed from: com.pd.sdk.丨I丨1IiI  reason: invalid class name and case insensitive filesystem */
public class C9435I1IiI<T> implements C9349III.OooO0O0<T, T> {
    public final C6222ii1l.AbstractC6223OooO0Oo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liii1l f22970OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Long f22971OooO00o;

    /* renamed from: com.pd.sdk.丨I丨1IiI$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements BackpressureDrainManager.OooO00o {
        public final C6222ii1l.AbstractC6223OooO0Oo OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final liii1l f22972OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f22973OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ConcurrentLinkedQueue<Object> f22974OooO00o = new ConcurrentLinkedQueue<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f22975OooO00o = new AtomicBoolean(false);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f22976OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final BackpressureDrainManager f22977OooO00o;

        public OooO00o(AbstractC9508LiLi<? super T> r3, Long l, liii1l r5, C6222ii1l.AbstractC6223OooO0Oo oooO0Oo) {
            this.f22973OooO00o = r3;
            this.f22976OooO00o = l != null ? new AtomicLong(l.longValue()) : null;
            this.f22972OooO00o = r5;
            this.f22977OooO00o = new BackpressureDrainManager(this);
            this.OooO00o = oooO0Oo;
        }

        @Override // p293rx.internal.util.BackpressureDrainManager.OooO00o
        public boolean OooO00o(Object obj) {
            return NotificationLite.OooO00o(this.f22973OooO00o, obj);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.f22975OooO00o.get()) {
                this.f22977OooO00o.terminateAndDrain();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.f22975OooO00o.get()) {
                this.f22977OooO00o.terminateAndDrain(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (OooO00o()) {
                this.f22974OooO00o.offer(NotificationLite.OooO0O0((Object) t));
                this.f22977OooO00o.drain();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        @Override // p293rx.internal.util.BackpressureDrainManager.OooO00o
        public Object peek() {
            return this.f22974OooO00o.peek();
        }

        @Override // p293rx.internal.util.BackpressureDrainManager.OooO00o
        public Object poll() {
            Object poll = this.f22974OooO00o.poll();
            AtomicLong atomicLong = this.f22976OooO00o;
            if (!(atomicLong == null || poll == null)) {
                atomicLong.incrementAndGet();
            }
            return poll;
        }

        @Override // p293rx.internal.util.BackpressureDrainManager.OooO00o
        public void OooO00o(Throwable th) {
            if (th != null) {
                this.f22973OooO00o.onError(th);
            } else {
                this.f22973OooO00o.onCompleted();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0039 A[SYNTHETIC, Splitter:B:19:0x0039] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0049 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean OooO00o() {
            /*
                r6 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22976OooO00o
                r1 = 1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22976OooO00o
                long r2 = r0.get()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 > 0) goto L_0x004a
                r0 = 0
                com.pd.sdk.ii1l$OooO0Oo r4 = r6.OooO00o     // Catch:{ MissingBackpressureException -> 0x0023 }
                boolean r4 = r4.OooO00o()     // Catch:{ MissingBackpressureException -> 0x0023 }
                if (r4 == 0) goto L_0x0034
                java.lang.Object r4 = r6.poll()     // Catch:{ MissingBackpressureException -> 0x0023 }
                if (r4 == 0) goto L_0x0034
                r4 = 1
                goto L_0x0035
            L_0x0023:
                r4 = move-exception
                java.util.concurrent.atomic.AtomicBoolean r5 = r6.f22975OooO00o
                boolean r5 = r5.compareAndSet(r0, r1)
                if (r5 == 0) goto L_0x0034
                r6.unsubscribe()
                com.pd.sdk.丨LiL丨丨i<? super T> r5 = r6.f22973OooO00o
                r5.onError(r4)
            L_0x0034:
                r4 = 0
            L_0x0035:
                com.pd.sdk.l丨iii1l r5 = r6.f22972OooO00o
                if (r5 == 0) goto L_0x0047
                r5.call()     // Catch:{ all -> 0x003d }
                goto L_0x0047
            L_0x003d:
                r1 = move-exception
                com.p118pd.sdk.IIl11.m15447OooO00o(r1)
                rx.internal.util.BackpressureDrainManager r2 = r6.f22977OooO00o
                r2.terminateAndDrain(r1)
                return r0
            L_0x0047:
                if (r4 != 0) goto L_0x004a
                return r0
            L_0x004a:
                java.util.concurrent.atomic.AtomicLong r0 = r6.f22976OooO00o
                r4 = 1
                long r4 = r2 - r4
                boolean r0 = r0.compareAndSet(r2, r4)
                if (r0 == 0) goto L_0x0006
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9435I1IiI.OooO00o.OooO00o():boolean");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public AbstractC9465L1l1 m21472OooO00o() {
            return this.f22977OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.丨I丨1IiI$OooO0O0 */
    public static final class OooO0O0 {
        public static final C9435I1IiI<?> OooO00o = new C9435I1IiI<>();
    }

    public C9435I1IiI() {
        this.f22971OooO00o = null;
        this.f22970OooO00o = null;
        this.OooO00o = C6222ii1l.OooO0O0;
    }

    public static <T> C9435I1IiI<T> OooO00o() {
        return (C9435I1IiI<T>) OooO0O0.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
        OooO00o oooO00o = new OooO00o(r5, this.f22971OooO00o, this.f22970OooO00o, this.OooO00o);
        r5.add(oooO00o);
        r5.setProducer(oooO00o.m21472OooO00o());
        return oooO00o;
    }

    public C9435I1IiI(long j) {
        this(j, null, C6222ii1l.OooO0O0);
    }

    public C9435I1IiI(long j, liii1l r4) {
        this(j, r4, C6222ii1l.OooO0O0);
    }

    public C9435I1IiI(long j, liii1l r6, C6222ii1l.AbstractC6223OooO0Oo oooO0Oo) {
        if (j <= 0) {
            throw new IllegalArgumentException("Buffer capacity must be > 0");
        } else if (oooO0Oo != null) {
            this.f22971OooO00o = Long.valueOf(j);
            this.f22970OooO00o = r6;
            this.OooO00o = oooO0Oo;
        } else {
            throw new NullPointerException("The BackpressureOverflow strategy must not be null");
        }
    }
}
