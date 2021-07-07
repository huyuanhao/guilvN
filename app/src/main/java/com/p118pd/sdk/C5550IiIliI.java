package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.I丨i丨IliI  reason: invalid class name and case insensitive filesystem */
public class C5550IiIliI extends C6470l1i {
    public C5312ILl OooO00o;

    public C5550IiIliI(SecureRandom secureRandom, C5312ILl iLl) {
        super(secureRandom, OooO00o(iLl));
        this.OooO00o = iLl;
    }

    public static int OooO00o(C5312ILl iLl) {
        return iLl.OooO00o() != 0 ? iLl.OooO00o() : iLl.OooO0O0().bitLength();
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public C5312ILl OooO00o() {
        return this.OooO00o;
    }
}
