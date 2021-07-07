package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1l11I丨I  reason: invalid class name */
public class i1l11II extends L1ill implements C1l11i {
    public static final int OooO = 7;
    public static final int OooO0oo = 16;
    public static final int OooOO0 = 12;
    public static final int OooOO0O = 17;
    public static final int OooOO0o = 22;
    public static final int OooOOO = 9;
    public static final int OooOOO0 = 5;
    public static final int OooOOOO = 14;
    public static final int OooOOOo = 20;
    public static final int OooOOo = 11;
    public static final int OooOOo0 = 4;
    public static final int OooOOoo = 16;
    public static final int OooOo = 21;
    public static final int OooOo0 = 6;
    public static final int OooOo00 = 23;
    public static final int OooOo0O = 10;
    public static final int OooOo0o = 15;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;

    public i1l11II() {
        this.OooO00o = new int[16];
        reset();
    }

    public i1l11II(i1l11II r2) {
        super(r2);
        this.OooO00o = new int[16];
        OooO00o(r2);
    }

    public i1l11II(byte[] bArr) {
        super(bArr);
        this.OooO00o = new int[16];
        this.OooO0OO = AbstractC6464l1l.OooO00o(bArr, 16);
        this.OooO0Oo = AbstractC6464l1l.OooO00o(bArr, 20);
        this.OooO0o0 = AbstractC6464l1l.OooO00o(bArr, 24);
        this.OooO0o = AbstractC6464l1l.OooO00o(bArr, 28);
        this.OooO0oO = AbstractC6464l1l.OooO00o(bArr, 32);
        for (int i = 0; i != this.OooO0oO; i++) {
            this.OooO00o[i] = AbstractC6464l1l.OooO00o(bArr, (i * 4) + 36);
        }
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

    private void OooO00o(i1l11II r5) {
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
        return (i & i3) | (i2 & (i3 ^ -1));
    }

    private int OooO0OO(int i, int i2, int i3) {
        return (i ^ i2) ^ i3;
    }

    private int OooO0Oo(int i, int i2, int i3) {
        return (i | (i3 ^ -1)) ^ i2;
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

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new i1l11II(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16897OooO00o() {
        return "MD5";
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
        OooO00o((i1l11II) r1);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16898OooO00o(byte[] bArr, int i) {
        int[] iArr = this.OooO00o;
        int i2 = this.OooO0oO;
        int i3 = i2 + 1;
        this.OooO0oO = i3;
        iArr[i2] = ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        if (i3 == 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16899OooO00o() {
        byte[] bArr = new byte[((this.OooO0oO * 4) + 36)];
        super.OooO00o(bArr);
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, 16);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, 20);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, 24);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, 28);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, 32);
        for (int i = 0; i != this.OooO0oO; i++) {
            AbstractC6464l1l.OooO00o(this.OooO00o[i], bArr, (i * 4) + 36);
        }
        return bArr;
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
        int OooO00o2 = OooO00o(((i + OooO00o(i2, i3, i4)) + this.OooO00o[0]) - 680876936, 7) + i2;
        int OooO00o3 = OooO00o(((i4 + OooO00o(OooO00o2, i2, i3)) + this.OooO00o[1]) - 389564586, 12) + OooO00o2;
        int OooO00o4 = OooO00o(i3 + OooO00o(OooO00o3, OooO00o2, i2) + this.OooO00o[2] + 606105819, 17) + OooO00o3;
        int OooO00o5 = OooO00o(((i2 + OooO00o(OooO00o4, OooO00o3, OooO00o2)) + this.OooO00o[3]) - 1044525330, 22) + OooO00o4;
        int OooO00o6 = OooO00o(((OooO00o2 + OooO00o(OooO00o5, OooO00o4, OooO00o3)) + this.OooO00o[4]) - 176418897, 7) + OooO00o5;
        int OooO00o7 = OooO00o(OooO00o3 + OooO00o(OooO00o6, OooO00o5, OooO00o4) + this.OooO00o[5] + 1200080426, 12) + OooO00o6;
        int OooO00o8 = OooO00o(((OooO00o4 + OooO00o(OooO00o7, OooO00o6, OooO00o5)) + this.OooO00o[6]) - 1473231341, 17) + OooO00o7;
        int OooO00o9 = OooO00o(((OooO00o5 + OooO00o(OooO00o8, OooO00o7, OooO00o6)) + this.OooO00o[7]) - 45705983, 22) + OooO00o8;
        int OooO00o10 = OooO00o(OooO00o6 + OooO00o(OooO00o9, OooO00o8, OooO00o7) + this.OooO00o[8] + 1770035416, 7) + OooO00o9;
        int OooO00o11 = OooO00o(((OooO00o7 + OooO00o(OooO00o10, OooO00o9, OooO00o8)) + this.OooO00o[9]) - 1958414417, 12) + OooO00o10;
        int OooO00o12 = OooO00o(((OooO00o8 + OooO00o(OooO00o11, OooO00o10, OooO00o9)) + this.OooO00o[10]) - 42063, 17) + OooO00o11;
        int OooO00o13 = OooO00o(((OooO00o9 + OooO00o(OooO00o12, OooO00o11, OooO00o10)) + this.OooO00o[11]) - 1990404162, 22) + OooO00o12;
        int OooO00o14 = OooO00o(OooO00o10 + OooO00o(OooO00o13, OooO00o12, OooO00o11) + this.OooO00o[12] + 1804603682, 7) + OooO00o13;
        int OooO00o15 = OooO00o(((OooO00o11 + OooO00o(OooO00o14, OooO00o13, OooO00o12)) + this.OooO00o[13]) - 40341101, 12) + OooO00o14;
        int OooO00o16 = OooO00o(((OooO00o12 + OooO00o(OooO00o15, OooO00o14, OooO00o13)) + this.OooO00o[14]) - 1502002290, 17) + OooO00o15;
        int OooO00o17 = OooO00o(OooO00o13 + OooO00o(OooO00o16, OooO00o15, OooO00o14) + this.OooO00o[15] + 1236535329, 22) + OooO00o16;
        int OooO00o18 = OooO00o(((OooO00o14 + OooO0O0(OooO00o17, OooO00o16, OooO00o15)) + this.OooO00o[1]) - 165796510, 5) + OooO00o17;
        int OooO00o19 = OooO00o(((OooO00o15 + OooO0O0(OooO00o18, OooO00o17, OooO00o16)) + this.OooO00o[6]) - 1069501632, 9) + OooO00o18;
        int OooO00o20 = OooO00o(OooO00o16 + OooO0O0(OooO00o19, OooO00o18, OooO00o17) + this.OooO00o[11] + 643717713, 14) + OooO00o19;
        int OooO00o21 = OooO00o(((OooO00o17 + OooO0O0(OooO00o20, OooO00o19, OooO00o18)) + this.OooO00o[0]) - 373897302, 20) + OooO00o20;
        int OooO00o22 = OooO00o(((OooO00o18 + OooO0O0(OooO00o21, OooO00o20, OooO00o19)) + this.OooO00o[5]) - 701558691, 5) + OooO00o21;
        int OooO00o23 = OooO00o(OooO00o19 + OooO0O0(OooO00o22, OooO00o21, OooO00o20) + this.OooO00o[10] + 38016083, 9) + OooO00o22;
        int OooO00o24 = OooO00o(((OooO00o20 + OooO0O0(OooO00o23, OooO00o22, OooO00o21)) + this.OooO00o[15]) - 660478335, 14) + OooO00o23;
        int OooO00o25 = OooO00o(((OooO00o21 + OooO0O0(OooO00o24, OooO00o23, OooO00o22)) + this.OooO00o[4]) - 405537848, 20) + OooO00o24;
        int OooO00o26 = OooO00o(OooO00o22 + OooO0O0(OooO00o25, OooO00o24, OooO00o23) + this.OooO00o[9] + 568446438, 5) + OooO00o25;
        int OooO00o27 = OooO00o(((OooO00o23 + OooO0O0(OooO00o26, OooO00o25, OooO00o24)) + this.OooO00o[14]) - 1019803690, 9) + OooO00o26;
        int OooO00o28 = OooO00o(((OooO00o24 + OooO0O0(OooO00o27, OooO00o26, OooO00o25)) + this.OooO00o[3]) - 187363961, 14) + OooO00o27;
        int OooO00o29 = OooO00o(OooO00o25 + OooO0O0(OooO00o28, OooO00o27, OooO00o26) + this.OooO00o[8] + 1163531501, 20) + OooO00o28;
        int OooO00o30 = OooO00o(((OooO00o26 + OooO0O0(OooO00o29, OooO00o28, OooO00o27)) + this.OooO00o[13]) - 1444681467, 5) + OooO00o29;
        int OooO00o31 = OooO00o(((OooO00o27 + OooO0O0(OooO00o30, OooO00o29, OooO00o28)) + this.OooO00o[2]) - 51403784, 9) + OooO00o30;
        int OooO00o32 = OooO00o(OooO00o28 + OooO0O0(OooO00o31, OooO00o30, OooO00o29) + this.OooO00o[7] + 1735328473, 14) + OooO00o31;
        int OooO00o33 = OooO00o(((OooO00o29 + OooO0O0(OooO00o32, OooO00o31, OooO00o30)) + this.OooO00o[12]) - 1926607734, 20) + OooO00o32;
        int OooO00o34 = OooO00o(((OooO00o30 + OooO0OO(OooO00o33, OooO00o32, OooO00o31)) + this.OooO00o[5]) - 378558, 4) + OooO00o33;
        int OooO00o35 = OooO00o(((OooO00o31 + OooO0OO(OooO00o34, OooO00o33, OooO00o32)) + this.OooO00o[8]) - 2022574463, 11) + OooO00o34;
        int OooO00o36 = OooO00o(OooO00o32 + OooO0OO(OooO00o35, OooO00o34, OooO00o33) + this.OooO00o[11] + 1839030562, 16) + OooO00o35;
        int OooO00o37 = OooO00o(((OooO00o33 + OooO0OO(OooO00o36, OooO00o35, OooO00o34)) + this.OooO00o[14]) - 35309556, 23) + OooO00o36;
        int OooO00o38 = OooO00o(((OooO00o34 + OooO0OO(OooO00o37, OooO00o36, OooO00o35)) + this.OooO00o[1]) - 1530992060, 4) + OooO00o37;
        int OooO00o39 = OooO00o(OooO00o35 + OooO0OO(OooO00o38, OooO00o37, OooO00o36) + this.OooO00o[4] + 1272893353, 11) + OooO00o38;
        int OooO00o40 = OooO00o(((OooO00o36 + OooO0OO(OooO00o39, OooO00o38, OooO00o37)) + this.OooO00o[7]) - 155497632, 16) + OooO00o39;
        int OooO00o41 = OooO00o(((OooO00o37 + OooO0OO(OooO00o40, OooO00o39, OooO00o38)) + this.OooO00o[10]) - 1094730640, 23) + OooO00o40;
        int OooO00o42 = OooO00o(OooO00o38 + OooO0OO(OooO00o41, OooO00o40, OooO00o39) + this.OooO00o[13] + 681279174, 4) + OooO00o41;
        int OooO00o43 = OooO00o(((OooO00o39 + OooO0OO(OooO00o42, OooO00o41, OooO00o40)) + this.OooO00o[0]) - 358537222, 11) + OooO00o42;
        int OooO00o44 = OooO00o(((OooO00o40 + OooO0OO(OooO00o43, OooO00o42, OooO00o41)) + this.OooO00o[3]) - 722521979, 16) + OooO00o43;
        int OooO00o45 = OooO00o(OooO00o41 + OooO0OO(OooO00o44, OooO00o43, OooO00o42) + this.OooO00o[6] + 76029189, 23) + OooO00o44;
        int OooO00o46 = OooO00o(((OooO00o42 + OooO0OO(OooO00o45, OooO00o44, OooO00o43)) + this.OooO00o[9]) - 640364487, 4) + OooO00o45;
        int OooO00o47 = OooO00o(((OooO00o43 + OooO0OO(OooO00o46, OooO00o45, OooO00o44)) + this.OooO00o[12]) - 421815835, 11) + OooO00o46;
        int OooO00o48 = OooO00o(OooO00o44 + OooO0OO(OooO00o47, OooO00o46, OooO00o45) + this.OooO00o[15] + 530742520, 16) + OooO00o47;
        int OooO00o49 = OooO00o(((OooO00o45 + OooO0OO(OooO00o48, OooO00o47, OooO00o46)) + this.OooO00o[2]) - 995338651, 23) + OooO00o48;
        int OooO00o50 = OooO00o(((OooO00o46 + OooO0Oo(OooO00o49, OooO00o48, OooO00o47)) + this.OooO00o[0]) - 198630844, 6) + OooO00o49;
        int OooO00o51 = OooO00o(OooO00o47 + OooO0Oo(OooO00o50, OooO00o49, OooO00o48) + this.OooO00o[7] + 1126891415, 10) + OooO00o50;
        int OooO00o52 = OooO00o(((OooO00o48 + OooO0Oo(OooO00o51, OooO00o50, OooO00o49)) + this.OooO00o[14]) - 1416354905, 15) + OooO00o51;
        int OooO00o53 = OooO00o(((OooO00o49 + OooO0Oo(OooO00o52, OooO00o51, OooO00o50)) + this.OooO00o[5]) - 57434055, 21) + OooO00o52;
        int OooO00o54 = OooO00o(OooO00o50 + OooO0Oo(OooO00o53, OooO00o52, OooO00o51) + this.OooO00o[12] + 1700485571, 6) + OooO00o53;
        int OooO00o55 = OooO00o(((OooO00o51 + OooO0Oo(OooO00o54, OooO00o53, OooO00o52)) + this.OooO00o[3]) - 1894986606, 10) + OooO00o54;
        int OooO00o56 = OooO00o(((OooO00o52 + OooO0Oo(OooO00o55, OooO00o54, OooO00o53)) + this.OooO00o[10]) - 1051523, 15) + OooO00o55;
        int OooO00o57 = OooO00o(((OooO00o53 + OooO0Oo(OooO00o56, OooO00o55, OooO00o54)) + this.OooO00o[1]) - 2054922799, 21) + OooO00o56;
        int OooO00o58 = OooO00o(OooO00o54 + OooO0Oo(OooO00o57, OooO00o56, OooO00o55) + this.OooO00o[8] + 1873313359, 6) + OooO00o57;
        int OooO00o59 = OooO00o(((OooO00o55 + OooO0Oo(OooO00o58, OooO00o57, OooO00o56)) + this.OooO00o[15]) - 30611744, 10) + OooO00o58;
        int OooO00o60 = OooO00o(((OooO00o56 + OooO0Oo(OooO00o59, OooO00o58, OooO00o57)) + this.OooO00o[6]) - 1560198380, 15) + OooO00o59;
        int OooO00o61 = OooO00o(OooO00o57 + OooO0Oo(OooO00o60, OooO00o59, OooO00o58) + this.OooO00o[13] + 1309151649, 21) + OooO00o60;
        int OooO00o62 = OooO00o(((OooO00o58 + OooO0Oo(OooO00o61, OooO00o60, OooO00o59)) + this.OooO00o[4]) - 145523070, 6) + OooO00o61;
        int OooO00o63 = OooO00o(((OooO00o59 + OooO0Oo(OooO00o62, OooO00o61, OooO00o60)) + this.OooO00o[11]) - 1120210379, 10) + OooO00o62;
        int OooO00o64 = OooO00o(OooO00o60 + OooO0Oo(OooO00o63, OooO00o62, OooO00o61) + this.OooO00o[2] + 718787259, 15) + OooO00o63;
        this.OooO0OO += OooO00o62;
        this.OooO0Oo += OooO00o(((OooO00o61 + OooO0Oo(OooO00o64, OooO00o63, OooO00o62)) + this.OooO00o[9]) - 343485551, 21) + OooO00o64;
        this.OooO0o0 += OooO00o64;
        this.OooO0o += OooO00o63;
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
