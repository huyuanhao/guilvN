package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IlI丨l11  reason: invalid class name */
public final class IlIl11 {
    public static int OooO00o(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        return ((bArr[i3 + 1] & 255) << 24) | i4 | ((bArr[i3] & 255) << 16);
    }

    public static int OooO00o(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            i3 |= (bArr[i + i4] & 255) << (i4 * 8);
        }
        return i3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15666OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        long j = (long) (bArr[i] & 255);
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        return ((((long) bArr[i7 + 1]) & 255) << 56) | j | ((long) ((bArr[i2] & 255) << 8)) | ((long) ((bArr[i3] & 255) << 16)) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48);
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        int i3 = i2 + 1;
        bArr[i2] = (byte) i;
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void OooO00o(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            bArr[i2 + i4] = (byte) (i >>> (i4 * 8));
        }
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        int i2 = i + 1;
        bArr[i] = (byte) ((int) j);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) (j >>> 8));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) (j >>> 16));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) (j >>> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) (j >>> 32));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) (j >>> 40));
        bArr[i7] = (byte) ((int) (j >>> 48));
        bArr[i7 + 1] = (byte) ((int) (j >>> 56));
    }

    public static byte[] OooO00o(int i) {
        return new byte[]{(byte) i, (byte) (i >>> 8), (byte) (i >>> 16), (byte) (i >>> 24)};
    }

    public static byte[] OooO00o(long j) {
        return new byte[]{(byte) ((int) j), (byte) ((int) (j >>> 8)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 32)), (byte) ((int) (j >>> 40)), (byte) ((int) (j >>> 48)), (byte) ((int) (j >>> 56))};
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
    public static int[] m15667OooO00o(byte[] bArr) {
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
