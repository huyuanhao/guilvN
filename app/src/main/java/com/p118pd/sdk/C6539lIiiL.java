package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.lI丨iiL丨  reason: invalid class name and case insensitive filesystem */
public final class C6539lIiiL<T> implements C9349III.OooO0O0<T, T> {
    public final liii1l OooO00o;

    /* renamed from: com.pd.sdk.lI丨iiL丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18419OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f18419OooO00o = r3;
        }

        public void OooO0OO() {
            try {
                C6539lIiiL.this.OooO00o.call();
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                this.f18419OooO00o.onCompleted();
            } finally {
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            try {
                this.f18419OooO00o.onError(th);
            } finally {
                OooO0OO();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f18419OooO00o.onNext(t);
        }
    }

    public C6539lIiiL(liii1l r2) {
        if (r2 != null) {
            this.OooO00o = r2;
            return;
        }
        throw new NullPointerException("Action can not be null");
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r2) {
        return new OooO00o(r2, r2);
    }
}
