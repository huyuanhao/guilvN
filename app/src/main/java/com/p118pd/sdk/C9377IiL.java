package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.丨IiL  reason: invalid class name and case insensitive filesystem */
public class C9377IiL<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC6153iL1l<? super Long> OooO00o;

    /* renamed from: com.pd.sdk.丨IiL$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            C9377IiL.this.OooO00o.call(Long.valueOf(j));
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.丨IiL$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        public OooO0O0(AbstractC9508LiLi<? super T> r3) {
            this.OooO00o = r3;
            request(0);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void OooO00o(long j) {
            request(j);
        }
    }

    public C9377IiL(AbstractC6153iL1l<? super Long> il1l) {
        this.OooO00o = il1l;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3);
        r3.setProducer(new OooO00o(oooO0O0));
        r3.add(oooO0O0);
        return oooO0O0;
    }
}
