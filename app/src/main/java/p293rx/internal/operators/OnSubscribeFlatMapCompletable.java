package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6473l1II;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.util.ExceptionsUtils;

/* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable */
public final class OnSubscribeFlatMapCompletable<T> implements C9349III.OooO00o<T> {
    public final C9349III<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super T, ? extends C5876LlIl> f24040OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    public OnSubscribeFlatMapCompletable(C9349III<T> r1, AbstractC9847l1<? super T, ? extends C5876LlIl> r2, boolean z, int i) {
        if (r2 == null) {
            throw new NullPointerException("mapper is null");
        } else if (i > 0) {
            this.OooO00o = r1;
            this.f24040OooO00o = r2;
            this.OooO0O0 = z;
            this.o00oO0O = i;
        } else {
            throw new IllegalArgumentException("maxConcurrency > 0 required but it was " + i);
        }
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r5) {
        FlatMapCompletableSubscriber flatMapCompletableSubscriber = new FlatMapCompletableSubscriber(r5, this.f24040OooO00o, this.OooO0O0, this.o00oO0O);
        r5.add(flatMapCompletableSubscriber);
        r5.add(flatMapCompletableSubscriber.OooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) flatMapCompletableSubscriber);
    }

    /* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$FlatMapCompletableSubscriber */
    public static final class FlatMapCompletableSubscriber<T> extends AbstractC9508LiLi<T> {
        public final IIlIIiI1 OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f24041OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends C5876LlIl> f24042OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24043OooO00o = new AtomicInteger(1);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<Throwable> f24044OooO00o = new AtomicReference<>();
        public final boolean OooO0O0;
        public final int o00oO0O;

        /* renamed from: rx.internal.operators.OnSubscribeFlatMapCompletable$FlatMapCompletableSubscriber$InnerSubscriber */
        public final class InnerSubscriber extends AtomicReference<LlIiLii> implements AbstractC6473l1II, LlIiLii {
            public static final long serialVersionUID = -8588259593722659900L;

            public InnerSubscriber() {
            }

            @Override // com.p118pd.sdk.LlIiLii
            public boolean isUnsubscribed() {
                return get() == this;
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                FlatMapCompletableSubscriber.this.OooO00o(this);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                FlatMapCompletableSubscriber.this.OooO00o(this, th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                if (!compareAndSet(null, llIiLii)) {
                    llIiLii.unsubscribe();
                    if (get() != this) {
                        C9714lli.m21756OooO00o((Throwable) new IllegalStateException("Subscription already set!"));
                    }
                }
            }

            @Override // com.p118pd.sdk.LlIiLii
            public void unsubscribe() {
                LlIiLii llIiLii = (LlIiLii) getAndSet(this);
                if (llIiLii != null && llIiLii != this) {
                    llIiLii.unsubscribe();
                }
            }
        }

        public FlatMapCompletableSubscriber(AbstractC9508LiLi<? super T> r1, AbstractC9847l1<? super T, ? extends C5876LlIl> r2, boolean z, int i) {
            this.f24041OooO00o = r1;
            this.f24042OooO00o = r2;
            this.OooO0O0 = z;
            this.o00oO0O = i;
            request(i != Integer.MAX_VALUE ? (long) i : Long.MAX_VALUE);
        }

        public boolean OooO00o() {
            if (this.f24043OooO00o.decrementAndGet() != 0) {
                return false;
            }
            Throwable terminate = ExceptionsUtils.terminate(this.f24044OooO00o);
            if (terminate != null) {
                this.f24041OooO00o.onError(terminate);
                return true;
            }
            this.f24041OooO00o.onCompleted();
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                ExceptionsUtils.addThrowable(this.f24044OooO00o, th);
                onCompleted();
                return;
            }
            this.OooO00o.unsubscribe();
            if (this.f24044OooO00o.compareAndSet(null, th)) {
                this.f24041OooO00o.onError(ExceptionsUtils.terminate(this.f24044OooO00o));
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                C5876LlIl r3 = (C5876LlIl) this.f24042OooO00o.call(t);
                if (r3 != null) {
                    InnerSubscriber innerSubscriber = new InnerSubscriber();
                    this.OooO00o.OooO00o(innerSubscriber);
                    this.f24043OooO00o.getAndIncrement();
                    r3.OooO0O0(innerSubscriber);
                    return;
                }
                throw new NullPointerException("The mapper returned a null Completable");
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                unsubscribe();
                onError(th);
            }
        }

        public void OooO00o(FlatMapCompletableSubscriber<T>.InnerSubscriber innerSubscriber, Throwable th) {
            this.OooO00o.OooO0O0(innerSubscriber);
            if (this.OooO0O0) {
                ExceptionsUtils.addThrowable(this.f24044OooO00o, th);
                if (!OooO00o() && this.o00oO0O != Integer.MAX_VALUE) {
                    request(1);
                    return;
                }
                return;
            }
            this.OooO00o.unsubscribe();
            unsubscribe();
            if (this.f24044OooO00o.compareAndSet(null, th)) {
                this.f24041OooO00o.onError(ExceptionsUtils.terminate(this.f24044OooO00o));
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        public void OooO00o(FlatMapCompletableSubscriber<T>.InnerSubscriber innerSubscriber) {
            this.OooO00o.OooO0O0(innerSubscriber);
            if (!OooO00o() && this.o00oO0O != Integer.MAX_VALUE) {
                request(1);
            }
        }
    }
}
