package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.丨i1丨1丨LL  reason: invalid class name and case insensitive filesystem */
public class C9579i11LL implements AbstractC6541lIlii {
    public iI1L1Ll OooO00o;

    public C9579i11LL(iI1L1Ll r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new C6487lIIiIlL(this.OooO00o.m16938OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m21621OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        try {
            return OooO00o();
        } catch (IOException e) {
            throw new ASN1ParsingException("IOException converting stream to byte array: " + e.getMessage(), e);
        }
    }
}
