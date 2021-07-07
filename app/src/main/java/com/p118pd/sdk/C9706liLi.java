package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨liLi  reason: invalid class name and case insensitive filesystem */
public class C9706liLi extends L1ill {
    public static final int OooO = 20;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    public C9706liLi() {
        this.OooO00o = new int[16];
        reset();
    }

    public C9706liLi(C9706liLi r2) {
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

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }

    private void OooO00o(C9706liLi r5) {
        super.OooO00o((L1ill) r5);
        this.OooO0OO = r5.OooO0OO;
        this.OooO0Oo = r5.OooO0Oo;
        this.OooO0o0 = r5.OooO0o0;
        this.OooO0o = r5.OooO0o;
        this.OooO0oO = r5.OooO0oO;
        int[] iArr = r5.OooO00o;
        System.arraycopy(iArr, 0, this.OooO00o, 0, iArr.length);
        this.OooO0oo = r5.OooO0oo;
    }

    private int OooO0O0(int i, int i2, int i3) {
        return ((i ^ -1) & i3) | (i2 & i);
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i | (i2 ^ -1)) ^ i3;
    }

    private int OooO0Oo(int i, int i2, int i3) {
        return (i & i3) | (i2 & (i3 ^ -1));
    }

    private int OooO0o0(int i, int i2, int i3) {
        return i ^ (i2 | (i3 ^ -1));
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        OooO00o(this.OooO0OO, bArr, i);
        OooO00o(this.OooO0Oo, bArr, i + 4);
        OooO00o(this.OooO0o0, bArr, i + 8);
        OooO00o(this.OooO0o, bArr, i + 12);
        OooO00o(this.OooO0oO, bArr, i + 16);
        reset();
        return 20;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C9706liLi(this);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21739OooO00o() {
        return "RIPEMD160";
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO00o(long j) {
        if (this.OooO0oo > 14) {
            OooO0OO();
        }
        int[] iArr = this.OooO00o;
        iArr[14] = (int) (-1 & j);
        iArr[15] = (int) (j >>> 32);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        OooO00o((C9706liLi) r1);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21740OooO00o(byte[] bArr, int i) {
        int[] iArr = this.OooO00o;
        int i2 = this.OooO0oo;
        int i3 = i2 + 1;
        this.OooO0oo = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 20;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO0OO() {
        int i = this.OooO0OO;
        int i2 = this.OooO0Oo;
        int i3 = this.OooO0o0;
        int i4 = this.OooO0o;
        int i5 = this.OooO0oO;
        int OooO00o2 = OooO00o(OooO00o(i2, i3, i4) + i + this.OooO00o[0], 11) + i5;
        int OooO00o3 = OooO00o(i3, 10);
        int OooO00o4 = OooO00o(OooO00o(OooO00o2, i2, OooO00o3) + i5 + this.OooO00o[1], 14) + i4;
        int OooO00o5 = OooO00o(i2, 10);
        int OooO00o6 = OooO00o(OooO00o(OooO00o4, OooO00o2, OooO00o5) + i4 + this.OooO00o[2], 15) + OooO00o3;
        int OooO00o7 = OooO00o(OooO00o2, 10);
        int OooO00o8 = OooO00o(OooO00o3 + OooO00o(OooO00o6, OooO00o4, OooO00o7) + this.OooO00o[3], 12) + OooO00o5;
        int OooO00o9 = OooO00o(OooO00o4, 10);
        int OooO00o10 = OooO00o(OooO00o5 + OooO00o(OooO00o8, OooO00o6, OooO00o9) + this.OooO00o[4], 5) + OooO00o7;
        int OooO00o11 = OooO00o(OooO00o6, 10);
        int OooO00o12 = OooO00o(OooO00o7 + OooO00o(OooO00o10, OooO00o8, OooO00o11) + this.OooO00o[5], 8) + OooO00o9;
        int OooO00o13 = OooO00o(OooO00o8, 10);
        int OooO00o14 = OooO00o(OooO00o9 + OooO00o(OooO00o12, OooO00o10, OooO00o13) + this.OooO00o[6], 7) + OooO00o11;
        int OooO00o15 = OooO00o(OooO00o10, 10);
        int OooO00o16 = OooO00o(OooO00o11 + OooO00o(OooO00o14, OooO00o12, OooO00o15) + this.OooO00o[7], 9) + OooO00o13;
        int OooO00o17 = OooO00o(OooO00o12, 10);
        int OooO00o18 = OooO00o(OooO00o13 + OooO00o(OooO00o16, OooO00o14, OooO00o17) + this.OooO00o[8], 11) + OooO00o15;
        int OooO00o19 = OooO00o(OooO00o14, 10);
        int OooO00o20 = OooO00o(OooO00o15 + OooO00o(OooO00o18, OooO00o16, OooO00o19) + this.OooO00o[9], 13) + OooO00o17;
        int OooO00o21 = OooO00o(OooO00o16, 10);
        int OooO00o22 = OooO00o(OooO00o17 + OooO00o(OooO00o20, OooO00o18, OooO00o21) + this.OooO00o[10], 14) + OooO00o19;
        int OooO00o23 = OooO00o(OooO00o18, 10);
        int OooO00o24 = OooO00o(OooO00o19 + OooO00o(OooO00o22, OooO00o20, OooO00o23) + this.OooO00o[11], 15) + OooO00o21;
        int OooO00o25 = OooO00o(OooO00o20, 10);
        int OooO00o26 = OooO00o(OooO00o21 + OooO00o(OooO00o24, OooO00o22, OooO00o25) + this.OooO00o[12], 6) + OooO00o23;
        int OooO00o27 = OooO00o(OooO00o22, 10);
        int OooO00o28 = OooO00o(OooO00o23 + OooO00o(OooO00o26, OooO00o24, OooO00o27) + this.OooO00o[13], 7) + OooO00o25;
        int OooO00o29 = OooO00o(OooO00o24, 10);
        int OooO00o30 = OooO00o(OooO00o25 + OooO00o(OooO00o28, OooO00o26, OooO00o29) + this.OooO00o[14], 9) + OooO00o27;
        int OooO00o31 = OooO00o(OooO00o26, 10);
        int OooO00o32 = OooO00o(OooO00o27 + OooO00o(OooO00o30, OooO00o28, OooO00o31) + this.OooO00o[15], 8) + OooO00o29;
        int OooO00o33 = OooO00o(OooO00o28, 10);
        int OooO00o34 = OooO00o(i + OooO0o0(i2, i3, i4) + this.OooO00o[5] + 1352829926, 8) + i5;
        int OooO00o35 = OooO00o(i3, 10);
        int OooO00o36 = OooO00o(i5 + OooO0o0(OooO00o34, i2, OooO00o35) + this.OooO00o[14] + 1352829926, 9) + i4;
        int OooO00o37 = OooO00o(i2, 10);
        int OooO00o38 = OooO00o(i4 + OooO0o0(OooO00o36, OooO00o34, OooO00o37) + this.OooO00o[7] + 1352829926, 9) + OooO00o35;
        int OooO00o39 = OooO00o(OooO00o34, 10);
        int OooO00o40 = OooO00o(OooO00o35 + OooO0o0(OooO00o38, OooO00o36, OooO00o39) + this.OooO00o[0] + 1352829926, 11) + OooO00o37;
        int OooO00o41 = OooO00o(OooO00o36, 10);
        int OooO00o42 = OooO00o(OooO00o37 + OooO0o0(OooO00o40, OooO00o38, OooO00o41) + this.OooO00o[9] + 1352829926, 13) + OooO00o39;
        int OooO00o43 = OooO00o(OooO00o38, 10);
        int OooO00o44 = OooO00o(OooO00o39 + OooO0o0(OooO00o42, OooO00o40, OooO00o43) + this.OooO00o[2] + 1352829926, 15) + OooO00o41;
        int OooO00o45 = OooO00o(OooO00o40, 10);
        int OooO00o46 = OooO00o(OooO00o41 + OooO0o0(OooO00o44, OooO00o42, OooO00o45) + this.OooO00o[11] + 1352829926, 15) + OooO00o43;
        int OooO00o47 = OooO00o(OooO00o42, 10);
        int OooO00o48 = OooO00o(OooO00o43 + OooO0o0(OooO00o46, OooO00o44, OooO00o47) + this.OooO00o[4] + 1352829926, 5) + OooO00o45;
        int OooO00o49 = OooO00o(OooO00o44, 10);
        int OooO00o50 = OooO00o(OooO00o45 + OooO0o0(OooO00o48, OooO00o46, OooO00o49) + this.OooO00o[13] + 1352829926, 7) + OooO00o47;
        int OooO00o51 = OooO00o(OooO00o46, 10);
        int OooO00o52 = OooO00o(OooO00o47 + OooO0o0(OooO00o50, OooO00o48, OooO00o51) + this.OooO00o[6] + 1352829926, 7) + OooO00o49;
        int OooO00o53 = OooO00o(OooO00o48, 10);
        int OooO00o54 = OooO00o(OooO00o49 + OooO0o0(OooO00o52, OooO00o50, OooO00o53) + this.OooO00o[15] + 1352829926, 8) + OooO00o51;
        int OooO00o55 = OooO00o(OooO00o50, 10);
        int OooO00o56 = OooO00o(OooO00o51 + OooO0o0(OooO00o54, OooO00o52, OooO00o55) + this.OooO00o[8] + 1352829926, 11) + OooO00o53;
        int OooO00o57 = OooO00o(OooO00o52, 10);
        int OooO00o58 = OooO00o(OooO00o53 + OooO0o0(OooO00o56, OooO00o54, OooO00o57) + this.OooO00o[1] + 1352829926, 14) + OooO00o55;
        int OooO00o59 = OooO00o(OooO00o54, 10);
        int OooO00o60 = OooO00o(OooO00o55 + OooO0o0(OooO00o58, OooO00o56, OooO00o59) + this.OooO00o[10] + 1352829926, 14) + OooO00o57;
        int OooO00o61 = OooO00o(OooO00o56, 10);
        int OooO00o62 = OooO00o(OooO00o57 + OooO0o0(OooO00o60, OooO00o58, OooO00o61) + this.OooO00o[3] + 1352829926, 12) + OooO00o59;
        int OooO00o63 = OooO00o(OooO00o58, 10);
        int OooO00o64 = OooO00o(OooO00o59 + OooO0o0(OooO00o62, OooO00o60, OooO00o63) + this.OooO00o[12] + 1352829926, 6) + OooO00o61;
        int OooO00o65 = OooO00o(OooO00o60, 10);
        int OooO00o66 = OooO00o(OooO00o29 + OooO0O0(OooO00o32, OooO00o30, OooO00o33) + this.OooO00o[7] + 1518500249, 7) + OooO00o31;
        int OooO00o67 = OooO00o(OooO00o30, 10);
        int OooO00o68 = OooO00o(OooO00o31 + OooO0O0(OooO00o66, OooO00o32, OooO00o67) + this.OooO00o[4] + 1518500249, 6) + OooO00o33;
        int OooO00o69 = OooO00o(OooO00o32, 10);
        int OooO00o70 = OooO00o(OooO00o33 + OooO0O0(OooO00o68, OooO00o66, OooO00o69) + this.OooO00o[13] + 1518500249, 8) + OooO00o67;
        int OooO00o71 = OooO00o(OooO00o66, 10);
        int OooO00o72 = OooO00o(OooO00o67 + OooO0O0(OooO00o70, OooO00o68, OooO00o71) + this.OooO00o[1] + 1518500249, 13) + OooO00o69;
        int OooO00o73 = OooO00o(OooO00o68, 10);
        int OooO00o74 = OooO00o(OooO00o69 + OooO0O0(OooO00o72, OooO00o70, OooO00o73) + this.OooO00o[10] + 1518500249, 11) + OooO00o71;
        int OooO00o75 = OooO00o(OooO00o70, 10);
        int OooO00o76 = OooO00o(OooO00o71 + OooO0O0(OooO00o74, OooO00o72, OooO00o75) + this.OooO00o[6] + 1518500249, 9) + OooO00o73;
        int OooO00o77 = OooO00o(OooO00o72, 10);
        int OooO00o78 = OooO00o(OooO00o73 + OooO0O0(OooO00o76, OooO00o74, OooO00o77) + this.OooO00o[15] + 1518500249, 7) + OooO00o75;
        int OooO00o79 = OooO00o(OooO00o74, 10);
        int OooO00o80 = OooO00o(OooO00o75 + OooO0O0(OooO00o78, OooO00o76, OooO00o79) + this.OooO00o[3] + 1518500249, 15) + OooO00o77;
        int OooO00o81 = OooO00o(OooO00o76, 10);
        int OooO00o82 = OooO00o(OooO00o77 + OooO0O0(OooO00o80, OooO00o78, OooO00o81) + this.OooO00o[12] + 1518500249, 7) + OooO00o79;
        int OooO00o83 = OooO00o(OooO00o78, 10);
        int OooO00o84 = OooO00o(OooO00o79 + OooO0O0(OooO00o82, OooO00o80, OooO00o83) + this.OooO00o[0] + 1518500249, 12) + OooO00o81;
        int OooO00o85 = OooO00o(OooO00o80, 10);
        int OooO00o86 = OooO00o(OooO00o81 + OooO0O0(OooO00o84, OooO00o82, OooO00o85) + this.OooO00o[9] + 1518500249, 15) + OooO00o83;
        int OooO00o87 = OooO00o(OooO00o82, 10);
        int OooO00o88 = OooO00o(OooO00o83 + OooO0O0(OooO00o86, OooO00o84, OooO00o87) + this.OooO00o[5] + 1518500249, 9) + OooO00o85;
        int OooO00o89 = OooO00o(OooO00o84, 10);
        int OooO00o90 = OooO00o(OooO00o85 + OooO0O0(OooO00o88, OooO00o86, OooO00o89) + this.OooO00o[2] + 1518500249, 11) + OooO00o87;
        int OooO00o91 = OooO00o(OooO00o86, 10);
        int OooO00o92 = OooO00o(OooO00o87 + OooO0O0(OooO00o90, OooO00o88, OooO00o91) + this.OooO00o[14] + 1518500249, 7) + OooO00o89;
        int OooO00o93 = OooO00o(OooO00o88, 10);
        int OooO00o94 = OooO00o(OooO00o89 + OooO0O0(OooO00o92, OooO00o90, OooO00o93) + this.OooO00o[11] + 1518500249, 13) + OooO00o91;
        int OooO00o95 = OooO00o(OooO00o90, 10);
        int OooO00o96 = OooO00o(OooO00o91 + OooO0O0(OooO00o94, OooO00o92, OooO00o95) + this.OooO00o[8] + 1518500249, 12) + OooO00o93;
        int OooO00o97 = OooO00o(OooO00o92, 10);
        int OooO00o98 = OooO00o(OooO00o61 + OooO0Oo(OooO00o64, OooO00o62, OooO00o65) + this.OooO00o[6] + 1548603684, 9) + OooO00o63;
        int OooO00o99 = OooO00o(OooO00o62, 10);
        int OooO00o100 = OooO00o(OooO00o63 + OooO0Oo(OooO00o98, OooO00o64, OooO00o99) + this.OooO00o[11] + 1548603684, 13) + OooO00o65;
        int OooO00o101 = OooO00o(OooO00o64, 10);
        int OooO00o102 = OooO00o(OooO00o65 + OooO0Oo(OooO00o100, OooO00o98, OooO00o101) + this.OooO00o[3] + 1548603684, 15) + OooO00o99;
        int OooO00o103 = OooO00o(OooO00o98, 10);
        int OooO00o104 = OooO00o(OooO00o99 + OooO0Oo(OooO00o102, OooO00o100, OooO00o103) + this.OooO00o[7] + 1548603684, 7) + OooO00o101;
        int OooO00o105 = OooO00o(OooO00o100, 10);
        int OooO00o106 = OooO00o(OooO00o101 + OooO0Oo(OooO00o104, OooO00o102, OooO00o105) + this.OooO00o[0] + 1548603684, 12) + OooO00o103;
        int OooO00o107 = OooO00o(OooO00o102, 10);
        int OooO00o108 = OooO00o(OooO00o103 + OooO0Oo(OooO00o106, OooO00o104, OooO00o107) + this.OooO00o[13] + 1548603684, 8) + OooO00o105;
        int OooO00o109 = OooO00o(OooO00o104, 10);
        int OooO00o110 = OooO00o(OooO00o105 + OooO0Oo(OooO00o108, OooO00o106, OooO00o109) + this.OooO00o[5] + 1548603684, 9) + OooO00o107;
        int OooO00o111 = OooO00o(OooO00o106, 10);
        int OooO00o112 = OooO00o(OooO00o107 + OooO0Oo(OooO00o110, OooO00o108, OooO00o111) + this.OooO00o[10] + 1548603684, 11) + OooO00o109;
        int OooO00o113 = OooO00o(OooO00o108, 10);
        int OooO00o114 = OooO00o(OooO00o109 + OooO0Oo(OooO00o112, OooO00o110, OooO00o113) + this.OooO00o[14] + 1548603684, 7) + OooO00o111;
        int OooO00o115 = OooO00o(OooO00o110, 10);
        int OooO00o116 = OooO00o(OooO00o111 + OooO0Oo(OooO00o114, OooO00o112, OooO00o115) + this.OooO00o[15] + 1548603684, 7) + OooO00o113;
        int OooO00o117 = OooO00o(OooO00o112, 10);
        int OooO00o118 = OooO00o(OooO00o113 + OooO0Oo(OooO00o116, OooO00o114, OooO00o117) + this.OooO00o[8] + 1548603684, 12) + OooO00o115;
        int OooO00o119 = OooO00o(OooO00o114, 10);
        int OooO00o120 = OooO00o(OooO00o115 + OooO0Oo(OooO00o118, OooO00o116, OooO00o119) + this.OooO00o[12] + 1548603684, 7) + OooO00o117;
        int OooO00o121 = OooO00o(OooO00o116, 10);
        int OooO00o122 = OooO00o(OooO00o117 + OooO0Oo(OooO00o120, OooO00o118, OooO00o121) + this.OooO00o[4] + 1548603684, 6) + OooO00o119;
        int OooO00o123 = OooO00o(OooO00o118, 10);
        int OooO00o124 = OooO00o(OooO00o119 + OooO0Oo(OooO00o122, OooO00o120, OooO00o123) + this.OooO00o[9] + 1548603684, 15) + OooO00o121;
        int OooO00o125 = OooO00o(OooO00o120, 10);
        int OooO00o126 = OooO00o(OooO00o121 + OooO0Oo(OooO00o124, OooO00o122, OooO00o125) + this.OooO00o[1] + 1548603684, 13) + OooO00o123;
        int OooO00o127 = OooO00o(OooO00o122, 10);
        int OooO00o128 = OooO00o(OooO00o123 + OooO0Oo(OooO00o126, OooO00o124, OooO00o127) + this.OooO00o[2] + 1548603684, 11) + OooO00o125;
        int OooO00o129 = OooO00o(OooO00o124, 10);
        int OooO00o130 = OooO00o(OooO00o93 + OooO0OO(OooO00o96, OooO00o94, OooO00o97) + this.OooO00o[3] + 1859775393, 11) + OooO00o95;
        int OooO00o131 = OooO00o(OooO00o94, 10);
        int OooO00o132 = OooO00o(OooO00o95 + OooO0OO(OooO00o130, OooO00o96, OooO00o131) + this.OooO00o[10] + 1859775393, 13) + OooO00o97;
        int OooO00o133 = OooO00o(OooO00o96, 10);
        int OooO00o134 = OooO00o(OooO00o97 + OooO0OO(OooO00o132, OooO00o130, OooO00o133) + this.OooO00o[14] + 1859775393, 6) + OooO00o131;
        int OooO00o135 = OooO00o(OooO00o130, 10);
        int OooO00o136 = OooO00o(OooO00o131 + OooO0OO(OooO00o134, OooO00o132, OooO00o135) + this.OooO00o[4] + 1859775393, 7) + OooO00o133;
        int OooO00o137 = OooO00o(OooO00o132, 10);
        int OooO00o138 = OooO00o(OooO00o133 + OooO0OO(OooO00o136, OooO00o134, OooO00o137) + this.OooO00o[9] + 1859775393, 14) + OooO00o135;
        int OooO00o139 = OooO00o(OooO00o134, 10);
        int OooO00o140 = OooO00o(OooO00o135 + OooO0OO(OooO00o138, OooO00o136, OooO00o139) + this.OooO00o[15] + 1859775393, 9) + OooO00o137;
        int OooO00o141 = OooO00o(OooO00o136, 10);
        int OooO00o142 = OooO00o(OooO00o137 + OooO0OO(OooO00o140, OooO00o138, OooO00o141) + this.OooO00o[8] + 1859775393, 13) + OooO00o139;
        int OooO00o143 = OooO00o(OooO00o138, 10);
        int OooO00o144 = OooO00o(OooO00o139 + OooO0OO(OooO00o142, OooO00o140, OooO00o143) + this.OooO00o[1] + 1859775393, 15) + OooO00o141;
        int OooO00o145 = OooO00o(OooO00o140, 10);
        int OooO00o146 = OooO00o(OooO00o141 + OooO0OO(OooO00o144, OooO00o142, OooO00o145) + this.OooO00o[2] + 1859775393, 14) + OooO00o143;
        int OooO00o147 = OooO00o(OooO00o142, 10);
        int OooO00o148 = OooO00o(OooO00o143 + OooO0OO(OooO00o146, OooO00o144, OooO00o147) + this.OooO00o[7] + 1859775393, 8) + OooO00o145;
        int OooO00o149 = OooO00o(OooO00o144, 10);
        int OooO00o150 = OooO00o(OooO00o145 + OooO0OO(OooO00o148, OooO00o146, OooO00o149) + this.OooO00o[0] + 1859775393, 13) + OooO00o147;
        int OooO00o151 = OooO00o(OooO00o146, 10);
        int OooO00o152 = OooO00o(OooO00o147 + OooO0OO(OooO00o150, OooO00o148, OooO00o151) + this.OooO00o[6] + 1859775393, 6) + OooO00o149;
        int OooO00o153 = OooO00o(OooO00o148, 10);
        int OooO00o154 = OooO00o(OooO00o149 + OooO0OO(OooO00o152, OooO00o150, OooO00o153) + this.OooO00o[13] + 1859775393, 5) + OooO00o151;
        int OooO00o155 = OooO00o(OooO00o150, 10);
        int OooO00o156 = OooO00o(OooO00o151 + OooO0OO(OooO00o154, OooO00o152, OooO00o155) + this.OooO00o[11] + 1859775393, 12) + OooO00o153;
        int OooO00o157 = OooO00o(OooO00o152, 10);
        int OooO00o158 = OooO00o(OooO00o153 + OooO0OO(OooO00o156, OooO00o154, OooO00o157) + this.OooO00o[5] + 1859775393, 7) + OooO00o155;
        int OooO00o159 = OooO00o(OooO00o154, 10);
        int OooO00o160 = OooO00o(OooO00o155 + OooO0OO(OooO00o158, OooO00o156, OooO00o159) + this.OooO00o[12] + 1859775393, 5) + OooO00o157;
        int OooO00o161 = OooO00o(OooO00o156, 10);
        int OooO00o162 = OooO00o(OooO00o125 + OooO0OO(OooO00o128, OooO00o126, OooO00o129) + this.OooO00o[15] + 1836072691, 9) + OooO00o127;
        int OooO00o163 = OooO00o(OooO00o126, 10);
        int OooO00o164 = OooO00o(OooO00o127 + OooO0OO(OooO00o162, OooO00o128, OooO00o163) + this.OooO00o[5] + 1836072691, 7) + OooO00o129;
        int OooO00o165 = OooO00o(OooO00o128, 10);
        int OooO00o166 = OooO00o(OooO00o129 + OooO0OO(OooO00o164, OooO00o162, OooO00o165) + this.OooO00o[1] + 1836072691, 15) + OooO00o163;
        int OooO00o167 = OooO00o(OooO00o162, 10);
        int OooO00o168 = OooO00o(OooO00o163 + OooO0OO(OooO00o166, OooO00o164, OooO00o167) + this.OooO00o[3] + 1836072691, 11) + OooO00o165;
        int OooO00o169 = OooO00o(OooO00o164, 10);
        int OooO00o170 = OooO00o(OooO00o165 + OooO0OO(OooO00o168, OooO00o166, OooO00o169) + this.OooO00o[7] + 1836072691, 8) + OooO00o167;
        int OooO00o171 = OooO00o(OooO00o166, 10);
        int OooO00o172 = OooO00o(OooO00o167 + OooO0OO(OooO00o170, OooO00o168, OooO00o171) + this.OooO00o[14] + 1836072691, 6) + OooO00o169;
        int OooO00o173 = OooO00o(OooO00o168, 10);
        int OooO00o174 = OooO00o(OooO00o169 + OooO0OO(OooO00o172, OooO00o170, OooO00o173) + this.OooO00o[6] + 1836072691, 6) + OooO00o171;
        int OooO00o175 = OooO00o(OooO00o170, 10);
        int OooO00o176 = OooO00o(OooO00o171 + OooO0OO(OooO00o174, OooO00o172, OooO00o175) + this.OooO00o[9] + 1836072691, 14) + OooO00o173;
        int OooO00o177 = OooO00o(OooO00o172, 10);
        int OooO00o178 = OooO00o(OooO00o173 + OooO0OO(OooO00o176, OooO00o174, OooO00o177) + this.OooO00o[11] + 1836072691, 12) + OooO00o175;
        int OooO00o179 = OooO00o(OooO00o174, 10);
        int OooO00o180 = OooO00o(OooO00o175 + OooO0OO(OooO00o178, OooO00o176, OooO00o179) + this.OooO00o[8] + 1836072691, 13) + OooO00o177;
        int OooO00o181 = OooO00o(OooO00o176, 10);
        int OooO00o182 = OooO00o(OooO00o177 + OooO0OO(OooO00o180, OooO00o178, OooO00o181) + this.OooO00o[12] + 1836072691, 5) + OooO00o179;
        int OooO00o183 = OooO00o(OooO00o178, 10);
        int OooO00o184 = OooO00o(OooO00o179 + OooO0OO(OooO00o182, OooO00o180, OooO00o183) + this.OooO00o[2] + 1836072691, 14) + OooO00o181;
        int OooO00o185 = OooO00o(OooO00o180, 10);
        int OooO00o186 = OooO00o(OooO00o181 + OooO0OO(OooO00o184, OooO00o182, OooO00o185) + this.OooO00o[10] + 1836072691, 13) + OooO00o183;
        int OooO00o187 = OooO00o(OooO00o182, 10);
        int OooO00o188 = OooO00o(OooO00o183 + OooO0OO(OooO00o186, OooO00o184, OooO00o187) + this.OooO00o[0] + 1836072691, 13) + OooO00o185;
        int OooO00o189 = OooO00o(OooO00o184, 10);
        int OooO00o190 = OooO00o(OooO00o185 + OooO0OO(OooO00o188, OooO00o186, OooO00o189) + this.OooO00o[4] + 1836072691, 7) + OooO00o187;
        int OooO00o191 = OooO00o(OooO00o186, 10);
        int OooO00o192 = OooO00o(OooO00o187 + OooO0OO(OooO00o190, OooO00o188, OooO00o191) + this.OooO00o[13] + 1836072691, 5) + OooO00o189;
        int OooO00o193 = OooO00o(OooO00o188, 10);
        int OooO00o194 = OooO00o(((OooO00o157 + OooO0Oo(OooO00o160, OooO00o158, OooO00o161)) + this.OooO00o[1]) - 1894007588, 11) + OooO00o159;
        int OooO00o195 = OooO00o(OooO00o158, 10);
        int OooO00o196 = OooO00o(((OooO00o159 + OooO0Oo(OooO00o194, OooO00o160, OooO00o195)) + this.OooO00o[9]) - 1894007588, 12) + OooO00o161;
        int OooO00o197 = OooO00o(OooO00o160, 10);
        int OooO00o198 = OooO00o(((OooO00o161 + OooO0Oo(OooO00o196, OooO00o194, OooO00o197)) + this.OooO00o[11]) - 1894007588, 14) + OooO00o195;
        int OooO00o199 = OooO00o(OooO00o194, 10);
        int OooO00o200 = OooO00o(((OooO00o195 + OooO0Oo(OooO00o198, OooO00o196, OooO00o199)) + this.OooO00o[10]) - 1894007588, 15) + OooO00o197;
        int OooO00o201 = OooO00o(OooO00o196, 10);
        int OooO00o202 = OooO00o(((OooO00o197 + OooO0Oo(OooO00o200, OooO00o198, OooO00o201)) + this.OooO00o[0]) - 1894007588, 14) + OooO00o199;
        int OooO00o203 = OooO00o(OooO00o198, 10);
        int OooO00o204 = OooO00o(((OooO00o199 + OooO0Oo(OooO00o202, OooO00o200, OooO00o203)) + this.OooO00o[8]) - 1894007588, 15) + OooO00o201;
        int OooO00o205 = OooO00o(OooO00o200, 10);
        int OooO00o206 = OooO00o(((OooO00o201 + OooO0Oo(OooO00o204, OooO00o202, OooO00o205)) + this.OooO00o[12]) - 1894007588, 9) + OooO00o203;
        int OooO00o207 = OooO00o(OooO00o202, 10);
        int OooO00o208 = OooO00o(((OooO00o203 + OooO0Oo(OooO00o206, OooO00o204, OooO00o207)) + this.OooO00o[4]) - 1894007588, 8) + OooO00o205;
        int OooO00o209 = OooO00o(OooO00o204, 10);
        int OooO00o210 = OooO00o(((OooO00o205 + OooO0Oo(OooO00o208, OooO00o206, OooO00o209)) + this.OooO00o[13]) - 1894007588, 9) + OooO00o207;
        int OooO00o211 = OooO00o(OooO00o206, 10);
        int OooO00o212 = OooO00o(((OooO00o207 + OooO0Oo(OooO00o210, OooO00o208, OooO00o211)) + this.OooO00o[3]) - 1894007588, 14) + OooO00o209;
        int OooO00o213 = OooO00o(OooO00o208, 10);
        int OooO00o214 = OooO00o(((OooO00o209 + OooO0Oo(OooO00o212, OooO00o210, OooO00o213)) + this.OooO00o[7]) - 1894007588, 5) + OooO00o211;
        int OooO00o215 = OooO00o(OooO00o210, 10);
        int OooO00o216 = OooO00o(((OooO00o211 + OooO0Oo(OooO00o214, OooO00o212, OooO00o215)) + this.OooO00o[15]) - 1894007588, 6) + OooO00o213;
        int OooO00o217 = OooO00o(OooO00o212, 10);
        int OooO00o218 = OooO00o(((OooO00o213 + OooO0Oo(OooO00o216, OooO00o214, OooO00o217)) + this.OooO00o[14]) - 1894007588, 8) + OooO00o215;
        int OooO00o219 = OooO00o(OooO00o214, 10);
        int OooO00o220 = OooO00o(((OooO00o215 + OooO0Oo(OooO00o218, OooO00o216, OooO00o219)) + this.OooO00o[5]) - 1894007588, 6) + OooO00o217;
        int OooO00o221 = OooO00o(OooO00o216, 10);
        int OooO00o222 = OooO00o(((OooO00o217 + OooO0Oo(OooO00o220, OooO00o218, OooO00o221)) + this.OooO00o[6]) - 1894007588, 5) + OooO00o219;
        int OooO00o223 = OooO00o(OooO00o218, 10);
        int OooO00o224 = OooO00o(((OooO00o219 + OooO0Oo(OooO00o222, OooO00o220, OooO00o223)) + this.OooO00o[2]) - 1894007588, 12) + OooO00o221;
        int OooO00o225 = OooO00o(OooO00o220, 10);
        int OooO00o226 = OooO00o(OooO00o189 + OooO0O0(OooO00o192, OooO00o190, OooO00o193) + this.OooO00o[8] + 2053994217, 15) + OooO00o191;
        int OooO00o227 = OooO00o(OooO00o190, 10);
        int OooO00o228 = OooO00o(OooO00o191 + OooO0O0(OooO00o226, OooO00o192, OooO00o227) + this.OooO00o[6] + 2053994217, 5) + OooO00o193;
        int OooO00o229 = OooO00o(OooO00o192, 10);
        int OooO00o230 = OooO00o(OooO00o193 + OooO0O0(OooO00o228, OooO00o226, OooO00o229) + this.OooO00o[4] + 2053994217, 8) + OooO00o227;
        int OooO00o231 = OooO00o(OooO00o226, 10);
        int OooO00o232 = OooO00o(OooO00o227 + OooO0O0(OooO00o230, OooO00o228, OooO00o231) + this.OooO00o[1] + 2053994217, 11) + OooO00o229;
        int OooO00o233 = OooO00o(OooO00o228, 10);
        int OooO00o234 = OooO00o(OooO00o229 + OooO0O0(OooO00o232, OooO00o230, OooO00o233) + this.OooO00o[3] + 2053994217, 14) + OooO00o231;
        int OooO00o235 = OooO00o(OooO00o230, 10);
        int OooO00o236 = OooO00o(OooO00o231 + OooO0O0(OooO00o234, OooO00o232, OooO00o235) + this.OooO00o[11] + 2053994217, 14) + OooO00o233;
        int OooO00o237 = OooO00o(OooO00o232, 10);
        int OooO00o238 = OooO00o(OooO00o233 + OooO0O0(OooO00o236, OooO00o234, OooO00o237) + this.OooO00o[15] + 2053994217, 6) + OooO00o235;
        int OooO00o239 = OooO00o(OooO00o234, 10);
        int OooO00o240 = OooO00o(OooO00o235 + OooO0O0(OooO00o238, OooO00o236, OooO00o239) + this.OooO00o[0] + 2053994217, 14) + OooO00o237;
        int OooO00o241 = OooO00o(OooO00o236, 10);
        int OooO00o242 = OooO00o(OooO00o237 + OooO0O0(OooO00o240, OooO00o238, OooO00o241) + this.OooO00o[5] + 2053994217, 6) + OooO00o239;
        int OooO00o243 = OooO00o(OooO00o238, 10);
        int OooO00o244 = OooO00o(OooO00o239 + OooO0O0(OooO00o242, OooO00o240, OooO00o243) + this.OooO00o[12] + 2053994217, 9) + OooO00o241;
        int OooO00o245 = OooO00o(OooO00o240, 10);
        int OooO00o246 = OooO00o(OooO00o241 + OooO0O0(OooO00o244, OooO00o242, OooO00o245) + this.OooO00o[2] + 2053994217, 12) + OooO00o243;
        int OooO00o247 = OooO00o(OooO00o242, 10);
        int OooO00o248 = OooO00o(OooO00o243 + OooO0O0(OooO00o246, OooO00o244, OooO00o247) + this.OooO00o[13] + 2053994217, 9) + OooO00o245;
        int OooO00o249 = OooO00o(OooO00o244, 10);
        int OooO00o250 = OooO00o(OooO00o245 + OooO0O0(OooO00o248, OooO00o246, OooO00o249) + this.OooO00o[9] + 2053994217, 12) + OooO00o247;
        int OooO00o251 = OooO00o(OooO00o246, 10);
        int OooO00o252 = OooO00o(OooO00o247 + OooO0O0(OooO00o250, OooO00o248, OooO00o251) + this.OooO00o[7] + 2053994217, 5) + OooO00o249;
        int OooO00o253 = OooO00o(OooO00o248, 10);
        int OooO00o254 = OooO00o(OooO00o249 + OooO0O0(OooO00o252, OooO00o250, OooO00o253) + this.OooO00o[10] + 2053994217, 15) + OooO00o251;
        int OooO00o255 = OooO00o(OooO00o250, 10);
        int OooO00o256 = OooO00o(OooO00o251 + OooO0O0(OooO00o254, OooO00o252, OooO00o255) + this.OooO00o[14] + 2053994217, 8) + OooO00o253;
        int OooO00o257 = OooO00o(OooO00o252, 10);
        int OooO00o258 = OooO00o(((OooO00o221 + OooO0o0(OooO00o224, OooO00o222, OooO00o225)) + this.OooO00o[4]) - 1454113458, 9) + OooO00o223;
        int OooO00o259 = OooO00o(OooO00o222, 10);
        int OooO00o260 = OooO00o(((OooO00o223 + OooO0o0(OooO00o258, OooO00o224, OooO00o259)) + this.OooO00o[0]) - 1454113458, 15) + OooO00o225;
        int OooO00o261 = OooO00o(OooO00o224, 10);
        int OooO00o262 = OooO00o(((OooO00o225 + OooO0o0(OooO00o260, OooO00o258, OooO00o261)) + this.OooO00o[5]) - 1454113458, 5) + OooO00o259;
        int OooO00o263 = OooO00o(OooO00o258, 10);
        int OooO00o264 = OooO00o(((OooO00o259 + OooO0o0(OooO00o262, OooO00o260, OooO00o263)) + this.OooO00o[9]) - 1454113458, 11) + OooO00o261;
        int OooO00o265 = OooO00o(OooO00o260, 10);
        int OooO00o266 = OooO00o(((OooO00o261 + OooO0o0(OooO00o264, OooO00o262, OooO00o265)) + this.OooO00o[7]) - 1454113458, 6) + OooO00o263;
        int OooO00o267 = OooO00o(OooO00o262, 10);
        int OooO00o268 = OooO00o(((OooO00o263 + OooO0o0(OooO00o266, OooO00o264, OooO00o267)) + this.OooO00o[12]) - 1454113458, 8) + OooO00o265;
        int OooO00o269 = OooO00o(OooO00o264, 10);
        int OooO00o270 = OooO00o(((OooO00o265 + OooO0o0(OooO00o268, OooO00o266, OooO00o269)) + this.OooO00o[2]) - 1454113458, 13) + OooO00o267;
        int OooO00o271 = OooO00o(OooO00o266, 10);
        int OooO00o272 = OooO00o(((OooO00o267 + OooO0o0(OooO00o270, OooO00o268, OooO00o271)) + this.OooO00o[10]) - 1454113458, 12) + OooO00o269;
        int OooO00o273 = OooO00o(OooO00o268, 10);
        int OooO00o274 = OooO00o(((OooO00o269 + OooO0o0(OooO00o272, OooO00o270, OooO00o273)) + this.OooO00o[14]) - 1454113458, 5) + OooO00o271;
        int OooO00o275 = OooO00o(OooO00o270, 10);
        int OooO00o276 = OooO00o(((OooO00o271 + OooO0o0(OooO00o274, OooO00o272, OooO00o275)) + this.OooO00o[1]) - 1454113458, 12) + OooO00o273;
        int OooO00o277 = OooO00o(OooO00o272, 10);
        int OooO00o278 = OooO00o(((OooO00o273 + OooO0o0(OooO00o276, OooO00o274, OooO00o277)) + this.OooO00o[3]) - 1454113458, 13) + OooO00o275;
        int OooO00o279 = OooO00o(OooO00o274, 10);
        int OooO00o280 = OooO00o(((OooO00o275 + OooO0o0(OooO00o278, OooO00o276, OooO00o279)) + this.OooO00o[8]) - 1454113458, 14) + OooO00o277;
        int OooO00o281 = OooO00o(OooO00o276, 10);
        int OooO00o282 = OooO00o(((OooO00o277 + OooO0o0(OooO00o280, OooO00o278, OooO00o281)) + this.OooO00o[11]) - 1454113458, 11) + OooO00o279;
        int OooO00o283 = OooO00o(OooO00o278, 10);
        int OooO00o284 = OooO00o(((OooO00o279 + OooO0o0(OooO00o282, OooO00o280, OooO00o283)) + this.OooO00o[6]) - 1454113458, 8) + OooO00o281;
        int OooO00o285 = OooO00o(OooO00o280, 10);
        int OooO00o286 = OooO00o(((OooO00o281 + OooO0o0(OooO00o284, OooO00o282, OooO00o285)) + this.OooO00o[15]) - 1454113458, 5) + OooO00o283;
        int OooO00o287 = OooO00o(OooO00o282, 10);
        int OooO00o288 = OooO00o(OooO00o284, 10);
        int OooO00o289 = OooO00o(OooO00o253 + OooO00o(OooO00o256, OooO00o254, OooO00o257) + this.OooO00o[12], 8) + OooO00o255;
        int OooO00o290 = OooO00o(OooO00o254, 10);
        int OooO00o291 = OooO00o(OooO00o255 + OooO00o(OooO00o289, OooO00o256, OooO00o290) + this.OooO00o[15], 5) + OooO00o257;
        int OooO00o292 = OooO00o(OooO00o256, 10);
        int OooO00o293 = OooO00o(OooO00o257 + OooO00o(OooO00o291, OooO00o289, OooO00o292) + this.OooO00o[10], 12) + OooO00o290;
        int OooO00o294 = OooO00o(OooO00o289, 10);
        int OooO00o295 = OooO00o(OooO00o290 + OooO00o(OooO00o293, OooO00o291, OooO00o294) + this.OooO00o[4], 9) + OooO00o292;
        int OooO00o296 = OooO00o(OooO00o291, 10);
        int OooO00o297 = OooO00o(OooO00o292 + OooO00o(OooO00o295, OooO00o293, OooO00o296) + this.OooO00o[1], 12) + OooO00o294;
        int OooO00o298 = OooO00o(OooO00o293, 10);
        int OooO00o299 = OooO00o(OooO00o294 + OooO00o(OooO00o297, OooO00o295, OooO00o298) + this.OooO00o[5], 5) + OooO00o296;
        int OooO00o300 = OooO00o(OooO00o295, 10);
        int OooO00o301 = OooO00o(OooO00o296 + OooO00o(OooO00o299, OooO00o297, OooO00o300) + this.OooO00o[8], 14) + OooO00o298;
        int OooO00o302 = OooO00o(OooO00o297, 10);
        int OooO00o303 = OooO00o(OooO00o298 + OooO00o(OooO00o301, OooO00o299, OooO00o302) + this.OooO00o[7], 6) + OooO00o300;
        int OooO00o304 = OooO00o(OooO00o299, 10);
        int OooO00o305 = OooO00o(OooO00o300 + OooO00o(OooO00o303, OooO00o301, OooO00o304) + this.OooO00o[6], 8) + OooO00o302;
        int OooO00o306 = OooO00o(OooO00o301, 10);
        int OooO00o307 = OooO00o(OooO00o302 + OooO00o(OooO00o305, OooO00o303, OooO00o306) + this.OooO00o[2], 13) + OooO00o304;
        int OooO00o308 = OooO00o(OooO00o303, 10);
        int OooO00o309 = OooO00o(OooO00o304 + OooO00o(OooO00o307, OooO00o305, OooO00o308) + this.OooO00o[13], 6) + OooO00o306;
        int OooO00o310 = OooO00o(OooO00o305, 10);
        int OooO00o311 = OooO00o(OooO00o306 + OooO00o(OooO00o309, OooO00o307, OooO00o310) + this.OooO00o[14], 5) + OooO00o308;
        int OooO00o312 = OooO00o(OooO00o307, 10);
        int OooO00o313 = OooO00o(OooO00o308 + OooO00o(OooO00o311, OooO00o309, OooO00o312) + this.OooO00o[0], 15) + OooO00o310;
        int OooO00o314 = OooO00o(OooO00o309, 10);
        int OooO00o315 = OooO00o(OooO00o310 + OooO00o(OooO00o313, OooO00o311, OooO00o314) + this.OooO00o[3], 13) + OooO00o312;
        int OooO00o316 = OooO00o(OooO00o311, 10);
        int OooO00o317 = OooO00o(OooO00o312 + OooO00o(OooO00o315, OooO00o313, OooO00o316) + this.OooO00o[9], 11) + OooO00o314;
        int OooO00o318 = OooO00o(OooO00o313, 10);
        int OooO00o319 = OooO00o(OooO00o314 + OooO00o(OooO00o317, OooO00o315, OooO00o318) + this.OooO00o[11], 11) + OooO00o316;
        this.OooO0Oo = this.OooO0o0 + OooO00o288 + OooO00o318;
        this.OooO0o0 = this.OooO0o + OooO00o287 + OooO00o316;
        this.OooO0o = this.OooO0oO + OooO00o285 + OooO00o319;
        this.OooO0oO = this.OooO0OO + OooO00o(((OooO00o283 + OooO0o0(OooO00o286, OooO00o284, OooO00o287)) + this.OooO00o[13]) - 1454113458, 6) + OooO00o285 + OooO00o317;
        this.OooO0OO = OooO00o(OooO00o315, 10) + OooO00o286 + this.OooO0Oo;
        this.OooO0oo = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.OooO00o;
            if (i6 != iArr.length) {
                iArr[i6] = 0;
                i6++;
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
