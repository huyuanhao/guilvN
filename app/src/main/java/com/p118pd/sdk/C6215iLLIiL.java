package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨丨LIiL  reason: invalid class name and case insensitive filesystem */
public class C6215iLLIiL implements Ii1IliL {
    public C9828LlI OooO00o;

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        if (this.OooO00o == null) {
            this.OooO00o = new C9828LlI();
        }
        this.OooO00o.OooO00o(z, r3);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        C9828LlI r0 = this.OooO00o;
        if (r0 != null) {
            return r0.m21919OooO00o(r0.OooO00o(r0.OooO00o(bArr, i, i2)));
        }
        throw new IllegalStateException("RSA engine not initialised");
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
