package com.p118pd.sdk;

import java.io.IOException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import org.bouncycastle.jce.provider.X509CertificateObject;
import org.bouncycastle.x509.ExtCertificateEncodingException;

/* renamed from: com.pd.sdk.il1l1丨l  reason: invalid class name */
public class il1l1l {
    public final ii1I11l OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public X509Certificate f17980OooO00o;
    public X509Certificate OooO0O0;

    public il1l1l(C5336Ii1 ii1) throws CertificateParsingException {
        if (ii1.OooO00o() != null) {
            this.f17980OooO00o = new X509CertificateObject(ii1.OooO00o());
        }
        if (ii1.OooO0O0() != null) {
            this.OooO0O0 = new X509CertificateObject(ii1.OooO0O0());
        }
    }

    public il1l1l(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.f17980OooO00o = x509Certificate;
        this.OooO0O0 = x509Certificate2;
    }

    public X509Certificate OooO00o() {
        return this.f17980OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17328OooO00o() throws CertificateEncodingException {
        LilIiIl lilIiIl;
        try {
            LilIiIl lilIiIl2 = null;
            if (this.f17980OooO00o != null) {
                lilIiIl = LilIiIl.OooO00o(new C5805Ll1(this.f17980OooO00o.getEncoded()).OooO00o());
                if (lilIiIl == null) {
                    throw new CertificateEncodingException("unable to get encoding for forward");
                }
            } else {
                lilIiIl = null;
            }
            if (this.OooO0O0 != null) {
                lilIiIl2 = LilIiIl.OooO00o(new C5805Ll1(this.OooO0O0.getEncoded()).OooO00o());
                if (lilIiIl2 == null) {
                    throw new CertificateEncodingException("unable to get encoding for reverse");
                }
            }
            return new C5336Ii1(lilIiIl, lilIiIl2).OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IllegalArgumentException e) {
            throw new ExtCertificateEncodingException(e.toString(), e);
        } catch (IOException e2) {
            throw new ExtCertificateEncodingException(e2.toString(), e2);
        }
    }

    public X509Certificate OooO0O0() {
        return this.OooO0O0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof il1l1l)) {
            return false;
        }
        il1l1l r5 = (il1l1l) obj;
        X509Certificate x509Certificate = this.f17980OooO00o;
        boolean equals = x509Certificate != null ? x509Certificate.equals(r5.f17980OooO00o) : r5.f17980OooO00o == null;
        X509Certificate x509Certificate2 = this.OooO0O0;
        X509Certificate x509Certificate3 = r5.OooO0O0;
        return equals && (x509Certificate2 != null ? x509Certificate2.equals(x509Certificate3) : x509Certificate3 == null);
    }

    public int hashCode() {
        X509Certificate x509Certificate = this.f17980OooO00o;
        int i = -1;
        if (x509Certificate != null) {
            i = -1 ^ x509Certificate.hashCode();
        }
        X509Certificate x509Certificate2 = this.OooO0O0;
        return x509Certificate2 != null ? (i * 17) ^ x509Certificate2.hashCode() : i;
    }
}
