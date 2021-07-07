package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.lI1丨Ll  reason: invalid class name */
public class lI1Ll extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public lI1Ll(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public lI1Ll(BigInteger bigInteger) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(1));
        r0.OooO00o(new C6487lIIiIlL(OooO00o2));
        this.OooO00o = new C5707LiL1(r0);
    }

    public lI1Ll(BigInteger bigInteger, iIilII1 iiilii1, AbstractC6854lLi1LL r7) {
        byte[] OooO00o2 = IIiL.OooO00o(bigInteger);
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI(1));
        r0.OooO00o(new C6487lIIiIlL(OooO00o2));
        if (r7 != null) {
            r0.OooO00o(new ILI1Ll(true, 0, r7));
        }
        if (iiilii1 != null) {
            r0.OooO00o(new ILI1Ll(true, 1, iiilii1));
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public lI1Ll(BigInteger bigInteger, AbstractC6854lLi1LL r3) {
        this(bigInteger, null, r3);
    }

    private AbstractC6122iIlLiL OooO00o(int i) {
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL r1 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r1 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r12 = (AbstractC5903LlLLL) r1;
                if (r12.OooO00o() == i) {
                    return r12.OooO0o().OooO0O0();
                }
            }
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return (iIilII1) OooO00o(1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17624OooO00o() {
        return new BigInteger(1, ((AbstractC6804llL1ii) this.OooO00o.OooO00o(1)).m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public AbstractC6122iIlLiL OooO0Oo() {
        return OooO00o(0);
    }
}
