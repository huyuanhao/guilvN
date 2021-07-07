package org.bouncycastle.cert.jcajce;

import com.p118pd.sdk.AbstractC9517LiIiL;
import com.p118pd.sdk.C9829i;
import com.p118pd.sdk.Li1IL;
import com.p118pd.sdk.li11LIL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.cert.CRLException;
import java.security.cert.CertificateException;
import java.security.cert.X509CRL;
import org.bouncycastle.cert.X509CRLHolder;

public class JcaX509CRLConverter {
    public AbstractC9517LiIiL OooO00o;

    public class ExCRLException extends CRLException {
        public Throwable cause;

        public ExCRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    public JcaX509CRLConverter() {
        this.OooO00o = new Li1IL();
        this.OooO00o = new Li1IL();
    }

    public X509CRL OooO00o(X509CRLHolder x509CRLHolder) throws CRLException {
        try {
            return (X509CRL) this.OooO00o.OooO0O0("X.509").generateCRL(new ByteArrayInputStream(x509CRLHolder.getEncoded()));
        } catch (IOException e) {
            throw new ExCRLException("exception parsing certificate: " + e.getMessage(), e);
        } catch (NoSuchProviderException e2) {
            throw new ExCRLException("cannot find required provider:" + e2.getMessage(), e2);
        } catch (CertificateException e3) {
            throw new ExCRLException("cannot create factory: " + e3.getMessage(), e3);
        }
    }

    public JcaX509CRLConverter OooO00o(String str) {
        this.OooO00o = new C9829i(str);
        return this;
    }

    public JcaX509CRLConverter OooO00o(Provider provider) {
        this.OooO00o = new li11LIL(provider);
        return this;
    }
}
