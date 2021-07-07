package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.IIii丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC5207IIii {
    public static final AbstractC6047i1lLI OooO00o = new C6548lL1Ll(BigInteger.valueOf(2));
    public static final AbstractC6047i1lLI OooO0O0 = new C6548lL1Ll(BigInteger.valueOf(3));

    public static LiliILiI OooO00o(int[] iArr) {
        if (iArr[0] == 0) {
            for (int i = 1; i < iArr.length; i++) {
                if (iArr[i] <= iArr[i - 1]) {
                    throw new IllegalArgumentException("Polynomial exponents must be montonically increasing");
                }
            }
            return new C5236II1(OooO00o, new lIII1(iArr));
        }
        throw new IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
    }

    public static AbstractC6047i1lLI OooO00o(BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return OooO00o;
            }
            if (intValue == 3) {
                return OooO0O0;
            }
        }
        return new C6548lL1Ll(bigInteger);
    }
}
