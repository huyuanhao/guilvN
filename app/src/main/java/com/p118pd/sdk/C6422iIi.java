package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.X509CertSelector;
import java.util.Collection;

/* renamed from: com.pd.sdk.i丨丨Ii  reason: invalid class name and case insensitive filesystem */
public class C6422iIi<T extends Certificate> implements AbstractC6317ilLi<T> {
    public final CertSelector OooO00o;

    /* renamed from: com.pd.sdk.i丨丨Ii$OooO0O0 */
    public static class OooO0O0 {
        public final CertSelector OooO00o;

        public OooO0O0(CertSelector certSelector) {
            this.OooO00o = (CertSelector) certSelector.clone();
        }

        public C6422iIi<? extends Certificate> OooO00o() {
            return new C6422iIi<>(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.i丨丨Ii$OooO0OO */
    public static class OooO0OO extends X509CertSelector {
        public final C6422iIi OooO00o;

        public OooO0OO(C6422iIi r4) {
            this.OooO00o = r4;
            if (r4.OooO00o instanceof X509CertSelector) {
                X509CertSelector x509CertSelector = (X509CertSelector) r4.OooO00o;
                setAuthorityKeyIdentifier(x509CertSelector.getAuthorityKeyIdentifier());
                setBasicConstraints(x509CertSelector.getBasicConstraints());
                setCertificate(x509CertSelector.getCertificate());
                setCertificateValid(x509CertSelector.getCertificateValid());
                setKeyUsage(x509CertSelector.getKeyUsage());
                setMatchAllSubjectAltNames(x509CertSelector.getMatchAllSubjectAltNames());
                setPrivateKeyValid(x509CertSelector.getPrivateKeyValid());
                setSerialNumber(x509CertSelector.getSerialNumber());
                setSubjectKeyIdentifier(x509CertSelector.getSubjectKeyIdentifier());
                setSubjectPublicKey(x509CertSelector.getSubjectPublicKey());
                try {
                    setExtendedKeyUsage(x509CertSelector.getExtendedKeyUsage());
                    setIssuer(x509CertSelector.getIssuerAsBytes());
                    setNameConstraints(x509CertSelector.getNameConstraints());
                    setPathToNames(x509CertSelector.getPathToNames());
                    setPolicy(x509CertSelector.getPolicy());
                    setSubject(x509CertSelector.getSubjectAsBytes());
                    setSubjectAlternativeNames(x509CertSelector.getSubjectAlternativeNames());
                    setSubjectPublicKeyAlgID(x509CertSelector.getSubjectPublicKeyAlgID());
                } catch (IOException e) {
                    throw new IllegalStateException("base selector invalid: " + e.getMessage(), e);
                }
            }
        }

        public boolean match(Certificate certificate) {
            C6422iIi r0 = this.OooO00o;
            return r0 == null ? certificate != null : r0.OooO00o(certificate);
        }
    }

    public C6422iIi(CertSelector certSelector) {
        this.OooO00o = certSelector;
    }

    public static Collection<? extends Certificate> OooO00o(C6422iIi r1, CertStore certStore) throws CertStoreException {
        return certStore.getCertificates(new OooO0OO(r1));
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return new C6422iIi(this.OooO00o);
    }

    /* renamed from: match */
    public boolean OooO00o(Certificate certificate) {
        return this.OooO00o.match(certificate);
    }
}
