package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.ILII */
public class ILII implements AbstractC5599L1Ii {
    public static final BigInteger OooO0oO = BigInteger.valueOf(1);
    public ILIIi1 OooO00o;

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger OooO00o2;
        int bitLength = bigInteger.bitLength() >>> 2;
        do {
            BigInteger bigInteger2 = OooO0oO;
            OooO00o2 = IIiL.OooO00o(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
        } while (I1lL.OooO00o(OooO00o2) < bitLength);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        L1llLl1 OooO00o2 = this.OooO00o.OooO00o();
        BigInteger OooO00o3 = OooO00o(OooO00o2.OooO0OO(), this.OooO00o.m17607OooO00o());
        return new i1LLl1L((C6213iL11I) new C5242IIl(OooO00o(OooO00o2.OooO0O0(), OooO00o2.m15991OooO00o(), OooO00o3), OooO00o2), (C6213iL11I) new C5907Ll1LI(OooO00o3, OooO00o2));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.OooO00o = (ILIIi1) r1;
    }
}
