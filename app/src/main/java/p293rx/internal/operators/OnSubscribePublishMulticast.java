package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.i1Il1LL;
import com.p118pd.sdk.iI1L1i;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.operators.OnSubscribePublishMulticast */
public final class OnSubscribePublishMulticast<T> extends AtomicInteger implements C9349III.OooO00o<T>, AbstractC5477Il11<T>, LlIiLii {
    public static final PublishProducer<?>[] EMPTY = new PublishProducer[0];
    public static final PublishProducer<?>[] TERMINATED = new PublishProducer[0];
    public static final long serialVersionUID = -3741892510772238743L;
    public final boolean delayError;
    public volatile boolean done;
    public Throwable error;
    public final OooO00o<T> parent;
    public final int prefetch;
    public volatile AbstractC9465L1l1 producer;
    public final Queue<T> queue;
    public volatile PublishProducer<T>[] subscribers;

    /* renamed from: rx.internal.operators.OnSubscribePublishMulticast$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final OnSubscribePublishMulticast<T> OooO00o;

        public OooO00o(OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.OooO00o = onSubscribePublishMulticast;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.OooO00o.setProducer(r2);
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribePublishMulticast$PublishProducer */
    public static final class PublishProducer<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii {
        public static final long serialVersionUID = 960704844171597367L;
        public final AbstractC9508LiLi<? super T> actual;
        public final AtomicBoolean once = new AtomicBoolean();
        public final OnSubscribePublishMulticast<T> parent;

        public PublishProducer(AbstractC9508LiLi<? super T> r1, OnSubscribePublishMulticast<T> onSubscribePublishMulticast) {
            this.actual = r1;
            this.parent = onSubscribePublishMulticast;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.once.get();
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0) {
                C6211iLli.OooO00o(this, j);
                this.parent.drain();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (this.once.compareAndSet(false, true)) {
                this.parent.remove(this);
            }
        }
    }

    public OnSubscribePublishMulticast(int i, boolean z) {
        if (i > 0) {
            this.prefetch = i;
            this.delayError = z;
            if (C11LI1.OooO00o()) {
                this.queue = new iI1L1i(i);
            } else {
                this.queue = new i1Il1LL(i);
            }
            this.subscribers = (PublishProducer<T>[]) EMPTY;
            this.parent = new OooO00o<>(this);
            return;
        }
        throw new IllegalArgumentException("prefetch > 0 required but it was " + i);
    }

