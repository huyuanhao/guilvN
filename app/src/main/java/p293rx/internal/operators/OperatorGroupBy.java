package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C6695lilIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9577i1;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.C9814LLIlLL;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.liii1l;
import com.p118pd.sdk.ll1i1l;
import java.util.ArrayList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: rx.internal.operators.OperatorGroupBy */
public final class OperatorGroupBy<T, K, V> implements C9349III.OooO0O0<C9814LLIlLL<K, V>, T> {
    public final AbstractC9847l1<? super T, ? extends K> OooO00o;
    public final AbstractC9847l1<? super T, ? extends V> OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f24078OooO0O0;
    public final AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> OooO0OO;
    public final int o00oO0O;

    /* renamed from: rx.internal.operators.OperatorGroupBy$OooO00o */
    public class OooO00o implements liii1l {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.OooO00o.OooO0OO();
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$OooO0O0 */
    public static final class OooO0O0 implements AbstractC9465L1l1 {
        public final OooO0OO<?, ?, ?> OooO00o;

        public OooO0O0(OooO0OO<?, ?, ?> oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$OooO0OO */
    public static final class OooO0OO<T, K, V> extends AbstractC9508LiLi<T> {
        public static final Object OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9814LLIlLL<K, V>> f24080OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9577i1 f24081OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends K> f24082OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24083OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<Object, C9961OooO0Oo<K, V>> f24084OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<C9814LLIlLL<K, V>> f24085OooO00o = new ConcurrentLinkedQueue();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f24086OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24087OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f24088OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0 f24089OooO00o;
        public final AbstractC9847l1<? super T, ? extends V> OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final Queue<K> f24090OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final AtomicInteger f24091OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f24092OooO0O0;
        public volatile boolean OooO0OO;
        public final int o00oO0O;

        /* renamed from: rx.internal.operators.OperatorGroupBy$OooO0OO$OooO00o */
        public static class OooO00o<K> implements AbstractC6153iL1l<K> {
            public final Queue<K> OooO00o;

            public OooO00o(Queue<K> queue) {
                this.OooO00o = queue;
            }

            @Override // com.p118pd.sdk.AbstractC6153iL1l
            public void call(K k) {
                this.OooO00o.offer(k);
            }
        }

        public OooO0OO(AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r1, AbstractC9847l1<? super T, ? extends K> r2, AbstractC9847l1<? super T, ? extends V> r3, int i, boolean z, AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> r6) {
            this.f24080OooO00o = r1;
            this.f24082OooO00o = r2;
            this.OooO0O0 = r3;
            this.o00oO0O = i;
            this.f24092OooO0O0 = z;
            C9577i1 r12 = new C9577i1();
            this.f24081OooO00o = r12;
            r12.request((long) i);
            this.f24089OooO00o = new OooO0O0(this);
            this.f24086OooO00o = new AtomicBoolean();
            this.f24088OooO00o = new AtomicLong();
            this.f24087OooO00o = new AtomicInteger(1);
            this.f24091OooO0O0 = new AtomicInteger();
            if (r6 == null) {
                this.f24084OooO00o = new ConcurrentHashMap();
                this.f24090OooO0O0 = null;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.f24090OooO0O0 = concurrentLinkedQueue;
            this.f24084OooO00o = OooO00o(r6, new OooO00o(concurrentLinkedQueue));
        }

        private Map<Object, C9961OooO0Oo<K, V>> OooO00o(AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> r1, AbstractC6153iL1l<K> il1l) {
            return r1.call(il1l);
        }

        public void OooO0OO() {
            if (this.f24086OooO00o.compareAndSet(false, true) && this.f24087OooO00o.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public void OooO0Oo() {
            if (this.f24091OooO0O0.getAndIncrement() == 0) {
                Queue<C9814LLIlLL<K, V>> queue = this.f24085OooO00o;
                AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r1 = this.f24080OooO00o;
                int i = 1;
                while (!OooO00o(this.OooO0OO, queue.isEmpty(), r1, queue)) {
                    long j = this.f24088OooO00o.get();
                    long j2 = 0;
                    while (j2 != j) {
                        boolean z = this.OooO0OO;
                        C9814LLIlLL<K, V> poll = queue.poll();
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
                    if (j2 != 0) {
                        if (j != Long.MAX_VALUE) {
                            C6211iLli.OooO0O0(this.f24088OooO00o, j2);
                        }
                        this.f24081OooO00o.request(j2);
                    }
                    i = this.f24091OooO0O0.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0OO) {
                for (C9961OooO0Oo<K, V> oooO0Oo : this.f24084OooO00o.values()) {
                    oooO0Oo.OooO00o();
                }
                this.f24084OooO00o.clear();
                Queue<K> queue = this.f24090OooO0O0;
                if (queue != null) {
                    queue.clear();
                }
                this.OooO0OO = true;
                this.f24087OooO00o.decrementAndGet();
                OooO0Oo();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0OO) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.f24083OooO00o = th;
            this.OooO0OO = true;
            this.f24087OooO00o.decrementAndGet();
            OooO0Oo();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: rx.internal.operators.OperatorGroupBy$OooO0Oo */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            Object obj;
            if (!this.OooO0OO) {
                Queue<?> queue = this.f24085OooO00o;
                AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r1 = this.f24080OooO00o;
                try {
                    Object call = this.f24082OooO00o.call(t);
                    boolean z = false;
                    if (call != null) {
                        obj = call;
                    } else {
                        obj = OooO00o;
                    }
                    C9961OooO0Oo<K, V> oooO0Oo = this.f24084OooO00o.get(obj);
                    if (oooO0Oo == null) {
                        if (!this.f24086OooO00o.get()) {
                            oooO0Oo = C9961OooO0Oo.OooO00o(call, this.o00oO0O, this, this.f24092OooO0O0);
                            this.f24084OooO00o.put(obj, oooO0Oo);
                            this.f24087OooO00o.getAndIncrement();
                            z = true;
                        } else {
                            return;
                        }
                    }
                    try {
                        oooO0Oo.onNext(this.OooO0O0.call(t));
                        if (this.f24090OooO0O0 != null) {
                            while (true) {
                                K poll = this.f24090OooO0O0.poll();
                                if (poll == null) {
                                    break;
                                }
                                C9961OooO0Oo<K, V> oooO0Oo2 = this.f24084OooO00o.get(poll);
                                if (oooO0Oo2 != null) {
                                    oooO0Oo2.OooO00o();
                                }
                            }
                        }
                        if (z) {
                            queue.offer(oooO0Oo);
                            OooO0Oo();
                        }
                    } catch (Throwable th) {
                        unsubscribe();
                        OooO00o(r1, queue, th);
                    }
                } catch (Throwable th2) {
                    unsubscribe();
                    OooO00o(r1, queue, th2);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f24081OooO00o.OooO00o(r2);
        }

        public void OooO00o(long j) {
            if (j >= 0) {
                C6211iLli.OooO00o(this.f24088OooO00o, j);
                OooO0Oo();
                return;
            }
            throw new IllegalArgumentException("n >= 0 required but it was " + j);
        }

        public void OooO00o(K k) {
            if (k == null) {
                k = (K) OooO00o;
            }
            if (this.f24084OooO00o.remove(k) != null && this.f24087OooO00o.decrementAndGet() == 0) {
                unsubscribe();
            }
        }

        public void OooO00o(AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r2, Queue<?> queue, Throwable th) {
            queue.clear();
            ArrayList<C9961OooO0Oo> arrayList = new ArrayList(this.f24084OooO00o.values());
            this.f24084OooO00o.clear();
            Queue<K> queue2 = this.f24090OooO0O0;
            if (queue2 != null) {
                queue2.clear();
            }
            for (C9961OooO0Oo oooO0Oo : arrayList) {
                oooO0Oo.onError(th);
            }
            r2.onError(th);
        }

        public boolean OooO00o(boolean z, boolean z2, AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r4, Queue<?> queue) {
            if (!z) {
                return false;
            }
            Throwable th = this.f24083OooO00o;
            if (th != null) {
                OooO00o(r4, queue, th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.f24080OooO00o.onCompleted();
                return true;
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$State */
    public static final class State<T, K> extends AtomicInteger implements AbstractC9465L1l1, LlIiLii, C9349III.OooO00o<T> {
        public static final long serialVersionUID = -3852313036005250360L;
        public final AtomicReference<AbstractC9508LiLi<? super T>> actual;
        public final AtomicBoolean cancelled;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public final AtomicBoolean once;
        public final OooO0OO<?, K, T> parent;
        public final Queue<Object> queue = new ConcurrentLinkedQueue();
        public final AtomicLong requested;

        public State(int i, OooO0OO<?, K, T> oooO0OO, K k, boolean z) {
            this.parent = oooO0OO;
            this.key = k;
            this.delayError = z;
            this.cancelled = new AtomicBoolean();
            this.actual = new AtomicReference<>();
            this.once = new AtomicBoolean();
            this.requested = new AtomicLong();
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        public boolean checkTerminated(boolean z, boolean z2, AbstractC9508LiLi<? super T> r5, boolean z3) {
            if (this.cancelled.get()) {
                this.queue.clear();
                this.parent.OooO00o(this.key);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        r5.onError(th);
                        return true;
                    } else if (!z2) {
                        return false;
                    } else {
                        r5.onCompleted();
                        return true;
                    }
                } else if (!z2) {
                    return false;
                } else {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        r5.onError(th2);
                    } else {
                        r5.onCompleted();
                    }
                    return true;
                }
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                Queue<Object> queue2 = this.queue;
                boolean z = this.delayError;
                AbstractC9508LiLi<? super T> r2 = this.actual.get();
                int i = 1;
                while (true) {
                    if (r2 != null) {
                        if (!checkTerminated(this.done, queue2.isEmpty(), r2, z)) {
                            long j = this.requested.get();
                            long j2 = 0;
                            while (j2 != j) {
                                boolean z2 = this.done;
                                Object poll = queue2.poll();
                                boolean z3 = poll == null;
                                if (!checkTerminated(z2, z3, r2, z)) {
                                    if (z3) {
                                        break;
                                    }
                                    r2.onNext((Object) NotificationLite.OooO00o(poll));
                                    j2++;
                                } else {
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                if (j != Long.MAX_VALUE) {
                                    C6211iLli.OooO0O0(this.requested, j2);
                                }
                                this.parent.f24081OooO00o.request(j2);
                            }
                        } else {
                            return;
                        }
                    }
                    i = addAndGet(-i);
                    if (i != 0) {
                        if (r2 == null) {
                            r2 = this.actual.get();
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.cancelled.get();
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t) {
            if (t == null) {
                this.error = new NullPointerException();
                this.done = true;
            } else {
                this.queue.offer(NotificationLite.OooO0O0((Object) t));
            }
            drain();
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= required but it was " + j);
            } else if (j != 0) {
                C6211iLli.OooO00o(this.requested, j);
                drain();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (this.cancelled.compareAndSet(false, true) && getAndIncrement() == 0) {
                this.parent.OooO00o(this.key);
            }
        }

        public void call(AbstractC9508LiLi<? super T> r4) {
            if (this.once.compareAndSet(false, true)) {
                r4.add(this);
                r4.setProducer(this);
                this.actual.lazySet(r4);
                drain();
                return;
            }
            r4.onError(new IllegalStateException("Only one Subscriber allowed!"));
        }
    }

    public OperatorGroupBy(AbstractC9847l1<? super T, ? extends K> r7) {
        this(r7, UtilityFunctions.OooO0OO(), ll1i1l.o0ooOO0, false, null);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9814LLIlLL<K, V>> r9) {
        try {
            OooO0OO oooO0OO = new OooO0OO(r9, this.OooO00o, this.OooO0O0, this.o00oO0O, this.f24078OooO0O0, this.OooO0OO);
            r9.add(C9638ill.OooO00o(new OooO00o(oooO0OO)));
            r9.setProducer(oooO0OO.f24089OooO00o);
            return oooO0OO;
        } catch (Throwable th) {
            IIl11.OooO00o(th, r9);
            AbstractC9508LiLi<? super T> OooO00o2 = C6695lilIl.OooO00o();
            OooO00o2.unsubscribe();
            return OooO00o2;
        }
    }

    /* renamed from: rx.internal.operators.OperatorGroupBy$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9961OooO0Oo<K, T> extends C9814LLIlLL<K, T> {
        public final State<T, K> OooO00o;

        public C9961OooO0Oo(K k, State<T, K> state) {
            super(k, state);
            this.OooO00o = state;
        }

        public static <T, K> C9961OooO0Oo<K, T> OooO00o(K k, int i, OooO0OO<?, K, T> oooO0OO, boolean z) {
            return new C9961OooO0Oo<>(k, new State(i, oooO0OO, k, z));
        }

        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }

        @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9814LLIlLL
        public void OooO00o() {
            this.OooO00o.onComplete();
        }
    }

    public OperatorGroupBy(AbstractC9847l1<? super T, ? extends K> r7, AbstractC9847l1<? super T, ? extends V> r8) {
        this(r7, r8, ll1i1l.o0ooOO0, false, null);
    }

    public OperatorGroupBy(AbstractC9847l1<? super T, ? extends K> r7, AbstractC9847l1<? super T, ? extends V> r8, AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> r9) {
        this(r7, r8, ll1i1l.o0ooOO0, false, r9);
    }

    public OperatorGroupBy(AbstractC9847l1<? super T, ? extends K> r1, AbstractC9847l1<? super T, ? extends V> r2, int i, boolean z, AbstractC9847l1<AbstractC6153iL1l<K>, Map<K, Object>> r5) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
        this.o00oO0O = i;
        this.f24078OooO0O0 = z;
        this.OooO0OO = r5;
    }
}
