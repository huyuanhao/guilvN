package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1iLLll丨  reason: invalid class name */
public class i1iLLll extends LLILL {
    public static final int OooO0Oo = 48;

    public i1iLLll() {
    }

    public i1iLLll(i1iLLll r1) {
        super(r1);
    }

    public i1iLLll(byte[] bArr) {
        OooO0O0(bArr);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public int OooO00o(byte[] bArr, int i) {
        OooO0O0();
        AbstractC6464l1l.OooO00o(this.f16427OooO0OO, bArr, i);
        AbstractC6464l1l.OooO00o(this.OooO0Oo, bArr, i + 8);
        AbstractC6464l1l.OooO00o(this.OooO0o0, bArr, i + 16);
        AbstractC6464l1l.OooO00o(this.OooO0o, bArr, i + 24);
        AbstractC6464l1l.OooO00o(this.OooO0oO, bArr, i + 32);
        AbstractC6464l1l.OooO00o(this.OooO0oo, bArr, i + 40);
        reset();
        return 48;
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    public AbstractC6186iLi1 OooO00o() {
        return new i1iLLll(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16889OooO00o() {
        return LL1i.f16409OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        super.OooO00o((LLILL) ((i1iLLll) r1));
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16890OooO00o() {
        byte[] bArr = new byte[OooO0OO()];
        super.OooO00o(bArr);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public int OooO0O0() {
        return 48;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public void reset() {
        super.reset();
        this.f16427OooO0OO = -3766243637369397544L;
        this.OooO0Oo = 7105036623409894663L;
        this.OooO0o0 = -7973340178411365097L;
        this.OooO0o = 1526699215303891257L;
        this.OooO0oO = 7436329637833083697L;
        this.OooO0oo = -8163818279084223215L;
        this.OooO = -2662702644619276377L;
        this.OooOO0 = 5167115440072839076L;
    }
}
