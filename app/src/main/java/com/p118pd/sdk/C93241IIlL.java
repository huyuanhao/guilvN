package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1丨丨IIlL  reason: invalid class name and case insensitive filesystem */
public class C93241IIlL extends L1ill {
    public static final int OooO0oo = 16;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;

    public C93241IIlL() {
        this.OooO00o = new int[16];
        reset();
    }

    public C93241IIlL(C93241IIlL r2) {
        super(r2);
        this.OooO00o = new int[16];
        OooO00o(r2);
    }

    private int OooO00o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int OooO00o(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int OooO00o(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO00o(i2, i3, i4) + i5, i6);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void OooO00o(C93241IIlL r5) {
        super.OooO00o((L1ill) r5);
        this.OooO0OO = r5.OooO0OO;
        this.OooO0Oo = r5.OooO0Oo;
        this.OooO0o0 = r5.OooO0o0;
        this.OooO0o = r5.OooO0o;
        int[] iArr = r5.OooO00o;
        System.arraycopy(iArr, 0, this.OooO00o, 0, iArr.length);
        this.OooO0oO = r5.OooO0oO;
    }

    private int OooO0O0(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    private int OooO0O0(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO0O0(i2, i3, i4) + i5 + 1518500249, i6);
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i | (i2 ^ -1)) ^ i3;
    }

