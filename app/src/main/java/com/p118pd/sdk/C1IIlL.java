package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;

/* renamed from: com.pd.sdk.丨1IIlL丨  reason: invalid class name */
public class C1IIlL {
    public static C6790lll1I11 OooO00o(X509CRL x509crl) throws CRLException {
        try {
            return new C6790lll1I11(C929811Li1.OooO00o(C6782lli11.OooO00o(AbstractC6122iIlLiL.OooO00o(x509crl.getTBSCertList())).m17902OooO00o()));
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public static C6790lll1I11 OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new C6790lll1I11(C929811Li1.OooO00o(LIlil1.OooO00o(AbstractC6122iIlLiL.OooO00o(x509Certificate.getTBSCertificate())).m16152OooO00o()));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public static C6790lll1I11 OooO0O0(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new C6790lll1I11(C929811Li1.OooO00o(LIlil1.OooO00o(AbstractC6122iIlLiL.OooO00o(x509Certificate.getTBSCertificate())).m16160OooO0O0()));
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }
}
