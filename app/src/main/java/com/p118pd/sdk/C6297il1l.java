package com.p118pd.sdk;

/* renamed from: com.pd.sdk.il1l  reason: case insensitive filesystem */
public class C6297il1l extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17979OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;
    public int o00oO0O;
    public int o0ooOO0;

    public C6297il1l(int i, int i2, Ll111 ll111, C5585L1L r4, C6051i1lli i1lli, C6456l1ilL r6) {
        this.o00oO0O = i;
        this.o0ooOO0 = i2;
        this.f17979OooO00o = ll111.m16358OooO00o();
        this.OooO0O0 = r4.m15968OooO00o();
        this.OooO0OO = i1lli.m16914OooO00o();
        this.OooO00o = r6;
    }

    public C6297il1l(I11li1 i11li1) {
        this.o00oO0O = ((C6513lIiI) i11li1.OooO00o(0)).m17647OooO0O0().intValue();
        this.o0ooOO0 = ((C6513lIiI) i11li1.OooO00o(1)).m17647OooO0O0().intValue();
        this.f17979OooO00o = ((AbstractC6804llL1ii) i11li1.OooO00o(2)).m17938OooO00o();
        this.OooO0O0 = ((AbstractC6804llL1ii) i11li1.OooO00o(3)).m17938OooO00o();
        this.OooO0OO = ((AbstractC6804llL1ii) i11li1.OooO00o(4)).m17938OooO00o();
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(5));
    }

    public static C6297il1l OooO00o(Object obj) {
        if (obj instanceof C6297il1l) {
            return (C6297il1l) obj;
        }
        if (obj != null) {
            return new C6297il1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5585L1L OooO00o() {
        return new C5585L1L(m17324OooO00o(), this.OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Ll111 m17324OooO00o() {
        return new Ll111(this.f17979OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6051i1lli m17325OooO00o() {
        return new C6051i1lli(this.OooO0OO);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17326OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o0ooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17327OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(new C6513lIiI((long) this.o00oO0O));
        r0.OooO00o(new C6513lIiI((long) this.o0ooOO0));
        r0.OooO00o(new C6487lIIiIlL(this.f17979OooO00o));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0O0));
        r0.OooO00o(new C6487lIIiIlL(this.OooO0OO));
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }
}
