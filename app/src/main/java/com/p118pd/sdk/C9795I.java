package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨I丨  reason: invalid class name and case insensitive filesystem */
public class C9795I extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public C9795I(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public C9795I(C5190I1lIiL r2) {
        this.OooO00o = new C5707LiL1(r2);
    }

    public static C9795I OooO00o(Object obj) {
        if (obj instanceof C9795I) {
            return (C9795I) obj;
        }
        if (obj != null) {
            return new C9795I(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5190I1lIiL[] OooO00o() {
        int size = this.OooO00o.size();
        C5190I1lIiL[] r1 = new C5190I1lIiL[size];
        for (int i = 0; i != size; i++) {
            r1[i] = C5190I1lIiL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
