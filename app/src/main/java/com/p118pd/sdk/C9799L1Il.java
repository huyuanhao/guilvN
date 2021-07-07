package com.p118pd.sdk;

import java.security.Key;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.丨丨L1I丨l  reason: invalid class name and case insensitive filesystem */
public class C9799L1Il {
    public static Key OooO00o(LIiI11 r2) {
        if (r2.m16085OooO00o() instanceof Key) {
            return (Key) r2.m16085OooO00o();
        }
        if (r2.m16085OooO00o() instanceof byte[]) {
            return new SecretKeySpec((byte[]) r2.m16085OooO00o(), "ENC");
        }
        throw new IllegalArgumentException("unknown generic key type");
    }
}
