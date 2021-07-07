package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LII丨丨  reason: invalid class name and case insensitive filesystem */
public class C5620LII extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public ILI OooO00o;
    public ILI OooO0O0;

    public C5620LII(int i, ILI ili) {
        this(new ILI1Ll(i, ili));
    }

    public C5620LII(AbstractC5903LlLLL r4) {
        int OooO00o2 = r4.OooO00o();
        if (OooO00o2 == 0) {
            this.OooO00o = ILI.OooO00o(r4, true);
        } else if (OooO00o2 == 1) {
            this.OooO0O0 = ILI.OooO00o(r4, true);
        } else {
            throw new IllegalArgumentException("unknown tag: " + r4.OooO00o());
        }
    }

    public static C5620LII OooO00o(Object obj) {
        if (obj == null || (obj instanceof C5620LII)) {
            return (C5620LII) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new C5620LII((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("unknown object in factory: " + obj.getClass());
    }

    public ILI OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public ILI OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16039OooO0O0() {
        return this.OooO00o != null ? new ILI1Ll(true, 0, this.OooO00o) : new ILI1Ll(true, 1, this.OooO0O0);
    }
}
