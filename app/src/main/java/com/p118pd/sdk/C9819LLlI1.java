package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.丨丨LLlI1  reason: invalid class name and case insensitive filesystem */
public class C9819LLlI1 implements AbstractC8957ooOOOoOO {
    public final C9727l OooO00o;
    public final int o00oO0O;

    public C9819LLlI1(int i, C9727l r2) {
        this.o00oO0O = i;
        this.OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC8957ooOOOoOO, com.p118pd.sdk.AbstractC6181iLiLI
    public AbstractC6122iIlLiL OooO00o() throws IOException {
        return new L111(this.o00oO0O, this.OooO00o.OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC8957ooOOOoOO, com.p118pd.sdk.AbstractC6181iLiLI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21908OooO00o() throws IOException {
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
