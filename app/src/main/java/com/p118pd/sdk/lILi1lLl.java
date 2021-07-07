package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lILi1lLl */
public class lILi1lLl extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public lILi1lLl(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public lILi1lLl(LLI lli) {
        this.OooO00o = new C5707LiL1(lli);
    }

    public lILi1lLl(LLI[] lliArr) {
        iILLL1 r0 = new iILLL1();
        for (LLI lli : lliArr) {
            r0.OooO00o(lli);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static lILi1lLl OooO00o(Object obj) {
        if (obj instanceof lILi1lLl) {
            return (lILi1lLl) obj;
        }
        if (obj != null) {
            return new lILi1lLl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LLI[] OooO00o() {
        int size = this.OooO00o.size();
        LLI[] lliArr = new LLI[size];
        for (int i = 0; i != size; i++) {
            lliArr[i] = LLI.OooO00o(this.OooO00o.OooO00o(i));
        }
        return lliArr;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
