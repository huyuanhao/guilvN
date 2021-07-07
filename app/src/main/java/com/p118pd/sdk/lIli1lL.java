package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨Ili1lL  reason: invalid class name */
public class lIli1lL extends AbstractC5738Lil {
    public C6310ilIL OooO00o;

    public lIli1lL(C6310ilIL r1) {
        this.OooO00o = r1;
    }

    public lIli1lL(String str) {
        this.OooO00o = new C6310ilIL(str);
    }

    public static lIli1lL OooO00o(Object obj) {
        if (obj instanceof lIli1lL) {
            return (lIli1lL) obj;
        }
        if (obj != null) {
            return new lIli1lL(C6310ilIL.OooO00o(obj));
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
