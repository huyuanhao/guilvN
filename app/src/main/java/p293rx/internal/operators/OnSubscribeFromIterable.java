package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.OnSubscribeFromIterable */
public final class OnSubscribeFromIterable<T> implements C9349III.OooO00o<T> {
    public final Iterable<? extends T> OooO00o;

    /* renamed from: rx.internal.operators.OnSubscribeFromIterable$IterableProducer */
    public static final class IterableProducer<T> extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = -8730475647105475802L;

        /* renamed from: it */
        public final Iterator<? extends T> f13522it;

        /* renamed from: o */
        public final AbstractC9508LiLi<? super T> f13523o;

        public IterableProducer(AbstractC9508LiLi<? super T> r1, Iterator<? extends T> it) {
            this.f13523o = r1;
            this.f13522it = it;
        }

        public void fastPath() {
            AbstractC9508LiLi<? super T> r0 = this.f13523o;
            Iterator<? extends T> it = this.f13522it;
            while (!r0.isUnsubscribed()) {
                try {
                    r0.onNext((Object) it.next());
                    if (!r0.isUnsubscribed()) {
                        try {
                            if (!it.hasNext()) {
                                if (!r0.isUnsubscribed()) {
                                    r0.onCompleted();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            IIl11.OooO00o(th, r0);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    IIl11.OooO00o(th2, r0);
                    return;
                }
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
            AbstractC9508LiLi<? super T> r0 = this.f13523o;
            Iterator<? extends T> it = this.f13522it;
            do {
                long j2 = 0;
                while (true) {
                    if (j2 == j) {
                        j = get();
                        if (j2 == j) {
                            j = C6211iLli.OooO0O0(this, j2);
                        }
                    } else if (!r0.isUnsubscribed()) {
                        try {
                            r0.onNext((Object) it.next());
                            if (!r0.isUnsubscribed()) {
                                try {
                                    if (it.hasNext()) {
                                        j2++;
                                    } else if (!r0.isUnsubscribed()) {
                                        r0.onCompleted();
                                        return;
                                    } else {
                                        return;
                                    }
                                } catch (Throwable th) {
                                    IIl11.OooO00o(th, r0);
                                    return;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th2) {
                            IIl11.OooO00o(th2, r0);
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } while (j != 0);
        }
    }

    public OnSubscribeFromIterable(Iterable<? extends T> iterable) {
        if (iterable != null) {
            this.OooO00o = iterable;
            return;
        }
        throw new NullPointerException("iterable must not be null");
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r4) {
        try {
            Iterator<? extends T> it = this.OooO00o.iterator();
            boolean hasNext = it.hasNext();
            if (r4.isUnsubscribed()) {
                return;
            }
            if (!hasNext) {
                r4.onCompleted();
            } else {
                r4.setProducer(new IterableProducer(r4, it));
            }
        } catch (Throwable th) {
            IIl11.OooO00o(th, r4);
        }
    }
}
