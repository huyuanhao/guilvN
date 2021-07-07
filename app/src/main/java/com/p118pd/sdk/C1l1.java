package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨1l1丨  reason: invalid class name */
public class C1l1 extends AbstractC5738Lil {
    public C5630LIii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23381OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23382OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23383OooO00o;

    public C1l1(I11li1 i11li1) {
        this.f23382OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.OooO00o = C5630LIii.OooO00o(i11li1.OooO00o(1));
        this.f23381OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(2));
        this.f23383OooO00o = (AbstractC6804llL1ii) i11li1.OooO00o(3);
    }

    public C1l1(C5630LIii lIii, C6456l1ilL r5, AbstractC6804llL1ii r6) {
        this.f23382OooO00o = lIii.OooO0O0() instanceof AbstractC5903LlLLL ? new C6513lIiI(2) : new C6513lIiI(0);
        this.OooO00o = lIii;
        this.f23381OooO00o = r5;
        this.f23383OooO00o = r6;
    }

    public static C1l1 OooO00o(Object obj) {
        if (obj instanceof C1l1) {
            return (C1l1) obj;
        }
        if (obj != null) {
            return new C1l1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5630LIii OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21879OooO00o() {
        return this.f23381OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21880OooO00o() {
        return this.f23382OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21881OooO00o() {
        return this.f23383OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23382OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23381OooO00o);
        r0.OooO00o(this.f23383OooO00o);
        return new C5707LiL1(r0);
    }
}
