package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.LL */
public class C1681LL implements AbstractC9685lL {
    public C9727l OooO00o;

    public C1681LL(C9727l r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new C5707LiL1(this.OooO00o.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16164OooO00o() throws IOException {
        return this.OooO00o.m21778OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        try {
            return OooO00o();
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
