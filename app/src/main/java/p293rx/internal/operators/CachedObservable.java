package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.IIII;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.iLIiLILI;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: rx.internal.operators.CachedObservable */
public final class CachedObservable<T> extends C9349III<T> {
    public final OooO00o<T> OooO00o;

    /* renamed from: rx.internal.operators.CachedObservable$CachedSubscribe */
    public static final class CachedSubscribe<T> extends AtomicBoolean implements C9349III.OooO00o<T> {
        public static final long serialVersionUID = -2817751667698696782L;
        public final OooO00o<T> state;

        public CachedSubscribe(OooO00o<T> oooO00o) {
            this.state = oooO00o;
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        public void call(AbstractC9508LiLi<? super T> r3) {
            ReplayProducer<T> replayProducer = new ReplayProducer<>(r3, this.state);
            this.state.OooO00o((ReplayProducer) replayProducer);
            r3.add(replayProducer);
            r3.setProducer(replayProducer);
            if (!get() && compareAndSet(false, true)) {
                this.state.OooO00o();
            }
        }
    }

    /* renamed from: rx.internal.operators.CachedObservable$ReplayProducer */
    public static final class ReplayProducer<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii {
        public static final long serialVersionUID = -2557562030197141021L;
        public final AbstractC9508LiLi<? super T> child;
        public Object[] currentBuffer;
        public int currentIndexInBuffer;
        public boolean emitting;
        public int index;
        public boolean missed;
        public final OooO00o<T> state;

        public ReplayProducer(AbstractC9508LiLi<? super T> r1, OooO00o<T> oooO00o) {
            this.child = r1;
            this.state = oooO00o;
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() < 0;
        }

