package com.p118pd.sdk;

import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.iI1lL  reason: case insensitive filesystem */
public abstract class AbstractC6078iI1lL implements L1Illl1i {
    public iL1liI OooO00o;

    @Override // com.p118pd.sdk.L1Illl1i, com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO00o(C6213iL11I r2) {
        return OooO0O0(null, r2);
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public void OooO00o(iL1liI il1lii) {
        this.OooO00o = il1lii;
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public boolean OooO00o(byte[] bArr, C6213iL11I r3, byte[] bArr2) throws CryptoException {
        return OooO00o(null, bArr, r3, bArr2);
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public byte[] OooO00o(C6213iL11I r2, byte[] bArr) throws CryptoException {
        return OooO00o((II1LLIl) null, r2, bArr);
    }

    @Override // com.p118pd.sdk.L1Illl1i
    public AbstractC93171I1 OooO0O0(C6213iL11I r2) {
        return OooO00o((II1LLIl) null, r2);
    }
}
