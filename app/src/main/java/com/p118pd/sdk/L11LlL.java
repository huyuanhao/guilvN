package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L11LlL */
public class L11LlL extends AbstractC5738Lil {
    public I11li1 OooO00o;

    public L11LlL(I11li1 i11li1) {
        this.OooO00o = i11li1;
    }

    public L11LlL(LLI lli) {
        this.OooO00o = new C5707LiL1(lli);
    }

    public L11LlL(LLI[] lliArr) {
        iILLL1 r0 = new iILLL1();
        for (LLI lli : lliArr) {
            r0.OooO00o(lli);
        }
        this.OooO00o = new C5707LiL1(r0);
    }

    public static L11LlL OooO00o(Object obj) {
        if (obj instanceof L11LlL) {
            return (L11LlL) obj;
        }
        if (obj != null) {
            return new L11LlL(I11li1.OooO00o(obj));
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
