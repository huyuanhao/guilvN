package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨I1丨lIl丨  reason: invalid class name and case insensitive filesystem */
public class C9345I1lIl extends C6470l1i {
    public L11I OooO00o;

    public C9345I1lIl(SecureRandom secureRandom, L11I l11i) {
        super(secureRandom, OooO00o(l11i));
        this.OooO00o = l11i;
    }

    public static int OooO00o(L11I l11i) {
        return l11i.OooO0OO().bitLength();
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public L11I OooO00o() {
        return this.OooO00o;
    }
}
