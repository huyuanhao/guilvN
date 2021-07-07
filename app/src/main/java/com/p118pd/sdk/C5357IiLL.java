package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IiLL  reason: case insensitive filesystem */
public class C5357IiLL {
    public static final long OooO00o = 576460752303423487L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long[] f15707OooO00o = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};
    public static final long OooO0O0 = -1190112520884487202L;

    public static void OooO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0o0(jArr, jArr2, OooO0O02);
        OooO0OO(jArr3, OooO0O02, jArr3);
    }

    public static int OooO00o(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }

    public static void OooO00o(long[] jArr, int i) {
        int i2 = i + 8;
        long j = jArr[i2];
        long j2 = j >>> 59;
        jArr[i] = ((j2 << 10) ^ (((j2 << 2) ^ j2) ^ (j2 << 5))) ^ jArr[i];
        jArr[i2] = j & 576460752303423487L;
    }

    public static void OooO00o(long[] jArr, int i, long[] jArr2) {
        long[] OooO0O02 = lillilII.OooO0O0();
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

    public static void OooO00o(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            jArr3[i3 + i4] = jArr[i + i4] ^ jArr2[i2 + i4];
        }
    }

    public static void OooO00o(long[] jArr, long j, long[] jArr2, int i) {
        long[] jArr3 = new long[32];
        jArr3[1] = j;
        for (int i2 = 2; i2 < 32; i2 += 2) {
            jArr3[i2] = jArr3[i2 >>> 1] << 1;
            jArr3[i2 + 1] = jArr3[i2] ^ j;
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < 9) {
            long j3 = jArr[i3];
            long j4 = j2 ^ jArr3[((int) j3) & 31];
            int i4 = 60;
            long j5 = 0;
            do {
                long j6 = jArr3[((int) (j3 >>> i4)) & 31];
                j4 ^= j6 << i4;
                j5 ^= j6 >>> (-i4);
                i4 -= 5;
            } while (i4 > 0);
            for (int i5 = 0; i5 < 4; i5++) {
                j3 = (j3 & OooO0O0) >>> 1;
                j5 ^= ((j << i5) >> 63) & j3;
            }
            int i6 = i + i3;
            jArr2[i6] = j4 ^ jArr2[i6];
            i3++;
            j2 = j5;
        }
        int i7 = i + 9;
        jArr2[i7] = jArr2[i7] ^ j2;
    }

    public static void OooO00o(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i = 1; i < 9; i++) {
            jArr2[i] = jArr[i];
        }
    }

    public static void OooO00o(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static long[] OooO00o(BigInteger bigInteger) {
        long[] OooO00o2 = lillilII.OooO00o(bigInteger);
        OooO00o(OooO00o2, 0);
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m15594OooO00o(long[] jArr) {
        long[] jArr2 = new long[288];
        int i = 0;
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i2 = 7;
        while (i2 > 0) {
            int i3 = i + 18;
            C1iiIiI.OooO00o(9, jArr2, i3 >>> 1, 0, jArr2, i3);
            OooO00o(jArr2, i3);
            OooO00o(jArr2, 9, jArr2, i3, jArr2, i3 + 9);
            i2--;
            i = i3;
        }
        C1iiIiI.OooO00o(144, jArr2, 0, 4, 0, jArr2, 144);
        return jArr2;
    }

    public static void OooO0O0(long[] jArr, int i, long[] jArr2, int i2, long[] jArr3, int i3) {
        for (int i4 = 0; i4 < 9; i4++) {
            int i5 = i3 + i4;
            jArr3[i5] = jArr3[i5] ^ (jArr[i + i4] ^ jArr2[i2 + i4]);
        }
    }

    public static void OooO0O0(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 9; i++) {
            LlliII.OooO00o(jArr[i], jArr2, i << 1);
        }
    }

    public static void OooO0O0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 9; i++) {
            jArr3[i] = jArr3[i] ^ (jArr[i] ^ jArr2[i]);
        }
    }

    public static void OooO0OO(long[] jArr, long[] jArr2) {
        if (!lillilII.OooO0O0(jArr)) {
            long[] OooO00o2 = lillilII.OooO00o();
            long[] OooO00o3 = lillilII.OooO00o();
            long[] OooO00o4 = lillilII.OooO00o();
            OooO0o(jArr, OooO00o4);
            OooO0o(OooO00o4, OooO00o2);
            OooO0o(OooO00o2, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 2, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO0o(OooO00o2, OooO00o4, OooO00o2);
            OooO00o(OooO00o2, 5, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 5, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 15, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o4);
            OooO00o(OooO00o4, 30, OooO00o2);
            OooO00o(OooO00o2, 30, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 60, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 60, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o2, 180, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO00o(OooO00o3, 180, OooO00o3);
            OooO0o(OooO00o2, OooO00o3, OooO00o2);
            OooO0o(OooO00o2, OooO00o4, jArr2);
            return;
        }
        throw new IllegalStateException();
    }

    public static void OooO0OO(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 18; i++) {
            jArr3[i] = jArr[i] ^ jArr2[i];
        }
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2) {
        long j = jArr[9];
        long j2 = jArr[17];
        long j3 = (((j ^ (j2 >>> 59)) ^ (j2 >>> 57)) ^ (j2 >>> 54)) ^ (j2 >>> 49);
        long j4 = (j2 << 15) ^ (((jArr[8] ^ (j2 << 5)) ^ (j2 << 7)) ^ (j2 << 10));
        for (int i = 16; i >= 10; i--) {
            long j5 = jArr[i];
            jArr2[i - 8] = (((j4 ^ (j5 >>> 59)) ^ (j5 >>> 57)) ^ (j5 >>> 54)) ^ (j5 >>> 49);
            j4 = (((jArr[i - 9] ^ (j5 << 5)) ^ (j5 << 7)) ^ (j5 << 10)) ^ (j5 << 15);
        }
        jArr2[1] = (((j4 ^ (j3 >>> 59)) ^ (j3 >>> 57)) ^ (j3 >>> 54)) ^ (j3 >>> 49);
        long j6 = (j3 << 15) ^ (((jArr[0] ^ (j3 << 5)) ^ (j3 << 7)) ^ (j3 << 10));
        long j7 = jArr2[8];
        long j8 = j7 >>> 59;
        jArr2[0] = (((j6 ^ j8) ^ (j8 << 2)) ^ (j8 << 5)) ^ (j8 << 10);
        jArr2[8] = 576460752303423487L & j7;
    }

    public static void OooO0Oo(long[] jArr, long[] jArr2, long[] jArr3) {
        OooO0o0(jArr, m15594OooO00o(jArr2), jArr3);
    }

    public static void OooO0o(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0Oo(OooO0O02, jArr2);
    }

    public static void OooO0o(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0Oo(jArr, jArr2, OooO0O02);
        OooO0Oo(OooO0O02, jArr3);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2) {
        long[] OooO00o2 = lillilII.OooO00o();
        long[] OooO00o3 = lillilII.OooO00o();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = i + 1;
            long OooO0O02 = LlliII.OooO0O0(jArr[i]);
            i = i3 + 1;
            long OooO0O03 = LlliII.OooO0O0(jArr[i3]);
            OooO00o2[i2] = (4294967295L & OooO0O02) | (OooO0O03 << 32);
            OooO00o3[i2] = (OooO0O02 >>> 32) | (-4294967296L & OooO0O03);
        }
        long OooO0O04 = LlliII.OooO0O0(jArr[i]);
        OooO00o2[4] = 4294967295L & OooO0O04;
        OooO00o3[4] = OooO0O04 >>> 32;
        OooO0o(OooO00o3, f15707OooO00o, jArr2);
        OooO00o(jArr2, OooO00o2, jArr2);
    }

    public static void OooO0o0(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 56; i >= 0; i -= 8) {
            for (int i2 = 1; i2 < 9; i2 += 2) {
                int i3 = (int) (jArr[i2] >>> i);
                OooO0O0(jArr2, (i3 & 15) * 9, jArr2, (((i3 >>> 4) & 15) + 16) * 9, jArr3, i2 - 1);
            }
            C1iiIiI.OooO00o(16, jArr3, 0, 8, 0);
        }
        for (int i4 = 56; i4 >= 0; i4 -= 8) {
            for (int i5 = 0; i5 < 9; i5 += 2) {
                int i6 = (int) (jArr[i5] >>> i4);
                OooO0O0(jArr2, (i6 & 15) * 9, jArr2, (((i6 >>> 4) & 15) + 16) * 9, jArr3, i5);
            }
            if (i4 > 0) {
                C1iiIiI.OooO00o(18, jArr3, 0, 8, 0);
            }
        }
    }

    public static void OooO0oO(long[] jArr, long[] jArr2) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0O0(jArr, OooO0O02);
        OooO0OO(jArr2, OooO0O02, jArr2);
    }

    public static void OooO0oO(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0Oo(jArr, jArr2, OooO0O02);
        OooO0OO(jArr3, OooO0O02, jArr3);
    }

    public static void OooO0oo(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] OooO0O02 = lillilII.OooO0O0();
        OooO0o0(jArr, jArr2, OooO0O02);
        OooO0Oo(OooO0O02, jArr3);
    }
}
