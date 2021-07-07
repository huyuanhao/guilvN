package com.p118pd.sdk;

import com.p118pd.sdk.C11lILlL;
import com.p118pd.sdk.C6043i1l1l;
import com.p118pd.sdk.C6045i1lIi;
import com.p118pd.sdk.C6422iIi;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.cert.CRL;
import java.security.cert.CertPath;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.PKIXCertPathChecker;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.security.cert.X509Extension;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.exception.ExtCertPathValidatorException;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.jce.provider.PKIXNameConstraintValidatorException;

/* renamed from: com.pd.sdk.i丨iLi丨L  reason: invalid class name and case insensitive filesystem */
public class C6396iiLiL {
    public static final String OooO = C5237III.o00o000.m16387OooO0O0();
    public static final int OooO00o = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final C5695Li1 f18204OooO00o = new C5695Li1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f18205OooO00o = C5237III.o00o000O.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f18206OooO00o = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final int OooO0O0 = 6;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f18207OooO0O0 = C5237III.o00o000o.m16387OooO0O0();
    public static final String OooO0OO = C5237III.o00o00o0.m16387OooO0O0();
    public static final String OooO0Oo = C5237III.o00OoooO.m16387OooO0O0();
    public static final String OooO0o = C5237III.o0O00o0.m16387OooO0O0();
    public static final String OooO0o0 = C5237III.o00o00Oo.m16387OooO0O0();
    public static final String OooO0oO = C5237III.o00o00.m16387OooO0O0();
    public static final String OooO0oo = C5237III.o00Ooo0o.m16387OooO0O0();
    public static final String OooOO0 = C5237III.o00Ooo0.m16387OooO0O0();
    public static final String OooOO0O = C5237III.o00o0000.m16387OooO0O0();
    public static final String OooOO0o = C5237III.oo00oO.m16387OooO0O0();
    public static final String OooOOO = C5237III.o00OooO0.m16387OooO0O0();
    public static final String OooOOO0 = C5237III.o00OoOoo.m16387OooO0O0();
    public static final String OooOOOO = "2.5.29.32.0";

