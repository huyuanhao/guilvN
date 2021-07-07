package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IIllLll1 */
public class IIllLll1 extends AbstractC5738Lil {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15516OooO00o;

    public IIllLll1(I11li1 i11li1) {
        this.OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        this.f15516OooO00o = (C6513lIiI) i11li1.OooO00o(1);
    }

    public IIllLll1(LilIiIl lilIiIl) {
        this.OooO00o = lilIiIl.m16318OooO00o();
        this.f15516OooO00o = lilIiIl.m16320OooO00o();
    }

    public IIllLll1(l1LILI1 r1, BigInteger bigInteger) {
        this.OooO00o = r1;
        this.f15516OooO00o = new C6513lIiI(bigInteger);
    }

    public IIllLll1(C929811Li1 r1, C6513lIiI r2) {
        this.OooO00o = l1LILI1.OooO00o(r1);
        this.f15516OooO00o = r2;
    }

    public IIllLll1(C929811Li1 r1, BigInteger bigInteger) {
        this.OooO00o = l1LILI1.OooO00o(r1);
        this.f15516OooO00o = new C6513lIiI(bigInteger);
    }

    public IIllLll1(C9734l1 r2) {
        this.OooO00o = r2.m21793OooO00o();
        this.f15516OooO00o = r2.m21795OooO00o();
    }

    public static IIllLll1 OooO00o(Object obj) {
        if (obj instanceof IIllLll1) {
            return (IIllLll1) obj;
        }
        if (obj != null) {
            return new IIllLll1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public l1LILI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15417OooO00o() {
        return this.f15516OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15516OooO00o);
        return new C5707LiL1(r0);
    }
}
