package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LI1丨l  reason: invalid class name and case insensitive filesystem */
public class C5612LI1l extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f16272OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16273OooO00o;
    public C6456l1ilL OooO0O0;

    public C5612LI1l(I11li1 i11li1) {
        this.f16273OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.f16272OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(2));
        this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(3));
    }

    public C5612LI1l(AbstractC6804llL1ii r1, C6456l1ilL r2, C6513lIiI r3, C6456l1ilL r4) {
        this.f16273OooO00o = r1;
        this.OooO00o = r2;
        this.f16272OooO00o = r3;
        this.OooO0O0 = r4;
    }

    public C5612LI1l(byte[] bArr, C6456l1ilL r5, int i, C6456l1ilL r7) {
        this(new C6487lIIiIlL(bArr), r5, new C6513lIiI((long) i), r7);
    }

    public static C5612LI1l OooO00o(Object obj) {
        if (obj instanceof C5612LI1l) {
            return (C5612LI1l) obj;
        }
        if (obj != null) {
            return new C5612LI1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16020OooO00o() {
        return this.f16272OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m16021OooO00o() {
        return this.f16273OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16273OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f16272OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m16022OooO0O0() {
        return this.OooO00o;
    }
}
