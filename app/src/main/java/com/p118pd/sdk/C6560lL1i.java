package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lL1i丨  reason: invalid class name and case insensitive filesystem */
public class C6560lL1i extends AbstractC5738Lil {
    public LII OooO00o;
    public LlLI1 o00OoOOo;

    public C6560lL1i(I11li1 i11li1) {
        int i = 0;
        AbstractC6854lLi1LL OooO00o2 = i11li1.OooO00o(0);
        if (OooO00o2.OooO0O0() instanceof LII) {
            this.OooO00o = LII.OooO00o(OooO00o2);
            i = 1;
        }
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(i));
    }

    public C6560lL1i(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
        this.OooO00o = null;
    }

    public C6560lL1i(LlLI1 llLI1, LII lii) {
        this.o00OoOOo = llLI1;
        this.OooO00o = lii;
    }

    public static C6560lL1i OooO00o(Object obj) {
        if (obj instanceof C6560lL1i) {
            return (C6560lL1i) obj;
        }
        if (obj != null) {
            return new C6560lL1i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LII OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17661OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        LII lii = this.OooO00o;
        if (lii != null) {
            r0.OooO00o(lii);
        }
        r0.OooO00o(this.o00OoOOo);
        return new C5707LiL1(r0);
    }
}
