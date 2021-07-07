package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LilL  reason: case insensitive filesystem */
public class C5743LilL implements AbstractC93171I1 {
    public final AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final l1lILl f16652OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16653OooO00o;

    public C5743LilL(l1lILl r1, AbstractC6436l11LI r2) {
        this.f16652OooO00o = r1;
        this.OooO00o = r2;
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        this.f16653OooO00o = z;
        C6213iL11I r0 = r4 instanceof liLL1l ? (C6213iL11I) ((liLL1l) r4).OooO00o() : (C6213iL11I) r4;
        if (z && !r0.OooO00o()) {
            throw new IllegalArgumentException("Signing Requires Private Key.");
        } else if (z || !r0.OooO00o()) {
            reset();
            this.f16652OooO00o.OooO00o(z, r4);
        } else {
            throw new IllegalArgumentException("Verification Requires Public Key.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public boolean OooO00o(byte[] bArr) {
        if (!this.f16653OooO00o) {
            byte[] bArr2 = new byte[this.OooO00o.OooO0O0()];
            this.OooO00o.OooO00o(bArr2, 0);
            return this.f16652OooO00o.OooO00o(bArr2, bArr);
        }
        throw new IllegalStateException("DigestingMessageSigner not initialised for verification");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() {
        if (this.f16653OooO00o) {
            byte[] bArr = new byte[this.OooO00o.OooO0O0()];
            this.OooO00o.OooO00o(bArr, 0);
            return this.f16652OooO00o.OooO00o(bArr);
        }
        throw new IllegalStateException("DigestingMessageSigner not initialised for signature generation.");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.OooO00o.update(bArr, i, i2);
    }
}
