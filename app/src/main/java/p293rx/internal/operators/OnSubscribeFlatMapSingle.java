package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC93021L;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C5243IIlL;
import com.p118pd.sdk.C6049i1lii;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.LLil11;
import com.p118pd.sdk.LlIiLii;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.util.ExceptionsUtils;

/* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle */
public final class OnSubscribeFlatMapSingle<T, R> implements C9349III.OooO00o<R> {
    public final C9349III<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends LLil11<? extends R>> f24045OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    public OnSubscribeFlatMapSingle(C9349III<T> r1, AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2, boolean z, int i) {
        if (r2 == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.OooO00o = r1;
            this.f24045OooO00o = r2;
            this.OooO0O0 = z;
            this.o00oO0O = i;
        } else {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r5) {
        FlatMapSingleSubscriber flatMapSingleSubscriber = new FlatMapSingleSubscriber(r5, this.f24045OooO00o, this.OooO0O0, this.o00oO0O);
        r5.add(flatMapSingleSubscriber.OooO00o);
        r5.add(flatMapSingleSubscriber.f24051OooO00o);
        r5.setProducer(flatMapSingleSubscriber.f24051OooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) flatMapSingleSubscriber);
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber */
    public static final class FlatMapSingleSubscriber<T, R> extends AbstractC9508LiLi<T> {
        public final IIlIIiI1 OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super R> f24046OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends LLil11<? extends R>> f24047OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f24048OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24049OooO00o = new AtomicInteger();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Throwable> f24050OooO00o = new AtomicReference<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final FlatMapSingleSubscriber<T, R>.Requested f24051OooO00o = new Requested();
        public final AtomicInteger OooO0O0 = new AtomicInteger();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f24052OooO0O0;
        public volatile boolean OooO0OO;
        public volatile boolean OooO0Oo;
        public final int o00oO0O;

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber$OooO00o */
        public final class OooO00o extends AbstractC93021L<R> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(R r) {
                FlatMapSingleSubscriber.this.OooO00o((FlatMapSingleSubscriber<T, R>.OooO00o) this, (Object) r);
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                FlatMapSingleSubscriber.this.OooO00o((FlatMapSingleSubscriber<T, R>.OooO00o) this, th);
            }
        }

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapSingle$FlatMapSingleSubscriber$Requested */
        public final class Requested extends AtomicLong implements AbstractC9465L1l1, LlIiLii {
            public static final long serialVersionUID = -887187595446742742L;

            public Requested() {
            }

            @Override // com.p118pd.sdk.LlIiLii
            public boolean isUnsubscribed() {
                return FlatMapSingleSubscriber.this.OooO0Oo;
            }

            public void produced(long j) {
                C6211iLli.OooO0O0(this, j);
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j > 0) {
                    C6211iLli.OooO00o(this, j);
                    FlatMapSingleSubscriber.this.OooO0OO();
                }
            }

            @Override // com.p118pd.sdk.LlIiLii
            public void unsubscribe() {
                FlatMapSingleSubscriber.this.OooO0Oo = true;
                FlatMapSingleSubscriber.this.unsubscribe();
                if (FlatMapSingleSubscriber.this.f24049OooO00o.getAndIncrement() == 0) {
                    FlatMapSingleSubscriber.this.f24048OooO00o.clear();
                }
            }
        }

        public FlatMapSingleSubscriber(AbstractC9508LiLi<? super R> r1, AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2, boolean z, int i) {
            this.f24046OooO00o = r1;
            this.f24047OooO00o = r2;
            this.f24052OooO0O0 = z;
            this.o00oO0O = i;
            if (C11LI1.OooO00o()) {
                this.f24048OooO00o = new C5243IIlL();
            } else {
                this.f24048OooO00o = new C6049i1lii();
            }
            request(i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE);
        }

        public void OooO00o(FlatMapSingleSubscriber<T, R>.OooO00o oooO00o, R r) {
            this.f24048OooO00o.offer(NotificationLite.OooO0O0((Object) r));
            this.OooO00o.OooO0O0(oooO00o);
            this.OooO0O0.decrementAndGet();
            OooO0OO();
        }

