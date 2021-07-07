package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.operators.OnSubscribeDetach */
public final class OnSubscribeDetach<T> implements C9349III.OooO00o<T> {
    public final C9349III<T> OooO00o;

    /* renamed from: rx.internal.operators.OnSubscribeDetach$OooO00o */
    public static final class OooO00o<T> implements AbstractC9465L1l1, LlIiLii {
        public final OooO0O0<T> OooO00o;

        public OooO00o(OooO0O0<T> oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.OooO00o.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.OooO00o.OooO0OO();
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public final AtomicLong OooO00o = new AtomicLong();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<AbstractC9508LiLi<? super T>> f24039OooO00o;
        public final AtomicReference<AbstractC9465L1l1> OooO0O0 = new AtomicReference<>();

        public OooO0O0(AbstractC9508LiLi<? super T> r2) {
            this.f24039OooO00o = new AtomicReference<>(r2);
        }

        public void OooO00o(long j) {
            if (j >= 0) {
                AbstractC9465L1l1 r2 = this.OooO0O0.get();
                if (r2 != null) {
                    r2.request(j);
                    return;
                }
                C6211iLli.OooO00o(this.OooO00o, j);
                AbstractC9465L1l1 r4 = this.OooO0O0.get();
                if (r4 != null && r4 != TerminatedProducer.INSTANCE) {
                    r4.request(this.OooO00o.getAndSet(0));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        public void OooO0OO() {
            this.OooO0O0.lazySet(TerminatedProducer.INSTANCE);
            this.f24039OooO00o.lazySet(null);
            unsubscribe();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0O0.lazySet(TerminatedProducer.INSTANCE);
            AbstractC9508LiLi<? super T> andSet = this.f24039OooO00o.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO0O0.lazySet(TerminatedProducer.INSTANCE);
            AbstractC9508LiLi<? super T> andSet = this.f24039OooO00o.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            AbstractC9508LiLi<? super T> r0 = this.f24039OooO00o.get();
            if (r0 != null) {
                r0.onNext(t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r4) {
            if (this.OooO0O0.compareAndSet(null, r4)) {
                r4.request(this.OooO00o.getAndSet(0));
            } else if (this.OooO0O0.get() != TerminatedProducer.INSTANCE) {
                throw new IllegalStateException("Producer already set!");
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeDetach$TerminatedProducer */
    public enum TerminatedProducer implements AbstractC9465L1l1 {
        INSTANCE;

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
        }
    }

    public OnSubscribeDetach(C9349III<T> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3);
        OooO00o oooO00o = new OooO00o(oooO0O0);
        r3.add(oooO00o);
        r3.setProducer(oooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi) oooO0O0);
    }
}
