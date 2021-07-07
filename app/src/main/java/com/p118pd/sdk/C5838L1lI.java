package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.L丨1lI  reason: invalid class name and case insensitive filesystem */
public class C5838L1lI extends AbstractC5738Lil {
    public C6513lIiI OooO00o;
    public C6513lIiI OooO0O0;

    public C5838L1lI(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        this.OooO00o = (C6513lIiI) OooO00o2.nextElement();
        this.OooO0O0 = (C6513lIiI) OooO00o2.nextElement();
    }

    public C5838L1lI(BigInteger bigInteger, BigInteger bigInteger2) {
        this.OooO00o = new C6513lIiI(bigInteger);
        this.OooO0O0 = new C6513lIiI(bigInteger2);
    }

    public static C5838L1lI OooO00o(Object obj) {
        if (obj instanceof C5838L1lI) {
            return (C5838L1lI) obj;
        }
        if (obj != null) {
            return new C5838L1lI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16425OooO0O0() {
        return this.OooO00o.OooO00o();
    }
}
