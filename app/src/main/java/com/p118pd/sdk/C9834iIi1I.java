package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨丨iIi1I  reason: invalid class name and case insensitive filesystem */
public class C9834iIi1I {
    public static BigInteger OooO00o = BigInteger.valueOf(0);
    public static BigInteger OooO0O0 = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f23427OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23428OooO00o;

    public BigInteger OooO00o() {
        liLI1l1i lili1l1i = this.f23427OooO00o;
        if (lili1l1i != null) {
            BigInteger OooO0O02 = lili1l1i.OooO0O0();
            int bitLength = OooO0O02.bitLength() - 1;
            while (true) {
                BigInteger bigInteger = new BigInteger(bitLength, this.f23428OooO00o);
                BigInteger gcd = bigInteger.gcd(OooO0O02);
                if (!bigInteger.equals(OooO00o) && !bigInteger.equals(OooO0O0) && gcd.equals(OooO0O0)) {
                    return bigInteger;
                }
            }
        } else {
            throw new IllegalStateException("generator not initialised");
        }
    }

    public void OooO00o(AbstractC6370iIIIl r2) {
        SecureRandom secureRandom;
        if (r2 instanceof liLL1l) {
            liLL1l r22 = (liLL1l) r2;
            this.f23427OooO00o = (liLI1l1i) r22.OooO00o();
            secureRandom = r22.m17752OooO00o();
        } else {
            this.f23427OooO00o = (liLI1l1i) r2;
            secureRandom = IIllii.OooO00o();
        }
        this.f23428OooO00o = secureRandom;
        if (this.f23427OooO00o instanceof C11lI) {
            throw new IllegalArgumentException("generator requires RSA public key");
        }
    }
}
