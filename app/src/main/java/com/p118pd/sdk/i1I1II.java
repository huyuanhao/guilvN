package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.i1I1II */
public final class i1I1II<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC9847l1<? super T, Boolean> OooO00o;

    /* renamed from: com.pd.sdk.i1I1II$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.i1I1II$OooO0O0 */
    public final class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f17348OooO00o;
        public boolean OooO0O0;

        public OooO0O0(AbstractC9508LiLi<? super T> r2) {
            this.f17348OooO00o = r2;
        }

        public void OooO00o(long j) {
            request(j);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.f17348OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.f17348OooO00o.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f17348OooO00o.onNext(t);
            try {
                if (i1I1II.this.OooO00o.call(t).booleanValue()) {
                    this.OooO0O0 = true;
                    this.f17348OooO00o.onCompleted();
                    unsubscribe();
                }
            } catch (Throwable th) {
                this.OooO0O0 = true;
                IIl11.OooO00o(th, this.f17348OooO00o, t);
                unsubscribe();
            }
        }
    }

    public i1I1II(AbstractC9847l1<? super T, Boolean> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3);
        r3.add(oooO0O0);
        r3.setProducer(new OooO00o(oooO0O0));
        return oooO0O0;
    }
}
