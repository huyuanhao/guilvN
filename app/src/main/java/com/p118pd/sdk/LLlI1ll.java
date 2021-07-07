package com.p118pd.sdk;

import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.LLlI1丨ll  reason: invalid class name */
public class LLlI1ll extends AbstractC6285iiLli {
    public LLlI1ll(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(new IIllLll1(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new C6530lI1(x509Certificate));
    }

    public LLlI1ll(X509Certificate x509Certificate, C6456l1ilL r4) throws CertificateEncodingException {
        super(new IIllLll1(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new C6530lI1(r4, x509Certificate.getPublicKey()));
    }

    public LLlI1ll(byte[] bArr, C6456l1ilL r3, PublicKey publicKey) {
        super(bArr, new C6530lI1(r3, publicKey));
    }

    public LLlI1ll(byte[] bArr, PublicKey publicKey) {
        super(bArr, new C6530lI1(publicKey));
    }

    public LLlI1ll OooO00o(LlLI1 llLI1, String str) {
        ((C6530lI1) ((AbstractC6285iiLli) this).f17963OooO00o).OooO00o(llLI1, str);
        return this;
    }

    public LLlI1ll OooO00o(String str) {
        ((C6530lI1) ((AbstractC6285iiLli) this).f17963OooO00o).m17653OooO00o(str);
        return this;
    }

    public LLlI1ll OooO00o(Provider provider) {
        ((C6530lI1) ((AbstractC6285iiLli) this).f17963OooO00o).OooO00o(provider);
        return this;
    }
}
