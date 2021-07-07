package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.l丨LLL1l  reason: invalid class name and case insensitive filesystem */
public final class C6850lLLL1l<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC9847l1<? super Throwable, ? extends C9349III<? extends T>> OooO00o;

    /* renamed from: com.pd.sdk.l丨LLL1l$OooO00o */
    public static class OooO00o implements AbstractC9847l1<Throwable, C9349III<? extends T>> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        public OooO00o(AbstractC9847l1 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<? extends T> call(Throwable th) {
            return C9349III.OooO0oO(this.OooO00o.call(th));
        }
    }

    /* renamed from: com.pd.sdk.l丨LLL1l$OooO0O0 */
    public static class OooO0O0 implements AbstractC9847l1<Throwable, C9349III<? extends T>> {
        public final /* synthetic */ C9349III OooO00o;

        public OooO0O0(C9349III r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<? extends T> call(Throwable th) {
            return this.OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.l丨LLL1l$OooO0OO */
    public static class OooO0OO implements AbstractC9847l1<Throwable, C9349III<? extends T>> {
        public final /* synthetic */ C9349III OooO00o;

        public OooO0OO(C9349III r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<? extends T> call(Throwable th) {
            if (th instanceof Exception) {
                return this.OooO00o;
            }
            return C9349III.OooO00o(th);
        }
    }

    /* renamed from: com.pd.sdk.l丨LLL1l$OooO0Oo  reason: case insensitive filesystem */
    public class C6851OooO0Oo extends AbstractC9508LiLi<T> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ iLIiLILI f18917OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18919OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C9577i1 f18920OooO00o;
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.l丨LLL1l$OooO0Oo$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<T> {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                C6851OooO0Oo.this.f18919OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                C6851OooO0Oo.this.f18919OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                C6851OooO0Oo.this.f18919OooO00o.onNext(t);
            }

            @Override // com.p118pd.sdk.AbstractC9508LiLi
            public void setProducer(AbstractC9465L1l1 r2) {
                C6851OooO0Oo.this.f18920OooO00o.OooO00o(r2);
            }
        }

        public C6851OooO0Oo(AbstractC9508LiLi r2, C9577i1 r3, iLIiLILI iliilili) {
            this.f18919OooO00o = r2;
            this.f18920OooO00o = r3;
            this.f18917OooO00o = iliilili;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f18919OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                IIl11.m15447OooO00o(th);
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            try {
                unsubscribe();
                OooO00o oooO00o = new OooO00o();
                this.f18917OooO00o.OooO00o(oooO00o);
                long j = this.OooO00o;
                if (j != 0) {
                    this.f18920OooO00o.OooO00o(j);
                }
                ((C9349III) C6850lLLL1l.this.OooO00o.call(th)).OooO0O0((AbstractC9508LiLi) oooO00o);
            } catch (Throwable th2) {
                IIl11.OooO00o(th2, this.f18919OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                this.OooO00o++;
                this.f18919OooO00o.onNext(t);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.f18920OooO00o.OooO00o(r2);
        }
    }

    public C6850lLLL1l(AbstractC9847l1<? super Throwable, ? extends C9349III<? extends T>> r1) {
        this.OooO00o = r1;
    }

    public static <T> C6850lLLL1l<T> OooO00o(AbstractC9847l1<? super Throwable, ? extends T> r2) {
        return new C6850lLLL1l<>(new OooO00o(r2));
    }

    public static <T> C6850lLLL1l<T> OooO0O0(C9349III<? extends T> r2) {
        return new C6850lLLL1l<>(new OooO0O0(r2));
    }

    public static <T> C6850lLLL1l<T> OooO00o(C9349III<? extends T> r2) {
        return new C6850lLLL1l<>(new OooO0OO(r2));
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r4) {
        C9577i1 r0 = new C9577i1();
        iLIiLILI iliilili = new iLIiLILI();
        C6851OooO0Oo oooO0Oo = new C6851OooO0Oo(r4, r0, iliilili);
        iliilili.OooO00o(oooO0Oo);
        r4.add(iliilili);
        r4.setProducer(r0);
        return oooO0Oo;
    }
}
