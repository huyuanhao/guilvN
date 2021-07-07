package com.p118pd.sdk;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

/* renamed from: com.pd.sdk.I丨丨  reason: invalid class name */
public class I extends AbstractC6617lLlIII {
    public final String OooO00o;

    public I(String str) {
        this.OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC6617lLlIII
    public Signature OooO00o(String str) throws NoSuchProviderException, NoSuchAlgorithmException {
        return Signature.getInstance(str, this.OooO00o);
    }
}
