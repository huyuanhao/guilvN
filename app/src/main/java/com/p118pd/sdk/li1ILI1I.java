package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.pd.sdk.li1ILI1I */
public class li1ILI1I extends C5750Li1 {
    public li1ILI1I(X509Certificate x509Certificate) {
        this(x509Certificate.getIssuerX500Principal(), x509Certificate.getSerialNumber());
    }

    public li1ILI1I(X500Principal x500Principal, BigInteger bigInteger) {
        super(l1LILI1.OooO00o(x500Principal.getEncoded()), bigInteger);
    }
}
