package com.p118pd.sdk;

import java.util.Collection;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.LLl1L */
public class LLl1L implements AbstractC9833iILl {
    public AbstractC6271iilI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f16505OooO00o;

    /* renamed from: com.pd.sdk.LLl1L$OooO00o */
    public class OooO00o implements AbstractC6317ilLi {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.AbstractC6317ilLi
        public boolean OooO00o(Object obj) {
            return ((X509CRLHolder) obj).getIssuer().equals(LLl1L.this.f16505OooO00o);
        }

        @Override // java.lang.Object, com.p118pd.sdk.AbstractC6317ilLi
        public Object clone() {
            return this;
        }
    }

    public LLl1L(l1LILI1 r1, AbstractC6271iilI iili) {
        this.f16505OooO00o = r1;
        this.OooO00o = iili;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new LLl1L(this.f16505OooO00o, this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9833iILl
    public void OooO00o(C5692LLlIl r3, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        Collection<X509CRLHolder> OooO00o2 = this.OooO00o.OooO00o(new OooO00o());
        if (!OooO00o2.isEmpty()) {
            for (X509CRLHolder x509CRLHolder : OooO00o2) {
                if (x509CRLHolder.getRevokedCertificate(x509CertificateHolder.getSerialNumber()) != null) {
                    throw new CertPathValidationException("Certificate revoked");
                }
            }
            this.f16505OooO00o = x509CertificateHolder.getSubject();
            return;
        }
        throw new CertPathValidationException("CRL for " + this.f16505OooO00o + " not found");
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r2) {
        LLl1L lLl1L = (LLl1L) r2;
        this.f16505OooO00o = lLl1L.f16505OooO00o;
        this.OooO00o = lLl1L.OooO00o;
    }
}
