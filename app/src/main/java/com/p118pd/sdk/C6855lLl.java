package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨Ll丨  reason: invalid class name and case insensitive filesystem */
public class C6855lLl extends AbstractC5738Lil {
    public byte[] OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;
    public byte[] OooO0o0;
    public int o00oO0O;
    public int o0ooOO0;

    public C6855lLl(int i, int i2, Ll111 ll111, C5585L1L r4, C6051i1lli i1lli, C6051i1lli i1lli2, llILLI1 r7) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.OooO00o = ll111.m16358OooO00o();
        this.OooO0O0 = r4.m15968OooO00o();
        this.OooO0OO = r7.m17859OooO00o();
        this.OooO0Oo = i1lli.m16914OooO00o();
        this.OooO0o0 = i1lli2.m16914OooO00o();
    }

    public C6855lLl(I11li1 i11li1) {
        this.o00oO0O = ((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().intValue();
        this.o0ooOO0 = ((C6513lIiI) i11li1.OooO00o(1)).m17647OooO0O0().intValue();
        this.OooO00o = ((AbstractC6804llL1ii) i11li1.OooO00o(2)).m17938OooO00o();
        this.OooO0O0 = ((AbstractC6804llL1ii) i11li1.OooO00o(3)).m17938OooO00o();
        this.OooO0Oo = ((AbstractC6804llL1ii) i11li1.OooO00o(4)).m17938OooO00o();
        this.OooO0o0 = ((AbstractC6804llL1ii) i11li1.OooO00o(5)).m17938OooO00o();
        this.OooO0OO = ((AbstractC6804llL1ii) i11li1.OooO00o(6)).m17938OooO00o();
    }

    public static C6855lLl OooO00o(Object obj) {
        if (obj instanceof C6855lLl) {
            return (C6855lLl) obj;
        }
        if (obj != null) {
            return new C6855lLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5585L1L OooO00o() {
        return new C5585L1L(m18000OooO00o(), this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ll111 m18000OooO00o() {
        return new Ll111(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6051i1lli m18001OooO00o() {
        return new C6051i1lli(this.OooO0Oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public llILLI1 m18002OooO00o() {
        return new llILLI1(this.OooO0OO);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6051i1lli m18003OooO0O0() {
        return new C6051i1lli(this.OooO0o0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m18004OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO00o));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0O0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0Oo));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0o0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0OO));
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }
}
