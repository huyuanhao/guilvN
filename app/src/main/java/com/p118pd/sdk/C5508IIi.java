package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.I丨Ii  reason: invalid class name and case insensitive filesystem */
public class C5508IIi implements AbstractC6541lIlii {
    public C9727l OooO00o;

    public C5508IIi(C9727l r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new C5837L1l(C6304ilIi1.m17339OooO00o(m15759OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m15759OooO00o() {
        return new I1L11L(this.OooO00o);
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
