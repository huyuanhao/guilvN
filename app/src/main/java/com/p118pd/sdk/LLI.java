package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LLI */
public class LLI extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public LLI(I11li1 i11li1) {
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        if (i11li1.size() > 1) {
            this.OooO00o = i11li1.OooO00o(1);
        }
    }

    public LLI(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = null;
    }

    public LLI(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static LLI OooO00o(Object obj) {
        if (obj instanceof LLI) {
            return (LLI) obj;
        }
        if (obj != null) {
            return new LLI(I11li1.OooO00o(obj));
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
    public AbstractC6854lLi1LL m16188OooO0O0() {
        return this.OooO00o;
    }
}
