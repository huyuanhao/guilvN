package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3617o;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.liIIL丨  reason: invalid class name and case insensitive filesystem */
public class C6648liIIL {
    public final BigInteger OooO00o;
    public final BigInteger OooO0O0;
    public final BigInteger OooO0OO;

    public C6648liIIL(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    public C6648liIIL(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        C6570lLI11I.OooO00o(bigInteger, C3617o.f9365as);
        C6570lLI11I.OooO00o(bigInteger2, "q");
        C6570lLI11I.OooO00o(bigInteger3, "g");
        if (!z) {
            if (!bigInteger.subtract(C6570lLI11I.OooO0O0).mod(bigInteger2).equals(C6570lLI11I.OooO00o)) {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            } else if (bigInteger3.compareTo(BigInteger.valueOf(2)) == -1 || bigInteger3.compareTo(bigInteger.subtract(C6570lLI11I.OooO0O0)) == 1) {
                throw new IllegalArgumentException("g must be in [2, p-1]");
            } else if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(C6570lLI11I.OooO0O0)) {
                throw new IllegalArgumentException("g^q mod p must equal 1");
            } else if (!bigInteger.isProbablePrime(20)) {
                throw new IllegalArgumentException("p must be prime");
            } else if (!bigInteger2.isProbablePrime(20)) {
                throw new IllegalArgumentException("q must be prime");
            }
        }
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
    }

    public BigInteger OooO00o() {
        return this.OooO0OO;
    }

    public BigInteger OooO0O0() {
        return this.OooO00o;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }
}