    public static int OooO(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0oO));
            if (OooO00o2 != null) {
                Enumeration OooO00o3 = OooO00o2.m15236OooO00o();
                while (OooO00o3.hasMoreElements()) {
                    AbstractC5903LlLLL r1 = (AbstractC5903LlLLL) OooO00o3.nextElement();
                    if (r1.OooO00o() == 0) {
                        try {
                            if (C6513lIiI.OooO00o(r1, false).m17647OooO0O0().intValue() == 0) {
                                return 0;
                            }
                        } catch (Exception e) {
                            throw new ExtCertPathValidatorException("Policy constraints requireExplicitPolicy field could not be decoded.", e, certPath, i);
                        }
                    }
                }
            }
            return i2;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy constraints could not be decoded.", e2, certPath, i);
        }
    }

    public static int OooO00o(int i, X509Certificate x509Certificate) {
        return (C6421iIIL1i.OooO00o(x509Certificate) || i == 0) ? i : i - 1;
    }

    public static int OooO00o(CertPath certPath, int i, int i2) {
        return (C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static C6468l1L OooO00o(X509CRL x509crl, C9621ii1iL r2) throws AnnotatedException {
        try {
            i1LlI OooO00o2 = i1LlI.OooO00o(C6421iIIL1i.OooO00o(x509crl, OooO0Oo));
            if (OooO00o2 != null && OooO00o2.OooO00o() != null && r2.OooO00o() != null) {
                return new C6468l1L(r2.OooO00o()).OooO00o(new C6468l1L(OooO00o2.OooO00o()));
            }
            if ((OooO00o2 == null || OooO00o2.OooO00o() == null) && r2.OooO00o() == null) {
                return C6468l1L.OooO00o;
            }
            return (r2.OooO00o() == null ? C6468l1L.OooO00o : new C6468l1L(r2.OooO00o())).OooO00o(OooO00o2 == null ? C6468l1L.OooO00o : new C6468l1L(OooO00o2.OooO00o()));
        } catch (Exception e) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e);
        }
    }

    public static C9511Lil OooO00o(CertPath certPath, int i, C9511Lil r4) throws CertPathValidatorException {
        try {
            if (I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), f18205OooO00o)) == null) {
                return null;
            }
            return r4;
        } catch (AnnotatedException e) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e, certPath, i);
        }
    }

    public static C9511Lil OooO00o(CertPath certPath, int i, Set set, C9511Lil r21, List[] listArr, int i2) throws CertPathValidatorException {
        String OooO0O02;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i3 = size - i;
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o(x509Certificate, f18205OooO00o));
            if (OooO00o2 == null || r21 == null) {
                return null;
            }
            Enumeration OooO00o3 = OooO00o2.m15236OooO00o();
            HashSet hashSet = new HashSet();
            while (OooO00o3.hasMoreElements()) {
                C9879iI OooO00o4 = C9879iI.OooO00o(OooO00o3.nextElement());
                LlLI1 OooO00o5 = OooO00o4.m21960OooO00o();
                hashSet.add(OooO00o5.m16387OooO0O0());
                if (!"2.5.29.32.0".equals(OooO00o5.m16387OooO0O0())) {
                    try {
                        Set OooO00o6 = C6421iIIL1i.OooO00o(OooO00o4.OooO00o());
                        if (!C6421iIIL1i.m17535OooO00o(i3, listArr, OooO00o5, OooO00o6)) {
                            C6421iIIL1i.OooO00o(i3, listArr, OooO00o5, OooO00o6);
                        }
                    } catch (CertPathValidatorException e) {
                        throw new ExtCertPathValidatorException("Policy qualifier info set could not be build.", e, certPath, i);
                    }
                }
            }
            if (set.isEmpty() || set.contains("2.5.29.32.0")) {
                set.clear();
                set.addAll(hashSet);
            } else {
                HashSet hashSet2 = new HashSet();
                for (Object obj : set) {
                    if (hashSet.contains(obj)) {
                        hashSet2.add(obj);
                    }
                }
                set.clear();
                set.addAll(hashSet2);
            }
            if (i2 > 0 || (i3 < size && C6421iIIL1i.OooO00o(x509Certificate))) {
                Enumeration OooO00o7 = OooO00o2.m15236OooO00o();
                while (true) {
                    if (!OooO00o7.hasMoreElements()) {
                        break;
                    }
                    C9879iI OooO00o8 = C9879iI.OooO00o(OooO00o7.nextElement());
                    if ("2.5.29.32.0".equals(OooO00o8.m21960OooO00o().m16387OooO0O0())) {
                        Set OooO00o9 = C6421iIIL1i.OooO00o(OooO00o8.OooO00o());
                        List list = listArr[i3 - 1];
                        for (int i4 = 0; i4 < list.size(); i4++) {
                            C9511Lil r15 = (C9511Lil) list.get(i4);
                            for (Object obj2 : r15.getExpectedPolicies()) {
                                if (obj2 instanceof String) {
                                    OooO0O02 = (String) obj2;
                                } else if (obj2 instanceof LlLI1) {
                                    OooO0O02 = ((LlLI1) obj2).m16387OooO0O0();
                                }
                                Iterator children = r15.getChildren();
                                boolean z = false;
                                while (children.hasNext()) {
                                    if (OooO0O02.equals(((C9511Lil) children.next()).getValidPolicy())) {
                                        z = true;
                                    }
                                }
                                if (!z) {
                                    HashSet hashSet3 = new HashSet();
                                    hashSet3.add(OooO0O02);
                                    C9511Lil r13 = new C9511Lil(new ArrayList(), i3, hashSet3, r15, OooO00o9, OooO0O02, false);
                                    r15.OooO00o(r13);
                                    listArr[i3].add(r13);
                                }
                            }
                        }
                    }
                }
            }
            C9511Lil r0 = r21;
            for (int i5 = i3 - 1; i5 >= 0; i5--) {
                List list2 = listArr[i5];
                for (int i6 = 0; i6 < list2.size(); i6++) {
                    C9511Lil r6 = (C9511Lil) list2.get(i6);
                    if (!r6.m21574OooO00o() && (r0 = C6421iIIL1i.OooO00o(r0, listArr, r6)) == null) {
                        break;
                    }
                }
            }
            Set<String> criticalExtensionOIDs = x509Certificate.getCriticalExtensionOIDs();
            if (criticalExtensionOIDs != null) {
                boolean contains = criticalExtensionOIDs.contains(f18205OooO00o);
                List list3 = listArr[i3];
                for (int i7 = 0; i7 < list3.size(); i7++) {
                    ((C9511Lil) list3.get(i7)).OooO00o(contains);
                }
            }
            return r0;
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Could not read certificate policies extension from certificate.", e2, certPath, i);
        }
    }

    public static C9511Lil OooO00o(CertPath certPath, int i, List[] listArr, C9511Lil r22, int i2) throws CertPathValidatorException {
        boolean z;
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size() - i;
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o(x509Certificate, f18207OooO0O0));
            if (OooO00o2 == null) {
                return r22;
            }
            HashMap hashMap = new HashMap();
            HashSet<String> hashSet = new HashSet();
            for (int i3 = 0; i3 < OooO00o2.size(); i3++) {
                I11li1 i11li1 = (I11li1) OooO00o2.OooO00o(i3);
                String OooO0O02 = ((LlLI1) i11li1.OooO00o(0)).m16387OooO0O0();
                String OooO0O03 = ((LlLI1) i11li1.OooO00o(1)).m16387OooO0O0();
                if (!hashMap.containsKey(OooO0O02)) {
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(OooO0O03);
                    hashMap.put(OooO0O02, hashSet2);
                    hashSet.add(OooO0O02);
                } else {
                    ((Set) hashMap.get(OooO0O02)).add(OooO0O03);
                }
            }
            C9511Lil r17 = r22;
            for (String str : hashSet) {
                if (i2 > 0) {
                    Iterator it = listArr[size].iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        C9511Lil r6 = (C9511Lil) it.next();
                        if (r6.getValidPolicy().equals(str)) {
                            r6.f23091OooO00o = (Set) hashMap.get(str);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        Iterator it2 = listArr[size].iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            C9511Lil r62 = (C9511Lil) it2.next();
                            if ("2.5.29.32.0".equals(r62.getValidPolicy())) {
                                Set set = null;
                                try {
                                    Enumeration OooO00o3 = ((I11li1) C6421iIIL1i.OooO00o(x509Certificate, f18205OooO00o)).m15236OooO00o();
                                    while (true) {
                                        if (!OooO00o3.hasMoreElements()) {
                                            break;
                                        }
                                        try {
                                            C9879iI OooO00o4 = C9879iI.OooO00o(OooO00o3.nextElement());
                                            if ("2.5.29.32.0".equals(OooO00o4.m21960OooO00o().m16387OooO0O0())) {
                                                try {
                                                    set = C6421iIIL1i.OooO00o(OooO00o4.OooO00o());
                                                    break;
                                                } catch (CertPathValidatorException e) {
                                                    throw new ExtCertPathValidatorException("Policy qualifier info set could not be decoded.", e, certPath, i);
                                                }
                                            }
                                        } catch (Exception e2) {
                                            throw new CertPathValidatorException("Policy information could not be decoded.", e2, certPath, i);
                                        }
                                    }
                                    boolean contains = x509Certificate.getCriticalExtensionOIDs() != null ? x509Certificate.getCriticalExtensionOIDs().contains(f18205OooO00o) : false;
                                    C9511Lil r9 = (C9511Lil) r62.getParent();
                                    if ("2.5.29.32.0".equals(r9.getValidPolicy())) {
                                        C9511Lil r8 = new C9511Lil(new ArrayList(), size, (Set) hashMap.get(str), r9, set, str, contains);
                                        r9.OooO00o(r8);
                                        listArr[size].add(r8);
                                    }
                                } catch (AnnotatedException e3) {
                                    throw new ExtCertPathValidatorException("Certificate policies extension could not be decoded.", e3, certPath, i);
                                }
                            }
                        }
                    }
                } else if (i2 <= 0) {
                    Iterator it3 = listArr[size].iterator();
                    while (it3.hasNext()) {
                        C9511Lil r63 = (C9511Lil) it3.next();
                        if (r63.getValidPolicy().equals(str)) {
                            ((C9511Lil) r63.getParent()).OooO0O0(r63);
                            it3.remove();
                            for (int i4 = size - 1; i4 >= 0; i4--) {
                                List list = listArr[i4];
                                C9511Lil r82 = r17;
                                for (int i5 = 0; i5 < list.size(); i5++) {
                                    C9511Lil r10 = (C9511Lil) list.get(i5);
                                    if (!r10.m21574OooO00o() && (r82 = C6421iIIL1i.OooO00o(r82, listArr, r10)) == null) {
                                        break;
                                    }
                                }
                                r17 = r82;
                            }
                        }
                    }
                }
            }
            return r17;
        } catch (AnnotatedException e4) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e4, certPath, i);
        }
    }

    public static C9511Lil OooO00o(CertPath certPath, C11lILlL r7, Set set, int i, List[] listArr, C9511Lil r11, Set set2) throws CertPathValidatorException {
        int size = certPath.getCertificates().size();
        if (r11 != null) {
            if (!C6421iIIL1i.OooO00o(set)) {
                HashSet<C9511Lil> hashSet = new HashSet();
                for (List list : listArr) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        C9511Lil r1 = (C9511Lil) list.get(i2);
                        if ("2.5.29.32.0".equals(r1.getValidPolicy())) {
                            Iterator children = r1.getChildren();
                            while (children.hasNext()) {
                                C9511Lil r2 = (C9511Lil) children.next();
                                if (!"2.5.29.32.0".equals(r2.getValidPolicy())) {
                                    hashSet.add(r2);
                                }
                            }
                        }
                    }
                }
                for (C9511Lil r72 : hashSet) {
                    if (!set.contains(r72.getValidPolicy())) {
                        r11 = C6421iIIL1i.OooO00o(r11, listArr, r72);
                    }
                }
                if (r11 != null) {
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        List list2 = listArr[i3];
                        for (int i4 = 0; i4 < list2.size(); i4++) {
                            C9511Lil r8 = (C9511Lil) list2.get(i4);
                            if (!r8.m21574OooO00o()) {
                                r11 = C6421iIIL1i.OooO00o(r11, listArr, r8);
                            }
                        }
                    }
                }
            } else if (r7.m21248OooO0O0()) {
                if (!set2.isEmpty()) {
                    HashSet<C9511Lil> hashSet2 = new HashSet();
                    for (List list3 : listArr) {
                        for (int i5 = 0; i5 < list3.size(); i5++) {
                            C9511Lil r12 = (C9511Lil) list3.get(i5);
                            if ("2.5.29.32.0".equals(r12.getValidPolicy())) {
                                Iterator children2 = r12.getChildren();
                                while (children2.hasNext()) {
                                    hashSet2.add(children2.next());
                                }
                            }
                        }
                    }
                    for (C9511Lil r73 : hashSet2) {
                        set2.contains(r73.getValidPolicy());
                    }
                    if (r11 != null) {
                        for (int i6 = size - 1; i6 >= 0; i6--) {
                            List list4 = listArr[i6];
                            for (int i7 = 0; i7 < list4.size(); i7++) {
                                C9511Lil r82 = (C9511Lil) list4.get(i7);
                                if (!r82.m21574OooO00o()) {
                                    r11 = C6421iIIL1i.OooO00o(r11, listArr, r82);
                                }
                            }
                        }
                    }
                } else {
                    throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
                }
            }
            return r11;
        } else if (!r7.m21248OooO0O0()) {
            return null;
        } else {
            throw new ExtCertPathValidatorException("Explicit policy requested but none available.", null, certPath, i);
        }
    }

    public static PublicKey OooO00o(X509CRL x509crl, Set set) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            PublicKey publicKey = (PublicKey) it.next();
            try {
                x509crl.verify(publicKey);
                return publicKey;
            } catch (Exception e2) {
                e = e2;
            }
        }
        throw new AnnotatedException("Cannot verify CRL.", e);
    }

    public static X509CRL OooO00o(Set set, PublicKey publicKey) throws AnnotatedException {
        Iterator it = set.iterator();
        Exception e = null;
        while (it.hasNext()) {
            X509CRL x509crl = (X509CRL) it.next();
            try {
                x509crl.verify(publicKey);
                return x509crl;
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (e == null) {
            return null;
        }
        throw new AnnotatedException("Cannot verify delta CRL.", e);
    }

    public static Set OooO00o(X509CRL x509crl, Object obj, X509Certificate x509Certificate, PublicKey publicKey, C11lILlL r11, List list, ii1I11l ii1i11l) throws AnnotatedException {
        int i;
        X509CertSelector x509CertSelector = new X509CertSelector();
        try {
            x509CertSelector.setSubject(LLl11i.OooO00o(x509crl).getEncoded());
            C6422iIi<? extends Certificate> OooO00o2 = new C6422iIi.OooO0O0(x509CertSelector).OooO00o();
            try {
                Collection OooO00o3 = C6421iIIL1i.OooO00o(OooO00o2, r11.OooO0Oo());
                OooO00o3.addAll(C6421iIIL1i.OooO00o(OooO00o2, r11.OooO0OO()));
                OooO00o3.add(x509Certificate);
                Iterator it = OooO00o3.iterator();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate2.equals(x509Certificate)) {
                        arrayList.add(x509Certificate2);
                        arrayList2.add(publicKey);
                    } else {
                        try {
                            C6164iLIli ilili = new C6164iLIli();
                            X509CertSelector x509CertSelector2 = new X509CertSelector();
                            x509CertSelector2.setCertificate(x509Certificate2);
                            C11lILlL.OooO0O0 OooO00o4 = new C11lILlL.OooO0O0(r11).OooO00o(new C6422iIi.OooO0O0(x509CertSelector2).OooO00o());
                            if (list.contains(x509Certificate2)) {
                                OooO00o4.m21251OooO00o(false);
                            } else {
                                OooO00o4.m21251OooO00o(true);
                            }
                            List<? extends Certificate> certificates = ilili.engineBuild(new C6045i1lIi.OooO0O0(OooO00o4.OooO00o()).OooO00o()).getCertPath().getCertificates();
                            arrayList.add(x509Certificate2);
                            arrayList2.add(C6421iIIL1i.OooO00o(certificates, 0, ii1i11l));
                        } catch (CertPathBuilderException e) {
                            throw new AnnotatedException("CertPath for CRL signer failed to validate.", e);
                        } catch (CertPathValidatorException e2) {
                            throw new AnnotatedException("Public key of issuer certificate of CRL could not be retrieved.", e2);
                        } catch (Exception e3) {
                            throw new AnnotatedException(e3.getMessage());
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                AnnotatedException annotatedException = null;
                for (i = 0; i < arrayList.size(); i++) {
                    boolean[] keyUsage = ((X509Certificate) arrayList.get(i)).getKeyUsage();
                    if (keyUsage == null || (keyUsage.length >= 7 && keyUsage[6])) {
                        hashSet.add(arrayList2.get(i));
                    } else {
                        annotatedException = new AnnotatedException("Issuer certificate key usage extension does not permit CRL signing.");
                    }
                }
                if (hashSet.isEmpty() && annotatedException == null) {
                    throw new AnnotatedException("Cannot find a valid issuer certificate.");
                } else if (!hashSet.isEmpty() || annotatedException == null) {
                    return hashSet;
                } else {
                    throw annotatedException;
                }
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Issuer certificate for CRL cannot be searched.", e4);
            }
        } catch (IOException e5) {
            throw new AnnotatedException("Subject criteria for certificate selector to find issuer certificate for CRL could not be set.", e5);
        }
    }

    public static Set OooO00o(Date date, C11lILlL r4, X509Certificate x509Certificate, X509CRL x509crl) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        if (r4.OooO0o0()) {
            try {
                C6251iiLilL OooO00o2 = C6251iiLilL.OooO00o(C6421iIIL1i.OooO00o(x509Certificate, OooO0o0));
                if (OooO00o2 == null) {
                    try {
                        OooO00o2 = C6251iiLilL.OooO00o(C6421iIIL1i.OooO00o(x509crl, OooO0o0));
                    } catch (AnnotatedException e) {
                        throw new AnnotatedException("Freshest CRL extension could not be decoded from CRL.", e);
                    }
                }
                if (OooO00o2 != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(r4.m21241OooO00o());
                    try {
                        arrayList.addAll(C6421iIIL1i.OooO00o(OooO00o2, r4.m21242OooO00o()));
                        try {
                            hashSet.addAll(C6421iIIL1i.OooO00o(date, x509crl, r4.OooO0OO(), arrayList));
                        } catch (AnnotatedException e2) {
                            throw new AnnotatedException("Exception obtaining delta CRLs.", e2);
                        }
                    } catch (AnnotatedException e3) {
                        throw new AnnotatedException("No new delta CRL locations could be added from Freshest CRL extension.", e3);
                    }
                }
            } catch (AnnotatedException e4) {
                throw new AnnotatedException("Freshest CRL extension could not be decoded from certificate.", e4);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void OooO00o(com.p118pd.sdk.C11lILlL r20, java.security.cert.X509Certificate r21, java.util.Date r22, java.security.cert.X509Certificate r23, java.security.PublicKey r24, java.util.List r25, com.p118pd.sdk.ii1I11l r26) throws org.bouncycastle.jce.provider.AnnotatedException {
        /*
        // Method dump skipped, instructions count: 400
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6396iiLiL.OooO00o(com.pd.sdk.丨11lILlL, java.security.cert.X509Certificate, java.util.Date, java.security.cert.X509Certificate, java.security.PublicKey, java.util.List, com.pd.sdk.ii1I11l):void");
    }

    public static void OooO00o(C9621ii1iL r21, C11lILlL r22, X509Certificate x509Certificate, Date date, X509Certificate x509Certificate2, PublicKey publicKey, ll11LIi ll11lii, C6468l1L r28, List list, ii1I11l ii1i11l) throws AnnotatedException {
        Iterator it;
        Date date2;
        C6468l1L r3;
        X509CRL OooO00o2;
        Set<String> criticalExtensionOIDs;
        C6468l1L r13 = r28;
        Date date3 = new Date(System.currentTimeMillis());
        if (date.getTime() <= date3.getTime()) {
            Iterator it2 = C6421iIIL1i.OooO00o(r21, x509Certificate, date3, r22).iterator();
            AnnotatedException e = null;
            boolean z = false;
            while (it2.hasNext() && ll11lii.OooO00o() == 11 && !r28.m17605OooO00o()) {
                try {
                    X509CRL x509crl = (X509CRL) it2.next();
                    C6468l1L OooO00o3 = OooO00o(x509crl, r21);
                    if (!OooO00o3.m17606OooO00o(r13)) {
                        continue;
                    } else {
                        date2 = date3;
                        it = it2;
                        try {
                            OooO00o2 = r22.OooO0o0() ? OooO00o(C6421iIIL1i.OooO00o(r22.m21240OooO00o() != null ? r22.m21240OooO00o() : date2, x509crl, r22.OooO0OO(), r22.m21241OooO00o()), OooO00o(x509crl, OooO00o(x509crl, x509Certificate, x509Certificate2, publicKey, r22, list, ii1i11l))) : null;
                            if (r22.OooO00o() != 1) {
                                if (x509Certificate.getNotAfter().getTime() < x509crl.getThisUpdate().getTime()) {
                                    throw new AnnotatedException("No valid CRL for current time found.");
                                }
                            }
                            OooO00o(r21, x509Certificate, x509crl);
                            OooO0O0(r21, x509Certificate, x509crl);
                            OooO00o(OooO00o2, x509crl, r22);
                            OooO00o(date, OooO00o2, x509Certificate, ll11lii, r22);
                            OooO00o(date, x509crl, x509Certificate, ll11lii);
                            if (ll11lii.OooO00o() == 8) {
                                ll11lii.OooO00o(11);
                            }
                            r3 = r28;
                        } catch (AnnotatedException e2) {
                            e = e2;
                            r3 = r28;
                            r13 = r3;
                            date3 = date2;
                            it2 = it;
                        }
                        try {
                            r3.m17604OooO00o(OooO00o3);
                            Set<String> criticalExtensionOIDs2 = x509crl.getCriticalExtensionOIDs();
                            if (criticalExtensionOIDs2 != null) {
                                HashSet hashSet = new HashSet(criticalExtensionOIDs2);
                                hashSet.remove(C5237III.o00OoooO.m16387OooO0O0());
                                hashSet.remove(C5237III.o0O00o0.m16387OooO0O0());
                                if (!hashSet.isEmpty()) {
                                    throw new AnnotatedException("CRL contains unsupported critical extensions.");
                                }
                            }
                            if (!(OooO00o2 == null || (criticalExtensionOIDs = OooO00o2.getCriticalExtensionOIDs()) == null)) {
                                HashSet hashSet2 = new HashSet(criticalExtensionOIDs);
                                hashSet2.remove(C5237III.o00OoooO.m16387OooO0O0());
                                hashSet2.remove(C5237III.o0O00o0.m16387OooO0O0());
                                if (!hashSet2.isEmpty()) {
                                    throw new AnnotatedException("Delta CRL contains unsupported critical extension.");
                                }
                            }
                            r13 = r3;
                            date3 = date2;
                            it2 = it;
                            e = e;
                            z = true;
                        } catch (AnnotatedException e3) {
                            e = e3;
                            r13 = r3;
                            date3 = date2;
                            it2 = it;
                        }
                    }
                } catch (AnnotatedException e4) {
                    e = e4;
                    r3 = r13;
                    date2 = date3;
                    it = it2;
                    r13 = r3;
                    date3 = date2;
                    it2 = it;
                }
            }
            if (!z) {
                throw e;
            }
            return;
        }
        throw new AnnotatedException("Validation time is in future.");
    }

    public static void OooO00o(C9621ii1iL r5, Object obj, X509CRL x509crl) throws AnnotatedException {
        AbstractC6122iIlLiL OooO00o2 = C6421iIIL1i.OooO00o(x509crl, OooO0Oo);
        int i = 0;
        boolean z = OooO00o2 != null && i1LlI.OooO00o(OooO00o2).m16881OooO00o();
        try {
            byte[] encoded = LLl11i.OooO00o(x509crl).getEncoded();
            if (r5.m21683OooO00o() != null) {
                ILI[] OooO00o3 = r5.m21683OooO00o().OooO00o();
                int i2 = 0;
                while (i < OooO00o3.length) {
                    if (OooO00o3[i].OooO00o() == 4) {
                        try {
                            if (C9586iIILl.m21627OooO00o(OooO00o3[i].m15483OooO0O0().OooO0O0().getEncoded(), encoded)) {
                                i2 = 1;
                            }
                        } catch (IOException e) {
                            throw new AnnotatedException("CRL issuer information from distribution point cannot be decoded.", e);
                        }
                    }
                    i++;
                }
                if (i2 != 0 && !z) {
                    throw new AnnotatedException("Distribution point contains cRLIssuer field but CRL is not indirect.");
                } else if (i2 != 0) {
                    i = i2;
                } else {
                    throw new AnnotatedException("CRL issuer of CRL does not match CRL issuer of distribution point.");
                }
            } else if (LLl11i.OooO00o(x509crl).equals(LLl11i.OooO00o(obj))) {
                i = 1;
            }
            if (i == 0) {
                throw new AnnotatedException("Cannot find matching CRL issuer for certificate.");
            }
        } catch (IOException e2) {
            throw new AnnotatedException("Exception encoding CRL issuer: " + e2.getMessage(), e2);
        }
    }

    public static void OooO00o(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), f18207OooO0O0));
            if (OooO00o2 != null) {
                for (int i2 = 0; i2 < OooO00o2.size(); i2++) {
                    try {
                        I11li1 OooO00o3 = I11li1.OooO00o(OooO00o2.OooO00o(i2));
                        LlLI1 OooO00o4 = LlLI1.OooO00o(OooO00o3.OooO00o(0));
                        LlLI1 OooO00o5 = LlLI1.OooO00o(OooO00o3.OooO00o(1));
                        if ("2.5.29.32.0".equals(OooO00o4.m16387OooO0O0())) {
                            throw new CertPathValidatorException("IssuerDomainPolicy is anyPolicy", null, certPath, i);
                        } else if ("2.5.29.32.0".equals(OooO00o5.m16387OooO0O0())) {
                            throw new CertPathValidatorException("SubjectDomainPolicy is anyPolicy,", null, certPath, i);
                        }
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Policy mappings extension contents could not be decoded.", e, certPath, i);
                    }
                }
            }
        } catch (AnnotatedException e2) {
            throw new ExtCertPathValidatorException("Policy mappings extension could not be decoded.", e2, certPath, i);
        }
    }

    public static void OooO00o(CertPath certPath, int i, C5244II1 r5) throws CertPathValidatorException {
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooOO0O));
            llLil1l OooO00o3 = OooO00o2 != null ? llLil1l.OooO00o((Object) OooO00o2) : null;
            if (OooO00o3 != null) {
                C9603iL1[] OooO0O02 = OooO00o3.m17889OooO0O0();
                if (OooO0O02 != null) {
                    try {
                        r5.OooO00o(OooO0O02);
                    } catch (Exception e) {
                        throw new ExtCertPathValidatorException("Permitted subtrees cannot be build from name constraints extension.", e, certPath, i);
                    }
                }
                C9603iL1[] OooO00o4 = OooO00o3.OooO00o();
                if (OooO00o4 != null) {
                    for (int i2 = 0; i2 != OooO00o4.length; i2++) {
                        try {
                            r5.OooO00o(OooO00o4[i2]);
                        } catch (Exception e2) {
                            throw new ExtCertPathValidatorException("Excluded subtrees cannot be build from name constraints extension.", e2, certPath, i);
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw new ExtCertPathValidatorException("Name constraints extension could not be decoded.", e3, certPath, i);
        }
    }

    public static void OooO00o(CertPath certPath, int i, C9511Lil r3, int i2) throws CertPathValidatorException {
        if (i2 <= 0 && r3 == null) {
            throw new ExtCertPathValidatorException("No valid policy tree found when one expected.", null, certPath, i);
        }
    }

    public static void OooO00o(CertPath certPath, int i, List list, Set set) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new ExtCertPathValidatorException(e.getMessage(), e, certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
        }
    }

    public static void OooO00o(CertPath certPath, int i, Set set, List list) throws CertPathValidatorException {
        X509Certificate x509Certificate = (X509Certificate) certPath.getCertificates().get(i);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((PKIXCertPathChecker) it.next()).check(x509Certificate, set);
            } catch (CertPathValidatorException e) {
                throw new CertPathValidatorException(e.getMessage(), e.getCause(), certPath, i);
            }
        }
        if (!set.isEmpty()) {
            throw new ExtCertPathValidatorException("Certificate has unsupported critical extension: " + set, null, certPath, i);
        }
    }

    public static void OooO00o(CertPath certPath, C11lILlL r13, int i, PublicKey publicKey, boolean z, l1LILI1 r17, X509Certificate x509Certificate, ii1I11l ii1i11l) throws ExtCertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate2 = (X509Certificate) certificates.get(i);
        if (!z) {
            try {
                C6421iIIL1i.OooO00o(x509Certificate2, publicKey, r13.OooO0O0());
            } catch (GeneralSecurityException e) {
                throw new ExtCertPathValidatorException("Could not validate certificate signature.", e, certPath, i);
            }
        }
        try {
            x509Certificate2.checkValidity(C6421iIIL1i.OooO00o(r13, certPath, i));
            if (r13.m21250OooO0Oo()) {
                try {
                    OooO00o(r13, x509Certificate2, C6421iIIL1i.OooO00o(r13, certPath, i), x509Certificate, publicKey, certificates, ii1i11l);
                } catch (AnnotatedException e2) {
                    throw new ExtCertPathValidatorException(e2.getMessage(), e2.getCause() != null ? e2.getCause() : e2, certPath, i);
                }
            }
            if (!LLl11i.OooO00o((Object) x509Certificate2).equals(r17)) {
                throw new ExtCertPathValidatorException("IssuerName(" + LLl11i.OooO00o((Object) x509Certificate2) + ") does not match SubjectName(" + r17 + ") of signing certificate.", null, certPath, i);
            }
        } catch (CertificateExpiredException e3) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e3.getMessage(), e3, certPath, i);
        } catch (CertificateNotYetValidException e4) {
            throw new ExtCertPathValidatorException("Could not validate certificate: " + e4.getMessage(), e4, certPath, i);
        } catch (AnnotatedException e5) {
            throw new ExtCertPathValidatorException("Could not validate time of certificate.", e5, certPath, i);
        }
    }

    public static void OooO00o(X509CRL x509crl, X509CRL x509crl2, C11lILlL r5) throws AnnotatedException {
        if (x509crl != null) {
            try {
                i1LlI OooO00o2 = i1LlI.OooO00o(C6421iIIL1i.OooO00o(x509crl2, OooO0Oo));
                if (!r5.OooO0o0()) {
                    return;
                }
                if (LLl11i.OooO00o(x509crl).equals(LLl11i.OooO00o(x509crl2))) {
                    try {
                        i1LlI OooO00o3 = i1LlI.OooO00o(C6421iIIL1i.OooO00o(x509crl, OooO0Oo));
                        boolean z = false;
                        if (OooO00o2 != null ? OooO00o2.equals(OooO00o3) : OooO00o3 == null) {
                            z = true;
                        }
                        if (z) {
                            try {
                                AbstractC6122iIlLiL OooO00o4 = C6421iIIL1i.OooO00o(x509crl2, OooOO0o);
                                try {
                                    AbstractC6122iIlLiL OooO00o5 = C6421iIIL1i.OooO00o(x509crl, OooOO0o);
                                    if (OooO00o4 == null) {
                                        throw new AnnotatedException("CRL authority key identifier is null.");
                                    } else if (OooO00o5 == null) {
                                        throw new AnnotatedException("Delta CRL authority key identifier is null.");
                                    } else if (!OooO00o4.equals(OooO00o5)) {
                                        throw new AnnotatedException("Delta CRL authority key identifier does not match complete CRL authority key identifier.");
                                    }
                                } catch (AnnotatedException e) {
                                    throw new AnnotatedException("Authority key identifier extension could not be extracted from delta CRL.", e);
                                }
                            } catch (AnnotatedException e2) {
                                throw new AnnotatedException("Authority key identifier extension could not be extracted from complete CRL.", e2);
                            }
                        } else {
                            throw new AnnotatedException("Issuing distribution point extension from delta CRL and complete CRL does not match.");
                        }
                    } catch (Exception e3) {
                        throw new AnnotatedException("Issuing distribution point extension from delta CRL could not be decoded.", e3);
                    }
                } else {
                    throw new AnnotatedException("Complete CRL issuer does not match delta CRL issuer.");
                }
            } catch (Exception e4) {
                throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
            }
        }
    }

    public static void OooO00o(Date date, X509CRL x509crl, Object obj, ll11LIi ll11lii) throws AnnotatedException {
        if (ll11lii.OooO00o() == 11) {
            C6421iIIL1i.OooO00o(date, x509crl, obj, ll11lii);
        }
    }

    public static void OooO00o(Date date, X509CRL x509crl, Object obj, ll11LIi ll11lii, C11lILlL r4) throws AnnotatedException {
        if (r4.OooO0o0() && x509crl != null) {
            C6421iIIL1i.OooO00o(date, x509crl, obj, ll11lii);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Set[] m17516OooO00o(Date date, C11lILlL r6, X509Certificate x509Certificate, X509CRL x509crl) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        X509CRLSelector x509CRLSelector = new X509CRLSelector();
        x509CRLSelector.setCertificateChecking(x509Certificate);
        try {
            x509CRLSelector.addIssuerName(LLl11i.OooO00o(x509crl).getEncoded());
            C6043i1l1l<? extends CRL> OooO00o2 = new C6043i1l1l.OooO0O0(x509CRLSelector).OooO00o(true).OooO00o();
            if (r6.m21240OooO00o() != null) {
                date = r6.m21240OooO00o();
            }
            Set OooO00o3 = f18204OooO00o.OooO00o(OooO00o2, date, r6.OooO0OO(), r6.m21241OooO00o());
            if (r6.OooO0o0()) {
                try {
                    hashSet.addAll(C6421iIIL1i.OooO00o(date, x509crl, r6.OooO0OO(), r6.m21241OooO00o()));
                } catch (AnnotatedException e) {
                    throw new AnnotatedException("Exception obtaining delta CRLs.", e);
                }
            }
            return new Set[]{OooO00o3, hashSet};
        } catch (IOException e2) {
            throw new AnnotatedException("Cannot extract issuer from CRL." + e2, e2);
        }
    }

    public static int OooO0O0(CertPath certPath, int i, int i2) {
        return (C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static void OooO0O0(C9621ii1iL r9, Object obj, X509CRL x509crl) throws AnnotatedException {
        ILI[] iliArr;
        ILI[] OooO00o2;
        try {
            i1LlI OooO00o3 = i1LlI.OooO00o(C6421iIIL1i.OooO00o(x509crl, OooO0Oo));
            if (OooO00o3 != null) {
                if (OooO00o3.m16880OooO00o() != null) {
                    C5633LIiII OooO00o4 = i1LlI.OooO00o(OooO00o3).m16880OooO00o();
                    ArrayList arrayList = new ArrayList();
                    boolean z = false;
                    if (OooO00o4.OooO0O0() == 0) {
                        for (ILI ili : C5845LIillll.OooO00o(OooO00o4.m16111OooO0O0()).OooO00o()) {
                            arrayList.add(ili);
                        }
                    }
                    if (OooO00o4.OooO0O0() == 1) {
                        iILLL1 r3 = new iILLL1();
                        try {
                            Enumeration OooO00o5 = I11li1.OooO00o(LLl11i.OooO00o(x509crl)).m15236OooO00o();
                            while (OooO00o5.hasMoreElements()) {
                                r3.OooO00o((AbstractC6854lLi1LL) OooO00o5.nextElement());
                            }
                            r3.OooO00o(OooO00o4.m16111OooO0O0());
                            arrayList.add(new ILI(l1LILI1.OooO00o(new C5707LiL1(r3))));
                        } catch (Exception e) {
                            throw new AnnotatedException("Could not read CRL issuer.", e);
                        }
                    }
                    if (r9.m21682OooO00o() != null) {
                        C5633LIiII OooO00o6 = r9.m21682OooO00o();
                        ILI[] iliArr2 = null;
                        if (OooO00o6.OooO0O0() == 0) {
                            iliArr2 = C5845LIillll.OooO00o(OooO00o6.m16111OooO0O0()).OooO00o();
                        }
                        if (OooO00o6.OooO0O0() == 1) {
                            if (r9.m21683OooO00o() != null) {
                                iliArr = r9.m21683OooO00o().OooO00o();
                            } else {
                                iliArr = new ILI[1];
                                try {
                                    iliArr[0] = new ILI(l1LILI1.OooO00o(LLl11i.OooO00o(obj).getEncoded()));
                                } catch (Exception e2) {
                                    throw new AnnotatedException("Could not read certificate issuer.", e2);
                                }
                            }
                            iliArr2 = iliArr;
                            for (int i = 0; i < iliArr2.length; i++) {
                                Enumeration OooO00o7 = I11li1.OooO00o((Object) iliArr2[i].m15483OooO0O0().OooO0O0()).m15236OooO00o();
                                iILLL1 r7 = new iILLL1();
                                while (OooO00o7.hasMoreElements()) {
                                    r7.OooO00o((AbstractC6854lLi1LL) OooO00o7.nextElement());
                                }
                                r7.OooO00o(OooO00o6.m16111OooO0O0());
                                iliArr2[i] = new ILI(l1LILI1.OooO00o(new C5707LiL1(r7)));
                            }
                        }
                        if (iliArr2 != null) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= iliArr2.length) {
                                    break;
                                } else if (arrayList.contains(iliArr2[i2])) {
                                    z = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                        if (!z) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else if (r9.m21683OooO00o() != null) {
                        ILI[] OooO00o8 = r9.m21683OooO00o().OooO00o();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= OooO00o8.length) {
                                break;
                            } else if (arrayList.contains(OooO00o8[i3])) {
                                z = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (!z) {
                            throw new AnnotatedException("No match for certificate CRL issuing distribution point name to cRLIssuer CRL distribution point.");
                        }
                    } else {
                        throw new AnnotatedException("Either the cRLIssuer or the distributionPoint field must be contained in DistributionPoint.");
                    }
                }
                try {
                    iLII1ii OooO00o9 = iLII1ii.OooO00o(C6421iIIL1i.OooO00o((X509Extension) obj, OooO0oo));
                    if (obj instanceof X509Certificate) {
                        if (OooO00o3.OooO0Oo() && OooO00o9 != null && OooO00o9.m17107OooO00o()) {
                            throw new AnnotatedException("CA Cert CRL only contains user certificates.");
                        } else if (OooO00o3.OooO0OO() && (OooO00o9 == null || !OooO00o9.m17107OooO00o())) {
                            throw new AnnotatedException("End CRL only contains CA certificates.");
                        }
                    }
                    if (OooO00o3.m16882OooO0O0()) {
                        throw new AnnotatedException("onlyContainsAttributeCerts boolean is asserted.");
                    }
                } catch (Exception e3) {
                    throw new AnnotatedException("Basic constraints extension could not be decoded.", e3);
                }
            }
        } catch (Exception e4) {
            throw new AnnotatedException("Issuing distribution point extension could not be decoded.", e4);
        }
    }

    public static void OooO0O0(CertPath certPath, int i) throws CertPathValidatorException {
        try {
            iLII1ii OooO00o2 = iLII1ii.OooO00o(C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0oo));
            if (OooO00o2 == null) {
                throw new CertPathValidatorException("Intermediate certificate lacks BasicConstraints");
            } else if (!OooO00o2.m17107OooO00o()) {
                throw new CertPathValidatorException("Not a CA certificate");
            }
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }

    public static void OooO0O0(CertPath certPath, int i, C5244II1 r9) throws CertPathValidatorException {
        List<? extends Certificate> certificates = certPath.getCertificates();
        X509Certificate x509Certificate = (X509Certificate) certificates.get(i);
        int size = certificates.size();
        int i2 = size - i;
        if (!C6421iIIL1i.OooO00o(x509Certificate) || i2 >= size) {
            try {
                I11li1 OooO00o2 = I11li1.OooO00o((Object) LLl11i.OooO0O0(x509Certificate).getEncoded());
                try {
                    r9.OooO0O0(OooO00o2);
                    r9.OooO00o(OooO00o2);
                    try {
                        C5845LIillll OooO00o3 = C5845LIillll.OooO00o(C6421iIIL1i.OooO00o(x509Certificate, OooOO0));
                        LILlIL[] OooO00o4 = l1LILI1.OooO00o(OooO00o2).OooO00o(C9388IiLL.OooOooo);
                        for (int i3 = 0; i3 != OooO00o4.length; i3++) {
                            ILI ili = new ILI(1, ((AbstractC98681) OooO00o4[i3].OooO00o().m16007OooO0O0()).OooO00o());
                            try {
                                r9.OooO0O0(ili);
                                r9.m15459OooO00o(ili);
                            } catch (PKIXNameConstraintValidatorException e) {
                                throw new CertPathValidatorException("Subtree check for certificate subject alternative email failed.", e, certPath, i);
                            }
                        }
                        if (OooO00o3 != null) {
                            try {
                                ILI[] OooO00o5 = OooO00o3.OooO00o();
                                for (int i4 = 0; i4 < OooO00o5.length; i4++) {
                                    try {
                                        r9.OooO0O0(OooO00o5[i4]);
                                        r9.m15459OooO00o(OooO00o5[i4]);
                                    } catch (PKIXNameConstraintValidatorException e2) {
                                        throw new CertPathValidatorException("Subtree check for certificate subject alternative name failed.", e2, certPath, i);
                                    }
                                }
                            } catch (Exception e3) {
                                throw new CertPathValidatorException("Subject alternative name contents could not be decoded.", e3, certPath, i);
                            }
                        }
                    } catch (Exception e4) {
                        throw new CertPathValidatorException("Subject alternative name extension could not be decoded.", e4, certPath, i);
                    }
                } catch (PKIXNameConstraintValidatorException e5) {
                    throw new CertPathValidatorException("Subtree check for certificate subject failed.", e5, certPath, i);
                }
            } catch (Exception e6) {
                throw new CertPathValidatorException("Exception extracting subject name when checking subtrees.", e6, certPath, i);
            }
        }
    }

    public static int OooO0OO(CertPath certPath, int i, int i2) {
        return (C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i)) || i2 == 0) ? i2 : i2 - 1;
    }

    public static void OooO0OO(CertPath certPath, int i) throws CertPathValidatorException {
        boolean[] keyUsage = ((X509Certificate) certPath.getCertificates().get(i)).getKeyUsage();
        if (keyUsage != null && !keyUsage[5]) {
            throw new ExtCertPathValidatorException("Issuer certificate keyusage extension is critical and does not permit key signing.", null, certPath, i);
        }
    }

    public static int OooO0Oo(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0oO));
            if (OooO00o2 != null) {
                Enumeration OooO00o3 = OooO00o2.m15236OooO00o();
                while (true) {
                    if (!OooO00o3.hasMoreElements()) {
                        break;
                    }
                    try {
                        AbstractC5903LlLLL OooO00o4 = AbstractC5903LlLLL.OooO00o(OooO00o3.nextElement());
                        if (OooO00o4.OooO00o() == 0) {
                            int intValue = C6513lIiI.OooO00o(OooO00o4, false).m17647OooO0O0().intValue();
                            if (intValue < i2) {
                                return intValue;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int OooO0o(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        int intValue;
        try {
            C6513lIiI OooO00o2 = C6513lIiI.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0OO));
            return (OooO00o2 == null || (intValue = OooO00o2.m17647OooO0O0().intValue()) >= i2) ? i2 : intValue;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Inhibit any-policy extension cannot be decoded.", e, certPath, i);
        }
    }

    public static int OooO0o0(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        try {
            I11li1 OooO00o2 = I11li1.OooO00o((Object) C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0oO));
            if (OooO00o2 != null) {
                Enumeration OooO00o3 = OooO00o2.m15236OooO00o();
                while (true) {
                    if (!OooO00o3.hasMoreElements()) {
                        break;
                    }
                    try {
                        AbstractC5903LlLLL OooO00o4 = AbstractC5903LlLLL.OooO00o(OooO00o3.nextElement());
                        if (OooO00o4.OooO00o() == 1) {
                            int intValue = C6513lIiI.OooO00o(OooO00o4, false).m17647OooO0O0().intValue();
                            if (intValue < i2) {
                                return intValue;
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        throw new ExtCertPathValidatorException("Policy constraints extension contents cannot be decoded.", e, certPath, i);
                    }
                }
            }
            return i2;
        } catch (Exception e2) {
            throw new ExtCertPathValidatorException("Policy constraints extension cannot be decoded.", e2, certPath, i);
        }
    }

    public static int OooO0oO(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        if (C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i))) {
            return i2;
        }
        if (i2 > 0) {
            return i2 - 1;
        }
        throw new ExtCertPathValidatorException("Max path length not greater than zero", null, certPath, i);
    }

    public static int OooO0oo(CertPath certPath, int i, int i2) throws CertPathValidatorException {
        BigInteger OooO00o2;
        int intValue;
        try {
            iLII1ii OooO00o3 = iLII1ii.OooO00o(C6421iIIL1i.OooO00o((X509Certificate) certPath.getCertificates().get(i), OooO0oo));
            return (OooO00o3 == null || (OooO00o2 = OooO00o3.OooO00o()) == null || (intValue = OooO00o2.intValue()) >= i2) ? i2 : intValue;
        } catch (Exception e) {
            throw new ExtCertPathValidatorException("Basic constraints extension cannot be decoded.", e, certPath, i);
        }
    }
}
