package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C6211iLli;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.IIl11;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.i1Il1LL;
import com.p118pd.sdk.iI1L1i;
import com.p118pd.sdk.liii1l;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.OperatorEagerConcatMap */
public final class OperatorEagerConcatMap<T, R> implements C9349III.OooO0O0<R, T> {
    public final AbstractC9847l1<? super T, ? extends C9349III<? extends R>> OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$EagerOuterProducer */
    public static final class EagerOuterProducer extends AtomicLong implements AbstractC9465L1l1 {
        public static final long serialVersionUID = -657299606803478389L;
        public final OooO0O0<?, ?> parent;

        public EagerOuterProducer(OooO0O0<?, ?> oooO0O0) {
            this.parent = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j < 0) {
                throw new IllegalStateException("n >= 0 required but it was " + j);
            } else if (j > 0) {
                C6211iLli.OooO00o(this, j);
                this.parent.OooO0Oo();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public Throwable OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f24070OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0<?, T> f24071OooO00o;
        public volatile boolean OooO0O0;

        public OooO00o(OooO0O0<?, T> oooO0O0, int i) {
            Queue<Object> queue;
            this.f24071OooO00o = oooO0O0;
            if (C11LI1.OooO00o()) {
                queue = new iI1L1i<>(i);
            } else {
                queue = new i1Il1LL<>(i);
            }
            this.f24070OooO00o = queue;
            request((long) i);
        }

        public void OooO00o(long j) {
            request(j);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0O0 = true;
            this.f24071OooO00o.OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o = th;
            this.OooO0O0 = true;
            this.f24071OooO00o.OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f24070OooO00o.offer(NotificationLite.OooO0O0((Object) t));
            this.f24071OooO00o.OooO0Oo();
        }
    }

    /* renamed from: rx.internal.operators.OperatorEagerConcatMap$OooO0O0 */
    public static final class OooO0O0<T, R> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super R> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super T, ? extends C9349III<? extends R>> f24072OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f24073OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<OooO00o<R>> f24074OooO00o = new LinkedList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicInteger f24075OooO00o = new AtomicInteger();

        /* renamed from: OooO00o  reason: collision with other field name */
        public EagerOuterProducer f24076OooO00o;
        public volatile boolean OooO0O0;
        public volatile boolean OooO0OO;
        public final int o00oO0O;

