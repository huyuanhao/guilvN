package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C5782LlI;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIlIIiI1;
import com.p118pd.sdk.LLIIL1I;
import com.p118pd.sdk.i1Il1LL;
import com.p118pd.sdk.iI1L1i;
import com.p118pd.sdk.ll1i1l;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.MissingBackpressureException;
import p293rx.exceptions.OnErrorThrowable;
import p293rx.internal.util.ScalarSynchronousObservable;
import p293rx.internal.util.atomic.SpscExactAtomicArrayQueue;

/* renamed from: rx.internal.operators.OperatorMerge */
public final class OperatorMerge<T> implements C9349III.OooO0O0<T, C9349III<? extends T>> {
    public final boolean OooO0O0;
    public final int o00oO0O;

    /* renamed from: rx.internal.operators.OperatorMerge$MergeProducer */
    public static final class MergeProducer<T> extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = -1214379189873595503L;
        public final C9962OooO0Oo<T> subscriber;

        public MergeProducer(C9962OooO0Oo<T> oooO0Oo) {
            this.subscriber = oooO0Oo;
        }

        public long produced(int i) {
            return addAndGet((long) (-i));
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j > 0) {
                if (get() != Long.MAX_VALUE) {
                    C6211iLli.OooO00o(this, j);
                    this.subscriber.OooO0OO();
                }
            } else if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required");
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$OooO00o */
    public static final class OooO00o {
        public static final OperatorMerge<Object> OooO00o = new OperatorMerge<>(true, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$OooO0O0 */
    public static final class OooO0O0 {
        public static final OperatorMerge<Object> OooO00o = new OperatorMerge<>(false, Integer.MAX_VALUE);
    }

    /* renamed from: rx.internal.operators.OperatorMerge$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<T> {
        public static final int o0ooOO0 = (ll1i1l.o0ooOO0 / 4);
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile ll1i1l f24093OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9962OooO0Oo<T> f24094OooO00o;
        public volatile boolean OooO0O0;
        public int o00oO0O;

        public OooO0OO(C9962OooO0Oo<T> oooO0Oo, long j) {
            this.f24094OooO00o = oooO0Oo;
            this.OooO00o = j;
        }

        public void OooO00o(long j) {
            int i = this.o00oO0O - ((int) j);
            if (i > o0ooOO0) {
                this.o00oO0O = i;
                return;
            }
            int i2 = ll1i1l.o0ooOO0;
            this.o00oO0O = i2;
            int i3 = i2 - i;
            if (i3 > 0) {
                request((long) i3);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0O0 = true;
            this.f24094OooO00o.OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO0O0 = true;
            this.f24094OooO00o.m23001OooO00o().offer(th);
            this.f24094OooO00o.OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f24094OooO00o.OooO0O0(this, t);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            int i = ll1i1l.o0ooOO0;
            this.o00oO0O = i;
            request((long) i);
        }
    }

    public OperatorMerge(boolean z, int i) {
        this.OooO0O0 = z;
        this.o00oO0O = i;
    }

    public static <T> OperatorMerge<T> OooO00o(boolean z) {
        return z ? (OperatorMerge<T>) OooO00o.OooO00o : (OperatorMerge<T>) OooO0O0.OooO00o;
    }

    public static <T> OperatorMerge<T> OooO00o(boolean z, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxConcurrent > 0 required but it was " + i);
        } else if (i == Integer.MAX_VALUE) {
            return OooO00o(z);
        } else {
            return new OperatorMerge<>(z, i);
        }
    }

    /* renamed from: rx.internal.operators.OperatorMerge$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9962OooO0Oo<T> extends AbstractC9508LiLi<C9349III<? extends T>> {
        public static final OooO0OO<?>[] OooO0O0 = new OooO0OO[0];
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile IIlIIiI1 f24095OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f24096OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f24097OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile Queue<Object> f24098OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile ConcurrentLinkedQueue<Throwable> f24099OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public MergeProducer<T> f24100OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile OooO0OO<?>[] f24101OooO00o = OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f24102OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f24103OooO0O0;
        public volatile boolean OooO0OO;
        public boolean OooO0Oo;
        public boolean OooO0o0;
        public final int o00oO0O;
        public int o0ooOO0;
        public final int o0ooOOo;
        public int o0ooOoO;

        public C9962OooO0Oo(AbstractC9508LiLi<? super T> r1, boolean z, int i) {
            this.f24096OooO00o = r1;
            this.f24103OooO0O0 = z;
            this.o00oO0O = i;
            if (i == Integer.MAX_VALUE) {
                this.o0ooOOo = Integer.MAX_VALUE;
                request(Long.MAX_VALUE);
                return;
            }
            this.o0ooOOo = Math.max(1, i >> 1);
            request((long) i);
        }

        private void OooO0o() {
            ArrayList arrayList = new ArrayList(this.f24099OooO00o);
            if (arrayList.size() == 1) {
                this.f24096OooO00o.onError((Throwable) arrayList.get(0));
            } else {
                this.f24096OooO00o.onError(new CompositeException(arrayList));
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public Queue<Throwable> m23001OooO00o() {
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f24099OooO00o;
            if (concurrentLinkedQueue == null) {
                synchronized (this) {
                    concurrentLinkedQueue = this.f24099OooO00o;
                    if (concurrentLinkedQueue == null) {
                        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
                        this.f24099OooO00o = concurrentLinkedQueue;
                    }
                }
            }
            return concurrentLinkedQueue;
        }

        public void OooO0O0(OooO0OO<T> oooO0OO) {
            ll1i1l r0 = oooO0OO.f24093OooO00o;
            if (r0 != null) {
                r0.m17949OooO0O0();
            }
            this.f24095OooO00o.OooO0O0(oooO0OO);
            synchronized (this.f24097OooO00o) {
                OooO0OO<?>[] oooO0OOArr = this.f24101OooO00o;
                int length = oooO0OOArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (oooO0OO.equals(oooO0OOArr[i2])) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.f24101OooO00o = OooO0O0;
                        return;
                    }
                    OooO0OO<?>[] oooO0OOArr2 = new OooO0OO[(length - 1)];
                    System.arraycopy(oooO0OOArr, 0, oooO0OOArr2, 0, i);
                    System.arraycopy(oooO0OOArr, i + 1, oooO0OOArr2, i, (length - i) - 1);
                    this.f24101OooO00o = oooO0OOArr2;
                }
            }
        }

        public void OooO0OO() {
            synchronized (this) {
                if (this.OooO0Oo) {
                    this.OooO0o0 = true;
                    return;
                }
                this.OooO0Oo = true;
                OooO0o0();
            }
        }

        public void OooO0Oo() {
            int i = this.o0ooOoO + 1;
            if (i == this.o0ooOOo) {
                this.o0ooOoO = 0;
                OooO00o((long) i);
                return;
            }
            this.o0ooOoO = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:148:0x0195, code lost:
            r0 = th;
         */
        /* JADX WARNING: Removed duplicated region for block: B:153:0x019d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0o0() {
            /*
            // Method dump skipped, instructions count: 424
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorMerge.C9962OooO0Oo.OooO0o0():void");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0OO = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            m23001OooO00o().offer(th);
            this.OooO0OO = true;
            OooO0OO();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            OooO00o((C9349III) ((C9349III) obj));
        }

        public IIlIIiI1 OooO00o() {
            IIlIIiI1 iIlIIiI1;
            IIlIIiI1 iIlIIiI12 = this.f24095OooO00o;
            if (iIlIIiI12 != null) {
                return iIlIIiI12;
            }
            boolean z = false;
            synchronized (this) {
                iIlIIiI1 = this.f24095OooO00o;
                if (iIlIIiI1 == null) {
                    IIlIIiI1 iIlIIiI13 = new IIlIIiI1();
                    this.f24095OooO00o = iIlIIiI13;
                    iIlIIiI1 = iIlIIiI13;
                    z = true;
                }
            }
            if (z) {
                add(iIlIIiI1);
            }
            return iIlIIiI1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: rx.internal.operators.OperatorMerge$OooO0Oo<T> */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO00o(C9349III<? extends T> r6) {
            if (r6 != null) {
                if (r6 == C9349III.OooOoo0()) {
                    OooO0Oo();
                } else if (r6 instanceof ScalarSynchronousObservable) {
                    OooO0O0(((ScalarSynchronousObservable) r6).OooO00o());
                } else {
                    long j = this.OooO00o;
                    this.OooO00o = 1 + j;
                    OooO0OO oooO0OO = new OooO0OO(this, j);
                    OooO00o(oooO0OO);
                    r6.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0OO);
                    OooO0OO();
                }
            }
        }

