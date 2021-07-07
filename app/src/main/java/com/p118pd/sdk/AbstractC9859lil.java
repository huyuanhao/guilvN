package com.p118pd.sdk;

import java.util.Random;

/* renamed from: com.pd.sdk.丨丨lil  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9859lil {
    public static int OooO00o(int i) {
        int i2 = 0;
        while ((i & 1) == 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static int OooO00o(int[] iArr, int[] iArr2, int i, int[] iArr3, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (iArr2[0] == 0) {
            C1iiIiI.OooO0Oo(i, iArr2, 0);
            i3 += 32;
        }
        int OooO00o = OooO00o(iArr2[0]);
        if (OooO00o > 0) {
            C1iiIiI.OooO0Oo(i, iArr2, OooO00o, 0);
            i3 += OooO00o;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if ((iArr3[0] & 1) != 0) {
                i2 += i2 < 0 ? C1iiIiI.OooO00o(length, iArr, iArr3) : C1iiIiI.OooO0Oo(length, iArr, iArr3);
            }
            C1iiIiI.OooO0OO(length, iArr3, i2);
        }
        return i2;
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2, int[] iArr3) {
        if (i < 0) {
            C1iiIiI.OooO00o(iArr.length, iArr2, iArr, iArr3);
        } else {
            System.arraycopy(iArr2, 0, iArr3, 0, iArr.length);
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (!C1iiIiI.m21328OooO0O0(length, iArr2)) {
            int i = 0;
            if (C1iiIiI.m21322OooO00o(length, iArr2)) {
                System.arraycopy(iArr2, 0, iArr3, 0, length);
                return;
            }
            int[] OooO00o = C1iiIiI.m21324OooO00o(length, iArr2);
            int[] OooO00o2 = C1iiIiI.OooO00o(length);
            OooO00o2[0] = 1;
            int OooO00o3 = (1 & OooO00o[0]) == 0 ? OooO00o(iArr, OooO00o, length, OooO00o2, 0) : 0;
            if (C1iiIiI.m21322OooO00o(length, OooO00o)) {
                OooO00o(iArr, OooO00o3, OooO00o2, iArr3);
                return;
            }
            int[] OooO00o4 = C1iiIiI.m21324OooO00o(length, iArr);
            int[] OooO00o5 = C1iiIiI.OooO00o(length);
            int i2 = length;
            while (true) {
                int i3 = i2 - 1;
                if (OooO00o[i3] == 0 && OooO00o4[i3] == 0) {
                    i2--;
                } else if (C1iiIiI.m21329OooO0O0(i2, OooO00o, OooO00o4)) {
                    C1iiIiI.OooO0Oo(i2, OooO00o4, OooO00o);
                    OooO00o3 = OooO00o(iArr, OooO00o, i2, OooO00o2, OooO00o3 + (C1iiIiI.OooO0Oo(length, OooO00o5, OooO00o2) - i));
                    if (C1iiIiI.m21322OooO00o(i2, OooO00o)) {
                        OooO00o(iArr, OooO00o3, OooO00o2, iArr3);
                        return;
                    }
                } else {
                    C1iiIiI.OooO0Oo(i2, OooO00o, OooO00o4);
                    i = OooO00o(iArr, OooO00o4, i2, OooO00o5, i + (C1iiIiI.OooO0Oo(length, OooO00o2, OooO00o5) - OooO00o3));
                    if (C1iiIiI.m21322OooO00o(i2, OooO00o4)) {
                        OooO00o(iArr, i, OooO00o5, iArr3);
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (C1iiIiI.OooO00o(length, iArr2, iArr3, iArr4) != 0) {
            C1iiIiI.OooO0Oo(length, iArr, iArr4);
        }
    }

    public static int[] OooO00o(int[] iArr) {
        int length = iArr.length;
        Random random = new Random();
        int[] OooO00o = C1iiIiI.OooO00o(length);
        int i = length - 1;
        int i2 = iArr[i];
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        do {
            for (int i8 = 0; i8 != length; i8++) {
                OooO00o[i8] = random.nextInt();
            }
            OooO00o[i] = OooO00o[i] & i7;
        } while (C1iiIiI.m21329OooO0O0(length, OooO00o, iArr));
        return OooO00o;
    }

    public static int OooO0O0(int i) {
        int i2 = (2 - (i * i)) * i;
        int i3 = i2 * (2 - (i * i2));
        int i4 = i3 * (2 - (i * i3));
        return i4 * (2 - (i * i4));
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        int length = iArr.length;
        if (C1iiIiI.OooO0Oo(length, iArr2, iArr3, iArr4) != 0) {
            C1iiIiI.OooO00o(length, iArr, iArr4);
        }
    }
}
