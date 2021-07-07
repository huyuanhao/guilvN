package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨丨Ii丨I1l  reason: invalid class name and case insensitive filesystem */
public class C9762IiI1l extends AbstractC5738Lil {
    public static final int o00oO0O = 0;
    public static final int o0OOO0o = 5;
    public static final int o0Oo0oo = 6;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public C5841L11I OooO00o;

    public C9762IiI1l(int i) {
        this(new C5841L11I(i));
    }

    public C9762IiI1l(C5841L11I r1) {
        this.OooO00o = r1;
    }

    public static C9762IiI1l OooO00o(Object obj) {
        if (obj instanceof C9762IiI1l) {
            return (C9762IiI1l) obj;
        }
        if (obj != null) {
            return new C9762IiI1l(C5841L11I.OooO00o(obj));
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
