package com.p118pd.sdk;

import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.CRLSelector;
import java.security.cert.CertStore;
import java.security.cert.CertStoreException;
import java.security.cert.X509CRLSelector;
import java.security.cert.X509Certificate;
import java.util.Collection;

/* renamed from: com.pd.sdk.i1l1l  reason: case insensitive filesystem */
public class C6043i1l1l<T extends CRL> implements AbstractC6317ilLi<T> {
    public final BigInteger OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CRLSelector f17417OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f17418OooO00o;
    public final boolean OooO0O0;
    public final boolean OooO0OO;
    public final boolean OooO0Oo;

    /* renamed from: com.pd.sdk.i1l1l$OooO0O0 */
    public static class OooO0O0 {
        public BigInteger OooO00o = null;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final CRLSelector f17419OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17420OooO00o = false;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f17421OooO00o = null;
        public boolean OooO0O0 = false;
        public boolean OooO0OO = false;

        public OooO0O0(CRLSelector cRLSelector) {
            this.f17419OooO00o = (CRLSelector) cRLSelector.clone();
        }

        public OooO0O0 OooO00o(boolean z) {
            this.OooO0O0 = z;
            return this;
        }

        public C6043i1l1l<? extends CRL> OooO00o() {
            return new C6043i1l1l<>(this);
        }

        public void OooO00o(BigInteger bigInteger) {
            this.OooO00o = bigInteger;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m16903OooO00o(boolean z) {
            this.OooO0OO = z;
        }

        public void OooO00o(byte[] bArr) {
            this.f17421OooO00o = C9586iIILl.m21630OooO00o(bArr);
        }

        public OooO0O0 OooO0O0(boolean z) {
            this.f17420OooO00o = z;
            return this;
        }
    }

    /* renamed from: com.pd.sdk.i1l1l$OooO0OO */
    public static class OooO0OO extends X509CRLSelector {
        public final C6043i1l1l OooO00o;

        public OooO0OO(C6043i1l1l i1l1l) {
            this.OooO00o = i1l1l;
            if (i1l1l.f17417OooO00o instanceof X509CRLSelector) {
                X509CRLSelector x509CRLSelector = (X509CRLSelector) i1l1l.f17417OooO00o;
                setCertificateChecking(x509CRLSelector.getCertificateChecking());
                setDateAndTime(x509CRLSelector.getDateAndTime());
                setIssuers(x509CRLSelector.getIssuers());
                setMinCRLNumber(x509CRLSelector.getMinCRL());
                setMaxCRLNumber(x509CRLSelector.getMaxCRL());
            }
        }

        public boolean match(CRL crl) {
            C6043i1l1l i1l1l = this.OooO00o;
            return i1l1l == null ? crl != null : i1l1l.OooO00o(crl);
        }
    }

    public C6043i1l1l(OooO0O0 oooO0O0) {
        this.f17417OooO00o = oooO0O0.f17419OooO00o;
        this.OooO0O0 = oooO0O0.f17420OooO00o;
        this.OooO0OO = oooO0O0.OooO0O0;
        this.OooO00o = oooO0O0.OooO00o;
        this.f17418OooO00o = oooO0O0.f17421OooO00o;
        this.OooO0Oo = oooO0O0.OooO0OO;
    }

    public static Collection<? extends CRL> OooO00o(C6043i1l1l i1l1l, CertStore certStore) throws CertStoreException {
        return certStore.getCRLs(new OooO0OO(i1l1l));
    }

    public BigInteger OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509Certificate m16900OooO00o() {
        CRLSelector cRLSelector = this.f17417OooO00o;
        if (cRLSelector instanceof X509CRLSelector) {
            return ((X509CRLSelector) cRLSelector).getCertificateChecking();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16901OooO00o() {
        return this.OooO0OO;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16902OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f17418OooO00o);
    }

    public boolean OooO0O0() {
        return this.OooO0O0;
    }

    public boolean OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        if (com.p118pd.sdk.C9586iIILl.m21627OooO00o(r0, r1) == false) goto L_0x0069;
     */
    /* renamed from: match */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(java.security.cert.CRL r5) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6043i1l1l.OooO00o(java.security.cert.CRL):boolean");
    }
}
