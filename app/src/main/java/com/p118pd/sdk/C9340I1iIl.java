package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import java.security.InvalidAlgorithmParameterException;
import java.security.PublicKey;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;

/* renamed from: com.pd.sdk.丨I1iIl  reason: invalid class name and case insensitive filesystem */
public class C9340I1iIl extends CertPathValidatorSpi {
    public final ii1I11l OooO00o = new C6640li1lI();

    public static void OooO00o(X509Certificate x509Certificate) throws AnnotatedException {
        try {
            C5314ILlLL.OooO00o(x509Certificate.getTBSCertificate());
        } catch (CertificateEncodingException e) {
            throw new AnnotatedException("unable to process TBSCertificate", e);
        } catch (IllegalArgumentException e2) {
            throw new AnnotatedException(e2.getMessage());
        }
    }

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        C11lILlL r0;
        List<? extends Certificate> list;
        AnnotatedException e;
        PublicKey publicKey;
        l1LILI1 r19;
        HashSet hashSet;
        C5244II1 r8;
        ArrayList[] arrayListArr;
        HashSet hashSet2;
        CertPathValidatorException e2;
        C9340I1iIl r1 = this;
        if (certPathParameters instanceof PKIXParameters) {
            C11lILlL.OooO0O0 oooO0O0 = new C11lILlL.OooO0O0((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof L1lLI) {
                L1lLI l1lLI = (L1lLI) certPathParameters;
                oooO0O0.OooO00o(l1lLI.m15989OooO0O0());
                oooO0O0.OooO00o(l1lLI.OooO00o());
            }
            r0 = oooO0O0.OooO00o();
        } else if (certPathParameters instanceof C6045i1lIi) {
            r0 = ((C6045i1lIi) certPathParameters).m16910OooO00o();
        } else if (certPathParameters instanceof C11lILlL) {
            r0 = (C11lILlL) certPathParameters;
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + PKIXParameters.class.getName() + " instance.");
        }
        if (r0.m21247OooO0O0() != null) {
            List<? extends Certificate> certificates = certPath.getCertificates();
            int size = certificates.size();
            if (!certificates.isEmpty()) {
                Set OooO00o2 = r0.m21243OooO00o();
                try {
                    TrustAnchor OooO00o3 = C6421iIIL1i.OooO00o((X509Certificate) certificates.get(certificates.size() - 1), r0.m21247OooO0O0(), r0.OooO0O0());
                    if (OooO00o3 != null) {
                        OooO00o(OooO00o3.getTrustedCert());
                        C11lILlL OooO00o4 = new C11lILlL.OooO0O0(r0).OooO00o(OooO00o3).OooO00o();
                        int i = size + 1;
                        ArrayList[] arrayListArr2 = new ArrayList[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            arrayListArr2[i2] = new ArrayList();
                        }
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add("2.5.29.32.0");
                        C9511Lil r5 = new C9511Lil(new ArrayList(), 0, hashSet3, null, new HashSet(), "2.5.29.32.0", false);
                        arrayListArr2[0].add(r5);
                        C5244II1 r6 = new C5244II1();
                        HashSet hashSet4 = new HashSet();
                        int i3 = OooO00o4.m21248OooO0O0() ? 0 : i;
                        int i4 = OooO00o4.m21244OooO00o() ? 0 : i;
                        if (OooO00o4.m21249OooO0OO()) {
                            i = 0;
                        }
                        X509Certificate trustedCert = OooO00o3.getTrustedCert();
                        if (trustedCert != null) {
                            try {
                                r19 = LLl11i.OooO0O0(trustedCert);
                                publicKey = trustedCert.getPublicKey();
                            } catch (IllegalArgumentException e3) {
                                throw new ExtCertPathValidatorException("Subject of trust anchor could not be (re)encoded.", e3, certPath, -1);
                            }
                        } else {
                            r19 = LLl11i.OooO00o(OooO00o3);
                            publicKey = OooO00o3.getCAPublicKey();
                        }
                        try {
                            C6456l1ilL OooO00o5 = C6421iIIL1i.OooO00o(publicKey);
                            OooO00o5.OooO00o();
                            OooO00o5.m17587OooO0O0();
                            if (OooO00o4.m21239OooO00o() == null || OooO00o4.m21239OooO00o().OooO00o((X509Certificate) certificates.get(0))) {
                                List<PKIXCertPathChecker> OooO0O0 = OooO00o4.m21245OooO0O0();
                                for (PKIXCertPathChecker pKIXCertPathChecker : OooO0O0) {
                                    pKIXCertPathChecker.init(false);
                                }
                                int i5 = size;
                                X509Certificate x509Certificate = null;
                                int i6 = i;
                                int i7 = i4;
                                C9511Lil r17 = r5;
                                int size2 = certificates.size() - 1;
                                int i8 = i3;
                                while (size2 >= 0) {
                                    int i9 = size - size2;
                                    X509Certificate x509Certificate2 = (X509Certificate) certificates.get(size2);
                                    boolean z = size2 == certificates.size() + -1;
                                    try {
                                        OooO00o(x509Certificate2);
                                        int i10 = i6;
                                        C6396iiLiL.OooO00o(certPath, OooO00o4, size2, publicKey, z, r19, trustedCert, r1.OooO00o);
                                        C6396iiLiL.OooO0O0(certPath, size2, r6);
                                        C9511Lil OooO00o6 = C6396iiLiL.OooO00o(certPath, size2, C6396iiLiL.OooO00o(certPath, size2, hashSet4, r17, arrayListArr2, i7));
                                        C6396iiLiL.OooO00o(certPath, size2, OooO00o6, i8);
                                        if (i9 != size) {
                                            if (x509Certificate2 == null || x509Certificate2.getVersion() != 1) {
                                                C6396iiLiL.OooO00o(certPath, size2);
                                                arrayListArr = arrayListArr2;
                                                C9511Lil OooO00o7 = C6396iiLiL.OooO00o(certPath, size2, arrayListArr, OooO00o6, i10);
                                                C6396iiLiL.OooO00o(certPath, size2, r6);
                                                int OooO00o8 = C6396iiLiL.OooO00o(certPath, size2, i8);
                                                int OooO0O02 = C6396iiLiL.OooO0O0(certPath, size2, i10);
                                                int OooO0OO = C6396iiLiL.OooO0OO(certPath, size2, i7);
                                                i8 = C6396iiLiL.OooO0Oo(certPath, size2, OooO00o8);
                                                i10 = C6396iiLiL.OooO0o0(certPath, size2, OooO0O02);
                                                int OooO0o = C6396iiLiL.OooO0o(certPath, size2, OooO0OO);
                                                C6396iiLiL.OooO0O0(certPath, size2);
                                                i5 = C6396iiLiL.OooO0oo(certPath, size2, C6396iiLiL.OooO0oO(certPath, size2, i5));
                                                C6396iiLiL.OooO0OO(certPath, size2);
                                                if (x509Certificate2.getCriticalExtensionOIDs() != null) {
                                                    hashSet2.remove(C6396iiLiL.OooOOO0);
                                                    hashSet2.remove(C6396iiLiL.f18205OooO00o);
                                                    hashSet2.remove(C6396iiLiL.f18207OooO0O0);
                                                    hashSet2.remove(C6396iiLiL.OooO0OO);
                                                    hashSet2.remove(C6396iiLiL.OooO0Oo);
                                                    hashSet2.remove(C6396iiLiL.OooO0o);
                                                    hashSet2.remove(C6396iiLiL.OooO0oO);
                                                    hashSet2.remove(C6396iiLiL.OooO0oo);
                                                    hashSet2.remove(C6396iiLiL.OooOO0);
                                                    hashSet2.remove(C6396iiLiL.OooOO0O);
                                                } else {
                                                    hashSet2 = new HashSet();
                                                }
                                                C6396iiLiL.OooO00o(certPath, size2, hashSet2, OooO0O0);
                                                l1LILI1 OooO0O03 = LLl11i.OooO0O0(x509Certificate2);
                                                try {
                                                    r8 = r6;
                                                    r1 = this;
                                                    try {
                                                        PublicKey OooO00o9 = C6421iIIL1i.OooO00o(certPath.getCertificates(), size2, r1.OooO00o);
                                                        C6456l1ilL OooO00o10 = C6421iIIL1i.OooO00o(OooO00o9);
                                                        OooO00o10.OooO00o();
                                                        OooO00o10.m17587OooO0O0();
                                                        r17 = OooO00o7;
                                                        i7 = OooO0o;
                                                        r19 = OooO0O03;
                                                        publicKey = OooO00o9;
                                                        trustedCert = x509Certificate2;
                                                        i6 = i10;
                                                        size2--;
                                                        x509Certificate = x509Certificate2;
                                                        OooO00o2 = OooO00o2;
                                                        certificates = certificates;
                                                        OooO00o4 = OooO00o4;
                                                        OooO00o3 = OooO00o3;
                                                        arrayListArr2 = arrayListArr;
                                                        r6 = r8;
                                                    } catch (CertPathValidatorException e4) {
                                                        e2 = e4;
                                                        throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, size2);
                                                    }
                                                } catch (CertPathValidatorException e5) {
                                                    e2 = e5;
                                                    throw new CertPathValidatorException("Next working key could not be retrieved.", e2, certPath, size2);
                                                }
                                            } else if (i9 != 1 || !x509Certificate2.equals(OooO00o3.getTrustedCert())) {
                                                throw new CertPathValidatorException("Version 1 certificates can't be used as CA ones.", null, certPath, size2);
                                            }
                                        }
                                        r8 = r6;
                                        arrayListArr = arrayListArr2;
                                        r1 = this;
                                        r17 = OooO00o6;
                                        i7 = i7;
                                        i5 = i5;
                                        i8 = i8;
                                        i6 = i10;
                                        size2--;
                                        x509Certificate = x509Certificate2;
                                        OooO00o2 = OooO00o2;
                                        certificates = certificates;
                                        OooO00o4 = OooO00o4;
                                        OooO00o3 = OooO00o3;
                                        arrayListArr2 = arrayListArr;
                                        r6 = r8;
                                    } catch (AnnotatedException e6) {
                                        throw new CertPathValidatorException(e6.getMessage(), e6.getUnderlyingException(), certPath, size2);
                                    }
                                }
                                int i11 = size2 + 1;
                                int OooO = C6396iiLiL.OooO(certPath, i11, C6396iiLiL.OooO00o(i8, x509Certificate));
                                if (x509Certificate.getCriticalExtensionOIDs() != null) {
                                    hashSet.remove(C6396iiLiL.OooOOO0);
                                    hashSet.remove(C6396iiLiL.f18205OooO00o);
                                    hashSet.remove(C6396iiLiL.f18207OooO0O0);
                                    hashSet.remove(C6396iiLiL.OooO0OO);
                                    hashSet.remove(C6396iiLiL.OooO0Oo);
                                    hashSet.remove(C6396iiLiL.OooO0o);
                                    hashSet.remove(C6396iiLiL.OooO0oO);
                                    hashSet.remove(C6396iiLiL.OooO0oo);
                                    hashSet.remove(C6396iiLiL.OooOO0);
                                    hashSet.remove(C6396iiLiL.OooOO0O);
                                    hashSet.remove(C6396iiLiL.OooO);
                                    hashSet.remove(C5237III.o00o00O0.m16387OooO0O0());
                                } else {
                                    hashSet = new HashSet();
                                }
                                C6396iiLiL.OooO00o(certPath, i11, OooO0O0, hashSet);
                                C9511Lil OooO00o11 = C6396iiLiL.OooO00o(certPath, OooO00o4, OooO00o2, i11, arrayListArr2, r17, hashSet4);
                                if (OooO > 0 || OooO00o11 != null) {
                                    return new PKIXCertPathValidatorResult(OooO00o3, OooO00o11, x509Certificate.getPublicKey());
                                }
                                throw new CertPathValidatorException("Path processing failed on policy.", null, certPath, size2);
                            }
                            throw new ExtCertPathValidatorException("Target certificate in certification path does not match targetConstraints.", null, certPath, 0);
                        } catch (CertPathValidatorException e7) {
                            throw new ExtCertPathValidatorException("Algorithm identifier of public key of trust anchor could not be read.", e7, certPath, -1);
                        }
                    } else {
                        list = certificates;
                        try {
                            throw new CertPathValidatorException("Trust anchor for certification path not found.", null, certPath, -1);
                        } catch (AnnotatedException e8) {
                            e = e8;
                            throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                        }
                    }
                } catch (AnnotatedException e9) {
                    e = e9;
                    list = certificates;
                    throw new CertPathValidatorException(e.getMessage(), e.getUnderlyingException(), certPath, list.size() - 1);
                }
            } else {
                throw new CertPathValidatorException("Certification path is empty.", null, certPath, -1);
            }
        } else {
            throw new InvalidAlgorithmParameterException("trustAnchors is null, this is not allowed for certification path validation.");
        }
    }
}
