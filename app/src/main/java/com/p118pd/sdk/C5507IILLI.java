package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨ILLI  reason: invalid class name and case insensitive filesystem */
public class C5507IILLI extends AbstractC5738Lil implements AbstractC5462Ilil {
    public III OooO00o;

    public C5507IILLI(III iii) {
        this.OooO00o = iii;
    }

    public C5507IILLI(AbstractC5903LlLLL r2) {
        if (r2.OooO00o() == 0) {
            this.OooO00o = III.OooO00o(r2, false);
        }
    }

    public static C5507IILLI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5507IILLI)) {
            return (C5507IILLI) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C5507IILLI(AbstractC5903LlLLL.OooO00o(obj));
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public III OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        if (this.OooO00o != null) {
            return new ILI1Ll(false, 0, this.OooO00o);
        }
        return null;
    }
}
