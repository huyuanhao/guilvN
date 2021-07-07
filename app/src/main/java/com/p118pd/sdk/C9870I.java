package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨丨I  reason: invalid class name and case insensitive filesystem */
public class C9870I {
    public static final long OooO00o = 134217727;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f23484OooO00o = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};
    public static final long OooO0O0 = 144115188075855871L;

    public static int OooO00o(long[] jArr) {
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
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

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21959OooO00o(long[] jArr) {
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
        jArr[0] = j ^ (j2 << 57);
        jArr[1] = (j2 >>> 7) ^ (j3 << 50);
        jArr[2] = (j3 >>> 14) ^ (j4 << 43);
        jArr[3] = (j4 >>> 21) ^ (j5 << 36);
        jArr[4] = (j5 >>> 28) ^ (j6 << 29);
        jArr[5] = (j6 >>> 35) ^ (j7 << 22);
        jArr[6] = (j7 >>> 42) ^ (j8 << 15);
        jArr[7] = (j8 >>> 49) ^ (j9 << 8);
        jArr[8] = (j9 >>> 56) ^ (j10 << 1);
        jArr[9] = j10 >>> 63;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 4;
        long j = jArr[i2];
        long j2 = j >>> 27;
        jArr[i] = ((j2 << 12) ^ (((j2 << 5) ^ j2) ^ (j2 << 7))) ^ jArr[i];
        jArr[i2] = j & OooO00o;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(9);
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

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            LlliII.OooO00o(jArr[i], jArr2, i << 1);
        }
        jArr2[8] = LlliII.m16402OooO00o((int) jArr[4]);
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        OooO0O0(jArr, jArr4);
        OooO0O0(jArr2, jArr5);
        long[] jArr6 = new long[26];
        OooO00o(jArr4[0], jArr5[0], jArr6, 0);
        OooO00o(jArr4[1], jArr5[1], jArr6, 2);
        OooO00o(jArr4[2], jArr5[2], jArr6, 4);
        OooO00o(jArr4[3], jArr5[3], jArr6, 6);
        OooO00o(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0] ^ jArr4[1];
        long j2 = jArr5[0] ^ jArr5[1];
        long j3 = jArr4[0] ^ jArr4[2];
        long j4 = jArr5[0] ^ jArr5[2];
        long j5 = jArr4[2] ^ jArr4[4];
        long j6 = jArr5[2] ^ jArr5[4];
        long j7 = jArr4[3] ^ jArr4[4];
        long j8 = jArr5[3] ^ jArr5[4];
        OooO00o(j3 ^ jArr4[3], j4 ^ jArr5[3], jArr6, 18);
        OooO00o(j5 ^ jArr4[1], j6 ^ jArr5[1], jArr6, 20);
        long j9 = j ^ j7;
        long j10 = j2 ^ j8;
        OooO00o(j9, j10, jArr6, 22);
        OooO00o(j9 ^ jArr4[2], jArr5[2] ^ j10, jArr6, 24);
        OooO00o(j, j2, jArr6, 10);
        OooO00o(j3, j4, jArr6, 12);
        OooO00o(j5, j6, jArr6, 14);
        OooO00o(j7, j8, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j11 = jArr6[0] ^ jArr6[1];
        long j12 = jArr6[2] ^ j11;
        long j13 = jArr6[10] ^ j12;
        jArr3[1] = j13;
        long j14 = jArr6[3] ^ jArr6[4];
        long j15 = j12 ^ (j14 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j15;
        long j16 = jArr6[5] ^ jArr6[6];
        long j17 = ((j11 ^ j14) ^ j16) ^ jArr6[8];
        long j18 = jArr6[13] ^ jArr6[14];
        jArr3[3] = (j17 ^ j18) ^ ((jArr6[18] ^ jArr6[22]) ^ jArr6[24]);
        long j19 = (jArr6[7] ^ jArr6[8]) ^ jArr6[9];
        long j20 = j19 ^ jArr6[17];
        jArr3[8] = j20;
        long j21 = (j19 ^ j16) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j21;
        long j22 = j13 ^ j21;
        long j23 = (jArr6[19] ^ jArr6[20]) ^ (jArr6[25] ^ jArr6[24]);
        jArr3[4] = (j23 ^ (jArr6[18] ^ jArr6[23])) ^ j22;
        jArr3[5] = ((j15 ^ j20) ^ j23) ^ (jArr6[21] ^ jArr6[22]);
        jArr3[6] = ((((jArr6[9] ^ (j17 ^ jArr6[0])) ^ j18) ^ jArr6[21]) ^ jArr6[23]) ^ jArr6[25];
        m21959OooO00o(jArr3);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        if (!AbstractC9759ILlI.OooO0O0(jArr)) {
            long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
            long[] OooO00o3 = AbstractC9759ILlI.OooO00o();
            OooO0oO(jArr, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 2, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO00o(OooO00o3, 4, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 8, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0oO(OooO00o3, OooO00o3);
            OooO0Oo(OooO00o3, jArr, OooO00o3);
            OooO00o(OooO00o3, 17, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0oO(OooO00o2, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 35, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO00o(OooO00o3, 70, OooO00o2);
            OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
            OooO0oO(OooO00o2, OooO00o2);
            OooO0Oo(OooO00o2, jArr, OooO00o2);
            OooO00o(OooO00o2, 141, OooO00o3);
            OooO0Oo(OooO00o3, OooO00o2, OooO00o3);
            OooO0oO(OooO00o3, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC9759ILlI.OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0o0(OooO0O02, jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = AbstractC9759ILlI.OooO00o();
        long OooO0O02 = LlliII.OooO0O0(jArr[0]);
        long OooO0O03 = LlliII.OooO0O0(jArr[1]);
        long j = (OooO0O02 & 4294967295L) | (OooO0O03 << 32);
        OooO00o2[0] = (OooO0O02 >>> 32) | (OooO0O03 & -4294967296L);
        long OooO0O04 = LlliII.OooO0O0(jArr[2]);
        long OooO0O05 = LlliII.OooO0O0(jArr[3]);
        OooO00o2[1] = (OooO0O04 >>> 32) | (-4294967296L & OooO0O05);
        long OooO0O06 = LlliII.OooO0O0(jArr[4]);
        OooO00o2[2] = OooO0O06 >>> 32;
        OooO0Oo(OooO00o2, f23484OooO00o, jArr2);
        jArr2[0] = jArr2[0] ^ j;
        jArr2[1] = jArr2[1] ^ ((OooO0O04 & 4294967295L) | (OooO0O05 << 32));
        jArr2[2] = jArr2[2] ^ (4294967295L & OooO0O06);
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
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = OooO00o & j10;
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = AbstractC9759ILlI.OooO0O0();
        OooO0OO(jArr, jArr2, OooO0O02);
        OooO0O0(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(9);
        OooO0OO(jArr, OooO00o2);
        OooO0o0(OooO00o2, jArr2);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = C1iiIiI.m21325OooO00o(9);
        OooO0OO(jArr, OooO00o2);
        OooO0O0(jArr2, OooO00o2, jArr2);
    }
}
