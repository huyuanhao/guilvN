package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lll丨Il  reason: invalid class name and case insensitive filesystem */
public class C6798lllIl implements Ii1IliL {
    public liLI1l1i OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9828LlI f18846OooO00o = new C9828LlI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f18847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18848OooO00o;

    private BigInteger OooO00o(BigInteger bigInteger) {
        return bigInteger.multiply(this.f18847OooO00o.modPow(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0())).mod(this.OooO00o.OooO0O0());
    }

    private BigInteger OooO0O0(BigInteger bigInteger) {
        BigInteger OooO0O0 = this.OooO00o.OooO0O0();
        return bigInteger.multiply(this.f18847OooO00o.modInverse(OooO0O0)).mod(OooO0O0);
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO00o() {
        return this.f18846OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) {
        if (r4 instanceof liLL1l) {
            r4 = ((liLL1l) r4).OooO00o();
        }
        C6316ilLLi1 r42 = (C6316ilLLi1) r4;
        this.f18846OooO00o.OooO00o(z, r42.OooO00o());
        this.f18848OooO00o = z;
        this.OooO00o = r42.OooO00o();
        this.f18847OooO00o = r42.m17358OooO00o();
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public byte[] OooO00o(byte[] bArr, int i, int i2) {
        BigInteger OooO00o2 = this.f18846OooO00o.OooO00o(bArr, i, i2);
        return this.f18846OooO00o.m21919OooO00o(this.f18848OooO00o ? OooO00o(OooO00o2) : OooO0O0(OooO00o2));
    }

    @Override // com.p118pd.sdk.Ii1IliL
    public int OooO0O0() {
        return this.f18846OooO00o.OooO0O0();
    }
}
