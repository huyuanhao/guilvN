package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.CRLException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.PKIXParameters;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.丨ii1iiI  reason: invalid class name and case insensitive filesystem */
public class C9614ii1iiI {
    public static final String OooO = C5237III.o0O00o0.m16387OooO0O0();
    public static final int OooO00o = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C6324ili1lL f23196OooO00o = new C6324ili1lL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23197OooO00o = C5237III.o00o000O.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f23198OooO00o = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final int OooO0O0 = 6;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f23199OooO0O0 = C5237III.o00Ooo0o.m16387OooO0O0();
    public static final String OooO0OO = C5237III.o00o000o.m16387OooO0O0();
    public static final String OooO0Oo = C5237III.o00Ooo0.m16387OooO0O0();
    public static final String OooO0o = C5237III.o00OoOoo.m16387OooO0O0();
    public static final String OooO0o0 = C5237III.o00o0000.m16387OooO0O0();
    public static final String OooO0oO = C5237III.o00o00o0.m16387OooO0O0();
    public static final String OooO0oo = C5237III.o00OoooO.m16387OooO0O0();
    public static final String OooOO0 = C5237III.o00o00.m16387OooO0O0();
    public static final String OooOO0O = C5237III.o00o00Oo.m16387OooO0O0();
    public static final String OooOO0o = C5237III.o00o000.m16387OooO0O0();
    public static final String OooOOO = "2.5.29.32.0";
    public static final String OooOOO0 = C5237III.oo00oO.m16387OooO0O0();
    public static final String OooOOOO = C5237III.o00OooO0.m16387OooO0O0();

    public static AbstractC6122iIlLiL OooO00o(String str, byte[] bArr) throws AnnotatedException {
        try {
            return new C5805Ll1(((AbstractC6804llL1ii) new C5805Ll1(bArr).OooO00o()).m17938OooO00o()).OooO00o();
        } catch (Exception e) {
            throw new AnnotatedException("exception processing extension " + str, e);
        }
    }

    public static AbstractC6122iIlLiL OooO00o(X509Extension x509Extension, String str) throws AnnotatedException {
        byte[] extensionValue = x509Extension.getExtensionValue(str);
        if (extensionValue == null) {
            return null;
        }
        return OooO00o(str, extensionValue);
    }

    public static C6456l1ilL OooO00o(PublicKey publicKey) throws CertPathValidatorException {
        try {
            return C6888ll.OooO00o(new C5805Ll1(publicKey.getEncoded()).OooO00o()).m18042OooO0O0();
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Subject public key cannot be decoded.", e);
        }
    }

