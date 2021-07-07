package com.p118pd.sdk;

/* renamed from: com.pd.sdk.II */
public class C1674II extends AbstractC5738Lil {
    public C5514IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1iI1 f15430OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LII f15431OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1iII f15432OooO00o;

    public C1674II(I11li1 i11li1) {
        this.OooO00o = C5514IL.OooO00o(i11li1.OooO00o(0));
        int i = 1;
        if (1 < i11li1.size() && (i11li1.OooO00o(1) instanceof LII)) {
            this.f15431OooO00o = LII.OooO00o(i11li1.OooO00o(1));
            i = 2;
        }
        if (i < i11li1.size() && (i11li1.OooO00o(i) instanceof L1iI1)) {
            this.f15430OooO00o = L1iI1.OooO00o(i11li1.OooO00o(i));
            i++;
        }
        if (i < i11li1.size()) {
            this.f15432OooO00o = l1iII.OooO00o(i11li1.OooO00o(i));
        }
    }

    public C1674II(C5514IL r1, LII lii, L1iI1 l1iI1, l1iII r4) {
        this.OooO00o = r1;
        this.f15431OooO00o = lii;
        this.f15430OooO00o = l1iI1;
        this.f15432OooO00o = r4;
    }

    public static C1674II OooO00o(Object obj) {
        if (obj instanceof C1674II) {
            return (C1674II) obj;
        }
        if (obj != null) {
            return new C1674II(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1iI1 OooO00o() {
        return this.f15430OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LII m15344OooO00o() {
        return this.f15431OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1iII m15345OooO00o() {
        return this.f15432OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15346OooO00o() {
        return this.OooO00o.m15792OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        LII lii = this.f15431OooO00o;
        if (lii != null) {
            r0.OooO00o(lii);
        }
        L1iI1 l1iI1 = this.f15430OooO00o;
        if (l1iI1 != null) {
            r0.OooO00o(l1iI1);
        }
        l1iII r1 = this.f15432OooO00o;
        if (r1 != null) {
            r0.OooO00o(r1);
        }
        return new C5707LiL1(r0);
    }
}
