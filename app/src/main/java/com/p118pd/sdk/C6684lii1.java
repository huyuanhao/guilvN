package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.lii1  reason: case insensitive filesystem */
public class C6684lii1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C6684lii1(I11li1 i11li1) {
        I11li1 i11li12 = (I11li1) i11li1.OooO00o(0);
        this.OooO00o = i11li12;
        Enumeration OooO00o2 = i11li12.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            C1691i.OooO00o(OooO00o2.nextElement());
        }
    }

    public C6684lii1(C1691i[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C6684lii1 OooO00o(Object obj) {
        if (obj instanceof C6684lii1) {
            return (C6684lii1) obj;
        }
        if (obj != null) {
            return new C6684lii1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C1691i[] OooO00o() {
        int size = this.OooO00o.size();
        C1691i[] r1 = new C1691i[size];
        for (int i = 0; i < size; i++) {
            r1[i] = C1691i.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }
}
