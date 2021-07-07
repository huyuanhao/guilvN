package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.li1丨llIi  reason: invalid class name */
public class li1llIi {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18586OooO00o;
    public int OooO0O0;

    public C5312ILl OooO00o() {
        BigInteger[] OooO00o2 = C6906llLiII.OooO00o(this.OooO00o, this.OooO0O0, this.f18586OooO00o);
        BigInteger bigInteger = OooO00o2[0];
        return new C5312ILl(bigInteger, C6906llLiII.OooO00o(bigInteger, OooO00o2[1], this.f18586OooO00o));
    }

    public void OooO00o(int i, int i2, SecureRandom secureRandom) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f18586OooO00o = secureRandom;
    }
}
