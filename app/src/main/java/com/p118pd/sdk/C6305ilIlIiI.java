package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilIlIiI  reason: case insensitive filesystem */
public class C6305ilIlIiI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6305ilIlIiI(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C6305ilIlIiI(C5309ILiL iLiL) {
        this.OooO00o = new C5707LiL1(iLiL);
    }

    public C6305ilIlIiI(C5309ILiL[] iLiLArr) {
        iILLL1 r0 = new iILLL1();
        for (C5309ILiL iLiL : iLiLArr) {
            r0.OooO00o(iLiL);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C6305ilIlIiI OooO00o(Object obj) {
        if (obj instanceof C6305ilIlIiI) {
            return (C6305ilIlIiI) obj;
        }
        if (obj != null) {
            return new C6305ilIlIiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5309ILiL[] OooO00o() {
        int size = this.OooO00o.size();
        C5309ILiL[] iLiLArr = new C5309ILiL[size];
        for (int i = 0; i != size; i++) {
            iLiLArr[i] = C5309ILiL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return iLiLArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
