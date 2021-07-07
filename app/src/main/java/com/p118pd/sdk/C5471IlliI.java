package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.IlliI丨  reason: invalid class name and case insensitive filesystem */
public class C5471IlliI extends AbstractC5738Lil {
    public LI11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15898OooO00o;
    public C6513lIiI OooO0O0;

    public C5471IlliI(I11li1 i11li1) {
        if (i11li1.size() == 3) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            this.OooO00o = LI11.OooO00o(OooO00o2.nextElement());
            this.f15898OooO00o = C6513lIiI.OooO00o(OooO00o2.nextElement());
            this.OooO0O0 = C6513lIiI.OooO00o(OooO00o2.nextElement());
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C5471IlliI(String str, int i, int i2) {
        this.OooO00o = new LI11(str, true);
        this.f15898OooO00o = new C6513lIiI((long) i);
        this.OooO0O0 = new C6513lIiI((long) i2);
    }

    public static C5471IlliI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5471IlliI)) {
            return (C5471IlliI) obj;
        }
        if (obj instanceof I11li1) {
            return new C5471IlliI(I11li1.OooO00o(obj));
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public BigInteger OooO00o() {
        return this.f15898OooO00o.m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15898OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15712OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m15713OooO0O0() {
        return this.OooO0O0.m17647OooO0O0();
    }
}
