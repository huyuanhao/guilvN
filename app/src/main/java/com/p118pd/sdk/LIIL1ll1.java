package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;

/* renamed from: com.pd.sdk.LIIL1ll1 */
public class LIIL1ll1 extends CertPathValidatorSpi {
    public final ii1I11l OooO00o = new C6640li1lI();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        C11lILlL r13;
        boolean z = certPathParameters instanceof L1lLI;
        if (z || (certPathParameters instanceof C11lILlL)) {
            Set hashSet = new HashSet();
            Set hashSet2 = new HashSet();
            Set hashSet3 = new HashSet();
            HashSet hashSet4 = new HashSet();
            if (certPathParameters instanceof PKIXParameters) {
                C11lILlL.OooO0O0 oooO0O0 = new C11lILlL.OooO0O0((PKIXParameters) certPathParameters);
                if (z) {
                    L1lLI l1lLI = (L1lLI) certPathParameters;
                    oooO0O0.OooO00o(l1lLI.m15989OooO0O0());
                    oooO0O0.OooO00o(l1lLI.OooO00o());
                    hashSet = l1lLI.m15985OooO00o();
                    hashSet2 = l1lLI.OooO0OO();
                    hashSet3 = l1lLI.m15988OooO0O0();
                }
                r13 = oooO0O0.OooO00o();
            } else {
                r13 = (C11lILlL) certPathParameters;
            }
            C6422iIi OooO00o2 = r13.m21239OooO00o();
            if (OooO00o2 instanceof C6088iIII) {
                AbstractC9605iL11 OooO00o3 = ((C6088iIII) OooO00o2).m16945OooO00o();
                CertPath OooO00o4 = ilLILIII.OooO00o(OooO00o3, r13);
                CertPathValidatorResult OooO00o5 = ilLILIII.OooO00o(certPath, r13);
                X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(0);
                ilLILIII.OooO00o(x509Certificate, r13);
                ilLILIII.OooO00o(x509Certificate, hashSet4);
                ilLILIII.m17355OooO00o(OooO00o3, r13);
                ilLILIII.OooO00o(OooO00o3, certPath, OooO00o4, r13, hashSet);
                ilLILIII.OooO00o(OooO00o3, hashSet2, hashSet3);
                try {
                    ilLILIII.OooO00o(OooO00o3, r13, x509Certificate, C6421iIIL1i.OooO00o(r13, (CertPath) null, -1), certPath.getCertificates(), this.OooO00o);
                    return OooO00o5;
                } catch (AnnotatedException e) {
                    throw new ExtCertPathValidatorException("Could not get validity date from attribute certificate.", e);
                }
            } else {
                throw new InvalidAlgorithmParameterException("TargetConstraints must be an instance of " + C6088iIII.class.getName() + " for " + LIIL1ll1.class.getName() + " class.");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Parameters must be a " + L1lLI.class.getName() + " instance.");
        }
    }
}
