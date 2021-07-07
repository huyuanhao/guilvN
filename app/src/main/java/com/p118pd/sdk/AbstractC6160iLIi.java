package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLIi  reason: case insensitive filesystem */
public abstract class AbstractC6160iLIi {
    public static final int OooO00o = 16;
    public static final int OooO0O0 = 268435455;

    public static int OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        return ((bArr[i2 + 1] & 255) << 16) | (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
    }

    public static void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        int i3 = i2 + 1;
        bArr[i3] = (byte) (i >>> 8);
        bArr[i3 + 1] = (byte) (i >>> 16);
    }

    public static void OooO00o(int i, int[] iArr) {
        int[] OooO00o2 = OooO00o();
        OooO0OO(OooO00o2, iArr, OooO00o2);
        C1iiIiI.m21316OooO00o(16, i, OooO00o2, 0, iArr, 0);
    }

    public static void OooO00o(int i, int[] iArr, int[] iArr2) {
        int i2 = 0 - i;
        for (int i3 = 0; i3 < 16; i3++) {
            int i4 = iArr[i3];
            int i5 = iArr2[i3];
            int i6 = (i4 ^ i5) & i2;
            iArr[i3] = i4 ^ i6;
            iArr2[i3] = i5 ^ i6;
        }
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr) {
        OooO00o(bArr, i, iArr, 0);
        OooO00o(bArr, i + 7, iArr, 2);
        OooO00o(bArr, i + 14, iArr, 4);
        OooO00o(bArr, i + 21, iArr, 6);
        OooO00o(bArr, i + 28, iArr, 8);
        OooO00o(bArr, i + 35, iArr, 10);
        OooO00o(bArr, i + 42, iArr, 12);
        OooO00o(bArr, i + 49, iArr, 14);
    }

    public static void OooO00o(byte[] bArr, int i, int[] iArr, int i2) {
        int OooO0O02 = OooO0O0(bArr, i);
        int OooO00o2 = OooO00o(bArr, i + 4);
        iArr[i2] = 268435455 & OooO0O02;
        iArr[i2 + 1] = (OooO00o2 << 4) | (OooO0O02 >>> 28);
    }

    public static void OooO00o(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void OooO00o(int[] iArr, int i) {
        iArr[i] = iArr[i] + 1;
    }

    public static void OooO00o(int[] iArr, int i, byte[] bArr, int i2) {
        int i3 = iArr[i];
        int i4 = iArr[i + 1];
        OooO0O0((i4 << 28) | i3, bArr, i2);
        OooO00o(i4 >>> 4, bArr, i2 + 4);
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
        int i12 = iArr[10];
        int i13 = iArr[11];
        int i14 = iArr[12];
        int i15 = iArr[13];
        int i16 = iArr[14];
        int i17 = iArr[15];
        long j = (long) i3;
        long j2 = (long) i;
        long j3 = j * j2;
        int i18 = ((int) j3) & OooO0O0;
        long j4 = ((long) i7) * j2;
        int i19 = ((int) j4) & OooO0O0;
        long j5 = ((long) i11) * j2;
        int i20 = ((int) j5) & OooO0O0;
        long j6 = ((long) i15) * j2;
        int i21 = ((int) j6) & OooO0O0;
        long j7 = (j3 >>> 28) + (((long) i4) * j2);
        iArr2[2] = ((int) j7) & OooO0O0;
        long j8 = j7 >>> 28;
        long j9 = (j4 >>> 28) + (((long) i8) * j2);
        iArr2[6] = ((int) j9) & OooO0O0;
        long j10 = (j5 >>> 28) + (((long) i12) * j2);
        iArr2[10] = ((int) j10) & OooO0O0;
        long j11 = (j6 >>> 28) + (((long) i16) * j2);
        iArr2[14] = ((int) j11) & OooO0O0;
        long j12 = j8 + (((long) i5) * j2);
        iArr2[3] = ((int) j12) & OooO0O0;
        long j13 = (j9 >>> 28) + (((long) i9) * j2);
        iArr2[7] = ((int) j13) & OooO0O0;
        long j14 = (j10 >>> 28) + (((long) i13) * j2);
        iArr2[11] = ((int) j14) & OooO0O0;
        long j15 = (j11 >>> 28) + (((long) i17) * j2);
        iArr2[15] = ((int) j15) & OooO0O0;
        long j16 = j15 >>> 28;
        long j17 = (j12 >>> 28) + (((long) i6) * j2);
        iArr2[4] = ((int) j17) & OooO0O0;
        long j18 = (j13 >>> 28) + j16 + (((long) i10) * j2);
        iArr2[8] = ((int) j18) & OooO0O0;
        long j19 = (j14 >>> 28) + (((long) i14) * j2);
        iArr2[12] = ((int) j19) & OooO0O0;
        long j20 = j16 + (((long) i2) * j2);
        iArr2[0] = ((int) j20) & OooO0O0;
        iArr2[1] = i18 + ((int) (j20 >>> 28));
        iArr2[5] = i19 + ((int) (j17 >>> 28));
        iArr2[9] = i20 + ((int) (j18 >>> 28));
        iArr2[13] = i21 + ((int) (j19 >>> 28));
    }

    public static void OooO00o(int[] iArr, int i, int[] iArr2, int i2) {
        for (int i3 = 0; i3 < 16; i3++) {
            iArr2[i2 + i3] = iArr[i + i3];
        }
    }

    public static void OooO00o(int[] iArr, byte[] bArr, int i) {
        OooO00o(iArr, 0, bArr, i);
        OooO00o(iArr, 2, bArr, i + 7);
        OooO00o(iArr, 4, bArr, i + 14);
        OooO00o(iArr, 6, bArr, i + 21);
        OooO00o(iArr, 8, bArr, i + 28);
        OooO00o(iArr, 10, bArr, i + 35);
        OooO00o(iArr, 12, bArr, i + 42);
        OooO00o(iArr, 14, bArr, i + 49);
    }

    public static void OooO00o(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = OooO00o();
        OooO0OO(iArr, OooO00o2);
        OooO0O0(OooO00o2, 2, OooO00o2);
        OooO0O0(OooO00o2, iArr, iArr2);
    }

    public static void OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i = 0; i < 16; i++) {
            iArr3[i] = iArr[i] + iArr2[i];
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17084OooO00o(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            i |= iArr[i2];
        }
        return i == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17085OooO00o(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] OooO00o2 = OooO00o();
        int[] OooO00o3 = OooO00o();
        OooO0Oo(iArr, OooO00o2);
        OooO0O0(OooO00o2, iArr2, OooO00o2);
        OooO0Oo(OooO00o2, OooO00o3);
        OooO0O0(OooO00o2, iArr, OooO00o2);
        OooO0O0(OooO00o3, iArr, OooO00o3);
        OooO0O0(OooO00o3, iArr2, OooO00o3);
        int[] OooO00o4 = OooO00o();
        OooO0OO(OooO00o3, OooO00o4);
        OooO0O0(OooO00o4, OooO00o2, OooO00o4);
        int[] OooO00o5 = OooO00o();
        OooO0Oo(OooO00o4, OooO00o5);
        OooO0O0(OooO00o5, iArr2, OooO00o5);
        OooO0OO(iArr, OooO00o5, OooO00o5);
        OooO0OO(OooO00o5);
        if (!m17084OooO00o(OooO00o5)) {
            return false;
        }
        OooO00o(OooO00o4, 0, iArr3, 0);
        return true;
    }

    public static int[] OooO00o() {
        return new int[16];
    }

    public static int[] OooO00o(int i) {
        return new int[(i * 16)];
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i3 + (i2 >>> 28);
        int i18 = i2 & OooO0O0;
        int i19 = i7 + (i6 >>> 28);
        int i20 = i6 & OooO0O0;
        int i21 = i11 + (i10 >>> 28);
        int i22 = i10 & OooO0O0;
        int i23 = i15 + (i14 >>> 28);
        int i24 = i14 & OooO0O0;
        int i25 = i4 + (i17 >>> 28);
        int i26 = i17 & OooO0O0;
        int i27 = i8 + (i19 >>> 28);
        int i28 = i19 & OooO0O0;
        int i29 = i12 + (i21 >>> 28);
        int i30 = i21 & OooO0O0;
        int i31 = i16 + (i23 >>> 28);
        int i32 = i23 & OooO0O0;
        int i33 = i31 >>> 28;
        int i34 = i31 & OooO0O0;
        int i35 = i + i33;
        int i36 = i5 + (i25 >>> 28);
        int i37 = i25 & OooO0O0;
        int i38 = i9 + i33 + (i27 >>> 28);
        int i39 = i27 & OooO0O0;
        int i40 = i13 + (i29 >>> 28);
        int i41 = i29 & OooO0O0;
        int i42 = i18 + (i35 >>> 28);
        int i43 = i35 & OooO0O0;
        int i44 = i20 + (i36 >>> 28);
        int i45 = i36 & OooO0O0;
        int i46 = i22 + (i38 >>> 28);
        int i47 = i38 & OooO0O0;
        int i48 = i40 & OooO0O0;
        iArr[0] = i43;
        iArr[1] = i42;
        iArr[2] = i26;
        iArr[3] = i37;
        iArr[4] = i45;
        iArr[5] = i44;
        iArr[6] = i28;
        iArr[7] = i39;
        iArr[8] = i47;
        iArr[9] = i46;
        iArr[10] = i30;
        iArr[11] = i41;
        iArr[12] = i48;
        iArr[13] = i24 + (i40 >>> 28);
        iArr[14] = i32;
        iArr[15] = i34;
    }

    public static void OooO0O0(int[] iArr, int i) {
        int i2 = iArr[15];
        int i3 = i2 & OooO0O0;
        int i4 = (i2 >> 28) + i;
        iArr[8] = iArr[8] + i4;
        for (int i5 = 0; i5 < 15; i5++) {
            int i6 = i4 + iArr[i5];
            iArr[i5] = i6 & OooO0O0;
            i4 = i6 >> 28;
        }
        iArr[15] = i3 + i4;
    }

    public static void OooO0O0(int[] iArr, int i, int[] iArr2) {
        OooO0Oo(iArr, iArr2);
        while (true) {
            i--;
            if (i > 0) {
                OooO0Oo(iArr2, iArr2);
            } else {
                return;
            }
        }
    }

    public static void OooO0O0(int[] iArr, int[] iArr2) {
        OooO0OO(OooO00o(), iArr, iArr2);
    }

    public static void OooO0O0(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = iArr2[15];
        int i33 = i + i9;
        int i34 = i3 + i11;
        int i35 = i4 + i12;
        int i36 = i5 + i13;
        int i37 = i6 + i14;
        int i38 = i7 + i15;
        int i39 = i17 + i25;
        int i40 = i18 + i26;
        int i41 = i19 + i27;
        int i42 = i20 + i28;
        int i43 = i21 + i29;
        int i44 = i22 + i30;
        int i45 = i23 + i31;
        int i46 = i24 + i32;
        long j = (long) i;
        long j2 = (long) i17;
        long j3 = j * j2;
        long j4 = (long) i8;
        long j5 = (long) i18;
        long j6 = j4 * j5;
        long j7 = (long) i7;
        long j8 = (long) i19;
        long j9 = (long) i6;
        long j10 = (long) i20;
        long j11 = (long) i5;
        long j12 = (long) i21;
        long j13 = (long) i4;
        long j14 = (long) i22;
        long j15 = (long) i3;
        long j16 = (long) i23;
        long j17 = (long) i2;
        long j18 = (long) i24;
        long j19 = (long) i9;
        long j20 = (long) i25;
        long j21 = j19 * j20;
        long j22 = (long) i16;
        long j23 = (long) i26;
        long j24 = j22 * j23;
        long j25 = (long) i15;
        long j26 = (long) i27;
        long j27 = (long) i14;
        long j28 = (long) i28;
        long j29 = (long) i13;
        long j30 = (long) i29;
        long j31 = (long) i12;
        long j32 = (long) i30;
        long j33 = (long) i11;
        long j34 = (long) i31;
        long j35 = (long) i10;
        long j36 = (long) i32;
        long j37 = (long) i33;
        long j38 = (long) i39;
        long j39 = j37 * j38;
        long j40 = (long) (i8 + i16);
        long j41 = (long) i40;
        long j42 = j40 * j41;
        long j43 = (long) i38;
        long j44 = (long) i41;
        long j45 = (long) i37;
        long j46 = (long) i42;
        long j47 = (long) i36;
        long j48 = (long) i43;
        long j49 = (long) i35;
        long j50 = (long) i44;
        long j51 = (long) i34;
        long j52 = (long) i45;
        long j53 = (long) (i2 + i10);
        long j54 = (long) i46;
        long j55 = j42 + (j43 * j44) + (j45 * j46) + (j47 * j48) + (j49 * j50) + (j51 * j52) + (j53 * j54);
        long j56 = ((j3 + j21) + j55) - ((((((j6 + (j7 * j8)) + (j9 * j10)) + (j11 * j12)) + (j13 * j14)) + (j15 * j16)) + (j17 * j18));
        int i47 = ((int) j56) & OooO0O0;
        long j57 = j56 >>> 28;
        long j58 = ((((((((j24 + (j25 * j26)) + (j27 * j28)) + (j29 * j30)) + (j31 * j32)) + (j33 * j34)) + (j35 * j36)) + j39) - j3) + j55;
        int i48 = ((int) j58) & OooO0O0;
        long j59 = (j17 * j2) + (j * j5);
        long j60 = (j22 * j26) + (j25 * j28) + (j27 * j30) + (j29 * j32) + (j31 * j34) + (j33 * j36);
        long j61 = (j53 * j38) + (j37 * j41);
        long j62 = (j40 * j44) + (j43 * j46) + (j45 * j48) + (j47 * j50) + (j49 * j52) + (j51 * j54);
        long j63 = j57 + (((j59 + ((j35 * j20) + (j19 * j23))) + j62) - ((((((j4 * j8) + (j7 * j10)) + (j9 * j12)) + (j11 * j14)) + (j13 * j16)) + (j15 * j18)));
        int i49 = ((int) j63) & OooO0O0;
        long j64 = (j58 >>> 28) + ((j60 + j61) - j59) + j62;
        int i50 = ((int) j64) & OooO0O0;
        long j65 = (j15 * j2) + (j17 * j5) + (j * j8);
        long j66 = (j22 * j28) + (j25 * j30) + (j27 * j32) + (j29 * j34) + (j31 * j36);
        long j67 = (j51 * j38) + (j53 * j41) + (j37 * j44);
        long j68 = (j40 * j46) + (j43 * j48) + (j45 * j50) + (j47 * j52) + (j49 * j54);
        long j69 = (j63 >>> 28) + (((j65 + (((j33 * j20) + (j35 * j23)) + (j19 * j26))) + j68) - (((((j4 * j10) + (j7 * j12)) + (j9 * j14)) + (j11 * j16)) + (j13 * j18)));
        int i51 = ((int) j69) & OooO0O0;
        long j70 = (j64 >>> 28) + ((j66 + j67) - j65) + j68;
        int i52 = ((int) j70) & OooO0O0;
        long j71 = (j13 * j2) + (j15 * j5) + (j17 * j8) + (j * j10);
        long j72 = (j22 * j30) + (j25 * j32) + (j27 * j34) + (j29 * j36);
        long j73 = (j49 * j38) + (j51 * j41) + (j53 * j44) + (j37 * j46);
        long j74 = (j40 * j48) + (j43 * j50) + (j45 * j52) + (j47 * j54);
        long j75 = (j69 >>> 28) + (((j71 + ((((j31 * j20) + (j33 * j23)) + (j35 * j26)) + (j19 * j28))) + j74) - ((((j4 * j12) + (j7 * j14)) + (j9 * j16)) + (j11 * j18)));
        int i53 = ((int) j75) & OooO0O0;
        long j76 = (j70 >>> 28) + ((j72 + j73) - j71) + j74;
        int i54 = ((int) j76) & OooO0O0;
        long j77 = (j11 * j2) + (j13 * j5) + (j15 * j8) + (j17 * j10) + (j * j12);
        long j78 = (j22 * j32) + (j25 * j34) + (j27 * j36);
        long j79 = (j47 * j38) + (j49 * j41) + (j51 * j44) + (j53 * j46) + (j37 * j48);
        long j80 = (j40 * j50) + (j43 * j52) + (j45 * j54);
        long j81 = (j75 >>> 28) + (((j77 + (((((j29 * j20) + (j31 * j23)) + (j33 * j26)) + (j35 * j28)) + (j19 * j30))) + j80) - (((j4 * j14) + (j7 * j16)) + (j9 * j18)));
        int i55 = ((int) j81) & OooO0O0;
        long j82 = (j76 >>> 28) + ((j78 + j79) - j77) + j80;
        int i56 = ((int) j82) & OooO0O0;
        long j83 = (j9 * j2) + (j11 * j5) + (j13 * j8) + (j15 * j10) + (j17 * j12) + (j * j14);
        long j84 = (j22 * j34) + (j25 * j36);
        long j85 = (j45 * j38) + (j47 * j41) + (j49 * j44) + (j51 * j46) + (j53 * j48) + (j37 * j50);
        long j86 = (j40 * j52) + (j43 * j54);
        long j87 = (j81 >>> 28) + (((j83 + ((((((j27 * j20) + (j29 * j23)) + (j31 * j26)) + (j33 * j28)) + (j35 * j30)) + (j19 * j32))) + j86) - ((j4 * j16) + (j7 * j18)));
        int i57 = ((int) j87) & OooO0O0;
        long j88 = (j82 >>> 28) + ((j84 + j85) - j83) + j86;
        int i58 = ((int) j88) & OooO0O0;
        long j89 = (j7 * j2) + (j9 * j5) + (j11 * j8) + (j13 * j10) + (j15 * j12) + (j17 * j14) + (j * j16);
        long j90 = j22 * j36;
        long j91 = (j43 * j38) + (j45 * j41) + (j47 * j44) + (j49 * j46) + (j51 * j48) + (j53 * j50) + (j37 * j52);
        long j92 = j40 * j54;
        long j93 = (j87 >>> 28) + (((j89 + (((((((j25 * j20) + (j27 * j23)) + (j29 * j26)) + (j31 * j28)) + (j33 * j30)) + (j35 * j32)) + (j19 * j34))) + j92) - (j4 * j18));
        int i59 = ((int) j93) & OooO0O0;
        long j94 = (j88 >>> 28) + ((j90 + j91) - j89) + j92;
        int i60 = ((int) j94) & OooO0O0;
        long j95 = (j2 * j4) + (j5 * j7) + (j9 * j8) + (j11 * j10) + (j13 * j12) + (j15 * j14) + (j17 * j16) + (j * j18);
        long j96 = (j40 * j38) + (j43 * j41) + (j45 * j44) + (j47 * j46) + (j49 * j48) + (j51 * j50) + (j53 * j52) + (j37 * j54);
        long j97 = (j93 >>> 28) + j95 + (j22 * j20) + (j23 * j25) + (j27 * j26) + (j29 * j28) + (j31 * j30) + (j33 * j32) + (j35 * j34) + (j19 * j36);
        int i61 = ((int) j97) & OooO0O0;
        long j98 = (j94 >>> 28) + (j96 - j95);
        int i62 = ((int) j98) & OooO0O0;
        long j99 = j98 >>> 28;
        long j100 = (j97 >>> 28) + j99 + ((long) i48);
        int i63 = ((int) j100) & OooO0O0;
        long j101 = j99 + ((long) i47);
        iArr3[0] = ((int) j101) & OooO0O0;
        iArr3[1] = i49 + ((int) (j101 >>> 28));
        iArr3[2] = i51;
        iArr3[3] = i53;
        iArr3[4] = i55;
        iArr3[5] = i57;
        iArr3[6] = i59;
        iArr3[7] = i61;
        iArr3[8] = i63;
        iArr3[9] = i50 + ((int) (j100 >>> 28));
        iArr3[10] = i52;
        iArr3[11] = i54;
        iArr3[12] = i56;
        iArr3[13] = i58;
        iArr3[14] = i60;
        iArr3[15] = i62;
    }

    public static void OooO0OO(int[] iArr) {
        OooO0O0(iArr, 1);
        OooO0O0(iArr, -1);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2) {
        int[] OooO00o2 = OooO00o();
        OooO0Oo(iArr, OooO00o2);
        OooO0O0(iArr, OooO00o2, OooO00o2);
        int[] OooO00o3 = OooO00o();
        OooO0Oo(OooO00o2, OooO00o3);
        OooO0O0(iArr, OooO00o3, OooO00o3);
        int[] OooO00o4 = OooO00o();
        OooO0O0(OooO00o3, 3, OooO00o4);
        OooO0O0(OooO00o3, OooO00o4, OooO00o4);
        int[] OooO00o5 = OooO00o();
        OooO0O0(OooO00o4, 3, OooO00o5);
        OooO0O0(OooO00o3, OooO00o5, OooO00o5);
        int[] OooO00o6 = OooO00o();
        OooO0O0(OooO00o5, 9, OooO00o6);
        OooO0O0(OooO00o5, OooO00o6, OooO00o6);
        int[] OooO00o7 = OooO00o();
        OooO0Oo(OooO00o6, OooO00o7);
        OooO0O0(iArr, OooO00o7, OooO00o7);
        int[] OooO00o8 = OooO00o();
        OooO0O0(OooO00o7, 18, OooO00o8);
        OooO0O0(OooO00o6, OooO00o8, OooO00o8);
        int[] OooO00o9 = OooO00o();
        OooO0O0(OooO00o8, 37, OooO00o9);
        OooO0O0(OooO00o8, OooO00o9, OooO00o9);
        int[] OooO00o10 = OooO00o();
        OooO0O0(OooO00o9, 37, OooO00o10);
        OooO0O0(OooO00o8, OooO00o10, OooO00o10);
        int[] OooO00o11 = OooO00o();
        OooO0O0(OooO00o10, 111, OooO00o11);
        OooO0O0(OooO00o10, OooO00o11, OooO00o11);
        int[] OooO00o12 = OooO00o();
        OooO0Oo(OooO00o11, OooO00o12);
        OooO0O0(iArr, OooO00o12, OooO00o12);
        int[] OooO00o13 = OooO00o();
        OooO0O0(OooO00o12, 223, OooO00o13);
        OooO0O0(OooO00o13, OooO00o11, iArr2);
    }

    public static void OooO0OO(int[] iArr, int[] iArr2, int[] iArr3) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = iArr2[0];
        int i18 = iArr2[1];
        int i19 = iArr2[2];
        int i20 = iArr2[3];
        int i21 = iArr2[4];
        int i22 = iArr2[5];
        int i23 = iArr2[6];
        int i24 = iArr2[7];
        int i25 = iArr2[8];
        int i26 = iArr2[9];
        int i27 = iArr2[10];
        int i28 = iArr2[11];
        int i29 = iArr2[12];
        int i30 = iArr2[13];
        int i31 = iArr2[14];
        int i32 = (i2 + 536870910) - i18;
        int i33 = (i6 + 536870910) - i22;
        int i34 = (i10 + 536870910) - i26;
        int i35 = (i14 + 536870910) - i30;
        int i36 = ((i3 + 536870910) - i19) + (i32 >>> 28);
        int i37 = i32 & OooO0O0;
        int i38 = ((i7 + 536870910) - i23) + (i33 >>> 28);
        int i39 = i33 & OooO0O0;
        int i40 = ((i11 + 536870910) - i27) + (i34 >>> 28);
        int i41 = i34 & OooO0O0;
        int i42 = ((i15 + 536870910) - i31) + (i35 >>> 28);
        int i43 = i35 & OooO0O0;
        int i44 = ((i4 + 536870910) - i20) + (i36 >>> 28);
        int i45 = i36 & OooO0O0;
        int i46 = ((i8 + 536870910) - i24) + (i38 >>> 28);
        int i47 = i38 & OooO0O0;
        int i48 = ((i12 + 536870910) - i28) + (i40 >>> 28);
        int i49 = i40 & OooO0O0;
        int i50 = ((i16 + 536870910) - iArr2[15]) + (i42 >>> 28);
        int i51 = i42 & OooO0O0;
        int i52 = i50 >>> 28;
        int i53 = i50 & OooO0O0;
        int i54 = ((i + 536870910) - i17) + i52;
        int i55 = ((i5 + 536870910) - i21) + (i44 >>> 28);
        int i56 = i44 & OooO0O0;
        int i57 = ((i9 + 536870908) - i25) + i52 + (i46 >>> 28);
        int i58 = i46 & OooO0O0;
        int i59 = ((i13 + 536870910) - i29) + (i48 >>> 28);
        int i60 = i48 & OooO0O0;
        int i61 = i37 + (i54 >>> 28);
        int i62 = i54 & OooO0O0;
        int i63 = i39 + (i55 >>> 28);
        int i64 = i55 & OooO0O0;
        int i65 = i41 + (i57 >>> 28);
        int i66 = i57 & OooO0O0;
        int i67 = i59 & OooO0O0;
        iArr3[0] = i62;
        iArr3[1] = i61;
        iArr3[2] = i45;
        iArr3[3] = i56;
        iArr3[4] = i64;
        iArr3[5] = i63;
        iArr3[6] = i47;
        iArr3[7] = i58;
        iArr3[8] = i66;
        iArr3[9] = i65;
        iArr3[10] = i49;
        iArr3[11] = i60;
        iArr3[12] = i67;
        iArr3[13] = i43 + (i59 >>> 28);
        iArr3[14] = i51;
        iArr3[15] = i53;
    }

    public static void OooO0Oo(int[] iArr) {
        iArr[0] = 1;
        for (int i = 1; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void OooO0Oo(int[] iArr, int[] iArr2) {
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
        int i11 = iArr[10];
        int i12 = iArr[11];
        int i13 = iArr[12];
        int i14 = iArr[13];
        int i15 = iArr[14];
        int i16 = iArr[15];
        int i17 = i * 2;
        int i18 = i2 * 2;
        int i19 = i3 * 2;
        int i20 = i4 * 2;
        int i21 = i5 * 2;
        int i22 = i6 * 2;
        int i23 = i7 * 2;
        int i24 = i9 * 2;
        int i25 = i10 * 2;
        int i26 = i11 * 2;
        int i27 = i12 * 2;
        int i28 = i13 * 2;
        int i29 = i14 * 2;
        int i30 = i15 * 2;
        int i31 = i + i9;
        int i32 = i2 + i10;
        int i33 = i3 + i11;
        int i34 = i4 + i12;
        int i35 = i5 + i13;
        int i36 = i6 + i14;
        int i37 = i7 + i15;
        int i38 = i8 + i16;
        int i39 = i31 * 2;
        int i40 = i32 * 2;
        int i41 = i33 * 2;
        int i42 = i34 * 2;
        int i43 = i36 * 2;
        long j = (long) i;
        long j2 = j * j;
        long j3 = (long) i8;
        long j4 = (long) i18;
        long j5 = j3 * j4;
        long j6 = (long) i7;
        long j7 = (long) i19;
        long j8 = (long) i6;
        long j9 = (long) i20;
        long j10 = (long) i5;
        long j11 = (long) i9;
        long j12 = (long) i16;
        long j13 = (long) i25;
        long j14 = j12 * j13;
        long j15 = (long) i15;
        long j16 = (long) i26;
        long j17 = (long) i14;
        long j18 = (long) i27;
        long j19 = (long) i13;
        long j20 = (long) i31;
        long j21 = (long) i38;
        long j22 = (long) i40;
        long j23 = j21 * j22;
        long j24 = (long) i37;
        long j25 = (long) i41;
        long j26 = (long) i36;
        long j27 = (long) i42;
        long j28 = (long) i35;
        long j29 = j23 + (j24 * j25) + (j26 * j27) + (j28 * j28);
        long j30 = ((j2 + (j11 * j11)) + j29) - (((j5 + (j6 * j7)) + (j8 * j9)) + (j10 * j10));
        int i44 = ((int) j30) & OooO0O0;
        long j31 = (((((j14 + (j15 * j16)) + (j17 * j18)) + (j19 * j19)) + (j20 * j20)) - j2) + j29;
        int i45 = ((int) j31) & OooO0O0;
        long j32 = j31 >>> 28;
        long j33 = (long) i2;
        long j34 = (long) i17;
        long j35 = j33 * j34;
        long j36 = (long) i21;
        long j37 = (long) i10;
        long j38 = (long) i24;
        long j39 = j37 * j38;
        long j40 = (long) i28;
        long j41 = (long) i32;
        long j42 = (long) i39;
        long j43 = (long) (i35 * 2);
        long j44 = (j21 * j25) + (j24 * j27) + (j26 * j43);
        long j45 = (j30 >>> 28) + (((j35 + j39) + j44) - (((j3 * j7) + (j6 * j9)) + (j8 * j36)));
        int i46 = ((int) j45) & OooO0O0;
        long j46 = j32 + (((((j12 * j16) + (j15 * j18)) + (j17 * j40)) + (j41 * j42)) - j35) + j44;
        int i47 = ((int) j46) & OooO0O0;
        long j47 = j46 >>> 28;
        long j48 = (long) i3;
        long j49 = (j48 * j34) + (j33 * j33);
        long j50 = (j3 * j9) + (j6 * j36) + (j8 * j8);
        long j51 = (long) i11;
        long j52 = (j51 * j38) + (j37 * j37);
        long j53 = (long) i33;
        long j54 = (j53 * j42) + (j41 * j41);
        long j55 = (j21 * j27) + (j24 * j43) + (j26 * j26);
        long j56 = (j45 >>> 28) + (((j49 + j52) + j55) - j50);
        int i48 = ((int) j56) & OooO0O0;
        long j57 = j47 + (((((j12 * j18) + (j15 * j40)) + (j17 * j17)) + j54) - j49) + j55;
        int i49 = ((int) j57) & OooO0O0;
        long j58 = (long) i4;
        long j59 = (j58 * j34) + (j48 * j4);
        long j60 = (long) i22;
        long j61 = (long) i12;
        long j62 = (j61 * j38) + (j51 * j13);
        long j63 = (long) i29;
        long j64 = (long) i34;
        long j65 = j43 * j21;
        long j66 = (long) i43;
        long j67 = j65 + (j24 * j66);
        long j68 = (j56 >>> 28) + (((j59 + j62) + j67) - ((j3 * j36) + (j6 * j60)));
        int i50 = ((int) j68) & OooO0O0;
        long j69 = (j57 >>> 28) + ((((j12 * j40) + (j15 * j63)) + ((j64 * j42) + (j53 * j22))) - j59) + j67;
        int i51 = ((int) j69) & OooO0O0;
        long j70 = (j10 * j34) + (j58 * j4) + (j48 * j48);
        long j71 = (j19 * j38) + (j61 * j13) + (j51 * j51);
        long j72 = (j28 * j42) + (j64 * j22) + (j53 * j53);
        long j73 = (j21 * j66) + (j24 * j24);
        long j74 = (j68 >>> 28) + (((j70 + j71) + j73) - ((j3 * j60) + (j6 * j6)));
        int i52 = ((int) j74) & OooO0O0;
        long j75 = (j69 >>> 28) + ((((j12 * j63) + (j15 * j15)) + j72) - j70) + j73;
        int i53 = ((int) j75) & OooO0O0;
        long j76 = (j8 * j34) + (j10 * j4) + (j58 * j7);
        long j77 = (j17 * j38) + (j19 * j13) + (j61 * j16);
        long j78 = ((long) (i37 * 2)) * j21;
        long j79 = (j74 >>> 28) + (((j76 + j77) + j78) - (((long) i23) * j3));
        int i54 = ((int) j79) & OooO0O0;
        long j80 = (j75 >>> 28) + (((((long) i30) * j12) + (((j26 * j42) + (j28 * j22)) + (j64 * j25))) - j76) + j78;
        int i55 = ((int) j80) & OooO0O0;
        long j81 = (j6 * j34) + (j8 * j4) + (j10 * j7) + (j58 * j58);
        long j82 = j21 * j21;
        long j83 = (j79 >>> 28) + (((j81 + ((((j15 * j38) + (j17 * j13)) + (j19 * j16)) + (j61 * j61))) + j82) - (j3 * j3));
        int i56 = ((int) j83) & OooO0O0;
        long j84 = (j80 >>> 28) + (((j12 * j12) + ((((j24 * j42) + (j26 * j22)) + (j28 * j25)) + (j64 * j64))) - j81) + j82;
        int i57 = ((int) j84) & OooO0O0;
        long j85 = (j3 * j34) + (j6 * j4) + (j8 * j7) + (j10 * j9);
        long j86 = (j83 >>> 28) + (j38 * j12) + (j15 * j13) + (j17 * j16) + (j19 * j18) + j85;
        int i58 = ((int) j86) & OooO0O0;
        long j87 = (j84 >>> 28) + (((((j42 * j21) + (j24 * j22)) + (j26 * j25)) + (j28 * j27)) - j85);
        int i59 = ((int) j87) & OooO0O0;
        long j88 = j87 >>> 28;
        long j89 = (j86 >>> 28) + j88 + ((long) i45);
        int i60 = ((int) j89) & OooO0O0;
        long j90 = j88 + ((long) i44);
        iArr2[0] = ((int) j90) & OooO0O0;
        iArr2[1] = i46 + ((int) (j90 >>> 28));
        iArr2[2] = i48;
        iArr2[3] = i50;
        iArr2[4] = i52;
        iArr2[5] = i54;
        iArr2[6] = i56;
        iArr2[7] = i58;
        iArr2[8] = i60;
        iArr2[9] = i47 + ((int) (j89 >>> 28));
        iArr2[10] = i49;
        iArr2[11] = i51;
        iArr2[12] = i53;
        iArr2[13] = i55;
        iArr2[14] = i57;
        iArr2[15] = i59;
    }

    public static void OooO0o(int[] iArr) {
        for (int i = 0; i < 16; i++) {
            iArr[i] = 0;
        }
    }

    public static void OooO0o0(int[] iArr) {
        int[] OooO00o2 = OooO00o();
        OooO00o2[0] = 1;
        OooO0OO(iArr, OooO00o2, iArr);
    }
}
