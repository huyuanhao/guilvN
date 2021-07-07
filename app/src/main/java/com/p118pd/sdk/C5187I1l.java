package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1l丨  reason: invalid class name and case insensitive filesystem */
public class C5187I1l extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15407OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15408OooO00o;
    public iIilII1 OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C6456l1ilL f15409OooO0O0;
    public C6456l1ilL OooO0OO;

    public C5187I1l(I11li1 i11li1) {
        int i = 0;
        while (i11li1.OooO00o(i) instanceof AbstractC5903LlLLL) {
            AbstractC5903LlLLL r2 = (AbstractC5903LlLLL) i11li1.OooO00o(i);
            int OooO00o2 = r2.OooO00o();
            if (OooO00o2 == 0) {
                this.f15407OooO00o = C6456l1ilL.OooO00o(r2, false);
            } else if (OooO00o2 == 1) {
                this.f15409OooO0O0 = C6456l1ilL.OooO00o(r2, false);
            } else if (OooO00o2 == 2) {
                this.OooO00o = iIilII1.OooO00o(r2, false);
            } else if (OooO00o2 == 3) {
                this.OooO0OO = C6456l1ilL.OooO00o(r2, false);
            } else if (OooO00o2 == 4) {
                this.f15408OooO00o = AbstractC6804llL1ii.OooO00o(r2, false);
            } else {
                throw new IllegalArgumentException("Unknown tag encountered: " + r2.OooO00o());
            }
            i++;
        }
        this.OooO0O0 = iIilII1.OooO00o(i11li1.OooO00o(i));
    }

    public C5187I1l(C6456l1ilL r1, C6456l1ilL r2, iIilII1 iiilii1, C6456l1ilL r4, AbstractC6804llL1ii r5, iIilII1 iiilii12) {
        if (iiilii12 != null) {
            this.f15407OooO00o = r1;
            this.f15409OooO0O0 = r2;
            this.OooO00o = iiilii1;
            this.OooO0OO = r4;
            this.f15408OooO00o = r5;
            this.OooO0O0 = iiilii12;
            return;
        }
        throw new IllegalArgumentException("'encValue' cannot be null");
    }

    public static C5187I1l OooO00o(Object obj) {
        if (obj instanceof C5187I1l) {
            return (C5187I1l) obj;
        }
        if (obj != null) {
            return new C5187I1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    private void OooO00o(iILLL1 r3, int i, AbstractC6854lLi1LL r5) {
        if (r5 != null) {
            r3.OooO00o(new ILI1Ll(false, i, r5));
        }
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15315OooO00o() {
        return this.f15407OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15316OooO00o() {
        return this.f15408OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public iIilII1 OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15317OooO0O0() {
        iILLL1 r0 = new iILLL1();
        OooO00o(r0, 0, this.f15407OooO00o);
        OooO00o(r0, 1, this.f15409OooO0O0);
        OooO00o(r0, 2, this.OooO00o);
        OooO00o(r0, 3, this.OooO0OO);
        OooO00o(r0, 4, this.f15408OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m15318OooO0O0() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public C6456l1ilL OooO0OO() {
        return this.f15409OooO0O0;
    }
}
