package com.p118pd.sdk;

import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* renamed from: com.pd.sdk.li11LIL */
public class li11LIL extends AbstractC9517LiIiL {
    public final Provider OooO00o;

    public li11LIL(Provider provider) {
        this.OooO00o = provider;
    }

    @Override // com.p118pd.sdk.AbstractC9517LiIiL
    public CertificateFactory OooO00o(String str) throws CertificateException {
        return CertificateFactory.getInstance(str, this.OooO00o);
    }
}
