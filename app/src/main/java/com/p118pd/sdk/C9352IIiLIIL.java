package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨IIiLIIL  reason: invalid class name and case insensitive filesystem */
public class C9352IIiLIIL implements AbstractC5649LIlI {
    public C6512lIilLl OooO00o;

    @Override // com.p118pd.sdk.AbstractC5649LIlI
    public int OooO00o() {
        return (this.OooO00o.OooO00o().OooO00o().OooO0O0() + 7) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    public BigInteger OooO00o(AbstractC6370iIIIl r4) {
        LL1ii1l r42 = (LL1ii1l) r4;
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        if (OooO00o2.equals(r42.OooO00o())) {
            BigInteger mod = OooO00o2.m16004OooO00o().multiply(this.OooO00o.OooO00o()).mod(OooO00o2.OooO0OO());
            AbstractC9738llL1L OooO00o3 = Lii1I.OooO00o(OooO00o2.OooO00o(), r42.OooO00o());
            if (!OooO00o3.m21814OooO0OO()) {
                AbstractC9738llL1L OooO0Oo = OooO00o3.OooO00o(mod).OooO0Oo();
                if (!OooO0Oo.m21814OooO0OO()) {
                    return OooO0Oo.m21802OooO00o().m21859OooO00o();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21411OooO00o(AbstractC6370iIIIl r1) {
        this.OooO00o = (C6512lIilLl) r1;
    }
}
