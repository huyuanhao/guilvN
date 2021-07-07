package com.p118pd.sdk;

import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: com.pd.sdk.丨Li丨IiL  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9517LiIiL {
    public abstract CertificateFactory OooO00o(String str) throws CertificateException, NoSuchProviderException;

    public CertificateFactory OooO0O0(String str) throws NoSuchProviderException, CertificateException {
        return OooO00o(str);
    }
}
