package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6021i1L;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9714lli;
import com.p118pd.sdk.C9818LLl1;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.ll1i1l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.CompositeException;

/* renamed from: rx.internal.operators.OnSubscribeCombineLatest */
public final class OnSubscribeCombineLatest<T, R> implements C9349III.OooO00o<R> {
    public final AbstractC6021i1L<? extends R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Iterable<? extends C9349III<? extends T>> f24036OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T>[] f24037OooO00o;
    public final boolean OooO0O0;
    public final int o00oO0O;

    /* renamed from: rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator */
    public static final class LatestCoordinator<T, R> extends AtomicInteger implements AbstractC9465L1l1, LlIiLii {
        public static final Object MISSING = new Object();
        public static final long serialVersionUID = 8567835998786448817L;
        public int active;
        public final AbstractC9508LiLi<? super R> actual;
        public final int bufferSize;
        public volatile boolean cancelled;
        public final AbstractC6021i1L<? extends R> combiner;
        public int complete;
        public final boolean delayError;
        public volatile boolean done;
        public final AtomicReference<Throwable> error = new AtomicReference<>();
        public final Object[] latest;
        public final C9818LLl1<Object> queue;
        public final AtomicLong requested = new AtomicLong();
        public final OooO00o<T, R>[] subscribers;

        public LatestCoordinator(AbstractC9508LiLi<? super R> r1, AbstractC6021i1L<? extends R> i1l, int i, int i2, boolean z) {
            this.actual = r1;
            this.combiner = i1l;
            this.bufferSize = i2;
            this.delayError = z;
            Object[] objArr = new Object[i];
            this.latest = objArr;
            Arrays.fill(objArr, MISSING);
            this.subscribers = new OooO00o[i];
            this.queue = new C9818LLl1<>(i2);
        }

        public void cancel(Queue<?> queue2) {
            queue2.clear();
            for (OooO00o<T, R> oooO00o : this.subscribers) {
                oooO00o.unsubscribe();
            }
        }

