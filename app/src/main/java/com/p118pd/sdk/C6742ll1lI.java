package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ll1l丨丨I  reason: invalid class name and case insensitive filesystem */
public class C6742ll1lI {
    public static final int OooO00o = 511;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18714OooO00o = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void OooO00o(int[] iArr) {
        int i = iArr[16];
        int OooO0O0 = C1iiIiI.OooO0O0(16, i >>> 9, iArr) + (i & 511);
        if (OooO0O0 > 511 || (OooO0O0 == 511 && C1iiIiI.m21323OooO00o(16, iArr, f18714OooO00o))) {
            OooO0O0 = (OooO0O0 + C1iiIiI.OooO0O0(16, iArr)) & 511;
        }
        iArr[16] = OooO0O0;
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int[] OooO00o2 = C1iiIiI.OooO00o(33);
        OooO0OO(iArr, OooO00o2);
        while (true) {
            OooO0o0(OooO00o2, iArr2);
            i--;
            if (i > 0) {
                OooO0OO(iArr2, OooO00o2);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        int OooO0OO = C1iiIiI.OooO0OO(16, iArr, iArr2) + iArr[16];
        if (OooO0OO > 511 || (OooO0OO == 511 && C1iiIiI.m21323OooO00o(16, iArr2, f18714OooO00o))) {
            OooO0OO = (OooO0OO + C1iiIiI.OooO0O0(16, iArr2)) & 511;
        }
        iArr2[16] = OooO0OO;
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int OooO00o2 = C1iiIiI.OooO00o(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (OooO00o2 > 511 || (OooO00o2 == 511 && C1iiIiI.m21323OooO00o(16, iArr3, f18714OooO00o))) {
            OooO00o2 = (OooO00o2 + C1iiIiI.OooO0O0(16, iArr3)) & 511;
        }
        iArr3[16] = OooO00o2;
    }

    public static int[] OooO00o(BigInteger bigInteger) {
        int[] OooO00o2 = C1iiIiI.OooO00o(521, bigInteger);
        if (C1iiIiI.m21323OooO00o(17, OooO00o2, f18714OooO00o)) {
            C1iiIiI.m21317OooO00o(17, OooO00o2);
        }
        return OooO00o2;
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (C1iiIiI.OooO00o(16, iArr, i, iArr2) >>> 23) | (i >>> 1);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        Lli11.OooO00o(iArr, iArr2, iArr3);
        int i = iArr[16];
        int i2 = iArr2[16];
        iArr3[32] = C1iiIiI.OooO00o(16, i, iArr2, i2, iArr, iArr3, 16) + (i * i2);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        Lli11.OooO00o(iArr, iArr2);
        int i = iArr[16];
        iArr2[32] = C1iiIiI.OooO0O0(16, i << 1, iArr, 0, iArr2, 16) + (i * i);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO00o2 = C1iiIiI.OooO00o(33);
        OooO0O0(iArr, iArr2, OooO00o2);
        OooO0o0(OooO00o2, iArr3);
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
        if (C1iiIiI.m21328OooO0O0(17, iArr)) {
            C1iiIiI.m21317OooO00o(17, iArr2);
        } else {
            C1iiIiI.OooO0Oo(17, f18714OooO00o, iArr, iArr2);
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        int OooO0Oo = (C1iiIiI.OooO0Oo(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (OooO0Oo < 0) {
            OooO0Oo = (OooO0Oo + C1iiIiI.OooO00o(16, iArr3)) & 511;
        }
        iArr3[16] = OooO0Oo;
    }

    public static void OooO0o(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = C1iiIiI.OooO00o(33);
        OooO0OO(iArr, OooO00o2);
        OooO0o0(OooO00o2, iArr2);
    }

    public static void OooO0o0(int[] iArr, int[] iArr2) {
        int i = iArr[32];
        int OooO00o2 = (C1iiIiI.OooO00o(16, iArr, 16, 9, i, iArr2, 0) >>> 23) + (i >>> 9) + C1iiIiI.OooO00o(16, iArr, iArr2);
        if (OooO00o2 > 511 || (OooO00o2 == 511 && C1iiIiI.m21323OooO00o(16, iArr2, f18714OooO00o))) {
            OooO00o2 = (OooO00o2 + C1iiIiI.OooO0O0(16, iArr2)) & 511;
        }
        iArr2[16] = OooO00o2;
    }

    public static void OooO0oO(int[] iArr, int[] iArr2) {
        int i = iArr[16];
        iArr2[16] = (C1iiIiI.OooO0O0(16, iArr, i << 23, iArr2) | (i << 1)) & 511;
    }
}
