package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iiLII  reason: case insensitive filesystem */
public class C6246iiLII implements AbstractC6477lI1I {
    public static final BigInteger OooO0O0 = BigInteger.valueOf(0);
    public BigInteger OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17866OooO00o;

    @Override // com.p118pd.sdk.AbstractC6477lI1I, com.p118pd.sdk.AbstractC6477lI1I
    public BigInteger OooO00o() {
        int bitLength = this.OooO00o.bitLength();
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f17866OooO00o);
            if (!bigInteger.equals(OooO0O0) && bigInteger.compareTo(this.OooO00o) < 0) {
                return bigInteger;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I
    public void OooO00o(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I
    public void OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        this.OooO00o = bigInteger;
        this.f17866OooO00o = secureRandom;
    }

    @Override // com.p118pd.sdk.AbstractC6477lI1I, com.p118pd.sdk.AbstractC6477lI1I
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17250OooO00o() {
        return false;
    }
}
