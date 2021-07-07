package com.p118pd.sdk;

/* renamed from: com.pd.sdk.liliiL1 */
public class liliiL1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public liliiL1(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public liliiL1(C6424iL r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public liliiL1(C6424iL[] r4) {
        iILLL1 r0 = new iILLL1();
        for (C6424iL r2 : r4) {
            r0.OooO00o(r2);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static liliiL1 OooO00o(Object obj) {
        if (obj instanceof liliiL1) {
            return (liliiL1) obj;
        }
        if (obj != null) {
            return new liliiL1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6424iL[] OooO00o() {
        int size = this.OooO00o.size();
        C6424iL[] r1 = new C6424iL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6424iL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
