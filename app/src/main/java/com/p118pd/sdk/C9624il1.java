package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨il1  reason: invalid class name and case insensitive filesystem */
public class C9624il1 extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C9624il1(I11li1 i11li1) {
        if (i11li1.size() == 1) {
            I11li1 i11li12 = (I11li1) i11li1.OooO00o(0);
            this.OooO00o = i11li12;
            Enumeration OooO00o2 = i11li12.m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                ll1111i.OooO00o(OooO00o2.nextElement());
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C9624il1(ll1111i[] r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C9624il1 OooO00o(Object obj) {
        if (obj instanceof C9624il1) {
            return (C9624il1) obj;
        }
        if (obj != null) {
            return new C9624il1(I11li1.OooO00o(obj));
        }
        return null;
    }

    public ll1111i[] OooO00o() {
        int size = this.OooO00o.size();
        ll1111i[] r1 = new ll1111i[size];
        for (int i = 0; i < size; i++) {
            r1[i] = ll1111i.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C5707LiL1(this.OooO00o);
    }
}
