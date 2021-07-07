package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilii  reason: case insensitive filesystem */
public class C6327ilii extends AbstractC5738Lil {
    public AbstractC6854lLi1LL OooO00o;
    public LlLI1 o00OoOOo;

    public C6327ilii(I11li1 i11li1) {
        this.o00OoOOo = LlLI1.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = i11li1.OooO00o(1);
    }

    public C6327ilii(LlLI1 llLI1, AbstractC6854lLi1LL r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C6327ilii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6327ilii OooO00o(Object obj) {
        if (obj instanceof C6327ilii) {
            return (C6327ilii) obj;
        }
        if (obj != null) {
            return new C6327ilii(I11li1.OooO00o(obj));
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
    public AbstractC6854lLi1LL m17383OooO0O0() {
        return this.OooO00o;
    }
}
