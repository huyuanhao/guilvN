package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.iL丨I  reason: invalid class name and case insensitive filesystem */
public class C6201iLI {
    public static final long OooO00o = 33554431;
    public static final long OooO0O0 = 576460752303423487L;

    public static int OooO00o(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17181OooO00o(long[] jArr) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = jArr[9];
        long j11 = jArr[10];
        long j12 = jArr[11];
        long j13 = jArr[12];
        long j14 = jArr[13];
        jArr[0] = j ^ (j2 << 59);
        jArr[1] = (j2 >>> 5) ^ (j3 << 54);
        jArr[2] = (j3 >>> 10) ^ (j4 << 49);
        jArr[3] = (j4 >>> 15) ^ (j5 << 44);
        jArr[4] = (j5 >>> 20) ^ (j6 << 39);
        jArr[5] = (j6 >>> 25) ^ (j7 << 34);
        jArr[6] = (j7 >>> 30) ^ (j8 << 29);
        jArr[7] = (j8 >>> 35) ^ (j9 << 24);
        jArr[8] = (j9 >>> 40) ^ (j10 << 19);
        jArr[9] = (j10 >>> 45) ^ (j11 << 14);
        jArr[10] = (j11 >>> 50) ^ (j12 << 9);
        jArr[11] = ((j12 >>> 55) ^ (j13 << 4)) ^ (j14 << 63);
        jArr[12] = (j13 >>> 60) ^ (j14 >>> 1);
        jArr[13] = 0;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 6;
        long j = jArr[i2];
        long j2 = j >>> 25;
        jArr[i] = jArr[i] ^ j2;
        int i3 = i + 1;
        jArr[i3] = (j2 << 23) ^ jArr[i3];
        jArr[i2] = j & OooO00o;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(13);
        OooO0OO(jArr, OooO00o2);
        while (true) {
            OooO0o0(OooO00o2, jArr2);
            i--;
            if (i > 0) {
                OooO0OO(jArr2, OooO00o2);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[8];
        jArr3[1] = j;
        jArr3[2] = jArr3[1] << 1;
        jArr3[3] = jArr3[2] ^ j;
        jArr3[4] = jArr3[2] << 1;
        jArr3[5] = jArr3[4] ^ j;
        jArr3[6] = jArr3[3] << 1;
        jArr3[7] = jArr3[6] ^ j;
        for (int i2 = 0; i2 < 7; i2++) {
            long j2 = jArr[i2];
            int i3 = (int) j2;
            long j3 = 0;
            long j4 = jArr3[i3 & 7] ^ (jArr3[(i3 >>> 3) & 7] << 3);
            int i4 = 54;
            do {
                int i5 = (int) (j2 >>> i4);
                long j5 = (jArr3[(i5 >>> 3) & 7] << 3) ^ jArr3[i5 & 7];
                j4 ^= j5 << i4;
                j3 ^= j5 >>> (-i4);
                i4 -= 6;
            } while (i4 > 0);
            int i6 = i + i2;
            jArr2[i6] = jArr2[i6] ^ (576460752303423487L & j4);
            int i7 = i6 + 1;
            jArr2[i7] = jArr2[i7] ^ ((j3 << 5) ^ (j4 >>> 59));
        }
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = i1ILii.OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        jArr2[0] = j & 576460752303423487L;
        jArr2[1] = ((j >>> 59) ^ (j2 << 5)) & 576460752303423487L;
        jArr2[2] = ((j2 >>> 54) ^ (j3 << 10)) & 576460752303423487L;
        jArr2[3] = ((j3 >>> 49) ^ (j4 << 15)) & 576460752303423487L;
        jArr2[4] = ((j4 >>> 44) ^ (j5 << 20)) & 576460752303423487L;
        jArr2[5] = ((j5 >>> 39) ^ (j6 << 25)) & 576460752303423487L;
        jArr2[6] = (j6 >>> 34) ^ (j7 << 30);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 13; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 6; i++) {
            LlliII.OooO00o(jArr[i], jArr2, i << 1);
        }
        jArr2[12] = LlliII.m16402OooO00o((int) jArr[6]);
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        OooO0O0(jArr, jArr4);
        OooO0O0(jArr2, jArr5);
        for (int i = 0; i < 7; i++) {
            OooO00o(jArr4, jArr5[i], jArr3, i);
        }
        m17181OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        if (!i1ILii.OooO0O0(jArr)) {
            long[] OooO00o2 = i1ILii.OooO00o();
            long[] OooO00o3 = i1ILii.OooO00o();
            long[] OooO00o4 = i1ILii.OooO00o();
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
            OooO0Oo(OooO00o2, OooO00o3, OooO00o4);
            OooO00o(OooO00o4, 24, OooO00o2);
            OooO00o(OooO00o2, 24, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 48, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 96, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 192, OooO00o3);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o4, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = i1ILii.OooO0O0();
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
        long j3 = (OooO0O04 & 4294967295L) | (OooO0O05 << 32);
        long j4 = (OooO0O04 >>> 32) | (OooO0O05 & -4294967296L);
        long OooO0O06 = LlliII.OooO0O0(jArr[4]);
        long OooO0O07 = LlliII.OooO0O0(jArr[5]);
        long j5 = (OooO0O06 >>> 32) | (OooO0O07 & -4294967296L);
        long OooO0O08 = LlliII.OooO0O0(jArr[6]);
        long j6 = OooO0O08 & 4294967295L;
        long j7 = OooO0O08 >>> 32;
        jArr2[0] = j ^ (j2 << 44);
        jArr2[1] = (j3 ^ (j4 << 44)) ^ (j2 >>> 20);
        jArr2[2] = (((OooO0O06 & 4294967295L) | (OooO0O07 << 32)) ^ (j5 << 44)) ^ (j4 >>> 20);
        jArr2[3] = (((j7 << 44) ^ j6) ^ (j5 >>> 20)) ^ (j2 << 13);
        jArr2[4] = (j2 >>> 51) ^ ((j7 >>> 20) ^ (j4 << 13));
        jArr2[5] = (j5 << 13) ^ (j4 >>> 51);
        jArr2[6] = (j7 << 13) ^ (j5 >>> 51);
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
        long j9 = jArr[12];
        long j10 = j7 ^ ((j9 >>> 25) ^ (j9 << 62));
        long j11 = j8 ^ (j9 >>> 2);
        long j12 = jArr[11];
        long j13 = j5 ^ (j12 << 39);
        long j14 = (j6 ^ (j9 << 39)) ^ ((j12 >>> 25) ^ (j12 << 62));
        long j15 = j10 ^ (j12 >>> 2);
        long j16 = jArr[10];
        long j17 = j4 ^ (j16 << 39);
        long j18 = j13 ^ ((j16 >>> 25) ^ (j16 << 62));
        long j19 = j14 ^ (j16 >>> 2);
        long j20 = jArr[9];
        long j21 = j3 ^ (j20 << 39);
        long j22 = j17 ^ ((j20 >>> 25) ^ (j20 << 62));
        long j23 = j18 ^ (j20 >>> 2);
        long j24 = jArr[8];
        long j25 = j ^ (j11 << 39);
        long j26 = (j21 ^ ((j24 >>> 25) ^ (j24 << 62))) ^ (j11 >>> 2);
        long j27 = j15 >>> 25;
        jArr2[0] = j25 ^ j27;
        long j28 = j27 << 23;
        jArr2[1] = j28 ^ ((j2 ^ (j24 << 39)) ^ ((j11 >>> 25) ^ (j11 << 62)));
        jArr2[2] = j26;
        jArr2[3] = j22 ^ (j24 >>> 2);
        jArr2[4] = j23;
        jArr2[5] = j19;
        jArr2[6] = j15 & OooO00o;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = i1ILii.OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(13);
        OooO0OO(jArr, OooO00o2);
        OooO0o0(OooO00o2, jArr2);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(13);
        OooO0OO(jArr, OooO00o2);
        OooO0O0(jArr2, OooO00o2, jArr2);
    }
}
