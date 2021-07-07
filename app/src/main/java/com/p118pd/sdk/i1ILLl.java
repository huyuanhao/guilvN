package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1I丨LLl  reason: invalid class name */
public class i1ILLl extends AbstractC5738Lil implements AbstractC5462Ilil {
    public AbstractC6854lLi1LL OooO00o;
    public final int o00oO0O = 3;
    public final int o0ooOO0 = 1;
    public final int o0ooOOo = 999;
    public int o0ooOoO;

    public i1ILLl(int i) {
        if (i > 999 || i < 1) {
            throw new IllegalArgumentException("wrong size in numeric code : not in (1..999)");
        }
        this.OooO00o = new C6513lIiI((long) i);
    }

    public i1ILLl(String str) {
        if (str.length() <= 3) {
            this.OooO00o = new LI11(str);
            return;
        }
        throw new IllegalArgumentException("wrong size in alphabetic code : max size is 3");
    }

    public static i1ILLl OooO00o(Object obj) {
        if (obj == null || (obj instanceof i1ILLl)) {
            return (i1ILLl) obj;
        }
        if (obj instanceof C6513lIiI) {
            return new i1ILLl(C6513lIiI.OooO00o(obj).m17647OooO0O0().intValue());
        }
        if (obj instanceof LI11) {
            return new i1ILLl(LI11.OooO00o(obj).OooO00o());
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public boolean OooO00o() {
        return this.OooO00o instanceof LI11;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return ((C6513lIiI) this.OooO00o).m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16868OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16869OooO0O0() {
        return ((LI11) this.OooO00o).OooO00o();
    }
}
