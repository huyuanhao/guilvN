package p293rx.internal.util;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C6695lilIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.lI1iil;
import com.p118pd.sdk.liii1l;
import java.util.concurrent.atomic.AtomicBoolean;
import p293rx.internal.producers.SingleProducer;

/* renamed from: rx.internal.util.ScalarSynchronousObservable */
public final class ScalarSynchronousObservable<T> extends C9349III<T> {
    public static final boolean OooO00o = Boolean.valueOf(System.getProperty("rx.just.strong-mode", "false")).booleanValue();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final T f24166OooO00o;

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO00o */
    public class OooO00o implements AbstractC9847l1<liii1l, LlIiLii> {
        public final /* synthetic */ lI1iil OooO00o;

        public OooO00o(lI1iil r2) {
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public LlIiLii call(liii1l r2) {
            return this.OooO00o.OooO00o(r2);
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0O0 */
    public class OooO0O0 implements AbstractC9847l1<liii1l, LlIiLii> {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {
            public final /* synthetic */ LL1LL.OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ liii1l f24169OooO00o;

            public OooO00o(liii1l r2, LL1LL.OooO00o oooO00o) {
                this.f24169OooO00o = r2;
                this.OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                try {
                    this.f24169OooO00o.call();
                } finally {
                    this.OooO00o.unsubscribe();
                }
            }
        }

        public OooO0O0(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public LlIiLii call(liii1l r3) {
            LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
            OooO00o2.OooO00o(new OooO00o(r3, OooO00o2));
            return OooO00o2;
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0OO */
    public class OooO0OO implements C9349III.OooO00o<R> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        public OooO0OO(AbstractC9847l1 r2) {
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r3) {
            C9349III r0 = (C9349III) this.OooO00o.call(ScalarSynchronousObservable.this.f24166OooO00o);
            if (r0 instanceof ScalarSynchronousObservable) {
                r3.setProducer(ScalarSynchronousObservable.OooO00o((AbstractC9508LiLi) r3, (Object) ((ScalarSynchronousObservable) r0).f24166OooO00o));
            } else {
                r0.OooO0O0((AbstractC9508LiLi) C6695lilIl.OooO00o((AbstractC9508LiLi) r3));
            }
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9975OooO0Oo<T> implements C9349III.OooO00o<T> {
        public final T OooO00o;

        public C9975OooO0Oo(T t) {
            this.OooO00o = t;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r2) {
            r2.setProducer(ScalarSynchronousObservable.OooO00o((AbstractC9508LiLi) r2, (Object) this.OooO00o));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0o */
    public static final class OooO0o<T> implements AbstractC9465L1l1 {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f24172OooO00o;
        public boolean OooO0O0;

        public OooO0o(AbstractC9508LiLi<? super T> r1, T t) {
            this.OooO00o = r1;
            this.f24172OooO00o = t;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (!this.OooO0O0) {
                if (j < 0) {
                    throw new IllegalStateException("n >= required but it was " + j);
                } else if (j != 0) {
                    this.OooO0O0 = true;
                    AbstractC9508LiLi<? super T> r4 = this.OooO00o;
                    if (!r4.isUnsubscribed()) {
                        T t = this.f24172OooO00o;
                        try {
                            r4.onNext(t);
                            if (!r4.isUnsubscribed()) {
                                r4.onCompleted();
                            }
                        } catch (Throwable th) {
                            IIl11.OooO00o(th, r4, t);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$OooO0o0  reason: case insensitive filesystem */
    public static final class C9976OooO0o0<T> implements C9349III.OooO00o<T> {
        public final AbstractC9847l1<liii1l, LlIiLii> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final T f24173OooO00o;

        public C9976OooO0o0(T t, AbstractC9847l1<liii1l, LlIiLii> r2) {
            this.f24173OooO00o = t;
            this.OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r4) {
            r4.setProducer(new ScalarAsyncProducer(r4, this.f24173OooO00o, this.OooO00o));
        }
    }

    /* renamed from: rx.internal.util.ScalarSynchronousObservable$ScalarAsyncProducer */
    public static final class ScalarAsyncProducer<T> extends AtomicBoolean implements AbstractC9465L1l1, liii1l {
        public static final long serialVersionUID = -2466317989629281651L;
        public final AbstractC9508LiLi<? super T> actual;
        public final AbstractC9847l1<liii1l, LlIiLii> onSchedule;
        public final T value;

        public ScalarAsyncProducer(AbstractC9508LiLi<? super T> r1, T t, AbstractC9847l1<liii1l, LlIiLii> r3) {
            this.actual = r1;
            this.value = t;
            this.onSchedule = r3;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            AbstractC9508LiLi<? super T> r0 = this.actual;
            if (!r0.isUnsubscribed()) {
                T t = this.value;
                try {
                    r0.onNext(t);
                    if (!r0.isUnsubscribed()) {
                        r0.onCompleted();
                    }
                } catch (Throwable th) {
                    IIl11.OooO00o(th, r0, t);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0 && compareAndSet(false, true)) {
                this.actual.add(this.onSchedule.call(this));
            }
        }

        public String toString() {
            return "ScalarAsyncProducer[" + ((Object) this.value) + ", " + get() + "]";
        }
    }

    public ScalarSynchronousObservable(T t) {
        super(C9714lli.OooO00o((C9349III.OooO00o) new C9975OooO0Oo(t)));
        this.f24166OooO00o = t;
    }

    public static <T> AbstractC9465L1l1 OooO00o(AbstractC9508LiLi<? super T> r1, T t) {
        if (OooO00o) {
            return new SingleProducer(r1, t);
        }
        return new OooO0o(r1, t);
    }

    public C9349III<T> OooO0oO(LL1LL ll1ll) {
        AbstractC9847l1 r0;
        if (ll1ll instanceof lI1iil) {
            r0 = new OooO00o((lI1iil) ll1ll);
        } else {
            r0 = new OooO0O0(ll1ll);
        }
        return C9349III.OooO0O0((C9349III.OooO00o) new C9976OooO0o0(this.f24166OooO00o, r0));
    }

    public <R> C9349III<R> Oooo0O0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r2) {
        return C9349III.OooO0O0((C9349III.OooO00o) new OooO0OO(r2));
    }

    public static <T> ScalarSynchronousObservable<T> OooO00o(T t) {
        return new ScalarSynchronousObservable<>(t);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public T OooO00o() {
        return this.f24166OooO00o;
    }
}
