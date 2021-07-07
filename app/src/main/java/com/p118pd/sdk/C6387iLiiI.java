package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨L丨iiI  reason: invalid class name and case insensitive filesystem */
public class C6387iLiiI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6387iLiiI(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C6387iLiiI(ii111i r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public C6387iLiiI(ii111i[] r4) {
        iILLL1 r0 = new iILLL1();
        for (int i = 0; i != r4.length; i++) {
            r0.OooO00o(r4[i]);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static C6387iLiiI OooO00o(Object obj) {
        if (obj instanceof C6387iLiiI) {
            return (C6387iLiiI) obj;
        }
        if (obj != null) {
            return new C6387iLiiI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ii111i[] OooO00o() {
        int size = this.OooO00o.size();
        ii111i[] r1 = new ii111i[size];
        for (int i = 0; i != size; i++) {
            r1[i] = ii111i.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
