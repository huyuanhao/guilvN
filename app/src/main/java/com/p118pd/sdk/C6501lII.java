package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.lII丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C6501lII {
    public static final BigInteger OooO00o = BigInteger.valueOf(1);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18375OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18376OooO00o;
    public int OooO0O0;

    /* renamed from: com.pd.sdk.lII丨丨丨$OooO00o */
    public static class OooO00o {
        public static final BigInteger OooO00o = BigInteger.valueOf(2);

        public static BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
            BigInteger modPow;
            BigInteger subtract = bigInteger.subtract(OooO00o);
            do {
                modPow = IIiL.OooO00o(OooO00o, subtract, secureRandom).modPow(OooO00o, bigInteger);
            } while (modPow.equals(C6501lII.OooO00o));
            return modPow;
        }

        public static BigInteger[] OooO00o(int i, int i2, SecureRandom secureRandom) {
            BigInteger bigInteger;
            BigInteger add;
            int i3 = i - 1;
            while (true) {
                bigInteger = new BigInteger(i3, 2, secureRandom);
                add = bigInteger.shiftLeft(1).add(C6501lII.OooO00o);
                if (!add.isProbablePrime(i2) || (i2 > 2 && !bigInteger.isProbablePrime(i2))) {
                }
            }
            return new BigInteger[]{add, bigInteger};
        }
    }

    public L11I OooO00o() {
        BigInteger OooO00o2;
        BigInteger bigInteger = OooO00o.OooO00o(this.f18375OooO00o, this.OooO0O0, this.f18376OooO00o)[1];
        BigInteger OooO00o3 = OooO00o.OooO00o(bigInteger, this.f18376OooO00o);
        do {
            OooO00o2 = OooO00o.OooO00o(bigInteger, this.f18376OooO00o);
        } while (OooO00o3.equals(OooO00o2));
        return new L11I(bigInteger, OooO00o3, OooO00o2, new I1li1Ll());
    }

    public L11I OooO00o(C6017i1Il i1il) {
        BigInteger OooO00o2;
        BigInteger OooO0OO = i1il.OooO0OO();
        BigInteger OooO00o3 = i1il.m16863OooO00o();
        do {
            OooO00o2 = OooO00o.OooO00o(OooO0OO, this.f18376OooO00o);
        } while (OooO00o3.equals(OooO00o2));
        return new L11I(OooO0OO, OooO00o3, OooO00o2, new I1li1Ll());
    }

    public void OooO00o(int i, int i2, SecureRandom secureRandom) {
        this.f18375OooO00o = i;
        this.OooO0O0 = i2;
        this.f18376OooO00o = secureRandom;
    }
}
