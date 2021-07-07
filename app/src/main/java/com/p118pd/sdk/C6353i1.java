package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨1  reason: invalid class name and case insensitive filesystem */
public class C6353i1 extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18116OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f18117OooO00o;
    public AbstractC6804llL1ii OooO0O0;

    public C6353i1(I11li1 i11li1) {
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.f18117OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(1);
        this.OooO0O0 = (AbstractC6804llL1ii) i11li1.OooO00o(2);
        this.f18116OooO00o = (C6513lIiI) i11li1.OooO00o(3);
    }

    public C6353i1(C6456l1ilL r1, AbstractC6804llL1ii r2, AbstractC6804llL1ii r3, C6513lIiI r4) {
        this.OooO00o = r1;
        this.f18117OooO00o = r2;
        this.OooO0O0 = r3;
        this.f18116OooO00o = r4;
    }

    public static C6353i1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6353i1 OooO00o(Object obj) {
        if (obj instanceof C6353i1) {
            return (C6353i1) obj;
        }
        if (obj != null) {
            return new C6353i1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17418OooO00o() {
        return this.f18116OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17419OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18117OooO00o);
        r0.OooO00o(this.OooO0O0);
        r0.OooO00o(this.f18116OooO00o);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6804llL1ii m17420OooO0O0() {
        return this.f18117OooO00o;
    }
}
