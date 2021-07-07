package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.ILl  reason: case insensitive filesystem */
public class C5312ILl implements AbstractC6370iIIIl {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;
    public int o00oO0O;

    public C5312ILl(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public C5312ILl(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.OooO00o = bigInteger2;
        this.OooO0O0 = bigInteger;
        this.o00oO0O = i;
    }

    public int OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15512OooO00o() {
        return this.OooO00o;
    }

    public BigInteger OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5312ILl)) {
            return false;
        }
        C5312ILl iLl = (C5312ILl) obj;
        return iLl.OooO0O0().equals(this.OooO0O0) && iLl.m15512OooO00o().equals(this.OooO00o) && iLl.OooO00o() == this.o00oO0O;
    }

    public int hashCode() {
        return (OooO0O0().hashCode() ^ m15512OooO00o().hashCode()) + this.o00oO0O;
    }
}
