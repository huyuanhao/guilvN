package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLLi丨L丨丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6589lLLiL {
    public static final int OooO00o = 156326;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18525OooO00o = {268435454, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, 268435454, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0, AbstractC6160iLIi.OooO0O0};
    public static final int OooO0O0 = 39082;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f18526OooO0O0 = {161294112, 185702364, 163248300, 54522310, 189866924, 105098465, 66174309, 139206530, 156517789, 136025714, 231801628, 246922668, 59251455, 69446896, 83964484, 252685170};
    public static int[] OooO0OO = null;

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static synchronized void OooO00o() {
        synchronized (AbstractC6589lLLiL.class) {
            if (OooO0OO == null) {
                int[] iArr = new int[7136];
                OooO0OO = iArr;
                int[] iArr2 = new int[7120];
                int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
                OooO00o2[0] = 5;
                int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
                OooO00o3[0] = 1;
                int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
                int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
                AbstractC6160iLIi.OooO00o(OooO00o2, OooO00o3, OooO00o4);
                AbstractC6160iLIi.OooO0OO(OooO00o2, OooO00o3, OooO00o5);
                int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
                AbstractC6160iLIi.OooO00o(OooO00o5, 0, OooO00o6, 0);
                int i = 0;
                while (true) {
                    AbstractC6160iLIi.OooO00o(OooO00o4, 0, iArr, i);
                    if (i == 7120) {
                        break;
                    }
                    OooO00o(OooO00o2, OooO00o3);
                    AbstractC6160iLIi.OooO00o(OooO00o2, OooO00o3, OooO00o4);
                    AbstractC6160iLIi.OooO0OO(OooO00o2, OooO00o3, OooO00o5);
                    AbstractC6160iLIi.OooO0O0(OooO00o4, OooO00o6, OooO00o4);
                    AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o5, OooO00o6);
                    AbstractC6160iLIi.OooO00o(OooO00o5, 0, iArr2, i);
                    i += 16;
                }
                int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
                AbstractC6160iLIi.OooO00o(OooO00o6, OooO00o7);
                while (true) {
                    AbstractC6160iLIi.OooO00o(iArr, i, OooO00o2, 0);
                    AbstractC6160iLIi.OooO0O0(OooO00o2, OooO00o7, OooO00o2);
                    AbstractC6160iLIi.OooO00o(OooO00o2, 0, OooO0OO, i);
                    if (i != 0) {
                        i -= 16;
                        AbstractC6160iLIi.OooO00o(iArr2, i, OooO00o3, 0);
                        AbstractC6160iLIi.OooO0O0(OooO00o7, OooO00o3, OooO00o7);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        OooO00o();
        int[] iArr = new int[14];
        OooO00o(bArr, i, iArr);
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(f18525OooO00o, 0, OooO00o3, 0);
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        OooO00o4[0] = 1;
        int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(f18526OooO0O0, 0, OooO00o5, 0);
        int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
        OooO00o6[0] = 1;
        int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
        int i3 = 0;
        int i4 = 2;
        int i5 = 1;
        while (true) {
            AbstractC6160iLIi.OooO00o(OooO0OO, i3, OooO00o2, 0);
            i3 += 16;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            AbstractC6160iLIi.OooO00o(i7, OooO00o3, OooO00o5);
            AbstractC6160iLIi.OooO00o(i7, OooO00o4, OooO00o6);
            AbstractC6160iLIi.OooO00o(OooO00o3, OooO00o4, OooO00o7);
            AbstractC6160iLIi.OooO0OO(OooO00o3, OooO00o4, OooO00o4);
            AbstractC6160iLIi.OooO0O0(OooO00o2, OooO00o4, OooO00o2);
            AbstractC6160iLIi.OooO0O0(OooO00o7);
            AbstractC6160iLIi.OooO00o(OooO00o7, OooO00o2, OooO00o3);
            AbstractC6160iLIi.OooO0OO(OooO00o7, OooO00o2, OooO00o4);
            AbstractC6160iLIi.OooO0Oo(OooO00o3, OooO00o3);
            AbstractC6160iLIi.OooO0Oo(OooO00o4, OooO00o4);
            AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o3, OooO00o3);
            AbstractC6160iLIi.OooO0O0(OooO00o5, OooO00o4, OooO00o4);
            i4++;
            if (i4 >= 448) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            OooO00o(OooO00o3, OooO00o4);
        }
        AbstractC6160iLIi.OooO00o(OooO00o4, OooO00o4);
        AbstractC6160iLIi.OooO0O0(OooO00o3, OooO00o4, OooO00o3);
        AbstractC6160iLIi.OooO0OO(OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o3, bArr2, i2);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3) {
        int[] iArr = new int[14];
        OooO00o(bArr, i, iArr);
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(bArr2, i2, OooO00o2);
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(OooO00o2, 0, OooO00o3, 0);
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        OooO00o4[0] = 1;
        int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
        OooO00o5[0] = 1;
        int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o8 = AbstractC6160iLIi.OooO00o();
        int i4 = 447;
        int i5 = 1;
        while (true) {
            AbstractC6160iLIi.OooO00o(OooO00o5, OooO00o6, OooO00o7);
            AbstractC6160iLIi.OooO0OO(OooO00o5, OooO00o6, OooO00o5);
            AbstractC6160iLIi.OooO00o(OooO00o3, OooO00o4, OooO00o6);
            AbstractC6160iLIi.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
            AbstractC6160iLIi.OooO0O0(OooO00o7, OooO00o3, OooO00o7);
            AbstractC6160iLIi.OooO0O0(OooO00o5, OooO00o6, OooO00o5);
            AbstractC6160iLIi.OooO0Oo(OooO00o6, OooO00o6);
            AbstractC6160iLIi.OooO0Oo(OooO00o3, OooO00o3);
            AbstractC6160iLIi.OooO0OO(OooO00o6, OooO00o3, OooO00o8);
            AbstractC6160iLIi.OooO00o(OooO00o8, (int) OooO0O0, OooO00o4);
            AbstractC6160iLIi.OooO00o(OooO00o4, OooO00o3, OooO00o4);
            AbstractC6160iLIi.OooO0O0(OooO00o4, OooO00o8, OooO00o4);
            AbstractC6160iLIi.OooO0O0(OooO00o3, OooO00o6, OooO00o3);
            AbstractC6160iLIi.OooO0OO(OooO00o7, OooO00o5, OooO00o6);
            AbstractC6160iLIi.OooO00o(OooO00o7, OooO00o5, OooO00o5);
            AbstractC6160iLIi.OooO0Oo(OooO00o5, OooO00o5);
            AbstractC6160iLIi.OooO0Oo(OooO00o6, OooO00o6);
            AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o2, OooO00o6);
            i4--;
            int i6 = (iArr[i4 >>> 5] >>> (i4 & 31)) & 1;
            int i7 = i5 ^ i6;
            AbstractC6160iLIi.OooO00o(i7, OooO00o3, OooO00o5);
            AbstractC6160iLIi.OooO00o(i7, OooO00o4, OooO00o6);
            if (i4 < 2) {
                break;
            }
            i5 = i6;
        }
        for (int i8 = 0; i8 < 2; i8++) {
            OooO00o(OooO00o3, OooO00o4);
        }
        AbstractC6160iLIi.OooO00o(OooO00o4, OooO00o4);
        AbstractC6160iLIi.OooO0O0(OooO00o3, OooO00o4, OooO00o3);
        AbstractC6160iLIi.OooO0OO(OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o3, bArr3, i3);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        for (int i2 = 0; i2 < 14; i2++) {
            iArr[i2] = OooO00o(bArr, (i2 * 4) + i);
        }
        iArr[0] = iArr[0] & -4;
        iArr[13] = iArr[13] | Integer.MIN_VALUE;
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(iArr, iArr2, OooO00o2);
        AbstractC6160iLIi.OooO0OO(iArr, iArr2, OooO00o3);
        AbstractC6160iLIi.OooO0Oo(OooO00o2, OooO00o2);
        AbstractC6160iLIi.OooO0Oo(OooO00o3, OooO00o3);
        AbstractC6160iLIi.OooO0O0(OooO00o2, OooO00o3, iArr);
        AbstractC6160iLIi.OooO0OO(OooO00o2, OooO00o3, OooO00o2);
        AbstractC6160iLIi.OooO00o(OooO00o2, (int) OooO0O0, iArr2);
        AbstractC6160iLIi.OooO00o(iArr2, OooO00o3, iArr2);
        AbstractC6160iLIi.OooO0O0(iArr2, OooO00o2, iArr2);
    }
}
