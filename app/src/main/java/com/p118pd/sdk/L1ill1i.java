package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.L1il丨l1i  reason: invalid class name */
public final class L1ill1i<T, E> implements C9349III.OooO0O0<T, T> {
    public final C9349III<? extends E> OooO00o;

    /* renamed from: com.pd.sdk.L1il丨l1i$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16209OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, boolean z, AbstractC9508LiLi r4) {
            super(r2, z);
            this.f16209OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                this.f16209OooO00o.onCompleted();
            } finally {
                this.f16209OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            try {
                this.f16209OooO00o.onError(th);
            } finally {
                this.f16209OooO00o.unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f16209OooO00o.onNext(t);
        }
    }

    /* renamed from: com.pd.sdk.L1il丨l1i$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<E> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16210OooO00o;

        public OooO0O0(AbstractC9508LiLi r2) {
            this.f16210OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f16210OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16210OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(E e) {
            onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public L1ill1i(C9349III<? extends E> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r4) {
        IL11lL r0 = new IL11lL(r4, false);
        OooO00o oooO00o = new OooO00o(r0, false, r0);
        OooO0O0 oooO0O0 = new OooO0O0(oooO00o);
        r0.add(oooO00o);
        r0.add(oooO0O0);
        r4.add(r0);
        this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO0O0);
        return oooO00o;
    }
}
