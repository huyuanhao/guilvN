package p293rx.internal.operators;

import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9465L1l1;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C11LI1;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.LlIiLii;
import com.p118pd.sdk.i11iiILl;
import com.p118pd.sdk.i1Il1LL;
import com.p118pd.sdk.iI1L1i;
import com.p118pd.sdk.liii1l;
import com.p118pd.sdk.ll1i1l;
import com.umeng.message.proguard.C3848l;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.MissingBackpressureException;

/* renamed from: rx.internal.operators.OperatorPublish */
public final class OperatorPublish<T> extends i11iiILl<T> {
    public final C9349III<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<OooO0OO<T>> f24104OooO00o;

    /* renamed from: rx.internal.operators.OperatorPublish$InnerProducer */
    public static final class InnerProducer<T> extends AtomicLong implements AbstractC9465L1l1, LlIiLii {
        public static final long NOT_REQUESTED = -4611686018427387904L;
        public static final long UNSUBSCRIBED = Long.MIN_VALUE;
        public static final long serialVersionUID = -4453897557930727610L;
        public final AbstractC9508LiLi<? super T> child;
        public final OooO0OO<T> parent;

        public InnerProducer(OooO0OO<T> oooO0OO, AbstractC9508LiLi<? super T> r2) {
            this.parent = oooO0OO;
            this.child = r2;
            lazySet(-4611686018427387904L);
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return get() == Long.MIN_VALUE;
        }

