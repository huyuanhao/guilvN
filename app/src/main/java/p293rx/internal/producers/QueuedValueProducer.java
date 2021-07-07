package p293rx.internal.producers;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C5306ILi1;
import com.p118pd.sdk.C6089iIIiLL;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.IIl11;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.producers.QueuedValueProducer */
public final class QueuedValueProducer<T> extends AtomicLong implements AbstractC9465L1l1 {
    public static final Object NULL_SENTINEL = new Object();
    public static final long serialVersionUID = 7277121710709137047L;
    public final AbstractC9508LiLi<? super T> child;
    public final Queue<Object> queue;
    public final AtomicInteger wip;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QueuedValueProducer(AbstractC9508LiLi<? super T> r2) {
        this(r2, C11LI1.OooO00o() ? new C5306ILi1() : new C6089iIIiLL());
    }

    private void OooO00o() {
        Object poll;
        if (this.wip.getAndIncrement() == 0) {
            AbstractC9508LiLi<? super T> r0 = this.child;
            Queue<Object> queue2 = this.queue;
            while (!r0.isUnsubscribed()) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0 && (poll = queue2.poll()) != null) {
                    try {
                        if (poll == NULL_SENTINEL) {
                            r0.onNext(null);
                        } else {
                            r0.onNext(poll);
                        }
                        if (!r0.isUnsubscribed()) {
                            j--;
                            j2++;
                        } else {
                            return;
                        }
                    } catch (Throwable th) {
                        if (poll == NULL_SENTINEL) {
                            poll = null;
                        }
                        IIl11.OooO00o(th, r0, poll);
                        return;
                    }
                }
                if (!(j2 == 0 || get() == Long.MAX_VALUE)) {
                    addAndGet(-j2);
                }
                if (this.wip.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public boolean offer(T t) {
        if (t == null) {
            if (!this.queue.offer(NULL_SENTINEL)) {
                return false;
            }
        } else if (!this.queue.offer(t)) {
            return false;
        }
        OooO00o();
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC9465L1l1
    public void request(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("n >= 0 required");
        } else if (j > 0) {
            C6211iLli.OooO00o(this, j);
            OooO00o();
        }
    }

    public QueuedValueProducer(AbstractC9508LiLi<? super T> r1, Queue<Object> queue2) {
        this.child = r1;
        this.queue = queue2;
        this.wip = new AtomicInteger();
    }
}
