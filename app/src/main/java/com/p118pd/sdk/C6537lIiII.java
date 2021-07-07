package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lI丨iII  reason: invalid class name and case insensitive filesystem */
public class C6537lIiII extends AbstractC5738Lil {
    public BigInteger OooO00o;

    public C6537lIiII(BigInteger bigInteger) {
        this.OooO00o = bigInteger;
    }

    public static C6537lIiII OooO00o(Object obj) {
        if (obj instanceof C6537lIiII) {
            return (C6537lIiII) obj;
        }
        if (obj != null) {
            return new C6537lIiII(C6513lIiI.OooO00o(obj).m17647OooO0O0());
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C6513lIiI(this.OooO00o);
    }

    public String toString() {
        return "CRLNumber: " + OooO00o();
    }
}
