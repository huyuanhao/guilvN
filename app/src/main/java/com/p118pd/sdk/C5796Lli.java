package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Lli丨  reason: invalid class name and case insensitive filesystem */
public final class C5796Lli {
    public static void OooO00o(BigInteger[] bigIntegerArr, BigInteger bigInteger) {
        for (int length = bigIntegerArr.length - 1; length >= 0; length--) {
            bigIntegerArr[length] = bigInteger;
        }
    }

    public static boolean OooO00o(BigInteger[] bigIntegerArr, BigInteger[] bigIntegerArr2) {
        if (bigIntegerArr.length != bigIntegerArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bigIntegerArr.length; i2++) {
            i |= bigIntegerArr[i2].compareTo(bigIntegerArr2[i2]);
        }
        return i == 0;
    }

    public static byte[] OooO00o(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 1 || (bigInteger.bitLength() & 7) != 0) {
            return byteArray;
        }
        int bitLength = bigInteger.bitLength() >> 3;
        byte[] bArr = new byte[bitLength];
        System.arraycopy(byteArray, 1, bArr, 0, bitLength);
        return bArr;
    }

    public static int[] OooO00o(int i, BigInteger[] bigIntegerArr) {
        BigInteger valueOf = BigInteger.valueOf((long) i);
        int[] iArr = new int[bigIntegerArr.length];
        for (int i2 = 0; i2 < bigIntegerArr.length; i2++) {
            iArr[i2] = bigIntegerArr[i2].mod(valueOf).intValue();
        }
        return iArr;
    }

    public static int[] OooO00o(BigInteger[] bigIntegerArr) {
        int[] iArr = new int[bigIntegerArr.length];
        for (int i = 0; i < bigIntegerArr.length; i++) {
            iArr[i] = bigIntegerArr[i].intValue();
        }
        return iArr;
    }

    public static BigInteger[] OooO00o(BigInteger[] bigIntegerArr, int i, int i2) {
        int i3 = i2 - i;
        BigInteger[] bigIntegerArr2 = new BigInteger[i3];
        System.arraycopy(bigIntegerArr, i, bigIntegerArr2, 0, i3);
        return bigIntegerArr2;
    }
}
