package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iI1Lll */
public class iI1Lll extends AbstractC5738Lil {
    public final C6039i1ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final l1LILI1 f17477OooO00o;

    public iI1Lll(I11li1 i11li1) {
        this.f17477OooO00o = l1LILI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = i11li1.size() == 2 ? C6039i1ii.OooO00o(i11li1.OooO00o(1)) : null;
    }

    public static iI1Lll OooO00o(Object obj) {
        if (obj instanceof iI1Lll) {
            return (iI1Lll) obj;
        }
        if (obj != null) {
            return new iI1Lll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6039i1ii OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m16939OooO00o() {
        return this.f17477OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17477OooO00o);
        C6039i1ii r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
