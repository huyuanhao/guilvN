package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.l丨丨LiiiI  reason: invalid class name and case insensitive filesystem */
public class C6899lLiiiI {
    public static final long OooO00o = 1;
    public static final long OooO0O0 = 562949953421311L;

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
        int i2 = (int) j;
        long j3 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j4 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 12) & 7] << 12) ^ (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9));
            j3 ^= j5 << i3;
            j4 ^= j5 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j3);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j3 >>> 49) ^ (j4 << 15));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18066OooO00o(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 49);
        jArr[1] = (j2 >>> 15) ^ (j3 << 34);
        jArr[2] = (j3 >>> 30) ^ (j4 << 19);
        jArr[3] = ((j4 >>> 45) ^ (j5 << 4)) ^ (j6 << 53);
        jArr[4] = ((j5 >>> 60) ^ (j7 << 38)) ^ (j6 >>> 11);
        jArr[5] = (j7 >>> 26) ^ (j8 << 23);
        jArr[6] = j8 >>> 41;
        jArr[7] = 0;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 1;
        jArr[i] = jArr[i] ^ ((j2 << 15) ^ j2);
        int i3 = i + 1;
        jArr[i3] = (j2 >>> 49) ^ jArr[i3];
        jArr[i2] = j & 1;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO0O02 = C1LLlIL.m21853OooO0O0();
        OooO0OO(jArr, OooO0O02);
        while (true) {
            OooO0o0(OooO0O02, jArr2);
            i--;
            if (i > 0) {
                OooO0OO(jArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = C1LLlIL.m21849OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        LlliII.OooO00o(jArr[0], jArr2, 0);
        LlliII.OooO00o(jArr[1], jArr2, 2);
        LlliII.OooO00o(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        OooO0O0(jArr, jArr4);
        OooO0O0(jArr2, jArr5);
        OooO00o(jArr4[0], jArr5[0], jArr3, 0);
        OooO00o(jArr4[1], jArr5[1], jArr3, 1);
        OooO00o(jArr4[2], jArr5[2], jArr3, 2);
        OooO00o(jArr4[3], jArr5[3], jArr3, 3);
        for (int i = 5; i > 0; i--) {
            jArr3[i] = jArr3[i] ^ jArr3[i - 1];
        }
        OooO00o(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        OooO00o(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i2 = 7; i2 > 1; i2--) {
            jArr3[i2] = jArr3[i2] ^ jArr3[i2 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        OooO00o(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        OooO00o(j, j3, jArr6, 0);
        OooO00o(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j5;
        jArr3[3] = (j5 ^ j6) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j6 ^ j7);
        jArr3[5] = jArr3[5] ^ j7;
        m18066OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        if (!C1LLlIL.OooO0O0(jArr)) {
            long[] OooO00o2 = C1LLlIL.m21848OooO00o();
            long[] OooO00o3 = C1LLlIL.m21848OooO00o();
            OooO0oO(jArr, OooO00o2);
            OooO00o(OooO00o2, 1, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 1, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 3, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 6, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 12, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 24, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 48, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 96, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = C1LLlIL.m21853OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0o0(OooO0O02, jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long OooO0O02 = LlliII.OooO0O0(jArr[0]);
        long OooO0O03 = LlliII.OooO0O0(jArr[1]);
        long j = (OooO0O02 & 4294967295L) | (OooO0O03 << 32);
        long j2 = (OooO0O02 >>> 32) | (OooO0O03 & -4294967296L);
        long OooO0O04 = LlliII.OooO0O0(jArr[2]);
        long j3 = (4294967295L & OooO0O04) ^ (jArr[3] << 32);
        long j4 = OooO0O04 >>> 32;
        jArr2[0] = j ^ (j2 << 8);
        jArr2[1] = ((j3 ^ (j4 << 8)) ^ (j2 >>> 56)) ^ (j2 << 33);
        jArr2[2] = (j2 >>> 31) ^ ((j4 >>> 56) ^ (j4 << 33));
        jArr2[3] = j4 >>> 31;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = C1LLlIL.m21853OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = C1LLlIL.m21853OooO0O0();
        OooO0OO(jArr, OooO0O02);
        OooO0o0(OooO0O02, jArr2);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = C1LLlIL.m21853OooO0O0();
        OooO0OO(jArr, OooO0O02);
        OooO0O0(jArr2, OooO0O02, jArr2);
    }
}
