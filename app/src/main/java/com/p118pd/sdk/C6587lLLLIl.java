package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.lLLL丨Il  reason: invalid class name and case insensitive filesystem */
public final class C6587lLLLIl<T, R> implements C9349III.OooO0O0<R, T> {
    public final LiLIll<? extends R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends R> f18505OooO00o;
    public final AbstractC9847l1<? super Throwable, ? extends R> OooO0O0;

    /* renamed from: com.pd.sdk.lLLL丨Il$OooO00o */
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

    /* renamed from: com.pd.sdk.lLLL丨Il$OooO0O0 */
    public static final class OooO0O0<T, R> extends AbstractC9508LiLi<T> {
        public static final long OooO0O0 = Long.MIN_VALUE;
        public static final long OooO0OO = Long.MAX_VALUE;
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LiLIll<? extends R> f18507OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f18508OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends R> f18509OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public R f18510OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f18511OooO00o = new AtomicLong();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<AbstractC9465L1l1> f18512OooO00o = new AtomicReference<>();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final AbstractC9847l1<? super Throwable, ? extends R> f18513OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final AtomicLong f18514OooO0O0 = new AtomicLong();

        public OooO0O0(AbstractC9508LiLi<? super R> r1, AbstractC9847l1<? super T, ? extends R> r2, AbstractC9847l1<? super Throwable, ? extends R> r3, LiLIll<? extends R> r4) {
            this.f18508OooO00o = r1;
            this.f18509OooO00o = r2;
            this.f18513OooO0O0 = r3;
            this.f18507OooO00o = r4;
        }

        public void OooO00o(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0) {
                while (true) {
                    long j2 = this.f18511OooO00o.get();
                    if ((j2 & Long.MIN_VALUE) != 0) {
                        long j3 = Long.MAX_VALUE & j2;
                        if (this.f18511OooO00o.compareAndSet(j2, Long.MIN_VALUE | C6211iLli.OooO00o(j3, j))) {
                            if (j3 == 0) {
                                if (!this.f18508OooO00o.isUnsubscribed()) {
                                    this.f18508OooO00o.onNext(this.f18510OooO00o);
                                }
                                if (!this.f18508OooO00o.isUnsubscribed()) {
                                    this.f18508OooO00o.onCompleted();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        if (this.f18511OooO00o.compareAndSet(j2, C6211iLli.OooO00o(j2, j))) {
                            AtomicReference<AbstractC9465L1l1> atomicReference = this.f18512OooO00o;
                            AbstractC9465L1l1 r3 = atomicReference.get();
                            if (r3 != null) {
                                r3.request(j);
                                return;
                            }
                            C6211iLli.OooO00o(this.f18514OooO0O0, j);
                            AbstractC9465L1l1 r11 = atomicReference.get();
                            if (r11 != null) {
                                long andSet = this.f18514OooO0O0.getAndSet(0);
                                if (andSet != 0) {
                                    r11.request(andSet);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }

        public void OooO0OO() {
            long j = this.OooO00o;
            if (j != 0 && this.f18512OooO00o.get() != null) {
                C6211iLli.OooO0O0(this.f18511OooO00o, j);
            }
        }

        public void OooO0Oo() {
            long j;
            do {
                j = this.f18511OooO00o.get();
                if ((j & Long.MIN_VALUE) != 0) {
                    return;
                }
            } while (!this.f18511OooO00o.compareAndSet(j, Long.MIN_VALUE | j));
            if (j != 0 || this.f18512OooO00o.get() == null) {
                if (!this.f18508OooO00o.isUnsubscribed()) {
                    this.f18508OooO00o.onNext(this.f18510OooO00o);
                }
                if (!this.f18508OooO00o.isUnsubscribed()) {
                    this.f18508OooO00o.onCompleted();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO0OO();
            try {
                this.f18510OooO00o = (R) this.f18507OooO00o.call();
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f18508OooO00o);
            }
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            OooO0OO();
            try {
                this.f18510OooO00o = (R) this.f18513OooO0O0.call(th);
            } catch (Throwable th2) {
                IIl11.OooO00o(th2, this.f18508OooO00o, th);
            }
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                this.OooO00o++;
                this.f18508OooO00o.onNext((Object) this.f18509OooO00o.call(t));
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f18508OooO00o, t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r6) {
            if (this.f18512OooO00o.compareAndSet(null, r6)) {
                long andSet = this.f18514OooO0O0.getAndSet(0);
                if (andSet != 0) {
                    r6.request(andSet);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Producer already set!");
        }
    }

    public C6587lLLLIl(AbstractC9847l1<? super T, ? extends R> r1, AbstractC9847l1<? super Throwable, ? extends R> r2, LiLIll<? extends R> r3) {
        this.f18505OooO00o = r1;
        this.OooO0O0 = r2;
        this.OooO00o = r3;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super R> r5) {
        OooO0O0 oooO0O0 = new OooO0O0(r5, this.f18505OooO00o, this.OooO0O0, this.OooO00o);
        r5.add(oooO0O0);
        r5.setProducer(new OooO00o(oooO0O0));
        return oooO0O0;
    }
}
