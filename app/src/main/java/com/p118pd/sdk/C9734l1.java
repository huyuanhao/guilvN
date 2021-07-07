package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨l丨丨1  reason: invalid class name and case insensitive filesystem */
public class C9734l1 extends AbstractC5738Lil implements AbstractC5855LLl, AbstractC5711LiLli {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIlil1 f23364OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f23365OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23366OooO00o;

    public C9734l1(I11li1 i11li1) {
        this.OooO00o = i11li1;
        if (i11li1.size() == 3) {
            this.f23364OooO00o = LIlil1.OooO00o(i11li1.OooO00o(0));
            this.f23366OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f23365OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static C9734l1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C9734l1 OooO00o(Object obj) {
        if (obj instanceof C9734l1) {
            return (C9734l1) obj;
        }
        if (obj != null) {
            return new C9734l1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5432IlIlIlL OooO00o() {
        return this.f23364OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LIlil1 m21791OooO00o() {
        return this.f23364OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m21792OooO00o() {
        return this.f23365OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m21793OooO00o() {
        return this.f23364OooO00o.m16152OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21794OooO00o() {
        return this.f23366OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m21795OooO00o() {
        return this.f23364OooO00o.m16154OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m21796OooO00o() {
        return this.f23364OooO00o.m16155OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f23364OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5432IlIlIlL m21797OooO0O0() {
        return this.f23364OooO00o.m16157OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21798OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public l1LILI1 m21799OooO0O0() {
        return this.f23364OooO00o.m16160OooO0O0();
    }
}
