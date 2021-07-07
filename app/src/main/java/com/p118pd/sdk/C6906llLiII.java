package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.l丨丨lLiII  reason: invalid class name and case insensitive filesystem */
public class C6906llLiII {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    public static BigInteger OooO00o(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger modPow;
        BigInteger subtract = bigInteger.subtract(OooO0O0);
        do {
            modPow = IIiL.OooO00o(OooO0O0, subtract, secureRandom).modPow(OooO0O0, bigInteger);
        } while (modPow.equals(OooO00o));
        return modPow;
    }

    public static BigInteger[] OooO00o(int i, int i2, SecureRandom secureRandom) {
        int i3 = i - 1;
        int i4 = i >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(i3, 2, secureRandom);
            BigInteger add = bigInteger.shiftLeft(1).add(OooO00o);
            if (add.isProbablePrime(i2) && ((i2 <= 2 || bigInteger.isProbablePrime(i2 - 2)) && I1lL.OooO00o(add) >= i4)) {
                return new BigInteger[]{add, bigInteger};
            }
        }
    }
}
