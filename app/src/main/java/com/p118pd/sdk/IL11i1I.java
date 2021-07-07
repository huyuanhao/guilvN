package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.operators.NotificationLite;
import p293rx.internal.operators.OnSubscribeFromIterable;
import p293rx.internal.util.ExceptionsUtils;
import p293rx.internal.util.ScalarSynchronousObservable;

/* renamed from: com.pd.sdk.IL11i1I丨  reason: invalid class name */
public final class IL11i1I<T, R> implements C9349III.OooO00o<R> {
    public final C9349III<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends Iterable<? extends R>> f15532OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.IL11i1I丨$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.IL11i1I丨$OooO0OO */
    public static final class OooO0OO<T, R> implements C9349III.OooO00o<R> {
        public final AbstractC9847l1<? super T, ? extends Iterable<? extends R>> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f15542OooO00o;

        public OooO0OO(T t, AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2) {
            this.f15542OooO00o = t;
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r3) {
            try {
                Iterator<T> it = ((Iterable) this.OooO00o.call(this.f15542OooO00o)).iterator();
                if (!it.hasNext()) {
                    r3.onCompleted();
                } else {
                    r3.setProducer(new OnSubscribeFromIterable.IterableProducer(r3, it));
                }
            } catch (Throwable th) {
                IIl11.OooO00o(th, r3, this.f15542OooO00o);
            }
        }
    }

    public IL11i1I(C9349III<? extends T> r1, AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2, int i) {
        this.OooO00o = r1;
        this.f15532OooO00o = r2;
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r4) {
        OooO0O0 oooO0O0 = new OooO0O0(r4, this.f15532OooO00o, this.o00oO0O);
        r4.add(oooO0O0);
        r4.setProducer(new OooO00o(oooO0O0));
        this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0O0);
    }

    /* renamed from: com.pd.sdk.IL11i1I丨$OooO0O0 */
    public static final class OooO0O0<T, R> extends AbstractC9508LiLi<T> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f15534OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends Iterable<? extends R>> f15535OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Iterator<? extends R> f15536OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f15537OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f15538OooO00o = new AtomicInteger();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f15539OooO00o = new AtomicLong();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Throwable> f15540OooO00o = new AtomicReference<>();
        public long OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public volatile boolean f15541OooO0O0;

        public OooO0O0(AbstractC9508LiLi<? super R> r1, AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2, int i) {
            this.f15534OooO00o = r1;
            this.f15535OooO00o = r2;
            if (i == Integer.MAX_VALUE) {
                this.OooO00o = Long.MAX_VALUE;
                this.f15537OooO00o = new C9818LLl1(ll1i1l.o0ooOO0);
            } else {
                this.OooO00o = (long) (i - (i >> 2));
                if (C11LI1.OooO00o()) {
                    this.f15537OooO00o = new iI1L1i(i);
                } else {
                    this.f15537OooO00o = new i1Il1LL(i);
                }
            }
            request((long) i);
        }

        public void OooO00o(long j) {
            if (j > 0) {
                C6211iLli.OooO00o(this.f15539OooO00o, j);
                OooO0OO();
            } else if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ca, code lost:
            if (r0 != null) goto L_0x00cf;
         */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x00d8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0010 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0OO() {
            /*
            // Method dump skipped, instructions count: 217
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IL11i1I.OooO0O0.OooO0OO():void");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15541OooO0O0 = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (ExceptionsUtils.addThrowable(this.f15540OooO00o, th)) {
                this.f15541OooO0O0 = true;
                OooO0OO();
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.f15537OooO00o.offer(NotificationLite.OooO0O0((Object) t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            OooO0OO();
        }

        public boolean OooO00o(boolean z, boolean z2, AbstractC9508LiLi<?> r6, Queue<?> queue) {
            if (r6.isUnsubscribed()) {
                queue.clear();
                this.f15536OooO00o = null;
                return true;
            } else if (!z) {
                return false;
            } else {
                if (this.f15540OooO00o.get() != null) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f15540OooO00o);
                    unsubscribe();
                    queue.clear();
                    this.f15536OooO00o = null;
                    r6.onError(terminate);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    r6.onCompleted();
                    return true;
                }
            }
        }
    }

    public static <T, R> C9349III<R> OooO00o(C9349III<? extends T> r1, AbstractC9847l1<? super T, ? extends Iterable<? extends R>> r2, int i) {
        if (r1 instanceof ScalarSynchronousObservable) {
            return C9349III.OooO0O0((C9349III.OooO00o) new OooO0OO(((ScalarSynchronousObservable) r1).OooO00o(), r2));
        }
        return C9349III.OooO0O0((C9349III.OooO00o) new IL11i1I(r1, r2, i));
    }
}
