package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIiLL1I丨  reason: invalid class name */
public abstract class iIiLL1I {
    public static final int OooO00o = 10;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f17569OooO00o = {34513072, 59165138, 4688974, 3500415, 6194736, 33281959, 54535759, 32551604, 163342, 5703241};
    public static final int OooO0O0 = 16777215;
    public static final int OooO0OO = 33554431;
    public static final int OooO0Oo = 67108863;

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        return (bArr[i3 + 1] << 24) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8) | ((bArr[i3] & 255) << 16);
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        int i4 = i3 + 1;
        bArr[i4] = (byte) (i >>> 16);
        bArr[i4 + 1] = (byte) (i >>> 24);
    }

    public static void OooO00o(int i, int[] iArr) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            iArr[i3] = (iArr[i3] ^ i2) - i2;
        }
    }

    public static void OooO00o(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 10; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        OooO00o(bArr, i, iArr, 0);
        OooO00o(bArr, i + 16, iArr, 5);
        iArr[9] = iArr[9] & 16777215;
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr, int i2) {
        int OooO00o2 = OooO00o(bArr, i + 0);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int OooO00o4 = OooO00o(bArr, i + 8);
        int OooO00o5 = OooO00o(bArr, i + 12);
        iArr[i2 + 0] = OooO00o2 & OooO0Oo;
        iArr[i2 + 1] = ((OooO00o2 >>> 26) | (OooO00o3 << 6)) & OooO0Oo;
        iArr[i2 + 2] = ((OooO00o4 << 12) | (OooO00o3 >>> 20)) & OooO0OO;
        iArr[i2 + 3] = ((OooO00o5 << 19) | (OooO00o4 >>> 13)) & OooO0Oo;
        iArr[i2 + 4] = OooO00o5 >>> 7;
    }

    public static void OooO00o(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void OooO00o(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void OooO00o(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i + 0];
        int i4 = iArr[i + 1];
        int i5 = iArr[i + 2];
        int i6 = iArr[i + 3];
        int i7 = iArr[i + 4];
        OooO00o((i4 << 26) | i3, bArr, i2 + 0);
        OooO00o((i4 >>> 6) | (i5 << 20), bArr, i2 + 4);
        OooO00o((i5 >>> 12) | (i6 << 13), bArr, i2 + 8);
        OooO00o((i7 << 7) | (i6 >>> 19), bArr, i2 + 12);
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        int i6 = iArr[4];
        int i7 = iArr[5];
        int i8 = iArr[6];
        int i9 = iArr[7];
        int i10 = iArr[8];
        int i11 = iArr[9];
        long j = (long) i;
        long j2 = ((long) i4) * j;
        int i12 = ((int) j2) & OooO0OO;
        long j3 = ((long) i6) * j;
        int i13 = ((int) j3) & OooO0OO;
        long j4 = ((long) i9) * j;
        int i14 = ((int) j4) & OooO0OO;
        long j5 = ((long) i11) * j;
        int i15 = ((int) j5) & OooO0OO;
        long j6 = ((j5 >> 25) * 38) + (((long) i2) * j);
        iArr2[0] = ((int) j6) & OooO0Oo;
        long j7 = (j3 >> 25) + (((long) i7) * j);
        iArr2[5] = ((int) j7) & OooO0Oo;
        long j8 = (j6 >> 26) + (((long) i3) * j);
        iArr2[1] = ((int) j8) & OooO0Oo;
        long j9 = (j2 >> 25) + (((long) i5) * j);
        iArr2[3] = ((int) j9) & OooO0Oo;
        long j10 = (j7 >> 26) + (((long) i8) * j);
        iArr2[6] = ((int) j10) & OooO0Oo;
        long j11 = (j4 >> 25) + (((long) i10) * j);
        iArr2[8] = ((int) j11) & OooO0Oo;
        iArr2[2] = i12 + ((int) (j8 >> 26));
        iArr2[4] = i13 + ((int) (j9 >> 26));
        iArr2[7] = i14 + ((int) (j10 >> 26));
        iArr2[9] = i15 + ((int) (j11 >> 26));
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 10; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void OooO00o(int[] iArr, byte[] bArr, int i) {
        OooO00o(iArr, 0, bArr, i);
        OooO00o(iArr, 5, bArr, i + 16);
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = OooO00o();
        int[] OooO00o3 = OooO00o();
        OooO0OO(iArr, OooO00o2, OooO00o3);
        OooO0O0(OooO00o3, 3, OooO00o3);
        OooO0O0(OooO00o3, OooO00o2, iArr2);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            int i3 = iArr2[i];
            iArr3[i] = i2 + i3;
            iArr4[i] = i2 - i3;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16979OooO00o(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 10; i2++) {
            i |= iArr[i2];
        }
        return i == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m16980OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO00o2 = OooO00o();
        int[] OooO00o3 = OooO00o();
        OooO0O0(iArr, iArr2, OooO00o2);
        OooO0OO(iArr2, OooO00o3);
        OooO0O0(OooO00o2, OooO00o3, OooO00o2);
        OooO0OO(OooO00o3, OooO00o3);
        OooO0O0(OooO00o3, OooO00o2, OooO00o3);
        int[] OooO00o4 = OooO00o();
        int[] OooO00o5 = OooO00o();
        OooO0OO(OooO00o3, OooO00o4, OooO00o5);
        OooO0O0(OooO00o5, OooO00o2, OooO00o5);
        int[] OooO00o6 = OooO00o();
        OooO0OO(OooO00o5, OooO00o6);
        OooO0O0(OooO00o6, iArr2, OooO00o6);
        OooO0Oo(OooO00o6, iArr, OooO00o4);
        OooO0OO(OooO00o4);
        if (m16979OooO00o(OooO00o4)) {
            OooO00o(OooO00o5, 0, iArr3, 0);
            return true;
        }
        OooO00o(OooO00o6, iArr, OooO00o4);
        OooO0OO(OooO00o4);
        if (!m16979OooO00o(OooO00o4)) {
            return false;
        }
        OooO0O0(OooO00o5, f17569OooO00o, iArr3);
        return true;
    }

    public static int[] OooO00o() {
        return new int[10];
    }

    public static int[] OooO00o(int i) {
        return new int[(i * 10)];
    }

    public static void OooO0O0(int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        int i11 = i4 + (i3 >> 25);
        int i12 = i3 & OooO0OO;
        int i13 = i6 + (i5 >> 25);
        int i14 = i5 & OooO0OO;
        int i15 = i9 + (i8 >> 25);
        int i16 = i8 & OooO0OO;
        int i17 = i + ((i10 >> 25) * 38);
        int i18 = i10 & OooO0OO;
        int i19 = i2 + (i17 >> 26);
        int i20 = i17 & OooO0Oo;
        int i21 = i7 + (i13 >> 26);
        int i22 = i13 & OooO0Oo;
        int i23 = i12 + (i19 >> 26);
        int i24 = i19 & OooO0Oo;
        int i25 = i14 + (i11 >> 26);
        int i26 = i11 & OooO0Oo;
        int i27 = i16 + (i21 >> 26);
        int i28 = i21 & OooO0Oo;
        int i29 = i15 & OooO0Oo;
        iArr[0] = i20;
        iArr[1] = i24;
        iArr[2] = i23;
        iArr[3] = i26;
        iArr[4] = i25;
        iArr[5] = i22;
        iArr[6] = i28;
        iArr[7] = i27;
        iArr[8] = i29;
        iArr[9] = i18 + (i15 >> 26);
    }

    public static void OooO0O0(int[] iArr, int i) {
        int i2 = iArr[9];
        int i3 = 16777215 & i2;
        int i4 = (((i2 >> 24) + i) * 19) + iArr[0];
        iArr[0] = i4 & OooO0Oo;
        int i5 = (i4 >> 26) + iArr[1];
        iArr[1] = i5 & OooO0Oo;
        int i6 = (i5 >> 26) + iArr[2];
        iArr[2] = i6 & OooO0OO;
        int i7 = (i6 >> 25) + iArr[3];
        iArr[3] = i7 & OooO0Oo;
        int i8 = (i7 >> 26) + iArr[4];
        iArr[4] = i8 & OooO0OO;
        int i9 = (i8 >> 25) + iArr[5];
        iArr[5] = i9 & OooO0Oo;
        int i10 = (i9 >> 26) + iArr[6];
        iArr[6] = i10 & OooO0Oo;
        int i11 = (i10 >> 26) + iArr[7];
        iArr[7] = 33554431 & i11;
        int i12 = (i11 >> 25) + iArr[8];
        iArr[8] = 67108863 & i12;
        iArr[9] = (i12 >> 26) + i3;
    }

    public static void OooO0O0(int[] iArr, int i, int[] iArr2) {
        OooO0OO(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                OooO0OO(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        for (int i = 0; i < 10; i++) {
            iArr2[i] = -iArr[i];
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int i5 = iArr[2];
        int i6 = iArr2[2];
        int i7 = iArr[3];
        int i8 = iArr2[3];
        int i9 = iArr[4];
        int i10 = iArr2[4];
        int i11 = iArr[5];
        int i12 = iArr2[5];
        int i13 = iArr[6];
        int i14 = iArr2[6];
        int i15 = iArr[7];
        int i16 = iArr2[7];
        int i17 = iArr[8];
        int i18 = iArr2[8];
        int i19 = iArr[9];
        int i20 = iArr2[9];
        long j = (long) i;
        long j2 = (long) i2;
        long j3 = j * j2;
        long j4 = (long) i4;
        long j5 = (long) i3;
        long j6 = (long) i6;
        long j7 = (long) i5;
        long j8 = (j * j6) + (j5 * j4) + (j7 * j2);
        long j9 = (long) i8;
        long j10 = j * j9;
        long j11 = (long) i7;
        long j12 = (((j5 * j6) + (j7 * j4)) << 1) + j10 + (j11 * j2);
        long j13 = (long) i10;
        long j14 = (long) i9;
        long j15 = ((j7 * j6) << 1) + (j * j13) + (j5 * j9) + (j11 * j4) + (j2 * j14);
        long j16 = ((((j5 * j13) + (j7 * j9)) + (j11 * j6)) + (j14 * j4)) << 1;
        long j17 = (((j7 * j13) + (j14 * j6)) << 1) + (j11 * j9);
        long j18 = (j11 * j13) + (j14 * j9);
        long j19 = (j14 * j13) << 1;
        long j20 = (long) i11;
        long j21 = (long) i12;
        long j22 = (long) i14;
        long j23 = (long) i13;
        long j24 = (long) i16;
        long j25 = (long) i15;
        long j26 = (j20 * j24) + (j23 * j22) + (j25 * j21);
        long j27 = (long) i18;
        long j28 = (long) i17;
        long j29 = (((j23 * j24) + (j25 * j22)) << 1) + (j20 * j27) + (j28 * j21);
        long j30 = (long) i20;
        long j31 = (long) i19;
        long j32 = ((j25 * j24) << 1) + (j20 * j30) + (j23 * j27) + (j28 * j22) + (j21 * j31);
        long j33 = (j23 * j30) + (j25 * j27) + (j28 * j24) + (j31 * j22);
        long j34 = j3 - (j33 * 76);
        long j35 = ((j * j4) + (j5 * j2)) - (((((j25 * j30) + (j31 * j24)) << 1) + (j28 * j27)) * 38);
        long j36 = j8 - (((j28 * j30) + (j27 * j31)) * 38);
        long j37 = j12 - ((j31 * j30) * 76);
        long j38 = j16 - (j20 * j21);
        long j39 = j17 - ((j20 * j22) + (j23 * j21));
        long j40 = j18 - j26;
        long j41 = j19 - j29;
        int i21 = i + i11;
        int i22 = i3 + i13;
        int i23 = i5 + i15;
        int i24 = i6 + i16;
        int i25 = i7 + i17;
        int i26 = i9 + i19;
        long j42 = (long) i21;
        long j43 = (long) (i2 + i12);
        long j44 = j42 * j43;
        long j45 = (long) (i4 + i14);
        long j46 = (long) i22;
        long j47 = (j42 * j45) + (j46 * j43);
        long j48 = (long) i24;
        long j49 = (long) i23;
        long j50 = (j42 * j48) + (j46 * j45) + (j49 * j43);
        long j51 = (long) (i8 + i18);
        long j52 = (long) i25;
        long j53 = (((j46 * j48) + (j49 * j45)) << 1) + (j42 * j51) + (j52 * j43);
        long j54 = (long) (i10 + i20);
        long j55 = (long) i26;
        long j56 = (((j49 * j54) + (j55 * j48)) << 1) + (j52 * j51);
        long j57 = j41 + (j53 - j37);
        int i27 = ((int) j57) & OooO0Oo;
        long j58 = (j57 >> 26) + (((((j49 * j48) << 1) + ((((j42 * j54) + (j46 * j51)) + (j52 * j45)) + (j43 * j55))) - j15) - j32);
        int i28 = ((int) j58) & OooO0OO;
        long j59 = j34 + ((((j58 >> 25) + (((((j46 * j54) + (j49 * j51)) + (j52 * j48)) + (j55 * j45)) << 1)) - j38) * 38);
        iArr3[0] = ((int) j59) & OooO0Oo;
        long j60 = (j59 >> 26) + j35 + ((j56 - j39) * 38);
        iArr3[1] = ((int) j60) & OooO0Oo;
        long j61 = (j60 >> 26) + j36 + ((((j52 * j54) + (j55 * j51)) - j40) * 38);
        iArr3[2] = ((int) j61) & OooO0OO;
        long j62 = (j61 >> 25) + j37 + ((((j55 * j54) << 1) - j41) * 38);
        iArr3[3] = ((int) j62) & OooO0Oo;
        long j63 = (j62 >> 26) + j15 + (j32 * 38);
        iArr3[4] = ((int) j63) & OooO0OO;
        long j64 = (j63 >> 25) + j38 + (j44 - j34);
        iArr3[5] = ((int) j64) & OooO0Oo;
        long j65 = (j64 >> 26) + j39 + (j47 - j35);
        iArr3[6] = ((int) j65) & OooO0Oo;
        long j66 = (j65 >> 26) + j40 + (j50 - j36);
        iArr3[7] = ((int) j66) & OooO0OO;
        long j67 = (j66 >> 25) + ((long) i27);
        iArr3[8] = ((int) j67) & OooO0Oo;
        iArr3[9] = i28 + ((int) (j67 >> 26));
    }

    public static void OooO0OO(int[] iArr) {
        int i = (iArr[9] >>> 23) & 1;
        OooO0O0(iArr, i);
        OooO0O0(iArr, -i);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = iArr[8];
        int i10 = iArr[9];
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) (i2 * 2);
        long j4 = j * j3;
        long j5 = (long) (i3 * 2);
        long j6 = (long) i2;
        long j7 = (j * j5) + (j6 * j6);
        long j8 = (long) (i4 * 2);
        long j9 = (long) (i5 * 2);
        long j10 = (((long) i3) * j5) + (j * j9) + (j6 * j8);
        long j11 = (j3 * j9) + (j8 * j5);
        long j12 = (long) i4;
        long j13 = (j5 * j9) + (j12 * j12);
        long j14 = j12 * j9;
        long j15 = ((long) i5) * j9;
        int i11 = i10 * 2;
        long j16 = (long) i6;
        long j17 = j16 * j16;
        long j18 = (long) (i7 * 2);
        long j19 = j16 * j18;
        long j20 = (long) (i8 * 2);
        long j21 = (long) i7;
        long j22 = (j16 * j20) + (j21 * j21);
        long j23 = (long) (i9 * 2);
        long j24 = (long) i11;
        long j25 = (((long) i8) * j20) + (j16 * j24) + (j21 * j23);
        long j26 = (j18 * j24) + (j23 * j20);
        long j27 = (long) i9;
        long j28 = j2 - (j26 * 38);
        long j29 = j4 - (((j20 * j24) + (j27 * j27)) * 38);
        long j30 = j7 - ((j27 * j24) * 38);
        long j31 = ((j3 * j5) + (j * j8)) - ((((long) i10) * j24) * 38);
        long j32 = j11 - j17;
        long j33 = j13 - j19;
        long j34 = j14 - j22;
        long j35 = j15 - ((j18 * j20) + (j16 * j23));
        int i12 = i2 + i7;
        int i13 = i3 + i8;
        int i14 = i4 + i9;
        int i15 = i5 + i10;
        long j36 = (long) (i + i6);
        long j37 = j36 * j36;
        long j38 = (long) (i12 * 2);
        long j39 = j36 * j38;
        long j40 = (long) (i13 * 2);
        long j41 = (long) i12;
        long j42 = (j36 * j40) + (j41 * j41);
        long j43 = (long) (i14 * 2);
        long j44 = (long) (i15 * 2);
        long j45 = (j38 * j44) + (j43 * j40);
        long j46 = (long) i14;
        long j47 = (j40 * j44) + (j46 * j46);
        long j48 = j46 * j44;
        long j49 = ((long) i15) * j44;
        long j50 = j35 + (((j38 * j40) + (j36 * j43)) - j31);
        int i16 = ((int) j50) & OooO0Oo;
        long j51 = (j50 >> 26) + (((((((long) i13) * j40) + (j36 * j44)) + (j41 * j43)) - j10) - j25);
        int i17 = ((int) j51) & OooO0OO;
        long j52 = j28 + ((((j51 >> 25) + j45) - j32) * 38);
        iArr2[0] = ((int) j52) & OooO0Oo;
        long j53 = (j52 >> 26) + j29 + ((j47 - j33) * 38);
        iArr2[1] = ((int) j53) & OooO0Oo;
        long j54 = (j53 >> 26) + j30 + ((j48 - j34) * 38);
        iArr2[2] = ((int) j54) & OooO0OO;
        long j55 = (j54 >> 25) + j31 + ((j49 - j35) * 38);
        iArr2[3] = ((int) j55) & OooO0Oo;
        long j56 = (j55 >> 26) + j10 + (38 * j25);
        iArr2[4] = ((int) j56) & OooO0OO;
        long j57 = (j56 >> 25) + j32 + (j37 - j28);
        iArr2[5] = ((int) j57) & OooO0Oo;
        long j58 = (j57 >> 26) + j33 + (j39 - j29);
        iArr2[6] = ((int) j58) & OooO0Oo;
        long j59 = (j58 >> 26) + j34 + (j42 - j30);
        iArr2[7] = ((int) j59) & OooO0OO;
        long j60 = (j59 >> 25) + ((long) i16);
        iArr2[8] = ((int) j60) & OooO0Oo;
        iArr2[9] = i17 + ((int) (j60 >> 26));
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
        OooO0OO(iArr, iArr2);
        OooO0O0(iArr, iArr2, iArr2);
        int[] OooO00o2 = OooO00o();
        OooO0OO(iArr2, OooO00o2);
        OooO0O0(iArr, OooO00o2, OooO00o2);
        OooO0O0(OooO00o2, 2, OooO00o2);
        OooO0O0(iArr2, OooO00o2, OooO00o2);
        int[] OooO00o3 = OooO00o();
        OooO0O0(OooO00o2, 5, OooO00o3);
        OooO0O0(OooO00o2, OooO00o3, OooO00o3);
        int[] OooO00o4 = OooO00o();
        OooO0O0(OooO00o3, 5, OooO00o4);
        OooO0O0(OooO00o2, OooO00o4, OooO00o4);
        OooO0O0(OooO00o4, 10, OooO00o2);
        OooO0O0(OooO00o3, OooO00o2, OooO00o2);
        OooO0O0(OooO00o2, 25, OooO00o3);
        OooO0O0(OooO00o2, OooO00o3, OooO00o3);
        OooO0O0(OooO00o3, 25, OooO00o4);
        OooO0O0(OooO00o2, OooO00o4, OooO00o4);
        OooO0O0(OooO00o4, 50, OooO00o2);
        OooO0O0(OooO00o3, OooO00o2, OooO00o2);
        OooO0O0(OooO00o2, (int) C7531o0Oooo0o.OooO0O0, OooO00o3);
        OooO0O0(OooO00o2, OooO00o3, OooO00o3);
        OooO0O0(OooO00o3, 2, OooO00o2);
        OooO0O0(OooO00o2, iArr, iArr3);
    }

    public static void OooO0Oo(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 10; i++) {
            iArr3[i] = iArr[i] - iArr2[i];
        }
    }

    public static void OooO0o(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            iArr[i] = 0;
        }
    }

    public static void OooO0o0(int[] iArr) {
        iArr[0] = iArr[0] - 1;
    }
}