        public boolean checkTerminated(boolean z, boolean z2, AbstractC9508LiLi<?> r5, Queue<?> queue2, boolean z3) {
            if (this.cancelled) {
                cancel(queue2);
                return true;
            } else if (!z) {
                return false;
            } else {
                if (!z3) {
                    Throwable th = this.error.get();
                    if (th != null) {
                        cancel(queue2);
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
                    Throwable th2 = this.error.get();
                    if (th2 != null) {
                        r5.onError(th2);
                    } else {
                        r5.onCompleted();
                    }
                    return true;
                }
            }
        }

        public void combine(Object obj, int i) {
            boolean z;
            OooO00o<T, R> oooO00o = this.subscribers[i];
            synchronized (this) {
                int length = this.latest.length;
                Object obj2 = this.latest[i];
                int i2 = this.active;
                if (obj2 == MISSING) {
                    i2++;
                    this.active = i2;
                }
                int i3 = this.complete;
                if (obj == null) {
                    i3++;
                    this.complete = i3;
                } else {
                    this.latest[i] = NotificationLite.OooO00o(obj);
                }
                boolean z2 = false;
                z = i2 == length;
                if (i3 == length || (obj == null && obj2 == MISSING)) {
                    z2 = true;
                }
                if (z2) {
                    this.done = true;
                } else if (obj != null && z) {
                    this.queue.OooO00o(oooO00o, this.latest.clone());
                } else if (obj == null && this.error.get() != null && (obj2 == MISSING || !this.delayError)) {
                    this.done = true;
                }
            }
            if (z || obj == null) {
                drain();
            } else {
                oooO00o.OooO00o(1);
            }
        }

        public void drain() {
            long j;
            if (getAndIncrement() == 0) {
                C9818LLl1<Object> r8 = this.queue;
                AbstractC9508LiLi<? super R> r9 = this.actual;
                boolean z = this.delayError;
                AtomicLong atomicLong = this.requested;
                int i = 1;
                while (!checkTerminated(this.done, r8.isEmpty(), r9, r8, z)) {
                    long j2 = atomicLong.get();
                    long j3 = 0;
                    while (true) {
                        if (j3 == j2) {
                            j = j3;
                            break;
                        }
                        boolean z2 = this.done;
                        OooO00o oooO00o = (OooO00o) r8.peek();
                        boolean z3 = oooO00o == null;
                        if (!checkTerminated(z2, z3, r9, r8, z)) {
                            if (z3) {
                                j = j3;
                                break;
                            }
                            r8.poll();
                            Object[] objArr = (Object[]) r8.poll();
                            if (objArr == null) {
                                this.cancelled = true;
                                cancel(r8);
                                r9.onError(new IllegalStateException("Broken queue?! Sender received but not the array."));
                                return;
                            }
                            try {
                                r9.onNext((Object) this.combiner.call(objArr));
                                oooO00o.OooO00o(1);
                                j3++;
                            } catch (Throwable th) {
                                this.cancelled = true;
                                cancel(r8);
                                r9.onError(th);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    if (!(j == 0 || j2 == Long.MAX_VALUE)) {
                        C6211iLli.OooO0O0(atomicLong, j);
                    }
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.cancelled;
        }

        public void onError(Throwable th) {
            Throwable th2;
            Throwable th3;
            AtomicReference<Throwable> atomicReference = this.error;
            do {
                th2 = atomicReference.get();
                if (th2 == null) {
                    th3 = th;
                } else if (th2 instanceof CompositeException) {
                    ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                    arrayList.add(th);
                    th3 = new CompositeException(arrayList);
                } else {
                    th3 = new CompositeException(Arrays.asList(th2, th));
                }
            } while (!atomicReference.compareAndSet(th2, th3));
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

        public void subscribe(C9349III<? extends T>[] r6) {
            OooO00o<T, R>[] oooO00oArr = this.subscribers;
            int length = oooO00oArr.length;
            for (int i = 0; i < length; i++) {
                oooO00oArr[i] = new OooO00o<>(this, i);
            }
            lazySet(0);
            this.actual.add(this);
            this.actual.setProducer(this);
            for (int i2 = 0; i2 < length && !this.cancelled; i2++) {
                r6[i2].OooO00o((AbstractC9508LiLi<? super Object>) oooO00oArr[i2]);
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (!this.cancelled) {
                this.cancelled = true;
                if (getAndIncrement() == 0) {
                    cancel(this.queue);
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OnSubscribeCombineLatest$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC9508LiLi<T> {
        public final LatestCoordinator<T, R> OooO00o;
        public boolean OooO0O0;
        public final int o00oO0O;

        public OooO00o(LatestCoordinator<T, R> latestCoordinator, int i) {
            this.OooO00o = latestCoordinator;
            this.o00oO0O = i;
            request((long) latestCoordinator.bufferSize);
        }

        public void OooO00o(long j) {
            request(j);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.combine(null, this.o00oO0O);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO00o.onError(th);
            this.OooO0O0 = true;
            this.OooO00o.combine(null, this.o00oO0O);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                this.OooO00o.combine(NotificationLite.OooO0O0((Object) t), this.o00oO0O);
            }
        }
    }

    public OnSubscribeCombineLatest(Iterable<? extends C9349III<? extends T>> iterable, AbstractC6021i1L<? extends R> i1l) {
        this(null, iterable, i1l, ll1i1l.o0ooOO0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: java.util.List */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004d  */
    /* renamed from: OooO00o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void call(com.p118pd.sdk.AbstractC9508LiLi<? super R> r9) {
        /*
            r8 = this;
            com.pd.sdk.丨III<? extends T>[] r0 = r8.f24037OooO00o
            if (r0 != 0) goto L_0x0045
            java.lang.Iterable<? extends com.pd.sdk.丨III<? extends T>> r0 = r8.f24036OooO00o
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L_0x001a
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            com.pd.sdk.丨III[] r1 = new com.p118pd.sdk.C9349III[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.pd.sdk.丨III[] r0 = (com.p118pd.sdk.C9349III[]) r0
            int r1 = r0.length
            goto L_0x0046
        L_0x001a:
            r1 = 8
            com.pd.sdk.丨III[] r1 = new com.p118pd.sdk.C9349III[r1]
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0024:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0042
            java.lang.Object r4 = r0.next()
            com.pd.sdk.丨III r4 = (com.p118pd.sdk.C9349III) r4
            int r5 = r1.length
            if (r3 != r5) goto L_0x003c
            int r5 = r3 >> 2
            int r5 = r5 + r3
            com.pd.sdk.丨III[] r5 = new com.p118pd.sdk.C9349III[r5]
            java.lang.System.arraycopy(r1, r2, r5, r2, r3)
            r1 = r5
        L_0x003c:
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L_0x0024
        L_0x0042:
            r0 = r1
            r4 = r3
            goto L_0x0047
        L_0x0045:
            int r1 = r0.length
        L_0x0046:
            r4 = r1
        L_0x0047:
            if (r4 != 0) goto L_0x004d
            r9.onCompleted()
            return
        L_0x004d:
            rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator r7 = new rx.internal.operators.OnSubscribeCombineLatest$LatestCoordinator
            com.pd.sdk.i1L<? extends R> r3 = r8.OooO00o
            int r5 = r8.o00oO0O
            boolean r6 = r8.OooO0O0
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r7.subscribe(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OnSubscribeCombineLatest.call(com.pd.sdk.丨LiL丨丨i):void");
    }

    public OnSubscribeCombineLatest(C9349III<? extends T>[] r1, Iterable<? extends C9349III<? extends T>> iterable, AbstractC6021i1L<? extends R> i1l, int i, boolean z) {
        this.f24037OooO00o = r1;
        this.f24036OooO00o = iterable;
        this.OooO00o = i1l;
        this.o00oO0O = i;
        this.OooO0O0 = z;
    }
}
