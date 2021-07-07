package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨LI111丨l  reason: invalid class name */
public class LI111l implements AbstractC5599L1Ii, AbstractC5490IlLL {
    public C5600L1iLL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23047OooO00o;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public i1LLl1L OooO00o() {
        BigInteger OooO0OO = this.OooO00o.OooO0OO();
        int bitLength = OooO0OO.bitLength();
        int i = bitLength >>> 2;
        while (true) {
            BigInteger bigInteger = new BigInteger(bitLength, this.f23047OooO00o);
            if (bigInteger.compareTo(AbstractC5490IlLL.OooO0OO) >= 0 && bigInteger.compareTo(OooO0OO) < 0 && I1lL.OooO00o(bigInteger) >= i) {
                return new i1LLl1L((C6213iL11I) new LL1ii1l(m21528OooO00o().OooO00o(this.OooO00o.m16003OooO00o(), bigInteger), this.OooO00o), (C6213iL11I) new C6512lIilLl(bigInteger, this.OooO00o));
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6615lLl1Ii m21528OooO00o() {
        return new C9372Ii1();
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r2) {
        iL1ilL1 r22 = (iL1ilL1) r2;
        this.f23047OooO00o = r22.m17607OooO00o();
        this.OooO00o = r22.OooO00o();
        if (this.f23047OooO00o == null) {
            this.f23047OooO00o = IIllii.OooO00o();
        }
    }
}
