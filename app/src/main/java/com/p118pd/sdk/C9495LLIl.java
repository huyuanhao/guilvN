package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LLIl  reason: invalid class name and case insensitive filesystem */
public class C9495LLIl extends L1ill implements C1l11i {
    public static final int[] OooO0O0 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public static final int OooOO0o = 28;
    public int OooO;
    public int[] OooO00o;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;

    public C9495LLIl() {
        this.OooO00o = new int[64];
        reset();
    }

    public C9495LLIl(C9495LLIl r2) {
        super(r2);
        this.OooO00o = new int[64];
        OooO00o(r2);
    }

    public C9495LLIl(byte[] bArr) {
        super(bArr);
        this.OooO00o = new int[64];
        this.OooO0OO = AbstractC6464l1l.OooO00o(bArr, 16);
        this.OooO0Oo = AbstractC6464l1l.OooO00o(bArr, 20);
        this.OooO0o0 = AbstractC6464l1l.OooO00o(bArr, 24);
        this.OooO0o = AbstractC6464l1l.OooO00o(bArr, 28);
        this.OooO0oO = AbstractC6464l1l.OooO00o(bArr, 32);
        this.OooO0oo = AbstractC6464l1l.OooO00o(bArr, 36);
        this.OooO = AbstractC6464l1l.OooO00o(bArr, 40);
        this.OooOO0 = AbstractC6464l1l.OooO00o(bArr, 44);
        this.OooOO0O = AbstractC6464l1l.OooO00o(bArr, 48);
        for (int i = 0; i != this.OooOO0O; i++) {
            this.OooO00o[i] = AbstractC6464l1l.OooO00o(bArr, (i * 4) + 52);
        }
    }

    private int OooO00o(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private int OooO00o(int i, int i2, int i3) {
        return ((i ^ -1) & i3) ^ (i2 & i);
    }

    private void OooO00o(C9495LLIl r5) {
        super.OooO00o((L1ill) r5);
        this.OooO0OO = r5.OooO0OO;
        this.OooO0Oo = r5.OooO0Oo;
        this.OooO0o0 = r5.OooO0o0;
        this.OooO0o = r5.OooO0o;
        this.OooO0oO = r5.OooO0oO;
        this.OooO0oo = r5.OooO0oo;
        this.OooO = r5.OooO;
        this.OooOO0 = r5.OooOO0;
        int[] iArr = r5.OooO00o;
        System.arraycopy(iArr, 0, this.OooO00o, 0, iArr.length);
        this.OooOO0O = r5.OooOO0O;
    }

    private int OooO0O0(int i) {
        return ((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)));
    }

    private int OooO0O0(int i, int i2, int i3) {
        return ((i & i3) ^ (i & i2)) ^ (i2 & i3);
    }

    private int OooO0OO(int i) {
        return (i >>> 3) ^ (((i >>> 7) | (i << 25)) ^ ((i >>> 18) | (i << 14)));
    }

