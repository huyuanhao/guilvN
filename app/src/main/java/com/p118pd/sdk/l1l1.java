package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1l1丨丨丨  reason: invalid class name */
public class l1l1 {
    public static final int OooO00o = 12;

    public static int OooO00o(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static void OooO00o(int i, int[] iArr) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (i % 2 == 0) {
            char c = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = iArr[3];
            int i7 = iArr[4];
            int i8 = iArr[5];
            int i9 = iArr[6];
            int i10 = 7;
            int i11 = iArr[7];
            int i12 = 8;
            int i13 = iArr[8];
            int i14 = iArr[9];
            int i15 = iArr[10];
            int i16 = iArr[11];
            int i17 = iArr[12];
            int i18 = iArr[13];
            int i19 = iArr[14];
            int i20 = iArr[15];
            int i21 = i19;
            int i22 = i18;
            int i23 = i17;
            int i24 = i16;
            int i25 = i15;
            int i26 = i14;
            int i27 = i13;
            int i28 = i11;
            int i29 = i9;
            int i30 = i8;
            int i31 = i7;
            int i32 = i6;
            int i33 = i5;
            int i34 = i4;
            int i35 = i3;
            int i36 = i;
            while (i36 > 0) {
                int i37 = i35 + i31;
                int OooO00o2 = OooO00o(i23 ^ i37, i2);
                int i38 = i27 + OooO00o2;
                int OooO00o3 = OooO00o(i31 ^ i38, 12);
                int i39 = i37 + OooO00o3;
                int OooO00o4 = OooO00o(OooO00o2 ^ i39, i12);
                int i40 = i38 + OooO00o4;
                int OooO00o5 = OooO00o(OooO00o3 ^ i40, i10);
                int i41 = i34 + i30;
                int OooO00o6 = OooO00o(i22 ^ i41, i2);
                int i42 = i26 + OooO00o6;
                int OooO00o7 = OooO00o(i30 ^ i42, 12);
                int i43 = i41 + OooO00o7;
                int OooO00o8 = OooO00o(OooO00o6 ^ i43, i12);
                int i44 = i42 + OooO00o8;
                int OooO00o9 = OooO00o(OooO00o7 ^ i44, i10);
                int i45 = i33 + i29;
                int OooO00o10 = OooO00o(i21 ^ i45, i2);
                int i46 = i25 + OooO00o10;
                int OooO00o11 = OooO00o(i29 ^ i46, 12);
                int i47 = i45 + OooO00o11;
                int OooO00o12 = OooO00o(OooO00o10 ^ i47, i12);
                int i48 = i46 + OooO00o12;
                int OooO00o13 = OooO00o(OooO00o11 ^ i48, i10);
                int i49 = i32 + i28;
                int OooO00o14 = OooO00o(i20 ^ i49, i2);
                int i50 = i24 + OooO00o14;
                int OooO00o15 = OooO00o(i28 ^ i50, 12);
                int i51 = i49 + OooO00o15;
                int OooO00o16 = OooO00o(OooO00o14 ^ i51, i12);
                int i52 = i50 + OooO00o16;
                int OooO00o17 = OooO00o(OooO00o15 ^ i52, 7);
                int i53 = i39 + OooO00o9;
                int OooO00o18 = OooO00o(OooO00o16 ^ i53, 16);
                int i54 = i48 + OooO00o18;
                int OooO00o19 = OooO00o(OooO00o9 ^ i54, 12);
                i35 = i53 + OooO00o19;
                i20 = OooO00o(OooO00o18 ^ i35, 8);
                i25 = i54 + i20;
                i30 = OooO00o(OooO00o19 ^ i25, 7);
                int i55 = i43 + OooO00o13;
                int OooO00o20 = OooO00o(OooO00o4 ^ i55, 16);
                int i56 = i52 + OooO00o20;
                int OooO00o21 = OooO00o(OooO00o13 ^ i56, 12);
                i34 = i55 + OooO00o21;
                i23 = OooO00o(OooO00o20 ^ i34, 8);
                i24 = i56 + i23;
                i29 = OooO00o(OooO00o21 ^ i24, 7);
                int i57 = i47 + OooO00o17;
                int OooO00o22 = OooO00o(OooO00o8 ^ i57, 16);
                int i58 = i40 + OooO00o22;
                int OooO00o23 = OooO00o(OooO00o17 ^ i58, 12);
                i33 = i57 + OooO00o23;
                i22 = OooO00o(OooO00o22 ^ i33, 8);
                i27 = i58 + i22;
                i28 = OooO00o(OooO00o23 ^ i27, 7);
                int i59 = i51 + OooO00o5;
                i2 = 16;
                int OooO00o24 = OooO00o(OooO00o12 ^ i59, 16);
                int i60 = i44 + OooO00o24;
                int OooO00o25 = OooO00o(OooO00o5 ^ i60, 12);
                i32 = i59 + OooO00o25;
                i21 = OooO00o(OooO00o24 ^ i32, 8);
                i26 = i60 + i21;
                i31 = OooO00o(OooO00o25 ^ i26, 7);
                i36 -= 2;
                c = 0;
                i12 = 8;
                i10 = 7;
            }
            iArr[c] = i35;
            iArr[1] = i34;
            iArr[2] = i33;
            iArr[3] = i32;
            iArr[4] = i31;
            iArr[5] = i30;
            iArr[6] = i29;
            iArr[7] = i28;
            iArr[8] = i27;
            iArr[9] = i26;
            iArr[10] = i25;
            iArr[11] = i24;
            iArr[12] = i23;
            iArr[13] = i22;
            iArr[14] = i21;
            iArr[15] = i20;
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    public void OooO00o(byte[] bArr, byte[] bArr2) {
        int[] iArr = new int[16];
        for (int i = 0; i < 16; i++) {
            iArr[i] = AbstractC6464l1l.OooO0O0(bArr2, i * 4);
        }
        OooO00o(12, iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            AbstractC6464l1l.OooO0O0(iArr[i2], bArr, i2 * 4);
        }
    }
}
