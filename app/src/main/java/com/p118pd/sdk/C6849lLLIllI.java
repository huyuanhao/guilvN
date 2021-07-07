package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.l丨LLIllI  reason: invalid class name and case insensitive filesystem */
public class C6849lLLIllI {
    public int OooO00o(IIiLIli r1) {
        return (r1.OooO0O0() + 7) / 8;
    }

    public int OooO00o(AbstractC97441iIIL r1) {
        return (r1.OooO0O0() + 7) / 8;
    }

    public byte[] OooO00o(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        } else if (i <= byteArray.length) {
            return byteArray;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return bArr2;
        }
    }
}
