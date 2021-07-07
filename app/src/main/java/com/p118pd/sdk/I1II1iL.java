package com.p118pd.sdk;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/* renamed from: com.pd.sdk.I1II1iL丨  reason: invalid class name */
public class I1II1iL implements iiLiIlL {
    public final String OooO00o;

    public I1II1iL(String str) {
        this.OooO00o = str;
    }

    @Override // com.p118pd.sdk.iiLiIlL
    public KeyFactory OooO00o(String str) throws NoSuchProviderException, NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.OooO00o);
    }
}
