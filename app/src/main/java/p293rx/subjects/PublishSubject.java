package p293rx.subjects;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC5635LIi1;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.subjects.PublishSubject */
public final class PublishSubject<T> extends AbstractC5635LIi1<T, T> {
    public final PublishSubjectState<T> OooO00o;

    /* renamed from: rx.subjects.PublishSubject$PublishSubjectProducer */
    public static final class PublishSubjectProducer<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii, AbstractC5477Il11<T> {
        public static final long serialVersionUID = 6451806817170721536L;
        public final AbstractC9508LiLi<? super T> actual;
        public final PublishSubjectState<T> parent;
        public long produced;

        public PublishSubjectProducer(PublishSubjectState<T> publishSubjectState, AbstractC9508LiLi<? super T> r2) {
            this.parent = publishSubjectState;
            this.actual = r2;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (get() != Long.MIN_VALUE) {
                this.actual.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (get() != Long.MIN_VALUE) {
                this.actual.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long j = get();
            if (j != Long.MIN_VALUE) {
                long j2 = this.produced;
                if (j != j2) {
                    this.produced = j2 + 1;
                    this.actual.onNext(t);
                    return;
                }
                unsubscribe();
                this.actual.onError(new MissingBackpressureException("PublishSubject: could not emit value due to lack of requests"));
            }
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            long j2;
            if (C6211iLli.OooO00o(j)) {
                do {
                    j2 = get();
                    if (j2 == Long.MIN_VALUE) {
                        return;
                    }
                } while (!compareAndSet(j2, C6211iLli.OooO00o(j2, j)));
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.remove(this);
            }
        }
    }

    /* renamed from: rx.subjects.PublishSubject$PublishSubjectState */
    public static final class PublishSubjectState<T> extends AtomicReference<PublishSubjectProducer<T>[]> implements C9349III.OooO00o<T>, AbstractC5477Il11<T> {
        public static final PublishSubjectProducer[] EMPTY = new PublishSubjectProducer[0];
        public static final PublishSubjectProducer[] TERMINATED = new PublishSubjectProducer[0];
        public static final long serialVersionUID = -7568940796666027140L;
        public Throwable error;

        public PublishSubjectState() {
            lazySet(EMPTY);
        }

        public boolean add(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer[] publishSubjectProducerArr;
            PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                if (publishSubjectProducerArr == TERMINATED) {
                    return false;
                }
                int length = publishSubjectProducerArr.length;
                publishSubjectProducerArr2 = new PublishSubjectProducer[(length + 1)];
                System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr2, 0, length);
                publishSubjectProducerArr2[length] = publishSubjectProducer;
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            for (PublishSubjectProducer publishSubjectProducer : (PublishSubjectProducer[]) getAndSet(TERMINATED)) {
                publishSubjectProducer.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.error = th;
            ArrayList arrayList = null;
            for (PublishSubjectProducer publishSubjectProducer : (PublishSubjectProducer[]) getAndSet(TERMINATED)) {
                try {
                    publishSubjectProducer.onError(th);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(th2);
                }
            }
            IIl11.OooO00o(arrayList);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            for (PublishSubjectProducer publishSubjectProducer : (PublishSubjectProducer[]) get()) {
                publishSubjectProducer.onNext(t);
            }
        }

        public void remove(PublishSubjectProducer<T> publishSubjectProducer) {
            PublishSubjectProducer<T>[] publishSubjectProducerArr;
            PublishSubjectProducer[] publishSubjectProducerArr2;
            do {
                publishSubjectProducerArr = (PublishSubjectProducer[]) get();
                if (publishSubjectProducerArr != TERMINATED && publishSubjectProducerArr != EMPTY) {
                    int length = publishSubjectProducerArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (publishSubjectProducerArr[i2] == publishSubjectProducer) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            publishSubjectProducerArr2 = EMPTY;
                        } else {
                            PublishSubjectProducer[] publishSubjectProducerArr3 = new PublishSubjectProducer[(length - 1)];
                            System.arraycopy(publishSubjectProducerArr, 0, publishSubjectProducerArr3, 0, i);
                            System.arraycopy(publishSubjectProducerArr, i + 1, publishSubjectProducerArr3, i, (length - i) - 1);
                            publishSubjectProducerArr2 = publishSubjectProducerArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(publishSubjectProducerArr, publishSubjectProducerArr2));
        }

        public void call(AbstractC9508LiLi<? super T> r3) {
            PublishSubjectProducer<T> publishSubjectProducer = new PublishSubjectProducer<>(this, r3);
            r3.add(publishSubjectProducer);
            r3.setProducer(publishSubjectProducer);
            if (!add(publishSubjectProducer)) {
                Throwable th = this.error;
                if (th != null) {
                    r3.onError(th);
                } else {
                    r3.onCompleted();
                }
            } else if (publishSubjectProducer.isUnsubscribed()) {
                remove(publishSubjectProducer);
            }
        }
    }

    public PublishSubject(PublishSubjectState<T> publishSubjectState) {
        super(publishSubjectState);
        this.OooO00o = publishSubjectState;
    }

    public static <T> PublishSubject<T> OooO00o() {
        return new PublishSubject<>(new PublishSubjectState());
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public boolean OooO0O0() {
        return this.OooO00o.get() == PublishSubjectState.TERMINATED && this.OooO00o.error == null;
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0OO() {
        return this.OooO00o.get() == PublishSubjectState.TERMINATED && this.OooO00o.error != null;
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

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m23007OooO00o() {
        return ((PublishSubjectProducer[]) this.OooO00o.get()).length != 0;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m23006OooO00o() {
        if (this.OooO00o.get() == PublishSubjectState.TERMINATED) {
            return this.OooO00o.error;
        }
        return null;
    }
}
