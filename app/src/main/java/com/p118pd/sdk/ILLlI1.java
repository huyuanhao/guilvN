package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ILLlI1 */
public final class ILLlI1 extends LlIlLI {
    public static final int OooO0o = 12;
    public static final int OooO0oO = 16;
    public int[] OooOO0O = new int[48];
    public int[] OooOO0o = new int[48];
    public int[] OooOOO = new int[192];
    public int[] OooOOO0 = new int[192];
    public int[] OooOOOO = new int[8];

    @Override // com.p118pd.sdk.LlIlLI, com.p118pd.sdk.LlIlLI, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 16;
    }

    @Override // com.p118pd.sdk.LlIlLI, com.p118pd.sdk.LlIlLI, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15489OooO00o() {
        return "CAST6";
    }

    public final void OooO00o(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = (11 - i6) * 4;
            i3 ^= OooO00o(i4, this.OooOO0o[i7], this.OooOO0O[i7]);
            int i8 = i7 + 1;
            i2 ^= OooO0O0(i3, this.OooOO0o[i8], this.OooOO0O[i8]);
            int i9 = i7 + 2;
            i ^= OooO0OO(i2, this.OooOO0o[i9], this.OooOO0O[i9]);
            int i10 = i7 + 3;
            i4 ^= OooO00o(i, this.OooOO0o[i10], this.OooOO0O[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = (11 - i5) * 4;
            int i12 = i11 + 3;
            i4 ^= OooO00o(i, this.OooOO0o[i12], this.OooOO0O[i12]);
            int i13 = i11 + 2;
            i ^= OooO0OO(i2, this.OooOO0o[i13], this.OooOO0O[i13]);
            int i14 = i11 + 1;
            i2 ^= OooO0O0(i3, this.OooOO0o[i14], this.OooOO0O[i14]);
            i3 ^= OooO00o(i4, this.OooOO0o[i11], this.OooOO0O[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    @Override // com.p118pd.sdk.LlIlLI
    public void OooO00o(byte[] bArr) {
        int i = 1518500249;
        int i2 = 19;
        for (int i3 = 0; i3 < 24; i3++) {
            for (int i4 = 0; i4 < 8; i4++) {
                int i5 = (i3 * 8) + i4;
                this.OooOOO[i5] = i;
                i += 1859775393;
                this.OooOOO0[i5] = i2;
                i2 = (i2 + 17) & 31;
            }
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i6 = 0; i6 < 8; i6++) {
            this.OooOOOO[i6] = OooO00o(bArr2, i6 * 4);
        }
        for (int i7 = 0; i7 < 12; i7++) {
            int i8 = i7 * 2;
            int i9 = i8 * 8;
            int[] iArr = this.OooOOOO;
            iArr[6] = iArr[6] ^ OooO00o(iArr[7], this.OooOOO[i9], this.OooOOO0[i9]);
            int[] iArr2 = this.OooOOOO;
            int i10 = i9 + 1;
            iArr2[5] = iArr2[5] ^ OooO0O0(iArr2[6], this.OooOOO[i10], this.OooOOO0[i10]);
            int[] iArr3 = this.OooOOOO;
            int i11 = i9 + 2;
            iArr3[4] = iArr3[4] ^ OooO0OO(iArr3[5], this.OooOOO[i11], this.OooOOO0[i11]);
            int[] iArr4 = this.OooOOOO;
            int i12 = i9 + 3;
            iArr4[3] = OooO00o(iArr4[4], this.OooOOO[i12], this.OooOOO0[i12]) ^ iArr4[3];
            int[] iArr5 = this.OooOOOO;
            int i13 = i9 + 4;
            iArr5[2] = OooO0O0(iArr5[3], this.OooOOO[i13], this.OooOOO0[i13]) ^ iArr5[2];
            int[] iArr6 = this.OooOOOO;
            int i14 = i9 + 5;
            iArr6[1] = OooO0OO(iArr6[2], this.OooOOO[i14], this.OooOOO0[i14]) ^ iArr6[1];
            int[] iArr7 = this.OooOOOO;
            int i15 = i9 + 6;
            iArr7[0] = iArr7[0] ^ OooO00o(iArr7[1], this.OooOOO[i15], this.OooOOO0[i15]);
            int[] iArr8 = this.OooOOOO;
            int i16 = i9 + 7;
            iArr8[7] = OooO0O0(iArr8[0], this.OooOOO[i16], this.OooOOO0[i16]) ^ iArr8[7];
            int i17 = (i8 + 1) * 8;
            int[] iArr9 = this.OooOOOO;
            iArr9[6] = iArr9[6] ^ OooO00o(iArr9[7], this.OooOOO[i17], this.OooOOO0[i17]);
            int[] iArr10 = this.OooOOOO;
            int i18 = i17 + 1;
            iArr10[5] = iArr10[5] ^ OooO0O0(iArr10[6], this.OooOOO[i18], this.OooOOO0[i18]);
            int[] iArr11 = this.OooOOOO;
            int i19 = i17 + 2;
            iArr11[4] = iArr11[4] ^ OooO0OO(iArr11[5], this.OooOOO[i19], this.OooOOO0[i19]);
            int[] iArr12 = this.OooOOOO;
            int i20 = i17 + 3;
            iArr12[3] = OooO00o(iArr12[4], this.OooOOO[i20], this.OooOOO0[i20]) ^ iArr12[3];
            int[] iArr13 = this.OooOOOO;
            int i21 = i17 + 4;
            iArr13[2] = OooO0O0(iArr13[3], this.OooOOO[i21], this.OooOOO0[i21]) ^ iArr13[2];
            int[] iArr14 = this.OooOOOO;
            int i22 = i17 + 5;
            iArr14[1] = OooO0OO(iArr14[2], this.OooOOO[i22], this.OooOOO0[i22]) ^ iArr14[1];
            int[] iArr15 = this.OooOOOO;
            int i23 = i17 + 6;
            iArr15[0] = iArr15[0] ^ OooO00o(iArr15[1], this.OooOOO[i23], this.OooOOO0[i23]);
            int[] iArr16 = this.OooOOOO;
            int i24 = i17 + 7;
            iArr16[7] = OooO0O0(iArr16[0], this.OooOOO[i24], this.OooOOO0[i24]) ^ iArr16[7];
            int[] iArr17 = this.OooOO0O;
            int i25 = i7 * 4;
            int[] iArr18 = this.OooOOOO;
            iArr17[i25] = iArr18[0] & 31;
            int i26 = i25 + 1;
            iArr17[i26] = iArr18[2] & 31;
            int i27 = i25 + 2;
            iArr17[i27] = iArr18[4] & 31;
            int i28 = i25 + 3;
            iArr17[i28] = iArr18[6] & 31;
            int[] iArr19 = this.OooOO0o;
            iArr19[i25] = iArr18[7];
            iArr19[i26] = iArr18[5];
            iArr19[i27] = iArr18[3];
            iArr19[i28] = iArr18[1];
        }
    }

    @Override // com.p118pd.sdk.LlIlLI
    public int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        OooO00o(OooO00o(bArr, i), OooO00o(bArr, i + 4), OooO00o(bArr, i + 8), OooO00o(bArr, i + 12), iArr);
        OooO00o(iArr[0], bArr2, i2);
        OooO00o(iArr[1], bArr2, i2 + 4);
        OooO00o(iArr[2], bArr2, i2 + 8);
        OooO00o(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    public final void OooO0O0(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6 = 0;
        while (true) {
            if (i6 >= 6) {
                break;
            }
            int i7 = i6 * 4;
            i3 ^= OooO00o(i4, this.OooOO0o[i7], this.OooOO0O[i7]);
            int i8 = i7 + 1;
            i2 ^= OooO0O0(i3, this.OooOO0o[i8], this.OooOO0O[i8]);
            int i9 = i7 + 2;
            i ^= OooO0OO(i2, this.OooOO0o[i9], this.OooOO0O[i9]);
            int i10 = i7 + 3;
            i4 ^= OooO00o(i, this.OooOO0o[i10], this.OooOO0O[i10]);
            i6++;
        }
        for (i5 = 6; i5 < 12; i5++) {
            int i11 = i5 * 4;
            int i12 = i11 + 3;
            i4 ^= OooO00o(i, this.OooOO0o[i12], this.OooOO0O[i12]);
            int i13 = i11 + 2;
            i ^= OooO0OO(i2, this.OooOO0o[i13], this.OooOO0O[i13]);
            int i14 = i11 + 1;
            i2 ^= OooO0O0(i3, this.OooOO0o[i14], this.OooOO0O[i14]);
            i3 ^= OooO00o(i4, this.OooOO0o[i11], this.OooOO0O[i11]);
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = i3;
        iArr[3] = i4;
    }

    @Override // com.p118pd.sdk.LlIlLI
    public int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = new int[4];
        OooO0O0(OooO00o(bArr, i), OooO00o(bArr, i + 4), OooO00o(bArr, i + 8), OooO00o(bArr, i + 12), iArr);
        OooO00o(iArr[0], bArr2, i2);
        OooO00o(iArr[1], bArr2, i2 + 4);
        OooO00o(iArr[2], bArr2, i2 + 8);
        OooO00o(iArr[3], bArr2, i2 + 12);
        return 16;
    }

    @Override // com.p118pd.sdk.LlIlLI, com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
