package com.p118pd.sdk;

import com.p118pd.sdk.C6043i1l1l;
import com.p118pd.sdk.C6422iIi;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CRLException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.PolicyQualifierInfo;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPublicKey;
import java.security.spec.DSAPublicKeySpec;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.i丨丨IIL1i  reason: invalid class name and case insensitive filesystem */
public class C6421iIIL1i {
    public static final String OooO = C5237III.o0O00o0.m16387OooO0O0();
    public static final int OooO00o = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5695Li1 f18233OooO00o = new C5695Li1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f18234OooO00o = C5237III.o00o000O.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f18235OooO00o = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final int OooO0O0 = 6;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f18236OooO0O0 = C5237III.o00Ooo0o.m16387OooO0O0();
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
            return C6888ll.OooO00o(new C5805Ll1(publicKey.getEncoded()).OooO00o()).m18041OooO00o();
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
        return ((X509Certificate) obj).getSerialNumber();
    }

    public static PublicKey OooO00o(List list, int i, ii1I11l ii1i11l) throws CertPathValidatorException {
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
            return ii1i11l.m17218OooO00o("DSA").generatePublic(new DSAPublicKeySpec(dSAPublicKey2.getY(), params.getP(), params.getQ(), params.getG()));
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static TrustAnchor OooO00o(X509Certificate x509Certificate, Set set) throws AnnotatedException {
        return OooO00o(x509Certificate, set, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d A[SYNTHETIC, Splitter:B:23:0x005d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.cert.TrustAnchor OooO00o(java.security.cert.X509Certificate r7, java.util.Set r8, java.lang.String r9) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6421iIIL1i.OooO00o(java.security.cert.X509Certificate, java.util.Set, java.lang.String):java.security.cert.TrustAnchor");
    }

    public static Collection OooO00o(C6422iIi r3, List list) throws AnnotatedException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : list) {
            if (obj instanceof AbstractC6271iilI) {
                try {
                    linkedHashSet.addAll(((AbstractC6271iilI) obj).OooO00o(r3));
                } catch (StoreException e) {
                    throw new AnnotatedException("Problem while picking certificates from X.509 store.", e);
                }
            } else {
                try {
                    linkedHashSet.addAll(C6422iIi.OooO00o(r3, (CertStore) obj));
                } catch (CertStoreException e2) {
                    throw new AnnotatedException("Problem while picking certificates from certificate store.", e2);
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection OooO00o(X509Certificate x509Certificate, List<CertStore> list, List<AbstractC9687lLi> list2) throws AnnotatedException {
        byte[] OooO00o2;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(LLl11i.OooO00o(x509Certificate).getEncoded());
            try {
                byte[] extensionValue = x509Certificate.getExtensionValue(OooOOO0);
                if (!(extensionValue == null || (OooO00o2 = ilililIi.OooO00o(AbstractC6804llL1ii.OooO00o((Object) extensionValue).m17938OooO00o()).m17392OooO00o()) == null)) {
                    x509CertSelector.setSubjectKeyIdentifier(new C6487lIIiIlL(OooO00o2).getEncoded());
                }
            } catch (Exception unused) {
            }
            C6422iIi<? extends Certificate> OooO00o3 = new C6422iIi.OooO0O0(x509CertSelector).OooO00o();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                ArrayList<X509Certificate> arrayList = new ArrayList();
                arrayList.addAll(OooO00o(OooO00o3, list));
                arrayList.addAll(OooO00o(OooO00o3, list2));
                for (X509Certificate x509Certificate2 : arrayList) {
                    linkedHashSet.add(x509Certificate2);
                }
                return linkedHashSet;
            } catch (AnnotatedException e) {
                throw new AnnotatedException("Issuer certificate cannot be searched.", e);
            }
        } catch (IOException e2) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate could not be set.", e2);
        }
    }

    public static Date OooO00o(C11lILlL r0) {
        Date OooO00o2 = r0.m21240OooO00o();
        return OooO00o2 == null ? new Date() : OooO00o2;
    }

    public static Date OooO00o(C11lILlL r3, CertPath certPath, int i) throws AnnotatedException {
        if (r3.OooO00o() != 1) {
            return OooO00o(r3);
        }
        if (i <= 0) {
            return OooO00o(r3);
        }
        int i2 = i - 1;
        if (i2 == 0) {
            C9623il r32 = null;
            try {
                byte[] extensionValue = ((X509Certificate) certPath.getCertificates().get(i2)).getExtensionValue(AbstractC6634li1.OooO0o0.m16387OooO0O0());
                if (extensionValue != null) {
                    r32 = C9623il.OooO00o((Object) AbstractC6122iIlLiL.OooO00o(extensionValue));
                }
                if (r32 != null) {
                    try {
                        return r32.OooO00o();
                    } catch (ParseException e) {
                        throw new AnnotatedException("Date from date of cert gen extension could not be parsed.", e);
                    }
                }
            } catch (IOException unused) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            } catch (IllegalArgumentException unused2) {
                throw new AnnotatedException("Date of cert gen extension could not be read.");
            }
        }
        return ((X509Certificate) certPath.getCertificates().get(i2)).getNotBefore();
    }

    public static List<AbstractC6466l11> OooO00o(C6251iiLilL r6, Map<ILI, AbstractC6466l11> map) throws AnnotatedException {
        ILI[] OooO00o2;
        if (r6 == null) {
            return Collections.EMPTY_LIST;
        }
        try {
            C9621ii1iL[] OooO00o3 = r6.OooO00o();
            ArrayList arrayList = new ArrayList();
            for (C9621ii1iL r3 : OooO00o3) {
                C5633LIiII OooO00o4 = r3.m21682OooO00o();
                if (OooO00o4 != null && OooO00o4.OooO0O0() == 0) {
                    for (ILI ili : C5845LIillll.OooO00o(OooO00o4.m16111OooO0O0()).OooO00o()) {
                        AbstractC6466l11 r5 = map.get(ili);
                        if (r5 != null) {
                            arrayList.add(r5);
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            throw new AnnotatedException("Distribution points could not be read.", e);
        }
    }

    public static List<AbstractC9687lLi> OooO00o(byte[] bArr, Map<ILI, AbstractC9687lLi> map) throws CertificateParsingException {
        if (bArr == null) {
            return Collections.EMPTY_LIST;
        }
        ILI[] OooO00o2 = C5845LIillll.OooO00o(AbstractC6804llL1ii.OooO00o((Object) bArr).m17938OooO00o()).OooO00o();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.length; i++) {
            AbstractC9687lLi r2 = map.get(OooO00o2[i]);
            if (r2 != null) {
                arrayList.add(r2);
            }
        }
        return arrayList;
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

    public static Set OooO00o(C9621ii1iL r3, Object obj, Date date, C11lILlL r6) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            HashSet hashSet = new HashSet();
            hashSet.add(LLl11i.OooO00o(obj));
            OooO00o(r3, hashSet, x509CRLSelector);
            if (obj instanceof X509Certificate) {
                x509CRLSelector.setCertificateChecking((X509Certificate) obj);
            }
            C6043i1l1l<? extends CRL> OooO00o2 = new C6043i1l1l.OooO0O0(x509CRLSelector).OooO00o(true).OooO00o();
            if (r6.m21240OooO00o() != null) {
                date = r6.m21240OooO00o();
            }
            Set OooO00o3 = f18233OooO00o.OooO00o(OooO00o2, date, r6.OooO0OO(), r6.m21241OooO00o());
            OooO00o(OooO00o3, obj);
            return OooO00o3;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Could not get issuer information from distribution point.", e);
        }
    }

    public static Set OooO00o(Date date, X509CRL x509crl, List<CertStore> list, List<AbstractC6466l11> list2) throws AnnotatedException {
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        try {
            x509CRLSelector.addIssuerName(LLl11i.OooO00o(x509crl).getEncoded());
            try {
                AbstractC6122iIlLiL OooO00o2 = OooO00o(x509crl, OooOOOO);
                BigInteger bigInteger = null;
                BigInteger OooO00o3 = OooO00o2 != null ? C6513lIiI.OooO00o((Object) OooO00o2).OooO00o() : null;
                try {
                    byte[] extensionValue = x509crl.getExtensionValue(OooO0oo);
                    if (OooO00o3 != null) {
                        bigInteger = OooO00o3.add(BigInteger.valueOf(1));
                    }
                    x509CRLSelector.setMinCRLNumber(bigInteger);
                    C6043i1l1l.OooO0O0 oooO0O0 = new C6043i1l1l.OooO0O0(x509CRLSelector);
                    oooO0O0.OooO00o(extensionValue);
                    oooO0O0.m16903OooO00o(true);
                    oooO0O0.OooO00o(OooO00o3);
                    Set<X509CRL> OooO00o4 = f18233OooO00o.OooO00o(oooO0O0.OooO00o(), date, list, list2);
                    HashSet hashSet = new HashSet();
                    for (X509CRL x509crl2 : OooO00o4) {
                        if (OooO00o(x509crl2)) {
                            hashSet.add(x509crl2);
                        }
                    }
                    return hashSet;
                } catch (Exception e) {
                    throw new AnnotatedException("Issuing distribution point extension value could not be read.", e);
                }
            } catch (Exception e2) {
                throw new AnnotatedException("CRL number extension could not be extracted from CRL.", e2);
            }
        } catch (IOException e3) {
            throw new AnnotatedException("Cannot extract issuer from CRL.", e3);
        }
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
                r1.f23091OooO00o = (Set) map.get(str);
                break;
            }
        }
        if (!z) {
            for (C9511Lil r12 : listArr[i]) {
                if ("2.5.29.32.0".equals(r12.getValidPolicy())) {
                    Set set = null;
                    try {
                        Enumeration OooO00o2 = I11li1.OooO00o((Object) OooO00o(x509Certificate, f18234OooO00o)).m15236OooO00o();
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
                        boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(f18234OooO00o) : false;
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

    public static void OooO00o(C9621ii1iL r3, Collection collection, X509CRLSelector x509CRLSelector) throws AnnotatedException {
        ArrayList<l1LILI1> arrayList = new ArrayList();
        if (r3.m21683OooO00o() != null) {
            ILI[] OooO00o2 = r3.m21683OooO00o().OooO00o();
            for (int i = 0; i < OooO00o2.length; i++) {
                if (OooO00o2[i].OooO00o() == 4) {
                    try {
                        arrayList.add(l1LILI1.OooO00o(OooO00o2[i].m15483OooO0O0().OooO0O0().getEncoded()));
                    } catch (IOException e) {
                        throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                    }
                }
            }
        } else if (r3.m21682OooO00o() != null) {
            for (Object obj : collection) {
                arrayList.add(obj);
            }
        } else {
            throw new AnnotatedException("CRL issuer is omitted from distribution point but no distributionPoint field present.");
        }
        for (l1LILI1 r4 : arrayList) {
            try {
                x509CRLSelector.addIssuerName(r4.getEncoded());
            } catch (IOException e2) {
                throw new AnnotatedException("Cannot decode CRL issuer information.", e2);
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

    public static void OooO00o(Date date, X509CRL x509crl, Object obj, ll11LIi ll11lii) throws AnnotatedException {
        X509CRLEntry x509CRLEntry;
        try {
            if (C6159iLII.OooO00o(x509crl)) {
                x509CRLEntry = x509crl.getRevokedCertificate(OooO00o(obj));
                if (x509CRLEntry != null) {
                    X500Principal certificateIssuer = x509CRLEntry.getCertificateIssuer();
                    if (!LLl11i.OooO00o(obj).equals(certificateIssuer == null ? LLl11i.OooO00o(x509crl) : l1LILI1.OooO00o(certificateIssuer.getEncoded()))) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!LLl11i.OooO00o(obj).equals(LLl11i.OooO00o(x509crl)) || (x509CRLEntry = x509crl.getRevokedCertificate(OooO00o(obj))) == null) {
                return;
            }
            C5841L11I r6 = null;
            if (x509CRLEntry.hasExtensions()) {
                try {
                    r6 = C5841L11I.OooO00o((Object) OooO00o(x509CRLEntry, C5237III.o00OooO.m16387OooO0O0()));
                } catch (Exception e) {
                    throw new AnnotatedException("Reason code CRL entry extension could not be decoded.", e);
                }
            }
            if (date.getTime() >= x509CRLEntry.getRevocationDate().getTime() || r6 == null || r6.OooO00o().intValue() == 0 || r6.OooO00o().intValue() == 1 || r6.OooO00o().intValue() == 2 || r6.OooO00o().intValue() == 8) {
                ll11lii.OooO00o(r6 != null ? r6.OooO00o().intValue() : 0);
                ll11lii.OooO00o(x509CRLEntry.getRevocationDate());
            }
        } catch (CRLException e2) {
            throw new AnnotatedException("Failed check for indirect CRL.", e2);
        }
    }

    public static void OooO00o(Set set, Object obj) throws AnnotatedException {
        if (!set.isEmpty()) {
            return;
        }
        if (obj instanceof AbstractC9605iL11) {
            throw new AnnotatedException("No CRLs found for issuer \"" + ((AbstractC9605iL11) obj).m21662OooO00o().m21591OooO00o()[0] + "\"");
        }
        throw new AnnotatedException("No CRLs found for issuer \"" + I1IiLiI.OooO00o.m16231OooO00o(LLl11i.OooO00o((X509Certificate) obj)) + "\"");
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
    public static boolean m17535OooO00o(int i, List[] listArr, LlLI1 llLI1, Set set) {
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

    public static boolean OooO00o(X509CRL x509crl) {
        Set<String> criticalExtensionOIDs = x509crl.getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        return criticalExtensionOIDs.contains(C6396iiLiL.OooO0o);
    }

    public static boolean OooO00o(X509Certificate x509Certificate) {
        return x509Certificate.getSubjectDN().equals(x509Certificate.getIssuerDN());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17536OooO00o(X509Certificate x509Certificate, Set set, String str) throws AnnotatedException {
        try {
            return OooO00o(x509Certificate, set, str) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean OooO00o(Set set) {
        return set == null || set.contains("2.5.29.32.0") || set.isEmpty();
    }
}
