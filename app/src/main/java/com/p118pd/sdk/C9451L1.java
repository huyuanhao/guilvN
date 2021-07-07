package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L1  reason: invalid class name and case insensitive filesystem */
public class C9451L1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23007OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f23008OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f23009OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9675lI f23010OooO00o;

    public C9451L1(I11li1 i11li1) {
        this.f23008OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.f23010OooO00o = C9675lI.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true);
        int i = 2;
        if (i11li1.OooO00o(2) instanceof AbstractC5903LlLLL) {
            this.f23009OooO00o = AbstractC6804llL1ii.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(2), true);
            i = 3;
        }
        this.f23007OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(i));
        this.OooO00o = (I11li1) i11li1.OooO00o(i + 1);
    }

    public C9451L1(C9675lI r4, AbstractC6804llL1ii r5, C6456l1ilL r6, I11li1 i11li1) {
        this.f23008OooO00o = new C6513lIiI(3);
        this.f23010OooO00o = r4;
        this.f23009OooO00o = r5;
        this.f23007OooO00o = r6;
        this.OooO00o = i11li1;
    }

    public static C9451L1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9451L1 OooO00o(Object obj) {
        if (obj instanceof C9451L1) {
            return (C9451L1) obj;
        }
        if (obj != null) {
            return new C9451L1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21502OooO00o() {
        return this.f23007OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21503OooO00o() {
        return this.f23008OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m21504OooO00o() {
        return this.f23009OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9675lI m21505OooO00o() {
        return this.f23010OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f23008OooO00o);
        r0.OooO00o(new ILI1Ll(true, 0, this.f23010OooO00o));
        if (this.f23009OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.f23009OooO00o));
        }
        r0.OooO00o(this.f23007OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
