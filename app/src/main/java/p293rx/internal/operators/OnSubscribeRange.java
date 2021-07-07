package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.OnSubscribeRange */
public final class OnSubscribeRange implements C9349III.OooO00o<Integer> {
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: rx.internal.operators.OnSubscribeRange$RangeProducer */
    public static final class RangeProducer extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = 4114392207069098388L;
        public final AbstractC9508LiLi<? super Integer> childSubscriber;
        public long currentIndex;
        public final int endOfRange;

        public RangeProducer(AbstractC9508LiLi<? super Integer> r1, int i, int i2) {
            this.childSubscriber = r1;
            this.currentIndex = (long) i;
            this.endOfRange = i2;
        }

        public void fastPath() {
            long j = ((long) this.endOfRange) + 1;
            AbstractC9508LiLi<? super Integer> r4 = this.childSubscriber;
            for (long j2 = this.currentIndex; j2 != j; j2++) {
                if (!r4.isUnsubscribed()) {
                    r4.onNext(Integer.valueOf((int) j2));
                } else {
                    return;
                }
            }
            if (!r4.isUnsubscribed()) {
                r4.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (get() != Long.MAX_VALUE) {
                if (j == Long.MAX_VALUE && compareAndSet(0, Long.MAX_VALUE)) {
                    fastPath();
                } else if (j > 0 && C6211iLli.OooO00o(this, j) == 0) {
                    slowPath(j);
                }
            }
        }

        public void slowPath(long j) {
            long j2 = ((long) this.endOfRange) + 1;
            long j3 = this.currentIndex;
            AbstractC9508LiLi<? super Integer> r6 = this.childSubscriber;
            do {
                long j4 = 0;
                while (true) {
                    if (j4 == j || j3 == j2) {
                        if (!r6.isUnsubscribed()) {
                            if (j3 == j2) {
                                r6.onCompleted();
                                return;
                            }
                            j = get();
                            if (j == j4) {
                                this.currentIndex = j3;
                                j = addAndGet(-j4);
                            }
                        } else {
                            return;
                        }
                    } else if (!r6.isUnsubscribed()) {
                        r6.onNext(Integer.valueOf((int) j3));
                        j3++;
                        j4++;
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public OnSubscribeRange(int i, int i2) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super Integer> r4) {
        r4.setProducer(new RangeProducer(r4, this.o00oO0O, this.o0ooOO0));
    }
}
