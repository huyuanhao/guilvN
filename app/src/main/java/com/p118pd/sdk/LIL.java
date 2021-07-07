package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIL */
public class LIL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public AbstractC6854lLi1LL OooO00o;

    public LIL(AbstractC5903LlLLL r4) {
        AbstractC6854lLi1LL r42;
        int OooO00o2 = r4.OooO00o();
        if (OooO00o2 == 0) {
            r42 = ii1IlLLL.OooO00o(r4.OooO0o());
        } else if (OooO00o2 == 1) {
            r42 = AbstractC6804llL1ii.OooO00o(r4, false);
        } else if (OooO00o2 == 2) {
            r42 = C5514IL.OooO00o(r4, false);
        } else {
            throw new IllegalArgumentException("unknown tag number: " + r4.OooO00o());
        }
        this.OooO00o = r42;
    }

    public LIL(ii1IlLLL ii1illll) {
        this.OooO00o = ii1illll;
    }

    public LIL(AbstractC6804llL1ii r1) {
        this.OooO00o = r1;
    }

    public LIL(boolean z) {
        this.OooO00o = C5514IL.OooO00o(z);
    }

    public static LIL OooO00o(Object obj) {
        if (obj == null || (obj instanceof LIL)) {
            return (LIL) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new LIL((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("unknown object: " + obj);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        if (r0 instanceof ii1IlLLL) {
            return 0;
        }
        return r0 instanceof AbstractC6804llL1ii ? 1 : 2;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16040OooO0O0() {
        AbstractC6854lLi1LL r0 = this.OooO00o;
        return r0 instanceof ii1IlLLL ? new ILI1Ll(true, 0, this.OooO00o) : r0 instanceof AbstractC6804llL1ii ? new ILI1Ll(false, 1, this.OooO00o) : new ILI1Ll(false, 2, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16041OooO0O0() {
        return this.OooO00o;
    }
}
