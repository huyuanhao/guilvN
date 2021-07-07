package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLiIi  reason: case insensitive filesystem */
public class C6178iLiIi extends AbstractC5738Lil {
    public C6310ilIL OooO00o;

    public C6178iLiIi(C6310ilIL r1) {
        this.OooO00o = r1;
    }

    public C6178iLiIi(String str) {
        this(new C6310ilIL(str));
    }

    public static C6178iLiIi OooO00o(Object obj) {
        if (obj instanceof C6178iLiIi) {
            return (C6178iLiIi) obj;
        }
        if (obj != null) {
            return new C6178iLiIi(C6310ilIL.OooO00o(obj));
        }
        return null;
    }

    public C6310ilIL OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
