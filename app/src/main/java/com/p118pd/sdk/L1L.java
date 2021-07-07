package com.p118pd.sdk;

import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.CertStoreParameters;
import java.security.cert.CertStoreSpi;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.pd.sdk.L1L */
public class L1L extends CertStoreSpi {
    public i11iLI OooO00o;

    public L1L(CertStoreParameters certStoreParameters) throws InvalidAlgorithmParameterException {
        super(certStoreParameters);
        if (certStoreParameters instanceof i11iLI) {
            this.OooO00o = (i11iLI) certStoreParameters;
            return;
        }
        throw new InvalidAlgorithmParameterException("org.bouncycastle.jce.provider.MultiCertStoreSpi: parameter must be a MultiCertStoreParameters object\n" + certStoreParameters.toString());
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCRLs(CRLSelector cRLSelector) throws CertStoreException {
        boolean OooO00o2 = this.OooO00o.m16852OooO00o();
        List arrayList = OooO00o2 ? new ArrayList() : Collections.EMPTY_LIST;
        for (CertStore certStore : this.OooO00o.OooO00o()) {
            Collection<? extends CRL> cRLs = certStore.getCRLs(cRLSelector);
            if (OooO00o2) {
                arrayList.addAll(cRLs);
            } else if (!cRLs.isEmpty()) {
                return cRLs;
            }
        }
        return arrayList;
    }

    @Override // java.security.cert.CertStoreSpi
    public Collection engineGetCertificates(CertSelector certSelector) throws CertStoreException {
        boolean OooO00o2 = this.OooO00o.m16852OooO00o();
        List arrayList = OooO00o2 ? new ArrayList() : Collections.EMPTY_LIST;
        for (CertStore certStore : this.OooO00o.OooO00o()) {
            Collection<? extends Certificate> certificates = certStore.getCertificates(certSelector);
            if (OooO00o2) {
                arrayList.addAll(certificates);
            } else if (!certificates.isEmpty()) {
                return certificates;
            }
        }
        return arrayList;
    }
}
