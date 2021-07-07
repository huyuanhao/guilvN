package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import com.p118pd.sdk.C6045i1lIi;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
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
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.exception.ExtCertPathBuilderException;
import org.bouncycastle.jce.provider.AnnotatedException;

/* renamed from: com.pd.sdk.iLIli  reason: case insensitive filesystem */
public class C6164iLIli extends CertPathBuilderSpi {
    public Exception OooO00o;

    public CertPathBuilderResult OooO00o(X509Certificate x509Certificate, C6045i1lIi r7, List list) {
        CertPathBuilderResult certPathBuilderResult = null;
        if (list.contains(x509Certificate) || r7.m16911OooO00o().contains(x509Certificate)) {
            return null;
        }
        if (r7.OooO00o() != -1 && list.size() - 1 > r7.OooO00o()) {
            return null;
        }
        list.add(x509Certificate);
        try {
            CertificateFactory certificateFactory = new CertificateFactory();
            C9340I1iIl r2 = new C9340I1iIl();
            try {
                if (C6421iIIL1i.m17536OooO00o(x509Certificate, r7.m16910OooO00o().m21247OooO0O0(), r7.m16910OooO00o().OooO0O0())) {
                    try {
                        CertPath engineGenerateCertPath = certificateFactory.engineGenerateCertPath(list);
                        try {
                            PKIXCertPathValidatorResult pKIXCertPathValidatorResult = (PKIXCertPathValidatorResult) r2.engineValidate(engineGenerateCertPath, r7);
                            return new PKIXCertPathBuilderResult(engineGenerateCertPath, pKIXCertPathValidatorResult.getTrustAnchor(), pKIXCertPathValidatorResult.getPolicyTree(), pKIXCertPathValidatorResult.getPublicKey());
                        } catch (Exception e) {
                            throw new AnnotatedException("Certification path could not be validated.", e);
                        }
                    } catch (Exception e2) {
                        throw new AnnotatedException("Certification path could not be constructed from certificate list.", e2);
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(r7.m16910OooO00o().OooO0Oo());
                    try {
                        arrayList.addAll(C6421iIIL1i.OooO00o(x509Certificate.getExtensionValue(C5237III.o00Ooo0O.m16387OooO0O0()), r7.m16910OooO00o().m21246OooO0O0()));
                        HashSet hashSet = new HashSet();
                        try {
                            hashSet.addAll(C6421iIIL1i.OooO00o(x509Certificate, r7.m16910OooO00o().OooO0OO(), arrayList));
                            if (!hashSet.isEmpty()) {
                                Iterator it = hashSet.iterator();
                                while (it.hasNext() && certPathBuilderResult == null) {
                                    certPathBuilderResult = OooO00o((X509Certificate) it.next(), r7, list);
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
                this.OooO00o = e5;
            }
        } catch (Exception unused) {
            throw new RuntimeException("Exception creating support classes.");
        }
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        C6045i1lIi r5;
        Exception exc;
        C6045i1lIi.OooO0O0 oooO0O0;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            C11lILlL.OooO0O0 oooO0O02 = new C11lILlL.OooO0O0(pKIXBuilderParameters);
            if (certPathParameters instanceof L1lLI) {
                liIlI1 liili1 = (liIlI1) certPathParameters;
                for (AbstractC9687lLi r2 : liili1.m15984OooO00o()) {
                    oooO0O02.OooO00o(r2);
                }
                oooO0O0 = new C6045i1lIi.OooO0O0(oooO0O02.OooO00o());
                oooO0O0.OooO00o(liili1.OooO0o0());
                oooO0O0.OooO00o(liili1.OooO0O0());
            } else {
                oooO0O0 = new C6045i1lIi.OooO0O0(pKIXBuilderParameters);
            }
            r5 = oooO0O0.OooO00o();
        } else if (certPathParameters instanceof C6045i1lIi) {
            r5 = (C6045i1lIi) certPathParameters;
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be an instance of " + PKIXBuilderParameters.class.getName() + " or " + C6045i1lIi.class.getName() + C9058ooOoOoOO.OooOO0);
        }
        ArrayList arrayList = new ArrayList();
        C6422iIi OooO00o2 = r5.m16910OooO00o().m21239OooO00o();
        try {
            Collection OooO00o3 = C6421iIIL1i.OooO00o(OooO00o2, r5.m16910OooO00o().OooO0Oo());
            OooO00o3.addAll(C6421iIIL1i.OooO00o(OooO00o2, r5.m16910OooO00o().OooO0OO()));
            if (!OooO00o3.isEmpty()) {
                CertPathBuilderResult certPathBuilderResult = null;
                Iterator it = OooO00o3.iterator();
                while (it.hasNext() && certPathBuilderResult == null) {
                    certPathBuilderResult = OooO00o((X509Certificate) it.next(), r5, arrayList);
                }
                if (certPathBuilderResult != null || (exc = this.OooO00o) == null) {
                    if (!(certPathBuilderResult == null && this.OooO00o == null)) {
                        return certPathBuilderResult;
                    }
                    throw new CertPathBuilderException("Unable to find certificate chain.");
                } else if (exc instanceof AnnotatedException) {
                    throw new CertPathBuilderException(this.OooO00o.getMessage(), this.OooO00o.getCause());
                } else {
                    throw new CertPathBuilderException("Possible certificate chain could not be validated.", this.OooO00o);
                }
            } else {
                throw new CertPathBuilderException("No certificate found matching targetContraints.");
            }
        } catch (AnnotatedException e) {
            throw new ExtCertPathBuilderException("Error finding target certificate.", e);
        }
    }
}