        public long produced(long j) {
            return addAndGet(-j);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2 = r15.child;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
            r3 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            if (r3 >= 0) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001b, code lost:
            r7 = r15.state.OooO0o0();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
            if (r7 == 0) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
            r8 = r15.currentBuffer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0025, code lost:
            if (r8 != null) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0027, code lost:
            r8 = r15.state.OooO00o();
            r15.currentBuffer = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
            r9 = r8.length - 1;
            r10 = r15.index;
            r11 = r15.currentIndexInBuffer;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (r3 != 0) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            r3 = r8[r11];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
            if (p293rx.internal.operators.NotificationLite.m22999OooO00o(r3) == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0041, code lost:
            r2.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0049, code lost:
            r1 = r2;
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0051, code lost:
            if (p293rx.internal.operators.NotificationLite.m23000OooO0O0(r3) == false) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0053, code lost:
            r2.onError(p293rx.internal.operators.NotificationLite.m22998OooO00o(r3));
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005d, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0060, code lost:
            if (r3 <= 0) goto L_0x00c3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0062, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0063, code lost:
            if (r10 >= r7) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0067, code lost:
            if (r3 <= 0) goto L_0x00b2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x006d, code lost:
            if (r2.isUnsubscribed() == false) goto L_0x0070;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x006f, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0070, code lost:
            if (r11 != r9) goto L_0x0077;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0072, code lost:
            r8 = (java.lang.Object[]) r8[r9];
            r11 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
            r13 = r8[r11];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x007d, code lost:
            if (p293rx.internal.operators.NotificationLite.OooO00o(r2, r13) == false) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0082, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0083, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0084, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0086, code lost:
            r11 = r11 + 1;
            r10 = r10 + 1;
            r3 = r3 - 1;
            r12 = r12 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0090, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0091, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
            com.p118pd.sdk.IIl11.m15447OooO00o(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x0095, code lost:
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x009c, code lost:
            if (p293rx.internal.operators.NotificationLite.m23000OooO0O0(r13) == false) goto L_0x009e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a4, code lost:
            r2.onError(p293rx.exceptions.OnErrorThrowable.addValueAsLastCause(r3, p293rx.internal.operators.NotificationLite.OooO00o(r13)));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b0, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b6, code lost:
            if (r2.isUnsubscribed() == false) goto L_0x00b9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b8, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b9, code lost:
            r15.index = r10;
            r15.currentIndexInBuffer = r11;
            r15.currentBuffer = r8;
            produced((long) r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x00c3, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c6, code lost:
            if (r15.missed != false) goto L_0x00cc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c8, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cb, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00cc, code lost:
            r15.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00ce, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d1, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:0x00d2, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:81:0x00d3, code lost:
            monitor-exit(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x00d5, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x00d6, code lost:
            r4 = r1;
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x00d9, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x00db, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x00dc, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x00dd, code lost:
            if (r4 == false) goto L_0x00df;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x00df, code lost:
            monitor-enter(r15);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
            r15.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x00e7, code lost:
            throw r1;
         */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void replay() {
            /*
            // Method dump skipped, instructions count: 237
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.CachedObservable.ReplayProducer.replay():void");
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 >= 0) {
                    j3 = j2 + j;
                    if (j3 < 0) {
                        j3 = Long.MAX_VALUE;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j2, j3));
            replay();
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (get() >= 0 && getAndSet(-1) >= 0) {
                this.state.OooO0O0(this);
            }
        }
    }

    public CachedObservable(C9349III.OooO00o<T> oooO00o, OooO00o<T> oooO00o2) {
        super(oooO00o);
        this.OooO00o = oooO00o2;
    }

    public static <T> CachedObservable<T> OooO00o(C9349III<? extends T> r1) {
        return OooO00o((C9349III) r1, 16);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public boolean OooO0O0() {
        return this.OooO00o.f24028OooO0O0;
    }

    public static <T> CachedObservable<T> OooO00o(C9349III<? extends T> r1, int i) {
        if (i >= 1) {
            OooO00o oooO00o = new OooO00o(r1, i);
            return new CachedObservable<>(new CachedSubscribe(oooO00o), oooO00o);
        }
        throw new IllegalArgumentException("capacityHint > 0 required");
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III, com.p118pd.sdk.C9349III
    public boolean OooO00o() {
        return this.OooO00o.f24027OooO00o.length != 0;
    }

    /* renamed from: rx.internal.operators.CachedObservable$OooO00o */
    public static final class OooO00o<T> extends IIII implements AbstractC5477Il11<T> {
        public static final ReplayProducer<?>[] OooO0O0 = new ReplayProducer[0];
        public final iLIiLILI OooO00o = new iLIiLILI();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<? extends T> f24026OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile ReplayProducer<?>[] f24027OooO00o = OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public volatile boolean f24028OooO0O0;
        public boolean OooO0OO;

        /* renamed from: rx.internal.operators.CachedObservable$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4985OooO00o extends AbstractC9508LiLi<T> {
            public C4985OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                OooO00o.this.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO00o.this.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                OooO00o.this.onNext(t);
            }
        }

        public OooO00o(C9349III<? extends T> r1, int i) {
            super(i);
            this.f24026OooO00o = r1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: rx.internal.operators.CachedObservable$ReplayProducer<?>[] */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO00o(ReplayProducer<T> replayProducer) {
            synchronized (this.OooO00o) {
                ReplayProducer<?>[] replayProducerArr = this.f24027OooO00o;
                int length = replayProducerArr.length;
                ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[(length + 1)];
                System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, length);
                replayProducerArr2[length] = replayProducer;
                this.f24027OooO00o = replayProducerArr2;
            }
        }

        public void OooO0O0(ReplayProducer<T> replayProducer) {
            synchronized (this.OooO00o) {
                ReplayProducer<?>[] replayProducerArr = this.f24027OooO00o;
                int length = replayProducerArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (replayProducerArr[i2].equals(replayProducer)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        this.f24027OooO00o = OooO0O0;
                        return;
                    }
                    ReplayProducer<?>[] replayProducerArr2 = new ReplayProducer[(length - 1)];
                    System.arraycopy(replayProducerArr, 0, replayProducerArr2, 0, i);
                    System.arraycopy(replayProducerArr, i + 1, replayProducerArr2, i, (length - i) - 1);
                    this.f24027OooO00o = replayProducerArr2;
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                OooO00o(NotificationLite.OooO00o());
                this.OooO00o.unsubscribe();
                OooO0O0();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                OooO00o(NotificationLite.OooO00o(th));
                this.OooO00o.unsubscribe();
                OooO0O0();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0OO) {
                OooO00o(NotificationLite.OooO0O0((Object) t));
                OooO0O0();
            }
        }

        @Override // com.p118pd.sdk.IIII
        public void OooO00o() {
            C4985OooO00o oooO00o = new C4985OooO00o();
            this.OooO00o.OooO00o(oooO00o);
            this.f24026OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO00o);
            this.f24028OooO0O0 = true;
        }

        @Override // com.p118pd.sdk.IIII, com.p118pd.sdk.IIII
        public void OooO0O0() {
            for (ReplayProducer<?> replayProducer : this.f24027OooO00o) {
                replayProducer.replay();
            }
        }
    }
}
