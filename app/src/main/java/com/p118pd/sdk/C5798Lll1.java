package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;

/* renamed from: com.pd.sdk.Lll1  reason: case insensitive filesystem */
public final class C5798Lll1<T> implements LLil11.OooOo00<T> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final liii1l f16733OooO00o;

    public C5798Lll1(LLil11.OooOo00<T> oooOo00, liii1l r2) {
        this.OooO00o = oooOo00;
        this.f16733OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super T> r2) {
        try {
            this.f16733OooO00o.call();
            this.OooO00o.call(r2);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r2.onError(th);
        }
    }
}