        public void OooO0OO() {
            if (this.f24049OooO00o.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super R> r0 = this.f24046OooO00o;
                Queue<Object> queue = this.f24048OooO00o;
                boolean z = this.f24052OooO0O0;
                AtomicInteger atomicInteger = this.OooO0O0;
                int i = 1;
                do {
                    long j = this.f24051OooO00o.get();
                    long j2 = 0;
                    while (j2 != j) {
                        if (this.OooO0Oo) {
                            queue.clear();
                            return;
                        }
                        boolean z2 = this.OooO0OO;
                        if (z || !z2 || this.f24050OooO00o.get() == null) {
                            Object poll = queue.poll();
                            boolean z3 = poll == null;
                            if (!z2 || atomicInteger.get() != 0 || !z3) {
                                if (z3) {
                                    break;
                                }
                                r0.onNext((Object) NotificationLite.OooO00o(poll));
                                j2++;
                            } else if (this.f24050OooO00o.get() != null) {
                                r0.onError(ExceptionsUtils.terminate(this.f24050OooO00o));
                                return;
                            } else {
                                r0.onCompleted();
                                return;
                            }
                        } else {
                            queue.clear();
                            r0.onError(ExceptionsUtils.terminate(this.f24050OooO00o));
                            return;
                        }
                    }
                    if (j2 == j) {
                        if (this.OooO0Oo) {
                            queue.clear();
                            return;
                        } else if (this.OooO0OO) {
                            if (z) {
                                if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                    if (this.f24050OooO00o.get() != null) {
                                        r0.onError(ExceptionsUtils.terminate(this.f24050OooO00o));
                                        return;
                                    } else {
                                        r0.onCompleted();
                                        return;
                                    }
                                }
                            } else if (this.f24050OooO00o.get() != null) {
                                queue.clear();
                                r0.onError(ExceptionsUtils.terminate(this.f24050OooO00o));
                                return;
                            } else if (atomicInteger.get() == 0 && queue.isEmpty()) {
                                r0.onCompleted();
                                return;
                            }
                        }
                    }
                    if (j2 != 0) {
                        this.f24051OooO00o.produced(j2);
                        if (!this.OooO0OO && this.o00oO0O != Integer.MAX_VALUE) {
                            request(j2);
                        }
                    }
                    i = this.f24049OooO00o.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0OO = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.f24052OooO0O0) {
                ExceptionsUtils.addThrowable(this.f24050OooO00o, th);
            } else {
                this.OooO00o.unsubscribe();
                if (!this.f24050OooO00o.compareAndSet(null, th)) {
                    C9714lli.m21756OooO00o(th);
                    return;
                }
            }
            this.OooO0OO = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                LLil11 r3 = (LLil11) this.f24047OooO00o.call(t);
                if (r3 != null) {
                    OooO00o oooO00o = new OooO00o();
                    this.OooO00o.OooO00o(oooO00o);
                    this.OooO0O0.incrementAndGet();
                    r3.OooO00o((AbstractC93021L) oooO00o);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Single");
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(th);
            }
        }

        public void OooO00o(FlatMapSingleSubscriber<T, R>.OooO00o oooO00o, Throwable th) {
            if (this.f24052OooO0O0) {
                ExceptionsUtils.addThrowable(this.f24050OooO00o, th);
                this.OooO00o.OooO0O0(oooO00o);
                if (!this.OooO0OO && this.o00oO0O != Integer.MAX_VALUE) {
                    request(1);
                }
            } else {
                this.OooO00o.unsubscribe();
                unsubscribe();
                if (!this.f24050OooO00o.compareAndSet(null, th)) {
                    C9714lli.m21756OooO00o(th);
                    return;
                }
                this.OooO0OO = true;
            }
            this.OooO0O0.decrementAndGet();
            OooO0OO();
        }
    }
}
