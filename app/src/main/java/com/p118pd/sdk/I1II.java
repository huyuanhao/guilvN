package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1II */
public class I1II extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public I1II(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public I1II(C6777llL1 r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public I1II(C6777llL1[] r4) {
        iILLL1 r0 = new iILLL1();
        for (C6777llL1 r2 : r4) {
            r0.OooO00o(r2);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static I1II OooO00o(Object obj) {
        if (obj instanceof I1II) {
            return (I1II) obj;
        }
        if (obj != null) {
            return new I1II(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6777llL1[] OooO00o() {
        int size = this.OooO00o.size();
        C6777llL1[] r1 = new C6777llL1[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C6777llL1.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
