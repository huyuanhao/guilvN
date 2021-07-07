package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1iIl */
public class I1iIl extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public I1iIl(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public I1iIl(C6149iL11l[] r4) {
        iILLL1 r0 = new iILLL1();
        for (C6149iL11l r2 : r4) {
            r0.OooO00o(r2);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static I1iIl OooO00o(Object obj) {
        if (obj instanceof I1iIl) {
            return (I1iIl) obj;
        }
        if (obj instanceof I11li1) {
            return new I1iIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C6149iL11l OooO00o(int i) {
        return C6149iL11l.OooO00o(this.OooO00o.OooO00o(i));
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }

    public int size() {
        return this.OooO00o.size();
    }
}