    public static C9511Lil OooO00o(int i, List[] listArr, String str, C9511Lil r9) {
        Iterator it = listArr[i].iterator();
        while (it.hasNext()) {
            C9511Lil r1 = (C9511Lil) it.next();
            if (r1.getValidPolicy().equals(str)) {
                ((C9511Lil) r1.getParent()).OooO0O0(r1);
                it.remove();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    List list = listArr[i2];
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        C9511Lil r4 = (C9511Lil) list.get(i3);
                        if (!r4.m21574OooO00o() && (r9 = OooO00o(r9, listArr, r4)) == null) {
                            break;
                        }
                    }
                }
            }
        }
        return r9;
    }

    public static C9511Lil OooO00o(C9511Lil r2, List[] listArr, C9511Lil r4) {
        C9511Lil r0 = (C9511Lil) r4.getParent();
        if (r2 == null) {
            return null;
        }
        if (r0 == null) {
            for (int i = 0; i < listArr.length; i++) {
                listArr[i] = new ArrayList();
            }
            return null;
        }
        r0.OooO0O0(r4);
        OooO00o(listArr, r4);
        return r2;
    }

    public static BigInteger OooO00o(Object obj) {
        return obj instanceof X509Certificate ? ((X509Certificate) obj).getSerialNumber() : ((AbstractC9605iL11) obj).getSerialNumber();
    }

    public static PublicKey OooO00o(List list, int i) throws CertPathValidatorException {
        DSAPublicKey dSAPublicKey;
        PublicKey publicKey = ((Certificate) list.get(i)).getPublicKey();
        if (!(publicKey instanceof DSAPublicKey)) {
            return publicKey;
        }
        DSAPublicKey dSAPublicKey2 = (DSAPublicKey) publicKey;
        if (dSAPublicKey2.getParams() != null) {
            return dSAPublicKey2;
        }
        do {
            i++;
            if (i < list.size()) {
                PublicKey publicKey2 = ((X509Certificate) list.get(i)).getPublicKey();
                if (publicKey2 instanceof DSAPublicKey) {
                    dSAPublicKey = (DSAPublicKey) publicKey2;
                } else {
                    throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
                }
            } else {
                throw new CertPathValidatorException("DSA parameters cannot be inherited from previous certificate.");
            }
        } while (dSAPublicKey.getParams() == null);
        DSAParams params = dSAPublicKey.getParams();
        try {
            return KeyFactory.getInstance("DSA", BouncyCastleProvider.PROVIDER_NAME).generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Collection OooO00o(C6088iIII r3, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof C6395iiLL) {
                try {
                    hashSet.addAll(((C6395iiLL) obj).OooO00o(r3));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            }
        }
        return hashSet;
    }

    public static Collection OooO00o(C6175iLLl r6, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        CertificateFactory certificateFactory = new CertificateFactory();
        for (Object obj : list) {
            if (obj instanceof AbstractC6271iilI) {
                try {
                    for (Object obj2 : ((AbstractC6271iilI) obj).OooO00o(r6)) {
                        if (obj2 instanceof i11ILLIi) {
                            obj2 = certificateFactory.engineGenerateCertificate(new ByteArrayInputStream(((i11ILLIi) obj2).getEncoded()));
                        } else if (!(obj2 instanceof Certificate)) {
                            throw new AnnotatedException("Unknown object found in certificate store.");
                        }
                        hashSet.add(obj2);
                    }
                    continue;
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                } catch (IOException e2) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e2);
                } catch (CertificateException e3) {
                    throw new AnnotatedException("Problem while extracting certificates from X.509 store.", e3);
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCertificates(r6));
                } catch (CertStoreException e4) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e4);
                }
            }
        }
        return hashSet;
    }

    public static Collection OooO00o(C6422iIi r3, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof AbstractC6271iilI) {
                try {
                    hashSet.addAll(((AbstractC6271iilI) obj).OooO00o(r3));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    hashSet.addAll(C6422iIi.OooO00o(r3, (CertStore) obj));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return hashSet;
    }

    public static Date OooO00o(PKIXParameters pKIXParameters) {
        Date date = pKIXParameters.getDate();
        return date == null ? new Date() : date;
    }

    public static final Set OooO00o(I11li1 i11li1) throws CertPathValidatorException {
        HashSet hashSet = new HashSet();
        if (i11li1 == null) {
            return hashSet;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C6103iIi1 iii1 = new C6103iIi1(byteArrayOutputStream);
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            try {
                iii1.OooO00o((AbstractC6854lLi1LL) OooO00o2.nextElement());
                hashSet.add(new PolicyQualifierInfo(byteArrayOutputStream.toByteArray()));
                byteArrayOutputStream.reset();
            } catch (IOException e) {
                throw new ExtCertPathValidatorException("Policy qualifier info cannot be decoded.", e);
            }
        }
        return hashSet;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static X500Principal m21675OooO00o(Object obj) {
        return obj instanceof X509Certificate ? ((X509Certificate) obj).getIssuerX500Principal() : (X500Principal) ((AbstractC9605iL11) obj).m21662OooO00o().m21591OooO00o()[0];
    }

    public static X500Principal OooO00o(X509CRL x509crl) {
        return x509crl.getIssuerX500Principal();
    }

    public static X500Principal OooO00o(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectX500Principal();
    }

    public static void OooO00o(int i, List[] listArr, LlLI1 llLI1, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9511Lil r2 = (C9511Lil) list.get(i2);
            if ("2.5.29.32.0".equals(r2.getValidPolicy())) {
                HashSet hashSet = new HashSet();
                hashSet.add(llLI1.m16387OooO0O0());
                C9511Lil r0 = new C9511Lil(new ArrayList(), i, hashSet, r2, set, llLI1.m16387OooO0O0(), false);
                r2.OooO00o(r0);
                listArr[i].add(r0);
                return;
            }
        }
    }

    public static void OooO00o(int i, List[] listArr, String str, Map map, X509Certificate x509Certificate) throws AnnotatedException, CertPathValidatorException {
        boolean z;
        Iterator it = listArr[i].iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            C9511Lil r1 = (C9511Lil) it.next();
            if (r1.getValidPolicy().equals(str)) {
                z = true;
                r1.OooO00o((Set) map.get(str));
                break;
            }
        }
        if (!z) {
            for (C9511Lil r12 : listArr[i]) {
                if ("2.5.29.32.0".equals(r12.getValidPolicy())) {
                    Set set = null;
                    try {
                        Enumeration OooO00o2 = I11li1.OooO00o((Object) OooO00o(x509Certificate, f23197OooO00o)).m15236OooO00o();
                        while (true) {
                            if (!OooO00o2.hasMoreElements()) {
                                break;
                            }
                            try {
                                C9879iI OooO00o3 = C9879iI.OooO00o(OooO00o2.nextElement());
                                if ("2.5.29.32.0".equals(OooO00o3.m21960OooO00o().m16387OooO0O0())) {
                                    try {
                                        set = OooO00o(OooO00o3.OooO00o());
                                        break;
                                    } catch (CertPathValidatorException e) {
                                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be built.", e);
                                    }
                                }
                            } catch (Exception e2) {
                                throw new AnnotatedException("Policy information cannot be decoded.", e2);
                            }
                        }
                        boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(f23197OooO00o) : false;
                        C9511Lil r13 = (C9511Lil) r12.getParent();
                        if ("2.5.29.32.0".equals(r13.getValidPolicy())) {
                            C9511Lil r8 = new C9511Lil(new ArrayList(), i, (Set) map.get(str), r13, set, str, contains);
                            r13.OooO00o(r8);
                            listArr[i].add(r8);
                            return;
                        }
                        return;
                    } catch (Exception e3) {
                        throw new AnnotatedException("Certificate policies cannot be decoded.", e3);
                    }
                }
            }
        }
    }

    public static void OooO00o(X509Certificate x509Certificate, PublicKey publicKey, String str) throws GeneralSecurityException {
        if (str == null) {
            x509Certificate.verify(publicKey);
        } else {
            x509Certificate.verify(publicKey, str);
        }
    }

    public static void OooO00o(Date date, X509CRL x509crl, Object obj, L1liL1 l1liL1) throws AnnotatedException {
        X509CRLEntry x509CRLEntry;
        try {
            if (m21677OooO00o(x509crl)) {
                x509CRLEntry = x509crl.getRevokedCertificate(OooO00o(obj));
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (certificateIssuer == null) {
                        certificateIssuer = OooO00o(x509crl);
                    }
                    if (!m21675OooO00o(obj).equals(certificateIssuer)) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!m21675OooO00o(obj).equals(OooO00o(x509crl)) || (x509CRLEntry = x509crl.getRevokedCertificate(OooO00o(obj))) == null) {
                return;
            }
            C5841L11I r6 = null;
            if (x509CRLEntry.hasExtensions()) {
                try {
                    r6 = C5841L11I.OooO00o((Object) OooO00o(x509CRLEntry, C5551IiL.OooO.m16387OooO0O0()));
                } catch (Exception e) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                }
            }
            if (date.getTime() >= x509CRLEntry.getRevocationDate().getTime() || r6 == null || r6.OooO00o().intValue() == 0 || r6.OooO00o().intValue() == 1 || r6.OooO00o().intValue() == 2 || r6.OooO00o().intValue() == 8) {
                l1liL1.OooO00o(r6 != null ? r6.OooO00o().intValue() : 0);
                l1liL1.OooO00o(x509CRLEntry.getRevocationDate());
            }
        } catch (CRLException e2) {
            throw new AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    public static void OooO00o(List[] listArr, C9511Lil r2) {
        listArr[r2.getDepth()].remove(r2);
        if (r2.m21574OooO00o()) {
            Iterator children = r2.getChildren();
            while (children.hasNext()) {
                OooO00o(listArr, (C9511Lil) children.next());
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21676OooO00o(int i, List[] listArr, LlLI1 llLI1, Set set) {
        List list = listArr[i - 1];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C9511Lil r3 = (C9511Lil) list.get(i2);
            if (r3.getExpectedPolicies().contains(llLI1.m16387OooO0O0())) {
                HashSet hashSet = new HashSet();
                hashSet.add(llLI1.m16387OooO0O0());
                C9511Lil r0 = new C9511Lil(new ArrayList(), i, hashSet, r3, set, llLI1.m16387OooO0O0(), false);
                r3.OooO00o(r0);
                listArr[i].add(r0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21677OooO00o(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C5237III.o00OoooO.m16387OooO0O0());
            return extensionValue != null && i1LlI.OooO00o(AbstractC6804llL1ii.OooO00o(extensionValue).m17938OooO00o()).m16881OooO00o();
        } catch (Exception e) {
            throw new CRLException("Exception reading IssuingDistributionPoint: " + e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21678OooO00o(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    public static boolean OooO00o(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }
}
