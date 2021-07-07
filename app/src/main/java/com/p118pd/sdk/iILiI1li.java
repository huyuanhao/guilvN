package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.iILiI1li */
public final class iILiI1li<T, R> implements C9349III.OooO00o<R> {
    public final C9349III.OooO00o<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III.OooO0O0<? extends R, ? super T> f17529OooO00o;

    public iILiI1li(C9349III.OooO00o<T> oooO00o, C9349III.OooO0O0<? extends R, ? super T> oooO0O0) {
        this.OooO00o = oooO00o;
        this.f17529OooO00o = oooO0O0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.pd.sdk.丨III$OooO00o<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r3) {
        try {
            AbstractC9508LiLi r0 = (AbstractC9508LiLi) C9714lli.OooO00o((C9349III.OooO0O0) this.f17529OooO00o).call(r3);
            try {
                r0.onStart();
                this.OooO00o.call(r0);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                r0.onError(th);
            }
        } catch (Throwable th2) {
            IIl11.m15447OooO00o(th2);
            r3.onError(th2);
        }
    }
}
