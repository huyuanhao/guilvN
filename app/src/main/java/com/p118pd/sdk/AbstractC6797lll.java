package com.p118pd.sdk;

import com.baidu.idl.face.platform.utils.FileUtils;
import com.umeng.commonsdk.proguard.C3571am;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.lll丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6797lll {
    public static final int OooO = 175155932;
    public static final int OooO00o = 57;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final long f18836OooO00o = 67108863;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f18837OooO00o = Strings.m22985OooO00o("SigEd448");

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f18838OooO00o = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static OooO0O0[] f18839OooO00o = null;
    public static final int OooO0O0 = 14;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f18840OooO0O0 = 268435455;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final int[] f18841OooO0O0 = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final int OooO0OO = 57;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final long f18842OooO0OO = 4294967295L;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final int[] f18843OooO0OO = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    public static final int OooO0Oo = 57;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int[] f18844OooO0Oo = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    public static final int OooO0o = 114;
    public static final int OooO0o0 = 57;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public static int[] f18845OooO0o0 = null;
    public static final int OooO0oO = 78101261;
    public static final int OooO0oo = 141809365;
    public static final int OooOO0 = 64542499;
    public static final int OooOO0O = 158326419;
    public static final int OooOO0o = 191173276;
    public static final int OooOOO = 137584065;
    public static final int OooOOO0 = 104575268;
    public static final int OooOOOO = 43969588;
    public static final int OooOOOo = 30366549;
    public static final int OooOOo = 258169998;
    public static final int OooOOo0 = 163752818;
    public static final int OooOOoo = 96434764;
    public static final int OooOo = 7;
    public static final int OooOo0 = 149865618;
    public static final int OooOo00 = 227822194;
    public static final int OooOo0O = 550336261;
    public static final int OooOo0o = -39081;
    public static final int OooOoO = 5;
    public static final int OooOoO0 = 5;
    public static final int OooOoOO = 18;
    public static final int OooOoo = 15;
    public static final int OooOoo0 = 16;

    /* renamed from: com.pd.sdk.lll丨$OooO0O0 */
    public static class OooO0O0 {
        public int[] OooO00o;
        public int[] OooO0O0;
        public int[] OooO0OO;

        public OooO0O0() {
            this.OooO00o = AbstractC6160iLIi.OooO00o();
            this.OooO0O0 = AbstractC6160iLIi.OooO00o();
            this.OooO0OO = AbstractC6160iLIi.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.lll丨$OooO0OO */
    public static class OooO0OO {
        public int[] OooO00o;
        public int[] OooO0O0;

        public OooO0OO() {
            this.OooO00o = AbstractC6160iLIi.OooO00o();
            this.OooO0O0 = AbstractC6160iLIi.OooO00o();
        }
    }

    public static int OooO00o(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static OooO0O0 OooO00o(OooO0O0 oooO0O0) {
        OooO0O0 oooO0O02 = new OooO0O0();
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO00o, 0, oooO0O02.OooO00o, 0);
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO0O0, 0, oooO0O02.OooO0O0, 0);
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO0OO, 0, oooO0O02.OooO0OO, 0);
        return oooO0O02;
    }

    public static synchronized void OooO00o() {
        synchronized (AbstractC6797lll.class) {
            if (f18845OooO0o0 == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                AbstractC6160iLIi.OooO00o(f18843OooO0OO, 0, oooO0O0.OooO00o, 0);
                AbstractC6160iLIi.OooO00o(f18844OooO0Oo, 0, oooO0O0.OooO0O0, 0);
                OooO0O0(oooO0O0);
                f18839OooO00o = OooO00o(oooO0O0, 32);
                f18845OooO0o0 = new int[2560];
                int i = 0;
                for (int i2 = 0; i2 < 5; i2++) {
                    OooO0O0[] oooO0O0Arr = new OooO0O0[5];
                    OooO0O0 oooO0O02 = new OooO0O0();
                    OooO0OO(oooO0O02);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 5) {
                            break;
                        }
                        OooO00o(true, oooO0O0, oooO0O02);
                        m17929OooO00o(oooO0O0);
                        oooO0O0Arr[i3] = OooO00o(oooO0O0);
                        for (int i4 = 1; i4 < 18; i4++) {
                            m17929OooO00o(oooO0O0);
                        }
                        i3++;
                    }
                    OooO0O0[] oooO0O0Arr2 = new OooO0O0[16];
                    oooO0O0Arr2[0] = oooO0O02;
                    int i5 = 1;
                    for (int i6 = 0; i6 < 4; i6++) {
                        int i7 = 1 << i6;
                        int i8 = 0;
                        while (i8 < i7) {
                            oooO0O0Arr2[i5] = OooO00o(oooO0O0Arr2[i5 - i7]);
                            OooO00o(false, oooO0O0Arr[i6], oooO0O0Arr2[i5]);
                            i8++;
                            i5++;
                        }
                    }
                    for (int i9 = 0; i9 < 16; i9++) {
                        OooO0O0 oooO0O03 = oooO0O0Arr2[i9];
                        AbstractC6160iLIi.OooO00o(oooO0O03.OooO0OO, oooO0O03.OooO0OO);
                        AbstractC6160iLIi.OooO0O0(oooO0O03.OooO00o, oooO0O03.OooO0OO, oooO0O03.OooO00o);
                        AbstractC6160iLIi.OooO0O0(oooO0O03.OooO0O0, oooO0O03.OooO0OO, oooO0O03.OooO0O0);
                        AbstractC6160iLIi.OooO00o(oooO0O03.OooO00o, 0, f18845OooO0o0, i);
                        int i10 = i + 16;
                        AbstractC6160iLIi.OooO00o(oooO0O03.OooO0O0, 0, f18845OooO0o0, i10);
                        i = i10 + 16;
                    }
                }
            }
        }
    }

    public static void OooO00o(int i, int i2, OooO0OO oooO0OO) {
        int i3 = i * 16 * 2 * 16;
        for (int i4 = 0; i4 < 16; i4++) {
            int i5 = ((i4 ^ i2) - 1) >> 31;
            C1iiIiI.m21316OooO00o(16, i5, f18845OooO0o0, i3, oooO0OO.OooO00o, 0);
            int i6 = i3 + 16;
            C1iiIiI.m21316OooO00o(16, i5, f18845OooO0o0, i6, oooO0OO.OooO0O0, 0);
            i3 = i6 + 16;
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

    public static void OooO00o(C6423iIii r3, byte b, byte[] bArr) {
        byte[] bArr2 = f18837OooO00o;
        r3.update(bArr2, 0, bArr2.length);
        r3.update(b);
        r3.update((byte) bArr.length);
        r3.update(bArr, 0, bArr.length);
    }

    public static void OooO00o(C6423iIii r4, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4, byte[] bArr5, int i2, int i3, byte[] bArr6, int i4) {
        OooO00o(r4, (byte) 0, bArr4);
        r4.update(bArr, 57, 57);
        r4.update(bArr5, i2, i3);
        r4.OooO0O0(bArr, 0, bArr.length);
        byte[] OooO00o2 = m17930OooO00o(bArr);
        byte[] bArr7 = new byte[57];
        OooO00o(OooO00o2, bArr7, 0);
        OooO00o(r4, (byte) 0, bArr4);
        r4.update(bArr7, 0, 57);
        r4.update(bArr3, i, 57);
        r4.update(bArr5, i2, i3);
        r4.OooO0O0(bArr, 0, bArr.length);
        byte[] OooO00o3 = OooO00o(OooO00o2, m17930OooO00o(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i4, 57);
        System.arraycopy(OooO00o3, 0, bArr6, i4 + 57, 57);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17929OooO00o(OooO0O0 oooO0O0) {
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO00o, oooO0O0.OooO0O0, OooO00o2);
        AbstractC6160iLIi.OooO0Oo(OooO00o2, OooO00o2);
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO00o, OooO00o3);
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0O0, OooO00o4);
        AbstractC6160iLIi.OooO00o(OooO00o3, OooO00o4, OooO00o5);
        AbstractC6160iLIi.OooO0O0(OooO00o5);
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0OO, OooO00o6);
        AbstractC6160iLIi.OooO00o(OooO00o6, OooO00o6, OooO00o6);
        AbstractC6160iLIi.OooO0O0(OooO00o6);
        AbstractC6160iLIi.OooO0OO(OooO00o5, OooO00o6, OooO00o7);
        AbstractC6160iLIi.OooO0OO(OooO00o2, OooO00o5, OooO00o2);
        AbstractC6160iLIi.OooO0OO(OooO00o3, OooO00o4, OooO00o3);
        AbstractC6160iLIi.OooO0O0(OooO00o2, OooO00o7, oooO0O0.OooO00o);
        AbstractC6160iLIi.OooO0O0(OooO00o5, OooO00o3, oooO0O0.OooO0O0);
        AbstractC6160iLIi.OooO0O0(OooO00o5, OooO00o7, oooO0O0.OooO0OO);
    }

    public static void OooO00o(OooO0O0 oooO0O0, byte[] bArr, int i) {
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO0OO, OooO00o3);
        AbstractC6160iLIi.OooO0O0(oooO0O0.OooO00o, OooO00o3, OooO00o2);
        AbstractC6160iLIi.OooO0O0(oooO0O0.OooO0O0, OooO00o3, OooO00o3);
        AbstractC6160iLIi.OooO0OO(OooO00o2);
        AbstractC6160iLIi.OooO0OO(OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o3, bArr, i);
        bArr[(i + 57) - 1] = (byte) ((OooO00o2[0] & 1) << 7);
    }

    public static void OooO00o(OooO0OO oooO0OO, OooO0O0 oooO0O0) {
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o8 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0OO, OooO00o2);
        AbstractC6160iLIi.OooO0O0(oooO0OO.OooO00o, oooO0O0.OooO00o, OooO00o3);
        AbstractC6160iLIi.OooO0O0(oooO0OO.OooO0O0, oooO0O0.OooO0O0, OooO00o4);
        AbstractC6160iLIi.OooO0O0(OooO00o3, OooO00o4, OooO00o5);
        AbstractC6160iLIi.OooO00o(OooO00o5, 39081, OooO00o5);
        AbstractC6160iLIi.OooO00o(OooO00o2, OooO00o5, OooO00o6);
        AbstractC6160iLIi.OooO0OO(OooO00o2, OooO00o5, OooO00o7);
        AbstractC6160iLIi.OooO00o(oooO0OO.OooO00o, oooO0OO.OooO0O0, OooO00o2);
        AbstractC6160iLIi.OooO00o(oooO0O0.OooO00o, oooO0O0.OooO0O0, OooO00o5);
        AbstractC6160iLIi.OooO0O0(OooO00o2, OooO00o5, OooO00o8);
        AbstractC6160iLIi.OooO00o(OooO00o4, OooO00o3, OooO00o2);
        AbstractC6160iLIi.OooO0OO(OooO00o4, OooO00o3, OooO00o5);
        AbstractC6160iLIi.OooO0O0(OooO00o2);
        AbstractC6160iLIi.OooO0OO(OooO00o8, OooO00o2, OooO00o8);
        AbstractC6160iLIi.OooO0O0(OooO00o8, oooO0O0.OooO0OO, OooO00o8);
        AbstractC6160iLIi.OooO0O0(OooO00o5, oooO0O0.OooO0OO, OooO00o5);
        AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o8, oooO0O0.OooO00o);
        AbstractC6160iLIi.OooO0O0(OooO00o5, OooO00o7, oooO0O0.OooO0O0);
        AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o7, oooO0O0.OooO0OO);
    }

    public static void OooO00o(boolean z, OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] OooO00o2 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o5 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o6 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o7 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o8 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o9 = AbstractC6160iLIi.OooO00o();
        if (z) {
            AbstractC6160iLIi.OooO0OO(oooO0O0.OooO0O0, oooO0O0.OooO00o, OooO00o9);
            iArr2 = OooO00o3;
            iArr3 = OooO00o6;
            iArr4 = OooO00o7;
            iArr = OooO00o8;
        } else {
            AbstractC6160iLIi.OooO00o(oooO0O0.OooO0O0, oooO0O0.OooO00o, OooO00o9);
            iArr3 = OooO00o3;
            iArr2 = OooO00o6;
            iArr = OooO00o7;
            iArr4 = OooO00o8;
        }
        AbstractC6160iLIi.OooO0O0(oooO0O0.OooO0OO, oooO0O02.OooO0OO, OooO00o2);
        AbstractC6160iLIi.OooO0Oo(OooO00o2, OooO00o3);
        AbstractC6160iLIi.OooO0O0(oooO0O0.OooO00o, oooO0O02.OooO00o, OooO00o4);
        AbstractC6160iLIi.OooO0O0(oooO0O0.OooO0O0, oooO0O02.OooO0O0, OooO00o5);
        AbstractC6160iLIi.OooO0O0(OooO00o4, OooO00o5, OooO00o6);
        AbstractC6160iLIi.OooO00o(OooO00o6, 39081, OooO00o6);
        AbstractC6160iLIi.OooO00o(OooO00o3, OooO00o6, iArr);
        AbstractC6160iLIi.OooO0OO(OooO00o3, OooO00o6, iArr4);
        AbstractC6160iLIi.OooO00o(oooO0O02.OooO00o, oooO0O02.OooO0O0, OooO00o6);
        AbstractC6160iLIi.OooO0O0(OooO00o9, OooO00o6, OooO00o9);
        AbstractC6160iLIi.OooO00o(OooO00o5, OooO00o4, iArr3);
        AbstractC6160iLIi.OooO0OO(OooO00o5, OooO00o4, iArr2);
        AbstractC6160iLIi.OooO0O0(iArr3);
        AbstractC6160iLIi.OooO0OO(OooO00o9, OooO00o3, OooO00o9);
        AbstractC6160iLIi.OooO0O0(OooO00o9, OooO00o2, OooO00o9);
        AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o2, OooO00o6);
        AbstractC6160iLIi.OooO0O0(OooO00o7, OooO00o9, oooO0O02.OooO00o);
        AbstractC6160iLIi.OooO0O0(OooO00o6, OooO00o8, oooO0O02.OooO0O0);
        AbstractC6160iLIi.OooO0O0(OooO00o7, OooO00o8, oooO0O02.OooO0OO);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2) {
        System.arraycopy(bArr, i, bArr2, 0, 57);
        bArr2[0] = (byte) (bArr2[0] & C5576L11i.OooO00o);
        bArr2[55] = (byte) (bArr2[55] | O0O00O.OooO00o);
        bArr2[56] = (byte) (bArr2[56] & 0);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        C6423iIii r0 = new C6423iIii(256);
        byte[] bArr3 = new byte[114];
        r0.update(bArr, i, 57);
        r0.OooO0O0(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        OooO00o(bArr3, 0, bArr4);
        OooO00o(bArr4, bArr2, i2);
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4, byte[] bArr5, int i5) {
        if (OooO00o(bArr3)) {
            C6423iIii r1 = new C6423iIii(256);
            byte[] bArr6 = new byte[114];
            r1.update(bArr, i, 57);
            r1.OooO0O0(bArr6, 0, 114);
            byte[] bArr7 = new byte[57];
            OooO00o(bArr6, 0, bArr7);
            OooO00o(r1, bArr6, bArr7, bArr2, i2, bArr3, bArr4, i3, i4, bArr5, i5);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    public static void OooO00o(byte[] bArr, int i, byte[] bArr2, byte[] bArr3, int i2, int i3, byte[] bArr4, int i4) {
        if (OooO00o(bArr2)) {
            C6423iIii r1 = new C6423iIii(256);
            byte[] bArr5 = new byte[114];
            r1.update(bArr, i, 57);
            r1.OooO0O0(bArr5, 0, 114);
            byte[] bArr6 = new byte[57];
            OooO00o(bArr5, 0, bArr6);
            byte[] bArr7 = new byte[57];
            OooO00o(bArr6, bArr7, 0);
            OooO00o(r1, bArr5, bArr6, bArr7, 0, bArr2, bArr3, i2, i3, bArr4, i4);
            return;
        }
        throw new IllegalArgumentException("ctx");
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        OooO00o(bArr, i, iArr, 0, 14);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i2 + i4] = OooO0OO(bArr, (i4 * 4) + i);
        }
    }

    public static void OooO00o(byte[] bArr, OooO0O0 oooO0O0) {
        OooO00o();
        OooO0OO(oooO0O0);
        int[] iArr = new int[15];
        OooO00o(bArr, 0, iArr);
        iArr[14] = C1iiIiI.OooO00o(14, (iArr[0] ^ -1) & 1, iArr, f18841OooO0O0, iArr) + 4;
        C1iiIiI.OooO0OO(15, iArr, 0);
        OooO0OO oooO0OO = new OooO0OO();
        int i = 17;
        while (true) {
            int i2 = i;
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = 0;
                for (int i5 = 0; i5 < 5; i5++) {
                    i4 |= ((iArr[i2 >>> 5] >>> (i2 & 31)) & 1) << i5;
                    i2 += 18;
                }
                int i6 = (i4 >>> 4) & 1;
                OooO00o(i3, ((-i6) ^ i4) & 15, oooO0OO);
                AbstractC6160iLIi.OooO00o(i6, oooO0OO.OooO00o);
                OooO00o(oooO0OO, oooO0O0);
            }
            i--;
            if (i >= 0) {
                m17929OooO00o(oooO0O0);
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
        int i = 447;
        while (i > 0 && (OooO00o2[i] | OooO00o3[i]) == 0) {
            i--;
        }
        while (true) {
            byte b = OooO00o2[i];
            boolean z = false;
            if (b != 0) {
                int i2 = b >> C3571am.f9204j;
                OooO00o(i2 != 0, f18839OooO00o[(b ^ i2) >>> 1], oooO0O02);
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
                m17929OooO00o(oooO0O02);
            } else {
                return;
            }
        }
    }

    public static boolean OooO00o(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    public static boolean OooO00o(byte[] bArr, int i, boolean z, OooO0O0 oooO0O0) {
        byte[] OooO00o2 = C9586iIILl.m21632OooO00o(bArr, i, i + 57);
        boolean z2 = false;
        if (!OooO0O0(OooO00o2)) {
            return false;
        }
        int i2 = (OooO00o2[56] & O0O00O.OooO00o) >>> 7;
        OooO00o2[56] = (byte) (OooO00o2[56] & O0O00O.OooO0O0);
        AbstractC6160iLIi.OooO00o(OooO00o2, 0, oooO0O0.OooO0O0);
        int[] OooO00o3 = AbstractC6160iLIi.OooO00o();
        int[] OooO00o4 = AbstractC6160iLIi.OooO00o();
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0O0, OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o3, 39081, OooO00o4);
        AbstractC6160iLIi.OooO0O0(OooO00o3, OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o3);
        AbstractC6160iLIi.OooO00o(OooO00o4);
        if (!AbstractC6160iLIi.m17085OooO00o(OooO00o3, OooO00o4, oooO0O0.OooO00o)) {
            return false;
        }
        AbstractC6160iLIi.OooO0OO(oooO0O0.OooO00o);
        if (i2 == 1 && AbstractC6160iLIi.m17084OooO00o(oooO0O0.OooO00o)) {
            return false;
        }
        if (i2 != (oooO0O0.OooO00o[0] & 1)) {
            z2 = true;
        }
        if (z ^ z2) {
            int[] iArr = oooO0O0.OooO00o;
            AbstractC6160iLIi.OooO0O0(iArr, iArr);
        }
        OooO0O0(oooO0O0);
        return true;
    }

    public static boolean OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4, int i3, int i4) {
        if (OooO00o(bArr3)) {
            int i5 = i + 57;
            byte[] OooO00o2 = C9586iIILl.m21632OooO00o(bArr, i, i5);
            byte[] OooO00o3 = C9586iIILl.m21632OooO00o(bArr, i5, i + 114);
            if (!OooO0O0(OooO00o2) || !OooO0OO(OooO00o3)) {
                return false;
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            if (!OooO00o(bArr2, i2, true, oooO0O0)) {
                return false;
            }
            C6423iIii r4 = new C6423iIii(256);
            byte[] bArr5 = new byte[114];
            OooO00o(r4, (byte) 0, bArr3);
            r4.update(OooO00o2, 0, 57);
            r4.update(bArr2, i2, 57);
            r4.update(bArr4, i3, i4);
            r4.OooO0O0(bArr5, 0, 114);
            byte[] OooO00o4 = m17930OooO00o(bArr5);
            int[] iArr = new int[14];
            OooO00o(OooO00o3, 0, iArr);
            int[] iArr2 = new int[14];
            OooO00o(OooO00o4, 0, iArr2);
            OooO0O0 oooO0O02 = new OooO0O0();
            OooO00o(iArr, iArr2, oooO0O0, oooO0O02);
            byte[] bArr6 = new byte[57];
            OooO00o(oooO0O02, bArr6, 0);
            return C9586iIILl.m21627OooO00o(bArr6, OooO00o2);
        }
        throw new IllegalArgumentException("ctx");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m17930OooO00o(byte[] bArr) {
        long OooO0OO2 = ((long) OooO0OO(bArr, 7)) & 4294967295L;
        long OooO0O02 = ((long) (OooO0O0(bArr, 11) << 4)) & 4294967295L;
        long OooO0O03 = ((long) (OooO0O0(bArr, 18) << 4)) & 4294967295L;
        long OooO0OO3 = ((long) OooO0OO(bArr, 21)) & 4294967295L;
        long OooO0OO4 = ((long) OooO0OO(bArr, 28)) & 4294967295L;
        long OooO0O04 = ((long) (OooO0O0(bArr, 32) << 4)) & 4294967295L;
        long OooO0OO5 = ((long) OooO0OO(bArr, 35)) & 4294967295L;
        long OooO0O05 = ((long) (OooO0O0(bArr, 39) << 4)) & 4294967295L;
        long OooO0OO6 = ((long) OooO0OO(bArr, 42)) & 4294967295L;
        long OooO0O06 = ((long) (OooO0O0(bArr, 46) << 4)) & 4294967295L;
        long OooO0O07 = ((long) (OooO0O0(bArr, 53) << 4)) & 4294967295L;
        long OooO0OO7 = ((long) OooO0OO(bArr, 70)) & 4294967295L;
        long OooO0O08 = ((long) (OooO0O0(bArr, 74) << 4)) & 4294967295L;
        long OooO0OO8 = ((long) OooO0OO(bArr, 77)) & 4294967295L;
        long OooO0O09 = ((long) (OooO0O0(bArr, 81) << 4)) & 4294967295L;
        long OooO0OO9 = ((long) OooO0OO(bArr, 84)) & 4294967295L;
        long OooO0O010 = ((long) (OooO0O0(bArr, 88) << 4)) & 4294967295L;
        long OooO0OO10 = ((long) OooO0OO(bArr, 91)) & 4294967295L;
        long OooO0O011 = ((long) (OooO0O0(bArr, 95) << 4)) & 4294967295L;
        long OooO0OO11 = ((long) OooO0OO(bArr, 98)) & 4294967295L;
        long OooO0O012 = ((long) (OooO0O0(bArr, 102) << 4)) & 4294967295L;
        long OooO0OO12 = ((long) OooO0OO(bArr, 105)) & 4294967295L;
        long OooO00o2 = ((long) OooO00o(bArr, 112)) & 4294967295L;
        long OooO0O013 = (((long) (OooO0O0(bArr, 109) << 4)) & 4294967295L) + (OooO0OO12 >>> 28);
        long j = OooO0OO12 & 268435455;
        long OooO0OO13 = (((long) OooO0OO(bArr, 56)) & 4294967295L) + (OooO00o2 * 43969588) + (OooO0O013 * 30366549);
        long OooO0O014 = (((long) (OooO0O0(bArr, 60) << 4)) & 4294967295L) + (OooO00o2 * 30366549) + (OooO0O013 * 163752818);
        long OooO0OO14 = (((long) OooO0OO(bArr, 63)) & 4294967295L) + (OooO00o2 * 163752818) + (OooO0O013 * 258169998);
        long OooO0O015 = (((long) (OooO0O0(bArr, 67) << 4)) & 4294967295L) + (OooO00o2 * 258169998) + (OooO0O013 * 96434764);
        long j2 = OooO0OO8 + (OooO00o2 * 149865618) + (OooO0O013 * 550336261);
        long j3 = OooO0O012 + (OooO0OO11 >>> 28);
        long j4 = OooO0OO11 & 268435455;
        long j5 = OooO0OO7 + (OooO00o2 * 96434764) + (OooO0O013 * 227822194) + (j * 149865618) + (j3 * 550336261);
        long j6 = OooO0O011 + (OooO0OO10 >>> 28);
        long j7 = OooO0OO10 & 268435455;
        long j8 = OooO0O05 + (j6 * 43969588);
        long j9 = OooO0OO14 + (j * 96434764) + (j3 * 227822194) + (j4 * 149865618) + (j6 * 550336261);
        long j10 = OooO0O014 + (j * 258169998) + (j3 * 96434764) + (j4 * 227822194) + (j6 * 149865618) + (j7 * 550336261);
        long j11 = OooO0O010 + (OooO0OO9 >>> 28);
        long j12 = OooO0O08 + (OooO00o2 * 227822194) + (OooO0O013 * 149865618) + (j * 550336261) + (j5 >>> 28);
        long j13 = j2 + (j12 >>> 28);
        long j14 = OooO0O09 + (OooO00o2 * 550336261) + (j13 >>> 28);
        long j15 = j13 & 268435455;
        long j16 = (OooO0OO9 & 268435455) + (j14 >>> 28);
        long j17 = j14 & 268435455;
        long OooO0OO15 = (((long) OooO0OO(bArr, 49)) & 4294967295L) + (j * 43969588) + (j3 * 30366549) + (j4 * 163752818) + (j6 * 258169998) + (j7 * 96434764) + (j11 * 227822194) + (j16 * 149865618) + (j17 * 550336261);
        long j18 = OooO0O06 + (j3 * 43969588) + (j4 * 30366549) + (j6 * 163752818) + (j7 * 258169998) + (j11 * 96434764) + (j16 * 227822194) + (j17 * 149865618) + (j15 * 550336261);
        long j19 = j9 + (j10 >>> 28);
        long j20 = OooO0O015 + (j * 227822194) + (j3 * 149865618) + (j4 * 550336261) + (j19 >>> 28);
        long j21 = (j5 & 268435455) + (j20 >>> 28);
        long j22 = j20 & 268435455;
        long j23 = (j12 & 268435455) + (j21 >>> 28);
        long j24 = j21 & 268435455;
        long j25 = OooO0O02 + (j22 * 43969588);
        long OooO0OO16 = (((long) OooO0OO(bArr, 14)) & 4294967295L) + (j24 * 43969588) + (j22 * 30366549);
        long j26 = OooO0O03 + (j23 * 43969588) + (j24 * 30366549) + (j22 * 163752818);
        long j27 = OooO0OO3 + (j15 * 43969588) + (j23 * 30366549) + (j24 * 163752818) + (j22 * 258169998);
        long OooO0O016 = (((long) (OooO0O0(bArr, 25) << 4)) & 4294967295L) + (j17 * 43969588) + (j15 * 30366549) + (j23 * 163752818) + (j24 * 258169998) + (j22 * 96434764);
        long j28 = OooO0OO4 + (j16 * 43969588) + (j17 * 30366549) + (j15 * 163752818) + (j23 * 258169998) + (j24 * 96434764) + (j22 * 227822194);
        long j29 = OooO0OO5 + (j7 * 43969588) + (j11 * 30366549) + (j16 * 163752818) + (j17 * 258169998) + (j15 * 96434764) + (j23 * 227822194) + (j24 * 149865618) + (j22 * 550336261);
        long j30 = OooO0O07 + (OooO0O013 * 43969588) + (j * 30366549) + (j3 * 163752818) + (j4 * 258169998) + (j6 * 96434764) + (j7 * 227822194) + (j11 * 149865618) + (j16 * 550336261) + (OooO0OO15 >>> 28);
        long j31 = OooO0OO15 & 268435455;
        long j32 = OooO0OO13 + (j * 163752818) + (j3 * 258169998) + (j4 * 96434764) + (j6 * 227822194) + (j7 * 149865618) + (j11 * 550336261) + (j30 >>> 28);
        long j33 = j30 & 268435455;
        long j34 = (j10 & 268435455) + (j32 >>> 28);
        long j35 = (j19 & 268435455) + (j34 >>> 28);
        long j36 = j34 & 268435455;
        long j37 = OooO0OO2 + (j35 * 43969588);
        long j38 = j25 + (j35 * 30366549);
        long j39 = OooO0OO16 + (j35 * 163752818);
        long j40 = j27 + (j35 * 96434764);
        long j41 = OooO0O016 + (j35 * 227822194);
        long j42 = OooO0O04 + (j11 * 43969588) + (j16 * 30366549) + (j17 * 163752818) + (j15 * 258169998) + (j23 * 96434764) + (j24 * 227822194) + (j22 * 149865618) + (j35 * 550336261);
        long j43 = j33 & f18836OooO00o;
        long j44 = ((j32 & 268435455) * 4) + (j33 >>> 26) + 1;
        long OooO0OO17 = (((long) OooO0OO(bArr, 0)) & 4294967295L) + (78101261 * j44);
        long OooO0O017 = (((long) (OooO0O0(bArr, 4) << 4)) & 4294967295L) + (43969588 * j36) + (141809365 * j44) + (OooO0OO17 >>> 28);
        long j45 = j37 + (30366549 * j36) + (175155932 * j44) + (OooO0O017 >>> 28);
        long j46 = j38 + (163752818 * j36) + (64542499 * j44) + (j45 >>> 28);
        long j47 = j39 + (258169998 * j36) + (158326419 * j44) + (j46 >>> 28);
        long j48 = j26 + (j35 * 258169998) + (96434764 * j36) + (191173276 * j44) + (j47 >>> 28);
        long j49 = j40 + (227822194 * j36) + (104575268 * j44) + (j48 >>> 28);
        long j50 = j41 + (149865618 * j36) + (j44 * 137584065) + (j49 >>> 28);
        long j51 = j28 + (j35 * 149865618) + (j36 * 550336261) + (j50 >>> 28);
        long j52 = j42 + (j51 >>> 28);
        long j53 = j29 + (j52 >>> 28);
        long j54 = j8 + (j7 * 30366549) + (j11 * 163752818) + (j16 * 258169998) + (j17 * 96434764) + (j15 * 227822194) + (j23 * 149865618) + (j24 * 550336261) + (j53 >>> 28);
        long j55 = OooO0OO6 + (j4 * 43969588) + (j6 * 30366549) + (j7 * 163752818) + (j11 * 258169998) + (j16 * 96434764) + (j17 * 227822194) + (j15 * 149865618) + (j23 * 550336261) + (j54 >>> 28);
        long j56 = j18 + (j55 >>> 28);
        long j57 = j31 + (j56 >>> 28);
        long j58 = j43 + (j57 >>> 28);
        long j59 = f18836OooO00o & j58;
        long j60 = (j58 >>> 26) - 1;
        long j61 = (OooO0OO17 & 268435455) - (78101261 & j60);
        long j62 = ((OooO0O017 & 268435455) - (141809365 & j60)) + (j61 >> 28);
        long j63 = j61 & 268435455;
        long j64 = ((j45 & 268435455) - (175155932 & j60)) + (j62 >> 28);
        long j65 = ((j46 & 268435455) - (64542499 & j60)) + (j64 >> 28);
        long j66 = ((j47 & 268435455) - (158326419 & j60)) + (j65 >> 28);
        long j67 = ((j48 & 268435455) - (191173276 & j60)) + (j66 >> 28);
        long j68 = ((j49 & 268435455) - (104575268 & j60)) + (j67 >> 28);
        long j69 = ((j50 & 268435455) - (j60 & 137584065)) + (j68 >> 28);
        long j70 = (j51 & 268435455) + (j69 >> 28);
        long j71 = (j52 & 268435455) + (j70 >> 28);
        long j72 = (j53 & 268435455) + (j71 >> 28);
        long j73 = (j54 & 268435455) + (j72 >> 28);
        long j74 = (j55 & 268435455) + (j73 >> 28);
        long j75 = (j56 & 268435455) + (j74 >> 28);
        long j76 = (j57 & 268435455) + (j75 >> 28);
        byte[] bArr2 = new byte[57];
        OooO00o(((j62 & 268435455) << 28) | j63, bArr2, 0);
        OooO00o(((j65 & 268435455) << 28) | (j64 & 268435455), bArr2, 7);
        OooO00o((j66 & 268435455) | ((j67 & 268435455) << 28), bArr2, 14);
        OooO00o((j68 & 268435455) | ((j69 & 268435455) << 28), bArr2, 21);
        OooO00o((j70 & 268435455) | ((j71 & 268435455) << 28), bArr2, 28);
        OooO00o((j72 & 268435455) | ((j73 & 268435455) << 28), bArr2, 35);
        OooO00o((j74 & 268435455) | ((j75 & 268435455) << 28), bArr2, 42);
        OooO00o(((j59 + (j76 >> 28)) << 28) | (j76 & 268435455), bArr2, 49);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        OooO00o(bArr, 0, iArr);
        int[] iArr2 = new int[14];
        OooO00o(bArr2, 0, iArr2);
        int[] iArr3 = new int[14];
        OooO00o(bArr3, 0, iArr3);
        C1iiIiI.OooO0OO(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        for (int i = 0; i < 28; i++) {
            OooO0O0(iArr[i], bArr4, i * 4);
        }
        return m17930OooO00o(bArr4);
    }

    public static byte[] OooO00o(int[] iArr, int i) {
        int[] iArr2 = new int[28];
        int i2 = 0;
        int i3 = 14;
        int i4 = 28;
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
        byte[] bArr = new byte[FileUtils.S_IRWXU];
        int i8 = 1 << i;
        int i9 = i8 - 1;
        int i10 = i8 >>> 1;
        int i11 = 0;
        int i12 = 0;
        while (i2 < 28) {
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
        m17929OooO00o(OooO00o2);
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
        return ((bArr[i2 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
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
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0OO);
    }

    public static boolean OooO0O0(byte[] bArr) {
        if ((bArr[56] & O0O00O.OooO0O0) != 0) {
            return false;
        }
        int[] iArr = new int[14];
        OooO00o(bArr, 0, iArr, 0, 14);
        return !C1iiIiI.m21329OooO0O0(14, iArr, f18838OooO00o);
    }

    public static int OooO0OO(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static void OooO0OO(OooO0O0 oooO0O0) {
        AbstractC6160iLIi.OooO0o(oooO0O0.OooO00o);
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0O0);
        AbstractC6160iLIi.OooO0Oo(oooO0O0.OooO0OO);
    }

    public static boolean OooO0OO(byte[] bArr) {
        if (bArr[56] != 0) {
            return false;
        }
        int[] iArr = new int[14];
        OooO00o(bArr, 0, iArr);
        return !C1iiIiI.m21329OooO0O0(14, iArr, f18841OooO0O0);
    }
}
