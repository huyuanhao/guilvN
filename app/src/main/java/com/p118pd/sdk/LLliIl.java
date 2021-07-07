package com.p118pd.sdk;

import com.p118pd.sdk.C6045i1lIi;
import com.p118pd.sdk.C6422iIi;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Principal;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidator;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateParsingException;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.PKIXCertPathBuilderResult;
import java.security.cert.PKIXCertPathValidatorResult;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.LLliIl */
public class LLliIl extends CertPathBuilderSpi {
    public Exception OooO00o;

    private CertPathBuilderResult OooO00o(AbstractC9605iL11 r6, X509Certificate x509Certificate, C6045i1lIi r8, List list) {
        CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || r8.m16911OooO00o().contains(x509Certificate)) {
            return null;
        }
        if (r8.OooO00o() != -1 && list.size() - 1 > r8.OooO00o()) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
            CertPathValidator instance2 = CertPathValidator.getInstance("RFC3281", BouncyCastleProvider.PROVIDER_NAME);
            try {
                if (C6421iIIL1i.m17536OooO00o(x509Certificate, r8.m16910OooO00o().m21247OooO0O0(), r8.m16910OooO00o().OooO0O0())) {
                    try {
                        CertPath generateCertPath = instance.generateCertPath(list);
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) instance2.validate(generateCertPath, r8);
                            return new PKIXCertPathBuilderResult(generateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e) {
                            throw new AnnotatedException("Certification path could not be validated.", e);
                        }
                    } catch (Exception e2) {
                        throw new AnnotatedException("Certification path could not be constructed from certificate list.", e2);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(r8.m16910OooO00o().OooO0Oo());
                    try {
                        arrayList.addAll(C6421iIIL1i.OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0O.m16387OooO0O0()), r8.m16910OooO00o().m21246OooO0O0()));
                        HashSet hashSet = new HashSet();
                        try {
                            hashSet.addAll(C6421iIIL1i.OooO00o(x509Certificate, r8.m16910OooO00o().OooO0OO(), arrayList));
                            if (!hashSet.isEmpty()) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                                    if (!x509Certificate2.getIssuerX500Principal().equals(x509Certificate2.getSubjectX500Principal())) {
                                        certPathBuilderResult = OooO00o(r6, x509Certificate2, r8, list);
                                    }
                                }
                                if (certPathBuilderResult == null) {
                                    list.remove(x509Certificate);
                                }
                                return certPathBuilderResult;
                            }
                            throw new AnnotatedException("No issuer certificate for certificate in certification path found.");
                        } catch (AnnotatedException e3) {
                            throw new AnnotatedException("Cannot find issuer certificate for certificate in certification path.", e3);
                        }
                    } catch (CertificateParsingException e4) {
                        throw new AnnotatedException("No additional X.509 stores can be added from certificate locations.", e4);
                    }
                }
            } catch (AnnotatedException e5) {
                this.OooO00o = new AnnotatedException("No valid certification path could be build.", e5);
            }
        } catch (Exception unused) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }

    public static Collection OooO00o(C6088iIII r3, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof AbstractC6271iilI) {
                try {
                    hashSet.addAll(((AbstractC6271iilI) obj).OooO00o(r3));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        C6045i1lIi r11;
        boolean z = certPathParameters instanceof PKIXBuilderParameters;
        if (z || (certPathParameters instanceof liIlI1) || (certPathParameters instanceof C6045i1lIi)) {
            List arrayList = new ArrayList();
            if (z) {
                C6045i1lIi.OooO0O0 oooO0O0 = new C6045i1lIi.OooO0O0((PKIXBuilderParameters) certPathParameters);
                if (certPathParameters instanceof L1lLI) {
                    liIlI1 liili1 = (liIlI1) certPathParameters;
                    oooO0O0.OooO00o(liili1.OooO0o0());
                    oooO0O0.OooO00o(liili1.OooO0O0());
                    arrayList = liili1.OooO0O0();
                }
                r11 = oooO0O0.OooO00o();
            } else {
                r11 = (C6045i1lIi) certPathParameters;
            }
            ArrayList arrayList2 = new ArrayList();
            C6422iIi OooO00o2 = r11.m16910OooO00o().m21239OooO00o();
            if (OooO00o2 instanceof C6088iIII) {
                try {
                    Collection OooO00o3 = OooO00o((C6088iIII) OooO00o2, arrayList);
                    if (!OooO00o3.isEmpty()) {
                        CertPathBuilderResult certPathBuilderResult = null;
                        Iterator it = OooO00o3.iterator();
                        while (it.hasNext() && certPathBuilderResult == null) {
                            AbstractC9605iL11 r3 = (AbstractC9605iL11) it.next();
                            C6175iLLl r4 = new C6175iLLl();
                            Principal[] OooO00o4 = r3.m21662OooO00o().m21591OooO00o();
                            HashSet hashSet = new HashSet();
                            for (int i = 0; i < OooO00o4.length; i++) {
                                try {
                                    if (OooO00o4[i] instanceof X500Principal) {
                                        r4.setSubject(((X500Principal) OooO00o4[i]).getEncoded());
                                    }
                                    C6422iIi<? extends Certificate> OooO00o5 = new C6422iIi.OooO0O0(r4).OooO00o();
                                    hashSet.addAll(C6421iIIL1i.OooO00o(OooO00o5, r11.m16910OooO00o().OooO0OO()));
                                    hashSet.addAll(C6421iIIL1i.OooO00o(OooO00o5, r11.m16910OooO00o().OooO0Oo()));
                                } catch (AnnotatedException e) {
                                    throw new ExtCertPathBuilderException("Public key certificate for attribute certificate cannot be searched.", e);
                                } catch (IOException e2) {
                                    throw new ExtCertPathBuilderException("cannot encode X500Principal.", e2);
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                Iterator it2 = hashSet.iterator();
                                while (it2.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = OooO00o(r3, (X509Certificate) it2.next(), r11, arrayList2);
                                }
                            } else {
                                throw new CertPathBuilderException("Public key certificate for attribute certificate cannot be found.");
                            }
                        }
                        if (certPathBuilderResult == null && this.OooO00o != null) {
                            throw new ExtCertPathBuilderException("Possible certificate chain could not be validated.", this.OooO00o);
                        } else if (certPathBuilderResult != null || this.OooO00o != null) {
                            return certPathBuilderResult;
                        } else {
                            throw new CertPathBuilderException("Unable to find certificate chain.");
                        }
                    } else {
                        throw new CertPathBuilderException("No attribute certificate found matching targetContraints.");
                    }
                } catch (AnnotatedException e3) {
                    throw new ExtCertPathBuilderException("Error finding target attribute certificate.", e3);
                }
            } else {
                throw new CertPathBuilderException("TargetConstraints must be an instance of " + C6088iIII.class.getName() + " for " + LLliIl.class.getName() + " class.");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + C6045i1lIi.class.getName() + C9058ooOoOoOO.OooOO0);
        }
    }
}
