package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.iI丨1LI  reason: invalid class name and case insensitive filesystem */
public class C6133iI1LI implements AbstractC6796llliI {
    public C9727l OooO00o;

    public C6133iI1LI(C9727l r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6796llliI, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new i1I1I1l(this.OooO00o.OooO00o(), false);
    }

    @Override // com.p118pd.sdk.AbstractC6796llliI, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17036OooO00o() throws IOException {
        return this.OooO00o.m21778OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        try {
            return OooO00o();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage(), e);
        }
    }
}
