package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ilI丨L  reason: invalid class name and case insensitive filesystem */
public class C6310ilIL extends AbstractC5738Lil implements AbstractC5462Ilil, AbstractC98681 {
    public AbstractC98681 OooO00o;

    public C6310ilIL(LI11 li11) {
        this.OooO00o = li11;
    }

    public C6310ilIL(LII lii) {
        this.OooO00o = lii;
    }

    public C6310ilIL(LIlLi lIlLi) {
        this.OooO00o = lIlLi;
    }

    public C6310ilIL(C6901li11 r1) {
        this.OooO00o = r1;
    }

    public C6310ilIL(C17021 r1) {
        this.OooO00o = r1;
    }

    public C6310ilIL(String str) {
        this.OooO00o = new LII(str);
    }

    public static C6310ilIL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        if (z) {
            return OooO00o(r0.OooO0o());
        }
        throw new IllegalArgumentException("choice item must be explicitly tagged");
    }

    public static C6310ilIL OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6310ilIL)) {
            return (C6310ilIL) obj;
        }
        if (obj instanceof C17021) {
            return new C6310ilIL((C17021) obj);
        }
        if (obj instanceof LI11) {
            return new C6310ilIL((LI11) obj);
        }
        if (obj instanceof LIlLi) {
            return new C6310ilIL((LIlLi) obj);
        }
        if (obj instanceof LII) {
            return new C6310ilIL((LII) obj);
        }
        if (obj instanceof C6901li11) {
            return new C6310ilIL((C6901li11) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC98681
    public String OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return ((AbstractC6854lLi1LL) this.OooO00o).OooO0O0();
    }

    public String toString() {
        return this.OooO00o.OooO00o();
    }
}
