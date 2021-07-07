package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilIil  reason: case insensitive filesystem */
public class C6303ilIil extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final llILLI1 f17990OooO00o;
    public final int o00oO0O;
    public final int o0ooOO0;

    public C6303ilIil(int i, int i2, llILLI1 r3, C6456l1ilL r4) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.f17990OooO00o = new llILLI1(r3.m17859OooO00o());
        this.OooO00o = r4;
    }

    public C6303ilIil(I11li1 i11li1) {
        this.o00oO0O = ((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().intValue();
        this.o0ooOO0 = ((C6513lIiI) i11li1.OooO00o(1)).m17647OooO0O0().intValue();
        this.f17990OooO00o = new llILLI1(((AbstractC6804llL1ii) i11li1.OooO00o(2)).m17938OooO00o());
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(3));
    }

    public static C6303ilIil OooO00o(Object obj) {
        if (obj instanceof C6303ilIil) {
            return (C6303ilIil) obj;
        }
        if (obj != null) {
            return new C6303ilIil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public llILLI1 m17337OooO00o() {
        return this.f17990OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17338OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        r0.OooO00o(new C6487lIIiIlL(this.f17990OooO00o.m17859OooO00o()));
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o0ooOO0;
    }
}
