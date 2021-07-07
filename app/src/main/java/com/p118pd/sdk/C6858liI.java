package com.p118pd.sdk;

import java.security.PrivateKey;
import javax.crypto.SecretKey;

/* renamed from: com.pd.sdk.l丨iI  reason: invalid class name and case insensitive filesystem */
public class C6858liI extends ILLli implements AbstractC6712liI {
    @Override // com.p118pd.sdk.AbstractC6712liI
    public I1l1I OooO00o(C6456l1ilL r2, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return new I1l1I(r2, privateKey, bArr, bArr2);
    }

    @Override // com.p118pd.sdk.AbstractC6712liI
    public Ll1L1i OooO00o(C6456l1ilL r2, SecretKey secretKey) {
        return new C9876liIL(r2, secretKey);
    }

    @Override // com.p118pd.sdk.AbstractC6712liI
    public iLLl1I OooO00o(C6456l1ilL r2, PrivateKey privateKey) {
        return new iLLl1I(r2, privateKey);
    }
}
