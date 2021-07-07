package com.p118pd.sdk;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.PKIXParameters;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.ili1lL  reason: case insensitive filesystem */
public class C6324ili1lL {
    private final Collection OooO00o(C9801LIL r8, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof C6395iiLL) {
                try {
                    hashSet.addAll(((C6395iiLL) obj).OooO00o(r8));
                } catch (StoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(((CertStore) obj).getCRLs(r8));
                } catch (CertStoreException e2) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e2);
                }
            }
            z = true;
        }
        if (z || annotatedException2 == null) {
            return hashSet;
        }
        throw annotatedException2;
    }

    public Set OooO00o(C9801LIL r5, L1lLI l1lLI, Date date) throws AnnotatedException {
        X509Certificate certificateChecking;
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(OooO00o(r5, l1lLI.m15984OooO00o()));
            hashSet.addAll(OooO00o(r5, l1lLI.OooO0O0()));
            hashSet.addAll(OooO00o(r5, l1lLI.getCertStores()));
            HashSet hashSet2 = new HashSet();
            if (l1lLI.getDate() != null) {
                date = l1lLI.getDate();
            }
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date) && ((certificateChecking = r5.getCertificateChecking()) == null || x509crl.getThisUpdate().before(certificateChecking.getNotAfter()))) {
                    hashSet2.add(x509crl);
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }

    public Set OooO00o(C9801LIL r2, PKIXParameters pKIXParameters) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(OooO00o(r2, pKIXParameters.getCertStores()));
            return hashSet;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }
}
