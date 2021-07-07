package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.pkcs.PKCSException;

/* renamed from: com.pd.sdk.illL  reason: case insensitive filesystem */
public class C6332illL extends l1ili1 {
    public C6332illL(l1ili1 r1) {
        super(r1.m17584OooO00o());
    }

    public C6332illL(C9764Il1 r1) {
        super(r1);
    }

    public C6332illL(byte[] bArr) throws IOException {
        super(bArr);
    }

    @Override // com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1, com.p118pd.sdk.l1ili1
    public C6213iL11I OooO00o() throws PKCSException {
        try {
            return IILLl.OooO00o(m17583OooO00o());
        } catch (IOException e) {
            throw new PKCSException("error extracting key encoding: " + e.getMessage(), e);
        }
    }
}
