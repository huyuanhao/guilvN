package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.lIIiIlL丨  reason: invalid class name and case insensitive filesystem */
public class C6487lIIiIlL extends AbstractC6804llL1ii {
    public C6487lIIiIlL(AbstractC6854lLi1LL r2) throws IOException {
        super(r2.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o));
    }

    public C6487lIIiIlL(byte[] bArr) {
        super(bArr);
    }

    public static void OooO00o(C6119iIl1il r1, byte[] bArr) throws IOException {
        r1.OooO00o(4, bArr);
    }

    @Override // com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(4, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6541lIlii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6804llL1ii, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6181iLiLI
    public boolean OooO00o() {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return L1li1.OooO00o(this.OooO00o.length) + 1 + this.OooO00o.length;
    }
}
