package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIiI丨  reason: invalid class name and case insensitive filesystem */
public class C6507lIiI extends AbstractC5738Lil {
    public C6513lIiI OooO00o;

    public C6507lIiI(C6513lIiI r2) {
        if (r2 != null) {
            this.OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("'y' cannot be null");
    }

    public C6507lIiI(BigInteger bigInteger) {
        if (bigInteger != null) {
            this.OooO00o = new C6513lIiI(bigInteger);
            return;
        }
        throw new IllegalArgumentException("'y' cannot be null");
    }

    public static C6507lIiI OooO00o(AbstractC5903LlLLL r0, boolean z) {
        return OooO00o(C6513lIiI.OooO00o(r0, z));
    }

    public static C6507lIiI OooO00o(Object obj) {
        if (obj == null || (obj instanceof C6507lIiI)) {
            return (C6507lIiI) obj;
        }
        if (obj instanceof C6513lIiI) {
            return new C6507lIiI((C6513lIiI) obj);
        }
        throw new IllegalArgumentException("Invalid DHPublicKey: " + obj.getClass().getName());
    }

    public BigInteger OooO00o() {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.OooO00o;
    }
}
