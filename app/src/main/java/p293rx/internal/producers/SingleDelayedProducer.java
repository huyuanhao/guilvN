package p293rx.internal.producers;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.IIl11;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: rx.internal.producers.SingleDelayedProducer */
public final class SingleDelayedProducer<T> extends AtomicInteger implements AbstractC9465L1l1 {
    public static final int HAS_REQUEST_HAS_VALUE = 3;
    public static final int HAS_REQUEST_NO_VALUE = 2;
    public static final int NO_REQUEST_HAS_VALUE = 1;
    public static final int NO_REQUEST_NO_VALUE = 0;
    public static final long serialVersionUID = -2873467947112093874L;
    public final AbstractC9508LiLi<? super T> child;
    public T value;

    public SingleDelayedProducer(AbstractC9508LiLi<? super T> r1) {
        this.child = r1;
    }

    public static <T> void OooO00o(AbstractC9508LiLi<? super T> r1, T t) {
        if (!r1.isUnsubscribed()) {
            try {
                r1.onNext(t);
                if (!r1.isUnsubscribed()) {
                    r1.onCompleted();
                }
            } catch (Throwable th) {
                IIl11.OooO00o(th, r1, t);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC9465L1l1
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j != 0) {
            do {
                int i = get();
                if (i != 0) {
                    if (i == 1 && compareAndSet(1, 3)) {
                        OooO00o(this.child, this.value);
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    public void setValue(T t) {
        do {
            int i = get();
            if (i == 0) {
                this.value = t;
            } else if (i == 2 && compareAndSet(2, 3)) {
                OooO00o(this.child, t);
                return;
            } else {
                return;
            }
        } while (!compareAndSet(0, 1));
    }
}
