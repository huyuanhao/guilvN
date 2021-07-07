package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLI1i1丨L  reason: invalid class name */
public abstract class lLI1i1L {
    public static final int OooO00o = 486662;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18463OooO00o = {64258704, 46628941, 18905110, 42949224, 8920788, 10663709, 35115447, 21804323, 8973338, 4366948};
    public static final int OooO0O0 = 121666;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static int[] f18464OooO0O0 = null;

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static synchronized void OooO00o() {
        synchronized (lLI1i1L.class) {
            if (f18464OooO0O0 == null) {
                int[] iArr = new int[2520];
                f18464OooO0O0 = iArr;
                int[] iArr2 = new int[2510];
                int[] OooO00o2 = iIiLL1I.OooO00o();
                OooO00o2[0] = 9;
                int[] OooO00o3 = iIiLL1I.OooO00o();
                OooO00o3[0] = 1;
                int[] OooO00o4 = iIiLL1I.OooO00o();
                int[] OooO00o5 = iIiLL1I.OooO00o();
                iIiLL1I.OooO00o(OooO00o2, OooO00o3, OooO00o4, OooO00o5);
                int[] OooO00o6 = iIiLL1I.OooO00o();
                iIiLL1I.OooO00o(OooO00o5, 0, OooO00o6, 0);
                int i = 0;
                while (true) {
                    iIiLL1I.OooO00o(OooO00o4, 0, iArr, i);
                    if (i == 2510) {
                        break;
                    }
                    OooO00o(OooO00o2, OooO00o3);
                    iIiLL1I.OooO00o(OooO00o2, OooO00o3, OooO00o4, OooO00o5);
                    iIiLL1I.OooO0O0(OooO00o4, OooO00o6, OooO00o4);
                    iIiLL1I.OooO0O0(OooO00o6, OooO00o5, OooO00o6);
                    iIiLL1I.OooO00o(OooO00o5, 0, iArr2, i);
                    i += 10;
                }
                int[] OooO00o7 = iIiLL1I.OooO00o();
                iIiLL1I.OooO00o(OooO00o6, OooO00o7);
                while (true) {
                    iIiLL1I.OooO00o(iArr, i, OooO00o2, 0);
                    iIiLL1I.OooO0O0(OooO00o2, OooO00o7, OooO00o2);
                    iIiLL1I.OooO00o(OooO00o2, 0, f18464OooO0O0, i);
                    if (i != 0) {
                        i -= 10;
                        iIiLL1I.OooO00o(iArr2, i, OooO00o3, 0);
                        iIiLL1I.OooO0O0(OooO00o7, OooO00o3, OooO00o7);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        OooO00o();
        int[] iArr = new int[8];
        OooO00o(bArr, i, iArr);
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        OooO00o3[0] = 1;
        int[] OooO00o4 = iIiLL1I.OooO00o();
        OooO00o4[0] = 1;
        int[] OooO00o5 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(f18463OooO00o, 0, OooO00o5, 0);
        int[] OooO00o6 = iIiLL1I.OooO00o();
        OooO00o6[0] = 1;
        int i3 = 0;
        int i4 = 3;
        int i5 = 1;
        while (true) {
            iIiLL1I.OooO00o(f18464OooO0O0, i3, OooO00o2, 0);
            i3 += 10;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            iIiLL1I.OooO00o(i7, OooO00o3, OooO00o5);
            iIiLL1I.OooO00o(i7, OooO00o4, OooO00o6);
            iIiLL1I.OooO00o(OooO00o3, OooO00o4, OooO00o3, OooO00o4);
            iIiLL1I.OooO0O0(OooO00o2, OooO00o4, OooO00o2);
            iIiLL1I.OooO0O0(OooO00o3);
            iIiLL1I.OooO00o(OooO00o3, OooO00o2, OooO00o3, OooO00o4);
            iIiLL1I.OooO0OO(OooO00o3, OooO00o3);
            iIiLL1I.OooO0OO(OooO00o4, OooO00o4);
            iIiLL1I.OooO0O0(OooO00o6, OooO00o3, OooO00o3);
            iIiLL1I.OooO0O0(OooO00o5, OooO00o4, OooO00o4);
            i4++;
            if (i4 >= 255) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 3; i8++) {
            OooO00o(OooO00o3, OooO00o4);
        }
        iIiLL1I.OooO00o(OooO00o4, OooO00o4);
        iIiLL1I.OooO0O0(OooO00o3, OooO00o4, OooO00o3);
        iIiLL1I.OooO0OO(OooO00o3);
        iIiLL1I.OooO00o(OooO00o3, bArr2, i2);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[8];
        OooO00o(bArr, i, iArr);
        int[] OooO00o2 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(bArr2, i2, OooO00o2);
        int[] OooO00o3 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(OooO00o2, 0, OooO00o3, 0);
        int[] OooO00o4 = iIiLL1I.OooO00o();
        OooO00o4[0] = 1;
        int[] OooO00o5 = iIiLL1I.OooO00o();
        OooO00o5[0] = 1;
        int[] OooO00o6 = iIiLL1I.OooO00o();
        int[] OooO00o7 = iIiLL1I.OooO00o();
        int[] OooO00o8 = iIiLL1I.OooO00o();
        int i4 = 254;
        int i5 = 1;
        while (true) {
            iIiLL1I.OooO00o(OooO00o5, OooO00o6, OooO00o7, OooO00o5);
            iIiLL1I.OooO00o(OooO00o3, OooO00o4, OooO00o6, OooO00o3);
            iIiLL1I.OooO0O0(OooO00o7, OooO00o3, OooO00o7);
            iIiLL1I.OooO0O0(OooO00o5, OooO00o6, OooO00o5);
            iIiLL1I.OooO0OO(OooO00o6, OooO00o6);
            iIiLL1I.OooO0OO(OooO00o3, OooO00o3);
            iIiLL1I.OooO0Oo(OooO00o6, OooO00o3, OooO00o8);
            iIiLL1I.OooO00o(OooO00o8, (int) OooO0O0, OooO00o4);
            iIiLL1I.OooO00o(OooO00o4, OooO00o3, OooO00o4);
            iIiLL1I.OooO0O0(OooO00o4, OooO00o8, OooO00o4);
            iIiLL1I.OooO0O0(OooO00o3, OooO00o6, OooO00o3);
            iIiLL1I.OooO00o(OooO00o7, OooO00o5, OooO00o5, OooO00o6);
            iIiLL1I.OooO0OO(OooO00o5, OooO00o5);
            iIiLL1I.OooO0OO(OooO00o6, OooO00o6);
            iIiLL1I.OooO0O0(OooO00o6, OooO00o2, OooO00o6);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            iIiLL1I.OooO00o(i7, OooO00o3, OooO00o5);
            iIiLL1I.OooO00o(i7, OooO00o4, OooO00o6);
            if (i4 < 3) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 3; i8++) {
            OooO00o(OooO00o3, OooO00o4);
        }
        iIiLL1I.OooO00o(OooO00o4, OooO00o4);
        iIiLL1I.OooO0O0(OooO00o3, OooO00o4, OooO00o3);
        iIiLL1I.OooO0OO(OooO00o3);
        iIiLL1I.OooO00o(OooO00o3, bArr3, i3);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = OooO00o(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & -8;
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        iArr[7] = iArr[7] | 1073741824;
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(iArr, iArr2, OooO00o2, OooO00o3);
        iIiLL1I.OooO0OO(OooO00o2, OooO00o2);
        iIiLL1I.OooO0OO(OooO00o3, OooO00o3);
        iIiLL1I.OooO0O0(OooO00o2, OooO00o3, iArr);
        iIiLL1I.OooO0Oo(OooO00o2, OooO00o3, OooO00o2);
        iIiLL1I.OooO00o(OooO00o2, (int) OooO0O0, iArr2);
        iIiLL1I.OooO00o(iArr2, OooO00o3, iArr2);
        iIiLL1I.OooO0O0(iArr2, OooO00o2, iArr2);
    }
}
