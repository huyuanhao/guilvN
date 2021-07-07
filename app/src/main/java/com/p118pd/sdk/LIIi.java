package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LII丨i  reason: invalid class name */
public class LIIi extends AbstractC5738Lil {
    public I11L OooO00o;
    public LlLI1 o00OoOOo;

    public LIIi(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = (I11L) i11li1.OooO00o(1);
    }

    public LIIi(LlLI1 llLI1, I11L i11l) {
        this.o00OoOOo = llLI1;
        this.OooO00o = i11l;
    }

    public static LIIi OooO00o(Object obj) {
        if (obj == null || (obj instanceof LIIi)) {
            return (LIIi) obj;
        }
        if (obj instanceof I11li1) {
            return new LIIi((I11li1) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16037OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL[] m16038OooO00o() {
        return this.OooO00o.m15218OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
