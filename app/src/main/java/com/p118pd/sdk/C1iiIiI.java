package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨1iiIiI  reason: invalid class name */
public abstract class C1iiIiI {
    public static final long OooO00o = 4294967295L;

    public static int OooO00o(int i, int i2, long j, int[] iArr, int i3) {
        long j2 = ((long) i2) & 4294967295L;
        int i4 = i3 + 0;
        long j3 = ((j & 4294967295L) * j2) + (((long) iArr[i4]) & 4294967295L) + 0;
        iArr[i4] = (int) j3;
        long j4 = j2 * (j >>> 32);
        int i5 = i3 + 1;
        long j5 = (j3 >>> 32) + j4 + (((long) iArr[i5]) & 4294967295L);
        iArr[i5] = (int) j5;
        int i6 = i3 + 2;
        long j6 = (j5 >>> 32) + (4294967295L & ((long) iArr[i6]));
        iArr[i6] = (int) j6;
        if ((j6 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3 + 3);
    }

    public static int OooO00o(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[1])) + 1;
        iArr[1] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, 2);
    }

    public static int OooO00o(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i4]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[i5])) + 1;
        iArr[i5] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3 + 2);
    }

    public static int OooO00o(int i, int i2, int[] iArr, int i3, int i4) {
        int i5 = i3 + i4;
        long j = (((long) iArr[i5]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i5] = (int) j;
        int i6 = i5 + 1;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[i6])) + 1;
        iArr[i6] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3, i4 + 2);
    }

    public static int OooO00o(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        int i5 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3 + i5]) & 4294967295L) * j);
            iArr2[i4 + i5] = (int) j3;
            j2 = j3 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j2;
    }

    public static int OooO00o(int i, int i2, int[] iArr, int i3, int[] iArr2, int[] iArr3, int i4) {
        long j = ((long) i2) & 4294967295L;
        long j2 = ((long) i3) & 4294967295L;
        long j3 = 0;
        int i5 = 0;
        do {
            int i6 = i4 + i5;
            long j4 = j3 + ((((long) iArr[i5]) & 4294967295L) * j) + ((((long) iArr2[i5]) & 4294967295L) * j2) + (((long) iArr3[i6]) & 4294967295L);
            iArr3[i6] = (int) j4;
            j3 = j4 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j3;
    }

    public static int OooO00o(int i, int i2, int[] iArr, int[] iArr2) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        int i3 = 0;
        do {
            long j3 = j2 + ((((long) iArr[i3]) & 4294967295L) * j);
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
            i3++;
        } while (i3 < i);
        return (int) j2;
    }

    public static int OooO00o(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = j2 + (((long) iArr[i3]) & 4294967295L) + (((long) iArr2[i3]) & j);
            iArr3[i3] = (int) j3;
            j2 = j3 >>> 32;
        }
        return (int) j2;
    }

    public static int OooO00o(int i, long j, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) + (j & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = (j2 >>> 32) + (4294967295L & ((long) iArr[1])) + (j >>> 32);
        iArr[1] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, 2);
    }

    public static int OooO00o(int i, long j, int[] iArr, int i2) {
        int i3 = i2 + 0;
        long j2 = (((long) iArr[i3]) & 4294967295L) + (j & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i2 + 1;
        long j3 = (j2 >>> 32) + (4294967295L & ((long) iArr[i4])) + (j >>> 32);
        iArr[i4] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i2 + 2);
    }

    public static int OooO00o(int i, long j, int[] iArr, int i2, int i3) {
        int i4 = i2 + i3;
        long j2 = (((long) iArr[i4]) & 4294967295L) + (j & 4294967295L);
        iArr[i4] = (int) j2;
        int i5 = i4 + 1;
        long j3 = (j2 >>> 32) + (4294967295L & ((long) iArr[i5])) + (j >>> 32);
        iArr[i5] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i2, i3 + 2);
    }

    public static int OooO00o(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
        }
        return -1;
    }

    public static int OooO00o(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 != -1) {
                return 0;
            }
            i2++;
        }
        return -1;
    }

    public static int OooO00o(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i4 = i2 + i3;
            int i5 = iArr[i4] - 1;
            iArr[i4] = i5;
            if (i5 != -1) {
                return 0;
            }
            i3++;
        }
        return -1;
    }

    public static int OooO00o(int i, int[] iArr, int i2, int i3, int i4) {
        while (true) {
            i--;
            if (i < 0) {
                return i4 << (-i3);
            }
            int i5 = i2 + i;
            int i6 = iArr[i5];
            iArr[i5] = (i4 << (-i3)) | (i6 >>> i3);
            i4 = i6;
        }
    }

    public static int OooO00o(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        while (true) {
            i--;
            if (i < 0) {
                return i4 << (-i3);
            }
            int i6 = iArr[i2 + i];
            iArr2[i5 + i] = (i4 << (-i3)) | (i6 >>> i3);
            i4 = i6;
        }
    }

    public static int OooO00o(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << (-i2);
            }
            int i4 = iArr[i];
            iArr2[i] = (i3 << (-i2)) | (i4 >>> i2);
            i3 = i4;
        }
    }

    public static int OooO00o(int i, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << 31;
            }
            int i5 = iArr[i2 + i];
            iArr2[i4 + i] = (i3 << 31) | (i5 >>> 1);
            i3 = i5;
        }
    }

    public static int OooO00o(int i, int[] iArr, int i2, int[] iArr2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr2[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    public static int OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + (((long) iArr[i2 + i4]) & 4294967295L) + (4294967295L & ((long) iArr2[i5]));
            iArr2[i5] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 + i5;
            long j2 = j + (((long) iArr[i2 + i5]) & 4294967295L) + (((long) iArr2[i3 + i5]) & 4294967295L) + (4294967295L & ((long) iArr3[i6]));
            iArr3[i6] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int OooO00o(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2]));
            iArr2[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int OooO00o(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (4294967295L & ((long) iArr2[i2]));
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    public static int OooO00o(int[] iArr, int i) {
        int i2;
        if (i == 0) {
            i2 = iArr[0];
        } else {
            int i3 = i >> 5;
            if (i3 < 0 || i3 >= iArr.length) {
                return 0;
            }
            i2 = iArr[i3] >>> (i & 31);
        }
        return i2 & 1;
    }

    public static int OooO00o(int[] iArr, int i, int i2, int[] iArr2, int i3) {
        long j = ((long) iArr[i + i2]) & 4294967295L;
        long j2 = 0;
        int i4 = 0;
        int i5 = i3;
        do {
            int i6 = i2 + i5;
            long j3 = j2 + ((((long) iArr[i + i4]) & 4294967295L) * j) + (((long) iArr2[i6]) & 4294967295L);
            iArr2[i6] = (int) j3;
            j2 = j3 >>> 32;
            i5++;
            i4++;
        } while (i4 < i2);
        return (int) j2;
    }

    public static int OooO00o(int[] iArr, int i, int[] iArr2) {
        long j = ((long) iArr[i]) & 4294967295L;
        long j2 = 0;
        int i2 = 0;
        do {
            int i3 = i + i2;
            long j3 = j2 + ((((long) iArr[i2]) & 4294967295L) * j) + (((long) iArr2[i3]) & 4294967295L);
            iArr2[i3] = (int) j3;
            j2 = j3 >>> 32;
            i2++;
        } while (i2 < i);
        return (int) j2;
    }

    public static long OooO00o(int i, long[] jArr, int i2, int i3, long j) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = i2 + i4;
            long j2 = jArr[i5];
            jArr[i5] = (j >>> (-i3)) | (j2 << i3);
            i4++;
            j = j2;
        }
        return j >>> (-i3);
    }

    public static long OooO00o(int i, long[] jArr, int i2, int i3, long j, long[] jArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            long j2 = jArr[i2 + i5];
            jArr2[i4 + i5] = (j >>> (-i3)) | (j2 << i3);
            i5++;
            j = j2;
        }
        return j >>> (-i3);
    }

    public static long OooO00o(int i, long[] jArr, int i2, long j, long[] jArr2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            long j2 = jArr[i2 + i4];
            jArr2[i3 + i4] = (j >>> 63) | (j2 << 1);
            i4++;
            j = j2;
        }
        return j >>> 63;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static BigInteger m21315OooO00o(int i, int[] iArr) {
        byte[] bArr = new byte[(i << 2)];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 != 0) {
                AbstractC6464l1l.OooO00o(i3, bArr, ((i - 1) - i2) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21316OooO00o(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        int i5 = -(i2 & 1);
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i4 + i6;
            int i8 = iArr2[i7];
            iArr2[i7] = i8 ^ ((iArr[i3 + i6] ^ i8) & i5);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21317OooO00o(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21318OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        System.arraycopy(iArr, i2, iArr2, i3, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21319OooO00o(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        iArr3[i4 + i] = OooO00o(i, iArr[i2], iArr2, i3, iArr3, i4);
        for (int i5 = 1; i5 < i; i5++) {
            int i6 = i4 + i5;
            iArr3[i6 + i] = OooO0O0(i, iArr[i2 + i5], iArr2, i3, iArr3, i6);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21320OooO00o(int i, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, 0, iArr2, 0, i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21321OooO00o(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        iArr3[i] = OooO00o(i, iArr[0], iArr2, iArr3);
        for (int i2 = 1; i2 < i; i2++) {
            iArr3[i2 + i] = OooO0O0(i, iArr[i2], iArr2, 0, iArr3, i2);
        }
    }

    public static void OooO00o(int i, long[] jArr) {
        for (int i2 = 0; i2 < i; i2++) {
            jArr[i2] = 0;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21322OooO00o(int i, int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i2 = 1; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21323OooO00o(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static int[] OooO00o(int i) {
        return new int[i];
    }

    public static int[] OooO00o(int i, BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > i) {
            throw new IllegalArgumentException();
        }
        int[] OooO00o2 = OooO00o((i + 31) >> 5);
        int i2 = 0;
        while (bigInteger.signum() != 0) {
            OooO00o2[i2] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i2++;
        }
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m21324OooO00o(int i, int[] iArr) {
        int[] iArr2 = new int[i];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m21325OooO00o(int i) {
        return new long[i];
    }

    public static int OooO0O0(int i, int i2, int[] iArr) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[0]));
        iArr[0] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, 1);
    }

    public static int OooO0O0(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i4]) & 4294967295L) + (((long) i2) & 4294967295L);
        iArr[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >>> 32) + (4294967295L & ((long) iArr[i5])) + 1;
        iArr[i5] = (int) j2;
        if ((j2 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3, 2);
    }

    public static int OooO0O0(int i, int i2, int[] iArr, int i3, int i4) {
        int i5 = i3 + i4;
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i5]));
        iArr[i5] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3, i4 + 1);
    }

    public static int OooO0O0(int i, int i2, int[] iArr, int i3, int[] iArr2, int i4) {
        long j = ((long) i2) & 4294967295L;
        long j2 = 0;
        int i5 = 0;
        do {
            int i6 = i4 + i5;
            long j3 = j2 + ((((long) iArr[i3 + i5]) & 4294967295L) * j) + (((long) iArr2[i6]) & 4294967295L);
            iArr2[i6] = (int) j3;
            j2 = j3 >>> 32;
            i5++;
        } while (i5 < i);
        return (int) j2;
    }

    public static int OooO0O0(int i, int i2, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = ((long) (-(i2 & 1))) & 4294967295L;
        long j2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long j3 = j2 + ((((long) iArr[i3]) & 4294967295L) - (((long) iArr2[i3]) & j));
            iArr3[i3] = (int) j3;
            j2 = j3 >> 32;
        }
        return (int) j2;
    }

    public static int OooO0O0(int i, long j, int[] iArr) {
        long j2 = (((long) iArr[0]) & 4294967295L) - (j & 4294967295L);
        iArr[0] = (int) j2;
        long j3 = (j2 >> 32) + ((4294967295L & ((long) iArr[1])) - (j >>> 32));
        iArr[1] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, 2);
    }

    public static int OooO0O0(int i, long j, int[] iArr, int i2) {
        int i3 = i2 + 0;
        long j2 = (((long) iArr[i3]) & 4294967295L) + (j & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i2 + 1;
        long j3 = (j2 >>> 32) + (4294967295L & ((long) iArr[i4])) + (j >>> 32);
        iArr[i4] = (int) j3;
        if ((j3 >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i2, 2);
    }

    public static int OooO0O0(int i, long j, int[] iArr, int i2, int i3) {
        int i4 = i2 + i3;
        long j2 = (((long) iArr[i4]) & 4294967295L) - (j & 4294967295L);
        iArr[i4] = (int) j2;
        int i5 = i4 + 1;
        long j3 = (j2 >> 32) + ((4294967295L & ((long) iArr[i5])) - (j >>> 32));
        iArr[i5] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i2, i3 + 2);
    }

    public static int OooO0O0(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int OooO0O0(int i, int[] iArr, int i2) {
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr[i2] = i3;
            if (i3 != 0) {
                return 0;
            }
            i2++;
        }
        return 1;
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int i3) {
        while (i3 < i) {
            int i4 = i2 + i3;
            int i5 = iArr[i4] + 1;
            iArr[i4] = i5;
            if (i5 != 0) {
                return 0;
            }
            i3++;
        }
        return 1;
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int i3, int i4) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = i2 + i5;
            int i7 = iArr[i6];
            iArr[i6] = (i4 >>> (-i3)) | (i7 << i3);
            i5++;
            i4 = i7;
        }
        return i4 >>> (-i3);
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int i3, int i4, int[] iArr2, int i5) {
        int i6 = 0;
        while (i6 < i) {
            int i7 = iArr[i2 + i6];
            iArr2[i5 + i6] = (i4 >>> (-i3)) | (i7 << i3);
            i6++;
            i4 = i7;
        }
        return i4 >>> (-i3);
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int i3, int[] iArr2) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr2[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int i3, int[] iArr2, int i4) {
        int i5 = 0;
        while (i5 < i) {
            int i6 = iArr[i2 + i5];
            iArr2[i4 + i5] = (i3 >>> 31) | (i6 << 1);
            i5++;
            i3 = i6;
        }
        return i3 >>> 31;
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int[] iArr2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr2[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = i3 + i4;
            long j2 = j + ((((long) iArr2[i5]) & 4294967295L) - (4294967295L & ((long) iArr[i2 + i4])));
            iArr2[i5] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0O0(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        int i5 = i4;
        long j = 0;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i5 + i;
            long OooO0O0 = (((long) OooO0O0(i, iArr[i2 + i6], iArr2, i3, iArr3, i5)) & 4294967295L) + j + (4294967295L & ((long) iArr3[i7]));
            iArr3[i7] = (int) OooO0O0;
            j = OooO0O0 >>> 32;
            i5++;
        }
        return (int) j;
    }

    public static int OooO0O0(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] - 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != -1) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return -1;
    }

    public static int OooO0O0(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((long) iArr[i2]) & 4294967295L) + (((long) iArr2[i2]) & 4294967295L) + (4294967295L & ((long) iArr3[i2]));
            iArr3[i2] = (int) j2;
            j = j2 >>> 32;
        }
        return (int) j;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m21326OooO0O0(int i, int[] iArr, int i2, int[] iArr2, int i3) {
        int i4;
        int i5 = i << 1;
        int i6 = 0;
        int i7 = i;
        int i8 = i5;
        do {
            i7--;
            long j = ((long) iArr[i2 + i7]) & 4294967295L;
            long j2 = j * j;
            int i9 = i8 - 1;
            iArr2[i3 + i9] = (i6 << 31) | ((int) (j2 >>> 33));
            i8 = i9 - 1;
            iArr2[i3 + i8] = (int) (j2 >>> 1);
            i6 = (int) j2;
        } while (i7 > 0);
        for (i4 = 1; i4 < i; i4++) {
            OooO0O0(i5, OooO00o(iArr, i2, i4, iArr2, i3), iArr2, i3, i4 << 1);
        }
        OooO0o0(i5, iArr2, i3, iArr[i2] << 31);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static void m21327OooO0O0(int i, int[] iArr, int[] iArr2) {
        int i2;
        int i3 = i << 1;
        int i4 = 0;
        int i5 = i;
        int i6 = i3;
        while (true) {
            i5--;
            long j = ((long) iArr[i5]) & 4294967295L;
            long j2 = j * j;
            int i7 = i6 - 1;
            iArr2[i7] = (i4 << 31) | ((int) (j2 >>> 33));
            i6 = i7 - 1;
            iArr2[i6] = (int) (j2 >>> 1);
            int i8 = (int) j2;
            if (i5 <= 0) {
                break;
            }
            i4 = i8;
        }
        for (i2 = 1; i2 < i; i2++) {
            OooO0OO(i3, OooO00o(iArr, i2, iArr2), iArr2, i2 << 1);
        }
        OooO0o0(i3, iArr2, iArr[0] << 31);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m21328OooO0O0(int i, int[] iArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m21329OooO0O0(int i, int[] iArr, int[] iArr2) {
        for (int i2 = i - 1; i2 >= 0; i2--) {
            int i3 = iArr[i2] ^ Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE ^ iArr2[i2];
            if (i3 < i4) {
                return false;
            }
            if (i3 > i4) {
                return true;
            }
        }
        return true;
    }

    public static int OooO0OO(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = (j >> 32) + ((4294967295L & ((long) iArr[1])) - 1);
        iArr[1] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, 2);
    }

    public static int OooO0OO(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3 + 1);
    }

    public static int OooO0OO(int i, int i2, int[] iArr, int i3, int i4) {
        int i5 = i3 + i4;
        long j = (((long) iArr[i5]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i5] = (int) j;
        int i6 = i5 + 1;
        long j2 = (j >> 32) + ((4294967295L & ((long) iArr[i6])) - 1);
        iArr[i6] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3, i4 + 2);
    }

    public static int OooO0OO(int i, long j, int[] iArr, int i2) {
        int i3 = i2 + 0;
        long j2 = (((long) iArr[i3]) & 4294967295L) - (j & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i2 + 1;
        long j3 = (j2 >> 32) + ((4294967295L & ((long) iArr[i4])) - (j >>> 32));
        iArr[i4] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i2 + 2);
    }

    public static int OooO0OO(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2 << 31;
            }
            int i3 = iArr[i];
            iArr[i] = (i2 << 31) | (i3 >>> 1);
            i2 = i3;
        }
    }

    public static int OooO0OO(int i, int[] iArr, int i2, int i3) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << 31;
            }
            int i4 = i2 + i;
            int i5 = iArr[i4];
            iArr[i4] = (i3 << 31) | (i5 >>> 1);
            i3 = i5;
        }
    }

    public static int OooO0OO(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i; i5++) {
            long j2 = j + ((((long) iArr[i2 + i5]) & 4294967295L) - (4294967295L & ((long) iArr2[i3 + i5])));
            iArr3[i4 + i5] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0OO(int i, int[] iArr, int[] iArr2) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = iArr[i2] + 1;
            iArr2[i2] = i3;
            i2++;
            if (i3 != 0) {
                while (i2 < i) {
                    iArr2[i2] = iArr[i2];
                    i2++;
                }
                return 0;
            }
        }
        return 1;
    }

    public static int OooO0OO(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + i;
            long OooO0O0 = (((long) OooO0O0(i, iArr[i2], iArr2, 0, iArr3, i2)) & 4294967295L) + j + (4294967295L & ((long) iArr3[i3]));
            iArr3[i3] = (int) OooO0O0;
            j = OooO0O0 >>> 32;
        }
        return (int) j;
    }

    public static int OooO0Oo(int i, int i2, int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[0] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, 1);
    }

    public static int OooO0Oo(int i, int i2, int[] iArr, int i3) {
        long j = (((long) i2) & 4294967295L) + (4294967295L & ((long) iArr[i3]));
        iArr[i3] = (int) j;
        if ((j >>> 32) == 0) {
            return 0;
        }
        return OooO0O0(i, iArr, i3, 1);
    }

    public static int OooO0Oo(int i, int i2, int[] iArr, int i3, int i4) {
        int i5 = i3 + i4;
        long j = (((long) iArr[i5]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i5] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3, i4 + 1);
    }

    public static int OooO0Oo(int i, long j, int[] iArr, int i2) {
        int i3 = i2 + 0;
        long j2 = (((long) iArr[i3]) & 4294967295L) - (j & 4294967295L);
        iArr[i3] = (int) j2;
        int i4 = i2 + 1;
        long j3 = (j2 >> 32) + ((4294967295L & ((long) iArr[i4])) - (j >>> 32));
        iArr[i4] = (int) j3;
        if ((j3 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i2, 2);
    }

    public static int OooO0Oo(int i, int[] iArr, int i2) {
        while (true) {
            i--;
            if (i < 0) {
                return i2;
            }
            int i3 = iArr[i];
            iArr[i] = i2;
            i2 = i3;
        }
    }

    public static int OooO0Oo(int i, int[] iArr, int i2, int i3) {
        while (true) {
            i--;
            if (i < 0) {
                return i3 << (-i2);
            }
            int i4 = iArr[i];
            iArr[i] = (i3 << (-i2)) | (i4 >>> i2);
            i3 = i4;
        }
    }

    public static int OooO0Oo(int i, int[] iArr, int i2, int[] iArr2, int i3, int[] iArr3, int i4) {
        long j = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i4 + i5;
            long j2 = j + (((((long) iArr3[i6]) & 4294967295L) - (((long) iArr[i2 + i5]) & 4294967295L)) - (4294967295L & ((long) iArr2[i3 + i5])));
            iArr3[i6] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0Oo(int i, int[] iArr, int[] iArr2) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr2[i2]) & 4294967295L) - (4294967295L & ((long) iArr[i2])));
            iArr2[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0Oo(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + ((((long) iArr[i2]) & 4294967295L) - (4294967295L & ((long) iArr2[i2])));
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0o(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i4]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >> 32) + ((4294967295L & ((long) iArr[i5])) - 1);
        iArr[i5] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3, 2);
    }

    public static int OooO0o(int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = iArr[i4];
            iArr[i4] = (i3 >>> (-i2)) | (i5 << i2);
            i4++;
            i3 = i5;
        }
        return i3 >>> (-i2);
    }

    public static int OooO0o0(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i4]) & 4294967295L) - (((long) i2) & 4294967295L);
        iArr[i4] = (int) j;
        int i5 = i3 + 1;
        long j2 = (j >> 32) + ((4294967295L & ((long) iArr[i5])) - 1);
        iArr[i5] = (int) j2;
        if ((j2 >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3 + 2);
    }

    public static int OooO0o0(int i, int[] iArr, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = iArr[i3];
            iArr[i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        return i2 >>> 31;
    }

    public static int OooO0o0(int i, int[] iArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i) {
            int i5 = i2 + i4;
            int i6 = iArr[i5];
            iArr[i5] = (i3 >>> 31) | (i6 << 1);
            i4++;
            i3 = i6;
        }
        return i3 >>> 31;
    }

    public static int OooO0o0(int i, int[] iArr, int[] iArr2, int[] iArr3) {
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            long j2 = j + (((((long) iArr3[i2]) & 4294967295L) - (((long) iArr[i2]) & 4294967295L)) - (4294967295L & ((long) iArr2[i2])));
            iArr3[i2] = (int) j2;
            j = j2 >> 32;
        }
        return (int) j;
    }

    public static int OooO0oO(int i, int i2, int[] iArr, int i3) {
        long j = (((long) iArr[i3]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i3] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3 + 1);
    }

    public static int OooO0oo(int i, int i2, int[] iArr, int i3) {
        int i4 = i3 + 0;
        long j = (((long) iArr[i4]) & 4294967295L) - (4294967295L & ((long) i2));
        iArr[i4] = (int) j;
        if ((j >> 32) == 0) {
            return 0;
        }
        return OooO00o(i, iArr, i3, 1);
    }
}
