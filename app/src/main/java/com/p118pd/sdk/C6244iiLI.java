package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iiLI  reason: case insensitive filesystem */
public class C6244iiLI extends C6470l1i {
    public BigInteger OooO00o;
    public int OooO0O0;

    public C6244iiLI(BigInteger bigInteger, SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new IllegalArgumentException("key strength too small");
        } else if (bigInteger.testBit(0)) {
            this.OooO00o = bigInteger;
            this.OooO0O0 = i2;
        } else {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    public int OooO0O0() {
        return this.OooO0O0;
    }
}
