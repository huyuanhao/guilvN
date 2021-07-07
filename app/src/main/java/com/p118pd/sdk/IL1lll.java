package com.p118pd.sdk;

import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.IL1lll丨  reason: invalid class name */
public class IL1lll {
    public final X509CertificateHolder[] OooO00o;

    public IL1lll(X509CertificateHolder[] x509CertificateHolderArr) {
        this.OooO00o = OooO00o(x509CertificateHolderArr);
    }

    private X509CertificateHolder[] OooO00o(X509CertificateHolder[] x509CertificateHolderArr) {
        int length = x509CertificateHolderArr.length;
        X509CertificateHolder[] x509CertificateHolderArr2 = new X509CertificateHolder[length];
        System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public int OooO00o() {
        return this.OooO00o.length;
    }

    public L1LLL OooO00o(AbstractC9833iILl[] r9) {
        C5692LLlIl r0 = new C5692LLlIl(C6707lilll.OooO00o(this.OooO00o));
        C6540lIliL r1 = new C6540lIliL(r0);
        for (int i = 0; i != r9.length; i++) {
            int length = this.OooO00o.length - 1;
            while (length >= 0) {
                try {
                    r0.OooO00o(length == 0);
                    r9[i].OooO00o(r0, this.OooO00o[length]);
                } catch (CertPathValidationException e) {
                    r1.OooO00o(length, i, e);
                }
                length--;
            }
        }
        return r1.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder[] m15479OooO00o() {
        return OooO00o(this.OooO00o);
    }

    public L1LLL OooO0O0(AbstractC9833iILl[] r8) {
        C5692LLlIl r0 = new C5692LLlIl(C6707lilll.OooO00o(this.OooO00o));
        for (int i = 0; i != r8.length; i++) {
            int length = this.OooO00o.length - 1;
            while (length >= 0) {
                try {
                    r0.OooO00o(length == 0);
                    r8[i].OooO00o(r0, this.OooO00o[length]);
                    length--;
                } catch (CertPathValidationException e) {
                    return new L1LLL(r0, length, i, e);
                }
            }
        }
        return new L1LLL(r0);
    }
}
