package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LILlL  reason: case insensitive filesystem */
public class C5622LILlL extends LLILL {
    public static final int OooO0Oo = 64;

    public C5622LILlL() {
    }

    public C5622LILlL(C5622LILlL lILlL) {
        super(lILlL);
    }

    public C5622LILlL(byte[] bArr) {
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
        AbstractC6464l1l.OooO00o(this.OooO, bArr, i + 48);
        AbstractC6464l1l.OooO00o(this.OooOO0, bArr, i + 56);
        reset();
        return 64;
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    public AbstractC6186iLi1 OooO00o() {
        return new C5622LILlL(this);
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16062OooO00o() {
        return LL1i.f16408OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        OooO00o((LLILL) ((C5622LILlL) r1));
    }

    @Override // com.p118pd.sdk.C1l11i, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1, com.p118pd.sdk.LLILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16063OooO00o() {
        byte[] bArr = new byte[OooO0OO()];
        super.OooO00o(bArr);
        return bArr;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public int OooO0O0() {
        return 64;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.LLILL
    public void reset() {
        super.reset();
        this.f16427OooO0OO = 7640891576956012808L;
        this.OooO0Oo = -4942790177534073029L;
        this.OooO0o0 = 4354685564936845355L;
        this.OooO0o = -6534734903238641935L;
        this.OooO0oO = 5840696475078001361L;
        this.OooO0oo = -7276294671716946913L;
        this.OooO = 2270897969802886507L;
        this.OooOO0 = 6620516959819538809L;
    }
}
