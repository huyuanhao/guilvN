package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lllILI */
public final class lllILI {
    public static int OooO00o(int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[i3];
        iArr[i3] = iArr[i2];
        iArr[i2] = i4;
        int i5 = i;
        while (i < i2) {
            if (iArr[i] <= i4) {
                int i6 = iArr[i5];
                iArr[i5] = iArr[i];
                iArr[i] = i6;
                i5++;
            }
            i++;
        }
        int i7 = iArr[i5];
        iArr[i5] = iArr[i2];
        iArr[i2] = i7;
        return i5;
    }

    public static String OooO00o(int[] iArr) {
        return C5191I1ll.OooO0O0(C6447l1I.OooO00o(iArr));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17913OooO00o(int[] iArr) {
        OooO00o(iArr, 0, iArr.length - 1);
    }

    public static void OooO00o(int[] iArr, int i) {
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr[length] = i;
        }
    }

    public static void OooO00o(int[] iArr, int i, int i2) {
        if (i2 > i) {
            int OooO00o = OooO00o(iArr, i, i2, i2);
            OooO00o(iArr, i, OooO00o - 1);
            OooO00o(iArr, OooO00o + 1, i2);
        }
    }

    public static boolean OooO00o(int[] iArr, int[] iArr2) {
        if (iArr.length != iArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = iArr.length - 1; length >= 0; length--) {
            z &= iArr[length] == iArr2[length];
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m17914OooO00o(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m17915OooO00o(int[] iArr, int i, int i2) {
        int i3 = i2 - i;
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i3);
        return iArr2;
    }

    public static String OooO0O0(int[] iArr) {
        String str = "";
        for (int i = 0; i < iArr.length; i++) {
            str = str + iArr[i] + " ";
        }
        return str;
    }
}
