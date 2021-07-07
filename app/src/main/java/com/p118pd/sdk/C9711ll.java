package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨ll  reason: invalid class name and case insensitive filesystem */
public class C9711ll extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public AbstractC6854lLi1LL OooO00o;

    public C9711ll(int i) {
        if (i == 0 || i == 1) {
            this.OooO00o = new C6513lIiI((long) i);
            return;
        }
        throw new IllegalArgumentException("unknow PredefinedBiometricType : " + i);
    }

    public C9711ll(LlLI1 llLI1) {
        this.OooO00o = llLI1;
    }

    public static C9711ll OooO00o(Object obj) {
        if (obj == null || (obj instanceof C9711ll)) {
            return (C9711ll) obj;
        }
        if (obj instanceof C6513lIiI) {
            return new C9711ll(C6513lIiI.OooO00o(obj).m17647OooO0O0().intValue());
        }
        if (obj instanceof LlLI1) {
            return new C9711ll(LlLI1.OooO00o(obj));
        }
        throw new IllegalArgumentException("unknown object in getInstance");
    }

    public LlLI1 OooO00o() {
        return (LlLI1) this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21748OooO00o() {
        return this.OooO00o instanceof C6513lIiI;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return ((C6513lIiI) this.OooO00o).m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m21749OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
