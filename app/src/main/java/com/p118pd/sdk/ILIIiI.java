package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ILIIiI */
public class ILIIiI extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final BigInteger f15564OooO00o;

    public ILIIiI(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.f15564OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(1)).m17647OooO0O0();
            return;
        }
        throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
    }

    public ILIIiI(C6456l1ilL r1, int i) {
        this.OooO00o = r1;
        this.f15564OooO00o = BigInteger.valueOf((long) i);
    }

    public static ILIIiI OooO00o(Object obj) {
        if (obj instanceof ILIIiI) {
            return (ILIIiI) obj;
        }
        if (obj != null) {
            return new ILIIiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15486OooO00o() {
        return this.f15564OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(new C6513lIiI(this.f15564OooO00o));
        return new C5707LiL1(r0);
    }
}
