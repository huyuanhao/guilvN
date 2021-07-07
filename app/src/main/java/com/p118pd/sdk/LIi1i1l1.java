package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIi1i1l1 */
public class LIi1i1l1 extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 200;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public AbstractC98681 OooO00o;
    public int o00oO0O;

    public LIi1i1l1(int i, String str) {
        str = str.length() > 200 ? str.substring(0, 200) : str;
        this.o00oO0O = i;
        this.OooO00o = i != 0 ? i != 1 ? i != 2 ? i != 3 ? new LII(str) : new C1695li(str) : new LII(str) : new C6901li11(str) : new L1iI1(str);
    }

    public LIi1i1l1(AbstractC98681 r2) {
        int i;
        this.OooO00o = r2;
        if (r2 instanceof LII) {
            i = 2;
        } else if (r2 instanceof C6901li11) {
            i = 1;
        } else if (r2 instanceof L1iI1) {
            i = 0;
        } else if (r2 instanceof C1695li) {
            i = 3;
        } else {
            throw new IllegalArgumentException("unknown STRING type in DisplayText");
        }
        this.o00oO0O = i;
    }

    public LIi1i1l1(String str) {
        str = str.length() > 200 ? str.substring(0, 200) : str;
        this.o00oO0O = 2;
        this.OooO00o = new LII(str);
    }

    public static LIi1i1l1 OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(r0.OooO0o());
    }

    public static LIi1i1l1 OooO00o(Object obj) {
        if (obj instanceof AbstractC98681) {
            return new LIi1i1l1((AbstractC98681) obj);
        }
        if (obj == null || (obj instanceof LIi1i1l1)) {
            return (LIi1i1l1) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public String OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return (AbstractC6122iIlLiL) this.OooO00o;
    }
}
