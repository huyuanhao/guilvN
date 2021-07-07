package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6473l1II;
import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iLIiLILI;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rx.internal.operators.CompletableOnSubscribeConcatArray */
public final class CompletableOnSubscribeConcatArray implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final C5876LlIl[] OooO00o;

    /* renamed from: rx.internal.operators.CompletableOnSubscribeConcatArray$ConcatInnerSubscriber */
    public static final class ConcatInnerSubscriber extends AtomicInteger implements AbstractC6473l1II {
        public static final long serialVersionUID = -7965400327305809232L;
        public final AbstractC6473l1II actual;
        public int index;

        /* renamed from: sd */
        public final iLIiLILI f13519sd = new iLIiLILI();
        public final C5876LlIl[] sources;

        public ConcatInnerSubscriber(AbstractC6473l1II r1, C5876LlIl[] r2) {
            this.actual = r1;
            this.sources = r2;
        }

        public void next() {
            if (!this.f13519sd.isUnsubscribed() && getAndIncrement() == 0) {
                C5876LlIl[] r0 = this.sources;
                while (!this.f13519sd.isUnsubscribed()) {
                    int i = this.index;
                    this.index = i + 1;
                    if (i == r0.length) {
                        this.actual.onCompleted();
                        return;
                    }
                    r0[i].OooO0O0(this);
                    if (decrementAndGet() == 0) {
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
            this.f13519sd.OooO00o(llIiLii);
        }
    }

    public CompletableOnSubscribeConcatArray(C5876LlIl[] r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r3) {
        ConcatInnerSubscriber concatInnerSubscriber = new ConcatInnerSubscriber(r3, this.OooO00o);
        r3.onSubscribe(concatInnerSubscriber.f13519sd);
        concatInnerSubscriber.next();
    }
}
