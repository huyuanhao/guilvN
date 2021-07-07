package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLl  reason: case insensitive filesystem */
public class C6187iLl extends AbstractC5738Lil {
    public final C6311ilILI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6702lili f17764OooO00o;

    public C6187iLl(I11li1 i11li1) {
        this.f17764OooO00o = C6702lili.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = C6311ilILI.OooO00o(AbstractC5903LlLLL.OooO00o(i11li1.OooO00o(1)), false);
    }

    public C6187iLl(C6702lili lili, C6311ilILI r2) {
        this.f17764OooO00o = lili;
        this.OooO00o = r2;
    }

    public static C6187iLl OooO00o(Object obj) {
        if (obj instanceof C6187iLl) {
            return (C6187iLl) obj;
        }
        if (obj != null) {
            return new C6187iLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6311ilILI OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6702lili m17148OooO00o() {
        return this.f17764OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f17764OooO00o);
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO00o));
        }
        return new C5707LiL1(r0);
    }
}
