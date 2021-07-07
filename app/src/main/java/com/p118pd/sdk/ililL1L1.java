package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ililL1L1 */
public class ililL1L1 extends AbstractC5738Lil {
    public C5646LII1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C97411 f18057OooO00o;

    public ililL1L1(I11li1 i11li1) {
        this.OooO00o = C5646LII1.OooO00o(i11li1.OooO00o(0));
        this.f18057OooO00o = C97411.OooO00o(i11li1.OooO00o(1));
    }

    public ililL1L1(C5646LII1 r1, C97411 r2) {
        this.OooO00o = r1;
        this.f18057OooO00o = r2;
    }

    public static ililL1L1 OooO00o(Object obj) {
        if (obj instanceof ililL1L1) {
            return (ililL1L1) obj;
        }
        if (obj != null) {
            return new ililL1L1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5646LII1 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C97411 m17387OooO00o() {
        return this.f18057OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o);
        r0.OooO00o(this.f18057OooO00o);
        return new C5707LiL1(r0);
    }
}
