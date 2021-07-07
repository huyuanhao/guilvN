package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.LlL1ii */
public class LlL1ii extends AbstractC6288iiliIi {
    public LlL1ii(X509CertificateHolder x509CertificateHolder) throws IOException {
        super(x509CertificateHolder, new LIiLlll(x509CertificateHolder.getSubjectPublicKeyInfo().m18042OooO0O0(), x509CertificateHolder.getSubjectPublicKeyInfo()));
    }

    public LlL1ii(byte[] bArr, C6456l1ilL r3, C6213iL11I r4) {
        super(bArr, new LIiLlll(r3, r4));
    }
}
