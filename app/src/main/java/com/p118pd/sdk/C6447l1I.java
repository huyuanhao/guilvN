package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1I丨  reason: invalid class name and case insensitive filesystem */
public final class C6447l1I {
    public static int OooO00o(byte[] bArr) {
        if (bArr.length <= 4) {
            if (bArr.length == 0) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < bArr.length; i2++) {
                i |= (bArr[i2] & 255) << (((bArr.length - 1) - i2) * 8);
            }
            return i;
        }
        throw new ArithmeticException("invalid input length");
    }

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        return (bArr[i3 + 1] & 255) | i4 | ((bArr[i3] & 255) << 8);
    }

    public static int OooO00o(byte[] bArr, int i, int i2) {
        if (bArr.length == 0 || bArr.length < (i + i2) - 1) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= (bArr[i + i4] & 255) << (((i2 - i4) - 1) * 8);
        }
        return i3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m17565OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return ((long) (bArr[i7 + 1] & 255)) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((255 & ((long) bArr[i5])) << 24) | ((long) ((bArr[i6] & 255) << 16)) | ((long) ((bArr[i7] & 255) << 8));
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        bArr[i4] = (byte) (i >>> 8);
        bArr[i4 + 1] = (byte) i;
    }

    public static void OooO00o(int i, byte[] bArr, int i2, int i3) {
        int i4 = i3 - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            bArr[i2 + i5] = (byte) (i >>> ((i4 - i5) * 8));
        }
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) (j >>> 56));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j >>> 48));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j >>> 40));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j >>> 32));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j >>> 24));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j >>> 16));
        bArr[i7] = (byte) ((int) (j >>> 8));
        bArr[i7 + 1] = (byte) ((int) j);
    }

    public static byte[] OooO00o(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) i};
    }

    public static byte[] OooO00o(int i, int i2) throws ArithmeticException {
        if (i < 0) {
            return null;
        }
        int OooO0OO = C6356i1IiI1.OooO0OO(i);
        if (OooO0OO <= i2) {
            byte[] bArr = new byte[i2];
            int i3 = i2 - 1;
            for (int i4 = i3; i4 >= i2 - OooO0OO; i4--) {
                bArr[i4] = (byte) (i >>> ((i3 - i4) * 8));
            }
            return bArr;
        }
        throw new ArithmeticException("Cannot encode given integer into specified number of octets.");
    }

    public static byte[] OooO00o(long j) {
        return new byte[]{(byte) ((int) (j >>> 56)), (byte) ((int) (j >>> 48)), (byte) ((int) (j >>> 40)), (byte) ((int) (j >>> 32)), (byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 8)), (byte) ((int) j)};
    }

    public static byte[] OooO00o(int[] iArr) {
        byte[] bArr = new byte[(iArr.length << 2)];
        for (int i = 0; i < iArr.length; i++) {
            OooO00o(iArr[i], bArr, i << 2);
        }
        return bArr;
    }

    public static byte[] OooO00o(int[] iArr, int i) {
        int length = iArr.length;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 <= length - 2) {
            OooO00o(iArr[i2], bArr, i3);
            i2++;
            i3 += 4;
        }
        OooO00o(iArr[length - 1], bArr, i3, i - i3);
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m17566OooO00o(byte[] bArr) {
        int length = (bArr.length + 3) / 4;
        int length2 = bArr.length & 3;
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i <= length - 2) {
            iArr[i] = OooO00o(bArr, i2);
            i++;
            i2 += 4;
        }
        int i3 = length - 1;
        if (length2 != 0) {
            iArr[i3] = OooO00o(bArr, i2, length2);
        } else {
            iArr[i3] = OooO00o(bArr, i2);
        }
        return iArr;
    }
}
