package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.丨LlLL丨I  reason: invalid class name and case insensitive filesystem */
public class C9529LlLLI implements lIL1i11, AbstractC6186iLi1 {
    public static final int OooO00o = 256;
    public static final int OooO0O0 = 512;
    public static final int OooO0OO = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1Li1 f23101OooO00o;

    public C9529LlLLI(int i, int i2) {
        this.f23101OooO00o = new i1Li1(i, i2);
        OooO00o((LLLilLi) null);
    }

    public C9529LlLLI(C9529LlLLI r2) {
        this.f23101OooO00o = new i1Li1(r2.f23101OooO00o);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    public int OooO00o() {
        return this.f23101OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        return this.f23101OooO00o.OooO00o(bArr, i);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6186iLi1 m21587OooO00o() {
        return new C9529LlLLI(this);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC6186iLi1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21588OooO00o() {
        return "Skein-" + (this.f23101OooO00o.OooO00o() * 8) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (this.f23101OooO00o.m16875OooO0O0() * 8);
    }

    public void OooO00o(LLLilLi r2) {
        this.f23101OooO00o.OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r2) {
        this.f23101OooO00o.OooO00o((AbstractC6186iLi1) ((C9529LlLLI) r2).f23101OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.f23101OooO00o.m16875OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.f23101OooO00o.m16874OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        this.f23101OooO00o.OooO00o(b);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        this.f23101OooO00o.OooO00o(bArr, i, i2);
    }
}
