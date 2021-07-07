package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II1li1Il */
public class II1li1Il extends L1ill {
    public static final int OooO0Oo = 32;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public static final int[] f15452OooO0Oo = new int[64];
    public static final int OooO0o0 = 16;
    public int[] OooO00o;
    public int[] OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public int[] f15453OooO0OO;

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            f15452OooO0Oo[i2] = (2043430169 >>> (32 - i2)) | (2043430169 << i2);
            i2++;
        }
        for (i = 16; i < 64; i++) {
            int i3 = i % 32;
            f15452OooO0Oo[i] = (2055708042 >>> (32 - i3)) | (2055708042 << i3);
        }
    }

    public II1li1Il() {
        this.OooO00o = new int[8];
        this.OooO0O0 = new int[16];
        this.f15453OooO0OO = new int[68];
        reset();
    }

    public II1li1Il(II1li1Il iI1li1Il) {
        super(iI1li1Il);
        this.OooO00o = new int[8];
        this.OooO0O0 = new int[16];
        this.f15453OooO0OO = new int[68];
        OooO00o(iI1li1Il);
    }

    private int OooO00o(int i) {
        return (i ^ ((i << 9) | (i >>> 23))) ^ ((i << 17) | (i >>> 15));
    }

    private int OooO00o(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private void OooO00o(II1li1Il iI1li1Il) {
        int[] iArr = iI1li1Il.OooO00o;
        int[] iArr2 = this.OooO00o;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
        int[] iArr3 = iI1li1Il.OooO0O0;
        int[] iArr4 = this.OooO0O0;
        System.arraycopy(iArr3, 0, iArr4, 0, iArr4.length);
        this.OooO0OO = iI1li1Il.OooO0OO;
    }

    private int OooO0O0(int i) {
        return (i ^ ((i << 15) | (i >>> 17))) ^ ((i << 23) | (i >>> 9));
    }

    private int OooO0O0(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int OooO0Oo(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        AbstractC6464l1l.OooO00o(this.OooO00o, bArr, i);
        reset();
        return 32;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new II1li1Il(this);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15359OooO00o() {
        return "SM3";
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO00o(long j) {
        int i = this.OooO0OO;
        if (i > 14) {
            this.OooO0O0[i] = 0;
            this.OooO0OO = i + 1;
            OooO0OO();
        }
        while (true) {
            int i2 = this.OooO0OO;
            if (i2 < 14) {
                this.OooO0O0[i2] = 0;
                this.OooO0OO = i2 + 1;
            } else {
                int[] iArr = this.OooO0O0;
                int i3 = i2 + 1;
                this.OooO0OO = i3;
                iArr[i2] = (int) (j >>> 32);
                this.OooO0OO = i3 + 1;
                iArr[i3] = (int) j;
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        II1li1Il iI1li1Il = (II1li1Il) r1;
        super.OooO00o((L1ill) iI1li1Il);
        OooO00o(iI1li1Il);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15360OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.OooO0O0;
        int i5 = this.OooO0OO;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.OooO0OO = i6;
        if (i6 >= 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 32;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO0OO() {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 16) {
                break;
            }
            this.f15453OooO0OO[i2] = this.OooO0O0[i2];
            i2++;
        }
        for (int i3 = 16; i3 < 68; i3++) {
            int[] iArr = this.f15453OooO0OO;
            int i4 = iArr[i3 - 3];
            int i5 = (i4 >>> 17) | (i4 << 15);
            int i6 = iArr[i3 - 13];
            iArr[i3] = (OooO0O0(i5 ^ (iArr[i3 - 16] ^ iArr[i3 - 9])) ^ ((i6 >>> 25) | (i6 << 7))) ^ this.f15453OooO0OO[i3 - 6];
        }
        int[] iArr2 = this.OooO00o;
        int i7 = iArr2[0];
        int i8 = iArr2[1];
        int i9 = iArr2[2];
        int i10 = iArr2[3];
        int i11 = iArr2[4];
        int i12 = iArr2[5];
        int i13 = iArr2[6];
        int i14 = iArr2[7];
        int i15 = i13;
        int i16 = 0;
        for (i = 16; i16 < i; i = 16) {
            int i17 = (i7 << 12) | (i7 >>> 20);
            int i18 = i17 + i11 + f15452OooO0Oo[i16];
            int i19 = (i18 << 7) | (i18 >>> 25);
            int[] iArr3 = this.f15453OooO0OO;
            int i20 = iArr3[i16];
            int i21 = (i8 << 9) | (i8 >>> 23);
            int i22 = (i12 << 19) | (i12 >>> 13);
            i16++;
            i12 = i11;
            i11 = OooO00o(OooO0OO(i11, i12, i15) + i14 + i19 + i20);
            i10 = i9;
            i9 = i21;
            i14 = i15;
            i15 = i22;
            i8 = i7;
            i7 = OooO00o(i7, i8, i9) + i10 + (i19 ^ i17) + (i20 ^ iArr3[i16 + 4]);
        }
        int i23 = i14;
        int i24 = i11;
        int i25 = i15;
        int i26 = i10;
        int i27 = i9;
        int i28 = i8;
        int i29 = i7;
        int i30 = 16;
        while (i30 < 64) {
            int i31 = (i29 << 12) | (i29 >>> 20);
            int i32 = i31 + i24 + f15452OooO0Oo[i30];
            int i33 = (i32 << 7) | (i32 >>> 25);
            int[] iArr4 = this.f15453OooO0OO;
            int i34 = iArr4[i30];
            int i35 = (i28 >>> 23) | (i28 << 9);
            int i36 = (i12 << 19) | (i12 >>> 13);
            i30++;
            i12 = i24;
            i24 = OooO00o(OooO0Oo(i24, i12, i25) + i23 + i33 + i34);
            i26 = i27;
            i27 = i35;
            i28 = i29;
            i29 = OooO0O0(i29, i28, i27) + i26 + (i33 ^ i31) + (i34 ^ iArr4[i30 + 4]);
            i23 = i25;
            i25 = i36;
        }
        int[] iArr5 = this.OooO00o;
        iArr5[0] = i29 ^ iArr5[0];
        iArr5[1] = iArr5[1] ^ i28;
        iArr5[2] = iArr5[2] ^ i27;
        iArr5[3] = iArr5[3] ^ i26;
        iArr5[4] = iArr5[4] ^ i24;
        iArr5[5] = iArr5[5] ^ i12;
        iArr5[6] = i25 ^ iArr5[6];
        iArr5[7] = iArr5[7] ^ i23;
        this.OooO0OO = 0;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        super.reset();
        int[] iArr = this.OooO00o;
        iArr[0] = 1937774191;
        iArr[1] = 1226093241;
        iArr[2] = 388252375;
        iArr[3] = -628488704;
        iArr[4] = -1452330820;
        iArr[5] = 372324522;
        iArr[6] = -477237683;
        iArr[7] = -1325724082;
        this.OooO0OO = 0;
    }
}