        public void OooO0O0(OooO0OO<T> oooO0OO, T t) {
            long j = this.f24100OooO00o.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.f24100OooO00o.get();
                    if (!this.OooO0Oo && j != 0) {
                        this.OooO0Oo = true;
                        z = true;
                    }
                }
            }
            if (z) {
                ll1i1l r2 = oooO0OO.f24093OooO00o;
                if (r2 == null || r2.m17945OooO00o()) {
                    OooO00o(oooO0OO, t, j);
                    return;
                }
                OooO00o(oooO0OO, t);
                OooO0o0();
                return;
            }
            OooO00o(oooO0OO, t);
            OooO0OO();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: rx.internal.operators.OperatorMerge$OooO0OO<?>[] */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO00o(OooO0OO<T> oooO0OO) {
            OooO00o().OooO00o(oooO0OO);
            synchronized (this.f24097OooO00o) {
                OooO0OO<?>[] oooO0OOArr = this.f24101OooO00o;
                int length = oooO0OOArr.length;
                OooO0OO<?>[] oooO0OOArr2 = new OooO0OO[(length + 1)];
                System.arraycopy(oooO0OOArr, 0, oooO0OOArr2, 0, length);
                oooO0OOArr2[length] = oooO0OO;
                this.f24101OooO00o = oooO0OOArr2;
            }
        }

