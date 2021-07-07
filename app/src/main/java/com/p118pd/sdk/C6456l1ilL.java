package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1i丨lL丨丨  reason: invalid class name and case insensitive filesystem */
public class C6456l1ilL extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C6456l1ilL(I11li1 i11li1) {
        if (i11li1.size() < 1 || i11li1.size() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
        }
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = i11li1.size() == 2 ? i11li1.OooO00o(1) : null;
    }

    public C6456l1ilL(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    public C6456l1ilL(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C6456l1ilL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6456l1ilL OooO00o(Object obj) {
        if (obj instanceof C6456l1ilL) {
            return (C6456l1ilL) obj;
        }
        if (obj != null) {
            return new C6456l1ilL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        AbstractC6854lLi1LL r1 = this.OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17587OooO0O0() {
        return this.OooO00o;
    }
}
