package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.lIlIl  reason: case insensitive filesystem */
public class C6518lIlIl extends AbstractC5738Lil {
    public static final long OooO0O0 = 4294967295L;
    public final long OooO00o;

    public C6518lIlIl(long j) {
        if (j < 0 || j > 4294967295L) {
            throw new IllegalArgumentException("id out of range");
        }
        this.OooO00o = j;
    }

    public C6518lIlIl(C6513lIiI r3) {
        this(OooO00o(r3.m17647OooO0O0()));
    }

    public static long OooO00o(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 32) {
            return bigInteger.longValue();
        }
        throw new IllegalArgumentException("id out of range");
    }

    public static C6518lIlIl OooO00o(Object obj) {
        if (obj instanceof C6518lIlIl) {
            return (C6518lIlIl) obj;
        }
        if (obj != null) {
            return new C6518lIlIl(C6513lIiI.OooO00o(obj));
        }
        return null;
    }

    public long OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return new C6513lIiI(this.OooO00o);
    }
}
