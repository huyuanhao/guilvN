package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.L11丨  reason: invalid class name and case insensitive filesystem */
public class C5578L11 implements AbstractC9685lL {
    public C9727l OooO00o;

    public C5578L11(C9727l r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new C6351ill(this.OooO00o.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9685lL, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15890OooO00o() throws IOException {
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
