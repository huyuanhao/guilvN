package com.p118pd.sdk;

import java.security.Key;

/* renamed from: com.pd.sdk.丨1ILi丨  reason: invalid class name and case insensitive filesystem */
public class C92991ILi extends LIiI11 {
    public C92991ILi(C6456l1ilL r1, Key key) {
        super(r1, OooO00o(key));
    }

    public static Object OooO00o(Key key) {
        byte[] encoded = key.getEncoded();
        return encoded != null ? encoded : key;
    }
}
