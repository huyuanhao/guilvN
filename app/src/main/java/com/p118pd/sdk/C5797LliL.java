package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Lli丨L丨  reason: invalid class name and case insensitive filesystem */
public class C5797LliL extends L1ill {
    public static final int OooO = 3;
    public static final int OooO0oo = 16;
    public static final int OooOO0 = 7;
    public static final int OooOO0O = 11;
    public static final int OooOO0o = 19;
    public static final int OooOOO = 5;
    public static final int OooOOO0 = 3;
    public static final int OooOOOO = 9;
    public static final int OooOOOo = 13;
    public static final int OooOOo = 9;
    public static final int OooOOo0 = 3;
    public static final int OooOOoo = 11;
    public static final int OooOo00 = 15;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;

    public C5797LliL() {
        this.OooO00o = new int[16];
        reset();
    }

    public C5797LliL(C5797LliL r2) {
        super(r2);
        this.OooO00o = new int[16];
        OooO00o(r2);
    }

    private int OooO00o(int i, int i2) {
        return (i >>> (32 - i2)) | (i << i2);
    }

    private int OooO00o(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void OooO00o(C5797LliL r5) {
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
        return (i & i3) | (i & i2) | (i2 & i3);
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
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
        return new C5797LliL(this);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16399OooO00o() {
        return "MD4";
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
        OooO00o((C5797LliL) r1);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16400OooO00o(byte[] bArr, int i) {
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
        int OooO00o2 = OooO00o(i + OooO00o(i2, i3, i4) + this.OooO00o[0], 3);
        int OooO00o3 = OooO00o(i4 + OooO00o(OooO00o2, i2, i3) + this.OooO00o[1], 7);
        int OooO00o4 = OooO00o(i3 + OooO00o(OooO00o3, OooO00o2, i2) + this.OooO00o[2], 11);
        int OooO00o5 = OooO00o(i2 + OooO00o(OooO00o4, OooO00o3, OooO00o2) + this.OooO00o[3], 19);
        int OooO00o6 = OooO00o(OooO00o2 + OooO00o(OooO00o5, OooO00o4, OooO00o3) + this.OooO00o[4], 3);
        int OooO00o7 = OooO00o(OooO00o3 + OooO00o(OooO00o6, OooO00o5, OooO00o4) + this.OooO00o[5], 7);
        int OooO00o8 = OooO00o(OooO00o4 + OooO00o(OooO00o7, OooO00o6, OooO00o5) + this.OooO00o[6], 11);
        int OooO00o9 = OooO00o(OooO00o5 + OooO00o(OooO00o8, OooO00o7, OooO00o6) + this.OooO00o[7], 19);
        int OooO00o10 = OooO00o(OooO00o6 + OooO00o(OooO00o9, OooO00o8, OooO00o7) + this.OooO00o[8], 3);
        int OooO00o11 = OooO00o(OooO00o7 + OooO00o(OooO00o10, OooO00o9, OooO00o8) + this.OooO00o[9], 7);
        int OooO00o12 = OooO00o(OooO00o8 + OooO00o(OooO00o11, OooO00o10, OooO00o9) + this.OooO00o[10], 11);
        int OooO00o13 = OooO00o(OooO00o9 + OooO00o(OooO00o12, OooO00o11, OooO00o10) + this.OooO00o[11], 19);
        int OooO00o14 = OooO00o(OooO00o10 + OooO00o(OooO00o13, OooO00o12, OooO00o11) + this.OooO00o[12], 3);
        int OooO00o15 = OooO00o(OooO00o11 + OooO00o(OooO00o14, OooO00o13, OooO00o12) + this.OooO00o[13], 7);
        int OooO00o16 = OooO00o(OooO00o12 + OooO00o(OooO00o15, OooO00o14, OooO00o13) + this.OooO00o[14], 11);
        int OooO00o17 = OooO00o(OooO00o13 + OooO00o(OooO00o16, OooO00o15, OooO00o14) + this.OooO00o[15], 19);
        int OooO00o18 = OooO00o(OooO00o14 + OooO0O0(OooO00o17, OooO00o16, OooO00o15) + this.OooO00o[0] + 1518500249, 3);
        int OooO00o19 = OooO00o(OooO00o15 + OooO0O0(OooO00o18, OooO00o17, OooO00o16) + this.OooO00o[4] + 1518500249, 5);
        int OooO00o20 = OooO00o(OooO00o16 + OooO0O0(OooO00o19, OooO00o18, OooO00o17) + this.OooO00o[8] + 1518500249, 9);
        int OooO00o21 = OooO00o(OooO00o17 + OooO0O0(OooO00o20, OooO00o19, OooO00o18) + this.OooO00o[12] + 1518500249, 13);
        int OooO00o22 = OooO00o(OooO00o18 + OooO0O0(OooO00o21, OooO00o20, OooO00o19) + this.OooO00o[1] + 1518500249, 3);
        int OooO00o23 = OooO00o(OooO00o19 + OooO0O0(OooO00o22, OooO00o21, OooO00o20) + this.OooO00o[5] + 1518500249, 5);
        int OooO00o24 = OooO00o(OooO00o20 + OooO0O0(OooO00o23, OooO00o22, OooO00o21) + this.OooO00o[9] + 1518500249, 9);
        int OooO00o25 = OooO00o(OooO00o21 + OooO0O0(OooO00o24, OooO00o23, OooO00o22) + this.OooO00o[13] + 1518500249, 13);
        int OooO00o26 = OooO00o(OooO00o22 + OooO0O0(OooO00o25, OooO00o24, OooO00o23) + this.OooO00o[2] + 1518500249, 3);
        int OooO00o27 = OooO00o(OooO00o23 + OooO0O0(OooO00o26, OooO00o25, OooO00o24) + this.OooO00o[6] + 1518500249, 5);
        int OooO00o28 = OooO00o(OooO00o24 + OooO0O0(OooO00o27, OooO00o26, OooO00o25) + this.OooO00o[10] + 1518500249, 9);
        int OooO00o29 = OooO00o(OooO00o25 + OooO0O0(OooO00o28, OooO00o27, OooO00o26) + this.OooO00o[14] + 1518500249, 13);
        int OooO00o30 = OooO00o(OooO00o26 + OooO0O0(OooO00o29, OooO00o28, OooO00o27) + this.OooO00o[3] + 1518500249, 3);
        int OooO00o31 = OooO00o(OooO00o27 + OooO0O0(OooO00o30, OooO00o29, OooO00o28) + this.OooO00o[7] + 1518500249, 5);
        int OooO00o32 = OooO00o(OooO00o28 + OooO0O0(OooO00o31, OooO00o30, OooO00o29) + this.OooO00o[11] + 1518500249, 9);
        int OooO00o33 = OooO00o(OooO00o29 + OooO0O0(OooO00o32, OooO00o31, OooO00o30) + this.OooO00o[15] + 1518500249, 13);
        int OooO00o34 = OooO00o(OooO00o30 + OooO0OO(OooO00o33, OooO00o32, OooO00o31) + this.OooO00o[0] + 1859775393, 3);
        int OooO00o35 = OooO00o(OooO00o31 + OooO0OO(OooO00o34, OooO00o33, OooO00o32) + this.OooO00o[8] + 1859775393, 9);
        int OooO00o36 = OooO00o(OooO00o32 + OooO0OO(OooO00o35, OooO00o34, OooO00o33) + this.OooO00o[4] + 1859775393, 11);
        int OooO00o37 = OooO00o(OooO00o33 + OooO0OO(OooO00o36, OooO00o35, OooO00o34) + this.OooO00o[12] + 1859775393, 15);
        int OooO00o38 = OooO00o(OooO00o34 + OooO0OO(OooO00o37, OooO00o36, OooO00o35) + this.OooO00o[2] + 1859775393, 3);
        int OooO00o39 = OooO00o(OooO00o35 + OooO0OO(OooO00o38, OooO00o37, OooO00o36) + this.OooO00o[10] + 1859775393, 9);
        int OooO00o40 = OooO00o(OooO00o36 + OooO0OO(OooO00o39, OooO00o38, OooO00o37) + this.OooO00o[6] + 1859775393, 11);
        int OooO00o41 = OooO00o(OooO00o37 + OooO0OO(OooO00o40, OooO00o39, OooO00o38) + this.OooO00o[14] + 1859775393, 15);
        int OooO00o42 = OooO00o(OooO00o38 + OooO0OO(OooO00o41, OooO00o40, OooO00o39) + this.OooO00o[1] + 1859775393, 3);
        int OooO00o43 = OooO00o(OooO00o39 + OooO0OO(OooO00o42, OooO00o41, OooO00o40) + this.OooO00o[9] + 1859775393, 9);
        int OooO00o44 = OooO00o(OooO00o40 + OooO0OO(OooO00o43, OooO00o42, OooO00o41) + this.OooO00o[5] + 1859775393, 11);
        int OooO00o45 = OooO00o(OooO00o41 + OooO0OO(OooO00o44, OooO00o43, OooO00o42) + this.OooO00o[13] + 1859775393, 15);
        int OooO00o46 = OooO00o(OooO00o42 + OooO0OO(OooO00o45, OooO00o44, OooO00o43) + this.OooO00o[3] + 1859775393, 3);
        int OooO00o47 = OooO00o(OooO00o43 + OooO0OO(OooO00o46, OooO00o45, OooO00o44) + this.OooO00o[11] + 1859775393, 9);
        int OooO00o48 = OooO00o(OooO00o44 + OooO0OO(OooO00o47, OooO00o46, OooO00o45) + this.OooO00o[7] + 1859775393, 11);
        int OooO00o49 = OooO00o(OooO00o45 + OooO0OO(OooO00o48, OooO00o47, OooO00o46) + this.OooO00o[15] + 1859775393, 15);
        this.OooO0OO += OooO00o46;
        this.OooO0Oo += OooO00o49;
        this.OooO0o0 += OooO00o48;
        this.OooO0o += OooO00o47;
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
