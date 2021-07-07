package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ilii  reason: case insensitive filesystem */
public class C5461Ilii extends AbstractC5738Lil {
    public I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1684L f15874OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f15875OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15876OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C1ILLL1 f15877OooO00o;
    public I11L OooO0O0;
    public I11L OooO0OO;

    public C5461Ilii(I11li1 i11li1) {
        I11L i11l;
        C6513lIiI r1 = (C6513lIiI) i11li1.OooO00o(0).OooO0O0();
        this.f15875OooO00o = r1;
        if (r1.m17647OooO0O0().intValue() == 0) {
            int i = 2;
            AbstractC6122iIlLiL OooO0O02 = i11li1.OooO00o(1).OooO0O0();
            if (OooO0O02 instanceof AbstractC5903LlLLL) {
                this.f15877OooO00o = C1ILLL1.OooO00o((AbstractC5903LlLLL) OooO0O02, false);
                OooO0O02 = i11li1.OooO00o(2).OooO0O0();
                i = 3;
            }
            I11L OooO00o2 = I11L.OooO00o((Object) OooO0O02);
            this.OooO00o = OooO00o2;
            if (OooO00o2.size() != 0) {
                int i2 = i + 1;
                this.f15874OooO00o = C1684L.OooO00o(i11li1.OooO00o(i).OooO0O0());
                int i3 = i2 + 1;
                AbstractC6122iIlLiL OooO0O03 = i11li1.OooO00o(i2).OooO0O0();
                if (OooO0O03 instanceof AbstractC5903LlLLL) {
                    this.OooO0O0 = I11L.OooO00o((AbstractC5903LlLLL) OooO0O03, false);
                    OooO0O03 = i11li1.OooO00o(i3).OooO0O0();
                    i3++;
                } else if (!this.f15874OooO00o.OooO00o().equals(AbstractC6252iiLl.OooO00o) && ((i11l = this.OooO0O0) == null || i11l.size() == 0)) {
                    throw new IllegalArgumentException("authAttrs must be present with non-data content");
                }
                this.f15876OooO00o = AbstractC6804llL1ii.OooO00o((Object) OooO0O03);
                if (i11li1.size() > i3) {
                    this.OooO0OO = I11L.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(i3).OooO0O0(), false);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
        }
        throw new IllegalArgumentException("AuthEnvelopedData version number must be 0");
    }

    public C5461Ilii(C1ILLL1 r4, I11L i11l, C1684L r6, I11L i11l2, AbstractC6804llL1ii r8, I11L i11l3) {
        this.f15875OooO00o = new C6513lIiI(0);
        this.f15877OooO00o = r4;
        this.OooO00o = i11l;
        if (i11l.size() != 0) {
            this.f15874OooO00o = r6;
            this.OooO0O0 = i11l2;
            if (r6.OooO00o().equals(AbstractC6252iiLl.OooO00o) || !(i11l2 == null || i11l2.size() == 0)) {
                this.f15876OooO00o = r8;
                this.OooO0OO = i11l3;
                return;
            }
            throw new IllegalArgumentException("authAttrs must be present with non-data content");
        }
        throw new IllegalArgumentException("AuthEnvelopedData requires at least 1 RecipientInfo");
    }

    public static C5461Ilii OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5461Ilii OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5461Ilii)) {
            return (C5461Ilii) obj;
        }
        if (obj instanceof I11li1) {
            return new C5461Ilii((I11li1) obj);
        }
        throw new IllegalArgumentException("Invalid AuthEnvelopedData: " + obj.getClass().getName());
    }

    public I11L OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1684L m15691OooO00o() {
        return this.f15874OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m15692OooO00o() {
        return this.f15875OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15693OooO00o() {
        return this.f15876OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m15694OooO00o() {
        return this.f15877OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public I11L OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15695OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15875OooO00o);
        if (this.f15877OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.f15877OooO00o));
        }
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15874OooO00o);
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, this.OooO0O0));
        }
        r0.OooO00o(this.f15876OooO00o);
        if (this.OooO0OO != null) {
            r0.OooO00o(new ILI1Ll(false, 2, this.OooO0OO));
        }
        return new C6351ill(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public I11L OooO0OO() {
        return this.OooO0OO;
    }
}
