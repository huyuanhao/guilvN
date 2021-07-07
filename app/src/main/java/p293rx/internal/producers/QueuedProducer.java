package p293rx.internal.producers;

import com.p118pd.sdk.AbstractC5477Il11;
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
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.producers.QueuedProducer */
public final class QueuedProducer<T> extends AtomicLong implements AbstractC9465L1l1, AbstractC5477Il11<T> {
    public static final Object NULL_SENTINEL = new Object();
    public static final long serialVersionUID = 7277121710709137047L;
    public final AbstractC9508LiLi<? super T> child;
    public volatile boolean done;
    public Throwable error;
    public final Queue<Object> queue;
    public final AtomicInteger wip;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public QueuedProducer(AbstractC9508LiLi<? super T> r2) {
        this(r2, C11LI1.OooO00o() ? new C5306ILi1() : new C6089iIIiLL());
    }

    private boolean OooO00o(boolean z, boolean z2) {
        if (this.child.isUnsubscribed()) {
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.error;
        if (th != null) {
            this.queue.clear();
            this.child.onError(th);
            return true;
        } else if (!z2) {
            return false;
        } else {
            this.child.onCompleted();
            return true;
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

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.done = true;
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        if (!offer(t)) {
            onError(new MissingBackpressureException());
        }
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

    public QueuedProducer(AbstractC9508LiLi<? super T> r1, Queue<Object> queue2) {
        this.child = r1;
        this.queue = queue2;
        this.wip = new AtomicInteger();
    }

    private void OooO00o() {
        if (this.wip.getAndIncrement() == 0) {
            AbstractC9508LiLi<? super T> r0 = this.child;
            Queue<Object> queue2 = this.queue;
            while (!OooO00o(this.done, queue2.isEmpty())) {
                this.wip.lazySet(1);
                long j = get();
                long j2 = 0;
                while (j != 0) {
                    boolean z = this.done;
                    Object poll = queue2.poll();
                    if (!OooO00o(z, poll == null)) {
                        if (poll == null) {
                            break;
                        }
                        try {
                            if (poll == NULL_SENTINEL) {
                                r0.onNext(null);
                            } else {
                                r0.onNext(poll);
                            }
                            j--;
                            j2++;
                        } catch (Throwable th) {
                            if (poll == NULL_SENTINEL) {
                                poll = null;
                            }
                            IIl11.OooO00o(th, r0, poll);
                            return;
                        }
                    } else {
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
}
