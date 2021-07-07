package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* renamed from: com.pd.sdk.丨丨1lIi  reason: invalid class name */
public class C1lIi extends CertStoreSpi {
    public static String OooO00o = "com.sun.jndi.ldap.LdapCtxFactory";
    public static String OooO0O0 = "ignore";
    public static final String OooO0OO = "none";
    public static final String OooO0Oo = "com.sun.jndi.url";

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5590L1il f23384OooO00o;

    public C1lIi(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof C5590L1il) {
            this.f23384OooO00o = (C5590L1il) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException(C1lIi.class.getName() + ": parameter must be a " + C5590L1il.class.getName() + " object\n" + certStoreParameters.toString());
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004e  */
    private java.lang.String OooO00o(java.lang.String r5, java.lang.String r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C1lIi.OooO00o(java.lang.String, java.lang.String):java.lang.String");
    }

    private Set OooO00o(String str, String str2, String[] strArr) throws CertStoreException {
        String str3 = str + C8932ooOOO0o.OooO0Oo + str2;
        DirContext dirContext = null;
        if (str == null) {
            str3 = null;
        }
        HashSet hashSet = new HashSet();
        try {
            DirContext OooO00o2 = OooO00o();
            SearchControls searchControls = new SearchControls();
            searchControls.setSearchScope(2);
            searchControls.setCountLimit(0);
            for (int i = 0; i < strArr.length; i++) {
                String[] strArr2 = {strArr[i]};
                searchControls.setReturningAttributes(strArr2);
                String str4 = "(&(" + str3 + ")(" + strArr2[0] + "=*))";
                if (str3 == null) {
                    str4 = C3848l.f10401s + strArr2[0] + "=*)";
                }
                NamingEnumeration search = OooO00o2.search(this.f23384OooO00o.OooOOOo(), str4, searchControls);
                while (search.hasMoreElements()) {
                    NamingEnumeration all = ((Attribute) ((SearchResult) search.next()).getAttributes().getAll().next()).getAll();
                    while (all.hasMore()) {
                        hashSet.add(all.next());
                    }
                }
            }
            if (OooO00o2 != null) {
                try {
                    OooO00o2.close();
                } catch (Exception unused) {
                }
            }
            return hashSet;
        } catch (Exception e) {
            throw new CertStoreException("Error getting results from LDAP directory " + e);
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    dirContext.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private Set OooO00o(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.f23384OooO00o.OooOOo0()};
        Set OooO00o2 = OooO00o(x509CertSelector, strArr, this.f23384OooO00o.OooOooo(), this.f23384OooO00o.OooOOo());
        if (OooO00o2.isEmpty()) {
            OooO00o2.addAll(OooO00o(null, "*", strArr));
        }
        return OooO00o2;
    }

    private Set OooO00o(X509CertSelector x509CertSelector, String[] strArr, String str, String str2) throws CertStoreException {
        String str3;
        String str4;
        Set OooO00o2;
        HashSet hashSet = new HashSet();
        try {
            if (x509CertSelector.getSubjectAsBytes() == null && x509CertSelector.getSubjectAsString() == null && x509CertSelector.getCertificate() == null) {
                OooO00o2 = OooO00o(str, "*", strArr);
            } else {
                if (x509CertSelector.getCertificate() != null) {
                    str4 = x509CertSelector.getCertificate().getSubjectX500Principal().getName("RFC1779");
                    str3 = x509CertSelector.getCertificate().getSerialNumber().toString();
                } else {
                    str4 = x509CertSelector.getSubjectAsBytes() != null ? new X500Principal(x509CertSelector.getSubjectAsBytes()).getName("RFC1779") : x509CertSelector.getSubjectAsString();
                    str3 = null;
                }
                hashSet.addAll(OooO00o(str, "*" + OooO00o(str4, str2) + "*", strArr));
                if (!(str3 == null || this.f23384OooO00o.Oooo0OO() == null)) {
                    OooO00o2 = OooO00o(this.f23384OooO00o.Oooo0OO(), "*" + str3 + "*", strArr);
                }
                return hashSet;
            }
            hashSet.addAll(OooO00o2);
            return hashSet;
        } catch (IOException e) {
            throw new CertStoreException("exception processing selector: " + e);
        }
    }

    private DirContext OooO00o() throws NamingException {
        Properties properties = new Properties();
        properties.setProperty("java.naming.factory.initial", OooO00o);
        properties.setProperty("java.naming.batchsize", "0");
        properties.setProperty("java.naming.provider.url", this.f23384OooO00o.Oooo0());
        properties.setProperty("java.naming.factory.url.pkgs", "com.sun.jndi.url");
        properties.setProperty("java.naming.referral", OooO0O0);
        properties.setProperty("java.naming.security.authentication", "none");
        return new InitialDirContext(properties);
    }

    private Set OooO0O0(X509CertSelector x509CertSelector) throws CertStoreException {
        String[] strArr = {this.f23384OooO00o.OooOo0()};
        Set OooO00o2 = OooO00o(x509CertSelector, strArr, this.f23384OooO00o.Oooo00O(), this.f23384OooO00o.OooOo0O());
        if (OooO00o2.isEmpty()) {
            OooO00o2.addAll(OooO00o(null, "*", strArr));
        }
        return OooO00o2;
    }

    private Set OooO0OO(X509CertSelector x509CertSelector) throws CertStoreException {
        return OooO00o(x509CertSelector, new String[]{this.f23384OooO00o.Oooo0o0()}, this.f23384OooO00o.Oooo0O0(), this.f23384OooO00o.Oooo0o());
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        String str;
        String str2;
        String[] strArr = {this.f23384OooO00o.OooOOoo()};
        if (cRLSelector instanceof X509CRLSelector) {
            X509CRLSelector x509CRLSelector = (X509CRLSelector) cRLSelector;
            HashSet hashSet = new HashSet();
            String Oooo000 = this.f23384OooO00o.Oooo000();
            HashSet<byte[]> hashSet2 = new HashSet();
            if (x509CRLSelector.getIssuerNames() != null) {
                for (Object obj : x509CRLSelector.getIssuerNames()) {
                    if (obj instanceof String) {
                        str = this.f23384OooO00o.OooOo00();
                        str2 = (String) obj;
                    } else {
                        str = this.f23384OooO00o.OooOo00();
                        str2 = new X500Principal((byte[]) obj).getName("RFC1779");
                    }
                    String OooO00o2 = OooO00o(str2, str);
                    hashSet2.addAll(OooO00o(Oooo000, "*" + OooO00o2 + "*", strArr));
                }
            } else {
                hashSet2.addAll(OooO00o(Oooo000, "*", strArr));
            }
            hashSet2.addAll(OooO00o(null, "*", strArr));
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
                for (byte[] bArr : hashSet2) {
                    CRL generateCRL = instance.generateCRL(new ByteArrayInputStream(bArr));
                    if (x509CRLSelector.match(generateCRL)) {
                        hashSet.add(generateCRL);
                    }
                }
                return hashSet;
            } catch (Exception e) {
                throw new CertStoreException("CRL cannot be constructed from LDAP result " + e);
            }
        } else {
            throw new CertStoreException("selector is not a X509CRLSelector");
        }
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        if (certSelector instanceof X509CertSelector) {
            X509CertSelector x509CertSelector = (X509CertSelector) certSelector;
            HashSet hashSet = new HashSet();
            Set<byte[]> OooO0OO2 = OooO0OO(x509CertSelector);
            OooO0OO2.addAll(OooO00o(x509CertSelector));
            OooO0OO2.addAll(OooO0O0(x509CertSelector));
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509", BouncyCastleProvider.PROVIDER_NAME);
                for (byte[] bArr : OooO0OO2) {
                    if (bArr != null) {
                        if (bArr.length != 0) {
                            ArrayList<byte[]> arrayList = new ArrayList();
                            arrayList.add(bArr);
                            try {
                                C5336Ii1 OooO00o2 = C5336Ii1.OooO00o(new C5805Ll1(bArr).OooO00o());
                                arrayList.clear();
                                if (OooO00o2.OooO00o() != null) {
                                    arrayList.add(OooO00o2.OooO00o().getEncoded());
                                }
                                if (OooO00o2.OooO0O0() != null) {
                                    arrayList.add(OooO00o2.OooO0O0().getEncoded());
                                }
                            } catch (IOException | IllegalArgumentException unused) {
                            }
                            for (byte[] bArr2 : arrayList) {
                                try {
                                    Certificate generateCertificate = instance.generateCertificate(new ByteArrayInputStream(bArr2));
                                    if (x509CertSelector.match(generateCertificate)) {
                                        hashSet.add(generateCertificate);
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                }
                return hashSet;
            } catch (Exception e) {
                throw new CertStoreException("certificate cannot be constructed from LDAP result: " + e);
            }
        } else {
            throw new CertStoreException("selector is not a X509CertSelector");
        }
    }
}
