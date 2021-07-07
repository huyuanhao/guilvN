package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC5903LlLLL;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5190I1lIiL;
import com.p118pd.sdk.C5418Il11I1i;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C6304ilIi1;
import com.p118pd.sdk.C6307ilI1;
import com.p118pd.sdk.C6640li1lI;
import com.p118pd.sdk.I11L;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.IlIIilL;
import com.p118pd.sdk.LilIiIl;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.ii1I11l;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CertificateFactory extends CertificateFactorySpi {
    public static final IlIIilL OooO00o = new IlIIilL("CERTIFICATE");
    public static final IlIIilL OooO0O0 = new IlIIilL("CRL");
    public static final IlIIilL OooO0OO = new IlIIilL("PKCS7");

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23943OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f23944OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f23945OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f23946OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f23947OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public I11L f23948OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public InputStream f23949OooO0O0 = null;

    public class ExCertificateException extends CertificateException {
        public Throwable cause;

        public ExCertificateException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public ExCertificateException(Throwable th) {
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    private CRL OooO00o() throws CRLException {
        I11L i11l = this.f23948OooO0O0;
        if (i11l == null || this.f23947OooO0O0 >= i11l.size()) {
            return null;
        }
        I11L i11l2 = this.f23948OooO0O0;
        int i = this.f23947OooO0O0;
        this.f23947OooO0O0 = i + 1;
        return OooO00o(C5190I1lIiL.OooO00o(i11l2.OooO00o(i)));
    }

    private CRL OooO00o(I11li1 i11li1) throws CRLException {
        if (i11li1 == null) {
            return null;
        }
        if (i11li1.size() <= 1 || !(i11li1.OooO00o(0) instanceof LlLI1) || !i11li1.OooO00o(0).equals(AbstractC5711LiLli.o00Ooo)) {
            return OooO00o(C5190I1lIiL.OooO00o(i11li1));
        }
        this.f23948OooO0O0 = C6307ilI1.OooO00o(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true)).OooO00o();
        return OooO00o();
    }

    private CRL OooO00o(C5805Ll1 r1) throws IOException, CRLException {
        return OooO00o(I11li1.OooO00o((Object) r1.OooO00o()));
    }

    private CRL OooO00o(InputStream inputStream) throws IOException, CRLException {
        return OooO00o(OooO0O0.m15659OooO00o(inputStream));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Certificate m22964OooO00o() throws CertificateParsingException {
        if (this.f23944OooO00o == null) {
            return null;
        }
        while (this.f23943OooO00o < this.f23944OooO00o.size()) {
            I11L i11l = this.f23944OooO00o;
            int i = this.f23943OooO00o;
            this.f23943OooO00o = i + 1;
            AbstractC6854lLi1LL OooO00o2 = i11l.OooO00o(i);
            if (OooO00o2 instanceof I11li1) {
                return new X509CertificateObject(this.f23945OooO00o, LilIiIl.OooO00o(OooO00o2));
            }
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Certificate m22965OooO00o(I11li1 i11li1) throws CertificateParsingException {
        if (i11li1 == null) {
            return null;
        }
        if (i11li1.size() <= 1 || !(i11li1.OooO00o(0) instanceof LlLI1) || !i11li1.OooO00o(0).equals(AbstractC5711LiLli.o00Ooo)) {
            return new X509CertificateObject(this.f23945OooO00o, LilIiIl.OooO00o(i11li1));
        }
        this.f23944OooO00o = C6307ilI1.OooO00o(I11li1.OooO00o((AbstractC5903LlLLL) i11li1.OooO00o(1), true)).OooO0O0();
        return m22964OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Certificate m22966OooO00o(C5805Ll1 r1) throws IOException, CertificateParsingException {
        return m22965OooO00o(I11li1.OooO00o((Object) r1.OooO00o()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private Certificate m22967OooO00o(InputStream inputStream) throws IOException, CertificateParsingException {
        return m22965OooO00o(OooO00o.m15659OooO00o(inputStream));
    }

    public CRL OooO00o(C5190I1lIiL r3) throws CRLException {
        return new C5418Il11I1i(this.f23945OooO00o, r3);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CRL engineGenerateCRL(InputStream inputStream) throws CRLException {
        InputStream inputStream2 = this.f23949OooO0O0;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f23949OooO0O0 = inputStream;
            this.f23948OooO0O0 = null;
            this.f23947OooO0O0 = 0;
        }
        try {
            if (this.f23948OooO0O0 == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(C6304ilIi1.m17339OooO00o(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? OooO00o(inputStream) : OooO00o(new C5805Ll1(inputStream, true));
            } else if (this.f23947OooO0O0 != this.f23948OooO0O0.size()) {
                return OooO00o();
            } else {
                this.f23948OooO0O0 = null;
                this.f23947OooO0O0 = 0;
                return null;
            }
        } catch (CRLException e) {
            throw e;
        } catch (Exception e2) {
            throw new CRLException(e2.toString());
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCRLs(InputStream inputStream) throws CRLException {
        ArrayList arrayList = new ArrayList();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        while (true) {
            CRL engineGenerateCRL = engineGenerateCRL(bufferedInputStream);
            if (engineGenerateCRL == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCRL);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream) throws CertificateException {
        return engineGenerateCertPath(inputStream, "PkiPath");
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(InputStream inputStream, String str) throws CertificateException {
        return new PKIXCertPath(inputStream, str);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public CertPath engineGenerateCertPath(List list) throws CertificateException {
        for (Object obj : list) {
            if (!(obj == null || (obj instanceof X509Certificate))) {
                throw new CertificateException("list contains non X509Certificate object while creating CertPath\n" + obj.toString());
            }
        }
        return new PKIXCertPath(list);
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Certificate engineGenerateCertificate(InputStream inputStream) throws CertificateException {
        InputStream inputStream2 = this.f23946OooO00o;
        if (inputStream2 == null || inputStream2 != inputStream) {
            this.f23946OooO00o = inputStream;
            this.f23944OooO00o = null;
            this.f23943OooO00o = 0;
        }
        try {
            if (this.f23944OooO00o == null) {
                if (!inputStream.markSupported()) {
                    inputStream = new ByteArrayInputStream(C6304ilIi1.m17339OooO00o(inputStream));
                }
                inputStream.mark(1);
                int read = inputStream.read();
                if (read == -1) {
                    return null;
                }
                inputStream.reset();
                return read != 48 ? m22967OooO00o(inputStream) : m22966OooO00o(new C5805Ll1(inputStream));
            } else if (this.f23943OooO00o != this.f23944OooO00o.size()) {
                return m22964OooO00o();
            } else {
                this.f23944OooO00o = null;
                this.f23943OooO00o = 0;
                return null;
            }
        } catch (Exception e) {
            throw new ExCertificateException("parsing issue: " + e.getMessage(), e);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Collection engineGenerateCertificates(InputStream inputStream) throws CertificateException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ArrayList arrayList = new ArrayList();
        while (true) {
            Certificate engineGenerateCertificate = engineGenerateCertificate(bufferedInputStream);
            if (engineGenerateCertificate == null) {
                return arrayList;
            }
            arrayList.add(engineGenerateCertificate);
        }
    }

    @Override // java.security.cert.CertificateFactorySpi
    public Iterator engineGetCertPathEncodings() {
        return PKIXCertPath.certPathEncodings.iterator();
    }
}
