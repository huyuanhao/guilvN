package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨iIiiL  reason: invalid class name and case insensitive filesystem */
public class C6393iiIiiL extends AbstractC5738Lil {
    public C1674II OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5507IILLI f18197OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1iI1 f18198OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18199OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18200OooO00o;

    public C6393iiIiiL(I11li1 i11li1) {
        this.f18199OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        int i = 1;
        if (i11li1.OooO00o(1) instanceof L1iI1) {
            this.f18198OooO00o = L1iI1.OooO00o(i11li1.OooO00o(1));
            i = 2;
        }
        if ((i11li1.OooO00o(i) instanceof C1674II) || (i11li1.OooO00o(i) instanceof I11li1)) {
            this.OooO00o = C1674II.OooO00o(i11li1.OooO00o(i));
            i++;
        }
        if (i11li1.OooO00o(i) instanceof AbstractC6804llL1ii) {
            this.f18200OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(i));
            i++;
        }
        this.f18197OooO00o = C5507IILLI.OooO00o(i11li1.OooO00o(i));
    }

    public C6393iiIiiL(L1iI1 l1iI1, C1674II ii, AbstractC6804llL1ii r6, C5507IILLI r7) {
        this.f18199OooO00o = new C6513lIiI(1);
        this.f18198OooO00o = l1iI1;
        this.OooO00o = ii;
        this.f18200OooO00o = r6;
        this.f18197OooO00o = r7;
    }

    public static C6393iiIiiL OooO00o(Object obj) {
        return (obj == null || (obj instanceof C6393iiIiiL)) ? (C6393iiIiiL) obj : new C6393iiIiiL(I11li1.OooO00o(obj));
    }

    public C1674II OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5507IILLI m17512OooO00o() {
        return this.f18197OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1iI1 m17513OooO00o() {
        return this.f18198OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17514OooO00o() {
        return this.f18200OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18199OooO00o);
        L1iI1 l1iI1 = this.f18198OooO00o;
        if (l1iI1 != null) {
            r0.OooO00o(l1iI1);
        }
        C1674II ii = this.OooO00o;
        if (ii != null) {
            r0.OooO00o(ii);
        }
        AbstractC6804llL1ii r1 = this.f18200OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        r0.OooO00o(this.f18197OooO00o);
        return new C6351ill(r0);
    }
}
