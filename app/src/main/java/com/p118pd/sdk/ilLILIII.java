package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import com.p118pd.sdk.C6045i1lIi;
import com.p118pd.sdk.C6422iIi;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.ilLILIII */
public class ilLILIII {
    public static final String OooO00o = C5237III.o00o0OO0.m16387OooO0O0();
    public static final String OooO0O0 = C5237III.o00o0O0O.m16387OooO0O0();
    public static final String OooO0OO = C5237III.o00o000.m16387OooO0O0();
    public static final String OooO0Oo = C5237III.o00o00o.m16387OooO0O0();

    public static CertPath OooO00o(AbstractC9605iL11 r10, C11lILlL r11) throws CertPathValidatorException {
        HashSet<X509Certificate> hashSet = new HashSet();
        if (r10.OooO00o().m17875OooO0O0() != null) {
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setSerialNumber(r10.OooO00o().m17872OooO00o());
            Principal[] OooO0O02 = r10.OooO00o().m17875OooO0O0();
            for (int i = 0; i < OooO0O02.length; i++) {
                try {
                    if (OooO0O02[i] instanceof X500Principal) {
                        x509CertSelector.setIssuer(((X500Principal) OooO0O02[i]).getEncoded());
                    }
                    hashSet.addAll(C6421iIIL1i.OooO00o(new C6422iIi.OooO0O0(x509CertSelector).OooO00o(), r11.OooO0OO()));
                } catch (AnnotatedException e) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e);
                } catch (IOException e2) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e2);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in base certificate ID for attribute certificate cannot be found.");
            }
        }
        if (r10.OooO00o().m17874OooO00o() != null) {
            C6175iLLl r2 = new C6175iLLl();
            Principal[] OooO00o2 = r10.OooO00o().m17874OooO00o();
            for (int i2 = 0; i2 < OooO00o2.length; i2++) {
                try {
                    if (OooO00o2[i2] instanceof X500Principal) {
                        r2.setIssuer(((X500Principal) OooO00o2[i2]).getEncoded());
                    }
                    hashSet.addAll(C6421iIIL1i.OooO00o(new C6422iIi.OooO0O0(r2).OooO00o(), r11.OooO0OO()));
                } catch (AnnotatedException e3) {
                    throw new ExtCertPathValidatorException("Public key certificate for attribute certificate cannot be searched.", e3);
                } catch (IOException e4) {
                    throw new ExtCertPathValidatorException("Unable to encode X500 principal.", e4);
                }
            }
            if (hashSet.isEmpty()) {
                throw new CertPathValidatorException("Public key certificate specified in entity name for attribute certificate cannot be found.");
            }
        }
        C11lILlL.OooO0O0 oooO0O0 = new C11lILlL.OooO0O0(r11);
        ExtCertPathValidatorException extCertPathValidatorException = null;
        CertPathBuilderResult certPathBuilderResult = null;
        for (X509Certificate x509Certificate : hashSet) {
            C6175iLLl r3 = new C6175iLLl();
            r3.setCertificate(x509Certificate);
            oooO0O0.OooO00o(new C6422iIi.OooO0O0(r3).OooO00o());
            try {
                try {
                    certPathBuilderResult = CertPathBuilder.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).build(new C6045i1lIi.OooO0O0(oooO0O0.OooO00o()).OooO00o());
                } catch (CertPathBuilderException e5) {
                    extCertPathValidatorException = new ExtCertPathValidatorException("Certification path for public key certificate of attribute certificate could not be build.", e5);
                } catch (InvalidAlgorithmParameterException e6) {
                    throw new RuntimeException(e6.getMessage());
                }
            } catch (NoSuchProviderException e7) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e7);
            } catch (NoSuchAlgorithmException e8) {
                throw new ExtCertPathValidatorException("Support class could not be created.", e8);
            }
        }
        if (extCertPathValidatorException == null) {
            return certPathBuilderResult.getCertPath();
        }
        throw extCertPathValidatorException;
    }

    public static CertPathValidatorResult OooO00o(CertPath certPath, C11lILlL r4) throws CertPathValidatorException {
        try {
            try {
                return CertPathValidator.getInstance("PKIX", BouncyCastleProvider.PROVIDER_NAME).validate(certPath, r4);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException("Certification path for issuer certificate of attribute certificate could not be validated.", e);
            } catch (InvalidAlgorithmParameterException e2) {
                throw new RuntimeException(e2.getMessage());
            }
        } catch (NoSuchProviderException e3) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new ExtCertPathValidatorException("Support class could not be created.", e4);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17355OooO00o(AbstractC9605iL11 r1, C11lILlL r2) throws CertPathValidatorException {
        try {
            r1.checkValidity(C6421iIIL1i.OooO00o(r2));
        } catch (CertificateExpiredException e) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e);
        } catch (CertificateNotYetValidException e2) {
            throw new ExtCertPathValidatorException("Attribute certificate is not valid.", e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0179  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(com.p118pd.sdk.AbstractC9605iL11 r18, com.p118pd.sdk.C11lILlL r19, java.security.cert.X509Certificate r20, java.util.Date r21, java.util.List r22, com.p118pd.sdk.ii1I11l r23) throws java.security.cert.CertPathValidatorException {
        /*
        // Method dump skipped, instructions count: 429
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.ilLILIII.OooO00o(com.pd.sdk.丨iL1丨1丨, com.pd.sdk.丨11lILlL, java.security.cert.X509Certificate, java.util.Date, java.util.List, com.pd.sdk.ii1I11l):void");
    }

    public static void OooO00o(AbstractC9605iL11 r2, CertPath certPath, CertPath certPath2, C11lILlL r5, Set set) throws CertPathValidatorException {
        Set<String> criticalExtensionOIDs = r2.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs.contains(OooO00o)) {
            try {
                C9761IiiLLI.OooO00o(C6421iIIL1i.OooO00o(r2, OooO00o));
            } catch (AnnotatedException e) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e);
            } catch (IllegalArgumentException e2) {
                throw new ExtCertPathValidatorException("Target information extension could not be read.", e2);
            }
        }
        criticalExtensionOIDs.remove(OooO00o);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((lIi1IL) it.next()).OooO00o(r2, certPath, certPath2, criticalExtensionOIDs);
        }
        if (!criticalExtensionOIDs.isEmpty()) {
            throw new CertPathValidatorException("Attribute certificate contains unsupported critical extensions: " + criticalExtensionOIDs);
        }
    }

    public static void OooO00o(AbstractC9605iL11 r3, Set set, Set set2) throws CertPathValidatorException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (r3.OooO00o(str) != null) {
                throw new CertPathValidatorException("Attribute certificate contains prohibited attribute: " + str + C9058ooOoOoOO.OooOO0);
            }
        }
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (r3.OooO00o(str2) == null) {
                throw new CertPathValidatorException("Attribute certificate does not contain necessary attribute: " + str2 + C9058ooOoOoOO.OooOO0);
            }
        }
    }

    public static void OooO00o(C9621ii1iL r21, AbstractC9605iL11 r22, C11lILlL r23, Date date, X509Certificate x509Certificate, ll11LIi ll11lii, C6468l1L r27, List list, ii1I11l ii1i11l) throws AnnotatedException {
        Iterator it;
        if (r22.getExtensionValue(C9431I.o00o0O0.m16387OooO0O0()) == null) {
            Date date2 = new Date(System.currentTimeMillis());
            if (date.getTime() <= date2.getTime()) {
                Iterator it2 = C6421iIIL1i.OooO00o(r21, r22, date2, r23).iterator();
                AnnotatedException e = null;
                boolean z = false;
                while (it2.hasNext() && ll11lii.OooO00o() == 11 && !r27.m17605OooO00o()) {
                    try {
                        X509CRL x509crl = (X509CRL) it2.next();
                        C6468l1L OooO00o2 = C6396iiLiL.OooO00o(x509crl, r21);
                        if (!OooO00o2.m17606OooO00o(r27)) {
                            continue;
                        } else {
                            it = it2;
                            try {
                                X509CRL OooO00o3 = r23.OooO0o0() ? C6396iiLiL.OooO00o(C6421iIIL1i.OooO00o(date2, x509crl, r23.OooO0OO(), r23.m21241OooO00o()), C6396iiLiL.OooO00o(x509crl, C6396iiLiL.OooO00o(x509crl, r22, (X509Certificate) null, (PublicKey) null, r23, list, ii1i11l))) : null;
                                if (r23.OooO00o() != 1) {
                                    if (r22.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                                        throw new AnnotatedException("No valid CRL for current time found.");
                                    }
                                }
                                C6396iiLiL.OooO00o(r21, r22, x509crl);
                                C6396iiLiL.OooO0O0(r21, r22, x509crl);
                                C6396iiLiL.OooO00o(OooO00o3, x509crl, r23);
                                C6396iiLiL.OooO00o(date, OooO00o3, r22, ll11lii, r23);
                                C6396iiLiL.OooO00o(date, x509crl, r22, ll11lii);
                                if (ll11lii.OooO00o() == 8) {
                                    ll11lii.OooO00o(11);
                                }
                                r27.m17604OooO00o(OooO00o2);
                                it2 = it;
                                z = true;
                            } catch (AnnotatedException e2) {
                                e = e2;
                                it2 = it;
                            }
                        }
                    } catch (AnnotatedException e3) {
                        e = e3;
                        it = it2;
                        it2 = it;
                    }
                }
                if (!z) {
                    throw e;
                }
                return;
            }
            throw new AnnotatedException("Validation time is in future.");
        }
    }

    public static void OooO00o(X509Certificate x509Certificate, C11lILlL r2) throws CertPathValidatorException {
        if (x509Certificate.getKeyUsage() != null && !x509Certificate.getKeyUsage()[0] && !x509Certificate.getKeyUsage()[1]) {
            throw new CertPathValidatorException("Attribute certificate issuer public key cannot be used to validate digital signatures.");
        } else if (x509Certificate.getBasicConstraints() != -1) {
            throw new CertPathValidatorException("Attribute certificate issuer is also a public key certificate issuer.");
        }
    }

    public static void OooO00o(X509Certificate x509Certificate, Set set) throws CertPathValidatorException {
        Iterator it = set.iterator();
        boolean z = false;
        while (it.hasNext()) {
            TrustAnchor trustAnchor = (TrustAnchor) it.next();
            if (x509Certificate.getSubjectX500Principal().getName("RFC2253").equals(trustAnchor.getCAName()) || x509Certificate.equals(trustAnchor.getTrustedCert())) {
                z = true;
            }
        }
        if (!z) {
            throw new CertPathValidatorException("Attribute certificate issuer is not directly trusted.");
        }
    }
}
