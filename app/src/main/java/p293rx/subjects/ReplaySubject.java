package p293rx.subjects;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC5635LIi1;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C6261iii1I1;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LlIiLii;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.subjects.ReplaySubject */
public final class ReplaySubject<T> extends AbstractC5635LIi1<T, T> {
    public static final Object[] OooO00o = new Object[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ReplayState<T> f24176OooO00o;

    /* renamed from: rx.subjects.ReplaySubject$OooO00o */
    public interface OooO00o<T> {
        T OooO00o();

        /* renamed from: OooO00o  reason: collision with other method in class */
        Throwable m23016OooO00o();

        void OooO00o(ReplayProducer<T> replayProducer);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m23017OooO00o();

        void complete();

        void error(Throwable th);

        boolean isEmpty();

        void next(T t);

        int size();

        T[] toArray(T[] tArr);
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplayProducer */
    public static final class ReplayProducer<T> extends AtomicInteger implements AbstractC9465L1l1, LlIiLii {
        public static final long serialVersionUID = -5006209596735204567L;
        public final AbstractC9508LiLi<? super T> actual;
        public int index;
        public Object node;
        public final AtomicLong requested = new AtomicLong();
        public final ReplayState<T> state;
        public int tailIndex;

        public ReplayProducer(AbstractC9508LiLi<? super T> r1, ReplayState<T> replayState) {
            this.actual = r1;
            this.state = replayState;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.actual.isUnsubscribed();
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j > 0) {
                C6211iLli.OooO00o(this.requested, j);
                this.state.buffer.OooO00o(this);
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            this.state.remove(this);
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplayState */
    public static final class ReplayState<T> extends AtomicReference<ReplayProducer<T>[]> implements C9349III.OooO00o<T>, AbstractC5477Il11<T> {
        public static final ReplayProducer[] EMPTY = new ReplayProducer[0];
        public static final ReplayProducer[] TERMINATED = new ReplayProducer[0];
        public static final long serialVersionUID = 5952362471246910544L;
        public final OooO00o<T> buffer;

        public ReplayState(OooO00o<T> oooO00o) {
            this.buffer = oooO00o;
            lazySet(EMPTY);
        }

        public boolean add(ReplayProducer<T> replayProducer) {
            ReplayProducer[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = (ReplayProducer[]) get();
                if (replayProducerArr == TERMINATED) {
                    return false;
                }
                int length = replayProducerArr.length;
                replayProducerArr2 = new ReplayProducer[(length + 1)];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
            return true;
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        public boolean isTerminated() {
            return get() == TERMINATED;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            OooO00o<T> oooO00o = this.buffer;
            oooO00o.complete();
            for (ReplayProducer<T> replayProducer : (ReplayProducer[]) getAndSet(TERMINATED)) {
                oooO00o.OooO00o(replayProducer);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            OooO00o<T> oooO00o = this.buffer;
            oooO00o.error(th);
            ArrayList arrayList = null;
            for (ReplayProducer<T> replayProducer : (ReplayProducer[]) getAndSet(TERMINATED)) {
                try {
                    oooO00o.OooO00o(replayProducer);
                } catch (Throwable th2) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th2);
                }
            }
            IIl11.OooO00o(arrayList);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            OooO00o<T> oooO00o = this.buffer;
            oooO00o.next(t);
            for (ReplayProducer<T> replayProducer : (ReplayProducer[]) get()) {
                oooO00o.OooO00o(replayProducer);
            }
        }

        public void remove(ReplayProducer<T> replayProducer) {
            ReplayProducer<T>[] replayProducerArr;
            ReplayProducer[] replayProducerArr2;
            do {
                replayProducerArr = (ReplayProducer[]) get();
                if (replayProducerArr != TERMINATED && replayProducerArr != EMPTY) {
                    int length = replayProducerArr.length;
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (replayProducerArr[i2] == replayProducer) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            replayProducerArr2 = EMPTY;
                        } else {
                            ReplayProducer[] replayProducerArr3 = new ReplayProducer[(length - 1)];
                            System.arraycopy(replayProducerArr, 0, replayProducerArr3, 0, i);
                            System.arraycopy(replayProducerArr, i + 1, replayProducerArr3, i, (length - i) - 1);
                            replayProducerArr2 = replayProducerArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(replayProducerArr, replayProducerArr2));
        }

        public void call(AbstractC9508LiLi<? super T> r2) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(r2, this);
            r2.add(replayProducer);
            r2.setProducer(replayProducer);
            if (!add(replayProducer) || !replayProducer.isUnsubscribed()) {
                this.buffer.OooO00o(replayProducer);
            } else {
                remove(replayProducer);
            }
        }
    }

    public ReplaySubject(ReplayState<T> replayState) {
        super(replayState);
        this.f24176OooO00o = replayState;
    }

    public static <T> ReplaySubject<T> OooO00o() {
        return OooO00o(16);
    }

    public static <T> ReplaySubject<T> OooO0O0() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(Integer.MAX_VALUE)));
    }

    public static <T> ReplaySubject<T> OooO0OO() {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(Integer.MAX_VALUE, Long.MAX_VALUE, C6261iii1I1.OooO0O0())));
    }

