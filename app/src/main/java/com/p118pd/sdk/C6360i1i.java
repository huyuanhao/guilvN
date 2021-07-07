package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨1i  reason: invalid class name and case insensitive filesystem */
public class C6360i1i extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f18132OooO00o;

    public C6360i1i(I11li1 i11li1) {
        this.f18132OooO00o = C6513lIiI.OooO00o(i11li1.OooO00o(0));
        this.OooO00o = I11li1.OooO00o(i11li1.OooO00o(1));
    }

    public static C6360i1i OooO00o(Object obj) {
        if (obj instanceof C6360i1i) {
            return (C6360i1i) obj;
        }
        if (obj != null) {
            return new C6360i1i(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6513lIiI OooO00o() {
        return this.f18132OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public l1LIiIl[] m17460OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return null;
        }
        int size = i11li1.size();
        l1LIiIl[] l1liiilArr = new l1LIiIl[size];
        for (int i = 0; i != size; i++) {
            l1liiilArr[i] = l1LIiIl.OooO00o(this.OooO00o.OooO00o(i));
        }
        return l1liiilArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.f18132OooO00o);
        r0.OooO00o(this.OooO00o);
        return new C5707LiL1(r0);
    }
}
