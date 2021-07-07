package com.p118pd.sdk;

import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.jce.provider.AnnotatedException;
import org.bouncycastle.util.StoreException;

/* renamed from: com.pd.sdk.Li1  reason: case insensitive filesystem */
public class C5695Li1 {
    private final Collection OooO00o(C6043i1l1l i1l1l, List list) throws AnnotatedException {
        AnnotatedException annotatedException;
        HashSet hashSet = new HashSet();
        AnnotatedException annotatedException2 = null;
        boolean z = false;
        for (Object obj : list) {
            if (obj instanceof AbstractC6271iilI) {
                try {
                    hashSet.addAll(((AbstractC6271iilI) obj).OooO00o(i1l1l));
                } catch (StoreException e) {
                    annotatedException = new AnnotatedException("Exception searching in X.509 CRL store.", e);
                    annotatedException2 = annotatedException;
                }
            } else {
                try {
                    hashSet.addAll(C6043i1l1l.OooO00o(i1l1l, (CertStore) obj));
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

    public Set OooO00o(C6043i1l1l i1l1l, Date date, List list, List list2) throws AnnotatedException {
        X509Certificate OooO00o;
        HashSet<X509CRL> hashSet = new HashSet();
        try {
            hashSet.addAll(OooO00o(i1l1l, list2));
            hashSet.addAll(OooO00o(i1l1l, list));
            HashSet hashSet2 = new HashSet();
            for (X509CRL x509crl : hashSet) {
                if (x509crl.getNextUpdate().after(date) && ((OooO00o = i1l1l.m16900OooO00o()) == null || x509crl.getThisUpdate().before(OooO00o.getNotAfter()))) {
                    hashSet2.add(x509crl);
                }
            }
            return hashSet2;
        } catch (AnnotatedException e) {
            throw new AnnotatedException("Exception obtaining complete CRLs.", e);
        }
    }
}
