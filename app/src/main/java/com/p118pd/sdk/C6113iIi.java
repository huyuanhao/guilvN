package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iIi丨  reason: invalid class name and case insensitive filesystem */
public class C6113iIi extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6113iIi(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public static C6113iIi OooO00o(Object obj) {
        if (obj instanceof C6113iIi) {
            return (C6113iIi) obj;
        }
        if (obj != null) {
            return new C6113iIi(I11li1.OooO00o(obj));
        }
        return null;
    }

    public I1LilL[] OooO00o() {
        int size = this.OooO00o.size();
        I1LilL[] i1LilLArr = new I1LilL[size];
        for (int i = 0; i != size; i++) {
            i1LilLArr[i] = I1LilL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return i1LilLArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