        public long produced(long j) {
            long j2;
            long j3;
            if (j > 0) {
                do {
                    j2 = get();
                    if (j2 == -4611686018427387904L) {
                        throw new IllegalStateException("Produced without request");
                    } else if (j2 == Long.MIN_VALUE) {
                        return Long.MIN_VALUE;
                    } else {
                        j3 = j2 - j;
                        if (j3 < 0) {
                            throw new IllegalStateException("More produced (" + j + ") than requested (" + j2 + C3848l.f10402t);
                        }
                    }
                } while (!compareAndSet(j2, j3));
                return j3;
            }
            throw new IllegalArgumentException("Cant produce zero or less");
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            long j2;
            long j3;
            if (j >= 0) {
                do {
                    j2 = get();
                    if (j2 != Long.MIN_VALUE) {
                        if (j2 >= 0 && j == 0) {
                            return;
                        }
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
                this.parent.OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (get() != Long.MIN_VALUE && getAndSet(Long.MIN_VALUE) != Long.MIN_VALUE) {
                this.parent.OooO00o((InnerProducer) this);
                this.parent.OooO0OO();
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$OooO00o */
    public static class OooO00o implements C9349III.OooO00o<T> {
        public final /* synthetic */ AtomicReference OooO00o;

        public OooO00o(AtomicReference atomicReference) {
            this.OooO00o = atomicReference;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super T> r4) {
            while (true) {
                OooO0OO oooO0OO = (OooO0OO) this.OooO00o.get();
                if (oooO0OO == null || oooO0OO.isUnsubscribed()) {
                    OooO0OO oooO0OO2 = new OooO0OO(this.OooO00o);
                    oooO0OO2.OooO0Oo();
                    if (!this.OooO00o.compareAndSet(oooO0OO, oooO0OO2)) {
                        continue;
                    } else {
                        oooO0OO = oooO0OO2;
                    }
                }
                InnerProducer<T> innerProducer = new InnerProducer<>(oooO0OO, r4);
                if (oooO0OO.m23003OooO00o((InnerProducer) innerProducer)) {
                    r4.add(innerProducer);
                    r4.setProducer(innerProducer);
                    return;
                }
            }
        }
    }

    /* renamed from: rx.internal.operators.OperatorPublish$OooO0O0 */
    public static class OooO0O0 implements C9349III.OooO00o<R> {
        public final /* synthetic */ C9349III OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9847l1 f24105OooO00o;
        public final /* synthetic */ boolean OooO0O0;

        /* renamed from: rx.internal.operators.OperatorPublish$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<R> {
            public final /* synthetic */ AbstractC9508LiLi OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ OnSubscribePublishMulticast f24106OooO00o;

            public OooO00o(AbstractC9508LiLi r2, OnSubscribePublishMulticast onSubscribePublishMulticast) {
                this.OooO00o = r2;
                this.f24106OooO00o = onSubscribePublishMulticast;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.f24106OooO00o.unsubscribe();
                this.OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.f24106OooO00o.unsubscribe();
                this.OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(R r) {
                this.OooO00o.onNext(r);
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r2) {
                this.OooO00o.setProducer(r2);
            }
        }

        public OooO0O0(boolean z, AbstractC9847l1 r2, C9349III r3) {
            this.OooO0O0 = z;
            this.f24105OooO00o = r2;
            this.OooO00o = r3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.pd.sdk.丨丨l1 */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r4) {
            OnSubscribePublishMulticast onSubscribePublishMulticast = new OnSubscribePublishMulticast(ll1i1l.o0ooOO0, this.OooO0O0);
            OooO00o oooO00o = new OooO00o(r4, onSubscribePublishMulticast);
            r4.add(onSubscribePublishMulticast);
            r4.add(oooO00o);
            ((C9349III) this.f24105OooO00o.call(C9349III.OooO0O0((C9349III.OooO00o) onSubscribePublishMulticast))).OooO0O0((AbstractC9508LiLi) oooO00o);
            this.OooO00o.OooO0O0((AbstractC9508LiLi) onSubscribePublishMulticast.subscriber());
        }
    }

    public OperatorPublish(C9349III.OooO00o<T> oooO00o, C9349III<? extends T> r2, AtomicReference<OooO0OO<T>> atomicReference) {
        super(oooO00o);
        this.OooO00o = r2;
        this.f24104OooO00o = atomicReference;
    }

    public static <T> i11iiILl<T> OooO00o(C9349III<? extends T> r3) {
        AtomicReference atomicReference = new AtomicReference();
        return new OperatorPublish(new OooO00o(atomicReference), r3, atomicReference);
    }

    public static <T, R> C9349III<R> OooO0OO(C9349III<? extends T> r1, AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r2) {
        return OooO00o((C9349III) r1, (AbstractC9847l1) r2, false);
    }

    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.i11iiILl
    public void OooO0O0(AbstractC6153iL1l<? super LlIiLii> il1l) {
        OooO0OO<T> oooO0OO;
        while (true) {
            oooO0OO = this.f24104OooO00o.get();
            if (oooO0OO != null && !oooO0OO.isUnsubscribed()) {
                break;
            }
            OooO0OO<T> oooO0OO2 = new OooO0OO<>(this.f24104OooO00o);
            oooO0OO2.OooO0Oo();
            if (this.f24104OooO00o.compareAndSet(oooO0OO, oooO0OO2)) {
                oooO0OO = oooO0OO2;
                break;
            }
        }
        boolean z = true;
        if (oooO0OO.f24110OooO00o.get() || !oooO0OO.f24110OooO00o.compareAndSet(false, true)) {
            z = false;
        }
        il1l.call(oooO0OO);
        if (z) {
            this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0OO);
        }
    }

    public static <T, R> C9349III<R> OooO00o(C9349III<? extends T> r1, AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r2, boolean z) {
        return C9349III.OooO0O0((C9349III.OooO00o) new OooO0O0(z, r2, r1));
    }

    /* renamed from: rx.internal.operators.OperatorPublish$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<T> implements LlIiLii {
        public static final InnerProducer[] OooO00o = new InnerProducer[0];
        public static final InnerProducer[] OooO0O0 = new InnerProducer[0];

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile Object f24108OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Queue<Object> f24109OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f24110OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<OooO0OO<T>> f24111OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final AtomicReference<InnerProducer[]> f24112OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f24113OooO0O0;
        public boolean OooO0OO;

        /* renamed from: rx.internal.operators.OperatorPublish$OooO0OO$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0OO.this.f24112OooO0O0.getAndSet(OooO0OO.OooO0O0);
                OooO0OO<T> oooO0OO = OooO0OO.this;
                oooO0OO.f24111OooO00o.compareAndSet(oooO0OO, null);
            }
        }

        public OooO0OO(AtomicReference<OooO0OO<T>> atomicReference) {
            this.f24109OooO00o = C11LI1.OooO00o() ? new iI1L1i<>(ll1i1l.o0ooOO0) : new i1Il1LL<>(ll1i1l.o0ooOO0);
            this.f24112OooO0O0 = new AtomicReference<>(OooO00o);
            this.f24111OooO00o = atomicReference;
            this.f24110OooO00o = new AtomicBoolean();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m23003OooO00o(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            if (innerProducer != null) {
                do {
                    innerProducerArr = this.f24112OooO0O0.get();
                    if (innerProducerArr == OooO0O0) {
                        return false;
                    }
                    int length = innerProducerArr.length;
                    innerProducerArr2 = new InnerProducer[(length + 1)];
                    System.arraycopy(innerProducerArr, 0, innerProducerArr2, 0, length);
                    innerProducerArr2[length] = innerProducer;
                } while (!this.f24112OooO0O0.compareAndSet(innerProducerArr, innerProducerArr2));
                return true;
            }
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r0 = r18.f24108OooO00o;
            r4 = r18.f24109OooO00o.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            if (OooO00o(r0, r4) == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            if (r4 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
            r5 = r18.f24112OooO0O0.get();
            r0 = r5.length;
            r6 = Long.MAX_VALUE;
            r8 = r5.length;
            r9 = 0;
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
            if (r9 >= r8) goto L_0x0053;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            r13 = r5[r9].get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
            if (r13 < 0) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            r6 = java.lang.Math.min(r6, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            if (r13 != Long.MIN_VALUE) goto L_0x0050;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
            r10 = r10 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
            r9 = r9 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
            if (r0 != r10) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
            r0 = r18.f24108OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
            if (r18.f24109OooO00o.poll() != null) goto L_0x0063;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
            r4 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
            if (OooO00o(r0, r4) == false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
            request(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
            r10 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0070, code lost:
            r13 = (long) r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0073, code lost:
            if (r13 >= r6) goto L_0x00ba;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0075, code lost:
            r0 = r18.f24108OooO00o;
            r4 = r18.f24109OooO00o.poll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x007d, code lost:
            if (r4 != null) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x007f, code lost:
            r15 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0081, code lost:
            r15 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0086, code lost:
            if (OooO00o(r0, r15) == false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0088, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0089, code lost:
            if (r15 == false) goto L_0x008d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x008b, code lost:
            r4 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008d, code lost:
            r4 = p293rx.internal.operators.NotificationLite.OooO00o(r4);
            r13 = r5.length;
            r14 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0093, code lost:
            if (r14 >= r13) goto L_0x00b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0095, code lost:
            r2 = r5[r14];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009d, code lost:
            if (r2.get() <= 0) goto L_0x00b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            r2.child.onNext(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a4, code lost:
            r2.produced(1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00a8, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
            r2.unsubscribe();
            com.p118pd.sdk.IIl11.OooO00o(r0, r2.child, r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b5, code lost:
            r10 = r10 + 1;
            r4 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ba, code lost:
            if (r10 <= 0) goto L_0x00bf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00bc, code lost:
            request(r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
            if (r6 == 0) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c3, code lost:
            if (r4 != false) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c6, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c9, code lost:
            if (r18.OooO0OO != false) goto L_0x00d2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x00cb, code lost:
            r18.f24113OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x00ce, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00cf, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x00d0, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d2, code lost:
            r18.OooO0OO = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d4, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d8, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d9, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
            monitor-exit(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:83:0x00dc, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:84:0x00de, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:85:0x00e0, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e1, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x00e2, code lost:
            if (r2 == false) goto L_0x00e4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x00e4, code lost:
            monitor-enter(r18);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
            r18.f24113OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x00ec, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0OO() {
            /*
            // Method dump skipped, instructions count: 242
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.internal.operators.OperatorPublish.OooO0OO.OooO0OO():void");
        }

        public void OooO0Oo() {
            add(C9638ill.OooO00o(new OooO00o()));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (this.f24108OooO00o == null) {
                this.f24108OooO00o = NotificationLite.OooO00o();
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.f24108OooO00o == null) {
                this.f24108OooO00o = NotificationLite.OooO00o(th);
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.f24109OooO00o.offer(NotificationLite.OooO0O0((Object) t))) {
                onError(new MissingBackpressureException());
            } else {
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request((long) ll1i1l.o0ooOO0);
        }

        public void OooO00o(InnerProducer<T> innerProducer) {
            InnerProducer[] innerProducerArr;
            InnerProducer[] innerProducerArr2;
            do {
                innerProducerArr = this.f24112OooO0O0.get();
                if (innerProducerArr != OooO00o && innerProducerArr != OooO0O0) {
                    int i = -1;
                    int length = innerProducerArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (innerProducerArr[i2].equals(innerProducer)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            innerProducerArr2 = OooO00o;
                        } else {
                            InnerProducer[] innerProducerArr3 = new InnerProducer[(length - 1)];
                            System.arraycopy(innerProducerArr, 0, innerProducerArr3, 0, i);
                            System.arraycopy(innerProducerArr, i + 1, innerProducerArr3, i, (length - i) - 1);
                            innerProducerArr2 = innerProducerArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f24112OooO0O0.compareAndSet(innerProducerArr, innerProducerArr2));
        }

        public boolean OooO00o(Object obj, boolean z) {
            int i = 0;
            if (obj != null) {
                if (!NotificationLite.m22999OooO00o(obj)) {
                    Throwable OooO00o2 = NotificationLite.m22998OooO00o(obj);
                    this.f24111OooO00o.compareAndSet(this, null);
                    try {
                        InnerProducer[] andSet = this.f24112OooO0O0.getAndSet(OooO0O0);
                        int length = andSet.length;
                        while (i < length) {
                            andSet[i].child.onError(OooO00o2);
                            i++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                } else if (z) {
                    this.f24111OooO00o.compareAndSet(this, null);
                    try {
                        InnerProducer[] andSet2 = this.f24112OooO0O0.getAndSet(OooO0O0);
                        int length2 = andSet2.length;
                        while (i < length2) {
                            andSet2[i].child.onCompleted();
                            i++;
                        }
                        return true;
                    } finally {
                        unsubscribe();
                    }
                }
            }
            return false;
        }
    }
}
