package com.p118pd.sdk;

import com.p118pd.sdk.C6402iiIL;
import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.丨L丨iILL  reason: invalid class name and case insensitive filesystem */
public final class C9555LiILL<T, U> implements C9349III.OooO0O0<T, T> {
    public final AbstractC9847l1<? super T, ? extends C9349III<U>> OooO00o;

    /* renamed from: com.pd.sdk.丨L丨iILL$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ iLIiLILI f23131OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C6402iiIL.OooO0O0<T> f23132OooO00o = new C6402iiIL.OooO0O0<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<?> f23133OooO00o = this;

        /* renamed from: com.pd.sdk.丨L丨iILL$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4978OooO00o extends AbstractC9508LiLi<U> {
            public final /* synthetic */ int o00oO0O;

            public C4978OooO00o(int i) {
                this.o00oO0O = i;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f23132OooO00o.OooO00o(this.o00oO0O, oooO00o.OooO00o, oooO00o.f23133OooO00o);
                unsubscribe();
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO00o.this.f23133OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(U u) {
                onCompleted();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, IL11lL r3, iLIiLILI iliilili) {
            super(r2);
            this.OooO00o = r3;
            this.f23131OooO00o = iliilili;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f23132OooO00o.OooO00o(this.OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            unsubscribe();
            this.f23132OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                C9349III r0 = (C9349III) C9555LiILL.this.OooO00o.call(t);
                C4978OooO00o oooO00o = new C4978OooO00o(this.f23132OooO00o.OooO00o(t));
                this.f23131OooO00o.OooO00o(oooO00o);
                r0.OooO0O0((AbstractC9508LiLi) oooO00o);
            } catch (Throwable th) {
                IIl11.OooO00o(th, this);
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C9555LiILL(AbstractC9847l1<? super T, ? extends C9349III<U>> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r4) {
        IL11lL r0 = new IL11lL(r4);
        iLIiLILI iliilili = new iLIiLILI();
        r4.add(iliilili);
        return new OooO00o(r4, r0, iliilili);
    }
}
