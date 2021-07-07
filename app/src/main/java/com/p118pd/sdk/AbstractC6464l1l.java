package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1l丨丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6464l1l {
    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m17599OooO00o(byte[] bArr, int i) {
        int OooO00o = OooO00o(bArr, i);
        return (((long) OooO00o(bArr, i + 4)) & 4294967295L) | ((((long) OooO00o) & 4294967295L) << 32);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m17600OooO00o(byte[] bArr, int i) {
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i >>> 24);
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        OooO00o((int) (j >>> 32), bArr, i);
        OooO00o((int) (j & 4294967295L), bArr, i + 4);
    }

    public static void OooO00o(short s, byte[] bArr, int i) {
        bArr[i] = (byte) s;
        bArr[i + 1] = (byte) (s >>> 8);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = OooO00o(bArr, i);
            i += 4;
        }
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = OooO0O0(bArr, i);
            i += 4;
        }
    }

    public static void OooO00o(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = m17599OooO00o(bArr, i);
            i += 8;
        }
    }

    public static void OooO00o(byte[] bArr, int i, long[] jArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            jArr[i2 + i4] = m17601OooO0O0(bArr, i);
            i += 8;
        }
    }

    public static void OooO00o(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            OooO00o(i2, bArr, i);
            i += 4;
        }
    }

    public static void OooO00o(long[] jArr, int i, int i2, byte[] bArr, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            OooO0O0(jArr[i + i4], bArr, i3);
            i3 += 8;
        }
    }

    public static void OooO00o(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            OooO00o(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] OooO00o(int i) {
        byte[] bArr = new byte[4];
        OooO00o(i, bArr, 0);
        return bArr;
    }

    public static byte[] OooO00o(long j) {
        byte[] bArr = new byte[8];
        OooO00o(j, bArr, 0);
        return bArr;
    }

    public static byte[] OooO00o(short s) {
        byte[] bArr = new byte[2];
        OooO00o(s, bArr, 0);
        return bArr;
    }

    public static byte[] OooO00o(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 4)];
        OooO00o(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] OooO00o(long[] jArr) {
        byte[] bArr = new byte[(jArr.length * 8)];
        OooO00o(jArr, bArr, 0);
        return bArr;
    }

    public static int[] OooO00o(byte[] bArr, int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = OooO0O0(bArr, i);
            i += 4;
        }
        return iArr;
    }

    public static int OooO0O0(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long m17601OooO0O0(byte[] bArr, int i) {
        return ((((long) OooO0O0(bArr, i + 4)) & 4294967295L) << 32) | (4294967295L & ((long) OooO0O0(bArr, i)));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static short m17602OooO0O0(byte[] bArr, int i) {
        return (short) (((bArr[i + 1] & 255) << 8) | (bArr[i] & 255));
    }

    public static void OooO0O0(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void OooO0O0(long j, byte[] bArr, int i) {
        OooO0O0((int) (4294967295L & j), bArr, i);
        OooO0O0((int) (j >>> 32), bArr, i + 4);
    }

    public static void OooO0O0(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = OooO0O0(bArr, i);
            i += 4;
        }
    }

    public static void OooO0O0(byte[] bArr, int i, long[] jArr) {
        for (int i2 = 0; i2 < jArr.length; i2++) {
            jArr[i2] = m17601OooO0O0(bArr, i);
            i += 8;
        }
    }

    public static void OooO0O0(int[] iArr, byte[] bArr, int i) {
        for (int i2 : iArr) {
            OooO0O0(i2, bArr, i);
            i += 4;
        }
    }

    public static void OooO0O0(long[] jArr, byte[] bArr, int i) {
        for (long j : jArr) {
            OooO0O0(j, bArr, i);
            i += 8;
        }
    }

    public static byte[] OooO0O0(int i) {
        byte[] bArr = new byte[4];
        OooO0O0(i, bArr, 0);
        return bArr;
    }

    public static byte[] OooO0O0(long j) {
        byte[] bArr = new byte[8];
        OooO0O0(j, bArr, 0);
        return bArr;
    }

    public static byte[] OooO0O0(int[] iArr) {
        byte[] bArr = new byte[(iArr.length * 4)];
        OooO0O0(iArr, bArr, 0);
        return bArr;
    }

    public static byte[] OooO0O0(long[] jArr) {
        byte[] bArr = new byte[(jArr.length * 8)];
        OooO0O0(jArr, bArr, 0);
        return bArr;
    }
}
