package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6473l1II;
import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iLIiLILI;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcatIterable */
public final class CompletableOnSubscribeConcatIterable implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final Iterable<? extends C5876LlIl> OooO00o;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcatIterable$ConcatInnerSubscriber */
    public static final class ConcatInnerSubscriber extends AtomicInteger implements AbstractC6473l1II {
        public static final long serialVersionUID = -7965400327305809232L;
        public final AbstractC6473l1II actual;

        /* renamed from: sd */
        public final iLIiLILI f13520sd = new iLIiLILI();
        public final Iterator<? extends C5876LlIl> sources;

        public ConcatInnerSubscriber(AbstractC6473l1II r1, Iterator<? extends C5876LlIl> it) {
            this.actual = r1;
            this.sources = it;
        }

        public void next() {
            if (!this.f13520sd.isUnsubscribed() && getAndIncrement() == 0) {
                Iterator<? extends C5876LlIl> it = this.sources;
                while (!this.f13520sd.isUnsubscribed()) {
                    try {
                        if (!it.hasNext()) {
                            this.actual.onCompleted();
                            return;
                        }
                        try {
                            C5876LlIl r1 = (C5876LlIl) it.next();
                            if (r1 == null) {
                                this.actual.onError(new NullPointerException("The completable returned is null"));
                                return;
                            }
                            r1.OooO0O0(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th) {
                            this.actual.onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        this.actual.onError(th2);
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            next();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.actual.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.f13520sd.OooO00o(llIiLii);
        }
    }

    public CompletableOnSubscribeConcatIterable(Iterable<? extends C5876LlIl> iterable) {
        this.OooO00o = iterable;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r3) {
        try {
            Iterator<? extends C5876LlIl> it = this.OooO00o.iterator();
            if (it == null) {
                r3.onSubscribe(C9638ill.OooO0O0());
                r3.onError(new NullPointerException("The iterator returned is null"));
                return;
            }
            ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(r3, it);
            r3.onSubscribe(concatInnerSubscriber.f13520sd);
            concatInnerSubscriber.next();
        } catch (Throwable th) {
            r3.onSubscribe(C9638ill.OooO0O0());
            r3.onError(th);
        }
    }
}
