package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨11  reason: invalid class name */
public class C11 extends AbstractC5738Lil {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f22717OooO00o;

    public C11(I11li1 i11li1) {
        this.OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        this.f22717OooO00o = (C6513lIiI) i11li1.OooO00o(1);
    }

    public C11(l1LILI1 r1, BigInteger bigInteger) {
        this.OooO00o = r1;
        this.f22717OooO00o = new C6513lIiI(bigInteger);
    }

    public C11(C929811Li1 r1, C6513lIiI r2) {
        this.OooO00o = l1LILI1.OooO00o(r1.OooO0O0());
        this.f22717OooO00o = r2;
    }

    public C11(C929811Li1 r1, BigInteger bigInteger) {
        this.OooO00o = l1LILI1.OooO00o(r1.OooO0O0());
        this.f22717OooO00o = new C6513lIiI(bigInteger);
    }

    public static C11 OooO00o(Object obj) {
        if (obj instanceof C11) {
            return (C11) obj;
        }
        if (obj != null) {
            return new C11(I11li1.OooO00o(obj));
        }
        return null;
    }

    public l1LILI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21228OooO00o() {
        return this.f22717OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f22717OooO00o);
        return new C5707LiL1(r0);
    }
}
