package com.p118pd.sdk;

/* renamed from: com.pd.sdk.li丨l  reason: invalid class name and case insensitive filesystem */
public class C6714lil extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f18673OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18674OooO00o;

    public C6714lil(I11li1 i11li1) {
        this.f18674OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.f18673OooO00o = (iIilII1) i11li1.OooO00o(1);
        if (i11li1.size() == 3) {
            this.OooO00o = I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(2), true);
        }
    }

    public C6714lil(C6456l1ilL r1, iIilII1 iiilii1) {
        this.f18674OooO00o = r1;
        this.f18673OooO00o = iiilii1;
    }

    public C6714lil(C6456l1ilL r1, iIilII1 iiilii1, I11li1 i11li1) {
        this.f18674OooO00o = r1;
        this.f18673OooO00o = iiilii1;
        this.OooO00o = i11li1;
    }

    public static C6714lil OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C6714lil OooO00o(Object obj) {
        if (obj instanceof C6714lil) {
            return (C6714lil) obj;
        }
        if (obj != null) {
            return new C6714lil(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I11li1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m17816OooO00o() {
        return this.f18673OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17817OooO00o() {
        return this.f18674OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18674OooO00o);
        r0.OooO00o(this.f18673OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
