package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.i丨II  reason: invalid class name and case insensitive filesystem */
public class C6369iII {
    public static final BigInteger OooO00o = BigInteger.valueOf(2);

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18157OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18158OooO00o;
    public int OooO0O0;

    public C6017i1Il OooO00o() {
        BigInteger[] OooO00o2 = C6906llLiII.OooO00o(this.f18157OooO00o, this.OooO0O0, this.f18158OooO00o);
        BigInteger bigInteger = OooO00o2[0];
        BigInteger bigInteger2 = OooO00o2[1];
        return new C6017i1Il(bigInteger, C6906llLiII.OooO00o(bigInteger, bigInteger2, this.f18158OooO00o), bigInteger2, OooO00o, (C5388Ii1) null);
    }

    public void OooO00o(int i, int i2, SecureRandom secureRandom) {
        this.f18157OooO00o = i;
        this.OooO0O0 = i2;
        this.f18158OooO00o = secureRandom;
    }
}
