package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i1Il  reason: case insensitive filesystem */
public class C6017i1Il implements AbstractC6370iIIIl {
    public static final int o0ooOOo = 160;
    public C5388Ii1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f17357OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;
    public int o00oO0O;
    public int o0ooOO0;

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, OooO00o(i), i, null, null);
    }

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        this(bigInteger, bigInteger2, bigInteger3, i, i2, null, null);
    }

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, C5388Ii1 r8) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            } else if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i <= bigInteger.bitLength()) {
            this.f17357OooO00o = bigInteger2;
            this.OooO0O0 = bigInteger;
            this.OooO0OO = bigInteger3;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            this.OooO0Oo = bigInteger4;
            this.OooO00o = r8;
            return;
        }
        throw new IllegalArgumentException("unsafe p value so small specific l required");
    }

    public C6017i1Il(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, C5388Ii1 r13) {
        this(bigInteger, bigInteger2, bigInteger3, 160, 0, bigInteger4, r13);
    }

    public static int OooO00o(int i) {
        if (i != 0 && i < 160) {
            return i;
        }
        return 160;
    }

    public int OooO00o() {
        return this.o0ooOO0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5388Ii1 m16862OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m16863OooO00o() {
        return this.f17357OooO00o;
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public BigInteger m16864OooO0O0() {
        return this.OooO0Oo;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0OO;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6017i1Il)) {
            return false;
        }
        C6017i1Il i1il = (C6017i1Il) obj;
        if (OooO0Oo() != null) {
            if (!OooO0Oo().equals(i1il.OooO0Oo())) {
                return false;
            }
        } else if (i1il.OooO0Oo() != null) {
            return false;
        }
        return i1il.OooO0OO().equals(this.OooO0O0) && i1il.m16863OooO00o().equals(this.f17357OooO00o);
    }

    public int hashCode() {
        return (OooO0OO().hashCode() ^ m16863OooO00o().hashCode()) ^ (OooO0Oo() != null ? OooO0Oo().hashCode() : 0);
    }
}
