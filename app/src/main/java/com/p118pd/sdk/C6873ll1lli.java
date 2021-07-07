package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.internal.operators.NotificationLite;
import p293rx.internal.util.ExceptionsUtils;
import p293rx.internal.util.ScalarSynchronousObservable;

/* renamed from: com.pd.sdk.l丨l1l丨li  reason: invalid class name and case insensitive filesystem */
public final class C6873ll1lli<T, R> implements C9349III.OooO00o<R> {
    public static final int o0OOO0o = 2;
    public static final int o0ooOOo = 0;
    public static final int o0ooOoO = 1;
    public final C9349III<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends C9349III<? extends R>> f18953OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: com.pd.sdk.l丨l1l丨li$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ C6874OooO0Oo OooO00o;

        public OooO00o(C6874OooO0Oo oooO0Oo) {
            this.OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO0O0(j);
        }
    }

    /* renamed from: com.pd.sdk.l丨l1l丨li$OooO0O0 */
    public static final class OooO0O0<T, R> implements AbstractC9465L1l1 {
        public final C6874OooO0Oo<T, R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final R f18955OooO00o;
        public boolean OooO0O0;

        public OooO0O0(R r, C6874OooO0Oo<T, R> oooO0Oo) {
            this.f18955OooO00o = r;
            this.OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (!this.OooO0O0 && j > 0) {
                this.OooO0O0 = true;
                C6874OooO0Oo<T, R> oooO0Oo = this.OooO00o;
                oooO0Oo.OooO00o(this.f18955OooO00o);
                oooO0Oo.OooO00o(1);
            }
        }
    }

    /* renamed from: com.pd.sdk.l丨l1l丨li$OooO0OO */
    public static final class OooO0OO<T, R> extends AbstractC9508LiLi<R> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6874OooO0Oo<T, R> f18956OooO00o;

        public OooO0OO(C6874OooO0Oo<T, R> oooO0Oo) {
            this.f18956OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18956OooO00o.OooO00o(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18956OooO00o.OooO00o(th, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(R r) {
            this.OooO00o++;
            this.f18956OooO00o.OooO00o(r);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f18956OooO00o.f18958OooO00o.OooO00o(r2);
        }
    }

    /* renamed from: com.pd.sdk.l丨l1l丨li$OooO0Oo  reason: case insensitive filesystem */
    public static final class C6874OooO0Oo<T, R> extends AbstractC9508LiLi<T> {
        public final iLIiLILI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f18957OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f18958OooO00o = new C9577i1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends C9349III<? extends R>> f18959OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f18960OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f18961OooO00o = new AtomicInteger();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Throwable> f18962OooO00o = new AtomicReference<>();
        public volatile boolean OooO0O0;
        public volatile boolean OooO0OO;
        public final int o00oO0O;

        public C6874OooO0Oo(AbstractC9508LiLi<? super R> r1, AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r2, int i, int i2) {
            Queue<Object> queue;
            this.f18957OooO00o = r1;
            this.f18959OooO00o = r2;
            this.o00oO0O = i2;
            if (C11LI1.OooO00o()) {
                queue = new iI1L1i<>(i);
            } else {
                queue = new i1Il1LL<>(i);
            }
            this.f18960OooO00o = queue;
            this.OooO00o = new iLIiLILI();
            request((long) i);
        }

        public void OooO00o(R r) {
            this.f18957OooO00o.onNext(r);
        }

        public void OooO0O0(long j) {
            if (j > 0) {
                this.f18958OooO00o.request(j);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            }
        }

        public void OooO0OO(Throwable th) {
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0O0 = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (ExceptionsUtils.addThrowable(this.f18962OooO00o, th)) {
                this.OooO0O0 = true;
                if (this.o00oO0O == 0) {
                    Throwable terminate = ExceptionsUtils.terminate(this.f18962OooO00o);
                    if (!ExceptionsUtils.isTerminated(terminate)) {
                        this.f18957OooO00o.onError(terminate);
                    }
                    this.OooO00o.unsubscribe();
                    return;
                }
                OooO0OO();
                return;
            }
            OooO0OO(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.f18960OooO00o.offer(NotificationLite.OooO0O0((Object) t))) {
                unsubscribe();
                onError(new MissingBackpressureException());
                return;
            }
            OooO0OO();
        }

        public void OooO00o(Throwable th, long j) {
            if (!ExceptionsUtils.addThrowable(this.f18962OooO00o, th)) {
                OooO0OO(th);
            } else if (this.o00oO0O == 0) {
                Throwable terminate = ExceptionsUtils.terminate(this.f18962OooO00o);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f18957OooO00o.onError(terminate);
                }
                unsubscribe();
            } else {
                if (j != 0) {
                    this.f18958OooO00o.OooO00o(j);
                }
                this.OooO0OO = false;
                OooO0OO();
            }
        }

        public void OooO0OO() {
            if (this.f18961OooO00o.getAndIncrement() == 0) {
                int i = this.o00oO0O;
                while (!this.f18957OooO00o.isUnsubscribed()) {
                    if (!this.OooO0OO) {
                        if (i != 1 || this.f18962OooO00o.get() == null) {
                            boolean z = this.OooO0O0;
                            Object poll = this.f18960OooO00o.poll();
                            boolean z2 = poll == null;
                            if (z && z2) {
                                Throwable terminate = ExceptionsUtils.terminate(this.f18962OooO00o);
                                if (terminate == null) {
                                    this.f18957OooO00o.onCompleted();
                                    return;
                                } else if (!ExceptionsUtils.isTerminated(terminate)) {
                                    this.f18957OooO00o.onError(terminate);
                                    return;
                                } else {
                                    return;
                                }
                            } else if (!z2) {
                                try {
                                    C9349III r2 = (C9349III) this.f18959OooO00o.call((Object) NotificationLite.OooO00o(poll));
                                    if (r2 == null) {
                                        OooO0O0(new NullPointerException("The source returned by the mapper was null"));
                                        return;
                                    } else if (r2 != C9349III.OooOoo0()) {
                                        if (r2 instanceof ScalarSynchronousObservable) {
                                            this.OooO0OO = true;
                                            this.f18958OooO00o.OooO00o(new OooO0O0(((ScalarSynchronousObservable) r2).OooO00o(), this));
                                        } else {
                                            OooO0OO oooO0OO = new OooO0OO(this);
                                            this.OooO00o.OooO00o(oooO0OO);
                                            if (!oooO0OO.isUnsubscribed()) {
                                                this.OooO0OO = true;
                                                r2.OooO0O0((AbstractC9508LiLi) oooO0OO);
                                            } else {
                                                return;
                                            }
                                        }
                                        request(1);
                                    } else {
                                        request(1);
                                    }
                                } catch (Throwable th) {
                                    IIl11.m15447OooO00o(th);
                                    OooO0O0(th);
                                    return;
                                }
                            }
                        } else {
                            Throwable terminate2 = ExceptionsUtils.terminate(this.f18962OooO00o);
                            if (!ExceptionsUtils.isTerminated(terminate2)) {
                                this.f18957OooO00o.onError(terminate2);
                                return;
                            }
                            return;
                        }
                    }
                    if (this.f18961OooO00o.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        public void OooO0O0(Throwable th) {
            unsubscribe();
            if (ExceptionsUtils.addThrowable(this.f18962OooO00o, th)) {
                Throwable terminate = ExceptionsUtils.terminate(this.f18962OooO00o);
                if (!ExceptionsUtils.isTerminated(terminate)) {
                    this.f18957OooO00o.onError(terminate);
                    return;
                }
                return;
            }
            OooO0OO(th);
        }

        public void OooO00o(long j) {
            if (j != 0) {
                this.f18958OooO00o.OooO00o(j);
            }
            this.OooO0OO = false;
            OooO0OO();
        }
    }

    public C6873ll1lli(C9349III<? extends T> r1, AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r2, int i, int i2) {
        this.OooO00o = r1;
        this.f18953OooO00o = r2;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r6) {
        C6874OooO0Oo oooO0Oo = new C6874OooO0Oo(this.o0ooOO0 == 0 ? new IL11lL<>(r6) : r6, this.f18953OooO00o, this.o00oO0O, this.o0ooOO0);
        r6.add(oooO0Oo);
        r6.add(oooO0Oo.OooO00o);
        r6.setProducer(new OooO00o(oooO0Oo));
        if (!r6.isUnsubscribed()) {
            this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0Oo);
        }
    }
}
