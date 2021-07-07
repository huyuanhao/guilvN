package com.p118pd.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;

/* renamed from: com.pd.sdk.I丨丨lili  reason: invalid class name and case insensitive filesystem */
public class C5572Ilili extends AbstractC6617lLlIII {
    public final Provider OooO00o;

    public C5572Ilili(Provider provider) {
        this.OooO00o = provider;
    }

    @Override // com.p118pd.sdk.AbstractC6617lLlIII
    public Signature OooO00o(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str, this.OooO00o);
    }
}
