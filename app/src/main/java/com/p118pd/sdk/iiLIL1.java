package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ii丨LIL1  reason: invalid class name */
public class iiLIL1 {
    public static final long OooO00o = 7;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f17962OooO00o = {2791191049453778211L, 2791191049453778402L, 6};
    public static final long OooO0O0 = 17592186044415L;

    public static int OooO00o(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
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
        long j3 = (jArr2[(i2 >>> 6) & 7] << 6) ^ (jArr2[i2 & 7] ^ (jArr2[(i2 >>> 3) & 7] << 3));
        long j4 = 0;
        int i3 = 33;
        do {
            int i4 = (int) (j >>> i3);
            long j5 = (jArr2[(i4 >>> 9) & 7] << 9) ^ ((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6));
            j3 ^= j5 << i3;
            j4 ^= j5 >>> (-i3);
            i3 -= 12;
        } while (i3 > 0);
        jArr[i] = OooO0O0 & j3;
        jArr[i + 1] = (j3 >>> 44) ^ (j4 << 20);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17308OooO00o(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        jArr[0] = j ^ (j2 << 44);
        jArr[1] = (j2 >>> 20) ^ (j3 << 24);
        jArr[2] = ((j3 >>> 40) ^ (j4 << 4)) ^ (j5 << 48);
        jArr[3] = ((j4 >>> 60) ^ (j6 << 28)) ^ (j5 >>> 16);
        jArr[4] = j6 >>> 36;
        jArr[5] = 0;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 2;
        long j = jArr[i2];
        long j2 = j >>> 3;
        jArr[i] = jArr[i] ^ ((((j2 << 2) ^ j2) ^ (j2 << 3)) ^ (j2 << 8));
        int i3 = i + 1;
        jArr[i3] = (j2 >>> 56) ^ jArr[i3];
        jArr[i2] = j & 7;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(5);
        OooO0O0(jArr, OooO00o2);
        while (true) {
            OooO0Oo(OooO00o2, jArr2);
            i--;
            if (i > 0) {
                OooO0O0(jArr2, OooO00o2);
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
        jArr2[4] = ((long) LlliII.OooO0O0((int) jArr[2])) & 4294967295L;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        if (!AbstractC6163iLIl1.OooO0O0(jArr)) {
            long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
            long[] OooO00o3 = AbstractC6163iLIl1.m17097OooO00o();
            OooO0o(jArr, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 2, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO00o(OooO00o3, 4, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 8, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO00o(OooO00o3, 16, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 32, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0o(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 65, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0o(OooO00o2, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = ((jArr[2] << 40) ^ (j2 >>> 24)) & OooO0O0;
        long j4 = ((j2 << 20) ^ (j >>> 44)) & OooO0O0;
        long j5 = j & OooO0O0;
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = ((j7 >>> 24) ^ (jArr2[2] << 40)) & OooO0O0;
        long j9 = ((j6 >>> 44) ^ (j7 << 20)) & OooO0O0;
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
        long j23 = (((j20 ^ j18) ^ (jArr4[3] << 4)) ^ (jArr4[3] << 1)) ^ (j22 >>> 44);
        long j24 = j22 & OooO0O0;
        long j25 = (j21 ^ j16) ^ (j23 >>> 44);
        long j26 = j23 & OooO0O0;
        long j27 = (j24 >>> 1) ^ ((j26 & 1) << 43);
        long j28 = j27 ^ (j27 << 1);
        long j29 = j28 ^ (j28 << 2);
        long j30 = j29 ^ (j29 << 4);
        long j31 = j30 ^ (j30 << 8);
        long j32 = j31 ^ (j31 << 16);
        long j33 = (j32 ^ (j32 << 32)) & OooO0O0;
        long j34 = ((j26 >>> 1) ^ ((j25 & 1) << 43)) ^ (j33 >>> 43);
        long j35 = j34 ^ (j34 << 1);
        long j36 = j35 ^ (j35 << 2);
        long j37 = j36 ^ (j36 << 4);
        long j38 = j37 ^ (j37 << 8);
        long j39 = j38 ^ (j38 << 16);
        long j40 = (j39 ^ (j39 << 32)) & OooO0O0;
        long j41 = (j40 >>> 43) ^ (j25 >>> 1);
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
        m17308OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = j4 ^ (j5 >>> 59);
        long j7 = j ^ ((j6 << 61) ^ (j6 << 63));
        long j8 = (j2 ^ ((j5 << 61) ^ (j5 << 63))) ^ ((((j6 >>> 3) ^ (j6 >>> 1)) ^ j6) ^ (j6 << 5));
        long j9 = (j3 ^ ((((j5 >>> 3) ^ (j5 >>> 1)) ^ j5) ^ (j5 << 5))) ^ (j6 >>> 59);
        long j10 = j9 >>> 3;
        jArr2[0] = (((j7 ^ j10) ^ (j10 << 2)) ^ (j10 << 3)) ^ (j10 << 8);
        jArr2[1] = (j10 >>> 56) ^ j8;
        jArr2[2] = 7 & j9;
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0Oo(OooO0O02, jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(5);
        OooO0O0(jArr, OooO00o2);
        OooO0Oo(OooO00o2, jArr2);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = AbstractC6163iLIl1.m17097OooO00o();
        long OooO0O02 = LlliII.OooO0O0(jArr[0]);
        long OooO0O03 = LlliII.OooO0O0(jArr[1]);
        OooO00o2[0] = (OooO0O02 >>> 32) | (OooO0O03 & -4294967296L);
        long OooO0O04 = LlliII.OooO0O0(jArr[2]);
        long j = OooO0O04 & 4294967295L;
        OooO00o2[1] = OooO0O04 >>> 32;
        OooO0Oo(OooO00o2, f17962OooO00o, jArr2);
        jArr2[0] = jArr2[0] ^ ((OooO0O02 & 4294967295L) | (OooO0O03 << 32));
        jArr2[1] = jArr2[1] ^ j;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC6163iLIl1.m17102OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(5);
        OooO0O0(jArr, OooO00o2);
        OooO0O0(jArr2, OooO00o2, jArr2);
    }
}
