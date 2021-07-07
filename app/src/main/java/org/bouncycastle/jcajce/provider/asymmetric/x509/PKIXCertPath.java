package org.bouncycastle.jcajce.provider.asymmetric.x509;

import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC5711LiLli;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C11L1L;
import com.p118pd.sdk.C5707LiL1;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C6307ilI1;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6640li1lI;
import com.p118pd.sdk.C6903lil;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LliILl1;
import com.p118pd.sdk.i1I1I1l;
import com.p118pd.sdk.iILLL1;
import com.p118pd.sdk.ii1I11l;
import com.p118pd.sdk.il1LiLLI;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.security.NoSuchProviderException;
import java.security.cert.CertPath;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import javax.security.auth.x500.X500Principal;

public class PKIXCertPath extends CertPath {
    public static final List certPathEncodings;
    public List certificates;
    public final ii1I11l helper = new C6640li1lI();

    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("PkiPath");
        arrayList.add("PEM");
        arrayList.add("PKCS7");
        certPathEncodings = Collections.unmodifiableList(arrayList);
    }

    public PKIXCertPath(InputStream inputStream, String str) throws CertificateException {
        super("X.509");
        try {
            if (!str.equalsIgnoreCase("PkiPath")) {
                if (!str.equalsIgnoreCase("PKCS7")) {
                    if (!str.equalsIgnoreCase("PEM")) {
                        throw new CertificateException("unsupported encoding: " + str);
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                this.certificates = new ArrayList();
                CertificateFactory OooO00o = this.helper.m17223OooO00o("X.509");
                while (true) {
                    Certificate generateCertificate = OooO00o.generateCertificate(bufferedInputStream);
                    if (generateCertificate == null) {
                        break;
                    }
                    this.certificates.add(generateCertificate);
                }
            } else {
                AbstractC6122iIlLiL OooO00o2 = new C5805Ll1(inputStream).OooO00o();
                if (OooO00o2 instanceof I11li1) {
                    Enumeration OooO00o3 = ((I11li1) OooO00o2).m15236OooO00o();
                    this.certificates = new ArrayList();
                    CertificateFactory OooO00o4 = this.helper.m17223OooO00o("X.509");
                    while (OooO00o3.hasMoreElements()) {
                        this.certificates.add(0, OooO00o4.generateCertificate(new ByteArrayInputStream(((AbstractC6854lLi1LL) OooO00o3.nextElement()).OooO0O0().OooO00o(AbstractC5533IiL.OooO00o))));
                    }
                } else {
                    throw new CertificateException("input stream does not contain a ASN1 SEQUENCE while reading PkiPath encoded data to load CertPath");
                }
            }
            this.certificates = OooO00o(this.certificates);
        } catch (IOException e) {
            throw new CertificateException("IOException throw while decoding CertPath:\n" + e.toString());
        } catch (NoSuchProviderException e2) {
            throw new CertificateException("BouncyCastle provider not found while trying to get a CertificateFactory:\n" + e2.toString());
        }
    }

    public PKIXCertPath(List list) {
        super("X.509");
        this.certificates = OooO00o(new ArrayList(list));
    }

    private AbstractC6122iIlLiL OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException {
        try {
            return new C5805Ll1(x509Certificate.getEncoded()).OooO00o();
        } catch (Exception e) {
            throw new CertificateEncodingException("Exception while encoding certificate: " + e.toString());
        }
    }

    private List OooO00o(List list) {
        boolean z;
        boolean z2;
        if (list.size() < 2) {
            return list;
        }
        X500Principal issuerX500Principal = ((X509Certificate) list.get(0)).getIssuerX500Principal();
        int i = 1;
        while (true) {
            if (i == list.size()) {
                z = true;
                break;
            }
            if (!issuerX500Principal.equals(((X509Certificate) list.get(i)).getSubjectX500Principal())) {
                z = false;
                break;
            }
            issuerX500Principal = ((X509Certificate) list.get(i)).getIssuerX500Principal();
            i++;
        }
        if (z) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i2);
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            int i3 = 0;
            while (true) {
                if (i3 == list.size()) {
                    z2 = false;
                    break;
                } else if (((X509Certificate) list.get(i3)).getIssuerX500Principal().equals(subjectX500Principal)) {
                    z2 = true;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z2) {
                arrayList.add(x509Certificate);
                list.remove(i2);
            }
        }
        if (arrayList.size() > 1) {
            return arrayList2;
        }
        for (int i4 = 0; i4 != arrayList.size(); i4++) {
            X500Principal issuerX500Principal2 = ((X509Certificate) arrayList.get(i4)).getIssuerX500Principal();
            int i5 = 0;
            while (true) {
                if (i5 >= list.size()) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                if (issuerX500Principal2.equals(x509Certificate2.getSubjectX500Principal())) {
                    arrayList.add(x509Certificate2);
                    list.remove(i5);
                    break;
                }
                i5++;
            }
        }
        return list.size() > 0 ? arrayList2 : arrayList;
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r4) throws CertificateEncodingException {
        try {
            return r4.OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CertificateEncodingException("Exception thrown: " + e);
        }
    }

    @Override // java.security.cert.CertPath
    public List getCertificates() {
        return Collections.unmodifiableList(new ArrayList(this.certificates));
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded() throws CertificateEncodingException {
        Iterator encodings = getEncodings();
        if (!encodings.hasNext()) {
            return null;
        }
        Object next = encodings.next();
        if (next instanceof String) {
            return getEncoded((String) next);
        }
        return null;
    }

    @Override // java.security.cert.CertPath
    public byte[] getEncoded(String str) throws CertificateEncodingException {
        if (str.equalsIgnoreCase("PkiPath")) {
            iILLL1 r10 = new iILLL1();
            List list = this.certificates;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10.OooO00o(OooO00o((X509Certificate) listIterator.previous()));
            }
            return OooO00o(new C5707LiL1(r10));
        }
        int i = 0;
        if (str.equalsIgnoreCase("PKCS7")) {
            C6903lil r5 = new C6903lil(AbstractC5711LiLli.o00Oo0, null);
            iILLL1 r102 = new iILLL1();
            while (i != this.certificates.size()) {
                r102.OooO00o(OooO00o((X509Certificate) this.certificates.get(i)));
                i++;
            }
            return OooO00o(new C6903lil(AbstractC5711LiLli.o00Ooo, new C6307ilI1(new C6513lIiI(1), new i1I1I1l(), r5, new i1I1I1l(r102), null, new i1I1I1l())));
        } else if (str.equalsIgnoreCase("PEM")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            il1LiLLI il1lilli = new il1LiLLI(new OutputStreamWriter(byteArrayOutputStream));
            while (i != this.certificates.size()) {
                try {
                    il1lilli.OooO00o((LliILl1) new C11L1L("CERTIFICATE", ((X509Certificate) this.certificates.get(i)).getEncoded()));
                    i++;
                } catch (Exception unused) {
                    throw new CertificateEncodingException("can't encode certificate for PEM encoded path");
                }
            }
            il1lilli.close();
            return byteArrayOutputStream.toByteArray();
        } else {
            throw new CertificateEncodingException("unsupported encoding: " + str);
        }
    }

    @Override // java.security.cert.CertPath
    public Iterator getEncodings() {
        return certPathEncodings.iterator();
    }
}
