package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.LiIiLii */
public class LiIiLii extends C5627LIiI {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);
    public BigInteger OooO00o;

    public LiIiLii(BigInteger bigInteger, C6017i1Il i1il) {
        super(false, i1il);
        this.OooO00o = OooO00o(bigInteger, i1il);
    }

    private BigInteger OooO00o(BigInteger bigInteger, C6017i1Il i1il) {
        if (bigInteger == null) {
            throw new NullPointerException("y value cannot be null");
        } else if (bigInteger.compareTo(OooO0OO) < 0 || bigInteger.compareTo(i1il.OooO0OO().subtract(OooO0OO)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        } else if (i1il.OooO0Oo() == null || OooO0O0.equals(bigInteger.modPow(i1il.OooO0Oo(), i1il.OooO0OO()))) {
            return bigInteger;
        } else {
            throw new IllegalArgumentException("Y value does not appear to be in correct group");
        }
    }

    @Override // com.p118pd.sdk.C5627LIiI, com.p118pd.sdk.C6213iL11I
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C5627LIiI
    public boolean equals(Object obj) {
        return (obj instanceof LiIiLii) && ((LiIiLii) obj).OooO00o().equals(this.OooO00o) && super.equals(obj);
    }

    @Override // com.p118pd.sdk.C5627LIiI
    public int hashCode() {
        return this.OooO00o.hashCode() ^ super.hashCode();
    }
}
