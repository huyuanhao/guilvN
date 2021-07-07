package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.liI1  reason: case insensitive filesystem */
public final class C6645liI1<T> implements LLil11.OooOo00<T> {
    public final LLil11<? extends T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<?> f18597OooO00o;

    /* renamed from: com.pd.sdk.liI1$OooO00o */
    public class OooO00o extends AbstractC93021L<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93021L f18598OooO00o;

        public OooO00o(AbstractC93021L r2) {
            this.f18598OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.f18598OooO00o.OooO00o((Object) t);
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.f18598OooO00o.onError(th);
        }
    }

    /* renamed from: com.pd.sdk.liI1$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<Object> {
        public final /* synthetic */ iLIiLILI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC93021L f18600OooO00o;
        public boolean OooO0O0;

        public OooO0O0(AbstractC93021L r2, iLIiLILI iliilili) {
            this.f18600OooO00o = r2;
            this.OooO00o = iliilili;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.OooO00o(this.f18600OooO00o);
                C6645liI1.this.OooO00o.OooO00o(this.f18600OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.f18600OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
            onCompleted();
        }
    }

    public C6645liI1(LLil11<? extends T> r1, C9349III<?> r2) {
        this.OooO00o = r1;
        this.f18597OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r3) {
        OooO00o oooO00o = new OooO00o(r3);
        iLIiLILI iliilili = new iLIiLILI();
        r3.OooO00o((LlIiLii) iliilili);
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o, iliilili);
        iliilili.OooO00o(oooO0O0);
        this.f18597OooO00o.OooO00o((AbstractC9508LiLi<? super Object>) oooO0O0);
    }
}
