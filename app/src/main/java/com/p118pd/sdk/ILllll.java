package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IL丨l丨lll  reason: invalid class name */
public class ILllll {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f15658OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f15659OooO00o = {1, 0, 0, -1, -1, -1, -1};
    public static final int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f15660OooO0O0 = {1, 0, 0, -2, -1, -1, 0, 2, 0, 0, -2, -1, -1, -1};
    public static final int[] OooO0OO = {-1, -1, -1, 1, 0, 0, -1, -3, -1, -1, 1};

    public static void OooO00o(int i, int[] iArr) {
        long j;
        if (i != 0) {
            long j2 = ((long) i) & 4294967295L;
            long j3 = ((((long) iArr[0]) & 4294967295L) - j2) + 0;
            iArr[0] = (int) j3;
            long j4 = j3 >> 32;
            if (j4 != 0) {
                long j5 = j4 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j5;
                long j6 = (j5 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j6;
                j4 = j6 >> 32;
            }
            long j7 = j4 + (4294967295L & ((long) iArr[3])) + j2;
            iArr[3] = (int) j7;
            j = j7 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C1iiIiI.OooO0O0(7, iArr, 4) != 0) || (iArr[6] == -1 && AbstractC6694lilI.m17790OooO0O0(iArr, f15659OooO00o))) {
            OooO00o(iArr);
        }
    }

    public static void OooO00o(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + (4294967295L & ((long) iArr[3])) + 1;
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            C1iiIiI.OooO0O0(7, iArr, 4);
        }
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO0O02 = AbstractC6694lilI.OooO0O0();
        AbstractC6694lilI.m17789OooO0O0(iArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, iArr2);
            i--;
            if (i > 0) {
                AbstractC6694lilI.m17789OooO0O0(iArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0OO(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && AbstractC6694lilI.m17790OooO0O0(iArr2, f15659OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6694lilI.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && AbstractC6694lilI.m17790OooO0O0(iArr3, f15659OooO00o))) {
            OooO00o(iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = AbstractC6694lilI.OooO00o(bigInteger);
        if (OooO00o2[6] == -1 && AbstractC6694lilI.m17790OooO0O0(OooO00o2, f15659OooO00o)) {
            AbstractC6694lilI.OooO0O0(f15659OooO00o, OooO00o2);
        }
        return OooO00o2;
    }

    public static void OooO0O0(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            long j3 = j2 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j3;
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        long j5 = j2 + ((4294967295L & ((long) iArr[3])) - 1);
        iArr[3] = (int) j5;
        if ((j5 >> 32) != 0) {
            C1iiIiI.OooO00o(7, iArr, 4);
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(7, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(7, iArr2, AbstractC6694lilI.OooO00o(iArr, f15659OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO00o(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && C1iiIiI.m21329OooO0O0(14, iArr3, f15660OooO0O0))) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(14, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (AbstractC6694lilI.OooO0O0(iArr)) {
            AbstractC6694lilI.m17779OooO00o(iArr2);
        } else {
            AbstractC6694lilI.OooO0Oo(f15659OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = AbstractC6694lilI.OooO0O0();
        AbstractC6694lilI.m17783OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[10]) & 4294967295L;
        long j2 = ((long) iArr[11]) & 4294967295L;
        long j3 = ((long) iArr[12]) & 4294967295L;
        long j4 = ((long) iArr[13]) & 4294967295L;
        long j5 = ((((long) iArr[7]) & 4294967295L) + j2) - 1;
        long j6 = (((long) iArr[8]) & 4294967295L) + j3;
        long j7 = (((long) iArr[9]) & 4294967295L) + j4;
        long j8 = ((((long) iArr[0]) & 4294967295L) - j5) + 0;
        long j9 = j8 & 4294967295L;
        long j10 = (j8 >> 32) + ((((long) iArr[1]) & 4294967295L) - j6);
        iArr2[1] = (int) j10;
        long j11 = (j10 >> 32) + ((((long) iArr[2]) & 4294967295L) - j7);
        iArr2[2] = (int) j11;
        long j12 = (j11 >> 32) + (((((long) iArr[3]) & 4294967295L) + j5) - j);
        long j13 = j12 & 4294967295L;
        long j14 = (j12 >> 32) + (((((long) iArr[4]) & 4294967295L) + j6) - j2);
        iArr2[4] = (int) j14;
        long j15 = (j14 >> 32) + (((((long) iArr[5]) & 4294967295L) + j7) - j3);
        iArr2[5] = (int) j15;
        long j16 = (j15 >> 32) + (((((long) iArr[6]) & 4294967295L) + j) - j4);
        iArr2[6] = (int) j16;
        long j17 = (j16 >> 32) + 1;
        long j18 = j13 + j17;
        long j19 = j9 - j17;
        iArr2[0] = (int) j19;
        long j20 = j19 >> 32;
        if (j20 != 0) {
            long j21 = j20 + (((long) iArr2[1]) & 4294967295L);
            iArr2[1] = (int) j21;
            long j22 = (j21 >> 32) + (4294967295L & ((long) iArr2[2]));
            iArr2[2] = (int) j22;
            j18 += j22 >> 32;
        }
        iArr2[3] = (int) j18;
        if (((j18 >> 32) != 0 && C1iiIiI.OooO0O0(7, iArr2, 4) != 0) || (iArr2[6] == -1 && AbstractC6694lilI.m17790OooO0O0(iArr2, f15659OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6694lilI.OooO0OO(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && C1iiIiI.m21329OooO0O0(14, iArr3, f15660OooO0O0))) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(14, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && AbstractC6694lilI.m17790OooO0O0(iArr2, f15659OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(14, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO0Oo(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO00o(14, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = AbstractC6694lilI.OooO0O0();
        AbstractC6694lilI.m17789OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6694lilI.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            OooO0O0(iArr3);
        }
    }
}
