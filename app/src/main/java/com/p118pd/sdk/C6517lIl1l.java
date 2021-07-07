package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIl1l  reason: case insensitive filesystem */
public class C6517lIl1l {
    public static byte[] OooO00o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, bArr.length - i, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, int i, int i2) {
        if (bArr.length < i + i2) {
            i = bArr.length - i2;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, i2, bArr2, 0, i);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    public static byte[] OooO0O0(byte[] bArr, int i) {
        return C9586iIILl.OooO00o(bArr, i);
    }
}
