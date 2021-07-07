package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LiL  reason: invalid class name and case insensitive filesystem */
public class C9505LiL extends AbstractC5738Lil {
    public AbstractC6804llL1ii OooO00o;
    public LlLI1 o00OoOOo;

    public C9505LiL(I11li1 i11li1) {
        this.o00OoOOo = (LlLI1) i11li1.OooO00o(0);
        this.OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(1);
    }

    public C9505LiL(LlLI1 llLI1, AbstractC6804llL1ii r2) {
        this.o00OoOOo = llLI1;
        this.OooO00o = r2;
    }

    public static C9505LiL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9505LiL OooO00o(Object obj) {
        if (obj instanceof C9505LiL) {
            return (C9505LiL) obj;
        }
        if (obj != null) {
            return new C9505LiL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21570OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
