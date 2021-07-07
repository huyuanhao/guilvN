package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1liI  reason: case insensitive filesystem */
public class C6461l1liI extends L1ill implements C1l11i {
    public static final int OooO = 20;
    public static final int OooOO0 = 1518500249;
    public static final int OooOO0O = 1859775393;
    public static final int OooOO0o = -1894007588;
    public static final int OooOOO0 = -899497514;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    public C6461l1liI() {
        this.OooO00o = new int[80];
        reset();
    }

    public C6461l1liI(C6461l1liI l1lii) {
        super(l1lii);
        this.OooO00o = new int[80];
        OooO00o(l1lii);
    }

    public C6461l1liI(byte[] bArr) {
        super(bArr);
        this.OooO00o = new int[80];
        this.OooO0OO = AbstractC6464l1l.OooO00o(bArr, 16);
        this.OooO0Oo = AbstractC6464l1l.OooO00o(bArr, 20);
        this.OooO0o0 = AbstractC6464l1l.OooO00o(bArr, 24);
        this.OooO0o = AbstractC6464l1l.OooO00o(bArr, 28);
        this.OooO0oO = AbstractC6464l1l.OooO00o(bArr, 32);
        this.OooO0oo = AbstractC6464l1l.OooO00o(bArr, 36);
        for (int i = 0; i != this.OooO0oo; i++) {
            this.OooO00o[i] = AbstractC6464l1l.OooO00o(bArr, (i * 4) + 40);
        }
    }

