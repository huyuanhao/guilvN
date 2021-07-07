package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨ll丨  reason: invalid class name and case insensitive filesystem */
public class C5562Ill extends AbstractC5738Lil {
    public iIilII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16088OooO00o;

    public C5562Ill(I11li1 i11li1) {
        this.f16088OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = iIilII1.OooO00o(i11li1.OooO00o(1));
    }

    public C5562Ill(C5612LI1l r3, iIilII1 iiilii1) {
        this(new C6456l1ilL(lILIlI.OooO00o, r3), iiilii1);
    }

    public C5562Ill(C6456l1ilL r1, iIilII1 iiilii1) {
        this.f16088OooO00o = r1;
        this.OooO00o = iiilii1;
    }

    public static C5562Ill OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(I11li1.OooO00o(r0, z));
    }

    public static C5562Ill OooO00o(Object obj) {
        if (obj instanceof C5562Ill) {
            return (C5562Ill) obj;
        }
        if (obj != null) {
            return new C5562Ill(I11li1.OooO00o(obj));
        }
        return null;
    }

    public iIilII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15867OooO00o() {
        return this.f16088OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f16088OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
