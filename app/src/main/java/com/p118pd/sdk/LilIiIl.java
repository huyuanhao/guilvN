package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LilIiIl */
public class LilIiIl extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5314ILlLL f16643OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f16644OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16645OooO00o;

    public LilIiIl(I11li1 i11li1) {
        this.OooO00o = i11li1;
        if (i11li1.size() == 3) {
            this.f16643OooO00o = C5314ILlLL.OooO00o(i11li1.OooO00o(0));
            this.f16645OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            this.f16644OooO00o = iIilII1.OooO00o(i11li1.OooO00o(2));
            return;
        }
        throw new IllegalArgumentException("sequence wrong size for a certificate");
    }

    public static LilIiIl OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static LilIiIl OooO00o(Object obj) {
        if (obj instanceof LilIiIl) {
            return (LilIiIl) obj;
        }
        if (obj != null) {
            return new LilIiIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5314ILlLL OooO00o() {
        return this.f16643OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5432IlIlIlL m16316OooO00o() {
        return this.f16643OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m16317OooO00o() {
        return this.f16644OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LILI1 m16318OooO00o() {
        return this.f16643OooO00o.m15515OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m16319OooO00o() {
        return this.f16645OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16320OooO00o() {
        return this.f16643OooO00o.m15517OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6888ll m16321OooO00o() {
        return this.f16643OooO00o.m15518OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f16643OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C5432IlIlIlL m16322OooO0O0() {
        return this.f16643OooO00o.m15519OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16323OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public l1LILI1 m16324OooO0O0() {
        return this.f16643OooO00o.m15522OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6513lIiI m16325OooO0O0() {
        return this.f16643OooO00o.m15523OooO0O0();
    }
}
