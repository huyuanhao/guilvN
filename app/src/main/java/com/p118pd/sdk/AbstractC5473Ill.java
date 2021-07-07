package com.p118pd.sdk;

import com.google.android.cameraview.Camera2;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.pd.sdk.Ill丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5473Ill {
    public static final int OooO = 127719000;
    public static final int OooO00o = 32;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f15899OooO00o = 268435455;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f15900OooO00o = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static OooO0O0[] f15901OooO00o = null;
    public static final int OooO0O0 = 8;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f15902OooO0O0 = 4294967295L;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f15903OooO0O0 = {1559614445, 1477600026, -1560830762, 350157278, 0, 0, 0, CommonNetImpl.FLAG_AUTH};
    public static final int OooO0OO = 32;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f15904OooO0OO = {52811034, 25909283, 8072341, 50637101, 13785486, 30858332, 20483199, 20966410, 43936626, 4379245};
    public static final int OooO0Oo = 32;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int[] f15905OooO0Oo = {40265304, 26843545, 6710886, 53687091, 13421772, 40265318, 26843545, 6710886, 53687091, 13421772};
    public static final int OooO0o = 64;

    /* renamed from: OooO0o  reason: collision with other field name */
    public static final int[] f15906OooO0o = {45281625, 27714825, 18181821, 13898781, 114729, 49533232, 60832955, 30306712, 48412415, 4722099};
    public static final int OooO0o0 = 32;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static final int[] f15907OooO0o0 = {56195235, 47411844, 25868126, 40503822, 57364, 58321048, 30416477, 31930572, 57760639, 10749657};
    public static final int OooO0oO = -50998291;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public static final int[] f15908OooO0oO = {23454386, 55429651, 2809210, 27797563, 229458, 31957600, 54557047, 27058993, 29715967, 9444199};
    public static final int OooO0oo = 19280294;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public static int[] f15909OooO0oo = null;
    public static final int OooOO0 = -6428113;
    public static final int OooOO0O = 5343;
    public static final int OooOO0o = 7;
    public static final int OooOOO = 4;
    public static final int OooOOO0 = 8;
    public static final int OooOOOO = 8;
    public static final int OooOOOo = 8;
    public static final int OooOOo0 = 7;

    /* renamed from: com.pd.sdk.Ill丨$OooO0O0 */
    public static class OooO0O0 {
        public int[] OooO00o;
        public int[] OooO0O0;
        public int[] OooO0OO;
        public int[] OooO0Oo;

        public OooO0O0() {
            this.OooO00o = iIiLL1I.OooO00o();
            this.OooO0O0 = iIiLL1I.OooO00o();
            this.OooO0OO = iIiLL1I.OooO00o();
            this.OooO0Oo = iIiLL1I.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.Ill丨$OooO0OO */
    public static class OooO0OO {
        public int[] OooO00o;
        public int[] OooO0O0;
        public int[] OooO0OO;

        public OooO0OO() {
            this.OooO00o = iIiLL1I.OooO00o();
            this.OooO0O0 = iIiLL1I.OooO00o();
            this.OooO0OO = iIiLL1I.OooO00o();
        }
    }

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    public static OooO0O0 OooO00o(OooO0O0 oooO0O0) {
        OooO0O0 oooO0O02 = new OooO0O0();
        iIiLL1I.OooO00o(oooO0O0.OooO00o, 0, oooO0O02.OooO00o, 0);
        iIiLL1I.OooO00o(oooO0O0.OooO0O0, 0, oooO0O02.OooO0O0, 0);
        iIiLL1I.OooO00o(oooO0O0.OooO0OO, 0, oooO0O02.OooO0OO, 0);
        iIiLL1I.OooO00o(oooO0O0.OooO0Oo, 0, oooO0O02.OooO0Oo, 0);
        return oooO0O02;
    }

    public static synchronized void OooO00o() {
        synchronized (AbstractC5473Ill.class) {
            if (f15909OooO0oo == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                iIiLL1I.OooO00o(f15904OooO0OO, 0, oooO0O0.OooO00o, 0);
                iIiLL1I.OooO00o(f15905OooO0Oo, 0, oooO0O0.OooO0O0, 0);
                OooO0O0(oooO0O0);
                f15901OooO00o = OooO00o(oooO0O0, 32);
                f15909OooO0oo = new int[Camera2.MAX_PREVIEW_WIDTH];
                int i = 0;
                for (int i2 = 0; i2 < 8; i2++) {
                    OooO0O0[] oooO0O0Arr = new OooO0O0[4];
                    OooO0O0 oooO0O02 = new OooO0O0();
                    OooO0OO(oooO0O02);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 4) {
                            break;
                        }
                        OooO00o(true, oooO0O0, oooO0O02);
                        m15717OooO00o(oooO0O0);
                        oooO0O0Arr[i3] = OooO00o(oooO0O0);
                        for (int i4 = 1; i4 < 8; i4++) {
                            m15717OooO00o(oooO0O0);
                        }
                        i3++;
                    }
                    OooO0O0[] oooO0O0Arr2 = new OooO0O0[8];
                    oooO0O0Arr2[0] = oooO0O02;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 3; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            oooO0O0Arr2[i5] = OooO00o(oooO0O0Arr2[i5 - i7]);
                            OooO00o(false, oooO0O0Arr[i6], oooO0O0Arr2[i5]);
                            i8++;
                            i5++;
                        }
                    }
                    for (int i9 = 0; i9 < 8; i9++) {
                        OooO0O0 oooO0O03 = oooO0O0Arr2[i9];
                        int[] OooO00o2 = iIiLL1I.OooO00o();
                        int[] OooO00o3 = iIiLL1I.OooO00o();
                        iIiLL1I.OooO00o(oooO0O03.OooO0OO, oooO0O03.OooO0OO, OooO00o2);
                        iIiLL1I.OooO00o(OooO00o2, OooO00o3);
                        iIiLL1I.OooO0O0(oooO0O03.OooO00o, OooO00o3, OooO00o2);
                        iIiLL1I.OooO0O0(oooO0O03.OooO0O0, OooO00o3, OooO00o3);
                        OooO0OO oooO0OO = new OooO0OO();
                        iIiLL1I.OooO00o(OooO00o3, OooO00o2, oooO0OO.OooO00o, oooO0OO.OooO0O0);
                        iIiLL1I.OooO0O0(OooO00o2, OooO00o3, oooO0OO.OooO0OO);
                        iIiLL1I.OooO0O0(oooO0OO.OooO0OO, f15908OooO0oO, oooO0OO.OooO0OO);
                        iIiLL1I.OooO0OO(oooO0OO.OooO00o);
                        iIiLL1I.OooO0OO(oooO0OO.OooO0O0);
                        iIiLL1I.OooO00o(oooO0OO.OooO00o, 0, f15909OooO0oo, i);
                        int i10 = i + 10;
                        iIiLL1I.OooO00o(oooO0OO.OooO0O0, 0, f15909OooO0oo, i10);
                        int i11 = i10 + 10;
                        iIiLL1I.OooO00o(oooO0OO.OooO0OO, 0, f15909OooO0oo, i11);
                        i = i11 + 10;
                    }
                }
            }
        }
    }

    public static void OooO00o(int i, int i2, OooO0OO oooO0OO) {
        int i3 = i * 8 * 3 * 10;
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            C1iiIiI.m21316OooO00o(10, i5, f15909OooO0oo, i3, oooO0OO.OooO00o, 0);
            int i6 = i3 + 10;
            C1iiIiI.m21316OooO00o(10, i5, f15909OooO0oo, i6, oooO0OO.OooO0O0, 0);
            int i7 = i6 + 10;
            C1iiIiI.m21316OooO00o(10, i5, f15909OooO0oo, i7, oooO0OO.OooO0OO, 0);
            i3 = i7 + 10;
        }
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) (i >>> 16);
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        OooO0O0((int) j, bArr, i);
        OooO00o((int) (j >>> 32), bArr, i + 4);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15717OooO00o(OooO0O0 oooO0O0) {
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        int[] OooO00o4 = iIiLL1I.OooO00o();
        int[] OooO00o5 = iIiLL1I.OooO00o();
        int[] OooO00o6 = iIiLL1I.OooO00o();
        int[] OooO00o7 = iIiLL1I.OooO00o();
        int[] OooO00o8 = iIiLL1I.OooO00o();
        iIiLL1I.OooO0OO(oooO0O0.OooO00o, OooO00o2);
        iIiLL1I.OooO0OO(oooO0O0.OooO0O0, OooO00o3);
        iIiLL1I.OooO0OO(oooO0O0.OooO0OO, OooO00o4);
        iIiLL1I.OooO00o(OooO00o4, OooO00o4, OooO00o4);
        iIiLL1I.OooO00o(OooO00o2, OooO00o3, OooO00o8, OooO00o7);
        iIiLL1I.OooO00o(oooO0O0.OooO00o, oooO0O0.OooO0O0, OooO00o5);
        iIiLL1I.OooO0OO(OooO00o5, OooO00o5);
        iIiLL1I.OooO0Oo(OooO00o8, OooO00o5, OooO00o5);
        iIiLL1I.OooO00o(OooO00o4, OooO00o7, OooO00o6);
        iIiLL1I.OooO0O0(OooO00o6);
        iIiLL1I.OooO0O0(OooO00o5, OooO00o6, oooO0O0.OooO00o);
        iIiLL1I.OooO0O0(OooO00o7, OooO00o8, oooO0O0.OooO0O0);
        iIiLL1I.OooO0O0(OooO00o6, OooO00o7, oooO0O0.OooO0OO);
        iIiLL1I.OooO0O0(OooO00o5, OooO00o8, oooO0O0.OooO0Oo);
    }

    public static void OooO00o(OooO0O0 oooO0O0, byte[] bArr, int i) {
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(oooO0O0.OooO0OO, OooO00o3);
        iIiLL1I.OooO0O0(oooO0O0.OooO00o, OooO00o3, OooO00o2);
        iIiLL1I.OooO0O0(oooO0O0.OooO0O0, OooO00o3, OooO00o3);
        iIiLL1I.OooO0OO(OooO00o2);
        iIiLL1I.OooO0OO(OooO00o3);
        iIiLL1I.OooO00o(OooO00o3, bArr, i);
        int i2 = (i + 32) - 1;
        bArr[i2] = (byte) (bArr[i2] | ((OooO00o2[0] & 1) << 7));
    }

    public static void OooO00o(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        int[] OooO00o4 = iIiLL1I.OooO00o();
        int[] OooO00o5 = iIiLL1I.OooO00o();
        int[] OooO00o6 = iIiLL1I.OooO00o();
        int[] OooO00o7 = iIiLL1I.OooO00o();
        int[] OooO00o8 = iIiLL1I.OooO00o();
        iIiLL1I.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO00o, OooO00o3, OooO00o2);
        iIiLL1I.OooO0O0(OooO00o2, oooO0OO.OooO0O0, OooO00o2);
        iIiLL1I.OooO0O0(OooO00o3, oooO0OO.OooO00o, OooO00o3);
        iIiLL1I.OooO0O0(oooO0O0.OooO0Oo, oooO0OO.OooO0OO, OooO00o4);
        iIiLL1I.OooO00o(OooO00o3, OooO00o2, OooO00o8, OooO00o5);
        iIiLL1I.OooO00o(oooO0O0.OooO0OO, OooO00o4, OooO00o7, OooO00o6);
        iIiLL1I.OooO0O0(OooO00o7);
        iIiLL1I.OooO0O0(OooO00o5, OooO00o6, oooO0O0.OooO00o);
        iIiLL1I.OooO0O0(OooO00o7, OooO00o8, oooO0O0.OooO0O0);
        iIiLL1I.OooO0O0(OooO00o6, OooO00o7, oooO0O0.OooO0OO);
        iIiLL1I.OooO0O0(OooO00o5, OooO00o8, oooO0O0.OooO0Oo);
    }

    public static void OooO00o(C5622LILlL lILlL, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, int i2, int i3, byte[] bArr5, int i4) {
        lILlL.update(bArr, 32, 32);
        lILlL.update(bArr4, i2, i3);
        lILlL.OooO00o(bArr, 0);
        byte[] OooO00o2 = m15718OooO00o(bArr);
        byte[] bArr6 = new byte[32];
        OooO00o(OooO00o2, bArr6, 0);
        lILlL.update(bArr6, 0, 32);
        lILlL.update(bArr3, 0, 32);
        lILlL.update(bArr4, i2, i3);
        lILlL.OooO00o(bArr, 0);
        byte[] OooO00o3 = OooO00o(OooO00o2, m15718OooO00o(bArr), bArr2);
        System.arraycopy(bArr6, 0, bArr5, i4, 32);
        System.arraycopy(OooO00o3, 0, bArr5, i4 + 32, 32);
    }

    public static void OooO00o(boolean z, OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] OooO00o2 = iIiLL1I.OooO00o();
        int[] OooO00o3 = iIiLL1I.OooO00o();
        int[] OooO00o4 = iIiLL1I.OooO00o();
        int[] OooO00o5 = iIiLL1I.OooO00o();
        int[] OooO00o6 = iIiLL1I.OooO00o();
        int[] OooO00o7 = iIiLL1I.OooO00o();
        int[] OooO00o8 = iIiLL1I.OooO00o();
        int[] OooO00o9 = iIiLL1I.OooO00o();
        if (z) {
            iArr = OooO00o4;
            iArr4 = OooO00o5;
            iArr3 = OooO00o7;
            iArr2 = OooO00o8;
        } else {
            iArr4 = OooO00o4;
            iArr = OooO00o5;
            iArr2 = OooO00o7;
            iArr3 = OooO00o8;
        }
        iIiLL1I.OooO00o(oooO0O02.OooO0O0, oooO0O02.OooO00o, OooO00o3, OooO00o2);
        iIiLL1I.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO00o, iArr, iArr4);
        iIiLL1I.OooO0O0(OooO00o2, OooO00o4, OooO00o2);
        iIiLL1I.OooO0O0(OooO00o3, OooO00o5, OooO00o3);
        iIiLL1I.OooO0O0(oooO0O02.OooO0Oo, oooO0O0.OooO0Oo, OooO00o4);
        iIiLL1I.OooO0O0(OooO00o4, f15906OooO0o, OooO00o4);
        iIiLL1I.OooO0O0(oooO0O02.OooO0OO, oooO0O0.OooO0OO, OooO00o5);
        iIiLL1I.OooO00o(OooO00o5, OooO00o5, OooO00o5);
        iIiLL1I.OooO00o(OooO00o3, OooO00o2, OooO00o9, OooO00o6);
        iIiLL1I.OooO00o(OooO00o5, OooO00o4, iArr3, iArr2);
        iIiLL1I.OooO0O0(iArr3);
        iIiLL1I.OooO0O0(OooO00o6, OooO00o7, oooO0O02.OooO00o);
        iIiLL1I.OooO0O0(OooO00o8, OooO00o9, oooO0O02.OooO0O0);
        iIiLL1I.OooO0O0(OooO00o7, OooO00o8, oooO0O02.OooO0OO);
        iIiLL1I.OooO0O0(OooO00o6, OooO00o9, oooO0O02.OooO0Oo);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 32);
        bArr2[0] = (byte) (bArr2[0] & 248);
        bArr2[31] = (byte) (bArr2[31] & O0O00O.OooO0O0);
        bArr2[31] = (byte) (bArr2[31] | 64);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        C5622LILlL lILlL = new C5622LILlL();
        byte[] bArr3 = new byte[lILlL.OooO0O0()];
        lILlL.update(bArr, i, 32);
        lILlL.OooO00o(bArr3, 0);
        byte[] bArr4 = new byte[32];
        OooO00o(bArr3, 0, bArr4);
        OooO00o(bArr4, bArr2, i2);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        C5622LILlL lILlL = new C5622LILlL();
        byte[] bArr4 = new byte[lILlL.OooO0O0()];
        lILlL.update(bArr, i, 32);
        lILlL.OooO00o(bArr4, 0);
        byte[] bArr5 = new byte[32];
        OooO00o(bArr4, 0, bArr5);
        byte[] bArr6 = new byte[32];
        OooO00o(bArr5, bArr6, 0);
        OooO00o(lILlL, bArr4, bArr5, bArr6, 0, bArr2, i2, i3, bArr3, i4);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4, byte[] bArr4, int i5) {
        C5622LILlL lILlL = new C5622LILlL();
        byte[] bArr5 = new byte[lILlL.OooO0O0()];
        lILlL.update(bArr, i, 32);
        lILlL.OooO00o(bArr5, 0);
        byte[] bArr6 = new byte[32];
        OooO00o(bArr5, 0, bArr6);
        OooO00o(lILlL, bArr5, bArr6, bArr2, i2, bArr3, i3, i4, bArr4, i5);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        OooO00o(bArr, i, iArr, 0, 8);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = OooO0O0(bArr, (i4 * 4) + i);
        }
    }

    public static void OooO00o(byte[] bArr, OooO0O0 oooO0O0) {
        OooO00o();
        OooO0OO(oooO0O0);
        int[] iArr = new int[8];
        OooO00o(bArr, 0, iArr);
        C1iiIiI.OooO00o(8, (iArr[0] ^ -1) & 1, iArr, f15903OooO0O0, iArr);
        C1iiIiI.OooO0OO(8, iArr, 1);
        for (int i = 0; i < 8; i++) {
            iArr[i] = LlliII.OooO0Oo(iArr[i]);
        }
        OooO0OO oooO0OO = new OooO0OO();
        int i2 = 28;
        while (true) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = iArr[i3] >>> i2;
                int i5 = (i4 >>> 3) & 1;
                OooO00o(i3, (i4 ^ (-i5)) & 7, oooO0OO);
                iIiLL1I.OooO00o(i5, oooO0OO.OooO00o, oooO0OO.OooO0O0);
                iIiLL1I.OooO00o(i5, oooO0OO.OooO0OO);
                OooO00o(oooO0OO, oooO0O0);
            }
            i2 -= 4;
            if (i2 >= 0) {
                m15717OooO00o(oooO0O0);
            } else {
                return;
            }
        }
    }

    public static void OooO00o(byte[] bArr, byte[] bArr2, int i) {
        OooO0O0 oooO0O0 = new OooO0O0();
        OooO00o(bArr, oooO0O0);
        OooO00o(oooO0O0, bArr2, i);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        OooO00o();
        byte[] OooO00o2 = OooO00o(iArr, 7);
        byte[] OooO00o3 = OooO00o(iArr2, 5);
        OooO0O0[] OooO00o4 = OooO00o(oooO0O0, 8);
        OooO0OO(oooO0O02);
        int i = 255;
        while (i > 0 && (OooO00o2[i] | OooO00o3[i]) == 0) {
            i--;
        }
        while (true) {
            byte b = OooO00o2[i];
            boolean z = false;
            if (b != 0) {
                int i2 = b >> C3571am.f9204j;
                OooO00o(i2 != 0, f15901OooO00o[(b ^ i2) >>> 1], oooO0O02);
            }
            byte b2 = OooO00o3[i];
            if (b2 != 0) {
                int i3 = b2 >> C3571am.f9204j;
                int i4 = (b2 ^ i3) >>> 1;
                if (i3 != 0) {
                    z = true;
                }
                OooO00o(z, OooO00o4[i4], oooO0O02);
            }
            i--;
            if (i >= 0) {
                m15717OooO00o(oooO0O02);
            } else {
                return;
            }
        }
    }

    public static boolean OooO00o(byte[] bArr) {
        int[] iArr = new int[8];
        OooO00o(bArr, 0, iArr, 0, 8);
        iArr[7] = iArr[7] & Integer.MAX_VALUE;
        return !C1LLlIL.m21852OooO0O0(iArr, f15900OooO00o);
    }

    public static boolean OooO00o(byte[] bArr, int i, boolean z, OooO0O0 oooO0O0) {
        byte[] OooO00o2 = C9586iIILl.m21632OooO00o(bArr, i, i + 32);
        boolean z2 = false;
        if (!OooO00o(OooO00o2)) {
            return false;
        }
        int i2 = (OooO00o2[31] & O0O00O.OooO00o) >>> 7;
        OooO00o2[31] = (byte) (OooO00o2[31] & O0O00O.OooO0O0);
        iIiLL1I.OooO00o(OooO00o2, 0, oooO0O0.OooO0O0);
        int[] OooO00o3 = iIiLL1I.OooO00o();
        int[] OooO00o4 = iIiLL1I.OooO00o();
        iIiLL1I.OooO0OO(oooO0O0.OooO0O0, OooO00o3);
        iIiLL1I.OooO0O0(f15907OooO0o0, OooO00o3, OooO00o4);
        iIiLL1I.OooO0o0(OooO00o3);
        iIiLL1I.OooO00o(OooO00o4);
        if (!iIiLL1I.m16980OooO00o(OooO00o3, OooO00o4, oooO0O0.OooO00o)) {
            return false;
        }
        iIiLL1I.OooO0OO(oooO0O0.OooO00o);
        if (i2 == 1 && iIiLL1I.m16979OooO00o(oooO0O0.OooO00o)) {
            return false;
        }
        if (i2 != (oooO0O0.OooO00o[0] & 1)) {
            z2 = true;
        }
        if (z ^ z2) {
            int[] iArr = oooO0O0.OooO00o;
            iIiLL1I.OooO0O0(iArr, iArr);
        }
        OooO0O0(oooO0O0);
        return true;
    }

    public static boolean OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, int i3, int i4) {
        int i5 = i + 32;
        byte[] OooO00o2 = C9586iIILl.m21632OooO00o(bArr, i, i5);
        byte[] OooO00o3 = C9586iIILl.m21632OooO00o(bArr, i5, i + 64);
        if (!OooO00o(OooO00o2) || !OooO0O0(OooO00o3)) {
            return false;
        }
        OooO0O0 oooO0O0 = new OooO0O0();
        if (!OooO00o(bArr2, i2, true, oooO0O0)) {
            return false;
        }
        C5622LILlL lILlL = new C5622LILlL();
        byte[] bArr4 = new byte[lILlL.OooO0O0()];
        lILlL.update(OooO00o2, 0, 32);
        lILlL.update(bArr2, i2, 32);
        lILlL.update(bArr3, i3, i4);
        lILlL.OooO00o(bArr4, 0);
        byte[] OooO00o4 = m15718OooO00o(bArr4);
        int[] iArr = new int[8];
        OooO00o(OooO00o3, 0, iArr);
        int[] iArr2 = new int[8];
        OooO00o(OooO00o4, 0, iArr2);
        OooO0O0 oooO0O02 = new OooO0O0();
        OooO00o(iArr, iArr2, oooO0O0, oooO0O02);
        byte[] bArr5 = new byte[32];
        OooO00o(oooO0O02, bArr5, 0);
        return C9586iIILl.m21627OooO00o(bArr5, OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15718OooO00o(byte[] bArr) {
        long OooO0O02 = ((long) OooO0O0(bArr, 7)) & 4294967295L;
        long OooO00o2 = ((long) (OooO00o(bArr, 18) << 4)) & 4294967295L;
        long OooO0O03 = ((long) OooO0O0(bArr, 21)) & 4294967295L;
        long OooO0O04 = ((long) OooO0O0(bArr, 28)) & 4294967295L;
        long OooO00o3 = ((long) (OooO00o(bArr, 46) << 4)) & 4294967295L;
        long OooO0O05 = ((long) OooO0O0(bArr, 49)) & 4294967295L;
        long OooO00o4 = ((long) (OooO00o(bArr, 53) << 4)) & 4294967295L;
        long OooO0O06 = ((long) OooO0O0(bArr, 56)) & 4294967295L;
        long OooO00o5 = 4294967295L & ((long) (OooO00o(bArr, 60) << 4));
        long j = ((long) bArr[63]) & 255;
        long j2 = OooO00o5 + (OooO0O06 >> 28);
        long j3 = OooO0O06 & 268435455;
        long OooO00o6 = ((((long) (OooO00o(bArr, 32) << 4)) & 4294967295L) - (j * -50998291)) - (j2 * 19280294);
        long OooO0O07 = ((((long) OooO0O0(bArr, 35)) & 4294967295L) - (j * 19280294)) - (j2 * 127719000);
        long OooO0O08 = ((((long) OooO0O0(bArr, 42)) & 4294967295L) - (j * -6428113)) - (j2 * 5343);
        long j4 = (OooO0O04 - (j2 * -50998291)) - (j3 * 19280294);
        long j5 = OooO00o6 - (j3 * 127719000);
        long j6 = OooO0O07 - (j3 * -6428113);
        long OooO00o7 = (((((long) (OooO00o(bArr, 39) << 4)) & 4294967295L) - (j * 127719000)) - (j2 * -6428113)) - (j3 * 5343);
        long j7 = OooO00o4 + (OooO0O05 >> 28);
        long j8 = OooO0O05 & 268435455;
        long j9 = j6 - (j7 * 5343);
        long j10 = (j5 - (j7 * -6428113)) - (j8 * 5343);
        long j11 = (OooO00o3 - (j * 5343)) + (OooO0O08 >> 28);
        long j12 = ((OooO0O03 - (j7 * -50998291)) - (j8 * 19280294)) - (j11 * 127719000);
        long j13 = ((j4 - (j7 * 127719000)) - (j8 * -6428113)) - (j11 * 5343);
        long j14 = (OooO0O08 & 268435455) + (OooO00o7 >> 28);
        long OooO0O09 = ((((long) OooO0O0(bArr, 14)) & 4294967295L) - (j11 * -50998291)) - (j14 * 19280294);
        long j15 = ((OooO00o2 - (j8 * -50998291)) - (j11 * 19280294)) - (j14 * 127719000);
        long OooO00o8 = (((((((long) (OooO00o(bArr, 25) << 4)) & 4294967295L) - (j3 * -50998291)) - (j7 * 19280294)) - (j8 * 127719000)) - (j11 * -6428113)) - (j14 * 5343);
        long j16 = (OooO00o7 & 268435455) + (j9 >> 28);
        long OooO00o9 = ((((long) (OooO00o(bArr, 11) << 4)) & 4294967295L) - (j14 * -50998291)) - (j16 * 19280294);
        long j17 = (j12 - (j14 * -6428113)) - (j16 * 5343);
        long j18 = (j9 & 268435455) + (j10 >> 28);
        long j19 = (OooO0O02 - (j16 * -50998291)) - (j18 * 19280294);
        long j20 = OooO00o9 - (j18 * 127719000);
        long j21 = (OooO0O09 - (j16 * 127719000)) - (j18 * -6428113);
        long j22 = (j15 - (j16 * -6428113)) - (j18 * 5343);
        long j23 = j13 + (OooO00o8 >> 28);
        long j24 = j23 & 268435455;
        long j25 = j24 >>> 27;
        long j26 = (j10 & 268435455) + (j23 >> 28) + j25;
        long OooO0O010 = (((long) OooO0O0(bArr, 0)) & 4294967295L) - (j26 * -50998291);
        long OooO00o10 = (((((long) (OooO00o(bArr, 4) << 4)) & 4294967295L) - (j18 * -50998291)) - (j26 * 19280294)) + (OooO0O010 >> 28);
        long j27 = (j19 - (j26 * 127719000)) + (OooO00o10 >> 28);
        long j28 = (j20 - (j26 * -6428113)) + (j27 >> 28);
        long j29 = (j21 - (j26 * 5343)) + (j28 >> 28);
        long j30 = j22 + (j29 >> 28);
        long j31 = j17 + (j30 >> 28);
        long j32 = (OooO00o8 & 268435455) + (j31 >> 28);
        long j33 = j24 + (j32 >> 28);
        long j34 = (j33 >> 28) - j25;
        long j35 = (OooO0O010 & 268435455) + (j34 & -50998291);
        long j36 = (OooO00o10 & 268435455) + (j34 & 19280294) + (j35 >> 28);
        long j37 = (j27 & 268435455) + (j34 & 127719000) + (j36 >> 28);
        long j38 = (j28 & 268435455) + (j34 & -6428113) + (j37 >> 28);
        long j39 = (j29 & 268435455) + (j34 & 5343) + (j38 >> 28);
        long j40 = (j30 & 268435455) + (j39 >> 28);
        long j41 = (j31 & 268435455) + (j40 >> 28);
        long j42 = j40 & 268435455;
        long j43 = (j32 & 268435455) + (j41 >> 28);
        byte[] bArr2 = new byte[32];
        OooO00o((j35 & 268435455) | ((j36 & 268435455) << 28), bArr2, 0);
        OooO00o(((j38 & 268435455) << 28) | (j37 & 268435455), bArr2, 7);
        OooO00o((j39 & 268435455) | (j42 << 28), bArr2, 14);
        OooO00o((j41 & 268435455) | ((j43 & 268435455) << 28), bArr2, 21);
        OooO0O0((int) ((j33 & 268435455) + (j43 >> 28)), bArr2, 28);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[16];
        OooO00o(bArr, 0, iArr);
        int[] iArr2 = new int[8];
        OooO00o(bArr2, 0, iArr2);
        int[] iArr3 = new int[8];
        OooO00o(bArr3, 0, iArr3);
        C1LLlIL.OooO0OO(iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[64];
        for (int i = 0; i < 16; i++) {
            OooO0O0(iArr[i], bArr4, i * 4);
        }
        return m15718OooO00o(bArr4);
    }

    public static byte[] OooO00o(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        int i2 = 0;
        int i3 = 8;
        int i4 = 16;
        int i5 = 0;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            int i6 = iArr[i3];
            int i7 = i4 - 1;
            iArr2[i7] = (i5 << 16) | (i6 >>> 16);
            i4 = i7 - 1;
            iArr2[i4] = i6;
            i5 = i6;
        }
        byte[] bArr = new byte[256];
        int i8 = 1 << i;
        int i9 = i8 - 1;
        int i10 = i8 >>> 1;
        int i11 = 0;
        int i12 = 0;
        while (i2 < 16) {
            int i13 = iArr2[i2];
            while (i11 < 16) {
                int i14 = i13 >>> i11;
                if ((i14 & 1) == i12) {
                    i11++;
                } else {
                    int i15 = (i14 & i9) + i12;
                    int i16 = i15 & i10;
                    int i17 = i15 - (i16 << 1);
                    i12 = i16 >>> (i - 1);
                    bArr[(i2 << 4) + i11] = (byte) i17;
                    i11 += i;
                }
            }
            i2++;
            i11 -= 16;
        }
        return bArr;
    }

    public static OooO0O0[] OooO00o(OooO0O0 oooO0O0, int i) {
        OooO0O0 OooO00o2 = OooO00o(oooO0O0);
        m15717OooO00o(OooO00o2);
        OooO0O0[] oooO0O0Arr = new OooO0O0[i];
        oooO0O0Arr[0] = OooO00o(oooO0O0);
        for (int i2 = 1; i2 < i; i2++) {
            oooO0O0Arr[i2] = OooO00o(oooO0O0Arr[i2 - 1]);
            OooO00o(false, OooO00o2, oooO0O0Arr[i2]);
        }
        return oooO0O0Arr;
    }

    public static int OooO0O0(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static void OooO0O0(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void OooO0O0(OooO0O0 oooO0O0) {
        iIiLL1I.OooO0Oo(oooO0O0.OooO0OO);
        iIiLL1I.OooO0O0(oooO0O0.OooO00o, oooO0O0.OooO0O0, oooO0O0.OooO0Oo);
    }

    public static boolean OooO0O0(byte[] bArr) {
        int[] iArr = new int[8];
        OooO00o(bArr, 0, iArr);
        return !C1LLlIL.m21852OooO0O0(iArr, f15903OooO0O0);
    }

    public static void OooO0OO(OooO0O0 oooO0O0) {
        iIiLL1I.OooO0o(oooO0O0.OooO00o);
        iIiLL1I.OooO0Oo(oooO0O0.OooO0O0);
        iIiLL1I.OooO0Oo(oooO0O0.OooO0OO);
        iIiLL1I.OooO0o(oooO0O0.OooO0Oo);
    }
}
