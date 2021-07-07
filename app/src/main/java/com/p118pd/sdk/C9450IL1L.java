package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨I丨丨L1L  reason: invalid class name and case insensitive filesystem */
public class C9450IL1L extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public C9450IL1L() {
        this.o00oO0O = 0;
        this.OooO00o = C6452l1Lll.OooO00o;
    }

    public C9450IL1L(int i, AbstractC6854lLi1LL r2) {
        this.o00oO0O = i;
        this.OooO00o = r2;
    }

    public C9450IL1L(LIiLLLiL lIiLLLiL) {
        this.o00oO0O = 1;
        this.OooO00o = lIiLLLiL;
    }

    public C9450IL1L(AbstractC5903LlLLL r4) {
        AbstractC6854lLi1LL r42;
        this.o00oO0O = r4.OooO00o();
        int OooO00o2 = r4.OooO00o();
        if (OooO00o2 != 0) {
            if (OooO00o2 == 1) {
                r42 = LIiLLLiL.OooO00o(r4, false);
                this.OooO00o = r42;
            } else if (OooO00o2 != 2) {
                throw new IllegalArgumentException("Unknown tag encountered: " + r4.OooO00o());
            }
        }
        r42 = C6452l1Lll.OooO00o;
        this.OooO00o = r42;
    }

    public static C9450IL1L OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static C9450IL1L OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9450IL1L)) {
            return (C9450IL1L) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C9450IL1L((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass().getName());
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21497OooO0O0() {
        return this.OooO00o;
    }
}
