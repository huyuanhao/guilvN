package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Ll11LL11 */
public class Ll11LL11 extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0OOO0o = 3;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public Ll11LL11() {
        this.o00oO0O = 0;
        this.OooO00o = C6452l1Lll.OooO00o;
    }

    public Ll11LL11(int i, C9337I1IlL r2) {
        this.o00oO0O = i;
        this.OooO00o = r2;
    }

    public Ll11LL11(AbstractC5903LlLLL r4) {
        AbstractC6854lLi1LL r42;
        int OooO00o2 = r4.OooO00o();
        this.o00oO0O = OooO00o2;
        if (OooO00o2 == 0) {
            r42 = C6452l1Lll.OooO00o;
        } else if (OooO00o2 == 1) {
            r42 = C6435l11IL.OooO00o(r4, false);
        } else if (OooO00o2 == 2 || OooO00o2 == 3) {
            r42 = C9337I1IlL.OooO00o(r4, true);
        } else {
            throw new IllegalArgumentException("unknown tag: " + this.o00oO0O);
        }
        this.OooO00o = r42;
    }

    public Ll11LL11(C6435l11IL l11il) {
        this.o00oO0O = 1;
        this.OooO00o = l11il;
    }

    public static Ll11LL11 OooO00o(Object obj) {
        if (obj == null || (obj instanceof Ll11LL11)) {
            return (Ll11LL11) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new Ll11LL11((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("Invalid object: " + obj.getClass().getName());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16360OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m16361OooO0O0() {
        return this.OooO00o;
    }
}
