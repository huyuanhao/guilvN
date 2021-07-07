package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.exceptions.CompositeException;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.ILIL1l */
public final class ILIL1l<T> implements C9349III.OooO0O0<T, C9349III<? extends T>> {
    public final boolean OooO0O0;

    /* renamed from: com.pd.sdk.ILIL1l$OooO00o */
    public static final class OooO00o {
        public static final ILIL1l<Object> OooO00o = new ILIL1l<>(false);
    }

    /* renamed from: com.pd.sdk.ILIL1l$OooO0O0 */
    public static final class OooO0O0 {
        public static final ILIL1l<Object> OooO00o = new ILIL1l<>(true);
    }

    /* renamed from: com.pd.sdk.ILIL1l$OooO0OO */
    public static final class OooO0OO<T> extends AbstractC9508LiLi<T> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C5300OooO0Oo<T> f15566OooO00o;

        public OooO0OO(long j, C5300OooO0Oo<T> oooO0Oo) {
            this.OooO00o = j;
            this.f15566OooO00o = oooO0Oo;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15566OooO00o.OooO0O0(this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15566OooO00o.OooO00o(th, this.OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f15566OooO00o.OooO00o(t, this);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r4) {
            this.f15566OooO00o.OooO00o(r4, this.OooO00o);
        }
    }

    public ILIL1l(boolean z) {
        this.OooO0O0 = z;
    }

    public static <T> ILIL1l<T> OooO00o(boolean z) {
        return z ? (ILIL1l<T>) OooO0O0.OooO00o : (ILIL1l<T>) OooO00o.OooO00o;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super C9349III<? extends T>> call(AbstractC9508LiLi<? super T> r3) {
        C5300OooO0Oo oooO0Oo = new C5300OooO0Oo(r3, this.OooO0O0);
        r3.add(oooO0Oo);
        oooO0Oo.OooO0o0();
        return oooO0Oo;
    }

    /* renamed from: com.pd.sdk.ILIL1l$OooO0Oo  reason: case insensitive filesystem */
    public static final class C5300OooO0Oo<T> extends AbstractC9508LiLi<C9349III<? extends T>> {
        public static final Throwable OooO0O0 = new Throwable("Terminal error");
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final iLIiLILI f15567OooO00o = new iLIiLILI();

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC9465L1l1 f15568OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f15569OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9818LLl1<Object> f15570OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Throwable f15571OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicLong f15572OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final boolean f15573OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public boolean OooO0o;
        public volatile boolean OooO0o0;

        /* renamed from: com.pd.sdk.ILIL1l$OooO0Oo$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                C5300OooO0Oo.this.OooO0OO();
            }
        }

        /* renamed from: com.pd.sdk.ILIL1l$OooO0Oo$OooO0O0 */
        public class OooO0O0 implements AbstractC9465L1l1 {
            public OooO0O0() {
            }

            @Override // com.p118pd.sdk.AbstractC9465L1l1
            public void request(long j) {
                if (j > 0) {
                    C5300OooO0Oo.this.OooO00o(j);
                } else if (j < 0) {
                    throw new IllegalArgumentException("n >= 0 expected but it was " + j);
                }
            }
        }

        public C5300OooO0Oo(AbstractC9508LiLi<? super T> r1, boolean z) {
            this.f15569OooO00o = r1;
            this.f15573OooO0O0 = z;
            this.f15572OooO00o = new AtomicLong();
            this.f15570OooO00o = new C9818LLl1<>(ll1i1l.o0ooOO0);
        }

        /* renamed from: OooO00o */
        public void onNext(C9349III<? extends T> r4) {
            OooO0OO oooO0OO;
            long incrementAndGet = this.f15572OooO00o.incrementAndGet();
            LlIiLii OooO00o2 = this.f15567OooO00o.OooO00o();
            if (OooO00o2 != null) {
                OooO00o2.unsubscribe();
            }
            synchronized (this) {
                oooO0OO = new OooO0OO(incrementAndGet, this);
                this.OooO0o = true;
                this.f15568OooO00o = null;
            }
            this.f15567OooO00o.OooO00o(oooO0OO);
            r4.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0OO);
        }

        public void OooO0O0(long j) {
            synchronized (this) {
                if (this.f15572OooO00o.get() == j) {
                    this.OooO0o = false;
                    this.f15568OooO00o = null;
                    OooO0Oo();
                }
            }
        }

        public void OooO0OO() {
            synchronized (this) {
                this.f15568OooO00o = null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            r9 = r19.f15570OooO00o;
            r10 = r19.f15572OooO00o;
            r11 = r19.f15569OooO00o;
            r12 = r1;
            r14 = r3;
            r15 = r19.OooO0o0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002e, code lost:
            r16 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
            if (r16 == r12) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
            r18 = r9.isEmpty();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
            if (OooO00o(r15, r0, r14, r9, r11, r18) == false) goto L_0x0051;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
            if (r18 == false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0054, code lost:
            r2 = (java.lang.Object) p293rx.internal.operators.NotificationLite.OooO00o(r9.poll());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
            if (r10.get() != ((com.p118pd.sdk.ILIL1l.OooO0OO) r9.poll()).OooO00o) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
            r11.onNext(r2);
            r16 = r16 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
            if (r16 != r12) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
            if (r11.isUnsubscribed() == false) goto L_0x0081;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
            if (OooO00o(r19.OooO0o0, r0, r14, r9, r11, r9.isEmpty()) == false) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0093, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
            monitor-enter(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            r0 = r19.OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x009e, code lost:
            if (r0 == Long.MAX_VALUE) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
            r0 = r0 - r16;
            r19.OooO00o = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a4, code lost:
            r12 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
            if (r19.OooO0Oo != false) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
            r19.OooO0OO = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ac, code lost:
            monitor-exit(r19);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ad, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ae, code lost:
            r19.OooO0Oo = false;
            r15 = r19.OooO0o0;
            r0 = r19.OooO0o;
            r14 = r19.f15571OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
            if (r14 == null) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
            if (r14 == com.p118pd.sdk.ILIL1l.C5300OooO0Oo.OooO0O0) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00be, code lost:
            if (r19.f15573OooO0O0 != false) goto L_0x00c4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
            r19.f15571OooO00o = com.p118pd.sdk.ILIL1l.C5300OooO0Oo.OooO0O0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
            monitor-exit(r19);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0Oo() {
            /*
            // Method dump skipped, instructions count: 207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.ILIL1l.C5300OooO0Oo.OooO0Oo():void");
        }

        public void OooO0o0() {
            this.f15569OooO00o.add(this.f15567OooO00o);
            this.f15569OooO00o.add(C9638ill.OooO00o(new OooO00o()));
            this.f15569OooO00o.setProducer(new OooO0O0());
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO0o0 = true;
            OooO0Oo();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            boolean OooO00o2;
            synchronized (this) {
                OooO00o2 = OooO00o(th);
            }
            if (OooO00o2) {
                this.OooO0o0 = true;
                OooO0Oo();
                return;
            }
            OooO0O0(th);
        }

        public void OooO0O0(Throwable th) {
            C9714lli.m21756OooO00o(th);
        }

        public boolean OooO00o(Throwable th) {
            Throwable th2 = this.f15571OooO00o;
            if (th2 == OooO0O0) {
                return false;
            }
            if (th2 == null) {
                this.f15571OooO00o = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                this.f15571OooO00o = new CompositeException(arrayList);
            } else {
                this.f15571OooO00o = new CompositeException(th2, th);
            }
            return true;
        }

        public void OooO00o(T t, OooO0OO<T> oooO0OO) {
            synchronized (this) {
                if (this.f15572OooO00o.get() == oooO0OO.OooO00o) {
                    this.f15570OooO00o.OooO00o(oooO0OO, NotificationLite.OooO0O0((Object) t));
                    OooO0Oo();
                }
            }
        }

        public void OooO00o(Throwable th, long j) {
            boolean z;
            synchronized (this) {
                if (this.f15572OooO00o.get() == j) {
                    z = OooO00o(th);
                    this.OooO0o = false;
                    this.f15568OooO00o = null;
                } else {
                    z = true;
                }
            }
            if (z) {
                OooO0Oo();
            } else {
                OooO0O0(th);
            }
        }

        public void OooO00o(AbstractC9465L1l1 r4, long j) {
            synchronized (this) {
                if (this.f15572OooO00o.get() == j) {
                    long j2 = this.OooO00o;
                    this.f15568OooO00o = r4;
                    r4.request(j2);
                }
            }
        }

        public void OooO00o(long j) {
            AbstractC9465L1l1 r0;
            synchronized (this) {
                r0 = this.f15568OooO00o;
                this.OooO00o = C6211iLli.OooO00o(this.OooO00o, j);
            }
            if (r0 != null) {
                r0.request(j);
            }
            OooO0Oo();
        }

        public boolean OooO00o(boolean z, boolean z2, Throwable th, C9818LLl1<Object> r6, AbstractC9508LiLi<? super T> r7, boolean z3) {
            if (this.f15573OooO0O0) {
                if (!z || z2 || !z3) {
                    return false;
                }
                if (th != null) {
                    r7.onError(th);
                } else {
                    r7.onCompleted();
                }
                return true;
            } else if (th != null) {
                r6.clear();
                r7.onError(th);
                return true;
            } else if (!z || z2 || !z3) {
                return false;
            } else {
                r7.onCompleted();
                return true;
            }
        }
    }
}
