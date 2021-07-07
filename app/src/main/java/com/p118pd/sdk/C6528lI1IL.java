package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.lI丨1IL  reason: invalid class name and case insensitive filesystem */
public class C6528lI1IL extends C6470l1i {
    public C6017i1Il OooO00o;

    public C6528lI1IL(SecureRandom secureRandom, C6017i1Il i1il) {
        super(secureRandom, OooO00o(i1il));
        this.OooO00o = i1il;
    }

    public static int OooO00o(C6017i1Il i1il) {
        return i1il.OooO00o() != 0 ? i1il.OooO00o() : i1il.OooO0OO().bitLength();
    }

    @Override // com.p118pd.sdk.C6470l1i, com.p118pd.sdk.C6470l1i
    public C6017i1Il OooO00o() {
        return this.OooO00o;
    }
}
