package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.OnSubscribeFromArray */
public final class OnSubscribeFromArray<T> implements C9349III.OooO00o<T> {
    public final T[] OooO00o;

    /* renamed from: rx.internal.operators.OnSubscribeFromArray$FromArrayProducer */
    public static final class FromArrayProducer<T> extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = 3534218984725836979L;
        public final T[] array;
        public final AbstractC9508LiLi<? super T> child;
        public int index;

        public FromArrayProducer(AbstractC9508LiLi<? super T> r1, T[] tArr) {
            this.child = r1;
            this.array = tArr;
        }

        public void fastPath() {
            AbstractC9508LiLi<? super T> r0 = this.child;
            T[] tArr = this.array;
            for (T t : tArr) {
                if (!r0.isUnsubscribed()) {
                    r0.onNext(t);
                } else {
                    return;
                }
            }
            if (!r0.isUnsubscribed()) {
                r0.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j == Long.MAX_VALUE) {
                if (C6211iLli.OooO00o(this, j) == 0) {
                    fastPath();
                }
            } else if (j != 0 && C6211iLli.OooO00o(this, j) == 0) {
                slowPath(j);
            }
        }

        public void slowPath(long j) {
            AbstractC9508LiLi<? super T> r0 = this.child;
            T[] tArr = this.array;
            int length = tArr.length;
            int i = this.index;
            do {
                long j2 = 0;
                while (true) {
                    if (j == 0 || i == length) {
                        j = get() + j2;
                        if (j == 0) {
                            this.index = i;
                            j = addAndGet(j2);
                        }
                    } else if (!r0.isUnsubscribed()) {
                        r0.onNext(tArr[i]);
                        i++;
                        if (i != length) {
                            j--;
                            j2--;
                        } else if (!r0.isUnsubscribed()) {
                            r0.onCompleted();
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public OnSubscribeFromArray(T[] tArr) {
        this.OooO00o = tArr;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        r3.setProducer(new FromArrayProducer(r3, this.OooO00o));
    }
}
