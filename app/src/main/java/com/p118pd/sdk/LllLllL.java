package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨LllLllL  reason: invalid class name */
public class LllLllL extends AbstractC5738Lil {
    public final llILLI1 OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;

    public LllLllL(int i, int i2, llILLI1 r3) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.OooO00o = new llILLI1(r3);
    }

    public LllLllL(I11li1 i11li1) {
        this.o00oO0O = ((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().intValue();
        this.o0ooOO0 = ((C6513lIiI) i11li1.OooO00o(1)).m17647OooO0O0().intValue();
        this.OooO00o = new llILLI1(((AbstractC6804llL1ii) i11li1.OooO00o(2)).m17938OooO00o());
    }

    public static LllLllL OooO00o(Object obj) {
        if (obj instanceof LllLllL) {
            return (LllLllL) obj;
        }
        if (obj != null) {
            return new LllLllL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public llILLI1 OooO00o() {
        return new llILLI1(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21590OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO00o.m17859OooO00o()));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o0ooOO0;
    }
}
