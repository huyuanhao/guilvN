package com.p118pd.sdk;

/* renamed from: com.pd.sdk.llIl  reason: case insensitive filesystem */
public class C6761llIl extends AbstractC5738Lil {
    public C5753LiI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18745OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18746OooO00o;

    public C6761llIl(I11li1 i11li1) {
        this.f18746OooO00o = (C6513lIiI) i11li1.OooO00o(0);
        this.f18745OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.OooO00o = C5753LiI1.OooO00o(i11li1.OooO00o(2));
    }

    public C6761llIl(C6456l1ilL r4, C5753LiI1 r5) {
        this.f18746OooO00o = new C6513lIiI(0);
        this.f18745OooO00o = r4;
        this.OooO00o = r5;
    }

    public static C6761llIl OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6761llIl OooO00o(Object obj) {
        if (obj instanceof C6761llIl) {
            return (C6761llIl) obj;
        }
        if (obj != null) {
            return new C6761llIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5753LiI1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17866OooO00o() {
        return this.f18745OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17867OooO00o() {
        return this.f18746OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18746OooO00o);
        r0.OooO00o(this.f18745OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C6351ill(r0);
    }
}
