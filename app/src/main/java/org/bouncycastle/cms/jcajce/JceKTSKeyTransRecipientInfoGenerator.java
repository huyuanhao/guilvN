package org.bouncycastle.cms.jcajce;

import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC6285iiLli;
import com.p118pd.sdk.C5301ILIi;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6472l1l1l;
import com.p118pd.sdk.C6487lIIiIlL;
import com.p118pd.sdk.C6530lI1;
import com.p118pd.sdk.IIllLll1;
import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;

public class JceKTSKeyTransRecipientInfoGenerator extends AbstractC6285iiLli {
    public static final byte[] OooO0O0 = C6472l1l1l.OooO00o("0c14416e6f6e796d6f75732053656e64657220202020");

    public JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, IIllLll1 iIllLll1, String str, int i) throws CertificateEncodingException {
        super(iIllLll1, new C5301ILIi(x509Certificate, str, i, OooO0O0, OooO00o(iIllLll1)));
    }

    public JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, C6456l1ilL r4) throws CertificateEncodingException {
        super(new IIllLll1(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), new C6530lI1(r4, x509Certificate.getPublicKey()));
    }

    public JceKTSKeyTransRecipientInfoGenerator(X509Certificate x509Certificate, String str, int i) throws CertificateEncodingException {
        this(x509Certificate, new IIllLll1(new JcaX509CertificateHolder(x509Certificate).toASN1Structure()), str, i);
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, C6456l1ilL r3, PublicKey publicKey) {
        super(bArr, new C6530lI1(r3, publicKey));
    }

    public JceKTSKeyTransRecipientInfoGenerator(byte[] bArr, PublicKey publicKey, String str, int i) {
        super(bArr, new C5301ILIi(publicKey, str, i, OooO0O0, OooO00o(bArr)));
    }

    public static byte[] OooO00o(IIllLll1 iIllLll1) throws CertificateEncodingException {
        try {
            return iIllLll1.OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CertificateEncodingException("Cannot process extracted IssuerAndSerialNumber: " + e.getMessage()) {
                /* class org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.C48291 */

                public Throwable getCause() {
                    return e;
                }
            };
        }
    }

    public static byte[] OooO00o(byte[] bArr) {
        try {
            return new C6487lIIiIlL(bArr).getEncoded();
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot process subject key identifier: " + e.getMessage()) {
                /* class org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipientInfoGenerator.C48302 */

                public Throwable getCause() {
                    return e;
                }
            };
        }
    }

    public JceKTSKeyTransRecipientInfoGenerator OooO00o(String str) {
        ((C5301ILIi) ((AbstractC6285iiLli) this).f17963OooO00o).OooO00o(str);
        return this;
    }

    public JceKTSKeyTransRecipientInfoGenerator OooO00o(Provider provider) {
        ((C5301ILIi) ((AbstractC6285iiLli) this).f17963OooO00o).OooO00o(provider);
        return this;
    }
}
