package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.II丨l  reason: invalid class name and case insensitive filesystem */
public class C5242IIl extends C5467Ill1 {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(1);
    public static final BigInteger OooO0OO = BigInteger.valueOf(2);
    public BigInteger OooO00o;

    public C5242IIl(BigInteger bigInteger, L1llLl1 l1llLl1) {
        super(false, l1llLl1);
        this.OooO00o = OooO00o(bigInteger, l1llLl1);
    }

    private BigInteger OooO00o(BigInteger bigInteger, L1llLl1 l1llLl1) {
        if (l1llLl1 == null) {
            return bigInteger;
        }
        if (OooO0OO.compareTo(bigInteger) <= 0 && l1llLl1.OooO0O0().subtract(OooO0OO).compareTo(bigInteger) >= 0 && OooO0O0.equals(bigInteger.modPow(l1llLl1.OooO0OO(), l1llLl1.OooO0O0()))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("y value does not appear to be in correct group");
    }

    @Override // com.p118pd.sdk.C5467Ill1, com.p118pd.sdk.C6213iL11I
    public BigInteger OooO00o() {
        return this.OooO00o;
    }
}
