package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨1LLlIL  reason: invalid class name */
public abstract class C1LLlIL {
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
        return C1iiIiI.OooO0O0(8, iArr, i3, 3);
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
        return C1iiIiI.OooO0O0(8, iArr, i2, 4);
    }

    public static int OooO00o(int i, int[] iArr) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr[0]) & 4294967295L) * j) + 0;
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr[1]) & 4294967295L) * j);
        iArr[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr[2]) & 4294967295L) * j);
        iArr[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr[3]) & 4294967295L) * j);
        iArr[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr[4]) & 4294967295L) * j);
        iArr[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr[5]) & 4294967295L) * j);
        iArr[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr[6]) & 4294967295L) * j);
        iArr[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (4294967295L & ((long) iArr[7])));
        iArr[7] = (int) j9;
        return (int) (j9 >>> 32);
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
        long j7 = (j6 >>> 32) + ((((long) iArr[i2 + 5]) & 4294967295L) * j) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j7;
        int i10 = i3 + 6;
        long j8 = (j7 >>> 32) + ((((long) iArr[i2 + 6]) & 4294967295L) * j) + (((long) iArr2[i10]) & 4294967295L);
        iArr2[i10] = (int) j8;
        int i11 = i3 + 7;
        long j9 = (j8 >>> 32) + (j * (((long) iArr[i2 + 7]) & 4294967295L)) + (((long) iArr2[i11]) & 4294967295L);
        iArr2[i11] = (int) j9;
        return (int) (j9 >>> 32);
    }

    public static int OooO00o(int i, int[] iArr, int[] iArr2) {
        long j = ((long) i) & 4294967295L;
        long j2 = ((((long) iArr2[0]) & 4294967295L) * j) + (((long) iArr[0]) & 4294967295L) + 0;
        iArr2[0] = (int) j2;
        long j3 = (j2 >>> 32) + ((((long) iArr2[1]) & 4294967295L) * j) + (((long) iArr[1]) & 4294967295L);
        iArr2[1] = (int) j3;
        long j4 = (j3 >>> 32) + ((((long) iArr2[2]) & 4294967295L) * j) + (((long) iArr[2]) & 4294967295L);
        iArr2[2] = (int) j4;
        long j5 = (j4 >>> 32) + ((((long) iArr2[3]) & 4294967295L) * j) + (((long) iArr[3]) & 4294967295L);
        iArr2[3] = (int) j5;
        long j6 = (j5 >>> 32) + ((((long) iArr2[4]) & 4294967295L) * j) + (((long) iArr[4]) & 4294967295L);
        iArr2[4] = (int) j6;
        long j7 = (j6 >>> 32) + ((((long) iArr2[5]) & 4294967295L) * j) + (((long) iArr[5]) & 4294967295L);
        iArr2[5] = (int) j7;
        long j8 = (j7 >>> 32) + ((((long) iArr2[6]) & 4294967295L) * j) + (((long) iArr[6]) & 4294967295L);
        iArr2[6] = (int) j8;
        long j9 = (j8 >>> 32) + (j * (((long) iArr2[7]) & 4294967295L)) + (4294967295L & ((long) iArr[7]));
        iArr2[7] = (int) j9;
        return (int) (j9 >>> 32);
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
        } while (i3 < 8);
        return (int) j2;
    }

    public static int OooO00o(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else if ((i & 255) != i) {
            return 0;
        } else {
            i2 = iArr[i >>> 5] >>> (i & 31);
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
        long j6 = (j5 >>> 32) + (((long) iArr[i18]) & 4294967295L) + (((long) iArr2[i19]) & 4294967295L);
        int i20 = (int) j6;
        iArr[i18] = i20;
        iArr2[i19] = i20;
        int i21 = i + 6;
        int i22 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i21]) & 4294967295L) + (((long) iArr2[i22]) & 4294967295L);
        int i23 = (int) j7;
        iArr[i21] = i23;
        iArr2[i22] = i23;
        int i24 = i + 7;
        int i25 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i24]) & 4294967295L) + (4294967295L & ((long) iArr2[i25]));
        int i26 = (int) j8;
        iArr[i24] = i26;
        iArr2[i25] = i26;
        return (int) (j8 >>> 32);
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
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i9]) & 4294967295L);
        iArr2[i9] = (int) j6;
        int i10 = i2 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i10]) & 4294967295L);
        iArr2[i10] = (int) j7;
        int i11 = i2 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (4294967295L & ((long) iArr2[i11]));
        iArr2[i11] = (int) j8;
        return (int) (j8 >>> 32);
    }

    public static int OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L) + 0;
        iArr3[i3 + 0] = (int) j;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L);
        iArr3[i3 + 1] = (int) j2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L);
        iArr3[i3 + 2] = (int) j3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L);
        iArr3[i3 + 3] = (int) j4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L);
        iArr3[i3 + 4] = (int) j5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L);
        iArr3[i3 + 5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L);
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L);
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j6 = (j5 >>> 32) + (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L);
        iArr2[5] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr2[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7]));
        iArr2[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j14 = (j12 >>> 32) + (j * j13) + j11 + (((long) iArr2[i3 + 5]) & 4294967295L);
        iArr3[i4 + 5] = (int) j14;
        long j15 = ((long) iArr[i2 + 6]) & 4294967295L;
        long j16 = (j14 >>> 32) + (j * j15) + j13 + (((long) iArr2[i3 + 6]) & 4294967295L);
        iArr3[i4 + 6] = (int) j16;
        long j17 = ((long) iArr[i2 + 7]) & 4294967295L;
        long j18 = (j16 >>> 32) + (j * j17) + j15 + (4294967295L & ((long) iArr2[i3 + 7]));
        iArr3[i4 + 7] = (int) j18;
        return (j18 >>> 32) + j17;
    }

    public static BigInteger OooO00o(int[] iArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if (i2 != 0) {
                AbstractC6464l1l.OooO00o(i2, bArr, (7 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static BigInteger OooO00o(long[] jArr) {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 4; i++) {
            long j = jArr[i];
            if (j != 0) {
                AbstractC6464l1l.OooO00o(j, bArr, (3 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21837OooO00o(int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        iArr[4] = 0;
        iArr[5] = 0;
        iArr[6] = 0;
        iArr[7] = 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21838OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        iArr2[i2 + 0] = iArr[i + 0];
        iArr2[i2 + 1] = iArr[i + 1];
        iArr2[i2 + 2] = iArr[i + 2];
        iArr2[i2 + 3] = iArr[i + 3];
        iArr2[i2 + 4] = iArr[i + 4];
        iArr2[i2 + 5] = iArr[i + 5];
        iArr2[i2 + 6] = iArr[i + 6];
        iArr2[i2 + 7] = iArr[i + 7];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21839OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        long j9 = ((long) iArr[i + 0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[i3 + 0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[i3 + 1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[i3 + 2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[i3 + 3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[i3 + 4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[i3 + 5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[i3 + 6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[i3 + 7] = (int) j17;
        iArr3[i3 + 8] = (int) (j17 >>> 32);
        int i4 = 1;
        int i5 = i3;
        int i6 = 1;
        while (i6 < 8) {
            i5 += i4;
            long j18 = ((long) iArr[i + i6]) & 4294967295L;
            int i7 = i5 + 0;
            long j19 = (j18 * j) + (((long) iArr3[i7]) & 4294967295L) + 0;
            iArr3[i7] = (int) j19;
            int i8 = i5 + 1;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j20;
            int i9 = i5 + 2;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j21;
            int i10 = i5 + 3;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j22;
            int i11 = i5 + 4;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j23;
            int i12 = i5 + 5;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j24;
            int i13 = i5 + 6;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr3[i13]) & 4294967295L);
            iArr3[i13] = (int) j25;
            int i14 = i5 + 7;
            long j26 = (j25 >>> 32) + (j18 * j8) + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j26;
            iArr3[i5 + 8] = (int) (j26 >>> 32);
            i6++;
            j6 = j6;
            j3 = j3;
            i4 = 1;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21840OooO00o(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
        iArr2[7] = iArr[7];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21841OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) iArr2[0]) & 4294967295L;
        long j2 = ((long) iArr2[1]) & 4294967295L;
        long j3 = ((long) iArr2[2]) & 4294967295L;
        long j4 = ((long) iArr2[3]) & 4294967295L;
        long j5 = ((long) iArr2[4]) & 4294967295L;
        long j6 = ((long) iArr2[5]) & 4294967295L;
        long j7 = ((long) iArr2[6]) & 4294967295L;
        long j8 = ((long) iArr2[7]) & 4294967295L;
        long j9 = ((long) iArr[0]) & 4294967295L;
        long j10 = (j9 * j) + 0;
        iArr3[0] = (int) j10;
        long j11 = (j10 >>> 32) + (j9 * j2);
        iArr3[1] = (int) j11;
        long j12 = (j11 >>> 32) + (j9 * j3);
        iArr3[2] = (int) j12;
        long j13 = (j12 >>> 32) + (j9 * j4);
        iArr3[3] = (int) j13;
        long j14 = (j13 >>> 32) + (j9 * j5);
        iArr3[4] = (int) j14;
        long j15 = (j14 >>> 32) + (j9 * j6);
        iArr3[5] = (int) j15;
        long j16 = (j15 >>> 32) + (j9 * j7);
        iArr3[6] = (int) j16;
        long j17 = (j16 >>> 32) + (j9 * j8);
        iArr3[7] = (int) j17;
        int i = (int) (j17 >>> 32);
        iArr3[8] = i;
        int i2 = 1;
        for (int i3 = 8; i2 < i3; i3 = 8) {
            long j18 = ((long) iArr[i2]) & 4294967295L;
            int i4 = i2 + 0;
            long j19 = (j18 * j) + (((long) iArr3[i4]) & 4294967295L) + 0;
            iArr3[i4] = (int) j19;
            int i5 = i2 + 1;
            long j20 = (j19 >>> 32) + (j18 * j2) + (((long) iArr3[i5]) & 4294967295L);
            iArr3[i5] = (int) j20;
            int i6 = i2 + 2;
            long j21 = (j20 >>> 32) + (j18 * j3) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j21;
            int i7 = i2 + 3;
            long j22 = (j21 >>> 32) + (j18 * j4) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j22;
            int i8 = i2 + 4;
            long j23 = (j22 >>> 32) + (j18 * j5) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j23;
            int i9 = i2 + 5;
            long j24 = (j23 >>> 32) + (j18 * j6) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j24;
            int i10 = i2 + 6;
            long j25 = (j24 >>> 32) + (j18 * j7) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j25;
            int i11 = i2 + 7;
            long j26 = (j25 >>> 32) + (j18 * j8) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j26;
            iArr3[i2 + 8] = (int) (j26 >>> 32);
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
        jArr2[i2 + 3] = jArr[i + 3];
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21842OooO00o(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21843OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 7; i3 >= 0; i3--) {
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
    public static boolean m21844OooO00o(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        boolean OooO00o2 = m21843OooO00o(iArr, i, iArr2, i2);
        if (OooO00o2) {
            OooO0Oo(iArr, i, iArr2, i2, iArr3, i3);
        } else {
            OooO0Oo(iArr2, i2, iArr, i, iArr3, i3);
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21845OooO00o(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21846OooO00o(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21847OooO00o(long[] jArr, long[] jArr2) {
        for (int i = 3; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO00o() {
        return new int[8];
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
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
    public static long[] m21848OooO00o() {
        return new long[4];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m21849OooO00o(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 256) {
            throw new IllegalArgumentException();
        }
        long[] OooO00o2 = m21848OooO00o();
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
        return C1iiIiI.OooO0O0(8, iArr, i2, 3);
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
        int i9 = i2 + 6;
        long j7 = (j6 >> 32) + ((((long) iArr2[i9]) & 4294967295L) - (((long) iArr[i + 6]) & 4294967295L));
        iArr2[i9] = (int) j7;
        int i10 = i2 + 7;
        long j8 = (j7 >> 32) + ((((long) iArr2[i10]) & 4294967295L) - (((long) iArr[i + 7]) & 4294967295L));
        iArr2[i10] = (int) j8;
        return (int) (j8 >> 32);
    }

    public static int OooO0O0(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i + 0]) & 4294967295L) + (((long) iArr2[i2 + 0]) & 4294967295L) + (((long) iArr3[i4]) & 4294967295L) + 0;
        iArr3[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >>> 32) + (((long) iArr[i + 1]) & 4294967295L) + (((long) iArr2[i2 + 1]) & 4294967295L) + (((long) iArr3[i5]) & 4294967295L);
        iArr3[i5] = (int) j2;
        int i6 = i3 + 2;
        long j3 = (j2 >>> 32) + (((long) iArr[i + 2]) & 4294967295L) + (((long) iArr2[i2 + 2]) & 4294967295L) + (((long) iArr3[i6]) & 4294967295L);
        iArr3[i6] = (int) j3;
        int i7 = i3 + 3;
        long j4 = (j3 >>> 32) + (((long) iArr[i + 3]) & 4294967295L) + (((long) iArr2[i2 + 3]) & 4294967295L) + (((long) iArr3[i7]) & 4294967295L);
        iArr3[i7] = (int) j4;
        int i8 = i3 + 4;
        long j5 = (j4 >>> 32) + (((long) iArr[i + 4]) & 4294967295L) + (((long) iArr2[i2 + 4]) & 4294967295L) + (((long) iArr3[i8]) & 4294967295L);
        iArr3[i8] = (int) j5;
        int i9 = i3 + 5;
        long j6 = (j5 >>> 32) + (((long) iArr[i + 5]) & 4294967295L) + (((long) iArr2[i2 + 5]) & 4294967295L) + (((long) iArr3[i9]) & 4294967295L);
        iArr3[i9] = (int) j6;
        int i10 = i3 + 6;
        long j7 = (j6 >>> 32) + (((long) iArr[i + 6]) & 4294967295L) + (((long) iArr2[i2 + 6]) & 4294967295L) + (((long) iArr3[i10]) & 4294967295L);
        iArr3[i10] = (int) j7;
        int i11 = i3 + 7;
        long j8 = (j7 >>> 32) + (((long) iArr[i + 7]) & 4294967295L) + (((long) iArr2[i2 + 7]) & 4294967295L) + (((long) iArr3[i11]) & 4294967295L);
        iArr3[i11] = (int) j8;
        return (int) (j8 >>> 32);
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
        long j6 = (j5 >> 32) + ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L));
        iArr2[5] = (int) j6;
        long j7 = (j6 >> 32) + ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L));
        iArr2[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7])));
        iArr2[7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j7 = (j6 >>> 32) + (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L);
        iArr3[6] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (((long) iArr3[7]) & 4294967295L);
        iArr3[7] = (int) j8;
        return (int) (j8 >>> 32);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m21850OooO0O0(int[] iArr, int i, int[] iArr2, int i2) {
        long j = ((long) iArr[i + 0]) & 4294967295L;
        int i3 = 0;
        int i4 = 16;
        int i5 = 7;
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
                long j33 = (j26 & 4294967295L) + (j31 * j);
                int i24 = (int) j33;
                iArr2[i15] = i21 | (i24 << 1);
                int i25 = i24 >>> 31;
                long j34 = (j27 & 4294967295L) + (j33 >>> 32) + (j31 * j5);
                long j35 = j30 + (j34 >>> 32) + (j31 * j8);
                long j36 = (j29 & 4294967295L) + (j35 >>> 32) + (j31 * j13);
                long j37 = (j32 & 4294967295L) + (j36 >>> 32) + (j31 * j21);
                long j38 = j36 & 4294967295L;
                long j39 = (((long) iArr2[i23]) & 4294967295L) + (j32 >>> 32) + (j37 >>> 32);
                long j40 = j37 & 4294967295L;
                long j41 = ((long) iArr[i + 6]) & 4294967295L;
                int i26 = i2 + 11;
                long j42 = (((long) iArr2[i26]) & 4294967295L) + (j39 >>> 32);
                long j43 = j39 & 4294967295L;
                int i27 = i2 + 12;
                long j44 = (((long) iArr2[i27]) & 4294967295L) + (j42 >>> 32);
                long j45 = (j34 & 4294967295L) + (j41 * j);
                int i28 = (int) j45;
                iArr2[i16] = i25 | (i28 << 1);
                int i29 = i28 >>> 31;
                long j46 = (j35 & 4294967295L) + (j45 >>> 32) + (j41 * j5);
                long j47 = j38 + (j46 >>> 32) + (j41 * j8);
                long j48 = j40 + (j47 >>> 32) + (j41 * j13);
                long j49 = j47 & 4294967295L;
                long j50 = j43 + (j48 >>> 32) + (j41 * j21);
                long j51 = (j42 & 4294967295L) + (j50 >>> 32) + (j41 * j31);
                long j52 = j44 + (j51 >>> 32);
                long j53 = j51 & 4294967295L;
                long j54 = ((long) iArr[i + 7]) & 4294967295L;
                int i30 = i2 + 13;
                long j55 = (((long) iArr2[i30]) & 4294967295L) + (j52 >>> 32);
                int i31 = i2 + 14;
                long j56 = (j46 & 4294967295L) + (j * j54);
                int i32 = (int) j56;
                iArr2[i18] = (i32 << 1) | i29;
                long j57 = j49 + (j56 >>> 32) + (j54 * j5);
                long j58 = (j48 & 4294967295L) + (j57 >>> 32) + (j54 * j8);
                long j59 = (j50 & 4294967295L) + (j58 >>> 32) + (j54 * j13);
                long j60 = j53 + (j59 >>> 32) + (j54 * j21);
                long j61 = (j52 & 4294967295L) + (j60 >>> 32) + (j54 * j31);
                long j62 = (j55 & 4294967295L) + (j61 >>> 32) + (j54 * j41);
                long j63 = (((long) iArr2[i31]) & 4294967295L) + (j55 >>> 32) + (j62 >>> 32);
                int i33 = (int) j57;
                iArr2[i19] = (i32 >>> 31) | (i33 << 1);
                int i34 = (int) j58;
                iArr2[i22] = (i33 >>> 31) | (i34 << 1);
                int i35 = i34 >>> 31;
                int i36 = (int) j59;
                iArr2[i23] = i35 | (i36 << 1);
                int i37 = (int) j60;
                iArr2[i26] = (i36 >>> 31) | (i37 << 1);
                int i38 = (int) j61;
                iArr2[i27] = (i37 >>> 31) | (i38 << 1);
                int i39 = i38 >>> 31;
                int i40 = (int) j62;
                iArr2[i30] = i39 | (i40 << 1);
                int i41 = i40 >>> 31;
                int i42 = (int) j63;
                iArr2[i31] = i41 | (i42 << 1);
                int i43 = i42 >>> 31;
                int i44 = i2 + 15;
                iArr2[i44] = i43 | ((iArr2[i44] + ((int) (j63 >>> 32))) << 1);
                return;
            }
            i5 = i6;
        }
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m21851OooO0O0(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[0]) & 4294967295L;
        int i = 16;
        int i2 = 7;
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
                long j32 = j28 & 4294967295L;
                long j33 = (((long) iArr2[10]) & 4294967295L) + (j31 >>> 32);
                long j34 = (j25 & 4294967295L) + (j30 * j);
                int i13 = (int) j34;
                iArr2[5] = (i13 << 1) | (i12 >>> 31);
                long j35 = (j26 & 4294967295L) + (j34 >>> 32) + (j30 * j5);
                long j36 = j29 + (j35 >>> 32) + (j30 * j8);
                long j37 = j32 + (j36 >>> 32) + (j30 * j12);
                long j38 = (j31 & 4294967295L) + (j37 >>> 32) + (j30 * j20);
                long j39 = j33 + (j38 >>> 32);
                long j40 = j38 & 4294967295L;
                long j41 = ((long) iArr[6]) & 4294967295L;
                long j42 = (((long) iArr2[11]) & 4294967295L) + (j39 >>> 32);
                long j43 = j39 & 4294967295L;
                long j44 = (((long) iArr2[12]) & 4294967295L) + (j42 >>> 32);
                long j45 = (j35 & 4294967295L) + (j41 * j);
                int i14 = (int) j45;
                iArr2[6] = (i14 << 1) | (i13 >>> 31);
                long j46 = (j36 & 4294967295L) + (j45 >>> 32) + (j41 * j5);
                long j47 = (j37 & 4294967295L) + (j46 >>> 32) + (j41 * j8);
                long j48 = j46 & 4294967295L;
                long j49 = j40 + (j47 >>> 32) + (j41 * j12);
                long j50 = j43 + (j49 >>> 32) + (j41 * j20);
                long j51 = (j42 & 4294967295L) + (j50 >>> 32) + (j41 * j30);
                long j52 = j44 + (j51 >>> 32);
                long j53 = j51 & 4294967295L;
                long j54 = ((long) iArr[7]) & 4294967295L;
                long j55 = (((long) iArr2[13]) & 4294967295L) + (j52 >>> 32);
                long j56 = 4294967295L & j55;
                long j57 = j48 + (j * j54);
                int i15 = (int) j57;
                iArr2[7] = (i14 >>> 31) | (i15 << 1);
                int i16 = i15 >>> 31;
                long j58 = (j47 & 4294967295L) + (j57 >>> 32) + (j54 * j5);
                long j59 = (j49 & 4294967295L) + (j58 >>> 32) + (j54 * j8);
                long j60 = (j50 & 4294967295L) + (j59 >>> 32) + (j54 * j12);
                long j61 = j53 + (j60 >>> 32) + (j54 * j20);
                long j62 = (j52 & 4294967295L) + (j61 >>> 32) + (j54 * j30);
                long j63 = j56 + (j62 >>> 32) + (j54 * j41);
                long j64 = (((long) iArr2[14]) & 4294967295L) + (j55 >>> 32) + (j63 >>> 32);
                int i17 = (int) j58;
                iArr2[8] = i16 | (i17 << 1);
                int i18 = (int) j59;
                iArr2[9] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                int i20 = (int) j60;
                iArr2[10] = i19 | (i20 << 1);
                int i21 = (int) j61;
                iArr2[11] = (i20 >>> 31) | (i21 << 1);
                int i22 = (int) j62;
                iArr2[12] = (i21 >>> 31) | (i22 << 1);
                int i23 = i22 >>> 31;
                int i24 = (int) j63;
                iArr2[13] = i23 | (i24 << 1);
                int i25 = i24 >>> 31;
                int i26 = (int) j64;
                iArr2[14] = i25 | (i26 << 1);
                iArr2[15] = (i26 >>> 31) | ((iArr2[15] + ((int) (j64 >>> 32))) << 1);
                return;
            }
            i2 = i4;
            i3 = i6;
        }
    }

    public static boolean OooO0O0(int[] iArr) {
        for (int i = 0; i < 8; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m21852OooO0O0(int[] iArr, int[] iArr2) {
        for (int i = 7; i >= 0; i--) {
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
        for (int i = 0; i < 4; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO0O0() {
        return new int[16];
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static long[] m21853OooO0O0() {
        return new long[8];
    }

    public static int OooO0OO(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
        long j = ((long) iArr2[i2 + 0]) & 4294967295L;
        long j2 = ((long) iArr2[i2 + 1]) & 4294967295L;
        long j3 = ((long) iArr2[i2 + 2]) & 4294967295L;
        long j4 = ((long) iArr2[i2 + 3]) & 4294967295L;
        long j5 = ((long) iArr2[i2 + 4]) & 4294967295L;
        long j6 = ((long) iArr2[i2 + 5]) & 4294967295L;
        long j7 = ((long) iArr2[i2 + 6]) & 4294967295L;
        long j8 = ((long) iArr2[i2 + 7]) & 4294967295L;
        int i4 = i3;
        long j9 = 0;
        int i5 = 0;
        while (i5 < 8) {
            long j10 = ((long) iArr[i + i5]) & 4294967295L;
            int i6 = i4 + 0;
            long j11 = (j10 * j) + (((long) iArr3[i6]) & 4294967295L) + 0;
            iArr3[i6] = (int) j11;
            int i7 = i4 + 1;
            long j12 = (j11 >>> 32) + (j10 * j2) + (((long) iArr3[i7]) & 4294967295L);
            iArr3[i7] = (int) j12;
            int i8 = i4 + 2;
            long j13 = (j12 >>> 32) + (j10 * j3) + (((long) iArr3[i8]) & 4294967295L);
            iArr3[i8] = (int) j13;
            int i9 = i4 + 3;
            long j14 = (j13 >>> 32) + (j10 * j4) + (((long) iArr3[i9]) & 4294967295L);
            iArr3[i9] = (int) j14;
            int i10 = i4 + 4;
            long j15 = (j14 >>> 32) + (j10 * j5) + (((long) iArr3[i10]) & 4294967295L);
            iArr3[i10] = (int) j15;
            int i11 = i4 + 5;
            long j16 = (j15 >>> 32) + (j10 * j6) + (((long) iArr3[i11]) & 4294967295L);
            iArr3[i11] = (int) j16;
            int i12 = i4 + 6;
            long j17 = (j16 >>> 32) + (j10 * j7) + (((long) iArr3[i12]) & 4294967295L);
            iArr3[i12] = (int) j17;
            int i13 = i4 + 7;
            long j18 = (j17 >>> 32) + (j10 * j8) + (((long) iArr3[i13]) & 4294967295L);
            iArr3[i13] = (int) j18;
            int i14 = i4 + 8;
            long j19 = (j18 >>> 32) + j9 + (((long) iArr3[i14]) & 4294967295L);
            iArr3[i14] = (int) j19;
            j9 = j19 >>> 32;
            i5++;
            i4 = i7;
            j8 = j8;
            j = j;
            j3 = j3;
            j2 = j2;
        }
        return (int) j9;
    }

    public static int OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 4294967295L;
        long j2 = ((long) iArr2[0]) & 4294967295L;
        long j3 = ((long) iArr2[1]) & 4294967295L;
        long j4 = ((long) iArr2[2]) & 4294967295L;
        long j5 = ((long) iArr2[3]) & 4294967295L;
        long j6 = ((long) iArr2[4]) & 4294967295L;
        long j7 = ((long) iArr2[5]) & 4294967295L;
        long j8 = ((long) iArr2[6]) & 4294967295L;
        long j9 = ((long) iArr2[7]) & 4294967295L;
        long j10 = 0;
        int i = 0;
        while (i < 8) {
            long j11 = ((long) iArr[i]) & j;
            int i2 = i + 0;
            long j12 = (j11 * j2) + (((long) iArr3[i2]) & j) + 0;
            iArr3[i2] = (int) j12;
            int i3 = i + 1;
            long j13 = (j12 >>> 32) + (j11 * j3) + (((long) iArr3[i3]) & j);
            iArr3[i3] = (int) j13;
            int i4 = i + 2;
            long j14 = (j13 >>> 32) + (j11 * j4) + (((long) iArr3[i4]) & j);
            iArr3[i4] = (int) j14;
            int i5 = i + 3;
            long j15 = (j14 >>> 32) + (j11 * j5) + (((long) iArr3[i5]) & j);
            iArr3[i5] = (int) j15;
            int i6 = i + 4;
            long j16 = (j15 >>> 32) + (j11 * j6) + (((long) iArr3[i6]) & j);
            iArr3[i6] = (int) j16;
            int i7 = i + 5;
            long j17 = (j16 >>> 32) + (j11 * j7) + (((long) iArr3[i7]) & j);
            iArr3[i7] = (int) j17;
            int i8 = i + 6;
            long j18 = (j17 >>> 32) + (j11 * j8) + (((long) iArr3[i8]) & j);
            iArr3[i8] = (int) j18;
            int i9 = i + 7;
            long j19 = (j18 >>> 32) + (j11 * j9) + (((long) iArr3[i9]) & j);
            iArr3[i9] = (int) j19;
            int i10 = i + 8;
            long j20 = (j19 >>> 32) + j10 + (((long) iArr3[i10]) & j);
            iArr3[i10] = (int) j20;
            j10 = j20 >>> 32;
            i = i3;
            j9 = j9;
            j7 = j7;
            j3 = j3;
            j = 4294967295L;
        }
        return (int) j10;
    }

    public static int OooO0Oo(int[] iArr, int i, int[] iArr2, int i2, int[] iArr3, int i3) {
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
        long j7 = (j6 >> 32) + ((((long) iArr[i + 6]) & 4294967295L) - (((long) iArr2[i2 + 6]) & 4294967295L));
        iArr3[i3 + 6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[i + 7]) & 4294967295L) - (((long) iArr2[i2 + 7]) & 4294967295L));
        iArr3[i3 + 7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j7 = (j6 >> 32) + ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + ((((long) iArr[7]) & 4294967295L) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
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
        long j7 = (j6 >> 32) + (((((long) iArr3[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) - (((long) iArr2[6]) & 4294967295L));
        iArr3[6] = (int) j7;
        long j8 = (j7 >> 32) + (((((long) iArr3[7]) & 4294967295L) - (((long) iArr[7]) & 4294967295L)) - (((long) iArr2[7]) & 4294967295L));
        iArr3[7] = (int) j8;
        return (int) (j8 >> 32);
    }
}
