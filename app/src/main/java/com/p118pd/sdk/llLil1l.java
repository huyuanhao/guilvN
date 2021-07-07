package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.llLil1l */
public class llLil1l extends AbstractC5738Lil {
    public C9603iL1[] OooO00o;
    public C9603iL1[] OooO0O0;

    public llLil1l(I11li1 i11li1) {
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC5903LlLLL OooO00o3 = AbstractC5903LlLLL.OooO00o(OooO00o2.nextElement());
            int OooO00o4 = OooO00o3.OooO00o();
            if (OooO00o4 == 0) {
                this.OooO00o = OooO00o(I11li1.OooO00o(OooO00o3, false));
            } else if (OooO00o4 == 1) {
                this.OooO0O0 = OooO00o(I11li1.OooO00o(OooO00o3, false));
            } else {
                throw new IllegalArgumentException("Unknown tag encountered: " + OooO00o3.OooO00o());
            }
        }
    }

    public llLil1l(C9603iL1[] r1, C9603iL1[] r2) {
        this.OooO00o = OooO00o(r1);
        this.OooO0O0 = OooO00o(r2);
    }

    public static llLil1l OooO00o(Object obj) {
        if (obj instanceof llLil1l) {
            return (llLil1l) obj;
        }
        if (obj != null) {
            return new llLil1l(I11li1.OooO00o(obj));
        }
        return null;
    }

    private C9603iL1[] OooO00o(I11li1 i11li1) {
        int size = i11li1.size();
        C9603iL1[] r1 = new C9603iL1[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C9603iL1.OooO00o(i11li1.OooO00o(i));
        }
        return r1;
    }

    public static C9603iL1[] OooO00o(C9603iL1[] r3) {
        if (r3 == null) {
            return null;
        }
        int length = r3.length;
        C9603iL1[] r1 = new C9603iL1[length];
        System.arraycopy(r3, 0, r1, 0, length);
        return r1;
    }

    public C9603iL1[] OooO00o() {
        return OooO00o(this.OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(false, 0, new C5707LiL1(this.OooO00o)));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 1, new C5707LiL1(this.OooO0O0)));
        }
        return new C5707LiL1(r0);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9603iL1[] m17889OooO0O0() {
        return OooO00o(this.OooO00o);
    }
}
