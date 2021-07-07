package com.p118pd.sdk;

import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

/* renamed from: com.pd.sdk.L1I */
public class L1I extends C5824L11i {
    public L1I(lI111ll li111ll, AbstractC5650LIL r2) {
        super(li111ll, r2);
    }

    public C5187I1l OooO00o(PrivateKey privateKey) throws CertificateEncodingException, CRMFException {
        return OooO00o(C5464IlilIi.OooO00o(privateKey.getEncoded()));
    }

    public C5187I1l OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException, CRMFException {
        return OooO00o(new JcaX509CertificateHolder(x509Certificate));
    }
}
