package com.p118pd.sdk;

import java.lang.reflect.Array;

/* renamed from: com.pd.sdk.L1丨i丨  reason: invalid class name and case insensitive filesystem */
public class C5601L1i {
    public static boolean OooO00o(short[] sArr, short[] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= sArr[length] == sArr2[length];
        }
        return z;
    }

    public static boolean OooO00o(short[][] sArr, short[][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= OooO00o(sArr[length], sArr2[length]);
        }
        return z;
    }

    public static boolean OooO00o(short[][][] sArr, short[][][] sArr2) {
        if (sArr.length != sArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = sArr.length - 1; length >= 0; length--) {
            z &= OooO00o(sArr[length], sArr2[length]);
        }
        return z;
    }

    public static byte[] OooO00o(int[] iArr) {
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    public static byte[] OooO00o(short[] sArr) {
        byte[] bArr = new byte[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            bArr[i] = (byte) sArr[i];
        }
        return bArr;
    }

    public static int[] OooO00o(byte[] bArr) {
        int[] iArr = new int[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            iArr[i] = bArr[i] & 255;
        }
        return iArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m16006OooO00o(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            sArr[i] = (short) (bArr[i] & 255);
        }
        return sArr;
    }

    public static byte[][] OooO00o(short[][] sArr) {
        int length = sArr.length;
        int[] iArr = new int[2];
        iArr[1] = sArr[0].length;
        iArr[0] = length;
        byte[][] bArr = (byte[][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                bArr[i][i2] = (byte) sArr[i][i2];
            }
        }
        return bArr;
    }

    public static short[][] OooO00o(byte[][] bArr) {
        int length = bArr.length;
        int[] iArr = new int[2];
        iArr[1] = bArr[0].length;
        iArr[0] = length;
        short[][] sArr = (short[][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                sArr[i][i2] = (short) (bArr[i][i2] & 255);
            }
        }
        return sArr;
    }

    public static byte[][][] OooO00o(short[][][] sArr) {
        int length = sArr.length;
        int length2 = sArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = sArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        byte[][][] bArr = (byte[][][]) Array.newInstance(byte.class, iArr);
        for (int i = 0; i < sArr.length; i++) {
            for (int i2 = 0; i2 < sArr[0].length; i2++) {
                for (int i3 = 0; i3 < sArr[0][0].length; i3++) {
                    bArr[i][i2][i3] = (byte) sArr[i][i2][i3];
                }
            }
        }
        return bArr;
    }

    public static short[][][] OooO00o(byte[][][] bArr) {
        int length = bArr.length;
        int length2 = bArr[0].length;
        int[] iArr = new int[3];
        iArr[2] = bArr[0][0].length;
        iArr[1] = length2;
        iArr[0] = length;
        short[][][] sArr = (short[][][]) Array.newInstance(short.class, iArr);
        for (int i = 0; i < bArr.length; i++) {
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                for (int i3 = 0; i3 < bArr[0][0].length; i3++) {
                    sArr[i][i2][i3] = (short) (bArr[i][i2][i3] & 255);
                }
            }
        }
        return sArr;
    }
}
