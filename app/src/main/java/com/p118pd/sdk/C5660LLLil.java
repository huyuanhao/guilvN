package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.LLLil  reason: case insensitive filesystem */
public class C5660LLLil implements AbstractC9833iILl {
    public boolean OooO00o;

    public C5660LLLil() {
        this(true);
    }

    public C5660LLLil(boolean z) {
        this.OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C5660LLLil(this.OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9833iILl
    public void OooO00o(C5692LLlIl r2, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        r2.OooO00o(C5237III.o00OoOoo);
        if (!r2.m16271OooO00o()) {
            C5387Ii OooO00o2 = C5387Ii.OooO00o(x509CertificateHolder.getExtensions());
            if (OooO00o2 != null) {
                if (!OooO00o2.OooO00o(4)) {
                    throw new CertPathValidationException("Issuer certificate KeyUsage extension does not permit key signing");
                }
            } else if (this.OooO00o) {
                throw new CertPathValidationException("KeyUsage extension not present in CA certificate");
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        this.OooO00o = ((C5660LLLil) r1).OooO00o;
    }
}
