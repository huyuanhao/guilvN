package com.p118pd.sdk;

import java.security.PrivateKey;
import java.security.Provider;
import javax.crypto.SecretKey;

/* renamed from: com.pd.sdk.丨I丨LiII  reason: invalid class name and case insensitive filesystem */
public class C9443ILiII extends LLIlii implements AbstractC6712liI {
    public C9443ILiII(Provider provider) {
        super(provider);
    }

    @Override // com.p118pd.sdk.AbstractC6712liI
    public I1l1I OooO00o(C6456l1ilL r2, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return new I1l1I(r2, privateKey, bArr, bArr2).OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6712liI
    public Ll1L1i OooO00o(C6456l1ilL r2, SecretKey secretKey) {
        return new C9876liIL(r2, secretKey).OooO00o(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6712liI
    public iLLl1I OooO00o(C6456l1ilL r2, PrivateKey privateKey) {
        return new iLLl1I(r2, privateKey).OooO00o(this.OooO00o);
    }
}
