package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.lL11  reason: case insensitive filesystem */
public final class C6543lL11<T> implements C9349III.OooO0O0<T, T> {
    public final LL1LL OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.lL11$OooO00o */
    public static class OooO00o implements C9349III.OooO0O0<T, T> {
        public final /* synthetic */ int o00oO0O;

        public OooO00o(int i) {
            this.o00oO0O = i;
        }

        /* renamed from: OooO00o */
        public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
            OooO0O0 oooO0O0 = new OooO0O0(C6261iii1I1.OooO0O0(), r5, false, this.o00oO0O);
            oooO0O0.OooO0OO();
            return oooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.lL11$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> implements liii1l {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f18425OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f18426OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f18427OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f18428OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f18429OooO00o = new AtomicLong();
        public final AtomicLong OooO0O0 = new AtomicLong();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f18430OooO0O0;
        public volatile boolean OooO0OO;
        public final int o00oO0O;

        /* renamed from: com.pd.sdk.lL11$OooO0O0$OooO00o */
        public class OooO00o implements AbstractC9465L1l1 {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j > 0) {
                    C6211iLli.OooO00o(OooO0O0.this.f18429OooO00o, j);
                    OooO0O0.this.OooO0Oo();
                }
            }
        }

        public OooO0O0(LL1LL ll1ll, AbstractC9508LiLi<? super T> r3, boolean z, int i) {
            this.f18426OooO00o = r3;
            this.f18425OooO00o = ll1ll.m16172OooO00o();
            this.f18430OooO0O0 = z;
            i = i <= 0 ? ll1i1l.o0ooOO0 : i;
            this.o00oO0O = i - (i >> 2);
            if (C11LI1.OooO00o()) {
                this.f18428OooO00o = new iI1L1i(i);
            } else {
                this.f18428OooO00o = new i1Il1LL(i);
            }
            request((long) i);
        }

        public boolean OooO00o(boolean z, boolean z2, AbstractC9508LiLi<? super T> r5, Queue<Object> queue) {
            if (r5.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!this.f18430OooO0O0) {
                    Throwable th = this.f18427OooO00o;
                    if (th != null) {
                        queue.clear();
                        try {
                            r5.onError(th);
                            return true;
                        } finally {
                            this.f18425OooO00o.unsubscribe();
                        }
                    } else if (!z2) {
                        return false;
                    } else {
                        try {
                            r5.onCompleted();
                            return true;
                        } finally {
                            this.f18425OooO00o.unsubscribe();
                        }
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.f18427OooO00o;
                    if (th2 != null) {
                        try {
                            r5.onError(th2);
                        } catch (Throwable th3) {
                            this.f18425OooO00o.unsubscribe();
                            throw th3;
                        }
                    } else {
                        r5.onCompleted();
                    }
                    this.f18425OooO00o.unsubscribe();
                    return false;
                }
            }
        }

        public void OooO0OO() {
            AbstractC9508LiLi<? super T> r0 = this.f18426OooO00o;
            r0.setProducer(new OooO00o());
            r0.add(this.f18425OooO00o);
            r0.add(this);
        }

        public void OooO0Oo() {
            if (this.OooO0O0.getAndIncrement() == 0) {
                this.f18425OooO00o.OooO00o(this);
            }
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            long j = this.OooO00o;
            Queue<Object> queue = this.f18428OooO00o;
            AbstractC9508LiLi<? super T> r3 = this.f18426OooO00o;
            long j2 = 1;
            do {
                long j3 = this.f18429OooO00o.get();
                while (j3 != j) {
                    boolean z = this.OooO0OO;
                    Object poll = queue.poll();
                    boolean z2 = poll == null;
                    if (!OooO00o(z, z2, r3, queue)) {
                        if (z2) {
                            break;
                        }
                        r3.onNext((Object) NotificationLite.OooO00o(poll));
                        j++;
                        if (j == ((long) this.o00oO0O)) {
                            j3 = C6211iLli.OooO0O0(this.f18429OooO00o, j);
                            request(j);
                            j = 0;
                        }
                    } else {
                        return;
                    }
                }
                if (j3 != j || !OooO00o(this.OooO0OO, queue.isEmpty(), r3, queue)) {
                    this.OooO00o = j;
                    j2 = this.OooO0O0.addAndGet(-j2);
                } else {
                    return;
                }
            } while (j2 != 0);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!isUnsubscribed() && !this.OooO0OO) {
                this.OooO0OO = true;
                OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (isUnsubscribed() || this.OooO0OO) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.f18427OooO00o = th;
            this.OooO0OO = true;
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!isUnsubscribed() && !this.OooO0OO) {
                if (!this.f18428OooO00o.offer(NotificationLite.OooO0O0((Object) t))) {
                    onError(new MissingBackpressureException());
                } else {
                    OooO0Oo();
                }
            }
        }
    }

    public C6543lL11(LL1LL ll1ll, boolean z) {
        this(ll1ll, z, ll1i1l.o0ooOO0);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r5) {
        LL1LL ll1ll = this.OooO00o;
        if ((ll1ll instanceof LllL1Ll) || (ll1ll instanceof C5610LI1liI)) {
            return r5;
        }
        OooO0O0 oooO0O0 = new OooO0O0(ll1ll, r5, this.OooO0O0, this.o00oO0O);
        oooO0O0.OooO0OO();
        return oooO0O0;
    }

    public C6543lL11(LL1LL ll1ll, boolean z, int i) {
        this.OooO00o = ll1ll;
        this.OooO0O0 = z;
        this.o00oO0O = i <= 0 ? ll1i1l.o0ooOO0 : i;
    }

    public static <T> C9349III.OooO0O0<T, T> OooO00o(int i) {
        return new OooO00o(i);
    }
}
