package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LlliII */
public class LlliII {
    public static final long OooO00o = 1431655765;
    public static final long OooO0O0 = 6148914691236517205L;
    public static final long OooO0OO = -6148914691236517206L;

    public static int OooO00o(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m16402OooO00o(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        int i9 = i7 ^ (i8 ^ (i8 << 1));
        return ((((long) (i9 >>> 1)) & OooO00o) << 32) | (OooO00o & ((long) i9));
    }

    public static long OooO00o(long j) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        return j9 ^ (j10 ^ (j10 << 1));
    }

    public static void OooO00o(long j, long[] jArr, int i) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & OooO0O0;
        jArr[i + 1] = (j11 >>> 1) & OooO0O0;
    }

    public static int OooO0O0(int i) {
        int i2 = i & 255;
        int i3 = (i2 | (i2 << 4)) & 3855;
        int i4 = (i3 | (i3 << 2)) & 13107;
        return (i4 | (i4 << 1)) & 21845;
    }

    public static long OooO0O0(long j) {
        long j2 = ((j >>> 1) ^ j) & 2459565876494606882L;
        long j3 = j ^ (j2 ^ (j2 << 1));
        long j4 = ((j3 >>> 2) ^ j3) & 868082074056920076L;
        long j5 = j3 ^ (j4 ^ (j4 << 2));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 8) ^ j7) & 280375465148160L;
        long j9 = j7 ^ (j8 ^ (j8 << 8));
        long j10 = ((j9 >>> 16) ^ j9) & 4294901760L;
        return j9 ^ (j10 ^ (j10 << 16));
    }

    public static void OooO0O0(long j, long[] jArr, int i) {
        long j2 = ((j >>> 16) ^ j) & 4294901760L;
        long j3 = j ^ (j2 ^ (j2 << 16));
        long j4 = ((j3 >>> 8) ^ j3) & 280375465148160L;
        long j5 = j3 ^ (j4 ^ (j4 << 8));
        long j6 = ((j5 >>> 4) ^ j5) & 67555025218437360L;
        long j7 = j5 ^ (j6 ^ (j6 << 4));
        long j8 = ((j7 >>> 2) ^ j7) & 868082074056920076L;
        long j9 = j7 ^ (j8 ^ (j8 << 2));
        long j10 = ((j9 >>> 1) ^ j9) & 2459565876494606882L;
        long j11 = j9 ^ (j10 ^ (j10 << 1));
        jArr[i] = j11 & OooO0OO;
        jArr[i + 1] = (j11 << 1) & OooO0OO;
    }

    public static int OooO0OO(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 2) ^ i5) & 202116108;
        int i7 = i5 ^ (i6 ^ (i6 << 2));
        int i8 = ((i7 >>> 1) ^ i7) & 572662306;
        return i7 ^ (i8 ^ (i8 << 1));
    }

    public static int OooO0Oo(int i) {
        int i2 = ((i >>> 7) ^ i) & 11141290;
        int i3 = i ^ (i2 ^ (i2 << 7));
        int i4 = ((i3 >>> 14) ^ i3) & 52428;
        int i5 = i3 ^ (i4 ^ (i4 << 14));
        int i6 = ((i5 >>> 4) ^ i5) & 15728880;
        int i7 = i5 ^ (i6 ^ (i6 << 4));
        int i8 = ((i7 >>> 8) ^ i7) & 65280;
        return i7 ^ (i8 ^ (i8 << 8));
    }

    public static int OooO0o(int i) {
        int i2 = ((i >>> 8) ^ i) & 65280;
        int i3 = i ^ (i2 ^ (i2 << 8));
        int i4 = ((i3 >>> 4) ^ i3) & 15728880;
        int i5 = i3 ^ (i4 ^ (i4 << 4));
        int i6 = ((i5 >>> 14) ^ i5) & 52428;
        int i7 = i5 ^ (i6 ^ (i6 << 14));
        int i8 = ((i7 >>> 7) ^ i7) & 11141290;
        return i7 ^ (i8 ^ (i8 << 7));
    }

    public static int OooO0o0(int i) {
        int i2 = ((i >>> 1) ^ i) & 572662306;
        int i3 = i ^ (i2 ^ (i2 << 1));
        int i4 = ((i3 >>> 2) ^ i3) & 202116108;
        int i5 = i3 ^ (i4 ^ (i4 << 2));
        int i6 = ((i5 >>> 4) ^ i5) & 15728880;
        int i7 = i5 ^ (i6 ^ (i6 << 4));
        int i8 = ((i7 >>> 8) ^ i7) & 65280;
        return i7 ^ (i8 ^ (i8 << 8));
    }
}
