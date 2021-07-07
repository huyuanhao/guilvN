package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨I1IlL  reason: invalid class name and case insensitive filesystem */
public class C9337I1IlL extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o0OOO0o = 3;
    public static final int o0Oo0oo = 4;
    public static final int o0ooOO0 = 0;
    public static final int o0ooOOo = 1;
    public static final int o0ooOoO = 2;
    public AbstractC6854lLi1LL OooO00o;
    public int o00oO0O;

    public C9337I1IlL(C5562Ill r2) {
        this.o00oO0O = 3;
        this.OooO00o = r2;
    }

    public C9337I1IlL(AbstractC5903LlLLL r4) {
        AbstractC6854lLi1LL r42;
        int OooO00o2 = r4.OooO00o();
        this.o00oO0O = OooO00o2;
        if (OooO00o2 != 0) {
            if (OooO00o2 == 1) {
                r42 = C6838lIliI.OooO00o(C6513lIiI.OooO00o(r4, false).m17647OooO0O0().intValue());
            } else if (OooO00o2 != 2) {
                if (OooO00o2 == 3) {
                    r42 = C5562Ill.OooO00o(r4, false);
                } else if (OooO00o2 == 4) {
                    r42 = Ii1I1LlI.OooO00o(r4, false);
                } else {
                    throw new IllegalArgumentException("unknown tag in POPOPrivKey");
                }
            }
            this.OooO00o = r42;
        }
        r42 = iIilII1.OooO00o(r4, false);
        this.OooO00o = r42;
    }

    public C9337I1IlL(C6838lIliI r2) {
        this.o00oO0O = 1;
        this.OooO00o = r2;
    }

    public static C9337I1IlL OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(AbstractC5903LlLLL.OooO00o(r0, z));
    }

    public static C9337I1IlL OooO00o(Object obj) {
        if (obj instanceof C9337I1IlL) {
            return (C9337I1IlL) obj;
        }
        if (obj != null) {
            return new C9337I1IlL(AbstractC5903LlLLL.OooO00o(obj));
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21383OooO0O0() {
        return new ILI1Ll(false, this.o00oO0O, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6854lLi1LL m21384OooO0O0() {
        return this.OooO00o;
    }
}
