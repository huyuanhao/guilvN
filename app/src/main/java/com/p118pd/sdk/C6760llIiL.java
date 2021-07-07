package com.p118pd.sdk;

/* renamed from: com.pd.sdk.llIiL  reason: case insensitive filesystem */
public final class C6760llIiL extends AbstractC5658LLLi {
    public static final byte[] OooOO0 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public C6760llIiL() {
        super(OooOO0);
    }

    public C6760llIiL(C6760llIiL lliil) {
        super(OooOO0);
        OooO00o(lliil);
    }

    @Override // com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[64];
        super.m16224OooO00o(bArr2, 0);
        System.arraycopy(bArr2, 32, bArr, i, 32);
        return 32;
    }

    @Override // com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C6760llIiL(this);
    }

    @Override // com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17865OooO00o() {
        return "GOST3411-2012-256";
    }

    @Override // com.p118pd.sdk.AbstractC5658LLLi, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return 32;
    }
}
