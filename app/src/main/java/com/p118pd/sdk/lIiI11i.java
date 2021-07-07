package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lIiI丨11i  reason: invalid class name */
public class lIiI11i extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public lIiI11i(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = ((AbstractC5903LlLLL) i11li1.OooO00o(1)).OooO0o();
    }

    public lIiI11i(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static lIiI11i OooO00o(Object obj) {
        if (obj instanceof lIiI11i) {
            return (lIiI11i) obj;
        }
        if (obj != null) {
            return new lIiI11i(I11li1.OooO00o(obj));
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
        r0.OooO00o(new ILI1Ll(0, this.OooO00o));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17637OooO0O0() {
        return this.OooO00o;
    }
}
