package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.LLL */
public class LLL implements AbstractC6532lIII {
    public C9727l OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;

    public LLL(boolean z, int i, C9727l r3) {
        this.OooO0O0 = z;
        this.o00oO0O = i;
        this.OooO00o = r3;
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC6181iLiLI
    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16215OooO00o() throws IOException {
        return this.OooO00o.OooO00o(this.OooO0O0, this.o00oO0O);
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII
    public AbstractC6854lLi1LL OooO00o(int i, boolean z) throws IOException {
        if (!z) {
            return this.OooO00o.m21779OooO00o(this.OooO0O0, i);
        }
        if (this.OooO0O0) {
            return this.OooO00o.m21778OooO00o();
        }
        throw new IOException("Explicit tags must be constructed (see X.690 8.14.2)");
    }

    @Override // com.p118pd.sdk.AbstractC6532lIII, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16216OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        try {
            return m16215OooO00o();
        } catch (IOException e) {
            throw new ASN1ParsingException(e.getMessage());
        }
    }
}
