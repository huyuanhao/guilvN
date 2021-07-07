package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨Il1丨  reason: invalid class name and case insensitive filesystem */
public class C9764Il1 extends AbstractC5738Lil {
    public L1IIlli OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iIilII1 f23400OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23401OooO00o = null;

    public C9764Il1() {
    }

    public C9764Il1(I11li1 i11li1) {
        this.OooO00o = L1IIlli.OooO00o(i11li1.OooO00o(0));
        this.f23401OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
        this.f23400OooO00o = (iIilII1) i11li1.OooO00o(2);
    }

    public C9764Il1(L1IIlli l1IIlli, C6456l1ilL r3, iIilII1 iiilii1) {
        this.OooO00o = l1IIlli;
        this.f23401OooO00o = r3;
        this.f23400OooO00o = iiilii1;
    }

    public static C9764Il1 OooO00o(Object obj) {
        if (obj instanceof C9764Il1) {
            return (C9764Il1) obj;
        }
        if (obj != null) {
            return new C9764Il1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public L1IIlli OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iIilII1 m21898OooO00o() {
        return this.f23400OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m21899OooO00o() {
        return this.f23401OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f23401OooO00o);
        r0.OooO00o(this.f23400OooO00o);
        return new C5707LiL1(r0);
    }
}
