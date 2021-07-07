package org.bouncycastle.cert.jcajce;

import com.p118pd.sdk.C5190I1lIiL;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import org.bouncycastle.cert.X509CRLHolder;

public class JcaX509CRLHolder extends X509CRLHolder {
    public JcaX509CRLHolder(X509CRL x509crl) throws CRLException {
        super(C5190I1lIiL.OooO00o(x509crl.getEncoded()));
    }
}
