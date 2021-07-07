package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.IL丨IIi1  reason: invalid class name */
public class ILIIi1 extends C6470l1i {
    public L1llLl1 OooO00o;

    public ILIIi1(SecureRandom secureRandom, L1llLl1 l1llLl1) {
        super(secureRandom, l1llLl1.OooO0O0().bitLength() - 1);
        this.OooO00o = l1llLl1;
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public L1llLl1 OooO00o() {
        return this.OooO00o;
    }
}
