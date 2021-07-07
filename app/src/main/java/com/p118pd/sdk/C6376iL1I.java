package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨L1I  reason: invalid class name and case insensitive filesystem */
public class C6376iL1I {
    public static final int OooO00o = 8;

    public static void OooO00o(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
        jArr2[7] = jArr[7];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17489OooO00o(long[] jArr, long[] jArr2) {
        return ((jArr2[7] ^ jArr[7]) | ((((((((jArr[0] ^ jArr2[0]) | 0) | (jArr[1] ^ jArr2[1])) | (jArr[2] ^ jArr2[2])) | (jArr[3] ^ jArr2[3])) | (jArr[4] ^ jArr2[4])) | (jArr[5] ^ jArr2[5])) | (jArr[6] ^ jArr2[6]))) == 0;
    }

    public static void OooO0O0(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        jArr2[0] = (j << 1) ^ ((j8 >> 63) & 293);
        jArr2[1] = (j2 << 1) | (j >>> 63);
        jArr2[2] = (j3 << 1) | (j2 >>> 63);
        jArr2[3] = (j4 << 1) | (j3 >>> 63);
        jArr2[4] = (j5 << 1) | (j4 >>> 63);
        jArr2[5] = (j6 << 1) | (j5 >>> 63);
        jArr2[6] = (j7 << 1) | (j6 >>> 63);
        jArr2[7] = (j8 << 1) | (j7 >>> 63);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j = jArr2[0];
        long j2 = jArr2[1];
        long j3 = jArr2[2];
        long j4 = jArr2[3];
        long j5 = jArr2[4];
        long j6 = jArr2[5];
        long j7 = jArr2[6];
        long j8 = jArr2[7];
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        int i2 = 0;
        while (i2 < 8) {
            long j18 = jArr[i2];
            long j19 = jArr[i2 + 1];
            long j20 = j7;
            j7 = j6;
            j6 = j5;
            j5 = j4;
            j4 = j3;
            long j21 = j2;
            while (i < 64) {
                long j22 = -(j18 & 1);
                j18 >>>= 1;
                j9 ^= j & j22;
                long j23 = -(j19 & 1);
                j19 >>>= 1;
                j11 = (j11 ^ (j21 & j22)) ^ (j & j23);
                j12 = (j12 ^ (j4 & j22)) ^ (j21 & j23);
                j13 = (j13 ^ (j5 & j22)) ^ (j4 & j23);
                j14 = (j14 ^ (j6 & j22)) ^ (j5 & j23);
                j15 = (j15 ^ (j7 & j22)) ^ (j6 & j23);
                j16 = (j16 ^ (j20 & j22)) ^ (j7 & j23);
                j17 = (j17 ^ (j8 & j22)) ^ (j20 & j23);
                j10 ^= j8 & j23;
                long j24 = j8 >> 63;
                j8 = (j8 << 1) | (j20 >>> 63);
                j20 = (j20 << 1) | (j7 >>> 63);
                j7 = (j7 << 1) | (j6 >>> 63);
                j6 = (j6 << 1) | (j5 >>> 63);
                j5 = (j5 << 1) | (j4 >>> 63);
                j = (j << 1) ^ (j24 & 293);
                i++;
                j21 = (j21 << 1) | (j >>> 63);
                j4 = (j4 << 1) | (j21 >>> 63);
            }
            long j25 = ((j ^ (j8 >>> 62)) ^ (j8 >>> 59)) ^ (j8 >>> 56);
            i2 += 2;
            j8 = j20;
            i = 0;
            j2 = j25;
            j = ((j8 ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 8);
            j3 = j21;
        }
        jArr3[0] = j9 ^ (((j10 ^ (j10 << 2)) ^ (j10 << 5)) ^ (j10 << 8));
        jArr3[1] = j11 ^ (((j10 >>> 62) ^ (j10 >>> 59)) ^ (j10 >>> 56));
        jArr3[2] = j12;
        jArr3[3] = j13;
        jArr3[4] = j14;
        jArr3[5] = j15;
        jArr3[6] = j16;
        jArr3[7] = j17;
    }

    public static void OooO0OO(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
        jArr[2] = 0;
        jArr[3] = 0;
        jArr[4] = 0;
        jArr[5] = 0;
        jArr[6] = 0;
        jArr[7] = 0;
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = j8 >>> 56;
        jArr2[0] = ((((j << 8) ^ j9) ^ (j9 << 2)) ^ (j9 << 5)) ^ (j9 << 8);
        jArr2[1] = (j2 << 8) | (j >>> 56);
        jArr2[2] = (j3 << 8) | (j2 >>> 56);
        jArr2[3] = (j4 << 8) | (j3 >>> 56);
        jArr2[4] = (j5 << 8) | (j4 >>> 56);
        jArr2[5] = (j6 << 8) | (j5 >>> 56);
        jArr2[6] = (j7 << 8) | (j6 >>> 56);
        jArr2[7] = (j8 << 8) | (j7 >>> 56);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        int i = 16;
        long[] jArr3 = new long[16];
        for (int i2 = 0; i2 < 8; i2++) {
            LlliII.OooO00o(jArr[i2], jArr3, i2 << 1);
        }
        while (true) {
            i--;
            if (i >= 8) {
                long j = jArr3[i];
                int i3 = i - 8;
                jArr3[i3] = jArr3[i3] ^ ((((j << 2) ^ j) ^ (j << 5)) ^ (j << 8));
                int i4 = i3 + 1;
                jArr3[i4] = ((j >>> 56) ^ ((j >>> 62) ^ (j >>> 59))) ^ jArr3[i4];
            } else {
                OooO00o(jArr3, jArr2);
                return;
            }
        }
    }
}
