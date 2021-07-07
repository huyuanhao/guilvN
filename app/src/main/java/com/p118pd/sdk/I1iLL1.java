package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.I1丨iLL1  reason: invalid class name */
public final class I1iLL1<T> implements C9349III.OooO0O0<T, T> {
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.I1丨iLL1$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15426OooO00o;
        public int o00oO0O;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f15426OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15426OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15426OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int i = this.o00oO0O;
            if (i >= I1iLL1.this.o00oO0O) {
                this.f15426OooO00o.onNext(t);
            } else {
                this.o00oO0O = i + 1;
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r3) {
            this.f15426OooO00o.setProducer(r3);
            r3.request((long) I1iLL1.this.o00oO0O);
        }
    }

    public I1iLL1(int i) {
        if (i >= 0) {
            this.o00oO0O = i;
            return;
        }
        throw new IllegalArgumentException("n >= 0 required but it was " + i);
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
