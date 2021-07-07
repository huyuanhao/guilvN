package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiI丨lIi1  reason: invalid class name */
public class LiIlIi1 {
    public static final int OooO00o = 2;

    public static void OooO00o(long[] jArr) {
        jArr[0] = 1;
        jArr[1] = 0;
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16303OooO00o(long[] jArr, long[] jArr2) {
        return ((jArr2[1] ^ jArr[1]) | ((jArr[0] ^ jArr2[0]) | 0)) == 0;
    }

    public static void OooO0O0(long[] jArr) {
        jArr[0] = 2;
        jArr[1] = 0;
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        jArr2[0] = ((j2 >> 63) & 135) ^ (j << 1);
        jArr2[1] = (j >>> 63) | (j2 << 1);
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        int i = 0;
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr2[0];
        long j4 = jArr2[1];
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        while (i < 64) {
            long j8 = -(j & 1);
            j >>>= 1;
            j5 ^= j3 & j8;
            long j9 = (j8 & j4) ^ j7;
            long j10 = -(j2 & 1);
            j2 >>>= 1;
            long j11 = j9 ^ (j3 & j10);
            long j12 = j4 >> 63;
            j4 = (j4 << 1) | (j3 >>> 63);
            j3 = (j3 << 1) ^ (j12 & 135);
            i++;
            j6 ^= j10 & j4;
            j7 = j11;
        }
        jArr3[0] = (((j6 ^ (j6 << 1)) ^ (j6 << 2)) ^ (j6 << 7)) ^ j5;
        jArr3[1] = (((j6 >>> 63) ^ (j6 >>> 62)) ^ (j6 >>> 57)) ^ j7;
    }

    public static void OooO0OO(long[] jArr) {
        jArr[0] = 0;
        jArr[1] = 0;
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 >>> 56;
        jArr2[0] = (j3 << 7) ^ ((((j << 8) ^ j3) ^ (j3 << 1)) ^ (j3 << 2));
        jArr2[1] = (j >>> 56) | (j2 << 8);
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[4];
        LlliII.OooO00o(jArr[0], jArr3, 0);
        LlliII.OooO00o(jArr[1], jArr3, 2);
        long j = jArr3[0];
        long j2 = jArr3[1];
        long j3 = jArr3[2];
        long j4 = jArr3[3];
        long j5 = j3 ^ ((j4 >>> 57) ^ ((j4 >>> 63) ^ (j4 >>> 62)));
        long j6 = j ^ ((((j5 << 1) ^ j5) ^ (j5 << 2)) ^ (j5 << 7));
        jArr2[0] = j6;
        jArr2[1] = (j2 ^ ((((j4 << 1) ^ j4) ^ (j4 << 2)) ^ (j4 << 7))) ^ ((j5 >>> 57) ^ ((j5 >>> 63) ^ (j5 >>> 62)));
    }
}
