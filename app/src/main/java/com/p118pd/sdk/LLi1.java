package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.cert.CertException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidationException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.LLi1 */
public class LLi1 implements AbstractC9833iILl {
    public AbstractC5603L1lLi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1LILI1 f16475OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f16476OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f16477OooO00o;

    public LLi1(AbstractC5603L1lLi r1) {
        this.OooO00o = r1;
    }

    private boolean OooO00o(AbstractC6854lLi1LL r1) {
        return r1 == null || (r1 instanceof AbstractC5335ILl);
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        LLi1 lLi1 = new LLi1(this.OooO00o);
        lLi1.f16476OooO00o = this.f16476OooO00o;
        lLi1.f16475OooO00o = this.f16475OooO00o;
        lLi1.f16477OooO00o = this.f16477OooO00o;
        return lLi1;
    }

    @Override // com.p118pd.sdk.AbstractC9833iILl
    public void OooO00o(C5692LLlIl r3, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        l1LILI1 r32 = this.f16475OooO00o;
        if (r32 == null || r32.equals(x509CertificateHolder.getIssuer())) {
            C6888ll r33 = this.f16477OooO00o;
            if (r33 != null) {
                try {
                    if (!x509CertificateHolder.isSignatureValid(this.OooO00o.OooO00o(r33.m18041OooO00o().equals(this.f16476OooO00o) ? this.f16477OooO00o : new C6888ll(this.f16476OooO00o, this.f16477OooO00o.OooO0o0())))) {
                        throw new CertPathValidationException("Certificate signature not for public key in parent");
                    }
                } catch (OperatorCreationException e) {
                    throw new CertPathValidationException("Unable to create verifier: " + e.getMessage(), e);
                } catch (CertException e2) {
                    throw new CertPathValidationException("Unable to validate signature: " + e2.getMessage(), e2);
                } catch (IOException e3) {
                    throw new CertPathValidationException("Unable to build public key: " + e3.getMessage(), e3);
                }
            }
            this.f16475OooO00o = x509CertificateHolder.getSubject();
            C6888ll subjectPublicKeyInfo = x509CertificateHolder.getSubjectPublicKeyInfo();
            this.f16477OooO00o = subjectPublicKeyInfo;
            C6456l1ilL r4 = this.f16476OooO00o;
            C6456l1ilL OooO00o2 = subjectPublicKeyInfo.m18041OooO00o();
            if (r4 != null) {
                if (!OooO00o2.OooO00o().equals(this.f16476OooO00o.OooO00o()) || !OooO00o(this.f16477OooO00o.m18041OooO00o().m17587OooO0O0())) {
                    OooO00o2 = this.f16477OooO00o.m18041OooO00o();
                } else {
                    return;
                }
            }
            this.f16476OooO00o = OooO00o2;
            return;
        }
        throw new CertPathValidationException("Certificate issue does not match parent");
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r2) {
        LLi1 lLi1 = (LLi1) r2;
        this.OooO00o = lLi1.OooO00o;
        this.f16476OooO00o = lLi1.f16476OooO00o;
        this.f16475OooO00o = lLi1.f16475OooO00o;
        this.f16477OooO00o = lLi1.f16477OooO00o;
    }
}
