package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.丨l丨1iIl  reason: invalid class name and case insensitive filesystem */
public class C9729l1iIl {
    public final C5464IlilIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final X509CertificateHolder[] f23361OooO00o;

    public C9729l1iIl(C5464IlilIi r3, X509CertificateHolder[] x509CertificateHolderArr) {
        this.OooO00o = r3;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[x509CertificateHolderArr.length];
        this.f23361OooO00o = x509CertificateHolderArr2;
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, x509CertificateHolderArr.length);
    }

    private byte[] OooO00o() {
        C6584lLLL OooO00o2 = C6584lLLL.OooO00o(this.f23361OooO00o[0].getExtensions());
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5464IlilIi m21780OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iilI1iI m21781OooO00o() {
        return new C9610iLl1(this.f23361OooO00o[0].getIssuer(), this.f23361OooO00o[0].getSerialNumber(), OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder m21782OooO00o() {
        return this.f23361OooO00o[0];
    }
}