    @Override // com.p118pd.sdk.C9349III
    public int OooO0Oo() {
        return ((ReplayProducer[]) this.f24176OooO00o.get()).length;
    }

    @Override // com.p118pd.sdk.C9349III
    public boolean OooO0o0() {
        return m23013OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        this.f24176OooO00o.onCompleted();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        this.f24176OooO00o.onError(th);
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.f24176OooO00o.onNext(t);
    }

    public static <T> ReplaySubject<T> OooO00o(int i) {
        if (i > 0) {
            return new ReplaySubject<>(new ReplayState(new OooO0O0(i)));
        }
        throw new IllegalArgumentException("capacity > 0 required but it was " + i);
    }

    @Override // com.p118pd.sdk.C9349III
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m23015OooO0Oo() {
        return this.f24176OooO00o.isTerminated() && this.f24176OooO00o.buffer.m23016OooO00o() != null;
    }

    public static <T> ReplaySubject<T> OooO0O0(int i) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeBoundBuffer(i)));
    }

    @Override // com.p118pd.sdk.C9349III
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m23014OooO0OO() {
        return this.f24176OooO00o.isTerminated() && this.f24176OooO00o.buffer.m23016OooO00o() == null;
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer */
    public static final class ReplaySizeAndTimeBoundBuffer<T> implements OooO00o<T> {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final long f24181OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL f24182OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24183OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile TimedNode<T> f24184OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile boolean f24185OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public TimedNode<T> f24186OooO0O0;

        /* renamed from: rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode */
        public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
            public static final long serialVersionUID = 3713592843205853725L;
            public final long timestamp;
            public final T value;

            public TimedNode(T t, long j) {
                this.value = t;
                this.timestamp = j;
            }
        }

        public ReplaySizeAndTimeBoundBuffer(int i, long j, LL1LL ll1ll) {
            this.OooO00o = i;
            TimedNode<T> timedNode = new TimedNode<>(null, 0);
            this.f24186OooO0O0 = timedNode;
            this.f24184OooO00o = timedNode;
            this.f24181OooO00o = j;
            this.f24182OooO00o = ll1ll;
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m23022OooO00o() {
            /*
                r8 = this;
                com.pd.sdk.LL1LL r0 = r8.f24182OooO00o
                long r0 = r0.OooO00o()
                long r2 = r8.f24181OooO00o
                long r0 = r0 - r2
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode<T> r2 = r8.f24184OooO00o
                r3 = r2
            L_0x000c:
                java.lang.Object r4 = r3.get()
                rx.subjects.ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode r4 = (p293rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.TimedNode) r4
                if (r4 == 0) goto L_0x001d
                long r5 = r4.timestamp
                int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r7 <= 0) goto L_0x001b
                goto L_0x001d
            L_0x001b:
                r3 = r4
                goto L_0x000c
            L_0x001d:
                if (r2 == r3) goto L_0x0021
                r8.f24184OooO00o = r3
            L_0x0021:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.subjects.ReplaySubject.ReplaySizeAndTimeBoundBuffer.m23022OooO00o():void");
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void complete() {
            m23022OooO00o();
            this.f24185OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void error(Throwable th) {
            m23022OooO00o();
            this.f24183OooO00o = th;
            this.f24185OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public boolean isEmpty() {
            return m23021OooO00o().get() == null;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void next(T t) {
            TimedNode<T> timedNode;
            long OooO00o2 = this.f24182OooO00o.OooO00o();
            TimedNode<T> timedNode2 = new TimedNode<>(t, OooO00o2);
            this.f24186OooO0O0.set(timedNode2);
            this.f24186OooO0O0 = timedNode2;
            long j = OooO00o2 - this.f24181OooO00o;
            int i = this.OooO0O0;
            TimedNode<T> timedNode3 = this.f24184OooO00o;
            if (i == this.OooO00o) {
                timedNode = (TimedNode) timedNode3.get();
            } else {
                i++;
                timedNode = timedNode3;
            }
            while (true) {
                TimedNode<T> timedNode4 = (TimedNode) timedNode.get();
                if (timedNode4 == null || timedNode4.timestamp > j) {
                    this.OooO0O0 = i;
                } else {
                    i--;
                    timedNode = timedNode4;
                }
            }
            this.OooO0O0 = i;
            if (timedNode != timedNode3) {
                this.f24184OooO00o = timedNode;
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public int size() {
            TimedNode timedNode = (TimedNode) m23021OooO00o().get();
            int i = 0;
            while (timedNode != null && i != Integer.MAX_VALUE) {
                timedNode = (TimedNode) timedNode.get();
                i++;
            }
            return i;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (TimedNode timedNode = (TimedNode) m23021OooO00o().get(); timedNode != null; timedNode = (TimedNode) timedNode.get()) {
                arrayList.add(timedNode.value);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public TimedNode<T> m23021OooO00o() {
            long OooO00o2 = this.f24182OooO00o.OooO00o() - this.f24181OooO00o;
            TimedNode<T> timedNode = this.f24184OooO00o;
            while (true) {
                TimedNode<T> timedNode2 = (TimedNode) timedNode.get();
                if (timedNode2 == null || timedNode2.timestamp > OooO00o2) {
                    return timedNode;
                }
                timedNode = timedNode2;
            }
            return timedNode;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void OooO00o(ReplayProducer<T> replayProducer) {
            boolean z;
            if (replayProducer.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super T> r2 = replayProducer.actual;
                int i = 1;
                do {
                    long j = replayProducer.requested.get();
                    TimedNode<T> timedNode = (TimedNode) replayProducer.node;
                    if (timedNode == null) {
                        timedNode = m23021OooO00o();
                    }
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        } else {
                            boolean z2 = this.f24185OooO00o;
                            TimedNode<T> timedNode2 = (TimedNode) timedNode.get();
                            boolean z3 = timedNode2 == null;
                            if (z2 && z3) {
                                replayProducer.node = null;
                                Throwable th = this.f24183OooO00o;
                                if (th != null) {
                                    r2.onError(th);
                                    return;
                                } else {
                                    r2.onCompleted();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                r2.onNext(timedNode2.value);
                                j2++;
                                timedNode = timedNode2;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        }
                        boolean z4 = this.f24185OooO00o;
                        if (timedNode.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            replayProducer.node = null;
                            Throwable th2 = this.f24183OooO00o;
                            if (th2 != null) {
                                r2.onError(th2);
                                return;
                            } else {
                                r2.onCompleted();
                                return;
                            }
                        }
                    }
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        C6211iLli.OooO0O0(replayProducer.requested, j2);
                    }
                    replayProducer.node = timedNode;
                    i = replayProducer.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23023OooO00o() {
            return this.f24185OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Throwable m23020OooO00o() {
            return this.f24183OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        public T OooO00o() {
            TimedNode<T> OooO00o2 = m23021OooO00o();
            while (true) {
                TimedNode<T> timedNode = (TimedNode) OooO00o2.get();
                if (timedNode == null) {
                    return OooO00o2.value;
                }
                OooO00o2 = timedNode;
            }
        }
    }

    public static <T> ReplaySubject<T> OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, timeUnit, Integer.MAX_VALUE, ll1ll);
    }

    public static <T> ReplaySubject<T> OooO00o(long j, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        return new ReplaySubject<>(new ReplayState(new ReplaySizeAndTimeBoundBuffer(i, timeUnit.toMillis(j), ll1ll)));
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m23012OooO0O0() {
        return this.f24176OooO00o.buffer.size();
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m23013OooO0O0() {
        return !this.f24176OooO00o.buffer.isEmpty();
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m23010OooO00o() {
        return ((ReplayProducer[]) this.f24176OooO00o.get()).length != 0;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Throwable m23009OooO00o() {
        if (this.f24176OooO00o.isTerminated()) {
            return this.f24176OooO00o.buffer.m23016OooO00o();
        }
        return null;
    }

    public T[] OooO00o(T[] tArr) {
        return this.f24176OooO00o.buffer.toArray(tArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: rx.subjects.ReplaySubject<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object[] m23011OooO00o() {
        Object[] OooO00o2 = OooO00o(OooO00o);
        return OooO00o2 == OooO00o ? new Object[0] : OooO00o2;
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.AbstractC5635LIi1, com.p118pd.sdk.AbstractC5635LIi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m23008OooO00o() {
        return this.f24176OooO00o.buffer.OooO00o();
    }

    /* renamed from: rx.subjects.ReplaySubject$ReplaySizeBoundBuffer */
    public static final class ReplaySizeBoundBuffer<T> implements OooO00o<T> {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24187OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile Node<T> f24188OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile boolean f24189OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Node<T> f24190OooO0O0;

        /* renamed from: rx.subjects.ReplaySubject$ReplaySizeBoundBuffer$Node */
        public static final class Node<T> extends AtomicReference<Node<T>> {
            public static final long serialVersionUID = 3713592843205853725L;
            public final T value;

            public Node(T t) {
                this.value = t;
            }
        }

        public ReplaySizeBoundBuffer(int i) {
            this.OooO00o = i;
            Node<T> node = new Node<>(null);
            this.f24190OooO0O0 = node;
            this.f24188OooO00o = node;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void OooO00o(ReplayProducer<T> replayProducer) {
            boolean z;
            if (replayProducer.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super T> r2 = replayProducer.actual;
                int i = 1;
                do {
                    long j = replayProducer.requested.get();
                    Node<T> node = (Node) replayProducer.node;
                    if (node == null) {
                        node = this.f24188OooO00o;
                    }
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 == j) {
                            break;
                        } else if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        } else {
                            boolean z2 = this.f24189OooO00o;
                            Node<T> node2 = (Node) node.get();
                            boolean z3 = node2 == null;
                            if (z2 && z3) {
                                replayProducer.node = null;
                                Throwable th = this.f24187OooO00o;
                                if (th != null) {
                                    r2.onError(th);
                                    return;
                                } else {
                                    r2.onCompleted();
                                    return;
                                }
                            } else if (z3) {
                                break;
                            } else {
                                r2.onNext(node2.value);
                                j2++;
                                node = node2;
                            }
                        }
                    }
                    if (j2 == j) {
                        if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        }
                        boolean z4 = this.f24189OooO00o;
                        if (node.get() == null) {
                            z = true;
                        }
                        if (z4 && z) {
                            replayProducer.node = null;
                            Throwable th2 = this.f24187OooO00o;
                            if (th2 != null) {
                                r2.onError(th2);
                                return;
                            } else {
                                r2.onCompleted();
                                return;
                            }
                        }
                    }
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        C6211iLli.OooO0O0(replayProducer.requested, j2);
                    }
                    replayProducer.node = node;
                    i = replayProducer.addAndGet(-i);
                } while (i != 0);
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void complete() {
            this.f24189OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void error(Throwable th) {
            this.f24187OooO00o = th;
            this.f24189OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public boolean isEmpty() {
            return this.f24188OooO00o.get() == null;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void next(T t) {
            Node<T> node = new Node<>(t);
            this.f24190OooO0O0.set(node);
            this.f24190OooO0O0 = node;
            int i = this.OooO0O0;
            if (i == this.OooO00o) {
                this.f24188OooO00o = (Node) this.f24188OooO00o.get();
            } else {
                this.OooO0O0 = i + 1;
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public int size() {
            Node node = (Node) this.f24188OooO00o.get();
            int i = 0;
            while (node != null && i != Integer.MAX_VALUE) {
                node = (Node) node.get();
                i++;
            }
            return i;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public T[] toArray(T[] tArr) {
            ArrayList arrayList = new ArrayList();
            for (Node node = (Node) this.f24188OooO00o.get(); node != null; node = (Node) node.get()) {
                arrayList.add(node.value);
            }
            return (T[]) arrayList.toArray(tArr);
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23025OooO00o() {
            return this.f24189OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Throwable m23024OooO00o() {
            return this.f24187OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        public T OooO00o() {
            Node<T> node = this.f24188OooO00o;
            while (true) {
                Node<T> node2 = (Node) node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }
    }

    /* renamed from: rx.subjects.ReplaySubject$OooO0O0 */
    public static final class OooO0O0<T> implements OooO00o<T> {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24177OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile boolean f24178OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object[] f24179OooO00o;
        public volatile int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public Object[] f24180OooO0O0;
        public int OooO0OO;

        public OooO0O0(int i) {
            this.OooO00o = i;
            Object[] objArr = new Object[(i + 1)];
            this.f24179OooO00o = objArr;
            this.f24180OooO0O0 = objArr;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void OooO00o(ReplayProducer<T> replayProducer) {
            if (replayProducer.getAndIncrement() == 0) {
                AbstractC9508LiLi<? super T> r2 = replayProducer.actual;
                int i = this.OooO00o;
                int i2 = 1;
                do {
                    long j = replayProducer.requested.get();
                    Object[] objArr = (Object[]) replayProducer.node;
                    if (objArr == null) {
                        objArr = this.f24179OooO00o;
                    }
                    int i3 = replayProducer.tailIndex;
                    int i4 = replayProducer.index;
                    long j2 = 0;
                    while (j2 != j) {
                        if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        }
                        boolean z = this.f24178OooO00o;
                        boolean z2 = i4 == this.OooO0O0;
                        if (z && z2) {
                            replayProducer.node = null;
                            Throwable th = this.f24177OooO00o;
                            if (th != null) {
                                r2.onError(th);
                                return;
                            } else {
                                r2.onCompleted();
                                return;
                            }
                        } else if (z2) {
                            break;
                        } else {
                            if (i3 == i) {
                                objArr = (Object[]) objArr[i3];
                                i3 = 0;
                            }
                            r2.onNext(objArr[i3]);
                            j2++;
                            i3++;
                            i4++;
                        }
                    }
                    if (j2 == j) {
                        if (r2.isUnsubscribed()) {
                            replayProducer.node = null;
                            return;
                        }
                        boolean z3 = this.f24178OooO00o;
                        boolean z4 = i4 == this.OooO0O0;
                        if (z3 && z4) {
                            replayProducer.node = null;
                            Throwable th2 = this.f24177OooO00o;
                            if (th2 != null) {
                                r2.onError(th2);
                                return;
                            } else {
                                r2.onCompleted();
                                return;
                            }
                        }
                    }
                    if (!(j2 == 0 || j == Long.MAX_VALUE)) {
                        C6211iLli.OooO0O0(replayProducer.requested, j2);
                    }
                    replayProducer.index = i4;
                    replayProducer.tailIndex = i3;
                    replayProducer.node = objArr;
                    i2 = replayProducer.addAndGet(-i2);
                } while (i2 != 0);
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void complete() {
            this.f24178OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void error(Throwable th) {
            if (this.f24178OooO00o) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.f24177OooO00o = th;
            this.f24178OooO00o = true;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public boolean isEmpty() {
            return this.OooO0O0 == 0;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public void next(T t) {
            if (!this.f24178OooO00o) {
                int i = this.OooO0OO;
                Object[] objArr = this.f24180OooO0O0;
                if (i == objArr.length - 1) {
                    Object[] objArr2 = new Object[objArr.length];
                    objArr2[0] = t;
                    this.OooO0OO = 1;
                    objArr[i] = objArr2;
                    this.f24180OooO0O0 = objArr2;
                } else {
                    objArr[i] = t;
                    this.OooO0OO = i + 1;
                }
                this.OooO0O0++;
            }
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public int size() {
            return this.OooO0O0;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o
        public T[] toArray(T[] tArr) {
            int i = this.OooO0O0;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            Object[] objArr = this.f24179OooO00o;
            int i2 = this.OooO00o;
            int i3 = 0;
            while (true) {
                int i4 = i3 + i2;
                if (i4 >= i) {
                    break;
                }
                System.arraycopy(objArr, 0, tArr, i3, i2);
                objArr = objArr[i2];
                i3 = i4;
            }
            System.arraycopy(objArr, 0, tArr, i3, i - i3);
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23019OooO00o() {
            return this.f24178OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Throwable m23018OooO00o() {
            return this.f24177OooO00o;
        }

        @Override // p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o, p293rx.subjects.ReplaySubject.OooO00o
        public T OooO00o() {
            int i = this.OooO0O0;
            if (i == 0) {
                return null;
            }
            Object[] objArr = this.f24179OooO00o;
            int i2 = this.OooO00o;
            while (i >= i2) {
                objArr = objArr[i2];
                i -= i2;
            }
            return (T) objArr[i - 1];
        }
    }
}
