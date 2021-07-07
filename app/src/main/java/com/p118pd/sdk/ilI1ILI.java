package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.ilI丨1ILI  reason: invalid class name */
public class ilI1ILI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public ilI1ILI(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            C9648ii1.OooO00o(OooO00o2.nextElement());
        }
        this.OooO00o = i11li1;
    }

    public ilI1ILI(C9648ii1[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static ilI1ILI OooO00o(Object obj) {
        if (obj instanceof ilI1ILI) {
            return (ilI1ILI) obj;
        }
        if (obj != null) {
            return new ilI1ILI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9648ii1[] OooO00o() {
        int size = this.OooO00o.size();
        C9648ii1[] r1 = new C9648ii1[size];
        for (int i = 0; i < size; i++) {
            r1[i] = C9648ii1.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
