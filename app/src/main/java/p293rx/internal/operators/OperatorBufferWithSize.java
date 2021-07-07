package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.operators.OperatorBufferWithSize */
public final class OperatorBufferWithSize<T> implements C9349III.OooO0O0<List<T>, T> {
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap */
    public static final class BufferOverlap<T> extends AbstractC9508LiLi<T> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f24064OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayDeque<List<T>> f24065OooO00o = new ArrayDeque<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f24066OooO00o = new AtomicLong();
        public long OooO0O0;
        public final int o00oO0O;
        public final int o0ooOO0;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferOverlap$BufferOverlapProducer */
        public final class BufferOverlapProducer extends AtomicBoolean implements AbstractC9465L1l1 {
            public static final long serialVersionUID = -4015894850868853147L;

            public BufferOverlapProducer() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                BufferOverlap bufferOverlap = BufferOverlap.this;
                if (C6211iLli.OooO00o(bufferOverlap.f24066OooO00o, j, bufferOverlap.f24065OooO00o, bufferOverlap.f24064OooO00o) && j != 0) {
                    if (get() || !compareAndSet(false, true)) {
                        bufferOverlap.request(C6211iLli.OooO0O0((long) bufferOverlap.o0ooOO0, j));
                    } else {
                        bufferOverlap.request(C6211iLli.OooO00o(C6211iLli.OooO0O0((long) bufferOverlap.o0ooOO0, j - 1), (long) bufferOverlap.o00oO0O));
                    }
                }
            }
        }

        public BufferOverlap(AbstractC9508LiLi<? super List<T>> r1, int i, int i2) {
            this.f24064OooO00o = r1;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            request(0);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            long j = this.OooO0O0;
            if (j != 0) {
                if (j > this.f24066OooO00o.get()) {
                    AbstractC9508LiLi<? super List<T>> r2 = this.f24064OooO00o;
                    r2.onError(new MissingBackpressureException("More produced than requested? " + j));
                    return;
                }
                this.f24066OooO00o.addAndGet(-j);
            }
            C6211iLli.OooO00o(this.f24066OooO00o, this.f24065OooO00o, this.f24064OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f24065OooO00o.clear();
            this.f24064OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long j = this.OooO00o;
            if (j == 0) {
                this.f24065OooO00o.offer(new ArrayList(this.o00oO0O));
            }
            long j2 = j + 1;
            if (j2 == ((long) this.o0ooOO0)) {
                this.OooO00o = 0;
            } else {
                this.OooO00o = j2;
            }
            Iterator<List<T>> it = this.f24065OooO00o.iterator();
            while (it.hasNext()) {
                it.next().add(t);
            }
            List<T> peek = this.f24065OooO00o.peek();
            if (peek != null && peek.size() == this.o00oO0O) {
                this.f24065OooO00o.poll();
                this.OooO0O0++;
                this.f24064OooO00o.onNext(peek);
            }
        }

        public AbstractC9465L1l1 OooO00o() {
            return new BufferOverlapProducer();
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferSkip */
    public static final class BufferSkip<T> extends AbstractC9508LiLi<T> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f24067OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f24068OooO00o;
        public final int o00oO0O;
        public final int o0ooOO0;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$BufferSkip$BufferSkipProducer */
        public final class BufferSkipProducer extends AtomicBoolean implements AbstractC9465L1l1 {
            public static final long serialVersionUID = 3428177408082367154L;

            public BufferSkipProducer() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                } else if (j != 0) {
                    BufferSkip bufferSkip = BufferSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        bufferSkip.request(C6211iLli.OooO0O0(j, (long) bufferSkip.o0ooOO0));
                    } else {
                        bufferSkip.request(C6211iLli.OooO00o(C6211iLli.OooO0O0(j, (long) bufferSkip.o00oO0O), C6211iLli.OooO0O0((long) (bufferSkip.o0ooOO0 - bufferSkip.o00oO0O), j - 1)));
                    }
                }
            }
        }

        public BufferSkip(AbstractC9508LiLi<? super List<T>> r1, int i, int i2) {
            this.f24067OooO00o = r1;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            request(0);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            List<T> list = this.f24068OooO00o;
            if (list != null) {
                this.f24068OooO00o = null;
                this.f24067OooO00o.onNext(list);
            }
            this.f24067OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f24068OooO00o = null;
            this.f24067OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            long j = this.OooO00o;
            List list = this.f24068OooO00o;
            if (j == 0) {
                list = new ArrayList(this.o00oO0O);
                this.f24068OooO00o = list;
            }
            long j2 = j + 1;
            if (j2 == ((long) this.o0ooOO0)) {
                this.OooO00o = 0;
            } else {
                this.OooO00o = j2;
            }
            if (list != null) {
                list.add(t);
                if (list.size() == this.o00oO0O) {
                    this.f24068OooO00o = null;
                    this.f24067OooO00o.onNext(list);
                }
            }
        }

        public AbstractC9465L1l1 OooO00o() {
            return new BufferSkipProducer();
        }
    }

    /* renamed from: rx.internal.operators.OperatorBufferWithSize$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super List<T>> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f24069OooO00o;
        public final int o00oO0O;

        /* renamed from: rx.internal.operators.OperatorBufferWithSize$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4988OooO00o implements AbstractC9465L1l1 {
            public C4988OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= required but it was " + j);
                } else if (j != 0) {
                    OooO00o.this.request(C6211iLli.OooO0O0(j, (long) OooO00o.this.o00oO0O));
                }
            }
        }

        public OooO00o(AbstractC9508LiLi<? super List<T>> r1, int i) {
            this.OooO00o = r1;
            this.o00oO0O = i;
            request(0);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            List<T> list = this.f24069OooO00o;
            if (list != null) {
                this.OooO00o.onNext(list);
            }
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f24069OooO00o = null;
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            List list = this.f24069OooO00o;
            if (list == null) {
                list = new ArrayList(this.o00oO0O);
                this.f24069OooO00o = list;
            }
            list.add(t);
            if (list.size() == this.o00oO0O) {
                this.f24069OooO00o = null;
                this.OooO00o.onNext(list);
            }
        }

        public AbstractC9465L1l1 OooO00o() {
            return new C4988OooO00o();
        }
    }

    public OperatorBufferWithSize(int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("count must be greater than 0");
        } else if (i2 > 0) {
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
        } else {
            throw new IllegalArgumentException("skip must be greater than 0");
        }
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r4) {
        int i = this.o0ooOO0;
        int i2 = this.o00oO0O;
        if (i == i2) {
            OooO00o oooO00o = new OooO00o(r4, i2);
            r4.add(oooO00o);
            r4.setProducer(oooO00o.OooO00o());
            return oooO00o;
        } else if (i > i2) {
            BufferSkip bufferSkip = new BufferSkip(r4, i2, i);
            r4.add(bufferSkip);
            r4.setProducer(bufferSkip.OooO00o());
            return bufferSkip;
        } else {
            BufferOverlap bufferOverlap = new BufferOverlap(r4, i2, i);
            r4.add(bufferOverlap);
            r4.setProducer(bufferOverlap.OooO00o());
            return bufferOverlap;
        }
    }
}
