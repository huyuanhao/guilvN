package p293rx.internal.producers;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.IIl11;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: rx.internal.producers.SingleProducer */
public final class SingleProducer<T> extends AtomicBoolean implements AbstractC9465L1l1 {
    public static final long serialVersionUID = -3353584923995471404L;
    public final AbstractC9508LiLi<? super T> child;
    public final T value;

    public SingleProducer(AbstractC9508LiLi<? super T> r1, T t) {
        this.child = r1;
        this.value = t;
    }

    @Override // com.p118pd.sdk.AbstractC9465L1l1
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0 && compareAndSet(false, true)) {
            AbstractC9508LiLi<? super T> r4 = this.child;
            if (!r4.isUnsubscribed()) {
                T t = this.value;
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