    private int OooO0Oo(int i) {
        return (i >>> 10) ^ (((i >>> 17) | (i << 15)) ^ ((i >>> 19) | (i << 13)));
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, i);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, i + 4);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, i + 8);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, i + 12);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, i + 16);
        AbstractC6464l1l.OooO00o(this.OooO0oo, bArr, i + 20);
        AbstractC6464l1l.OooO00o(this.OooO, bArr, i + 24);
        reset();
        return 28;
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C9495LLIl(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21546OooO00o() {
        return LL1i.OooO0OO;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO00o(long j) {
        if (this.OooOO0O > 14) {
            OooO0OO();
        }
        int[] iArr = this.OooO00o;
        iArr[14] = (int) (j >>> 32);
        iArr[15] = (int) (j & -1);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        OooO00o((C9495LLIl) r1);
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21547OooO00o(byte[] bArr, int i) {
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i3 + 1] & 255) | (bArr[i] << 24) | ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        int[] iArr = this.OooO00o;
        int i5 = this.OooOO0O;
        iArr[i5] = i4;
        int i6 = i5 + 1;
        this.OooOO0O = i6;
        if (i6 == 16) {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.L1ill, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21548OooO00o() {
        byte[] bArr = new byte[((this.OooOO0O * 4) + 52)];
        super.OooO00o(bArr);
        AbstractC6464l1l.OooO00o(this.OooO0OO, bArr, 16);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, 20);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, 24);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, 28);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, 32);
        AbstractC6464l1l.OooO00o(this.OooO0oo, bArr, 36);
        AbstractC6464l1l.OooO00o(this.OooO, bArr, 40);
        AbstractC6464l1l.OooO00o(this.OooOO0, bArr, 44);
        AbstractC6464l1l.OooO00o(this.OooOO0O, bArr, 48);
        for (int i = 0; i != this.OooOO0O; i++) {
            AbstractC6464l1l.OooO00o(this.OooO00o[i], bArr, (i * 4) + 52);
        }
        return bArr;
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 28;
    }

    @Override // com.p118pd.sdk.L1ill
    public void OooO0OO() {
        for (int i = 16; i <= 63; i++) {
            int[] iArr = this.OooO00o;
            int OooO0Oo2 = OooO0Oo(iArr[i - 2]);
            int[] iArr2 = this.OooO00o;
            iArr[i] = OooO0Oo2 + iArr2[i - 7] + OooO0OO(iArr2[i - 15]) + this.OooO00o[i - 16];
        }
        int i2 = this.OooO0OO;
        int i3 = this.OooO0Oo;
        int i4 = this.OooO0o0;
        int i5 = this.OooO0o;
        int i6 = this.OooO0oO;
        int i7 = this.OooO0oo;
        int i8 = this.OooO;
        int i9 = this.OooOO0;
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            int OooO0O02 = i9 + OooO0O0(i6) + OooO00o(i6, i7, i8) + OooO0O0[i10] + this.OooO00o[i10];
            int i12 = i5 + OooO0O02;
            int OooO00o2 = OooO0O02 + OooO00o(i2) + OooO0O0(i2, i3, i4);
            int i13 = i10 + 1;
            int OooO0O03 = i8 + OooO0O0(i12) + OooO00o(i12, i6, i7) + OooO0O0[i13] + this.OooO00o[i13];
            int i14 = i4 + OooO0O03;
            int OooO00o3 = OooO0O03 + OooO00o(OooO00o2) + OooO0O0(OooO00o2, i2, i3);
            int i15 = i13 + 1;
            int OooO0O04 = i7 + OooO0O0(i14) + OooO00o(i14, i12, i6) + OooO0O0[i15] + this.OooO00o[i15];
            int i16 = i3 + OooO0O04;
            int OooO00o4 = OooO0O04 + OooO00o(OooO00o3) + OooO0O0(OooO00o3, OooO00o2, i2);
            int i17 = i15 + 1;
            int OooO0O05 = i6 + OooO0O0(i16) + OooO00o(i16, i14, i12) + OooO0O0[i17] + this.OooO00o[i17];
            int i18 = i2 + OooO0O05;
            int OooO00o5 = OooO0O05 + OooO00o(OooO00o4) + OooO0O0(OooO00o4, OooO00o3, OooO00o2);
            int i19 = i17 + 1;
            int OooO0O06 = i12 + OooO0O0(i18) + OooO00o(i18, i16, i14) + OooO0O0[i19] + this.OooO00o[i19];
            i9 = OooO00o2 + OooO0O06;
            i5 = OooO0O06 + OooO00o(OooO00o5) + OooO0O0(OooO00o5, OooO00o4, OooO00o3);
            int i20 = i19 + 1;
            int OooO0O07 = i14 + OooO0O0(i9) + OooO00o(i9, i18, i16) + OooO0O0[i20] + this.OooO00o[i20];
            i8 = OooO00o3 + OooO0O07;
            i4 = OooO0O07 + OooO00o(i5) + OooO0O0(i5, OooO00o5, OooO00o4);
            int i21 = i20 + 1;
            int OooO0O08 = i16 + OooO0O0(i8) + OooO00o(i8, i9, i18) + OooO0O0[i21] + this.OooO00o[i21];
            i7 = OooO00o4 + OooO0O08;
            i3 = OooO0O08 + OooO00o(i4) + OooO0O0(i4, i5, OooO00o5);
            int i22 = i21 + 1;
            int OooO0O09 = i18 + OooO0O0(i7) + OooO00o(i7, i8, i9) + OooO0O0[i22] + this.OooO00o[i22];
            i6 = OooO00o5 + OooO0O09;
            i2 = OooO0O09 + OooO00o(i3) + OooO0O0(i3, i4, i5);
            i10 = i22 + 1;
        }
        this.OooO0OO += i2;
        this.OooO0Oo += i3;
        this.OooO0o0 += i4;
        this.OooO0o += i5;
        this.OooO0oO += i6;
        this.OooO0oo += i7;
        this.OooO += i8;
        this.OooOO0 += i9;
        this.OooOO0O = 0;
        for (int i23 = 0; i23 < 16; i23++) {
            this.OooO00o[i23] = 0;
        }
    }

    @Override // com.p118pd.sdk.L1ill, com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        super.reset();
        this.OooO0OO = -1056596264;
        this.OooO0Oo = 914150663;
        this.OooO0o0 = 812702999;
        this.OooO0o = -150054599;
        this.OooO0oO = -4191439;
        this.OooO0oo = 1750603025;
        this.OooO = 1694076839;
        this.OooOO0 = -1090891868;
        this.OooOO0O = 0;
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
