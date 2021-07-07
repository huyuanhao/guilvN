package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iLIl1  reason: case insensitive filesystem */
public abstract class AbstractC6163iLIl1 {
    public static final long OooO00o = 4294967295L;

    public static int OooO00o(int i, int i2, int[] iArr, int i3) {
        long j = ((long) i2) & 4294967295L;
        int i4 = i3 + 0;
        long j2 = ((((long) i) & 4294967295L) * j) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + j + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j3;
        long j4 = j3 >>> 32;
        int i6 = i3 + 2;
        long j5 = j4 + (4294967295L & ((long) iArr[i6]));
        iArr[i6] = (int) j5;
        if ((j5 >>> 32) == 0) {
            return 0;
        }
        return C1iiIiI.OooO0O0(6, iArr, i3, 3);
    }

    public static int OooO00o(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        long j3 = j & 4294967295L;
        int i3 = i2 + 0;
        long j4 = (j2 * j3) + (((long) iArr[i3]) & 4294967295L) + 0;
        iArr[i3] = (int) j4;
        long j5 = j >>> 32;
        long j6 = (j2 * j5) + j3;
        int i4 = i2 + 1;
        long j7 = (j4 >>> 32) + j6 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j7;
        int i5 = i2 + 2;
        long j8 = (j7 >>> 32) + j5 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j8;
        int i6 = i2 + 3;
        long j9 = (j8 >>> 32) + (4294967295L & ((long) iArr[i6]));
        iArr[i6] = (int) j9;
        if ((j9 >>> 32) == 0) {
            return 0;
        }
        return C1iiIiI.OooO0O0(6, iArr, i2, 4);
    }

