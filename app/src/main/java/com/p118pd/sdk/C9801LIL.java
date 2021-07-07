package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRL;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLSelector;

/* renamed from: com.pd.sdk.丨丨LIL  reason: invalid class name and case insensitive filesystem */
public class C9801LIL extends X509CRLSelector implements AbstractC6317ilLi {
    public AbstractC9605iL11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public BigInteger f23406OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23407OooO00o = null;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;

    public static C9801LIL OooO00o(X509CRLSelector x509CRLSelector) {
        if (x509CRLSelector != null) {
            C9801LIL r0 = new C9801LIL();
            r0.setCertificateChecking(x509CRLSelector.getCertificateChecking());
            r0.setDateAndTime(x509CRLSelector.getDateAndTime());
            try {
                r0.setIssuerNames(x509CRLSelector.getIssuerNames());
                r0.setIssuers(x509CRLSelector.getIssuers());
                r0.setMaxCRLNumber(x509CRLSelector.getMaxCRL());
                r0.setMinCRLNumber(x509CRLSelector.getMinCRL());
                return r0;
            } catch (IOException e) {
                throw new IllegalArgumentException(e.getMessage());
            }
        } else {
            throw new IllegalArgumentException("cannot create from null selector");
        }
    }

    public AbstractC9605iL11 OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m21902OooO00o() {
        return this.f23406OooO00o;
    }

    public void OooO00o(AbstractC9605iL11 r1) {
        this.OooO00o = r1;
    }

    public void OooO00o(BigInteger bigInteger) {
        this.f23406OooO00o = bigInteger;
    }

    public void OooO00o(boolean z) {
        this.OooO0OO = z;
    }

    public void OooO00o(byte[] bArr) {
        this.f23407OooO00o = C9586iIILl.m21630OooO00o(bArr);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21903OooO00o() {
        return this.OooO0OO;
    }

    @Override // com.p118pd.sdk.AbstractC6317ilLi
    public boolean OooO00o(Object obj) {
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        X509CRL x509crl = (X509CRL) obj;
        C6513lIiI r0 = null;
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C5237III.o0O00o0.m16387OooO0O0());
            if (extensionValue != null) {
                r0 = C6513lIiI.OooO00o((Object) C9385IilIiL.OooO00o(extensionValue));
            }
            if (OooO0O0() && r0 == null) {
                return false;
            }
            if (m21903OooO00o() && r0 != null) {
                return false;
            }
            if (r0 != null && this.f23406OooO00o != null && r0.OooO00o().compareTo(this.f23406OooO00o) == 1) {
                return false;
            }
            if (this.OooO0Oo) {
                byte[] extensionValue2 = x509crl.getExtensionValue(C5237III.o00OoooO.m16387OooO0O0());
                byte[] bArr = this.f23407OooO00o;
                if (bArr == null) {
                    if (extensionValue2 != null) {
                        return false;
                    }
                } else if (!C9586iIILl.m21627OooO00o(extensionValue2, bArr)) {
                    return false;
                }
            }
            return super.match(x509crl);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21904OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23407OooO00o);
    }

    public void OooO0O0(boolean z) {
        this.OooO0O0 = z;
    }

    public boolean OooO0O0() {
        return this.OooO0O0;
    }

    public void OooO0OO(boolean z) {
        this.OooO0Oo = z;
    }

    public boolean OooO0OO() {
        return this.OooO0Oo;
    }

    @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
    public Object clone() {
        C9801LIL OooO00o2 = OooO00o((X509CRLSelector) this);
        OooO00o2.OooO0O0 = this.OooO0O0;
        OooO00o2.OooO0OO = this.OooO0OO;
        OooO00o2.f23406OooO00o = this.f23406OooO00o;
        OooO00o2.OooO00o = this.OooO00o;
        OooO00o2.OooO0Oo = this.OooO0Oo;
        OooO00o2.f23407OooO00o = C9586iIILl.m21630OooO00o(this.f23407OooO00o);
        return OooO00o2;
    }

    public boolean match(CRL crl) {
        return OooO00o(crl);
    }
}
