package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.liLI1l1i */
public class liLI1l1i extends C6213iL11I {
    public static final BigInteger OooO0OO = BigInteger.valueOf(1);
    public BigInteger OooO00o;
    public BigInteger OooO0O0;

    public liLI1l1i(boolean z, BigInteger bigInteger, BigInteger bigInteger2) {
        super(z);
        if (z || (bigInteger2.intValue() & 1) != 0) {
            this.OooO00o = OooO00o(bigInteger);
            this.OooO0O0 = bigInteger2;
            return;
        }
        throw new IllegalArgumentException("RSA publicExponent is even");
    }

    private BigInteger OooO00o(BigInteger bigInteger) {
        if ((bigInteger.intValue() & 1) == 0) {
            throw new IllegalArgumentException("RSA modulus is even");
        } else if (bigInteger.gcd(new BigInteger("1451887755777639901511587432083070202422614380984889313550570919659315177065956574359078912654149167643992684236991305777574330831666511589145701059710742276692757882915756220901998212975756543223550490431013061082131040808010565293748926901442915057819663730454818359472391642885328171302299245556663073719855")).equals(OooO0OO)) {
            return bigInteger;
        } else {
            throw new IllegalArgumentException("RSA modulus has a small prime factor");
        }
    }

    @Override // com.p118pd.sdk.C6213iL11I
    public BigInteger OooO00o() {
        return this.OooO0O0;
    }

    public BigInteger OooO0O0() {
        return this.OooO00o;
    }
}
