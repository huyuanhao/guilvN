package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.LlLiL丨L丨  reason: invalid class name */
public class LlLiLL implements AbstractC6854lLi1LL, AbstractC6181iLiLI {
    public C9727l OooO00o;

    public LlLiLL(C9727l r1) {
        this.OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        try {
            return new C1687iI(this.OooO00o.OooO00o());
        } catch (IllegalArgumentException e) {
            throw new ASN1Exception(e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16395OooO00o() throws IOException {
        return this.OooO00o.m21778OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        try {
            return OooO00o();
        } catch (IOException e) {
            throw new ASN1ParsingException("unable to get DER object", e);
        } catch (IllegalArgumentException e2) {
            throw new ASN1ParsingException("unable to get DER object", e2);
        }
    }
}
