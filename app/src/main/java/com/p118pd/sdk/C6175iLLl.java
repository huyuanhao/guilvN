package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;

/* renamed from: com.pd.sdk.iLL丨l丨  reason: invalid class name and case insensitive filesystem */
public class C6175iLLl extends X509CertSelector implements AbstractC6317ilLi {
    public static C6175iLLl OooO00o(X509CertSelector x509CertSelector) {
        if (x509CertSelector != null) {
            C6175iLLl r0 = new C6175iLLl();
            r0.setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
            r0.setBasicConstraints(x509CertSelector.getBasicConstraints());
            r0.setCertificate(x509CertSelector.getCertificate());
            r0.setCertificateValid(x509CertSelector.getCertificateValid());
            r0.setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
            try {
                r0.setPathToNames(x509CertSelector.getPathToNames());
                r0.setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                r0.setNameConstraints(x509CertSelector.getNameConstraints());
                r0.setPolicy(x509CertSelector.getPolicy());
                r0.setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                r0.setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                r0.setIssuer(x509CertSelector.getIssuer());
                r0.setKeyUsage(x509CertSelector.getKeyUsage());
                r0.setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                r0.setSerialNumber(x509CertSelector.getSerialNumber());
                r0.setSubject(x509CertSelector.getSubject());
                r0.setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                r0.setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                return r0;
            } catch (IOException e) {
                throw new IllegalArgumentException("error in passed in selector: " + e);
            }
        } else {
            throw new IllegalArgumentException("cannot create from null selector");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        return super.match((X509Certificate) obj);
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return (C6175iLLl) super.clone();
    }

    public boolean match(Certificate certificate) {
        return OooO00o(certificate);
    }
}
