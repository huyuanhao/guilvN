package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.iili11i1 */
public final class iili11i1<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f17938OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f17939OooO00o;

    /* renamed from: com.pd.sdk.iili11i1$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ LL1LL.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f17941OooO00o;
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.iili11i1$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4939OooO00o implements liii1l {
            public C4939OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o oooO00o = OooO00o.this;
                if (!oooO00o.OooO0O0) {
                    oooO00o.OooO0O0 = true;
                    oooO00o.f17941OooO00o.onCompleted();
                }
            }
        }

        /* renamed from: com.pd.sdk.iili11i1$OooO00o$OooO0O0 */
        public class OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Throwable f17942OooO00o;

            public OooO0O0(Throwable th) {
                this.f17942OooO00o = th;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o oooO00o = OooO00o.this;
                if (!oooO00o.OooO0O0) {
                    oooO00o.OooO0O0 = true;
                    oooO00o.f17941OooO00o.onError(this.f17942OooO00o);
                    OooO00o.this.OooO00o.unsubscribe();
                }
            }
        }

        /* renamed from: com.pd.sdk.iili11i1$OooO00o$OooO0OO */
        public class OooO0OO implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Object f17943OooO00o;

            public OooO0OO(Object obj) {
                this.f17943OooO00o = obj;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.pd.sdk.丨LiL丨丨i */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o oooO00o = OooO00o.this;
                if (!oooO00o.OooO0O0) {
                    oooO00o.f17941OooO00o.onNext(this.f17943OooO00o);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, LL1LL.OooO00o oooO00o, AbstractC9508LiLi r4) {
            super(r2);
            this.OooO00o = oooO00o;
            this.f17941OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            LL1LL.OooO00o oooO00o = this.OooO00o;
            C4939OooO00o oooO00o2 = new C4939OooO00o();
            iili11i1 iili11i1 = iili11i1.this;
            oooO00o.OooO00o(oooO00o2, iili11i1.OooO00o, iili11i1.f17939OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.OooO00o(new OooO0O0(th));
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            LL1LL.OooO00o oooO00o = this.OooO00o;
            OooO0OO oooO0OO = new OooO0OO(t);
            iili11i1 iili11i1 = iili11i1.this;
            oooO00o.OooO00o(oooO0OO, iili11i1.OooO00o, iili11i1.f17939OooO00o);
        }
    }

    public iili11i1(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.f17939OooO00o = timeUnit;
        this.f17938OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        LL1LL.OooO00o OooO00o2 = this.f17938OooO00o.m16172OooO00o();
        r3.add(OooO00o2);
        return new OooO00o(r3, OooO00o2, r3);
    }
}
