package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨II  reason: invalid class name and case insensitive filesystem */
public class C9347II implements AbstractC5649LIlI {
    public C9507LiLl1i OooO00o;

    private AbstractC9738llL1L OooO00o(C5600L1iLL r5, C6512lIilLl r6, C6512lIilLl r7, LL1ii1l r8, LL1ii1l r9, LL1ii1l r10) {
        BigInteger OooO0OO = r5.OooO0OO();
        int bitLength = (OooO0OO.bitLength() + 1) / 2;
        BigInteger shiftLeft = AbstractC5490IlLL.OooO0O0.shiftLeft(bitLength);
        IIiLIli OooO00o2 = r5.OooO00o();
        AbstractC9738llL1L OooO00o3 = Lii1I.OooO00o(OooO00o2, r8.OooO00o());
        AbstractC9738llL1L OooO00o4 = Lii1I.OooO00o(OooO00o2, r9.OooO00o());
        AbstractC9738llL1L OooO00o5 = Lii1I.OooO00o(OooO00o2, r10.OooO00o());
        BigInteger mod = r6.OooO00o().multiply(OooO00o3.m21802OooO00o().m21859OooO00o().mod(shiftLeft).setBit(bitLength)).add(r7.OooO00o()).mod(OooO0OO);
        BigInteger bit = OooO00o5.m21802OooO00o().m21859OooO00o().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = r5.m16004OooO00o().multiply(mod).mod(OooO0OO);
        return Lii1I.OooO0Oo(OooO00o4, bit.multiply(mod2).mod(OooO0OO), OooO00o5, mod2);
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI
    public int OooO00o() {
        return (this.OooO00o.OooO0O0().OooO00o().OooO00o().OooO0O0() + 7) / 8;
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    public BigInteger OooO00o(AbstractC6370iIIIl r9) {
        if (!C9358II1.m21422OooO00o("org.bouncycastle.ec.disable_mqv")) {
            C5344Ii1I r92 = (C5344Ii1I) r9;
            C6512lIilLl OooO0O0 = this.OooO00o.OooO0O0();
            C5600L1iLL OooO00o2 = OooO0O0.OooO00o();
            if (OooO00o2.equals(r92.OooO0O0().OooO00o())) {
                AbstractC9738llL1L OooO0Oo = OooO00o(OooO00o2, OooO0O0, this.OooO00o.m21571OooO00o(), this.OooO00o.OooO00o(), r92.OooO0O0(), r92.OooO00o()).OooO0Oo();
                if (!OooO0Oo.m21814OooO0OO()) {
                    return OooO0Oo.m21802OooO00o().m21859OooO00o();
                }
                throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
            }
            throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
        }
        throw new IllegalStateException("ECMQV explicitly disabled");
    }

    @Override // com.p118pd.sdk.AbstractC5649LIlI, com.p118pd.sdk.AbstractC5649LIlI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21389OooO00o(AbstractC6370iIIIl r1) {
        this.OooO00o = (C9507LiLl1i) r1;
    }
}
