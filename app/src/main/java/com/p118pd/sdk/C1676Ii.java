package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ii */
public class C1676Ii extends AbstractC5738Lil {
    public C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15661OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15662OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15663OooO00o;

    public C1676Ii(I11li1 i11li1) {
        this.f15662OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.f15661OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.OooO00o = C5753LiI1.OooO00o(i11li1.OooO00o(2));
        this.f15663OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(3));
    }

    public C1676Ii(C6456l1ilL r4, C5753LiI1 r5, byte[] bArr) {
        this.f15662OooO00o = new C6513lIiI(0);
        this.f15661OooO00o = r4;
        this.OooO00o = r5;
        this.f15663OooO00o = new C6487lIIiIlL(bArr);
    }

    public static C1676Ii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C1676Ii OooO00o(Object obj) {
        if (obj instanceof C1676Ii) {
            return (C1676Ii) obj;
        }
        if (obj != null) {
            return new C1676Ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15543OooO00o() {
        return this.f15661OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15544OooO00o() {
        return this.f15662OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15545OooO00o() {
        return this.f15663OooO00o.m17938OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15662OooO00o);
        r0.OooO00o(this.f15661OooO00o);
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15663OooO00o);
        return new C6351ill(r0);
    }
}
