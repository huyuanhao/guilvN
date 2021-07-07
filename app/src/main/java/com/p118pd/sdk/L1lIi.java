package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1lIi */
public class L1lIi implements lIL1i11 {
    public lIL1i11 OooO00o;

    public L1lIi(lIL1i11 r2) {
        if (r2 != null) {
            this.OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("baseDigest must not be null");
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        return this.OooO00o.OooO00o(bArr, i);
    }

    @Override // com.p118pd.sdk.lIL1i11, com.p118pd.sdk.AbstractC6436l11LI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15982OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        this.OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        this.OooO00o.update(bArr, i, i2);
    }
}
