package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LlIiLii;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: rx.internal.operators.OperatorOnBackpressureLatest */
public final class OperatorOnBackpressureLatest<T> implements C9349III.OooO0O0<T, T> {

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$LatestEmitter */
    public static final class LatestEmitter<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii, AbstractC5477Il11<T> {
        public static final Object EMPTY = new Object();
        public static final long NOT_REQUESTED = -4611686018427387904L;
        public static final long serialVersionUID = -1364393685005146274L;
        public final AbstractC9508LiLi<? super T> child;
        public volatile boolean done;
        public boolean emitting;
        public boolean missed;
        public OooO0O0<? super T> parent;
        public Throwable terminal;
        public final AtomicReference<Object> value = new AtomicReference<>(EMPTY);

        public LatestEmitter(AbstractC9508LiLi<? super T> r3) {
            this.child = r3;
            lazySet(-4611686018427387904L);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            r2 = get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
            if (r2 != Long.MIN_VALUE) goto L_0x001b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
            r4 = r9.value.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r2 <= 0) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
            if (r4 == p293rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.EMPTY) goto L_0x003e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
            r9.child.onNext(r4);
            r9.value.compareAndSet(r4, p293rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.EMPTY);
            produced(1);
            r4 = p293rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.EMPTY;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            if (r4 != p293rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.EMPTY) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r9.done == false) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
            r2 = r9.terminal;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
            if (r2 == null) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
            r9.child.onError(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            r9.child.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
            if (r9.missed != false) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x005a, code lost:
            r9.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
            r9.missed = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0062, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0064, code lost:
            monitor-exit(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0066, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
            r2 = r1;
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x006b, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x006f, code lost:
            if (r2 == false) goto L_0x0071;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0071, code lost:
            monitor-enter(r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
            r9.emitting = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0079, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void emit() {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorOnBackpressureLatest.LatestEmitter.emit():void");
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.done = true;
            emit();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.terminal = th;
            this.done = true;
            emit();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.value.lazySet(t);
            emit();
        }

        public long produced(long j) {
            long j2;
            long j3;
            do {
                j2 = get();
                if (j2 < 0) {
                    return j2;
                }
                j3 = j2 - j;
            } while (!compareAndSet(j2, j3));
            return j3;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 == -4611686018427387904L) {
                            j3 = j;
                        } else {
                            j3 = j2 + j;
                            if (j3 < 0) {
                                j3 = Long.MAX_VALUE;
                            }
                        }
                    } else {
                        return;
                    }
                } while (!compareAndSet(j2, j3));
                if (j2 == -4611686018427387904L) {
                    this.parent.OooO00o(Long.MAX_VALUE);
                }
                emit();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (get() >= 0) {
                getAndSet(Long.MIN_VALUE);
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$OooO00o */
    public static final class OooO00o {
        public static final OperatorOnBackpressureLatest<Object> OooO00o = new OperatorOnBackpressureLatest<>();
    }

    /* renamed from: rx.internal.operators.OperatorOnBackpressureLatest$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public final LatestEmitter<T> OooO00o;

        public OooO0O0(LatestEmitter<T> latestEmitter) {
            this.OooO00o = latestEmitter;
        }

        public void OooO00o(long j) {
            request(j);
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
        public void onStart() {
            request(0);
        }
    }

    public static <T> OperatorOnBackpressureLatest<T> OooO00o() {
        return (OperatorOnBackpressureLatest<T>) OooO00o.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        LatestEmitter latestEmitter = new LatestEmitter(r3);
        OooO0O0<? super T> oooO0O0 = new OooO0O0<>(latestEmitter);
        latestEmitter.parent = oooO0O0;
        r3.add(oooO0O0);
        r3.add(latestEmitter);
        r3.setProducer(latestEmitter);
        return oooO0O0;
    }
}
