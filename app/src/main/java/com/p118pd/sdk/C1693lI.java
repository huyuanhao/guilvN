package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lI */
public class C1693lI extends AbstractC5738Lil {
    public final C6456l1ilL OooO00o;
    public final C6456l1ilL OooO0O0;

    public C1693lI(I11li1 i11li1) {
        if (i11li1.size() == 2) {
            this.OooO00o = C6456l1ilL.OooO00o(i11li1.OooO00o(0));
            this.OooO0O0 = C6456l1ilL.OooO00o(i11li1.OooO00o(1));
            return;
        }
        throw new IllegalArgumentException("ASN.1 SEQUENCE should be of length 2");
    }

    public C1693lI(C6456l1ilL r1, C6456l1ilL r2) {
        this.OooO00o = r1;
        this.OooO0O0 = r2;
    }

    public static C1693lI OooO00o(Object obj) {
        if (obj instanceof C1693lI) {
            return (C1693lI) obj;
        }
        if (obj != null) {
            return new C1693lI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6456l1ilL OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.OooO0O0);
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17610OooO0O0() {
        return this.OooO00o;
    }
}
