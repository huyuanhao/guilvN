package com.p118pd.sdk;

/* renamed from: com.pd.sdk.IiLIl1I */
public class IiLIl1I extends AbstractC5738Lil {
    public C6456l1ilL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f15706OooO00o;

    public IiLIl1I(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.f15706OooO00o = AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public IiLIl1I(C6456l1ilL r1, AbstractC6804llL1ii r2) {
        this.OooO00o = r1;
        this.f15706OooO00o = r2;
    }

    public static IiLIl1I OooO00o(Object obj) {
        if (obj instanceof IiLIl1I) {
            return (IiLIl1I) obj;
        }
        if (obj != null) {
            return new IiLIl1I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m15593OooO00o() {
        return this.f15706OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f15706OooO00o);
        return new C5707LiL1(r0);
    }
}
