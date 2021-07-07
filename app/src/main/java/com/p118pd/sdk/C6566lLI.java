package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lLI  reason: case insensitive filesystem */
public class C6566lLI {
    public static final long OooO00o = 140737488355327L;
    public static final long OooO0O0 = 1152921504606846975L;

    public static int OooO00o(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
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
        int i3 = 54;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 3) & 7] << 3) ^ jArr2[i4 & 7];
            j3 ^= j5 << i3;
            j4 ^= j5 >>> (-i3);
            i3 -= 6;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (OooO0O0 & j3);
        int i5 = i + 1;
        jArr[i5] = ((((((j & 585610922974906400L) & ((j2 << 4) >> 63)) >>> 5) ^ j4) << 4) ^ (j3 >>> 60)) ^ jArr[i5];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17665OooO00o(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr[0] = j ^ (j2 << 60);
        jArr[1] = (j2 >>> 4) ^ (j3 << 56);
        jArr[2] = (j3 >>> 8) ^ (j4 << 52);
        jArr[3] = (j4 >>> 12) ^ (j5 << 48);
        jArr[4] = (j5 >>> 16) ^ (j6 << 44);
        jArr[5] = (j6 >>> 20) ^ (j7 << 40);
        jArr[6] = (j7 >>> 24) ^ (j8 << 36);
        jArr[7] = j8 >>> 28;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 3;
        long j = jArr[i2];
        long j2 = j >>> 47;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 2;
        jArr[i3] = (j2 << 30) ^ jArr[i3];
        jArr[i2] = j & OooO00o;
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
        jArr2[0] = j & OooO0O0;
        jArr2[1] = ((j >>> 60) ^ (j2 << 4)) & OooO0O0;
        jArr2[2] = ((j2 >>> 56) ^ (j3 << 8)) & OooO0O0;
        jArr2[3] = (j3 >>> 52) ^ (j4 << 12);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        LlliII.OooO00o(jArr[0], jArr2, 0);
        LlliII.OooO00o(jArr[1], jArr2, 2);
        LlliII.OooO00o(jArr[2], jArr2, 4);
        long j = jArr[3];
        jArr2[6] = LlliII.m16402OooO00o((int) j);
        jArr2[7] = ((long) LlliII.OooO00o((int) (j >>> 32))) & 4294967295L;
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
        m17665OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        if (!C1LLlIL.OooO0O0(jArr)) {
            long[] OooO00o2 = C1LLlIL.m21848OooO00o();
            long[] OooO00o3 = C1LLlIL.m21848OooO00o();
            OooO0oO(jArr, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO0oO(OooO00o2, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 3, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0oO(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 7, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 14, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0oO(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 29, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0oO(OooO00o2, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 59, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0oO(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 119, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0oO(OooO00o2, jArr2);
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
        long OooO0O05 = LlliII.OooO0O0(jArr[3]);
        long j3 = (4294967295L & OooO0O04) | (OooO0O05 << 32);
        long j4 = (OooO0O05 & -4294967296L) | (OooO0O04 >>> 32);
        long j5 = j4 >>> 49;
        long j6 = (j2 >>> 49) | (j4 << 15);
        long j7 = j4 ^ (j2 << 15);
        long[] OooO0O06 = C1LLlIL.m21853OooO0O0();
        int[] iArr = {39, 120};
        int i = 0;
        for (int i2 = 2; i < i2; i2 = 2) {
            int i3 = iArr[i] >>> 6;
            int i4 = iArr[i] & 63;
            OooO0O06[i3] = OooO0O06[i3] ^ (j2 << i4);
            int i5 = i3 + 1;
            int i6 = -i4;
            OooO0O06[i5] = OooO0O06[i5] ^ ((j7 << i4) | (j2 >>> i6));
            int i7 = i3 + 2;
            OooO0O06[i7] = OooO0O06[i7] ^ ((j6 << i4) | (j7 >>> i6));
            int i8 = i3 + 3;
            OooO0O06[i8] = OooO0O06[i8] ^ ((j5 << i4) | (j6 >>> i6));
            int i9 = i3 + 4;
            OooO0O06[i9] = OooO0O06[i9] ^ (j5 >>> i6);
            i++;
        }
        OooO0o0(OooO0O06, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ j3;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j7 ^ (j8 >>> 17);
        long j10 = (j6 ^ (j8 << 47)) ^ (j9 >>> 17);
        long j11 = ((j5 ^ (j8 >>> 47)) ^ (j9 << 47)) ^ (j10 >>> 17);
        long j12 = j ^ (j11 << 17);
        long j13 = (j2 ^ (j10 << 17)) ^ (j11 >>> 47);
        long j14 = (((j4 ^ (j8 << 17)) ^ (j9 >>> 47)) ^ (j10 << 47)) ^ (j11 >>> 17);
        long j15 = j14 >>> 47;
        jArr2[0] = j12 ^ j15;
        jArr2[1] = j13;
        long j16 = j15 << 30;
        jArr2[2] = j16 ^ (((j3 ^ (j9 << 17)) ^ (j10 >>> 47)) ^ (j11 << 47));
        jArr2[3] = OooO00o & j14;
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