    private int OooO00o(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    private void OooO00o(C6461l1liI l1lii) {
        this.OooO0OO = l1lii.OooO0OO;
        this.OooO0Oo = l1lii.OooO0Oo;
        this.OooO0o0 = l1lii.OooO0o0;
        this.OooO0o = l1lii.OooO0o;
        this.OooO0oO = l1lii.OooO0oO;
        int[] iArr = l1lii.OooO00o;
        System.arraycopy(iArr, 0, this.OooO00o, 0, iArr.length);
        this.OooO0oo = l1lii.OooO0oo;
    }

    private int OooO0O0(int i, int i2, int i3) {
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, i);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, i + 4);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, i + 8);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, i + 12);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C6461l1liI(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17596OooO00o() {
        return LL1i.OooO0O0;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO00o(long j) {
        if (this.OooO0oo > 14) {
            OooO0OO();
        }
        int[] iArr = this.OooO00o;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) j;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        C6461l1liI l1lii = (C6461l1liI) r1;
        super.OooO00o((L1ill) l1lii);
        OooO00o(l1lii);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17597OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.OooO00o;
        int i5 = this.OooO0oo;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.OooO0oo = i6;
        if (i6 == 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17598OooO00o() {
        byte[] bArr = new byte[((this.OooO0oo * 4) + 40)];
        super.OooO00o(bArr);
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, 16);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, 20);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, 24);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, 28);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, 32);
        AbstractC6464l1l.OooO00o(this.OooO0oo, bArr, 36);
        for (int i = 0; i != this.OooO0oo; i++) {
            AbstractC6464l1l.OooO00o(this.OooO00o[i], bArr, (i * 4) + 40);
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 20;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO0OO() {
        for (int i = 16; i < 80; i++) {
            int[] iArr = this.OooO00o;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
        }
        int i3 = this.OooO0OO;
        int i4 = this.OooO0Oo;
        int i5 = this.OooO0o0;
        int i6 = this.OooO0o;
        int i7 = this.OooO0oO;
        int i8 = 0;
        int i9 = 0;
        while (i8 < 4) {
            int i10 = i9 + 1;
            int OooO00o2 = i7 + ((i3 << 5) | (i3 >>> 27)) + OooO00o(i4, i5, i6) + this.OooO00o[i9] + 1518500249;
            int i11 = (i4 >>> 2) | (i4 << 30);
            int i12 = i10 + 1;
            int OooO00o3 = i6 + ((OooO00o2 << 5) | (OooO00o2 >>> 27)) + OooO00o(i3, i11, i5) + this.OooO00o[i10] + 1518500249;
            int i13 = (i3 >>> 2) | (i3 << 30);
            int i14 = i12 + 1;
            int OooO00o4 = i5 + ((OooO00o3 << 5) | (OooO00o3 >>> 27)) + OooO00o(OooO00o2, i13, i11) + this.OooO00o[i12] + 1518500249;
            i7 = (OooO00o2 >>> 2) | (OooO00o2 << 30);
            int i15 = i14 + 1;
            i4 = i11 + ((OooO00o4 << 5) | (OooO00o4 >>> 27)) + OooO00o(OooO00o3, i7, i13) + this.OooO00o[i14] + 1518500249;
            i6 = (OooO00o3 >>> 2) | (OooO00o3 << 30);
            i3 = i13 + ((i4 << 5) | (i4 >>> 27)) + OooO00o(OooO00o4, i6, i7) + this.OooO00o[i15] + 1518500249;
            i5 = (OooO00o4 >>> 2) | (OooO00o4 << 30);
            i8++;
            i9 = i15 + 1;
        }
        int i16 = 0;
        while (i16 < 4) {
            int i17 = i9 + 1;
            int OooO0OO2 = i7 + ((i3 << 5) | (i3 >>> 27)) + OooO0OO(i4, i5, i6) + this.OooO00o[i9] + 1859775393;
            int i18 = (i4 >>> 2) | (i4 << 30);
            int i19 = i17 + 1;
            int OooO0OO3 = i6 + ((OooO0OO2 << 5) | (OooO0OO2 >>> 27)) + OooO0OO(i3, i18, i5) + this.OooO00o[i17] + 1859775393;
            int i20 = (i3 >>> 2) | (i3 << 30);
            int i21 = i19 + 1;
            int OooO0OO4 = i5 + ((OooO0OO3 << 5) | (OooO0OO3 >>> 27)) + OooO0OO(OooO0OO2, i20, i18) + this.OooO00o[i19] + 1859775393;
            i7 = (OooO0OO2 >>> 2) | (OooO0OO2 << 30);
            int i22 = i21 + 1;
            i4 = i18 + ((OooO0OO4 << 5) | (OooO0OO4 >>> 27)) + OooO0OO(OooO0OO3, i7, i20) + this.OooO00o[i21] + 1859775393;
            i6 = (OooO0OO3 >>> 2) | (OooO0OO3 << 30);
            i3 = i20 + ((i4 << 5) | (i4 >>> 27)) + OooO0OO(OooO0OO4, i6, i7) + this.OooO00o[i22] + 1859775393;
            i5 = (OooO0OO4 >>> 2) | (OooO0OO4 << 30);
            i16++;
            i9 = i22 + 1;
        }
        int i23 = 0;
        while (i23 < 4) {
            int i24 = i9 + 1;
            int OooO0O0 = i7 + (((((i3 << 5) | (i3 >>> 27)) + OooO0O0(i4, i5, i6)) + this.OooO00o[i9]) - 1894007588);
            int i25 = (i4 >>> 2) | (i4 << 30);
            int i26 = i24 + 1;
            int OooO0O02 = i6 + (((((OooO0O0 << 5) | (OooO0O0 >>> 27)) + OooO0O0(i3, i25, i5)) + this.OooO00o[i24]) - 1894007588);
            int i27 = (i3 >>> 2) | (i3 << 30);
            int i28 = i26 + 1;
            int OooO0O03 = i5 + (((((OooO0O02 << 5) | (OooO0O02 >>> 27)) + OooO0O0(OooO0O0, i27, i25)) + this.OooO00o[i26]) - 1894007588);
            i7 = (OooO0O0 >>> 2) | (OooO0O0 << 30);
            int i29 = i28 + 1;
            i4 = i25 + (((((OooO0O03 << 5) | (OooO0O03 >>> 27)) + OooO0O0(OooO0O02, i7, i27)) + this.OooO00o[i28]) - 1894007588);
            i6 = (OooO0O02 >>> 2) | (OooO0O02 << 30);
            i3 = i27 + (((((i4 << 5) | (i4 >>> 27)) + OooO0O0(OooO0O03, i6, i7)) + this.OooO00o[i29]) - 1894007588);
            i5 = (OooO0O03 >>> 2) | (OooO0O03 << 30);
            i23++;
            i9 = i29 + 1;
        }
        int i30 = 0;
        while (i30 <= 3) {
            int i31 = i9 + 1;
            int OooO0OO5 = i7 + (((((i3 << 5) | (i3 >>> 27)) + OooO0OO(i4, i5, i6)) + this.OooO00o[i9]) - 899497514);
            int i32 = (i4 >>> 2) | (i4 << 30);
            int i33 = i31 + 1;
            int OooO0OO6 = i6 + (((((OooO0OO5 << 5) | (OooO0OO5 >>> 27)) + OooO0OO(i3, i32, i5)) + this.OooO00o[i31]) - 899497514);
            int i34 = (i3 >>> 2) | (i3 << 30);
            int i35 = i33 + 1;
            int OooO0OO7 = i5 + (((((OooO0OO6 << 5) | (OooO0OO6 >>> 27)) + OooO0OO(OooO0OO5, i34, i32)) + this.OooO00o[i33]) - 899497514);
            i7 = (OooO0OO5 >>> 2) | (OooO0OO5 << 30);
            int i36 = i35 + 1;
            i4 = i32 + (((((OooO0OO7 << 5) | (OooO0OO7 >>> 27)) + OooO0OO(OooO0OO6, i7, i34)) + this.OooO00o[i35]) - 899497514);
            i6 = (OooO0OO6 >>> 2) | (OooO0OO6 << 30);
            i3 = i34 + (((((i4 << 5) | (i4 >>> 27)) + OooO0OO(OooO0OO7, i6, i7)) + this.OooO00o[i36]) - 899497514);
            i5 = (OooO0OO7 >>> 2) | (OooO0OO7 << 30);
            i30++;
            i9 = i36 + 1;
        }
        this.OooO0OO += i3;
        this.OooO0Oo += i4;
        this.OooO0o0 += i5;
        this.OooO0o += i6;
        this.OooO0oO += i7;
        this.OooO0oo = 0;
        for (int i37 = 0; i37 < 16; i37++) {
            this.OooO00o[i37] = 0;
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        super.reset();
        this.OooO0OO = 1732584193;
        this.OooO0Oo = -271733879;
        this.OooO0o0 = -1732584194;
        this.OooO0o = 271733878;
        this.OooO0oO = -1009589776;
        this.OooO0oo = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.OooO00o;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }
}
