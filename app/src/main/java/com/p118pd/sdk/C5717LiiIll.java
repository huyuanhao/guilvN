package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LiiIll  reason: case insensitive filesystem */
public class C5717LiiIll extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f16616OooO00o;
    public LlLI1 o00OoOOo;

    public C5717LiiIll(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.f16616OooO00o = ((AbstractC5903LlLLL) i11li1.OooO00o(1)).OooO0o();
        if (i11li1.size() == 3) {
            this.OooO00o = (I11L) i11li1.OooO00o(2);
        }
    }

    public C5717LiiIll(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.f16616OooO00o = r2;
        this.OooO00o = null;
    }

    public C5717LiiIll(LlLI1 llLI1, AbstractC6854lLi1LL r2, I11L i11l) {
        this.o00OoOOo = llLI1;
        this.f16616OooO00o = r2;
        this.OooO00o = i11l;
    }

    public static C5717LiiIll OooO00o(Object obj) {
        if (obj instanceof C5717LiiIll) {
            return (C5717LiiIll) obj;
        }
        if (obj != null) {
            return new C5717LiiIll(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11L OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m16311OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(new lLIL1(true, 0, this.f16616OooO00o));
        I11L i11l = this.OooO00o;
        if (i11l != null) {
            r0.OooO00o(i11l);
        }
        return new C6120iIlL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16312OooO0O0() {
        return this.f16616OooO00o;
    }
}