    public static int OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = ((long) i) & 4294967295L;
        int i4 = i3 + 0;
        long j2 = ((((long) iArr[i2 + 0]) & 4294967295L) * j) + (((long) iArr2[i4]) & 4294967295L) + 0;
        iArr2[i4] = (int) j2;
        int i5 = i3 + 1;
        long j3 = (j2 >>> 32) + ((((long) iArr[i2 + 1]) & 4294967295L) * j) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j3;
        int i6 = i3 + 2;
        long j4 = (j3 >>> 32) + ((((long) iArr[i2 + 2]) & 4294967295L) * j) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j4;
        int i7 = i3 + 3;
        long j5 = (j4 >>> 32) + ((((long) iArr[i2 + 3]) & 4294967295L) * j) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j5;
        int i8 = i3 + 4;
        long j6 = (j5 >>> 32) + ((((long) iArr[i2 + 4]) & 4294967295L) * j) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j6;
        int i9 = i3 + 5;
        long j7 = (j6 >>> 32) + (j * (((long) iArr[i2 + 5]) & 4294967295L)) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j7;
        return (int) (j7 >>> 32);
    }

    public static int OooO00o(int i, int[] iArr, int[] iArr2, int i2) {
        long j = ((long) i) & 4294967295L;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & 4294967295L) * j);
            iArr2[i2 + i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < 6);
        return (int) j2;
    }

    public static int OooO00o(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= 6) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static int OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i + 0;
        int i4 = i2 + 0;
        long j = (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L) + 0;
        int i5 = (int) j;
        iArr[i3] = i5;
        iArr2[i4] = i5;
        int i6 = i + 1;
        int i7 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i6]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        int i8 = (int) j2;
        iArr[i6] = i8;
        iArr2[i7] = i8;
        int i9 = i + 2;
        int i10 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i9]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        int i11 = (int) j3;
        iArr[i9] = i11;
        iArr2[i10] = i11;
        int i12 = i + 3;
        int i13 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i13]) & 4294967295L);
        int i14 = (int) j4;
        iArr[i12] = i14;
        iArr2[i13] = i14;
        int i15 = i + 4;
        int i16 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i15]) & 4294967295L) + (((long) iArr2[i16]) & 4294967295L);
        int i17 = (int) j5;
        iArr[i15] = i17;
        iArr2[i16] = i17;
        int i18 = i + 5;
        int i19 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (4294967295L & ((long) iArr2[i19]));
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        return (int) (j6 >>> 32);
    }

    public static int OooO00o(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        int i4 = i2 + 0;
        long j = (((long) i3) & 4294967295L) + (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i4]) & 4294967295L);
        iArr2[i4] = (int) j;
        int i5 = i2 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i5]) & 4294967295L);
        iArr2[i5] = (int) j2;
        int i6 = i2 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i6]) & 4294967295L);
        iArr2[i6] = (int) j3;
        int i7 = i2 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i7]) & 4294967295L);
        iArr2[i7] = (int) j4;
        int i8 = i2 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i8]) & 4294967295L);
        iArr2[i8] = (int) j5;
        int i9 = i2 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (4294967295L & ((long) iArr2[i9]));
        iArr2[i9] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 5]) & 4294967295L;
        int i4 = i3;
        int i5 = 0;
        long j8 = 0;
        while (i5 < 6) {
            long j9 = ((long) iArr[i + i5]) & j;
            int i6 = i4 + 0;
            long j10 = (j9 * j2) + (((long) iArr3[i6]) & j) + 0;
            iArr3[i6] = (int) j10;
            int i7 = i4 + 1;
            long j11 = (j10 >>> 32) + (j9 * j3) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j11;
            int i8 = i4 + 2;
            long j12 = (j11 >>> 32) + (j9 * j4) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j12;
            int i9 = i4 + 3;
            long j13 = (j12 >>> 32) + (j9 * j5) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j13;
            int i10 = i4 + 4;
            long j14 = (j13 >>> 32) + (j9 * j6) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j14;
            int i11 = i4 + 5;
            long j15 = (j14 >>> 32) + (j9 * j7) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j15;
            int i12 = i4 + 6;
            long j16 = (j15 >>> 32) + j8 + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j16;
            j8 = j16 >>> 32;
            i5++;
            i4 = i7;
            j2 = j2;
            j = 4294967295L;
            j3 = j3;
            j4 = j4;
        }
        return (int) j8;
    }

    public static int OooO00o(int[] iArr, int[] iArr2) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr2[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr2[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr2[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr2[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (4294967295L & ((long) iArr2[5]));
        iArr2[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static int OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    public static long OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((long) iArr[i2 + 0]) & 4294967295L;
        long j3 = (j * j2) + (((long) iArr2[i3 + 0]) & 4294967295L) + 0;
        iArr3[i4 + 0] = (int) j3;
        long j4 = ((long) iArr[i2 + 1]) & 4294967295L;
        long j5 = (j3 >>> 32) + (j * j4) + j2 + (((long) iArr2[i3 + 1]) & 4294967295L);
        iArr3[i4 + 1] = (int) j5;
        long j6 = j5 >>> 32;
        long j7 = ((long) iArr[i2 + 2]) & 4294967295L;
        long j8 = j6 + (j * j7) + j4 + (((long) iArr2[i3 + 2]) & 4294967295L);
        iArr3[i4 + 2] = (int) j8;
        long j9 = ((long) iArr[i2 + 3]) & 4294967295L;
        long j10 = (j8 >>> 32) + (j * j9) + j7 + (((long) iArr2[i3 + 3]) & 4294967295L);
        iArr3[i4 + 3] = (int) j10;
        long j11 = ((long) iArr[i2 + 4]) & 4294967295L;
        long j12 = (j10 >>> 32) + (j * j11) + j9 + (((long) iArr2[i3 + 4]) & 4294967295L);
        iArr3[i4 + 4] = (int) j12;
        long j13 = ((long) iArr[i2 + 5]) & 4294967295L;
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (4294967295L & ((long) iArr2[i3 + 5]));
        iArr3[i4 + 5] = (int) j14;
        return (j14 >>> 32) + j13;
    }

    public static BigInteger OooO00o(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC6464l1l.OooO00o(i2, bArr, (5 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger OooO00o(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i = 0; i < 3; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC6464l1l.OooO00o(j, bArr, (2 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17086OooO00o(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17087OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2 + 0] = iArr[i + 0];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17088OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr[i + 0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[i3 + 0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[i3 + 1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[i3 + 2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[i3 + 3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[i3 + 4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[i3 + 5] = (int) j13;
        iArr3[i3 + 6] = (int) (j13 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 6) {
            i5 += i4;
            long j14 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j15 = (j14 * j) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j15;
            int i8 = i5 + 1;
            long j16 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j16;
            int i9 = i5 + 2;
            long j17 = (j16 >>> 32) + (j14 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j17;
            int i10 = i5 + 3;
            long j18 = (j17 >>> 32) + (j14 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j18;
            int i11 = i5 + 4;
            long j19 = (j18 >>> 32) + (j14 * j5) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j19;
            int i12 = i5 + 5;
            long j20 = (j19 >>> 32) + (j14 * j6) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j20;
            iArr3[i5 + 6] = (int) (j20 >>> 32);
            i6++;
            j3 = j3;
            j6 = j6;
            i4 = 1;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17089OooO00o(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17090OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr[0]) & 4294967295L;
        long j8 = (j7 * j) + 0;
        iArr3[0] = (int) j8;
        long j9 = (j8 >>> 32) + (j7 * j2);
        iArr3[1] = (int) j9;
        long j10 = (j9 >>> 32) + (j7 * j3);
        iArr3[2] = (int) j10;
        long j11 = (j10 >>> 32) + (j7 * j4);
        iArr3[3] = (int) j11;
        long j12 = (j11 >>> 32) + (j7 * j5);
        iArr3[4] = (int) j12;
        long j13 = (j12 >>> 32) + (j7 * j6);
        iArr3[5] = (int) j13;
        int i = (int) (j13 >>> 32);
        iArr3[6] = i;
        int i2 = 1;
        for (int i3 = 6; i2 < i3; i3 = 6) {
            long j14 = ((long) iArr[i2]) & 4294967295L;
            int i4 = i2 + 0;
            long j15 = (j14 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j15;
            int i5 = i2 + 1;
            long j16 = (j15 >>> 32) + (j14 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j16;
            int i6 = i2 + 2;
            long j17 = (j16 >>> 32) + (j14 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j17;
            int i7 = i2 + 3;
            long j18 = (j17 >>> 32) + (j14 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j18;
            int i8 = i2 + 4;
            long j19 = (j18 >>> 32) + (j14 * j5) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j19;
            int i9 = i2 + 5;
            long j20 = (j19 >>> 32) + (j14 * j6) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j20;
            iArr3[i2 + 6] = (int) (j20 >>> 32);
            i2 = i5;
            j = j;
            j2 = j2;
            j6 = j6;
        }
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2, int i2) {
        jArr2[i2 + 0] = jArr[i + 0];
        jArr2[i2 + 1] = jArr[i + 1];
        jArr2[i2 + 2] = jArr[i + 2];
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17091OooO00o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17092OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 5; i3 >= 0; i3--) {
            int i4 = iArr[i + i3] ^ Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE ^ iArr2[i2 + i3];
            if (i4 < i5) {
                return false;
            }
            if (i4 > i5) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17093OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean OooO00o2 = m17092OooO00o(iArr, i, iArr2, i2);
        if (OooO00o2) {
            OooO0O0(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            OooO0O0(iArr2, i2, iArr, i, iArr3, i3);
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17094OooO00o(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17095OooO00o(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17096OooO00o(long[] jArr, long[] jArr2) {
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO00o() {
        return new int[6];
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] OooO00o2 = OooO00o();
        int i = 0;
        while (bigInteger.signum() != 0) {
            OooO00o2[i] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i++;
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m17097OooO00o() {
        return new long[3];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m17098OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] OooO00o2 = m17097OooO00o();
        int i = 0;
        while (bigInteger.signum() != 0) {
            OooO00o2[i] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i++;
        }
        return OooO00o2;
    }

    public static int OooO0O0(int i, long j, int[] iArr, int i2) {
        long j2 = ((long) i) & 4294967295L;
        int i3 = i2 + 0;
        long j3 = ((j & 4294967295L) * j2) + (((long) iArr[i3]) & 4294967295L) + 0;
        iArr[i3] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i4 = i2 + 1;
        long j5 = (j3 >>> 32) + j4 + (((long) iArr[i4]) & 4294967295L);
        iArr[i4] = (int) j5;
        int i5 = i2 + 2;
        long j6 = (j5 >>> 32) + (4294967295L & ((long) iArr[i5]));
        iArr[i5] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return C1iiIiI.OooO0O0(6, iArr, i2, 3);
    }

    public static int OooO0O0(int[] iArr, int i, int[] iArr2, int i2) {
        int i3 = i2 + 0;
        long j = ((((long) iArr2[i3]) & 4294967295L) - (((long) iArr[i + 0]) & 4294967295L)) + 0;
        iArr2[i3] = (int) j;
        int i4 = i2 + 1;
        long j2 = (j >> 32) + ((((long) iArr2[i4]) & 4294967295L) - (((long) iArr[i + 1]) & 4294967295L));
        iArr2[i4] = (int) j2;
        int i5 = i2 + 2;
        long j3 = (j2 >> 32) + ((((long) iArr2[i5]) & 4294967295L) - (((long) iArr[i + 2]) & 4294967295L));
        iArr2[i5] = (int) j3;
        int i6 = i2 + 3;
        long j4 = (j3 >> 32) + ((((long) iArr2[i6]) & 4294967295L) - (((long) iArr[i + 3]) & 4294967295L));
        iArr2[i6] = (int) j4;
        int i7 = i2 + 4;
        long j5 = (j4 >> 32) + ((((long) iArr2[i7]) & 4294967295L) - (((long) iArr[i + 4]) & 4294967295L));
        iArr2[i7] = (int) j5;
        int i8 = i2 + 5;
        long j6 = (j5 >> 32) + ((((long) iArr2[i8]) & 4294967295L) - (((long) iArr[i + 5]) & 4294967295L));
        iArr2[i8] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int OooO0O0(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((((long) iArr[i + 0]) & 4294967295L) - (((long) iArr2[i2 + 0]) & 4294967295L)) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[i + 1]) & 4294967295L) - (((long) iArr2[i2 + 1]) & 4294967295L));
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[i + 2]) & 4294967295L) - (((long) iArr2[i2 + 2]) & 4294967295L));
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[i + 3]) & 4294967295L) - (((long) iArr2[i2 + 3]) & 4294967295L));
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[i + 4]) & 4294967295L) - (((long) iArr2[i2 + 4]) & 4294967295L));
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[i + 5]) & 4294967295L) - (((long) iArr2[i2 + 5]) & 4294967295L));
        iArr3[i3 + 5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int OooO0O0(int[] iArr, int[] iArr2) {
        long j = ((((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
        iArr2[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L));
        iArr2[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L));
        iArr2[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L));
        iArr2[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L));
        iArr2[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (4294967295L & ((long) iArr[5])));
        iArr2[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L);
        iArr3[1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L);
        iArr3[2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L);
        iArr3[3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L);
        iArr3[4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L);
        iArr3[5] = (int) j6;
        return (int) (j6 >>> 32);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m17099OooO0O0(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 0;
        int i4 = 12;
        int i5 = 5;
        while (true) {
            int i6 = i5 - 1;
            long j2 = ((long) iArr[i + i5]) & 4294967295L;
            long j3 = j2 * j2;
            int i7 = i4 - 1;
            iArr2[i2 + i7] = (i3 << 31) | ((int) (j3 >>> 33));
            i4 = i7 - 1;
            iArr2[i2 + i4] = (int) (j3 >>> 1);
            i3 = (int) j3;
            if (i6 <= 0) {
                long j4 = j * j;
                iArr2[i2 + 0] = (int) j4;
                long j5 = ((long) iArr[i + 1]) & 4294967295L;
                int i8 = i2 + 2;
                long j6 = ((((long) (i3 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i9 = (int) j6;
                iArr2[i2 + 1] = (i9 << 1) | (((int) (j4 >>> 32)) & 1);
                int i10 = i9 >>> 31;
                long j7 = (((long) iArr2[i8]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[i + 2]) & 4294967295L;
                int i11 = i2 + 3;
                long j9 = ((long) iArr2[i11]) & 4294967295L;
                int i12 = i2 + 4;
                long j10 = j7 + (j8 * j);
                int i13 = (int) j10;
                iArr2[i8] = (i13 << 1) | i10;
                int i14 = i13 >>> 31;
                long j11 = j9 + (j10 >>> 32) + (j8 * j5);
                long j12 = (((long) iArr2[i12]) & 4294967295L) + (j11 >>> 32);
                long j13 = ((long) iArr[i + 3]) & 4294967295L;
                int i15 = i2 + 5;
                long j14 = (((long) iArr2[i15]) & 4294967295L) + (j12 >>> 32);
                int i16 = i2 + 6;
                long j15 = (((long) iArr2[i16]) & 4294967295L) + (j14 >>> 32);
                long j16 = (j11 & 4294967295L) + (j13 * j);
                int i17 = (int) j16;
                iArr2[i11] = (i17 << 1) | i14;
                long j17 = (j12 & 4294967295L) + (j16 >>> 32) + (j13 * j5);
                long j18 = (j14 & 4294967295L) + (j17 >>> 32) + (j13 * j8);
                long j19 = j15 + (j18 >>> 32);
                long j20 = j18 & 4294967295L;
                long j21 = ((long) iArr[i + 4]) & 4294967295L;
                int i18 = i2 + 7;
                long j22 = (((long) iArr2[i18]) & 4294967295L) + (j19 >>> 32);
                long j23 = j19 & 4294967295L;
                int i19 = i2 + 8;
                long j24 = (((long) iArr2[i19]) & 4294967295L) + (j22 >>> 32);
                long j25 = (j17 & 4294967295L) + (j21 * j);
                int i20 = (int) j25;
                iArr2[i12] = (i17 >>> 31) | (i20 << 1);
                int i21 = i20 >>> 31;
                long j26 = j20 + (j25 >>> 32) + (j21 * j5);
                long j27 = j23 + (j26 >>> 32) + (j21 * j8);
                long j28 = (j22 & 4294967295L) + (j27 >>> 32) + (j21 * j13);
                long j29 = j24 + (j28 >>> 32);
                long j30 = j28 & 4294967295L;
                long j31 = ((long) iArr[i + 5]) & 4294967295L;
                int i22 = i2 + 9;
                long j32 = (((long) iArr2[i22]) & 4294967295L) + (j29 >>> 32);
                int i23 = i2 + 10;
                long j33 = (j26 & 4294967295L) + (j * j31);
                int i24 = (int) j33;
                iArr2[i15] = (i24 << 1) | i21;
                long j34 = (j27 & 4294967295L) + (j33 >>> 32) + (j31 * j5);
                long j35 = j30 + (j34 >>> 32) + (j31 * j8);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j13);
                long j37 = (j32 & 4294967295L) + (j36 >>> 32) + (j31 * j21);
                long j38 = (((long) iArr2[i23]) & 4294967295L) + (j32 >>> 32) + (j37 >>> 32);
                int i25 = (int) j34;
                iArr2[i16] = (i24 >>> 31) | (i25 << 1);
                int i26 = (int) j35;
                iArr2[i18] = (i25 >>> 31) | (i26 << 1);
                int i27 = (int) j36;
                iArr2[i19] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) j37;
                iArr2[i22] = i28 | (i29 << 1);
                int i30 = i29 >>> 31;
                int i31 = (int) j38;
                iArr2[i23] = i30 | (i31 << 1);
                int i32 = i31 >>> 31;
                int i33 = i2 + 11;
                iArr2[i33] = i32 | ((iArr2[i33] + ((int) (j38 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m17100OooO0O0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 12;
        int i2 = 5;
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            long j2 = ((long) iArr[i2]) & 4294967295L;
            long j3 = j2 * j2;
            int i5 = i - 1;
            iArr2[i5] = (i3 << 31) | ((int) (j3 >>> 33));
            i = i5 - 1;
            iArr2[i] = (int) (j3 >>> 1);
            int i6 = (int) j3;
            if (i4 <= 0) {
                long j4 = j * j;
                iArr2[0] = (int) j4;
                long j5 = ((long) iArr[1]) & 4294967295L;
                long j6 = ((((long) (i6 << 31)) & 4294967295L) | (j4 >>> 33)) + (j5 * j);
                int i7 = (int) j6;
                iArr2[1] = (i7 << 1) | (((int) (j4 >>> 32)) & 1);
                int i8 = i7 >>> 31;
                long j7 = (((long) iArr2[2]) & 4294967295L) + (j6 >>> 32);
                long j8 = ((long) iArr[2]) & 4294967295L;
                long j9 = j7 + (j8 * j);
                int i9 = (int) j9;
                iArr2[2] = (i9 << 1) | i8;
                long j10 = (((long) iArr2[3]) & 4294967295L) + (j9 >>> 32) + (j8 * j5);
                long j11 = (((long) iArr2[4]) & 4294967295L) + (j10 >>> 32);
                long j12 = ((long) iArr[3]) & 4294967295L;
                long j13 = (((long) iArr2[5]) & 4294967295L) + (j11 >>> 32);
                long j14 = j11 & 4294967295L;
                long j15 = (((long) iArr2[6]) & 4294967295L) + (j13 >>> 32);
                long j16 = (j10 & 4294967295L) + (j12 * j);
                int i10 = (int) j16;
                iArr2[3] = (i10 << 1) | (i9 >>> 31);
                int i11 = i10 >>> 31;
                long j17 = j14 + (j16 >>> 32) + (j12 * j5);
                long j18 = (j13 & 4294967295L) + (j17 >>> 32) + (j12 * j8);
                long j19 = j15 + (j18 >>> 32);
                long j20 = ((long) iArr[4]) & 4294967295L;
                long j21 = (((long) iArr2[7]) & 4294967295L) + (j19 >>> 32);
                long j22 = j19 & 4294967295L;
                long j23 = (((long) iArr2[8]) & 4294967295L) + (j21 >>> 32);
                long j24 = (j17 & 4294967295L) + (j20 * j);
                int i12 = (int) j24;
                iArr2[4] = (i12 << 1) | i11;
                long j25 = (j18 & 4294967295L) + (j24 >>> 32) + (j20 * j5);
                long j26 = j22 + (j25 >>> 32) + (j20 * j8);
                long j27 = (j21 & 4294967295L) + (j26 >>> 32) + (j20 * j12);
                long j28 = j23 + (j27 >>> 32);
                long j29 = j27 & 4294967295L;
                long j30 = ((long) iArr[5]) & 4294967295L;
                long j31 = (((long) iArr2[9]) & 4294967295L) + (j28 >>> 32);
                long j32 = 4294967295L & j31;
                long j33 = (j25 & 4294967295L) + (j * j30);
                int i13 = (int) j33;
                iArr2[5] = (i13 << 1) | (i12 >>> 31);
                long j34 = (j26 & 4294967295L) + (j33 >>> 32) + (j30 * j5);
                long j35 = j29 + (j34 >>> 32) + (j30 * j8);
                long j36 = (j28 & 4294967295L) + (j35 >>> 32) + (j30 * j12);
                long j37 = j32 + (j36 >>> 32) + (j30 * j20);
                long j38 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32) + (j37 >>> 32);
                int i14 = (int) j34;
                iArr2[6] = (i13 >>> 31) | (i14 << 1);
                int i15 = (int) j35;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = (int) j36;
                iArr2[8] = (i15 >>> 31) | (i16 << 1);
                int i17 = (int) j37;
                iArr2[9] = (i16 >>> 31) | (i17 << 1);
                int i18 = i17 >>> 31;
                int i19 = (int) j38;
                iArr2[10] = i18 | (i19 << 1);
                iArr2[11] = (i19 >>> 31) | ((iArr2[11] + ((int) (j38 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static boolean OooO0O0(int[] iArr) {
        for (int i = 0; i < 6; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m17101OooO0O0(int[] iArr, int[] iArr2) {
        for (int i = 5; i >= 0; i--) {
            int i2 = iArr[i] ^ Integer.MIN_VALUE;
            int i3 = Integer.MIN_VALUE ^ iArr2[i];
            if (i2 < i3) {
                return false;
            }
            if (i2 > i3) {
                return true;
            }
        }
        return true;
    }

    public static boolean OooO0O0(long[] jArr) {
        for (int i = 0; i < 3; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO0O0() {
        return new int[12];
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long[] m17102OooO0O0() {
        return new long[6];
    }

    public static int OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = 0;
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = 0;
        while (i < 6) {
            long j9 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j10 = (j9 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j10;
            int i3 = i + 1;
            long j11 = (j10 >>> 32) + (j9 * j3) + (((long) iArr3[i3]) & 4294967295L);
            iArr3[i3] = (int) j11;
            int i4 = i + 2;
            long j12 = (j11 >>> 32) + (j9 * j4) + (((long) iArr3[i4]) & 4294967295L);
            iArr3[i4] = (int) j12;
            int i5 = i + 3;
            long j13 = (j12 >>> 32) + (j9 * j5) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j13;
            int i6 = i + 4;
            long j14 = (j13 >>> 32) + (j9 * j6) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j14;
            int i7 = i + 5;
            long j15 = (j14 >>> 32) + (j9 * j7) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j15;
            int i8 = i + 6;
            long j16 = (j15 >>> 32) + j8 + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j16;
            j8 = j16 >>> 32;
            i = i3;
            j = 4294967295L;
            j7 = j7;
            j2 = j2;
            j3 = j3;
            j4 = j4;
        }
        return (int) j8;
    }

    public static int OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }

    public static int OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = (((((long) iArr3[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) - (((long) iArr2[0]) & 4294967295L)) + 0;
        iArr3[0] = (int) j;
        long j2 = (j >> 32) + (((((long) iArr3[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) - (((long) iArr2[1]) & 4294967295L));
        iArr3[1] = (int) j2;
        long j3 = (j2 >> 32) + (((((long) iArr3[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) - (((long) iArr2[2]) & 4294967295L));
        iArr3[2] = (int) j3;
        long j4 = (j3 >> 32) + (((((long) iArr3[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) - (((long) iArr2[3]) & 4294967295L));
        iArr3[3] = (int) j4;
        long j5 = (j4 >> 32) + (((((long) iArr3[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) - (((long) iArr2[4]) & 4294967295L));
        iArr3[4] = (int) j5;
        long j6 = (j5 >> 32) + (((((long) iArr3[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) - (((long) iArr2[5]) & 4294967295L));
        iArr3[5] = (int) j6;
        return (int) (j6 >> 32);
    }
}
