package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5635LIi1;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.C9818LLl1;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.subjects.UnicastSubject;

/* renamed from: rx.internal.operators.OperatorWindowWithSize */
public final class OperatorWindowWithSize<T> implements C9349III.OooO0O0<C9349III<T>, T> {
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> implements liii1l {
        public AbstractC5635LIi1<T, T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LlIiLii f24132OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f24133OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24134OooO00o = new AtomicInteger(1);
        public final int o00oO0O;
        public int o0ooOO0;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4989OooO00o implements AbstractC9465L1l1 {
            public C4989OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                } else if (j != 0) {
                    OooO00o.this.request(C6211iLli.OooO0O0((long) OooO00o.this.o00oO0O, j));
                }
            }
        }

        public OooO00o(AbstractC9508LiLi<? super C9349III<T>> r1, int i) {
            this.f24133OooO00o = r1;
            this.o00oO0O = i;
            LlIiLii OooO00o2 = C9638ill.OooO00o(this);
            this.f24132OooO00o = OooO00o2;
            add(OooO00o2);
            request(0);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (this.f24134OooO00o.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            AbstractC5635LIi1<T, T> r0 = this.OooO00o;
            if (r0 != null) {
                this.OooO00o = null;
                r0.onCompleted();
            }
            this.f24133OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            AbstractC5635LIi1<T, T> r0 = this.OooO00o;
            if (r0 != null) {
                this.OooO00o = null;
                r0.onError(th);
            }
            this.f24133OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o0ooOO0;
            UnicastSubject unicastSubject = this.OooO00o;
            if (i == 0) {
                this.f24134OooO00o.getAndIncrement();
                unicastSubject = UnicastSubject.OooO00o(this.o00oO0O, (liii1l) this);
                this.OooO00o = unicastSubject;
                this.f24133OooO00o.onNext(unicastSubject);
            }
            int i2 = i + 1;
            unicastSubject.onNext(t);
            if (i2 == this.o00oO0O) {
                this.o0ooOO0 = 0;
                this.OooO00o = null;
                unicastSubject.onCompleted();
                return;
            }
            this.o0ooOO0 = i2;
        }

        public AbstractC9465L1l1 OooO00o() {
            return new C4989OooO00o();
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowOverlap */
    public static final class WindowOverlap<T> extends AbstractC9508LiLi<T> implements liii1l {
        public final LlIiLii OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f24135OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24136OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final ArrayDeque<AbstractC5635LIi1<T, T>> f24137OooO00o = new ArrayDeque<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<AbstractC5635LIi1<T, T>> f24138OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24139OooO00o = new AtomicInteger(1);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f24140OooO00o = new AtomicLong();
        public final AtomicInteger OooO0O0 = new AtomicInteger();

        /* renamed from: OooO0O0  reason: collision with other field name */
        public volatile boolean f24141OooO0O0;
        public final int o00oO0O;
        public final int o0ooOO0;
        public int o0ooOOo;
        public int o0ooOoO;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowOverlap$WindowOverlapProducer */
        public final class WindowOverlapProducer extends AtomicBoolean implements AbstractC9465L1l1 {
            public static final long serialVersionUID = 4625807964358024108L;

            public WindowOverlapProducer() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                } else if (j != 0) {
                    WindowOverlap windowOverlap = WindowOverlap.this;
                    if (get() || !compareAndSet(false, true)) {
                        WindowOverlap.this.request(C6211iLli.OooO0O0((long) windowOverlap.o0ooOO0, j));
                    } else {
                        windowOverlap.request(C6211iLli.OooO00o(C6211iLli.OooO0O0((long) windowOverlap.o0ooOO0, j - 1), (long) windowOverlap.o00oO0O));
                    }
                    C6211iLli.OooO00o(windowOverlap.f24140OooO00o, j);
                    windowOverlap.OooO0OO();
                }
            }
        }

        public WindowOverlap(AbstractC9508LiLi<? super C9349III<T>> r3, int i, int i2) {
            this.f24135OooO00o = r3;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            LlIiLii OooO00o2 = C9638ill.OooO00o(this);
            this.OooO00o = OooO00o2;
            add(OooO00o2);
            request(0);
            this.f24138OooO00o = new C9818LLl1((i + (i2 - 1)) / i2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r14v0, resolved type: rx.internal.operators.OperatorWindowWithSize$WindowOverlap<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO0OO() {
            AtomicInteger atomicInteger = this.OooO0O0;
            if (atomicInteger.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super C9349III<T>> r1 = this.f24135OooO00o;
                Queue<AbstractC5635LIi1<T, T>> queue = this.f24138OooO00o;
                int i = 1;
                do {
                    long j = this.f24140OooO00o.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.f24141OooO0O0;
                        AbstractC5635LIi1<T, T> poll = queue.poll();
                        boolean z2 = poll == null;
                        if (!OooO00o(z, z2, r1, queue)) {
                            if (z2) {
                                break;
                            }
                            r1.onNext(poll);
                            j2++;
                        } else {
                            return;
                        }
                    }
                    if (j2 != j || !OooO00o(this.f24141OooO0O0, queue.isEmpty(), r1, queue)) {
                        if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                            this.f24140OooO00o.addAndGet(-j2);
                        }
                        i = atomicInteger.addAndGet(-i);
                    } else {
                        return;
                    }
                } while (i != 0);
            }
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (this.f24139OooO00o.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            Iterator<AbstractC5635LIi1<T, T>> it = this.f24137OooO00o.iterator();
            while (it.hasNext()) {
                it.next().onCompleted();
            }
            this.f24137OooO00o.clear();
            this.f24141OooO0O0 = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            Iterator<AbstractC5635LIi1<T, T>> it = this.f24137OooO00o.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f24137OooO00o.clear();
            this.f24136OooO00o = th;
            this.f24141OooO0O0 = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o0ooOOo;
            ArrayDeque<AbstractC5635LIi1<T, T>> arrayDeque = this.f24137OooO00o;
            if (i == 0 && !this.f24135OooO00o.isUnsubscribed()) {
                this.f24139OooO00o.getAndIncrement();
                UnicastSubject OooO00o2 = UnicastSubject.OooO00o(16, (liii1l) this);
                arrayDeque.offer(OooO00o2);
                this.f24138OooO00o.offer(OooO00o2);
                OooO0OO();
            }
            Iterator<AbstractC5635LIi1<T, T>> it = this.f24137OooO00o.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            int i2 = this.o0ooOoO + 1;
            if (i2 == this.o00oO0O) {
                this.o0ooOoO = i2 - this.o0ooOO0;
                AbstractC5635LIi1<T, T> poll = arrayDeque.poll();
                if (poll != null) {
                    poll.onCompleted();
                }
            } else {
                this.o0ooOoO = i2;
            }
            int i3 = i + 1;
            if (i3 == this.o0ooOO0) {
                this.o0ooOOo = 0;
            } else {
                this.o0ooOOo = i3;
            }
        }

        public AbstractC9465L1l1 OooO00o() {
            return new WindowOverlapProducer();
        }

        public boolean OooO00o(boolean z, boolean z2, AbstractC9508LiLi<? super AbstractC5635LIi1<T, T>> r5, Queue<AbstractC5635LIi1<T, T>> queue) {
            if (r5.isUnsubscribed()) {
                queue.clear();
                return true;
            } else if (!z) {
                return false;
            } else {
                Throwable th = this.f24136OooO00o;
                if (th != null) {
                    queue.clear();
                    r5.onError(th);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    r5.onCompleted();
                    return true;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowSkip */
    public static final class WindowSkip<T> extends AbstractC9508LiLi<T> implements liii1l {
        public AbstractC5635LIi1<T, T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LlIiLii f24142OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f24143OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24144OooO00o = new AtomicInteger(1);
        public final int o00oO0O;
        public final int o0ooOO0;
        public int o0ooOOo;

        /* renamed from: rx.internal.operators.OperatorWindowWithSize$WindowSkip$WindowSkipProducer */
        public final class WindowSkipProducer extends AtomicBoolean implements AbstractC9465L1l1 {
            public static final long serialVersionUID = 4625807964358024108L;

            public WindowSkipProducer() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 required but it was " + j);
                } else if (j != 0) {
                    WindowSkip windowSkip = WindowSkip.this;
                    if (get() || !compareAndSet(false, true)) {
                        windowSkip.request(C6211iLli.OooO0O0(j, (long) windowSkip.o0ooOO0));
                    } else {
                        windowSkip.request(C6211iLli.OooO00o(C6211iLli.OooO0O0(j, (long) windowSkip.o00oO0O), C6211iLli.OooO0O0((long) (windowSkip.o0ooOO0 - windowSkip.o00oO0O), j - 1)));
                    }
                }
            }
        }

        public WindowSkip(AbstractC9508LiLi<? super C9349III<T>> r1, int i, int i2) {
            this.f24143OooO00o = r1;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            LlIiLii OooO00o2 = C9638ill.OooO00o(this);
            this.f24142OooO00o = OooO00o2;
            add(OooO00o2);
            request(0);
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (this.f24144OooO00o.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            AbstractC5635LIi1<T, T> r0 = this.OooO00o;
            if (r0 != null) {
                this.OooO00o = null;
                r0.onCompleted();
            }
            this.f24143OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            AbstractC5635LIi1<T, T> r0 = this.OooO00o;
            if (r0 != null) {
                this.OooO00o = null;
                r0.onError(th);
            }
            this.f24143OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o0ooOOo;
            UnicastSubject unicastSubject = this.OooO00o;
            if (i == 0) {
                this.f24144OooO00o.getAndIncrement();
                unicastSubject = UnicastSubject.OooO00o(this.o00oO0O, (liii1l) this);
                this.OooO00o = unicastSubject;
                this.f24143OooO00o.onNext(unicastSubject);
            }
            int i2 = i + 1;
            if (unicastSubject != null) {
                unicastSubject.onNext(t);
            }
            if (i2 == this.o00oO0O) {
                this.o0ooOOo = i2;
                this.OooO00o = null;
                unicastSubject.onCompleted();
            } else if (i2 == this.o0ooOO0) {
                this.o0ooOOo = 0;
            } else {
                this.o0ooOOo = i2;
            }
        }

        public AbstractC9465L1l1 OooO00o() {
            return new WindowSkipProducer();
        }
    }

    public OperatorWindowWithSize(int i, int i2) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9349III<T>> r4) {
        int i = this.o0ooOO0;
        int i2 = this.o00oO0O;
        if (i == i2) {
            OooO00o oooO00o = new OooO00o(r4, i2);
            r4.add(oooO00o.f24132OooO00o);
            r4.setProducer(oooO00o.OooO00o());
            return oooO00o;
        } else if (i > i2) {
            WindowSkip windowSkip = new WindowSkip(r4, i2, i);
            r4.add(windowSkip.f24142OooO00o);
            r4.setProducer(windowSkip.OooO00o());
            return windowSkip;
        } else {
            WindowOverlap windowOverlap = new WindowOverlap(r4, i2, i);
            r4.add(windowOverlap.OooO00o);
            r4.setProducer(windowOverlap.OooO00o());
            return windowOverlap;
        }
    }
}
