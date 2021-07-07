package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.l丨11  reason: invalid class name and case insensitive filesystem */
public final class C6812l11<T, U> implements C9349III.OooO00o<T> {
    public final C9349III<? extends T> OooO00o;
    public final C9349III<U> OooO0O0;

    /* renamed from: com.pd.sdk.l丨11$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<U> {
        public final /* synthetic */ iLIiLILI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18865OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi r2, iLIiLILI iliilili) {
            this.f18865OooO00o = r2;
            this.OooO00o = iliilili;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.OooO00o(C9638ill.OooO0O0());
                C6812l11.this.OooO00o.OooO0O0(this.f18865OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.f18865OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
            onCompleted();
        }
    }

    public C6812l11(C9349III<? extends T> r1, C9349III<U> r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        iLIiLILI iliilili = new iLIiLILI();
        r3.add(iliilili);
        OooO00o oooO00o = new OooO00o(C6695lilIl.OooO00o((AbstractC9508LiLi) r3), iliilili);
        iliilili.OooO00o(oooO00o);
        this.OooO0O0.OooO0O0(oooO00o);
    }
}
