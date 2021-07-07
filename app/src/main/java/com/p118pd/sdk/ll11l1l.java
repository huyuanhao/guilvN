package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.ll11l1l */
public class ll11l1l implements AbstractC5599L1Ii {
    public C9475LI1il OooO00o;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        Ii1lIl OooO00o2 = this.OooO00o.OooO00o();
        SecureRandom OooO00o3 = this.OooO00o.m17607OooO00o();
        BigInteger OooO0OO = OooO00o2.OooO0OO();
        BigInteger OooO0O0 = OooO00o2.OooO0O0();
        BigInteger OooO00o4 = OooO00o2.m15559OooO00o();
        while (true) {
            BigInteger bigInteger = new BigInteger(256, OooO00o3);
            if (bigInteger.signum() >= 1 && bigInteger.compareTo(OooO0OO) < 0 && I1lL.OooO00o(bigInteger) >= 64) {
                return new i1LLl1L((C6213iL11I) new C5201IIL(OooO00o4.modPow(bigInteger, OooO0O0), OooO00o2), (C6213iL11I) new C6463l1lI(bigInteger, OooO00o2));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.OooO00o = (C9475LI1il) r1;
    }
}
