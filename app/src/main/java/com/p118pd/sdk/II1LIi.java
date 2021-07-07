package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.II1LI丨i丨  reason: invalid class name */
public class II1LIi {
    public static final long OooO00o = 34359738367L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f15445OooO00o = {-5270498306774157648L, 5270498306774195053L, 19634136210L};
    public static final long OooO0O0 = 36028797018963967L;

    public static int OooO00o(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
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
        long j3 = jArr2[((int) j) & 3];
        long j4 = 0;
        int i2 = 47;
        do {
            int i3 = (int) (j >>> i2);
            long j5 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j3 ^= j5 << i2;
            j4 ^= j5 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = OooO0O0 & j3;
        jArr[i + 1] = (j3 >>> 55) ^ (j4 << 9);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15354OooO00o(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 55);
        jArr[1] = (j2 >>> 9) ^ (j3 << 46);
        jArr[2] = (j3 >>> 18) ^ (j4 << 37);
        jArr[3] = (j4 >>> 27) ^ (j5 << 28);
        jArr[4] = (j5 >>> 36) ^ (j6 << 19);
        jArr[5] = j6 >>> 45;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 35;
        jArr[i] = ((j2 << 7) ^ (((j2 << 3) ^ j2) ^ (j2 << 6))) ^ jArr[i];
        jArr[i2] = j & OooO00o;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
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
        jArr2[2] = jArr[2];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = AbstractC6163iLIl1.m17098OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        LlliII.OooO00o(jArr[0], jArr2, 0);
        LlliII.OooO00o(jArr[1], jArr2, 2);
        long j = jArr[2];
        jArr2[4] = LlliII.m16402OooO00o((int) j);
        jArr2[5] = ((long) LlliII.OooO0O0((int) (j >>> 32))) & 4294967295L;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        if (!AbstractC6163iLIl1.OooO0O0(jArr)) {
            long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
            long[] OooO00o3 = AbstractC6163iLIl1.m17097OooO00o();
            OooO0o(jArr, OooO00o2);
            OooO00o(OooO00o2, 1, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 1, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 3, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 3, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 9, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 9, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 27, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 27, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 81, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = (jArr[2] << 18) ^ (j2 >>> 46);
        long j4 = ((j2 << 9) ^ (j >>> 55)) & OooO0O0;
        long j5 = j & OooO0O0;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = (j7 >>> 46) ^ (jArr2[2] << 18);
        long j9 = ((j6 >>> 55) ^ (j7 << 9)) & OooO0O0;
        long j10 = j6 & OooO0O0;
        long[] jArr4 = new long[10];
        OooO00o(j5, j10, jArr4, 0);
        OooO00o(j3, j8, jArr4, 2);
        long j11 = (j5 ^ j4) ^ j3;
        long j12 = (j10 ^ j9) ^ j8;
        OooO00o(j11, j12, jArr4, 4);
        long j13 = (j4 << 1) ^ (j3 << 2);
        long j14 = (j9 << 1) ^ (j8 << 2);
        OooO00o(j5 ^ j13, j10 ^ j14, jArr4, 6);
        OooO00o(j11 ^ j13, j12 ^ j14, jArr4, 8);
        long j15 = jArr4[6] ^ jArr4[8];
        long j16 = jArr4[7] ^ jArr4[9];
        long j17 = (j15 << 1) ^ jArr4[6];
        long j18 = (j15 ^ (j16 << 1)) ^ jArr4[7];
        long j19 = jArr4[0];
        long j20 = (jArr4[1] ^ jArr4[0]) ^ jArr4[4];
        long j21 = jArr4[1] ^ jArr4[5];
        long j22 = ((j17 ^ j19) ^ (jArr4[2] << 4)) ^ (jArr4[2] << 1);
        long j23 = (((j20 ^ j18) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 55);
        long j24 = j22 & OooO0O0;
        long j25 = (j21 ^ j16) ^ (j23 >>> 55);
        long j26 = j23 & OooO0O0;
        long j27 = (j24 >>> 1) ^ ((j26 & 1) << 54);
        long j28 = j27 ^ (j27 << 1);
        long j29 = j28 ^ (j28 << 2);
        long j30 = j29 ^ (j29 << 4);
        long j31 = j30 ^ (j30 << 8);
        long j32 = j31 ^ (j31 << 16);
        long j33 = (j32 ^ (j32 << 32)) & OooO0O0;
        long j34 = ((j26 >>> 1) ^ ((j25 & 1) << 54)) ^ (j33 >>> 54);
        long j35 = j34 ^ (j34 << 1);
        long j36 = j35 ^ (j35 << 2);
        long j37 = j36 ^ (j36 << 4);
        long j38 = j37 ^ (j37 << 8);
        long j39 = j38 ^ (j38 << 16);
        long j40 = (j39 ^ (j39 << 32)) & OooO0O0;
        long j41 = (j25 >>> 1) ^ (j40 >>> 54);
        long j42 = j41 ^ (j41 << 1);
        long j43 = j42 ^ (j42 << 2);
        long j44 = j43 ^ (j43 << 4);
        long j45 = j44 ^ (j44 << 8);
        long j46 = j45 ^ (j45 << 16);
        long j47 = j46 ^ (j46 << 32);
        jArr3[0] = j19;
        jArr3[1] = (j20 ^ j33) ^ jArr4[2];
        jArr3[2] = ((j21 ^ j40) ^ j33) ^ jArr4[3];
        jArr3[3] = j47 ^ j40;
        jArr3[4] = jArr4[2] ^ j47;
        jArr3[5] = jArr4[3];
        m15354OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = j4 ^ ((((j6 >>> 35) ^ (j6 >>> 32)) ^ (j6 >>> 29)) ^ (j6 >>> 28));
        long j8 = j2 ^ ((((j5 << 29) ^ (j5 << 32)) ^ (j5 << 35)) ^ (j5 << 36));
        long j9 = (j3 ^ ((((j6 << 29) ^ (j6 << 32)) ^ (j6 << 35)) ^ (j6 << 36))) ^ ((j5 >>> 28) ^ (((j5 >>> 35) ^ (j5 >>> 32)) ^ (j5 >>> 29)));
        long j10 = j ^ ((((j7 << 29) ^ (j7 << 32)) ^ (j7 << 35)) ^ (j7 << 36));
        long j11 = j8 ^ ((j7 >>> 28) ^ (((j7 >>> 35) ^ (j7 >>> 32)) ^ (j7 >>> 29)));
        long j12 = j9 >>> 35;
        jArr2[0] = (((j10 ^ j12) ^ (j12 << 3)) ^ (j12 << 6)) ^ (j12 << 7);
        jArr2[1] = j11;
        jArr2[2] = OooO00o & j9;
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0Oo(OooO0O02, jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0Oo(OooO0O02, jArr2);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        long OooO0O02 = LlliII.OooO0O0(jArr[0]);
        long OooO0O03 = LlliII.OooO0O0(jArr[1]);
        OooO00o2[0] = (OooO0O02 >>> 32) | (OooO0O03 & -4294967296L);
        long OooO0O04 = LlliII.OooO0O0(jArr[2]);
        long j = OooO0O04 & 4294967295L;
        OooO00o2[1] = OooO0O04 >>> 32;
        OooO0Oo(OooO00o2, f15445OooO00o, jArr2);
        jArr2[0] = jArr2[0] ^ ((OooO0O02 & 4294967295L) | (OooO0O03 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0O0(jArr2, OooO0O02, jArr2);
    }
}
