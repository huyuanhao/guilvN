package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.i丨lLiIL  reason: invalid class name and case insensitive filesystem */
public class C6410ilLiIL implements AbstractC5599L1Ii {
    public static final BigInteger OooO0oO = BigInteger.valueOf(1);
    public C6244iiLI OooO00o;

    public static int OooO00o(int i, int i2) {
        if (i >= 1536) {
            if (i2 <= 100) {
                return 3;
            }
            if (i2 <= 128) {
                return 4;
            }
            return 4 + (((i2 - 128) + 1) / 2);
        } else if (i >= 1024) {
            if (i2 <= 100) {
                return 4;
            }
            if (i2 <= 112) {
                return 5;
            }
            return (((i2 - 112) + 1) / 2) + 5;
        } else if (i >= 512) {
            if (i2 <= 80) {
                return 5;
            }
            if (i2 <= 100) {
                return 7;
            }
            return (((i2 - 100) + 1) / 2) + 7;
        } else if (i2 <= 80) {
            return 40;
        } else {
            return 40 + (((i2 - 80) + 1) / 2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        BigInteger OooO00o2;
        BigInteger OooO00o3;
        BigInteger multiply;
        BigInteger bigInteger;
        C6410ilLiIL r0 = this;
        int OooO00o4 = r0.OooO00o.OooO00o();
        int i = (OooO00o4 + 1) / 2;
        int i2 = OooO00o4 - i;
        int i3 = OooO00o4 / 2;
        int i4 = i3 - 100;
        int i5 = OooO00o4 / 3;
        if (i4 < i5) {
            i4 = i5;
        }
        int i6 = OooO00o4 >> 2;
        BigInteger pow = BigInteger.valueOf(2).pow(i3);
        BigInteger shiftLeft = OooO0oO.shiftLeft(OooO00o4 - 1);
        BigInteger shiftLeft2 = OooO0oO.shiftLeft(i4);
        i1LLl1L i1lll1l = null;
        boolean z = false;
        while (!z) {
            BigInteger OooO00o5 = r0.OooO00o.OooO00o();
            do {
                OooO00o2 = r0.OooO00o(i, OooO00o5, shiftLeft);
                while (true) {
                    OooO00o3 = r0.OooO00o(i2, OooO00o5, shiftLeft);
                    BigInteger abs = OooO00o3.subtract(OooO00o2).abs();
                    if (abs.bitLength() >= i4 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = OooO00o2.multiply(OooO00o3);
                        if (multiply.bitLength() == OooO00o4) {
                            break;
                        }
                        OooO00o2 = OooO00o2.max(OooO00o3);
                    } else {
                        r0 = this;
                        OooO00o4 = OooO00o4;
                    }
                }
            } while (I1lL.OooO00o(multiply) < i6);
            if (OooO00o2.compareTo(OooO00o3) < 0) {
                bigInteger = OooO00o2;
                OooO00o2 = OooO00o3;
            } else {
                bigInteger = OooO00o3;
            }
            BigInteger subtract = OooO00o2.subtract(OooO0oO);
            BigInteger subtract2 = bigInteger.subtract(OooO0oO);
            BigInteger modInverse = OooO00o5.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                i1lll1l = new i1LLl1L((C6213iL11I) new liLI1l1i(false, multiply, OooO00o5), (C6213iL11I) new C11lI(multiply, OooO00o5, modInverse, OooO00o2, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), bigInteger.modInverse(OooO00o2)));
                z = true;
            }
            r0 = this;
            OooO00o4 = OooO00o4;
        }
        return i1lll1l;
    }

    public BigInteger OooO00o(int i, BigInteger bigInteger, BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            BigInteger bigInteger3 = new BigInteger(i, 1, this.OooO00o.m17607OooO00o());
            if (!bigInteger3.mod(bigInteger).equals(OooO0oO) && bigInteger3.multiply(bigInteger3).compareTo(bigInteger2) >= 0 && OooO00o(bigInteger3) && bigInteger.gcd(bigInteger3.subtract(OooO0oO)).equals(OooO0oO)) {
                return bigInteger3;
            }
        }
        throw new IllegalStateException("unable to generate prime number for RSA key");
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.OooO00o = (C6244iiLI) r1;
    }

    public boolean OooO00o(BigInteger bigInteger) {
        return !AbstractC9366ILlIL.OooO00o(bigInteger) && AbstractC9366ILlIL.m21432OooO00o(bigInteger, this.OooO00o.m17607OooO00o(), OooO00o(bigInteger.bitLength(), this.OooO00o.OooO0O0()));
    }
}
