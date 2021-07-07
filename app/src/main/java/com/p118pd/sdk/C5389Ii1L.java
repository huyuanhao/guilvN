package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p293rx.Notification;

/* renamed from: com.pd.sdk.Ii丨1L丨  reason: invalid class name and case insensitive filesystem */
public final class C5389Ii1L<T> implements C9349III.OooO00o<T> {
    public static final AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> OooO0O0 = new OooO00o();
    public final LL1LL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f15751OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> f15752OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final boolean f15753OooO0O0;
    public final boolean OooO0OO;

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO00o */
    public static class OooO00o implements AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> {

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4914OooO00o implements AbstractC9847l1<Notification<?>, Notification<?>> {
            public C4914OooO00o() {
            }

            /* renamed from: OooO00o */
            public Notification<?> call(Notification<?> notification) {
                return Notification.OooO00o((Object) null);
            }
        }

        /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<?> */
        /* renamed from: OooO00o */
        public C9349III<?> call(C9349III<? extends Notification<?>> r2) {
            return (C9349III<R>) r2.OooOOoo(new C4914OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0O0 */
    public class OooO0O0 implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC5635LIi1 f15754OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ iLIiLILI f15755OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15756OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C9577i1 f15757OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicLong f15758OooO00o;

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<T> {
            public boolean OooO0O0;

            public OooO00o() {
            }

            private void OooO0OO() {
                long j;
                do {
                    j = OooO0O0.this.f15758OooO00o.get();
                    if (j == Long.MAX_VALUE) {
                        return;
                    }
                } while (!OooO0O0.this.f15758OooO00o.compareAndSet(j, j - 1));
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.pd.sdk.LIi丨丨1 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    unsubscribe();
                    OooO0O0.this.f15754OooO00o.onNext(Notification.OooO00o());
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.pd.sdk.LIi丨丨1 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    unsubscribe();
                    OooO0O0.this.f15754OooO00o.onNext(Notification.OooO00o(th));
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                if (!this.OooO0O0) {
                    OooO0O0.this.f15756OooO00o.onNext(t);
                    OooO0OO();
                    OooO0O0.this.f15757OooO00o.OooO00o(1);
                }
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r2) {
                OooO0O0.this.f15757OooO00o.OooO00o(r2);
            }
        }

        public OooO0O0(AbstractC9508LiLi r2, AbstractC5635LIi1 r3, C9577i1 r4, AtomicLong atomicLong, iLIiLILI iliilili) {
            this.f15756OooO00o = r2;
            this.f15754OooO00o = r3;
            this.f15757OooO00o = r4;
            this.f15758OooO00o = atomicLong;
            this.f15755OooO00o = iliilili;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (!this.f15756OooO00o.isUnsubscribed()) {
                OooO00o oooO00o = new OooO00o();
                this.f15755OooO00o.OooO00o(oooO00o);
                C5389Ii1L.this.f15751OooO00o.OooO0O0((AbstractC9508LiLi) oooO00o);
            }
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0OO */
    public class OooO0OO implements C9349III.OooO0O0<Notification<?>, Notification<?>> {

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0OO$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<Notification<?>> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC9508LiLi f15759OooO00o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
                super(r2);
                this.f15759OooO00o = r3;
            }

            /* renamed from: OooO00o */
            public void onNext(Notification<?> notification) {
                if (notification.OooO0OO() && C5389Ii1L.this.f15753OooO0O0) {
                    this.f15759OooO00o.onCompleted();
                } else if (!notification.OooO0Oo() || !C5389Ii1L.this.OooO0OO) {
                    this.f15759OooO00o.onNext(notification);
                } else {
                    this.f15759OooO00o.onError(notification.m22991OooO00o());
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.f15759OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.f15759OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r3) {
                r3.request(Long.MAX_VALUE);
            }
        }

        public OooO0OO() {
        }

        /* renamed from: OooO00o */
        public AbstractC9508LiLi<? super Notification<?>> call(AbstractC9508LiLi<? super Notification<?>> r2) {
            return new OooO00o(r2, r2);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0Oo  reason: case insensitive filesystem */
    public class C5390OooO0Oo implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f15760OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f15761OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C9349III f15762OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15763OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f15764OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicLong f15765OooO00o;

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0Oo$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<Object> {
            public OooO00o(AbstractC9508LiLi r2) {
                super(r2);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                C5390OooO0Oo.this.f15763OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                C5390OooO0Oo.this.f15763OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(Object obj) {
                if (C5390OooO0Oo.this.f15763OooO00o.isUnsubscribed()) {
                    return;
                }
                if (C5390OooO0Oo.this.f15765OooO00o.get() > 0) {
                    C5390OooO0Oo oooO0Oo = C5390OooO0Oo.this;
                    oooO0Oo.f15760OooO00o.OooO00o(oooO0Oo.f15761OooO00o);
                    return;
                }
                C5390OooO0Oo.this.f15764OooO00o.compareAndSet(false, true);
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r3) {
                r3.request(Long.MAX_VALUE);
            }
        }

        public C5390OooO0Oo(C9349III r2, AbstractC9508LiLi r3, AtomicLong atomicLong, LL1LL.OooO00o oooO00o, liii1l r6, AtomicBoolean atomicBoolean) {
            this.f15762OooO00o = r2;
            this.f15763OooO00o = r3;
            this.f15765OooO00o = atomicLong;
            this.f15760OooO00o = oooO00o;
            this.f15761OooO00o = r6;
            this.f15764OooO00o = atomicBoolean;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            this.f15762OooO00o.OooO0O0((AbstractC9508LiLi) new OooO00o(this.f15763OooO00o));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0o */
    public static final class OooO0o implements AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> {
        public final long OooO00o;

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0o$OooO00o */
        public class OooO00o implements AbstractC9847l1<Notification<?>, Notification<?>> {
            public int o00oO0O;

            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public Notification<?> call(Notification<?> notification) {
                long j = OooO0o.this.OooO00o;
                if (j == 0) {
                    return notification;
                }
                int i = this.o00oO0O + 1;
                this.o00oO0O = i;
                return ((long) i) <= j ? Notification.OooO00o(Integer.valueOf(i)) : notification;
            }
        }

        public OooO0o(long j) {
            this.OooO00o = j;
        }

        /* JADX DEBUG: Type inference failed for r2v2. Raw type applied. Possible types: com.pd.sdk.丨III<T2>, com.pd.sdk.丨III<?> */
        /* renamed from: OooO00o */
        public C9349III<?> call(C9349III<? extends Notification<?>> r2) {
            return (C9349III<T2>) r2.OooOOoo(new OooO00o()).OooO0o0();
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0o0  reason: case insensitive filesystem */
    public class C5391OooO0o0 implements AbstractC9465L1l1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f15766OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ liii1l f15767OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C9577i1 f15768OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f15769OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicLong f15770OooO00o;

        public C5391OooO0o0(AtomicLong atomicLong, C9577i1 r3, AtomicBoolean atomicBoolean, LL1LL.OooO00o oooO00o, liii1l r6) {
            this.f15770OooO00o = atomicLong;
            this.f15768OooO00o = r3;
            this.f15769OooO00o = atomicBoolean;
            this.f15766OooO00o = oooO00o;
            this.f15767OooO00o = r6;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            if (j > 0) {
                C6211iLli.OooO00o(this.f15770OooO00o, j);
                this.f15768OooO00o.request(j);
                if (this.f15769OooO00o.compareAndSet(true, false)) {
                    this.f15766OooO00o.OooO00o(this.f15767OooO00o);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0oO  reason: case insensitive filesystem */
    public static final class C5392OooO0oO implements AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<? extends Notification<?>>> {
        public final AbstractC5189I1l1l<Integer, Throwable, Boolean> OooO00o;

        /* renamed from: com.pd.sdk.Ii丨1L丨$OooO0oO$OooO00o */
        public class OooO00o implements AbstractC5189I1l1l<Notification<Integer>, Notification<?>, Notification<Integer>> {
            public OooO00o() {
            }

            /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: rx.Notification<?> */
            /* JADX WARN: Multi-variable type inference failed */
            public Notification<Integer> OooO00o(Notification<Integer> notification, Notification<?> notification2) {
                int intValue = notification.m22990OooO00o().intValue();
                return C5392OooO0oO.this.OooO00o.OooO00o(Integer.valueOf(intValue), notification2.m22991OooO00o()).booleanValue() ? Notification.OooO00o(Integer.valueOf(intValue + 1)) : notification2;
            }
        }

        public C5392OooO0oO(AbstractC5189I1l1l<Integer, Throwable, Boolean> r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<? extends Notification<?>> call(C9349III<? extends Notification<?>> r3) {
            return r3.OooO0O0((Object) Notification.OooO00o((Object) 0), (AbstractC5189I1l1l<R, ? super Object, R>) new OooO00o());
        }
    }

    public C5389Ii1L(C9349III<T> r1, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r2, boolean z, boolean z2, LL1LL ll1ll) {
        this.f15751OooO00o = r1;
        this.f15752OooO00o = r2;
        this.f15753OooO0O0 = z;
        this.OooO0OO = z2;
        this.OooO00o = ll1ll;
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r1) {
        return OooO00o(r1, C6261iii1I1.OooO0o0());
    }

    public static <T> C9349III<T> OooO0O0(C9349III<T> r1) {
        return OooO0O0(r1, OooO0O0);
    }

    public static <T> C9349III<T> OooO0OO(C9349III<T> r7, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r8, LL1LL ll1ll) {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5389Ii1L(r7, r8, true, false, ll1ll));
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r1, LL1LL ll1ll) {
        return OooO0O0(r1, OooO0O0, ll1ll);
    }

    public static <T> C9349III<T> OooO0O0(C9349III<T> r3, long j) {
        if (j >= 0) {
            return j == 0 ? r3 : OooO0O0(r3, new OooO0o(j));
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r1, long j) {
        return OooO00o(r1, j, C6261iii1I1.OooO0o0());
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r3, long j, LL1LL ll1ll) {
        if (j == 0) {
            return C9349III.OooOoo0();
        }
        if (j >= 0) {
            return OooO0O0(r3, new OooO0o(j - 1), ll1ll);
        }
        throw new IllegalArgumentException("count >= 0 expected");
    }

    public static <T> C9349III<T> OooO0O0(C9349III<T> r7, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r8) {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5389Ii1L(r7, r8, true, false, C6261iii1I1.OooO0o0()));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<T> r7, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r8, LL1LL ll1ll) {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5389Ii1L(r7, r8, false, true, ll1ll));
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r7, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r8) {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5389Ii1L(r7, r8, false, true, C6261iii1I1.OooO0o0()));
    }

    public static <T> C9349III<T> OooO00o(C9349III<T> r7, AbstractC9847l1<? super C9349III<? extends Notification<?>>, ? extends C9349III<?>> r8, LL1LL ll1ll) {
        return C9349III.OooO0O0((C9349III.OooO00o) new C5389Ii1L(r7, r8, false, false, ll1ll));
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r15) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        AtomicLong atomicLong = new AtomicLong();
        LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
        r15.add(OooO00o2);
        iLIiLILI iliilili = new iLIiLILI();
        r15.add(iliilili);
        C6373iIl OooO00o3 = lLiiIi1.OooO00o().OooO00o();
        OooO00o3.OooO00o((AbstractC9508LiLi) C6695lilIl.OooO00o());
        C9577i1 r11 = new C9577i1();
        OooO0O0 oooO0O0 = new OooO0O0(r15, OooO00o3, r11, atomicLong, iliilili);
        OooO00o2.OooO00o(new C5390OooO0Oo((C9349III) this.f15752OooO00o.call(OooO00o3.OooO00o((C9349III.OooO0O0) new OooO0OO())), r15, atomicLong, OooO00o2, oooO0O0, atomicBoolean));
        r15.setProducer(new C5391OooO0o0(atomicLong, r11, atomicBoolean, OooO00o2, oooO0O0));
    }
}
