package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨Ill丨1丨  reason: invalid class name and case insensitive filesystem */
public class C5512IIll1 extends C9611iLlI {
    public C5512IIll1() {
    }

    public C5512IIll1(int i) {
        super(i);
    }

    public static void OooO0O0(int i, int[] iArr, int[] iArr2) {
        int i2 = 16;
        if (iArr.length != 16) {
            throw new IllegalArgumentException();
        } else if (iArr2.length != 16) {
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
            int i17 = 12;
            int i18 = iArr[12];
            int i19 = iArr[13];
            int i20 = iArr[14];
            int i21 = iArr[15];
            int i22 = i20;
            int i23 = i19;
            int i24 = i18;
            int i25 = i16;
            int i26 = i15;
            int i27 = i14;
            int i28 = i13;
            int i29 = i11;
            int i30 = i9;
            int i31 = i8;
            int i32 = i7;
            int i33 = i6;
            int i34 = i5;
            int i35 = i4;
            int i36 = i3;
            int i37 = i;
            while (i37 > 0) {
                int i38 = i36 + i32;
                int OooO00o = C9611iLlI.OooO00o(i24 ^ i38, i2);
                int i39 = i28 + OooO00o;
                int OooO00o2 = C9611iLlI.OooO00o(i32 ^ i39, i17);
                int i40 = i38 + OooO00o2;
                int OooO00o3 = C9611iLlI.OooO00o(OooO00o ^ i40, i12);
                int i41 = i39 + OooO00o3;
                int OooO00o4 = C9611iLlI.OooO00o(OooO00o2 ^ i41, i10);
                int i42 = i35 + i31;
                int OooO00o5 = C9611iLlI.OooO00o(i23 ^ i42, i2);
                int i43 = i27 + OooO00o5;
                int OooO00o6 = C9611iLlI.OooO00o(i31 ^ i43, i17);
                int i44 = i42 + OooO00o6;
                int OooO00o7 = C9611iLlI.OooO00o(OooO00o5 ^ i44, i12);
                int i45 = i43 + OooO00o7;
                int OooO00o8 = C9611iLlI.OooO00o(OooO00o6 ^ i45, i10);
                int i46 = i34 + i30;
                int OooO00o9 = C9611iLlI.OooO00o(i22 ^ i46, i2);
                int i47 = i26 + OooO00o9;
                int OooO00o10 = C9611iLlI.OooO00o(i30 ^ i47, i17);
                int i48 = i46 + OooO00o10;
                int OooO00o11 = C9611iLlI.OooO00o(OooO00o9 ^ i48, i12);
                int i49 = i47 + OooO00o11;
                int OooO00o12 = C9611iLlI.OooO00o(OooO00o10 ^ i49, i10);
                int i50 = i33 + i29;
                int OooO00o13 = C9611iLlI.OooO00o(i21 ^ i50, 16);
                int i51 = i25 + OooO00o13;
                int OooO00o14 = C9611iLlI.OooO00o(i29 ^ i51, i17);
                int i52 = i50 + OooO00o14;
                int OooO00o15 = C9611iLlI.OooO00o(OooO00o13 ^ i52, 8);
                int i53 = i51 + OooO00o15;
                int OooO00o16 = C9611iLlI.OooO00o(OooO00o14 ^ i53, 7);
                int i54 = i40 + OooO00o8;
                int OooO00o17 = C9611iLlI.OooO00o(OooO00o15 ^ i54, 16);
                int i55 = i49 + OooO00o17;
                int OooO00o18 = C9611iLlI.OooO00o(OooO00o8 ^ i55, 12);
                i36 = i54 + OooO00o18;
                i21 = C9611iLlI.OooO00o(OooO00o17 ^ i36, 8);
                i26 = i55 + i21;
                i31 = C9611iLlI.OooO00o(OooO00o18 ^ i26, 7);
                int i56 = i44 + OooO00o12;
                int OooO00o19 = C9611iLlI.OooO00o(OooO00o3 ^ i56, 16);
                int i57 = i53 + OooO00o19;
                int OooO00o20 = C9611iLlI.OooO00o(OooO00o12 ^ i57, 12);
                i35 = i56 + OooO00o20;
                i24 = C9611iLlI.OooO00o(OooO00o19 ^ i35, 8);
                i25 = i57 + i24;
                i30 = C9611iLlI.OooO00o(OooO00o20 ^ i25, 7);
                int i58 = i48 + OooO00o16;
                int OooO00o21 = C9611iLlI.OooO00o(OooO00o7 ^ i58, 16);
                int i59 = i41 + OooO00o21;
                int OooO00o22 = C9611iLlI.OooO00o(OooO00o16 ^ i59, 12);
                i34 = i58 + OooO00o22;
                i23 = C9611iLlI.OooO00o(OooO00o21 ^ i34, 8);
                i28 = i59 + i23;
                i29 = C9611iLlI.OooO00o(OooO00o22 ^ i28, 7);
                int i60 = i52 + OooO00o4;
                i2 = 16;
                int OooO00o23 = C9611iLlI.OooO00o(OooO00o11 ^ i60, 16);
                int i61 = i45 + OooO00o23;
                int OooO00o24 = C9611iLlI.OooO00o(OooO00o4 ^ i61, 12);
                i33 = i60 + OooO00o24;
                i22 = C9611iLlI.OooO00o(OooO00o23 ^ i33, 8);
                i27 = i61 + i22;
                i32 = C9611iLlI.OooO00o(OooO00o24 ^ i27, 7);
                i37 -= 2;
                c = 0;
                i17 = 12;
                i12 = 8;
                i10 = 7;
            }
            iArr2[c] = i36 + iArr[c];
            iArr2[1] = i35 + iArr[1];
            iArr2[2] = i34 + iArr[2];
            iArr2[3] = i33 + iArr[3];
            iArr2[4] = i32 + iArr[4];
            iArr2[5] = i31 + iArr[5];
            iArr2[6] = i30 + iArr[6];
            iArr2[7] = i29 + iArr[7];
            iArr2[8] = i28 + iArr[8];
            iArr2[9] = i27 + iArr[9];
            iArr2[10] = i26 + iArr[10];
            iArr2[11] = i25 + iArr[11];
            iArr2[12] = i24 + iArr[12];
            iArr2[13] = i23 + iArr[13];
            iArr2[14] = i22 + iArr[14];
            iArr2[15] = i21 + iArr[15];
        } else {
            throw new IllegalArgumentException("Number of rounds must be even");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    public String OooO00o() {
        return "ChaCha" + ((C9611iLlI) this).OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.I1LLllll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15788OooO00o() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        int i = iArr[12] + 1;
        iArr[12] = i;
        if (i == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6019i1II1, com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    public void OooO00o(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i > 0) {
            int[] iArr = ((C9611iLlI) this).f23191OooO00o;
            iArr[13] = iArr[13] + i;
        }
        int[] iArr2 = ((C9611iLlI) this).f23191OooO00o;
        int i3 = iArr2[12];
        iArr2[12] = iArr2[12] + i2;
        if (i3 != 0 && iArr2[12] < i3) {
            iArr2[13] = iArr2[13] + 1;
        }
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO00o(byte[] bArr) {
        OooO0O0(((C9611iLlI) this).OooO00o, ((C9611iLlI) this).f23191OooO00o, ((C9611iLlI) this).f23193OooO0O0);
        AbstractC6464l1l.OooO0O0(((C9611iLlI) this).f23193OooO0O0, bArr, 0);
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 16 || bArr.length == 32) {
                OooO00o(bArr.length, ((C9611iLlI) this).f23191OooO00o, 0);
                AbstractC6464l1l.OooO00o(bArr, 0, ((C9611iLlI) this).f23191OooO00o, 4, 4);
                AbstractC6464l1l.OooO00o(bArr, bArr.length - 16, ((C9611iLlI) this).f23191OooO00o, 8, 4);
            } else {
                throw new IllegalArgumentException(OooO00o() + " requires 128 bit or 256 bit key");
            }
        }
        AbstractC6464l1l.OooO00o(bArr2, 0, ((C9611iLlI) this).f23191OooO00o, 14, 2);
    }

    @Override // com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    public long OooO0O0() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        return (((long) iArr[13]) << 32) | (((long) iArr[12]) & 4294967295L);
    }

    @Override // com.p118pd.sdk.C9611iLlI, com.p118pd.sdk.C9611iLlI
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m15789OooO0O0() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO0O0(long j) {
        int i = (int) (j >>> 32);
        int i2 = (int) j;
        if (i != 0) {
            int[] iArr = ((C9611iLlI) this).f23191OooO00o;
            if ((((long) iArr[13]) & 4294967295L) >= (((long) i) & 4294967295L)) {
                iArr[13] = iArr[13] - i;
            } else {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }
        int[] iArr2 = ((C9611iLlI) this).f23191OooO00o;
        if ((((long) iArr2[12]) & 4294967295L) >= (4294967295L & ((long) i2))) {
            iArr2[12] = iArr2[12] - i2;
        } else if (iArr2[13] != 0) {
            iArr2[13] = iArr2[13] - 1;
            iArr2[12] = iArr2[12] - i2;
        } else {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
    }

    @Override // com.p118pd.sdk.C9611iLlI
    public void OooO0OO() {
        int[] iArr = ((C9611iLlI) this).f23191OooO00o;
        if (iArr[12] == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int[] iArr2 = ((C9611iLlI) this).f23191OooO00o;
        int i = iArr2[12] - 1;
        iArr2[12] = i;
        if (i == -1) {
            iArr2[13] = iArr2[13] - 1;
        }
    }
}
