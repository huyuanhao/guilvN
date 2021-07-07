package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨I1lLILI  reason: invalid class name */
public class I1lLILI {
    public static final I1lLILI OooO00o = new I1lLILI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final BigInteger f22875OooO00o = BigInteger.valueOf(1);
    public static final BigInteger OooO0O0 = BigInteger.valueOf(2);

    public BigInteger OooO00o(C6017i1Il i1il, BigInteger bigInteger) {
        return i1il.m16863OooO00o().modPow(bigInteger, i1il.OooO0OO());
    }

    public BigInteger OooO00o(C6017i1Il i1il, SecureRandom secureRandom) {
        BigInteger OooO00o2;
        BigInteger bit;
        int OooO00o3 = i1il.OooO00o();
        if (OooO00o3 != 0) {
            int i = OooO00o3 >>> 2;
            do {
                bit = new BigInteger(OooO00o3, secureRandom).setBit(OooO00o3 - 1);
            } while (I1lL.OooO00o(bit) < i);
            return bit;
        }
        BigInteger bigInteger = OooO0O0;
        int OooO0O02 = i1il.OooO0O0();
        if (OooO0O02 != 0) {
            bigInteger = f22875OooO00o.shiftLeft(OooO0O02 - 1);
        }
        BigInteger OooO0Oo = i1il.OooO0Oo();
        if (OooO0Oo == null) {
            OooO0Oo = i1il.OooO0OO();
        }
        BigInteger subtract = OooO0Oo.subtract(OooO0O0);
        int bitLength = subtract.bitLength() >>> 2;
        do {
            OooO00o2 = IIiL.OooO00o(bigInteger, subtract, secureRandom);
        } while (I1lL.OooO00o(OooO00o2) < bitLength);
        return OooO00o2;
    }
}
