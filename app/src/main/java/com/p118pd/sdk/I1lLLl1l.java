package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1lLLl1l */
public class I1lLLl1l extends AbstractC5738Lil {
    public static final LlLI1 o00OoOo = AbstractC5711LiLli.o0000oo;
    public static final LlLI1 o00OoOo0 = AbstractC5711LiLli.o0000O00;
    public static final LlLI1 o00OoOoo = AbstractC5711LiLli.o0000oO;
    public static final LlLI1 o00Ooo0 = AbstractC5711LiLli.OoooOoo;
    public static final LlLI1 o00Ooo00 = new LlLI1("1.3.14.3.2.7");
    public static final LlLI1 o00Ooo0O = AbstractC5711LiLli.Ooooo00;
    public static final LlLI1 o00Ooo0o = AbstractC5905LllI.OooOo0;
    public static final LlLI1 o00OooO = AbstractC5905LllI.Oooo0OO;
    public static final LlLI1 o00OooO0 = AbstractC5905LllI.OooOoo;
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public I1lLLl1l(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        if (i11li1.size() > 1) {
            this.OooO00o = (AbstractC6122iIlLiL) i11li1.OooO00o(1);
        }
    }

    public I1lLLl1l(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static I1lLLl1l OooO00o(Object obj) {
        if (obj == null || (obj instanceof I1lLLl1l)) {
            return (I1lLLl1l) obj;
        }
        if (obj instanceof I11li1) {
            return new I1lLLl1l((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid SMIMECapability");
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
    public AbstractC6854lLi1LL m15306OooO0O0() {
        return this.OooO00o;
    }
}
