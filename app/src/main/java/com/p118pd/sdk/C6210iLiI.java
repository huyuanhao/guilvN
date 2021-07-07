package com.p118pd.sdk;

import java.security.Key;

/* renamed from: com.pd.sdk.iL丨iI  reason: invalid class name and case insensitive filesystem */
public class C6210iLiI {
    public static byte[] OooO00o(LIiI11 r1) {
        if (r1.m16085OooO00o() instanceof Key) {
            return ((Key) r1.m16085OooO00o()).getEncoded();
        }
        if (r1.m16085OooO00o() instanceof byte[]) {
            return (byte[]) r1.m16085OooO00o();
        }
        throw new IllegalArgumentException("unknown generic key type");
    }
}
