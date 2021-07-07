package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.IL丨iI  reason: invalid class name and case insensitive filesystem */
public class C5332ILiI implements AbstractC93131l {
    public C6017i1Il OooO00o;

    public C5332ILiI(C6017i1Il i1il) {
        this.OooO00o = i1il;
    }

    @Override // com.p118pd.sdk.AbstractC93131l
    public C6213iL11I OooO00o(InputStream inputStream) throws IOException {
        int bitLength = (this.OooO00o.OooO0OO().bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        C6304ilIi1.OooO00o(inputStream, bArr, 0, bitLength);
        return new LiIiLii(new BigInteger(1, bArr), this.OooO00o);
    }
}
