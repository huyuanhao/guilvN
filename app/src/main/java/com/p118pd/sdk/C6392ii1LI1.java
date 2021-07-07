package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.i丨i1丨LI1  reason: invalid class name and case insensitive filesystem */
public class C6392ii1LI1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6392ii1LI1(int i, BigInteger bigInteger) {
        byte[] OooO00o2 = IIiL.OooO00o((i + 7) / 8, bigInteger);
        iILLL1 r5 = new iILLL1();
        r5.OooO00o(new C6513lIiI(1));
        r5.OooO00o(new C6487lIIiIlL(OooO00o2));
        this.OooO00o = new C5707LiL1(r5);
    }

    public C6392ii1LI1(int i, BigInteger bigInteger, iIilII1 iiilii1, AbstractC6854lLi1LL r7) {
        byte[] OooO00o2 = IIiL.OooO00o((i + 7) / 8, bigInteger);
        iILLL1 r5 = new iILLL1();
        r5.OooO00o(new C6513lIiI(1));
        r5.OooO00o(new C6487lIIiIlL(OooO00o2));
        if (r7 != null) {
            r5.OooO00o(new ILI1Ll(true, 0, r7));
        }
        if (iiilii1 != null) {
            r5.OooO00o(new ILI1Ll(true, 1, iiilii1));
        }
        this.OooO00o = new C5707LiL1(r5);
    }

    public C6392ii1LI1(int i, BigInteger bigInteger, AbstractC6854lLi1LL r4) {
        this(i, bigInteger, null, r4);
    }

    public C6392ii1LI1(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C6392ii1LI1(BigInteger bigInteger) {
        this(bigInteger.bitLength(), bigInteger);
    }

    public C6392ii1LI1(BigInteger bigInteger, iIilII1 iiilii1, AbstractC6854lLi1LL r4) {
        this(bigInteger.bitLength(), bigInteger, iiilii1, r4);
    }

    public C6392ii1LI1(BigInteger bigInteger, AbstractC6854lLi1LL r3) {
        this(bigInteger, (iIilII1) null, r3);
    }

    private AbstractC6122iIlLiL OooO00o(int i) {
        Enumeration OooO00o2 = this.OooO00o.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL r1 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r1 instanceof AbstractC5903LlLLL) {
                AbstractC5903LlLLL r12 = (AbstractC5903LlLLL) r1;
                if (r12.OooO00o() == i) {
                    return r12.OooO0o().m17017OooO0O0();
                }
            }
        }
        return null;
    }

    public static C6392ii1LI1 OooO00o(Object obj) {
        if (obj instanceof C6392ii1LI1) {
            return (C6392ii1LI1) obj;
        }
        if (obj != null) {
            return new C6392ii1LI1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return (iIilII1) OooO00o(1);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m17511OooO00o() {
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
