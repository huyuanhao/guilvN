package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨LLi丨  reason: invalid class name and case insensitive filesystem */
public class C9499LLi {
    public static final long OooO00o = 562949953421311L;
    public static final long OooO0O0 = 144115188075855871L;

    public static int OooO00o(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }

    public static void OooO00o(long j, long j2, long[] jArr, int i) {
        long[] jArr2 = new long[8];
        jArr2[1] = j2;
        jArr2[2] = jArr2[1] << 1;
        jArr2[3] = jArr2[2] ^ j2;
        jArr2[4] = jArr2[2] << 1;
        jArr2[5] = jArr2[4] ^ j2;
        jArr2[6] = jArr2[3] << 1;
        jArr2[7] = jArr2[6] ^ j2;
        long j3 = jArr2[((int) j) & 7];
        long j4 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j5 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j3 ^= j5 << i2;
            j4 ^= j5 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j3;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j4) << 7) ^ (j3 >>> 57);
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 1;
        long j = jArr[i2];
        long j2 = j >>> 49;
        jArr[i] = (j2 ^ (j2 << 9)) ^ jArr[i];
        jArr[i2] = j & 562949953421311L;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO0O02 = AbstractC6835lIiiL1.m17988OooO0O0();
        OooO0O0(jArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, jArr2);
            i--;
            if (i > 0) {
                OooO0O0(jArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = AbstractC6835lIiiL1.m17984OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        LlliII.OooO00o(jArr[0], jArr2, 0);
        LlliII.OooO00o(jArr[1], jArr2, 2);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        if (!AbstractC6835lIiiL1.OooO0O0(jArr)) {
            long[] OooO00o2 = AbstractC6835lIiiL1.m17983OooO00o();
            long[] OooO00o3 = AbstractC6835lIiiL1.m17983OooO00o();
            OooO0o(jArr, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO0o(OooO00o2, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 3, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0o(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 7, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 14, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO00o(OooO00o3, 28, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 56, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0o(OooO00o3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = ((jArr[1] << 7) ^ (j >>> 57)) & 144115188075855871L;
        long j3 = j & 144115188075855871L;
        long j4 = jArr2[0];
        long j5 = ((jArr2[1] << 7) ^ (j4 >>> 57)) & 144115188075855871L;
        long j6 = 144115188075855871L & j4;
        long[] jArr4 = new long[6];
        OooO00o(j3, j6, jArr4, 0);
        OooO00o(j2, j5, jArr4, 2);
        OooO00o(j3 ^ j2, j6 ^ j5, jArr4, 4);
        long j7 = jArr4[1] ^ jArr4[2];
        long j8 = jArr4[0];
        long j9 = jArr4[3];
        long j10 = (jArr4[4] ^ j8) ^ j7;
        long j11 = j7 ^ (jArr4[5] ^ j9);
        jArr3[0] = j8 ^ (j10 << 57);
        jArr3[1] = (j10 >>> 7) ^ (j11 << 50);
        jArr3[2] = (j11 >>> 14) ^ (j9 << 43);
        jArr3[3] = j9 >>> 21;
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = j3 ^ ((j4 >>> 40) ^ (j4 >>> 49));
        long j6 = j ^ ((j5 << 15) ^ (j5 << 24));
        long j7 = (j2 ^ ((j4 << 15) ^ (j4 << 24))) ^ ((j5 >>> 40) ^ (j5 >>> 49));
        long j8 = j7 >>> 49;
        jArr2[0] = (j6 ^ j8) ^ (j8 << 9);
        jArr2[1] = 562949953421311L & j7;
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6835lIiiL1.m17988OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0Oo(OooO0O02, jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = AbstractC6835lIiiL1.m17988OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0Oo(OooO0O02, jArr2);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long OooO0O02 = LlliII.OooO0O0(jArr[0]);
        long OooO0O03 = LlliII.OooO0O0(jArr[1]);
        long j = (OooO0O02 >>> 32) | (OooO0O03 & -4294967296L);
        jArr2[0] = ((j << 57) ^ ((4294967295L & OooO0O02) | (OooO0O03 << 32))) ^ (j << 5);
        jArr2[1] = (j >>> 59) ^ (j >>> 7);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6835lIiiL1.m17988OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = AbstractC6835lIiiL1.m17988OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0O0(jArr2, OooO0O02, jArr2);
    }
}
