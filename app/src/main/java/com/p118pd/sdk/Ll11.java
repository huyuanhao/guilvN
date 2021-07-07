package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ll11 */
public class Ll11 extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public Ll11(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = i11li1.OooO00o(1);
    }

    public Ll11(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static Ll11 OooO00o(Object obj) {
        if (obj instanceof Ll11) {
            return (Ll11) obj;
        }
        if (obj != null) {
            return new Ll11(I11li1.OooO00o(obj));
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
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16355OooO0O0() {
        return this.OooO00o;
    }
}