    public boolean add(PublishProducer<T> publishProducer) {
        if (this.subscribers == TERMINATED) {
            return false;
        }
        synchronized (this) {
            PublishProducer<T>[] publishProducerArr = this.subscribers;
            if (publishProducerArr == TERMINATED) {
                return false;
            }
            int length = publishProducerArr.length;
            PublishProducer<T>[] publishProducerArr2 = new PublishProducer[(length + 1)];
            System.arraycopy(publishProducerArr, 0, publishProducerArr2, 0, length);
            publishProducerArr2[length] = publishProducer;
            this.subscribers = publishProducerArr2;
            return true;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public boolean checkTerminated(boolean z, boolean z2) {
        int i = 0;
        if (z) {
            if (!this.delayError) {
                Throwable th = this.error;
                if (th != null) {
                    this.queue.clear();
                    PublishProducer<T>[] terminate = terminate();
                    int length = terminate.length;
                    while (i < length) {
                        terminate[i].actual.onError(th);
                        i++;
                    }
                    return true;
                } else if (z2) {
                    PublishProducer<T>[] terminate2 = terminate();
                    int length2 = terminate2.length;
                    while (i < length2) {
                        terminate2[i].actual.onCompleted();
                        i++;
                    }
                    return true;
                }
            } else if (z2) {
                PublishProducer<T>[] terminate3 = terminate();
                Throwable th2 = this.error;
                if (th2 != null) {
                    int length3 = terminate3.length;
                    while (i < length3) {
                        terminate3[i].actual.onError(th2);
                        i++;
                    }
                } else {
                    int length4 = terminate3.length;
                    while (i < length4) {
                        terminate3[i].actual.onCompleted();
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public void drain() {
        if (getAndIncrement() == 0) {
            Queue<T> queue2 = this.queue;
            int i = 0;
            do {
                long j = Long.MAX_VALUE;
                PublishProducer<T>[] publishProducerArr = this.subscribers;
                int length = publishProducerArr.length;
                for (PublishProducer<T> publishProducer : publishProducerArr) {
                    j = Math.min(j, publishProducer.get());
                }
                if (length != 0) {
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.done;
                        T poll = queue2.poll();
                        boolean z2 = poll == null;
                        if (!checkTerminated(z, z2)) {
                            if (z2) {
                                break;
                            }
                            for (PublishProducer<T> publishProducer2 : publishProducerArr) {
                                publishProducer2.actual.onNext(poll);
                            }
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 == j && checkTerminated(this.done, queue2.isEmpty())) {
                        return;
                    }
                    if (j2 != 0) {
                        AbstractC9465L1l1 r3 = this.producer;
                        if (r3 != null) {
                            r3.request(j2);
                        }
                        for (PublishProducer<T> publishProducer3 : publishProducerArr) {
                            C6211iLli.OooO0O0(publishProducer3, j2);
                        }
                    }
                }
                i = addAndGet(-i);
            } while (i != 0);
        }
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return this.parent.isUnsubscribed();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.done = true;
        drain();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.error = th;
        this.done = true;
        drain();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        if (!this.queue.offer(t)) {
            this.parent.unsubscribe();
            this.error = new MissingBackpressureException("Queue full?!");
            this.done = true;
        }
        drain();
    }

    public void remove(PublishProducer<T> publishProducer) {
        PublishProducer[] publishProducerArr;
        PublishProducer<T>[] publishProducerArr2 = this.subscribers;
        if (publishProducerArr2 != TERMINATED && publishProducerArr2 != EMPTY) {
            synchronized (this) {
                PublishProducer<T>[] publishProducerArr3 = this.subscribers;
                if (publishProducerArr3 != TERMINATED) {
                    if (publishProducerArr3 != EMPTY) {
                        int i = -1;
                        int length = publishProducerArr3.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            } else if (publishProducerArr3[i2] == publishProducer) {
                                i = i2;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i >= 0) {
                            if (length == 1) {
                                publishProducerArr = EMPTY;
                            } else {
                                PublishProducer[] publishProducerArr4 = new PublishProducer[(length - 1)];
                                System.arraycopy(publishProducerArr3, 0, publishProducerArr4, 0, i);
                                System.arraycopy(publishProducerArr3, i + 1, publishProducerArr4, i, (length - i) - 1);
                                publishProducerArr = publishProducerArr4;
                            }
                            this.subscribers = publishProducerArr;
                        }
                    }
                }
            }
        }
    }

    public void setProducer(AbstractC9465L1l1 r3) {
        this.producer = r3;
        r3.request((long) this.prefetch);
    }

    public AbstractC9508LiLi<T> subscriber() {
        return this.parent;
    }

    public PublishProducer<T>[] terminate() {
        PublishProducer<T>[] publishProducerArr = this.subscribers;
        if (publishProducerArr != TERMINATED) {
            synchronized (this) {
                publishProducerArr = this.subscribers;
                if (publishProducerArr != TERMINATED) {
                    this.subscribers = (PublishProducer<T>[]) TERMINATED;
                }
            }
        }
        return publishProducerArr;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        this.parent.unsubscribe();
    }

    public void call(AbstractC9508LiLi<? super T> r3) {
        PublishProducer<T> publishProducer = new PublishProducer<>(r3, this);
        r3.add(publishProducer);
        r3.setProducer(publishProducer);
        if (!add(publishProducer)) {
            Throwable th = this.error;
            if (th != null) {
                r3.onError(th);
            } else {
                r3.onCompleted();
            }
        } else if (publishProducer.isUnsubscribed()) {
            remove(publishProducer);
        } else {
            drain();
        }
    }
}
