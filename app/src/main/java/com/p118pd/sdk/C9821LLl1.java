package com.p118pd.sdk;

import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;

/* renamed from: com.pd.sdk.丨丨LL丨l1  reason: invalid class name and case insensitive filesystem */
public class C9821LLl1 implements iiLiIlL {
    public final Provider OooO00o;

    public C9821LLl1(Provider provider) {
        this.OooO00o = provider;
    }

    @Override // com.p118pd.sdk.iiLiIlL
    public KeyFactory OooO00o(String str) throws NoSuchAlgorithmException {
        return KeyFactory.getInstance(str, this.OooO00o);
    }
}
