package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1丨ll丨丨  reason: invalid class name and case insensitive filesystem */
public class C5605L1ll extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C5605L1ll(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = i11li1.OooO00o(1);
    }

    public C5605L1ll(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C5605L1ll OooO00o(Object obj) {
        if (obj instanceof C5605L1ll) {
            return (C5605L1ll) obj;
        }
        if (obj != null) {
            return new C5605L1ll(I11li1.OooO00o(obj));
        }
        throw new IllegalArgumentException("null value in getInstance()");
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16007OooO0O0() {
        return this.OooO00o;
    }
}
