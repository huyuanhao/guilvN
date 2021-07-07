package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.L丨1  reason: invalid class name and case insensitive filesystem */
public class C5822L1 implements AbstractC5649LIlI {
    public C6512lIilLl OooO00o;

    @Override // com.p118pd.sdk.AbstractC5649LIlI
    public int OooO00o() {
        return (this.OooO00o.OooO00o().OooO00o().OooO0O0() + 7) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    public BigInteger OooO00o(AbstractC6370iIIIl r5) {
        LL1ii1l r52 = (LL1ii1l) r5;
        C5600L1iLL OooO00o2 = this.OooO00o.OooO00o();
        if (OooO00o2.equals(r52.OooO00o())) {
            BigInteger OooO00o3 = this.OooO00o.OooO00o();
            AbstractC9738llL1L OooO00o4 = Lii1I.OooO00o(OooO00o2.OooO00o(), r52.OooO00o());
            if (!OooO00o4.m21814OooO0OO()) {
                BigInteger OooO00o5 = OooO00o2.m16004OooO00o();
                if (!OooO00o5.equals(AbstractC5490IlLL.OooO0O0)) {
                    OooO00o3 = OooO00o2.OooO0O0().multiply(OooO00o3).mod(OooO00o2.OooO0OO());
                    OooO00o4 = Lii1I.OooO00o(OooO00o4, OooO00o5);
                }
                AbstractC9738llL1L OooO0Oo = OooO00o4.OooO00o(OooO00o3).OooO0Oo();
                if (!OooO0Oo.m21814OooO0OO()) {
                    return OooO0Oo.m21802OooO00o().m21859OooO00o();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
            }
            throw new IllegalStateException("Infinity is not a valid public key for ECDH");
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16416OooO00o(AbstractC6370iIIIl r1) {
        this.OooO00o = (C6512lIilLl) r1;
    }
}
