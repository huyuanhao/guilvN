package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1IL */
public class I1IL extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1 f15308OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f15309OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15310OooO00o;

    public I1IL(I11li1 i11li1) {
        this.f15308OooO00o = L1.OooO00o(i11li1.OooO00o(0));
        this.f15310OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.f15309OooO00o = (iIilII1) i11li1.OooO00o(2);
        if (i11li1.size() > 3) {
            this.OooO00o = I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(3), true);
        }
    }

    public I1IL(L1 r1, C6456l1ilL r2, iIilII1 iiilii1, I11li1 i11li1) {
        this.f15308OooO00o = r1;
        this.f15310OooO00o = r2;
        this.f15309OooO00o = iiilii1;
        this.OooO00o = i11li1;
    }

    public static I1IL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static I1IL OooO00o(Object obj) {
        if (obj instanceof I1IL) {
            return (I1IL) obj;
        }
        if (obj != null) {
            return new I1IL(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1 m15261OooO00o() {
        return this.f15308OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m15262OooO00o() {
        return this.f15309OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15263OooO00o() {
        return this.f15310OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f15308OooO00o);
        r0.OooO00o(this.f15310OooO00o);
        r0.OooO00o(this.f15309OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
