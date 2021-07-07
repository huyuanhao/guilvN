package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IiIi1l丨I  reason: invalid class name */
public class IiIi1lI {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f15689OooO00o = {-977, -2, -1, -1, -1, -1, -1, -1};
    public static final int OooO0O0 = -1;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f15690OooO0O0 = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};
    public static final int OooO0OO = 977;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f15691OooO0OO = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void OooO00o(int i, int[] iArr) {
        if ((i != 0 && C1LLlIL.OooO00o((int) OooO0OO, i, iArr, 0) != 0) || (iArr[7] == -1 && C1LLlIL.m21852OooO0O0(iArr, f15689OooO00o))) {
            C1iiIiI.OooO00o(8, (int) OooO0OO, iArr);
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
        if (C1iiIiI.OooO0OO(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && C1LLlIL.m21852OooO0O0(iArr2, f15689OooO00o))) {
            C1iiIiI.OooO00o(8, (int) OooO0OO, iArr2);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO00o(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && C1LLlIL.m21852OooO0O0(iArr3, f15689OooO00o))) {
            C1iiIiI.OooO00o(8, (int) OooO0OO, iArr3);
        }
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = C1LLlIL.OooO00o(bigInteger);
        if (OooO00o2[7] == -1 && C1LLlIL.m21852OooO0O0(OooO00o2, f15689OooO00o)) {
            C1LLlIL.OooO0O0(f15689OooO00o, OooO00o2);
        }
        return OooO00o2;
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            C1iiIiI.OooO00o(8, iArr, 0, iArr2);
        } else {
            C1iiIiI.OooO0OO(8, iArr2, C1LLlIL.OooO00o(iArr, f15689OooO00o, iArr2));
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO00o(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && C1iiIiI.m21329OooO0O0(16, iArr3, f15690OooO0O0))) {
            int[] iArr4 = f15691OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(16, iArr3, f15691OooO0OO.length);
            }
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        if (C1LLlIL.OooO0O0(iArr)) {
            C1LLlIL.m21837OooO00o(iArr2);
        } else {
            C1LLlIL.OooO0Oo(f15689OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21841OooO00o(iArr, iArr2, OooO0O02);
        OooO0Oo(OooO0O02, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        if (C1LLlIL.OooO00o((int) OooO0OO, C1LLlIL.OooO00o(OooO0OO, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && C1LLlIL.m21852OooO0O0(iArr2, f15689OooO00o))) {
            C1iiIiI.OooO00o(8, (int) OooO0OO, iArr2);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO0OO(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && C1iiIiI.m21329OooO0O0(16, iArr3, f15690OooO0O0))) {
            int[] iArr4 = f15691OooO0OO;
            if (C1iiIiI.OooO00o(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO0O0(16, iArr3, f15691OooO0OO.length);
            }
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        if (C1iiIiI.OooO0O0(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && C1LLlIL.m21852OooO0O0(iArr2, f15689OooO00o))) {
            C1iiIiI.OooO00o(8, (int) OooO0OO, iArr2);
        }
    }

    public static void OooO0o(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1iiIiI.OooO0Oo(16, iArr, iArr2, iArr3) != 0) {
            int[] iArr4 = f15691OooO0OO;
            if (C1iiIiI.OooO0Oo(iArr4.length, iArr4, iArr3) != 0) {
                C1iiIiI.OooO00o(16, iArr3, f15691OooO0OO.length);
            }
        }
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int[] OooO0O02 = C1LLlIL.OooO0O0();
        C1LLlIL.m21851OooO0O0(iArr, OooO0O02);
        OooO0Oo(OooO0O02, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2, int[] iArr3) {
        if (C1LLlIL.OooO0Oo(iArr, iArr2, iArr3) != 0) {
            C1iiIiI.OooO0OO(8, (int) OooO0OO, iArr3);
        }
    }
}
