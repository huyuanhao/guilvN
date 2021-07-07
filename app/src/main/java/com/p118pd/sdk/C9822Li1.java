package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨Li1  reason: invalid class name and case insensitive filesystem */
public class C9822Li1 {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f23419OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f23420OooO00o = {Integer.MAX_VALUE, -1, -1, -1, -1};
    public static final int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f23421OooO0O0 = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};
    public static final int OooO0OO = -2147483647;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f23422OooO0OO = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void OooO00o(int i, int[] iArr) {
        if ((i != 0 && LILLl.OooO0O0((int) OooO0OO, i, iArr, 0) != 0) || (iArr[4] == -1 && LILLl.m16059OooO0O0(iArr, f23420OooO00o))) {
            C1iiIiI.OooO0O0(5, (int) OooO0OO, iArr);
        }
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO0O02 = LILLl.OooO0O0();
        LILLl.m16058OooO0O0(iArr, OooO0O02);
        while (true) {
            OooO0Oo(OooO0O02, iArr2);
            i--;
            if (i > 0) {
                LILLl.m16058OooO0O0(iArr2, OooO0O02);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0OO(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && LILLl.m16059OooO0O0(iArr2, f23420OooO00o))) {
            C1iiIiI.OooO0O0(5, (int) OooO0OO, iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (LILLl.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && LILLl.m16059OooO0O0(iArr3, f23420OooO00o))) {
            C1iiIiI.OooO0O0(5, (int) OooO0OO, iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = LILLl.OooO00o(bigInteger);
        if (OooO00o2[4] == -1 && LILLl.m16059OooO0O0(OooO00o2, f23420OooO00o)) {
            LILLl.OooO0O0(f23420OooO00o, OooO00o2);
        }
        return OooO00o2;
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(5, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(5, iArr2, LILLl.OooO00o(iArr, f23420OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO00o(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && C1iiIiI.m21329OooO0O0(10, iArr3, f23421OooO0O0))) {
            int[] iArr4 = f23422OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(10, iArr3, f23422OooO0OO.length);
            }
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (LILLl.OooO0O0(iArr)) {
            LILLl.m16048OooO00o(iArr2);
        } else {
            LILLl.OooO0Oo(f23420OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = LILLl.OooO0O0();
        LILLl.m16052OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        long j = ((long) iArr[5]) & 4294967295L;
        long j2 = ((long) iArr[6]) & 4294967295L;
        long j3 = ((long) iArr[7]) & 4294967295L;
        long j4 = ((long) iArr[8]) & 4294967295L;
        long j5 = ((long) iArr[9]) & 4294967295L;
        long j6 = (((long) iArr[0]) & 4294967295L) + j + (j << 31) + 0;
        iArr2[0] = (int) j6;
        long j7 = (j6 >>> 32) + (((long) iArr[1]) & 4294967295L) + j2 + (j2 << 31);
        iArr2[1] = (int) j7;
        long j8 = (j7 >>> 32) + (((long) iArr[2]) & 4294967295L) + j3 + (j3 << 31);
        iArr2[2] = (int) j8;
        long j9 = (j8 >>> 32) + (((long) iArr[3]) & 4294967295L) + j4 + (j4 << 31);
        iArr2[3] = (int) j9;
        long j10 = (j9 >>> 32) + (4294967295L & ((long) iArr[4])) + j5 + (j5 << 31);
        iArr2[4] = (int) j10;
        OooO00o((int) (j10 >>> 32), iArr2);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (LILLl.OooO0OO(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && C1iiIiI.m21329OooO0O0(10, iArr3, f23421OooO0O0))) {
            int[] iArr4 = f23422OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(10, iArr3, f23422OooO0OO.length);
            }
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && LILLl.m16059OooO0O0(iArr2, f23420OooO00o))) {
            C1iiIiI.OooO0O0(5, (int) OooO0OO, iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(10, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = f23422OooO0OO;
            if (C1iiIiI.OooO0Oo(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO00o(10, iArr3, f23422OooO0OO.length);
            }
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = LILLl.OooO0O0();
        LILLl.m16058OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (LILLl.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            C1iiIiI.OooO0Oo(5, (int) OooO0OO, iArr3);
        }
    }
}