        /* renamed from: rx.internal.operators.OperatorEagerConcatMap$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.OooO0OO = true;
                if (OooO0O0.this.f24075OooO00o.getAndIncrement() == 0) {
                    OooO0O0.this.OooO0OO();
                }
            }
        }

        public OooO0O0(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1, int i, int i2, AbstractC9508LiLi<? super R> r4) {
            this.f24072OooO00o = r1;
            this.o00oO0O = i;
            this.OooO00o = r4;
            request(i2 == Integer.MAX_VALUE ? Long.MAX_VALUE : (long) i2);
        }

        public void OooO0OO() {
            ArrayList<LlIiLii> arrayList;
            synchronized (this.f24074OooO00o) {
                arrayList = new ArrayList(this.f24074OooO00o);
                this.f24074OooO00o.clear();
            }
            for (LlIiLii llIiLii : arrayList) {
                llIiLii.unsubscribe();
            }
        }

        public void OooO0Oo() {
            OooO00o<R> peek;
            int i;
            if (this.f24075OooO00o.getAndIncrement() == 0) {
                EagerOuterProducer eagerOuterProducer = this.f24076OooO00o;
                AbstractC9508LiLi<? super R> r2 = this.OooO00o;
                int i2 = 1;
                while (!this.OooO0OO) {
                    boolean z = this.OooO0O0;
                    synchronized (this.f24074OooO00o) {
                        peek = this.f24074OooO00o.peek();
                    }
                    boolean z2 = false;
                    boolean z3 = peek == null;
                    if (z) {
                        Throwable th = this.f24073OooO00o;
                        if (th != null) {
                            OooO0OO();
                            r2.onError(th);
                            return;
                        } else if (z3) {
                            r2.onCompleted();
                            return;
                        }
                    }
                    if (!z3) {
                        long j = eagerOuterProducer.get();
                        Queue<Object> queue = peek.f24070OooO00o;
                        long j2 = 0;
                        while (true) {
                            boolean z4 = peek.OooO0O0;
                            Object peek2 = queue.peek();
                            i = i2;
                            boolean z5 = peek2 == null;
                            if (z4) {
                                Throwable th2 = peek.OooO00o;
                                if (th2 == null) {
                                    if (z5) {
                                        synchronized (this.f24074OooO00o) {
                                            this.f24074OooO00o.poll();
                                        }
                                        peek.unsubscribe();
                                        request(1);
                                        z2 = true;
                                        break;
                                    }
                                } else {
                                    OooO0OO();
                                    r2.onError(th2);
                                    return;
                                }
                            }
                            if (z5 || j == j2) {
                                break;
                            }
                            queue.poll();
                            try {
                                r2.onNext((Object) NotificationLite.OooO00o(peek2));
                                j2++;
                                i2 = i;
                            } catch (Throwable th3) {
                                IIl11.OooO00o(th3, r2, peek2);
                                return;
                            }
                        }
                        if (j2 != 0) {
                            if (j != Long.MAX_VALUE) {
                                C6211iLli.OooO0O0(eagerOuterProducer, j2);
                            }
                            if (!z2) {
                                peek.OooO00o(j2);
                            }
                        }
                        if (z2) {
                            i2 = i;
                        }
                    } else {
                        i = i2;
                    }
                    i2 = this.f24075OooO00o.addAndGet(-i);
                    if (i2 == 0) {
                        return;
                    }
                }
                OooO0OO();
            }
        }

        public void OooO0o0() {
            this.f24076OooO00o = new EagerOuterProducer(this);
            add(C9638ill.OooO00o(new OooO00o()));
            this.OooO00o.add(this);
            this.OooO00o.setProducer(this.f24076OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0O0 = true;
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f24073OooO00o = th;
            this.OooO0O0 = true;
            OooO0Oo();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r3.OooO0OO == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
            r0.OooO0O0((com.p118pd.sdk.AbstractC9508LiLi) r4);
            OooO0Oo();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r4) {
            /*
                r3 = this;
                com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> r0 = r3.f24072OooO00o     // Catch:{ all -> 0x0032 }
                java.lang.Object r0 = r0.call(r4)     // Catch:{ all -> 0x0032 }
                com.pd.sdk.丨III r0 = (com.p118pd.sdk.C9349III) r0     // Catch:{ all -> 0x0032 }
                boolean r4 = r3.OooO0OO
                if (r4 == 0) goto L_0x000d
                return
            L_0x000d:
                rx.internal.operators.OperatorEagerConcatMap$OooO00o r4 = new rx.internal.operators.OperatorEagerConcatMap$OooO00o
                int r1 = r3.o00oO0O
                r4.<init>(r3, r1)
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$OooO00o<R>> r1 = r3.f24074OooO00o
                monitor-enter(r1)
                boolean r2 = r3.OooO0OO     // Catch:{ all -> 0x002f }
                if (r2 == 0) goto L_0x001d
                monitor-exit(r1)     // Catch:{ all -> 0x002f }
                return
            L_0x001d:
                java.util.Queue<rx.internal.operators.OperatorEagerConcatMap$OooO00o<R>> r2 = r3.f24074OooO00o     // Catch:{ all -> 0x002f }
                r2.add(r4)     // Catch:{ all -> 0x002f }
                monitor-exit(r1)     // Catch:{ all -> 0x002f }
                boolean r1 = r3.OooO0OO
                if (r1 == 0) goto L_0x0028
                return
            L_0x0028:
                r0.OooO0O0(r4)
                r3.OooO0Oo()
                return
            L_0x002f:
                r4 = move-exception
                monitor-exit(r1)
                throw r4
            L_0x0032:
                r0 = move-exception
                com.pd.sdk.丨LiL丨丨i<? super R> r1 = r3.OooO00o
                com.p118pd.sdk.IIl11.OooO00o(r0, r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorEagerConcatMap.OooO0O0.onNext(java.lang.Object):void");
        }
    }

    public OperatorEagerConcatMap(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1, int i, int i2) {
        this.OooO00o = r1;
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super R> r5) {
        OooO0O0 oooO0O0 = new OooO0O0(this.OooO00o, this.o00oO0O, this.o0ooOO0, r5);
        oooO0O0.OooO0o0();
        return oooO0O0;
    }
}
