package org.bouncycastle.cert.jcajce;

import com.p118pd.sdk.LilIiIl;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;

public class JcaX509CertificateHolder extends X509CertificateHolder {
    public JcaX509CertificateHolder(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(LilIiIl.OooO00o(x509Certificate.getEncoded()));
    }
}