    private int OooO0OO(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO0OO(i2, i3, i4) + i5 + 1859775393, i6);
    }

    private int OooO0Oo(int i, int i2, int i3) {
        return (i & i3) | (i2 & (i3 ^ -1));
    }

    private int OooO0Oo(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(((i + OooO0Oo(i2, i3, i4)) + i5) - 1894007588, i6);
    }

    private int OooO0o(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO0O0(i2, i3, i4) + i5 + 1836072691, i6);
    }

    private int OooO0o0(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO00o(i2, i3, i4) + i5, i6);
    }

    private int OooO0oO(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO0OO(i2, i3, i4) + i5 + 1548603684, i6);
    }

    private int OooO0oo(int i, int i2, int i3, int i4, int i5, int i6) {
        return OooO00o(i + OooO0Oo(i2, i3, i4) + i5 + 1352829926, i6);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        OooO00o(this.OooO0OO, bArr, i);
        OooO00o(this.OooO0Oo, bArr, i + 4);
        OooO00o(this.OooO0o0, bArr, i + 8);
        OooO00o(this.OooO0o, bArr, i + 12);
        reset();
        return 16;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C93241IIlL(this);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21359OooO00o() {
        return "RIPEMD128";
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO00o(long j) {
        if (this.OooO0oO > 14) {
            OooO0OO();
        }
        int[] iArr = this.OooO00o;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        OooO00o((C93241IIlL) r1);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21360OooO00o(byte[] bArr, int i) {
        int[] iArr = this.OooO00o;
        int i2 = this.OooO0oO;
        int i3 = i2 + 1;
        this.OooO0oO = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 16;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO0OO() {
        int i = this.OooO0OO;
        int i2 = this.OooO0Oo;
        int i3 = this.OooO0o0;
        int i4 = this.OooO0o;
        int OooO00o2 = OooO00o(i, i2, i3, i4, this.OooO00o[0], 11);
        int OooO00o3 = OooO00o(i4, OooO00o2, i2, i3, this.OooO00o[1], 14);
        int OooO00o4 = OooO00o(i3, OooO00o3, OooO00o2, i2, this.OooO00o[2], 15);
        int OooO00o5 = OooO00o(i2, OooO00o4, OooO00o3, OooO00o2, this.OooO00o[3], 12);
        int OooO00o6 = OooO00o(OooO00o2, OooO00o5, OooO00o4, OooO00o3, this.OooO00o[4], 5);
        int OooO00o7 = OooO00o(OooO00o3, OooO00o6, OooO00o5, OooO00o4, this.OooO00o[5], 8);
        int OooO00o8 = OooO00o(OooO00o4, OooO00o7, OooO00o6, OooO00o5, this.OooO00o[6], 7);
        int OooO00o9 = OooO00o(OooO00o5, OooO00o8, OooO00o7, OooO00o6, this.OooO00o[7], 9);
        int OooO00o10 = OooO00o(OooO00o6, OooO00o9, OooO00o8, OooO00o7, this.OooO00o[8], 11);
        int OooO00o11 = OooO00o(OooO00o7, OooO00o10, OooO00o9, OooO00o8, this.OooO00o[9], 13);
        int OooO00o12 = OooO00o(OooO00o8, OooO00o11, OooO00o10, OooO00o9, this.OooO00o[10], 14);
        int OooO00o13 = OooO00o(OooO00o9, OooO00o12, OooO00o11, OooO00o10, this.OooO00o[11], 15);
        int OooO00o14 = OooO00o(OooO00o10, OooO00o13, OooO00o12, OooO00o11, this.OooO00o[12], 6);
        int OooO00o15 = OooO00o(OooO00o11, OooO00o14, OooO00o13, OooO00o12, this.OooO00o[13], 7);
        int OooO00o16 = OooO00o(OooO00o12, OooO00o15, OooO00o14, OooO00o13, this.OooO00o[14], 9);
        int OooO00o17 = OooO00o(OooO00o13, OooO00o16, OooO00o15, OooO00o14, this.OooO00o[15], 8);
        int OooO0O0 = OooO0O0(OooO00o14, OooO00o17, OooO00o16, OooO00o15, this.OooO00o[7], 7);
        int OooO0O02 = OooO0O0(OooO00o15, OooO0O0, OooO00o17, OooO00o16, this.OooO00o[4], 6);
        int OooO0O03 = OooO0O0(OooO00o16, OooO0O02, OooO0O0, OooO00o17, this.OooO00o[13], 8);
        int OooO0O04 = OooO0O0(OooO00o17, OooO0O03, OooO0O02, OooO0O0, this.OooO00o[1], 13);
        int OooO0O05 = OooO0O0(OooO0O0, OooO0O04, OooO0O03, OooO0O02, this.OooO00o[10], 11);
        int OooO0O06 = OooO0O0(OooO0O02, OooO0O05, OooO0O04, OooO0O03, this.OooO00o[6], 9);
        int OooO0O07 = OooO0O0(OooO0O03, OooO0O06, OooO0O05, OooO0O04, this.OooO00o[15], 7);
        int OooO0O08 = OooO0O0(OooO0O04, OooO0O07, OooO0O06, OooO0O05, this.OooO00o[3], 15);
        int OooO0O09 = OooO0O0(OooO0O05, OooO0O08, OooO0O07, OooO0O06, this.OooO00o[12], 7);
        int OooO0O010 = OooO0O0(OooO0O06, OooO0O09, OooO0O08, OooO0O07, this.OooO00o[0], 12);
        int OooO0O011 = OooO0O0(OooO0O07, OooO0O010, OooO0O09, OooO0O08, this.OooO00o[9], 15);
        int OooO0O012 = OooO0O0(OooO0O08, OooO0O011, OooO0O010, OooO0O09, this.OooO00o[5], 9);
        int OooO0O013 = OooO0O0(OooO0O09, OooO0O012, OooO0O011, OooO0O010, this.OooO00o[2], 11);
        int OooO0O014 = OooO0O0(OooO0O010, OooO0O013, OooO0O012, OooO0O011, this.OooO00o[14], 7);
        int OooO0O015 = OooO0O0(OooO0O011, OooO0O014, OooO0O013, OooO0O012, this.OooO00o[11], 13);
        int OooO0O016 = OooO0O0(OooO0O012, OooO0O015, OooO0O014, OooO0O013, this.OooO00o[8], 12);
        int OooO0OO2 = OooO0OO(OooO0O013, OooO0O016, OooO0O015, OooO0O014, this.OooO00o[3], 11);
        int OooO0OO3 = OooO0OO(OooO0O014, OooO0OO2, OooO0O016, OooO0O015, this.OooO00o[10], 13);
        int OooO0OO4 = OooO0OO(OooO0O015, OooO0OO3, OooO0OO2, OooO0O016, this.OooO00o[14], 6);
        int OooO0OO5 = OooO0OO(OooO0O016, OooO0OO4, OooO0OO3, OooO0OO2, this.OooO00o[4], 7);
        int OooO0OO6 = OooO0OO(OooO0OO2, OooO0OO5, OooO0OO4, OooO0OO3, this.OooO00o[9], 14);
        int OooO0OO7 = OooO0OO(OooO0OO3, OooO0OO6, OooO0OO5, OooO0OO4, this.OooO00o[15], 9);
        int OooO0OO8 = OooO0OO(OooO0OO4, OooO0OO7, OooO0OO6, OooO0OO5, this.OooO00o[8], 13);
        int OooO0OO9 = OooO0OO(OooO0OO5, OooO0OO8, OooO0OO7, OooO0OO6, this.OooO00o[1], 15);
        int OooO0OO10 = OooO0OO(OooO0OO6, OooO0OO9, OooO0OO8, OooO0OO7, this.OooO00o[2], 14);
        int OooO0OO11 = OooO0OO(OooO0OO7, OooO0OO10, OooO0OO9, OooO0OO8, this.OooO00o[7], 8);
        int OooO0OO12 = OooO0OO(OooO0OO8, OooO0OO11, OooO0OO10, OooO0OO9, this.OooO00o[0], 13);
        int OooO0OO13 = OooO0OO(OooO0OO9, OooO0OO12, OooO0OO11, OooO0OO10, this.OooO00o[6], 6);
        int OooO0OO14 = OooO0OO(OooO0OO10, OooO0OO13, OooO0OO12, OooO0OO11, this.OooO00o[13], 5);
        int OooO0OO15 = OooO0OO(OooO0OO11, OooO0OO14, OooO0OO13, OooO0OO12, this.OooO00o[11], 12);
        int OooO0OO16 = OooO0OO(OooO0OO12, OooO0OO15, OooO0OO14, OooO0OO13, this.OooO00o[5], 7);
        int OooO0OO17 = OooO0OO(OooO0OO13, OooO0OO16, OooO0OO15, OooO0OO14, this.OooO00o[12], 5);
        int OooO0Oo2 = OooO0Oo(OooO0OO14, OooO0OO17, OooO0OO16, OooO0OO15, this.OooO00o[1], 11);
        int OooO0Oo3 = OooO0Oo(OooO0OO15, OooO0Oo2, OooO0OO17, OooO0OO16, this.OooO00o[9], 12);
        int OooO0Oo4 = OooO0Oo(OooO0OO16, OooO0Oo3, OooO0Oo2, OooO0OO17, this.OooO00o[11], 14);
        int OooO0Oo5 = OooO0Oo(OooO0OO17, OooO0Oo4, OooO0Oo3, OooO0Oo2, this.OooO00o[10], 15);
        int OooO0Oo6 = OooO0Oo(OooO0Oo2, OooO0Oo5, OooO0Oo4, OooO0Oo3, this.OooO00o[0], 14);
        int OooO0Oo7 = OooO0Oo(OooO0Oo3, OooO0Oo6, OooO0Oo5, OooO0Oo4, this.OooO00o[8], 15);
        int OooO0Oo8 = OooO0Oo(OooO0Oo4, OooO0Oo7, OooO0Oo6, OooO0Oo5, this.OooO00o[12], 9);
        int OooO0Oo9 = OooO0Oo(OooO0Oo5, OooO0Oo8, OooO0Oo7, OooO0Oo6, this.OooO00o[4], 8);
        int OooO0Oo10 = OooO0Oo(OooO0Oo6, OooO0Oo9, OooO0Oo8, OooO0Oo7, this.OooO00o[13], 9);
        int OooO0Oo11 = OooO0Oo(OooO0Oo7, OooO0Oo10, OooO0Oo9, OooO0Oo8, this.OooO00o[3], 14);
        int OooO0Oo12 = OooO0Oo(OooO0Oo8, OooO0Oo11, OooO0Oo10, OooO0Oo9, this.OooO00o[7], 5);
        int OooO0Oo13 = OooO0Oo(OooO0Oo9, OooO0Oo12, OooO0Oo11, OooO0Oo10, this.OooO00o[15], 6);
        int OooO0Oo14 = OooO0Oo(OooO0Oo10, OooO0Oo13, OooO0Oo12, OooO0Oo11, this.OooO00o[14], 8);
        int OooO0Oo15 = OooO0Oo(OooO0Oo11, OooO0Oo14, OooO0Oo13, OooO0Oo12, this.OooO00o[5], 6);
        int OooO0Oo16 = OooO0Oo(OooO0Oo12, OooO0Oo15, OooO0Oo14, OooO0Oo13, this.OooO00o[6], 5);
        int OooO0Oo17 = OooO0Oo(OooO0Oo13, OooO0Oo16, OooO0Oo15, OooO0Oo14, this.OooO00o[2], 12);
        int OooO0oo2 = OooO0oo(i, i2, i3, i4, this.OooO00o[5], 8);
        int OooO0oo3 = OooO0oo(i4, OooO0oo2, i2, i3, this.OooO00o[14], 9);
        int OooO0oo4 = OooO0oo(i3, OooO0oo3, OooO0oo2, i2, this.OooO00o[7], 9);
        int OooO0oo5 = OooO0oo(i2, OooO0oo4, OooO0oo3, OooO0oo2, this.OooO00o[0], 11);
        int OooO0oo6 = OooO0oo(OooO0oo2, OooO0oo5, OooO0oo4, OooO0oo3, this.OooO00o[9], 13);
        int OooO0oo7 = OooO0oo(OooO0oo3, OooO0oo6, OooO0oo5, OooO0oo4, this.OooO00o[2], 15);
        int OooO0oo8 = OooO0oo(OooO0oo4, OooO0oo7, OooO0oo6, OooO0oo5, this.OooO00o[11], 15);
        int OooO0oo9 = OooO0oo(OooO0oo5, OooO0oo8, OooO0oo7, OooO0oo6, this.OooO00o[4], 5);
        int OooO0oo10 = OooO0oo(OooO0oo6, OooO0oo9, OooO0oo8, OooO0oo7, this.OooO00o[13], 7);
        int OooO0oo11 = OooO0oo(OooO0oo7, OooO0oo10, OooO0oo9, OooO0oo8, this.OooO00o[6], 7);
        int OooO0oo12 = OooO0oo(OooO0oo8, OooO0oo11, OooO0oo10, OooO0oo9, this.OooO00o[15], 8);
        int OooO0oo13 = OooO0oo(OooO0oo9, OooO0oo12, OooO0oo11, OooO0oo10, this.OooO00o[8], 11);
        int OooO0oo14 = OooO0oo(OooO0oo10, OooO0oo13, OooO0oo12, OooO0oo11, this.OooO00o[1], 14);
        int OooO0oo15 = OooO0oo(OooO0oo11, OooO0oo14, OooO0oo13, OooO0oo12, this.OooO00o[10], 14);
        int OooO0oo16 = OooO0oo(OooO0oo12, OooO0oo15, OooO0oo14, OooO0oo13, this.OooO00o[3], 12);
        int OooO0oo17 = OooO0oo(OooO0oo13, OooO0oo16, OooO0oo15, OooO0oo14, this.OooO00o[12], 6);
        int OooO0oO2 = OooO0oO(OooO0oo14, OooO0oo17, OooO0oo16, OooO0oo15, this.OooO00o[6], 9);
        int OooO0oO3 = OooO0oO(OooO0oo15, OooO0oO2, OooO0oo17, OooO0oo16, this.OooO00o[11], 13);
        int OooO0oO4 = OooO0oO(OooO0oo16, OooO0oO3, OooO0oO2, OooO0oo17, this.OooO00o[3], 15);
        int OooO0oO5 = OooO0oO(OooO0oo17, OooO0oO4, OooO0oO3, OooO0oO2, this.OooO00o[7], 7);
        int OooO0oO6 = OooO0oO(OooO0oO2, OooO0oO5, OooO0oO4, OooO0oO3, this.OooO00o[0], 12);
        int OooO0oO7 = OooO0oO(OooO0oO3, OooO0oO6, OooO0oO5, OooO0oO4, this.OooO00o[13], 8);
        int OooO0oO8 = OooO0oO(OooO0oO4, OooO0oO7, OooO0oO6, OooO0oO5, this.OooO00o[5], 9);
        int OooO0oO9 = OooO0oO(OooO0oO5, OooO0oO8, OooO0oO7, OooO0oO6, this.OooO00o[10], 11);
        int OooO0oO10 = OooO0oO(OooO0oO6, OooO0oO9, OooO0oO8, OooO0oO7, this.OooO00o[14], 7);
        int OooO0oO11 = OooO0oO(OooO0oO7, OooO0oO10, OooO0oO9, OooO0oO8, this.OooO00o[15], 7);
        int OooO0oO12 = OooO0oO(OooO0oO8, OooO0oO11, OooO0oO10, OooO0oO9, this.OooO00o[8], 12);
        int OooO0oO13 = OooO0oO(OooO0oO9, OooO0oO12, OooO0oO11, OooO0oO10, this.OooO00o[12], 7);
        int OooO0oO14 = OooO0oO(OooO0oO10, OooO0oO13, OooO0oO12, OooO0oO11, this.OooO00o[4], 6);
        int OooO0oO15 = OooO0oO(OooO0oO11, OooO0oO14, OooO0oO13, OooO0oO12, this.OooO00o[9], 15);
        int OooO0oO16 = OooO0oO(OooO0oO12, OooO0oO15, OooO0oO14, OooO0oO13, this.OooO00o[1], 13);
        int OooO0oO17 = OooO0oO(OooO0oO13, OooO0oO16, OooO0oO15, OooO0oO14, this.OooO00o[2], 11);
        int OooO0o2 = OooO0o(OooO0oO14, OooO0oO17, OooO0oO16, OooO0oO15, this.OooO00o[15], 9);
        int OooO0o3 = OooO0o(OooO0oO15, OooO0o2, OooO0oO17, OooO0oO16, this.OooO00o[5], 7);
        int OooO0o4 = OooO0o(OooO0oO16, OooO0o3, OooO0o2, OooO0oO17, this.OooO00o[1], 15);
        int OooO0o5 = OooO0o(OooO0oO17, OooO0o4, OooO0o3, OooO0o2, this.OooO00o[3], 11);
        int OooO0o6 = OooO0o(OooO0o2, OooO0o5, OooO0o4, OooO0o3, this.OooO00o[7], 8);
        int OooO0o7 = OooO0o(OooO0o3, OooO0o6, OooO0o5, OooO0o4, this.OooO00o[14], 6);
        int OooO0o8 = OooO0o(OooO0o4, OooO0o7, OooO0o6, OooO0o5, this.OooO00o[6], 6);
        int OooO0o9 = OooO0o(OooO0o5, OooO0o8, OooO0o7, OooO0o6, this.OooO00o[9], 14);
        int OooO0o10 = OooO0o(OooO0o6, OooO0o9, OooO0o8, OooO0o7, this.OooO00o[11], 12);
        int OooO0o11 = OooO0o(OooO0o7, OooO0o10, OooO0o9, OooO0o8, this.OooO00o[8], 13);
        int OooO0o12 = OooO0o(OooO0o8, OooO0o11, OooO0o10, OooO0o9, this.OooO00o[12], 5);
        int OooO0o13 = OooO0o(OooO0o9, OooO0o12, OooO0o11, OooO0o10, this.OooO00o[2], 14);
        int OooO0o14 = OooO0o(OooO0o10, OooO0o13, OooO0o12, OooO0o11, this.OooO00o[10], 13);
        int OooO0o15 = OooO0o(OooO0o11, OooO0o14, OooO0o13, OooO0o12, this.OooO00o[0], 13);
        int OooO0o16 = OooO0o(OooO0o12, OooO0o15, OooO0o14, OooO0o13, this.OooO00o[4], 7);
        int OooO0o17 = OooO0o(OooO0o13, OooO0o16, OooO0o15, OooO0o14, this.OooO00o[13], 5);
        int OooO0o02 = OooO0o0(OooO0o14, OooO0o17, OooO0o16, OooO0o15, this.OooO00o[8], 15);
        int OooO0o03 = OooO0o0(OooO0o15, OooO0o02, OooO0o17, OooO0o16, this.OooO00o[6], 5);
        int OooO0o04 = OooO0o0(OooO0o16, OooO0o03, OooO0o02, OooO0o17, this.OooO00o[4], 8);
        int OooO0o05 = OooO0o0(OooO0o17, OooO0o04, OooO0o03, OooO0o02, this.OooO00o[1], 11);
        int OooO0o06 = OooO0o0(OooO0o02, OooO0o05, OooO0o04, OooO0o03, this.OooO00o[3], 14);
        int OooO0o07 = OooO0o0(OooO0o03, OooO0o06, OooO0o05, OooO0o04, this.OooO00o[11], 14);
        int OooO0o08 = OooO0o0(OooO0o04, OooO0o07, OooO0o06, OooO0o05, this.OooO00o[15], 6);
        int OooO0o09 = OooO0o0(OooO0o05, OooO0o08, OooO0o07, OooO0o06, this.OooO00o[0], 14);
        int OooO0o010 = OooO0o0(OooO0o06, OooO0o09, OooO0o08, OooO0o07, this.OooO00o[5], 6);
        int OooO0o011 = OooO0o0(OooO0o07, OooO0o010, OooO0o09, OooO0o08, this.OooO00o[12], 9);
        int OooO0o012 = OooO0o0(OooO0o08, OooO0o011, OooO0o010, OooO0o09, this.OooO00o[2], 12);
        int OooO0o013 = OooO0o0(OooO0o09, OooO0o012, OooO0o011, OooO0o010, this.OooO00o[13], 9);
        int OooO0o014 = OooO0o0(OooO0o010, OooO0o013, OooO0o012, OooO0o011, this.OooO00o[9], 12);
        int OooO0o015 = OooO0o0(OooO0o011, OooO0o014, OooO0o013, OooO0o012, this.OooO00o[7], 5);
        int OooO0o016 = OooO0o0(OooO0o012, OooO0o015, OooO0o014, OooO0o013, this.OooO00o[10], 15);
        int OooO0o017 = OooO0o0(OooO0o013, OooO0o016, OooO0o015, OooO0o014, this.OooO00o[14], 8);
        this.OooO0Oo = this.OooO0o0 + OooO0Oo15 + OooO0o014;
        this.OooO0o0 = this.OooO0o + OooO0Oo14 + OooO0o017;
        this.OooO0o = this.OooO0OO + OooO0Oo17 + OooO0o016;
        this.OooO0OO = OooO0o015 + OooO0Oo16 + this.OooO0Oo;
        this.OooO0oO = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.OooO00o;
            if (i5 != iArr.length) {
                iArr[i5] = 0;
                i5++;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        super.reset();
        this.OooO0OO = 1732584193;
        this.OooO0Oo = -271733879;
        this.OooO0o0 = -1732584194;
        this.OooO0o = 271733878;
        this.OooO0oO = 0;
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
