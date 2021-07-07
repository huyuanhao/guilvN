package org.bouncycastle.cert.jcajce;

import com.p118pd.sdk.AbstractC9517LiIiL;
import com.p118pd.sdk.C9829i;
import com.p118pd.sdk.Li1IL;
import com.p118pd.sdk.li11LIL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CertificateException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.X509CertificateHolder;

public class JcaX509CertificateConverter {
    public AbstractC9517LiIiL OooO00o;

    public class ExCertificateException extends CertificateException {
        public Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public class ExCertificateParsingException extends CertificateParsingException {
        public Throwable cause;

        public ExCertificateParsingException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CertificateConverter() {
        this.OooO00o = new Li1IL();
        this.OooO00o = new Li1IL();
    }

    public X509Certificate OooO00o(X509CertificateHolder x509CertificateHolder) throws CertificateException {
        try {
            return (X509Certificate) this.OooO00o.OooO0O0("X.509").generateCertificate(new ByteArrayInputStream(x509CertificateHolder.getEncoded()));
        } catch (IOException e) {
            throw new ExCertificateParsingException("exception parsing certificate: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new ExCertificateException("cannot find required provider:" + e2.getMessage(), e2);
        }
    }

    public JcaX509CertificateConverter OooO00o(String str) {
        this.OooO00o = new C9829i(str);
        return this;
    }

    public JcaX509CertificateConverter OooO00o(Provider provider) {
        this.OooO00o = new li11LIL(provider);
        return this;
    }
}
