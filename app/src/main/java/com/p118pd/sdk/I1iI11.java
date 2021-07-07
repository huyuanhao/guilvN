package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.I1i丨I1丨1  reason: invalid class name */
public class I1iI11 implements AbstractC5599L1Ii {
    public static final BigInteger OooO0oO = BigInteger.valueOf(1);
    public C9345I1lIl OooO00o;

    private C6236iiI1l OooO00o(L11I l11i, C9617iiLil r8) {
        BigInteger OooO00o2 = l11i.m15877OooO00o();
        BigInteger OooO0O0 = l11i.OooO0O0();
        BigInteger OooO0OO = l11i.OooO0OO();
        return new C6236iiI1l(l11i, OooO00o2.modPow(r8.m21679OooO00o(), OooO0OO).multiply(OooO0O0.modPow(r8.OooO0O0(), OooO0OO)), OooO00o2.modPow(r8.OooO0OO(), OooO0OO).multiply(OooO0O0.modPow(r8.OooO0Oo(), OooO0OO)), OooO00o2.modPow(r8.OooO0o0(), OooO0OO));
    }

    private C9617iiLil OooO00o(SecureRandom secureRandom, L11I l11i) {
        BigInteger OooO0OO = l11i.OooO0OO();
        return new C9617iiLil(l11i, OooO00o(OooO0OO, secureRandom), OooO00o(OooO0OO, secureRandom), OooO00o(OooO0OO, secureRandom), OooO00o(OooO0OO, secureRandom), OooO00o(OooO0OO, secureRandom));
    }

    private BigInteger OooO00o(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = OooO0oO;
        return IIiL.OooO00o(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        L11I OooO00o2 = this.OooO00o.OooO00o();
        C9617iiLil OooO00o3 = OooO00o(this.OooO00o.m17607OooO00o(), OooO00o2);
        C6236iiI1l OooO00o4 = OooO00o(OooO00o2, OooO00o3);
        OooO00o3.OooO00o(OooO00o4);
        return new i1LLl1L((C6213iL11I) OooO00o4, (C6213iL11I) OooO00o3);
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.OooO00o = (C9345I1lIl) r1;
    }
}