        public void OooO0O0(T t) {
            long j = this.f24100OooO00o.get();
            boolean z = false;
            if (j != 0) {
                synchronized (this) {
                    j = this.f24100OooO00o.get();
                    if (!this.OooO0Oo && j != 0) {
                        this.OooO0Oo = true;
                        z = true;
                    }
                }
            }
            if (z) {
                Queue<Object> queue = this.f24098OooO00o;
                if (queue == null || queue.isEmpty()) {
                    OooO00o(t, j);
                    return;
                }
                OooO00o((Object) t);
                OooO0o0();
                return;
            }
            OooO00o((Object) t);
            OooO0OO();
        }

        public void OooO00o(OooO0OO<T> oooO0OO, T t) {
            ll1i1l r0 = oooO0OO.f24093OooO00o;
            if (r0 == null) {
                r0 = ll1i1l.OooO0O0();
                oooO0OO.add(r0);
                oooO0OO.f24093OooO00o = r0;
            }
            try {
                r0.m17944OooO00o(NotificationLite.OooO0O0((Object) t));
            } catch (MissingBackpressureException e) {
                oooO0OO.unsubscribe();
                oooO0OO.onError(e);
            } catch (IllegalStateException e2) {
                if (!oooO0OO.isUnsubscribed()) {
                    oooO0OO.unsubscribe();
                    oooO0OO.onError(e2);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x004a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(p293rx.internal.operators.OperatorMerge.OooO0OO<T> r5, T r6, long r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                com.pd.sdk.丨LiL丨丨i<? super T> r2 = r4.f24096OooO00o     // Catch:{ all -> 0x0008 }
                r2.onNext(r6)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r6 = move-exception
                boolean r2 = r4.f24103OooO0O0     // Catch:{ all -> 0x0046 }
                if (r2 != 0) goto L_0x0019
                com.p118pd.sdk.IIl11.m15447OooO00o(r6)     // Catch:{ all -> 0x0046 }
                r5.unsubscribe()     // Catch:{ all -> 0x0017 }
                r5.onError(r6)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0048
            L_0x0019:
                java.util.Queue r2 = r4.m23001OooO00o()
                r2.offer(r6)
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r6 == 0) goto L_0x002e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r6 = r4.f24100OooO00o
                r6.produced(r0)
            L_0x002e:
                r6 = 1
                r5.OooO00o(r6)
                monitor-enter(r4)
                boolean r5 = r4.OooO0o0     // Catch:{ all -> 0x0043 }
                if (r5 != 0) goto L_0x003c
                r4.OooO0Oo = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                return
            L_0x003c:
                r4.OooO0o0 = r1     // Catch:{ all -> 0x0043 }
                monitor-exit(r4)     // Catch:{ all -> 0x0043 }
                r4.OooO0o0()
                return
            L_0x0043:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x0046:
                r5 = move-exception
                r0 = 0
            L_0x0048:
                if (r0 != 0) goto L_0x0052
                monitor-enter(r4)
                r4.OooO0Oo = r1     // Catch:{ all -> 0x004f }
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                goto L_0x0052
            L_0x004f:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x004f }
                throw r5
            L_0x0052:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorMerge.C9962OooO0Oo.OooO00o(rx.internal.operators.OperatorMerge$OooO0OO, java.lang.Object, long):void");
        }

        public void OooO00o(long j) {
            request(j);
        }

        public void OooO00o(T t) {
            Queue<Object> queue;
            Queue<Object> queue2 = this.f24098OooO00o;
            if (queue2 == null) {
                int i = this.o00oO0O;
                if (i == Integer.MAX_VALUE) {
                    queue2 = new C5782LlI<>(ll1i1l.o0ooOO0);
                } else {
                    if (!LLIIL1I.m16189OooO00o(i)) {
                        queue = new SpscExactAtomicArrayQueue<>(i);
                    } else if (C11LI1.OooO00o()) {
                        queue = new iI1L1i<>(i);
                    } else {
                        queue = new i1Il1LL<>(i);
                    }
                    queue2 = queue;
                }
                this.f24098OooO00o = queue2;
            }
            if (!queue2.offer(NotificationLite.OooO0O0((Object) t))) {
                unsubscribe();
                onError(OnErrorThrowable.addValueAsLastCause(new MissingBackpressureException(), t));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0055  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(T r5, long r6) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                com.pd.sdk.丨LiL丨丨i<? super T> r2 = r4.f24096OooO00o     // Catch:{ all -> 0x0008 }
                r2.onNext(r5)     // Catch:{ all -> 0x0008 }
                goto L_0x0020
            L_0x0008:
                r5 = move-exception
                boolean r2 = r4.f24103OooO0O0     // Catch:{ all -> 0x0051 }
                if (r2 != 0) goto L_0x0019
                com.p118pd.sdk.IIl11.m15447OooO00o(r5)     // Catch:{ all -> 0x0051 }
                r4.unsubscribe()     // Catch:{ all -> 0x0017 }
                r4.onError(r5)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r5 = move-exception
                goto L_0x0053
            L_0x0019:
                java.util.Queue r2 = r4.m23001OooO00o()
                r2.offer(r5)
            L_0x0020:
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r5 == 0) goto L_0x002e
                rx.internal.operators.OperatorMerge$MergeProducer<T> r5 = r4.f24100OooO00o
                r5.produced(r0)
            L_0x002e:
                int r5 = r4.o0ooOoO
                int r5 = r5 + r0
                int r6 = r4.o0ooOOo
                if (r5 != r6) goto L_0x003c
                r4.o0ooOoO = r1
                long r5 = (long) r5
                r4.OooO00o(r5)
                goto L_0x003e
            L_0x003c:
                r4.o0ooOoO = r5
            L_0x003e:
                monitor-enter(r4)
                boolean r5 = r4.OooO0o0     // Catch:{ all -> 0x004e }
                if (r5 != 0) goto L_0x0047
                r4.OooO0Oo = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                return
            L_0x0047:
                r4.OooO0o0 = r1     // Catch:{ all -> 0x004e }
                monitor-exit(r4)     // Catch:{ all -> 0x004e }
                r4.OooO0o0()
                return
            L_0x004e:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            L_0x0051:
                r5 = move-exception
                r0 = 0
            L_0x0053:
                if (r0 != 0) goto L_0x005d
                monitor-enter(r4)
                r4.OooO0Oo = r1     // Catch:{ all -> 0x005a }
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                goto L_0x005d
            L_0x005a:
                r5 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x005a }
                throw r5
            L_0x005d:
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorMerge.C9962OooO0Oo.OooO00o(java.lang.Object, long):void");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23002OooO00o() {
            if (this.f24096OooO00o.isUnsubscribed()) {
                return true;
            }
            ConcurrentLinkedQueue<Throwable> concurrentLinkedQueue = this.f24099OooO00o;
            if (this.f24103OooO0O0 || concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
                return false;
            }
            try {
                OooO0o();
                return true;
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<C9349III<? extends T>> call(AbstractC9508LiLi<? super T> r4) {
        C9962OooO0Oo oooO0Oo = new C9962OooO0Oo(r4, this.OooO0O0, this.o00oO0O);
        MergeProducer<T> mergeProducer = new MergeProducer<>(oooO0Oo);
        oooO0Oo.f24100OooO00o = mergeProducer;
        r4.add(oooO0Oo);
        r4.setProducer(mergeProducer);
        return oooO0Oo;
    }
}
