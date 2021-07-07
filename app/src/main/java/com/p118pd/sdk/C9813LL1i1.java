package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨LL1丨i1  reason: invalid class name and case insensitive filesystem */
public class C9813LL1i1 extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;

    public C9813LL1i1(AbstractC6804llL1ii r1) {
        this.OooO00o = r1;
    }

    public C9813LL1i1(AbstractC9738llL1L r2) {
        this.OooO00o = new C6487lIIiIlL(AbstractC5755LiL.OooO00o(r2));
    }

    public static C9813LL1i1 OooO00o(Object obj) {
        if (obj instanceof C9813LL1i1) {
            return (C9813LL1i1) obj;
        }
        if (obj != null) {
            return new C9813LL1i1(AbstractC6804llL1ii.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
