package com.p118pd.sdk;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: com.pd.sdk.丨丨i  reason: invalid class name and case insensitive filesystem */
public class C9829i extends AbstractC9517LiIiL {
    public final String OooO00o;

    public C9829i(String str) {
        this.OooO00o = str;
    }

    @Override // com.p118pd.sdk.AbstractC9517LiIiL
    public CertificateFactory OooO00o(String str) throws CertificateException, NoSuchProviderException {
        return CertificateFactory.getInstance(str, this.OooO00o);
    }
}
