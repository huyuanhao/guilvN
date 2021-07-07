package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.Ll1丨1ILL  reason: invalid class name */
public class Ll11ILL {
    public static final int OooO00o = 2147483646;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f16680OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f16681OooO00o = {-1, -1, -1, -3};
    public static final int OooO0O0 = 2147483646;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f16682OooO0O0 = {1, 0, 0, 4, -2, -1, 3, -4};
    public static final int[] OooO0OO = {-1, -1, -1, -5, 1, 0, -4, 3};

    public static void OooO00o(int i, int[] iArr) {
        while (i != 0) {
            long j = ((long) i) & 4294967295L;
            long j2 = (((long) iArr[0]) & 4294967295L) + j;
            iArr[0] = (int) j2;
            long j3 = j2 >> 32;
            if (j3 != 0) {
                long j4 = j3 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j4;
                long j5 = (j4 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j5;
                j3 = j5 >> 32;
            }
            long j6 = j3 + (4294967295L & ((long) iArr[3])) + (j << 1);
            iArr[3] = (int) j6;
            i = (int) (j6 >> 32);
        }
    }

    public static void OooO00o(int[] iArr) {
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
        iArr[3] = (int) (j2 + (4294967295L & ((long) iArr[3])) + 2);
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO0O02 = AbstractC6835lIiiL1.OooO0O0();
        AbstractC6835lIiiL1.m17986OooO0O0(iArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, iArr2);
            i--;
            if (i > 0) {
                AbstractC6835lIiiL1.m17986OooO0O0(iArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0OO(4, iArr, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && AbstractC6835lIiiL1.m17987OooO0O0(iArr2, f16681OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6835lIiiL1.OooO00o(iArr, iArr2, iArr3) != 0 || ((iArr3[3] >>> 1) >= 2147483646 && AbstractC6835lIiiL1.m17987OooO0O0(iArr3, f16681OooO00o))) {
            OooO00o(iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o(bigInteger);
        if ((OooO00o2[3] >>> 1) >= 2147483646 && AbstractC6835lIiiL1.m17987OooO0O0(OooO00o2, f16681OooO00o)) {
            AbstractC6835lIiiL1.OooO0O0(f16681OooO00o, OooO00o2);
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
            long j4 = (j3 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j4;
            j2 = j4 >> 32;
        }
        iArr[3] = (int) (j2 + ((4294967295L & ((long) iArr[3])) - 2));
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(4, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(4, iArr2, AbstractC6835lIiiL1.OooO00o(iArr, f16681OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO00o(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && C1LLlIL.m21852OooO0O0(iArr3, f16682OooO0O0))) {
            int[] iArr4 = OooO0OO;
            C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (AbstractC6835lIiiL1.OooO0O0(iArr)) {
            AbstractC6835lIiiL1.m17972OooO00o(iArr2);
        } else {
            AbstractC6835lIiiL1.OooO0Oo(f16681OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = AbstractC6835lIiiL1.OooO0O0();
        AbstractC6835lIiiL1.m17976OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        long j = 4294967295L & ((long) iArr[7]);
        long j2 = (((long) iArr[3]) & 4294967295L) + j;
        long j3 = (((long) iArr[6]) & 4294967295L) + (j << 1);
        long j4 = (((long) iArr[2]) & 4294967295L) + j3;
        long j5 = (((long) iArr[5]) & 4294967295L) + (j3 << 1);
        long j6 = (((long) iArr[1]) & 4294967295L) + j5;
        long j7 = (((long) iArr[4]) & 4294967295L) + (j5 << 1);
        long j8 = (((long) iArr[0]) & 4294967295L) + j7;
        iArr2[0] = (int) j8;
        long j9 = j6 + (j8 >>> 32);
        iArr2[1] = (int) j9;
        long j10 = j4 + (j9 >>> 32);
        iArr2[2] = (int) j10;
        long j11 = j2 + (j7 << 1) + (j10 >>> 32);
        iArr2[3] = (int) j11;
        OooO00o((int) (j11 >>> 32), iArr2);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6835lIiiL1.OooO0OO(iArr, iArr2, iArr3) != 0 || ((iArr3[7] >>> 1) >= 2147483646 && C1LLlIL.m21852OooO0O0(iArr3, f16682OooO0O0))) {
            int[] iArr4 = OooO0OO;
            C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(4, iArr, 0, iArr2) != 0 || ((iArr2[3] >>> 1) >= 2147483646 && AbstractC6835lIiiL1.m17987OooO0O0(iArr2, f16681OooO00o))) {
            OooO00o(iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = OooO0OO;
            C1iiIiI.OooO0Oo(iArr4.length, iArr4, iArr3);
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = AbstractC6835lIiiL1.OooO0O0();
        AbstractC6835lIiiL1.m17986OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (AbstractC6835lIiiL1.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            OooO0O0(iArr3);
        }
    }
}
