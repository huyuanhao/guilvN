package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL丨丨l11I  reason: invalid class name */
public class iLl11I extends AbstractC5738Lil implements AbstractC5462Ilil {
    public static final int o00oO0O = 0;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public AbstractC5903LlLLL OooO00o;

    public iLl11I(int i) {
        this.OooO00o = new ILI1Ll(false, 0, new C6513lIiI((long) i));
    }

    public iLl11I(AbstractC5903LlLLL r4) {
        if (r4.OooO00o() <= 2) {
            this.OooO00o = r4;
            return;
        }
        throw new IllegalArgumentException("Bad tag number: " + r4.OooO00o());
    }

    public iLl11I(C9623il r4) {
        this.OooO00o = new ILI1Ll(false, 2, r4);
    }

    public iLl11I(boolean z, String str) {
        if (str.length() > 2) {
            throw new IllegalArgumentException("country can only be 2 characters");
        } else if (z) {
            this.OooO00o = new ILI1Ll(false, 1, new C5707LiL1(new LI11(str, true)));
        } else {
            iILLL1 r5 = new iILLL1();
            r5.OooO00o(C5514IL.OooO00o);
            r5.OooO00o(new LI11(str, true));
            this.OooO00o = new ILI1Ll(false, 1, new C5707LiL1(r5));
        }
    }

    public static iLl11I OooO00o(Object obj) {
        if (obj == null || (obj instanceof iLl11I)) {
            return (iLl11I) obj;
        }
        if (obj instanceof AbstractC5903LlLLL) {
            return new iLl11I((AbstractC5903LlLLL) obj);
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    public I11li1 OooO00o() {
        if (this.OooO00o.OooO00o() != 1) {
            return null;
        }
        return I11li1.OooO00o(this.OooO00o, false);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9623il m17205OooO00o() {
        if (this.OooO00o.OooO00o() != 2) {
            return null;
        }
        return C9623il.OooO00o(this.OooO00o, false);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17206OooO0O0() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        if (this.OooO00o.OooO00o() != 0) {
            return -1;
        }
        return C6513lIiI.OooO00o(this.OooO00o, false).m17647OooO0O0().intValue();
    }
}
