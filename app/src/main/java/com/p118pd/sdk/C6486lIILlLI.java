package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIILlLI  reason: case insensitive filesystem */
public class C6486lIILlLI {
    public static final int OooO00o = Integer.MAX_VALUE;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f18360OooO00o = 4294967295L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18361OooO00o = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int OooO0O0 = 19;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f18362OooO0O0 = {iI1iII.OooOo0O, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};

    public static int OooO00o(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + (((long) f18362OooO0O0[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C1iiIiI.OooO0O0(8, iArr, 1);
        }
        long j3 = j2 + ((((long) iArr[8]) & 4294967295L) - 19);
        iArr[8] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            j4 = (long) C1iiIiI.OooO00o(15, iArr, 9);
        }
        long j5 = j4 + (((long) iArr[15]) & 4294967295L) + (4294967295L & ((long) (f18362OooO0O0[15] + 1)));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static void OooO00o(int i, int[] iArr) {
        int i2 = iArr[7];
        iArr[7] = (i2 & Integer.MAX_VALUE) + C1iiIiI.OooO0O0(7, ((i << 1) | (i2 >>> 31)) * 19, iArr);
        if (C1LLlIL.m21852OooO0O0(iArr, f18361OooO00o)) {
            OooO0Oo(iArr);
        }
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
        C1iiIiI.OooO0OO(8, iArr, iArr2);
        if (C1LLlIL.m21852OooO0O0(iArr2, f18361OooO00o)) {
            OooO0Oo(iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        C1LLlIL.OooO00o(iArr, iArr2, iArr3);
        if (C1LLlIL.m21852OooO0O0(iArr3, f18361OooO00o)) {
            OooO0Oo(iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = C1LLlIL.OooO00o(bigInteger);
        while (C1LLlIL.m21852OooO0O0(OooO00o2, f18361OooO00o)) {
            C1LLlIL.OooO0O0(f18361OooO00o, OooO00o2);
        }
        return OooO00o2;
    }

    public static int OooO0O0(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C1iiIiI.OooO00o(7, iArr, 1);
        }
        long j3 = j2 + (4294967295L & ((long) iArr[7])) + 2147483648L;
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(8, iArr, 0, iArr2);
            return;
        }
        C1LLlIL.OooO00o(iArr, f18361OooO00o, iArr2);
        C1iiIiI.OooO0OO(8, iArr2, 0);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        C1iiIiI.OooO00o(16, iArr, iArr2, iArr3);
        if (C1iiIiI.m21329OooO0O0(16, iArr3, f18362OooO0O0)) {
            OooO0OO(iArr3);
        }
    }

    public static int OooO0OO(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) - (((long) f18362OooO0O0[0]) & 4294967295L);
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C1iiIiI.OooO00o(8, iArr, 1);
        }
        long j3 = j2 + (((long) iArr[8]) & 4294967295L) + 19;
        iArr[8] = (int) j3;
        long j4 = j3 >> 32;
        if (j4 != 0) {
            j4 = (long) C1iiIiI.OooO0O0(15, iArr, 9);
        }
        long j5 = j4 + ((((long) iArr[15]) & 4294967295L) - (4294967295L & ((long) (f18362OooO0O0[15] + 1))));
        iArr[15] = (int) j5;
        return (int) (j5 >> 32);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (C1LLlIL.OooO0O0(iArr)) {
            C1LLlIL.m21837OooO00o(iArr2);
        } else {
            C1LLlIL.OooO0Oo(f18361OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21841OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static int OooO0Oo(int[] iArr) {
        long j = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = (long) C1iiIiI.OooO0O0(7, iArr, 1);
        }
        long j3 = j2 + ((4294967295L & ((long) iArr[7])) - 2147483648L);
        iArr[7] = (int) j3;
        return (int) (j3 >> 32);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        C1iiIiI.OooO0O0(8, iArr, 8, i, iArr2, 0);
        int i2 = iArr2[7];
        iArr2[7] = (i2 & Integer.MAX_VALUE) + C1iiIiI.OooO0O0(7, ((C1LLlIL.OooO00o(19, iArr, iArr2) << 1) + ((i2 >>> 31) - (i >>> 31))) * 19, iArr2);
        if (C1LLlIL.m21852OooO0O0(iArr2, f18361OooO00o)) {
            OooO0Oo(iArr2);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        C1LLlIL.OooO0OO(iArr, iArr2, iArr3);
        if (C1iiIiI.m21329OooO0O0(16, iArr3, f18362OooO0O0)) {
            OooO0OO(iArr3);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        C1iiIiI.OooO0O0(8, iArr, 0, iArr2);
        if (C1LLlIL.m21852OooO0O0(iArr2, f18361OooO00o)) {
            OooO0Oo(iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(16, iArr, iArr2, iArr3) != 0) {
            OooO00o(iArr3);
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
