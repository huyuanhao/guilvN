package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;

/* renamed from: com.pd.sdk.Iili1l */
public class Iili1l<T> implements C9349III.OooO0O0<T, T> {
    public final LL1LL OooO00o;

    /* renamed from: com.pd.sdk.Iili1l$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15742OooO00o;

        public OooO00o(AbstractC9508LiLi r2) {
            this.f15742OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15742OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15742OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f15742OooO00o.onNext(t);
        }
    }

    /* renamed from: com.pd.sdk.Iili1l$OooO0O0 */
    public class OooO0O0 implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15743OooO00o;

        /* renamed from: com.pd.sdk.Iili1l$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ LL1LL.OooO00o f15744OooO00o;

            public OooO00o(LL1LL.OooO00o oooO00o) {
                this.f15744OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.f15743OooO00o.unsubscribe();
                this.f15744OooO00o.unsubscribe();
            }
        }

        public OooO0O0(AbstractC9508LiLi r2) {
            this.f15743OooO00o = r2;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            LL1LL.OooO00o OooO00o2 = Iili1l.this.OooO00o.m16172OooO00o();
            OooO00o2.OooO00o(new OooO00o(OooO00o2));
        }
    }

    public Iili1l(LL1LL ll1ll) {
        this.OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3);
        r3.add(C9638ill.OooO00o(new OooO0O0(oooO00o)));
        return oooO00o;
    }
}
