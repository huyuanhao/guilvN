package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.ILiliiI */
public final class ILiliiI<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC5189I1l1l<? super T, Integer, Boolean> OooO00o;

    /* renamed from: com.pd.sdk.ILiliiI$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f15615OooO00o;
        public boolean OooO0O0 = true;
        public int o00oO0O;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f15615OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f15615OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f15615OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                this.f15615OooO00o.onNext(t);
                return;
            }
            try {
                AbstractC5189I1l1l<? super T, Integer, Boolean> r0 = ILiliiI.this.OooO00o;
                int i = this.o00oO0O;
                this.o00oO0O = i + 1;
                if (!r0.OooO00o(t, Integer.valueOf(i)).booleanValue()) {
                    this.OooO0O0 = false;
                    this.f15615OooO00o.onNext(t);
                    return;
                }
                request(1);
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f15615OooO00o, t);
            }
        }
    }

    /* renamed from: com.pd.sdk.ILiliiI$OooO0O0 */
    public static class OooO0O0 implements AbstractC5189I1l1l<T, Integer, Boolean> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        public OooO0O0(AbstractC9847l1 r1) {
            this.OooO00o = r1;
        }

        public Boolean OooO00o(T t, Integer num) {
            return (Boolean) this.OooO00o.call(t);
        }
    }

    public ILiliiI(AbstractC5189I1l1l<? super T, Integer, Boolean> r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }

    public static <T> AbstractC5189I1l1l<T, Integer, Boolean> OooO00o(AbstractC9847l1<? super T, Boolean> r1) {
        return new OooO0O0(r1);
    }
}
