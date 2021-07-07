package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IlIi  reason: case insensitive filesystem */
public class C5429IlIi {
    public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        while (true) {
            BigInteger bigInteger2 = new BigInteger(bitLength, secureRandom);
            if (!bigInteger2.equals(AbstractC5490IlLL.OooO00o) && bigInteger2.compareTo(bigInteger) < 0) {
                return bigInteger2;
            }
        }
    }
}
