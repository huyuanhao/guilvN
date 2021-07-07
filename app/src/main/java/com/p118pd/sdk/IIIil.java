package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IIIi丨l  reason: invalid class name */
public class IIIil {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f15466OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f15467OooO00o = {-1, -1, -2, -1, -1, -1};
    public static final int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f15468OooO0O0 = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};
    public static final int[] OooO0OO = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

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
            long j6 = j4 + (4294967295L & ((long) iArr[2])) + j2;
            iArr[2] = (int) j6;
            j = j6 >> 32;
        } else {
            j = 0;
        }
        if ((j != 0 && C1iiIiI.OooO0O0(6, iArr, 3) != 0) || (iArr[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(iArr, f15467OooO00o))) {
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
        long j4 = j2 + (4294967295L & ((long) iArr[2])) + 1;
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            C1iiIiI.OooO0O0(6, iArr, 3);
        }
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO0O02 = AbstractC6163iLIl1.OooO0O0();
        AbstractC6163iLIl1.m17100OooO0O0(iArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, iArr2);
            i--;
            if (i > 0) {
                AbstractC6163iLIl1.m17100OooO0O0(iArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0OO(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(iArr2, f15467OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6163iLIl1.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(iArr3, f15467OooO00o))) {
            OooO00o(iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o(bigInteger);
        if (OooO00o2[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(OooO00o2, f15467OooO00o)) {
            AbstractC6163iLIl1.OooO0O0(f15467OooO00o, OooO00o2);
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
        long j4 = j2 + ((4294967295L & ((long) iArr[2])) - 1);
        iArr[2] = (int) j4;
        if ((j4 >> 32) != 0) {
            C1iiIiI.OooO00o(6, iArr, 3);
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(6, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(6, iArr2, AbstractC6163iLIl1.OooO00o(iArr, f15467OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO00o(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && C1iiIiI.m21329OooO0O0(12, iArr3, f15468OooO0O0))) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(12, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (AbstractC6163iLIl1.OooO0O0(iArr)) {
            AbstractC6163iLIl1.m17086OooO00o(iArr2);
        } else {
            AbstractC6163iLIl1.OooO0Oo(f15467OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = AbstractC6163iLIl1.OooO0O0();
        AbstractC6163iLIl1.m17090OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[6]) & 4294967295L;
        long j2 = ((long) iArr[7]) & 4294967295L;
        long j3 = (((long) iArr[10]) & 4294967295L) + j;
        long j4 = (((long) iArr[11]) & 4294967295L) + j2;
        long j5 = (((long) iArr[0]) & 4294967295L) + j3 + 0;
        int i = (int) j5;
        long j6 = (j5 >> 32) + (((long) iArr[1]) & 4294967295L) + j4;
        iArr2[1] = (int) j6;
        long j7 = j3 + (((long) iArr[8]) & 4294967295L);
        long j8 = j4 + (((long) iArr[9]) & 4294967295L);
        long j9 = (j6 >> 32) + (((long) iArr[2]) & 4294967295L) + j7;
        long j10 = j9 & 4294967295L;
        long j11 = (j9 >> 32) + (((long) iArr[3]) & 4294967295L) + j8;
        iArr2[3] = (int) j11;
        long j12 = (j11 >> 32) + (((long) iArr[4]) & 4294967295L) + (j7 - j);
        iArr2[4] = (int) j12;
        long j13 = (j12 >> 32) + (((long) iArr[5]) & 4294967295L) + (j8 - j2);
        iArr2[5] = (int) j13;
        long j14 = j13 >> 32;
        long j15 = j10 + j14;
        long j16 = j14 + (((long) i) & 4294967295L);
        iArr2[0] = (int) j16;
        long j17 = j16 >> 32;
        if (j17 != 0) {
            long j18 = j17 + (4294967295L & ((long) iArr2[1]));
            iArr2[1] = (int) j18;
            j15 += j18 >> 32;
        }
        iArr2[2] = (int) j15;
        if (((j15 >> 32) != 0 && C1iiIiI.OooO0O0(6, iArr2, 3) != 0) || (iArr2[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(iArr2, f15467OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6163iLIl1.OooO0OO(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && C1iiIiI.m21329OooO0O0(12, iArr3, f15468OooO0O0))) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(12, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && AbstractC6163iLIl1.m17101OooO0O0(iArr2, f15467OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(12, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = OooO0OO;
            if (C1iiIiI.OooO0Oo(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO00o(12, iArr3, OooO0OO.length);
            }
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = AbstractC6163iLIl1.OooO0O0();
        AbstractC6163iLIl1.m17100OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6163iLIl1.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            OooO0O0(iArr3);
        }
    }
}
