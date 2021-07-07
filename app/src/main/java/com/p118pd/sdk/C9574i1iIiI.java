package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨i1iIiI  reason: invalid class name and case insensitive filesystem */
public class C9574i1iIiI extends AbstractC5738Lil {
    public LlLI1 o00OoOOo;
    public LlLI1 o00OoOo;
    public LlLI1 o00OoOo0;

    public C9574i1iIiI(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.o00OoOo0 = (LlLI1) i11li1.OooO00o(1);
        if (i11li1.size() > 2) {
            this.o00OoOo = (LlLI1) i11li1.OooO00o(2);
        }
    }

    public C9574i1iIiI(LlLI1 llLI1, LlLI1 llLI12) {
        this.o00OoOOo = llLI1;
        this.o00OoOo0 = llLI12;
        this.o00OoOo = null;
    }

    public C9574i1iIiI(LlLI1 llLI1, LlLI1 llLI12, LlLI1 llLI13) {
        this.o00OoOOo = llLI1;
        this.o00OoOo0 = llLI12;
        this.o00OoOo = llLI13;
    }

    public static C9574i1iIiI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9574i1iIiI OooO00o(Object obj) {
        if (obj instanceof C9574i1iIiI) {
            return (C9574i1iIiI) obj;
        }
        if (obj != null) {
            return new C9574i1iIiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOo0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public LlLI1 OooO0O0() {
        return this.o00OoOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21616OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.o00OoOo0);
        LlLI1 llLI1 = this.o00OoOo;
        if (llLI1 != null) {
            r0.OooO00o(llLI1);
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public LlLI1 OooO0OO() {
        return this.o00OoOOo;
    }
}
