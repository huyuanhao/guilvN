package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiilI  reason: case insensitive filesystem */
public class C6265iiilI extends AbstractC5738Lil {
    public II1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17913OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17914OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f17915OooO00o;

    public C6265iiilI(I11li1 i11li1) {
        this.f17914OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.OooO00o = II1.OooO00o(i11li1.OooO00o(1));
        this.f17913OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(2));
        this.f17915OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(3);
    }

    public C6265iiilI(II1 ii1, C6456l1ilL r5, AbstractC6804llL1ii r6) {
        this.f17914OooO00o = new C6513lIiI(4);
        this.OooO00o = ii1;
        this.f17913OooO00o = r5;
        this.f17915OooO00o = r6;
    }

    public static C6265iiilI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6265iiilI OooO00o(Object obj) {
        if (obj instanceof C6265iiilI) {
            return (C6265iiilI) obj;
        }
        if (obj != null) {
            return new C6265iiilI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public II1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17288OooO00o() {
        return this.f17913OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17289OooO00o() {
        return this.f17914OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17290OooO00o() {
        return this.f17915OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17914OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f17913OooO00o);
        r0.OooO00o(this.f17915OooO00o);
        return new C5707LiL1(r0);
    }
}
