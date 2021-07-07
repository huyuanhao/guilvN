package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨I丨Ll丨  reason: invalid class name and case insensitive filesystem */
public class C9444ILl {
    public static final int OooO00o = Integer.MAX_VALUE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f22991OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f22992OooO00o = {-1, -1, 0, -1, -1, -1, -1, -2};
    public static final int OooO0O0 = Integer.MAX_VALUE;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f22993OooO0O0 = {1, 0, -2, 1, 1, -2, 0, 2, -2, -3, 3, -2, -1, -1, 0, -2};

    public static void OooO00o(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = (((long) iArr[0]) & 4294967295L) + j2 + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                j4 = j5 >> 32;
            }
            long j6 = j4 + ((((long) iArr[2]) & 4294967295L) - j2);
            iArr[2] = (int) j6;
            long j7 = (j6 >> 32) + (((long) iArr[3]) & 4294967295L) + j2;
            iArr[3] = (int) j7;
            long j8 = j7 >> 32;
            if (j8 != 0) {
                long j9 = j8 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j9;
                long j10 = (j9 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j10;
                long j11 = (j10 >> 32) + (((long) iArr[6]) & 4294967295L);
                iArr[6] = (int) j11;
                j8 = j11 >> 32;
            }
            long j12 = j8 + (4294967295L & ((long) iArr[7])) + j2;
            iArr[7] = (int) j12;
            j = j12 >> 32;
        } else {
            j = 0;
        }
        if (j != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && C1LLlIL.m21852OooO0O0(iArr, f22992OooO00o))) {
            OooO00o(iArr);
        }
    }

    public static void OooO00o(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + ((((long) iArr[2]) & 4294967295L) - 1);
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + (((long) iArr[3]) & 4294967295L) + 1;
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + (4294967295L & ((long) iArr[7])) + 1);
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21851OooO0O0(iArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, iArr2);
            i--;
            if (i > 0) {
                C1LLlIL.m21851OooO0O0(iArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0OO(8, iArr, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C1LLlIL.m21852OooO0O0(iArr2, f22992OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO00o(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= Integer.MAX_VALUE && C1LLlIL.m21852OooO0O0(iArr3, f22992OooO00o))) {
            OooO00o(iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = C1LLlIL.OooO00o(bigInteger);
        if ((OooO00o2[7] >>> 1) >= Integer.MAX_VALUE && C1LLlIL.m21852OooO0O0(OooO00o2, f22992OooO00o)) {
            C1LLlIL.OooO0O0(f22992OooO00o, OooO00o2);
        }
        return OooO00o2;
    }

    public static void OooO0O0(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            j2 = j3 >> 32;
        }
        long j4 = j2 + (((long) iArr[2]) & 4294967295L) + 1;
        iArr[2] = (int) j4;
        long j5 = (j4 >> 32) + ((((long) iArr[3]) & 4294967295L) - 1);
        iArr[3] = (int) j5;
        long j6 = j5 >> 32;
        if (j6 != 0) {
            long j7 = j6 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j7;
            long j8 = (j7 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j8;
            long j9 = (j8 >> 32) + (((long) iArr[6]) & 4294967295L);
            iArr[6] = (int) j9;
            j6 = j9 >> 32;
        }
        iArr[7] = (int) (j6 + ((4294967295L & ((long) iArr[7])) - 1));
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(8, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(8, iArr2, C1LLlIL.OooO00o(iArr, f22992OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO00o(16, iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && C1iiIiI.m21329OooO0O0(16, iArr3, f22993OooO0O0))) {
            C1iiIiI.OooO0Oo(16, f22993OooO0O0, iArr3);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (C1LLlIL.OooO0O0(iArr)) {
            C1LLlIL.m21837OooO00o(iArr2);
        } else {
            C1LLlIL.OooO0Oo(f22992OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21841OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[8]) & 4294967295L;
        long j2 = ((long) iArr[9]) & 4294967295L;
        long j3 = ((long) iArr[10]) & 4294967295L;
        long j4 = ((long) iArr[11]) & 4294967295L;
        long j5 = ((long) iArr[12]) & 4294967295L;
        long j6 = ((long) iArr[13]) & 4294967295L;
        long j7 = ((long) iArr[14]) & 4294967295L;
        long j8 = ((long) iArr[15]) & 4294967295L;
        long j9 = j3 + j4;
        long j10 = j6 + j7;
        long j11 = j10 + (j8 << 1);
        long j12 = j + j2 + j10;
        long j13 = j9 + j5 + j8 + j12;
        long j14 = (((long) iArr[0]) & 4294967295L) + j13 + j6 + j7 + j8 + 0;
        iArr2[0] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr[1]) & 4294967295L) + j13) - j) + j7 + j8;
        iArr2[1] = (int) j15;
        long j16 = (j15 >> 32) + ((((long) iArr[2]) & 4294967295L) - j12);
        iArr2[2] = (int) j16;
        long j17 = (j16 >> 32) + ((((((long) iArr[3]) & 4294967295L) + j13) - j2) - j3) + j6;
        iArr2[3] = (int) j17;
        long j18 = (j17 >> 32) + ((((((long) iArr[4]) & 4294967295L) + j13) - j9) - j) + j7;
        iArr2[4] = (int) j18;
        long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L) + j11 + j3;
        iArr2[5] = (int) j19;
        long j20 = (j19 >> 32) + (((long) iArr[6]) & 4294967295L) + j4 + j7 + j8;
        iArr2[6] = (int) j20;
        long j21 = (j20 >> 32) + (4294967295L & ((long) iArr[7])) + j13 + j11 + j5;
        iArr2[7] = (int) j21;
        OooO00o((int) (j21 >> 32), iArr2);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO0OO(iArr, iArr2, iArr3) != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && C1iiIiI.m21329OooO0O0(16, iArr3, f22993OooO0O0))) {
            C1iiIiI.OooO0Oo(16, f22993OooO0O0, iArr3);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(8, iArr, 0, iArr2) != 0 || ((iArr2[7] >>> 1) >= Integer.MAX_VALUE && C1LLlIL.m21852OooO0O0(iArr2, f22992OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(16, iArr, iArr2, iArr3) != 0) {
            C1iiIiI.OooO00o(16, f22993OooO0O0, iArr3);
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21851OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            OooO0O0(iArr3);
        }
    }
}
