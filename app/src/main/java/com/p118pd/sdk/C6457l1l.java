package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.path.CertPathValidationException;

/* renamed from: com.pd.sdk.l1l  reason: case insensitive filesystem */
public class C6457l1l implements AbstractC9833iILl {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;

    public C6457l1l(int i) {
        this(i, false, false, false);
    }

    public C6457l1l(int i, boolean z, boolean z2, boolean z3) {
        if (z) {
            this.OooO00o = 0;
        } else {
            this.OooO00o = i + 1;
        }
        if (z2) {
            this.OooO0OO = 0;
        } else {
            this.OooO0OO = i + 1;
        }
        if (z3) {
            this.OooO0O0 = 0;
        } else {
            this.OooO0O0 = i + 1;
        }
    }

    private int OooO00o(int i) {
        if (i != 0) {
            return i - 1;
        }
        return 0;
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public AbstractC6186iLi1 OooO00o() {
        return new C6457l1l(0);
    }

    @Override // com.p118pd.sdk.AbstractC9833iILl
    public void OooO00o(C5692LLlIl r4, X509CertificateHolder x509CertificateHolder) throws CertPathValidationException {
        int intValue;
        r4.OooO00o(C5237III.o00o00);
        r4.OooO00o(C5237III.o00o00o0);
        if (!r4.m16271OooO00o() && !C9622iiI.OooO00o(x509CertificateHolder)) {
            this.OooO00o = OooO00o(this.OooO00o);
            this.OooO0O0 = OooO00o(this.OooO0O0);
            this.OooO0OO = OooO00o(this.OooO0OO);
            C9627il1ii OooO00o2 = C9627il1ii.OooO00o(x509CertificateHolder.getExtensions());
            if (OooO00o2 != null) {
                BigInteger OooO0O02 = OooO00o2.m21693OooO0O0();
                if (OooO0O02 != null && OooO0O02.intValue() < this.OooO00o) {
                    this.OooO00o = OooO0O02.intValue();
                }
                BigInteger OooO00o3 = OooO00o2.OooO00o();
                if (OooO00o3 != null && OooO00o3.intValue() < this.OooO0O0) {
                    this.OooO0O0 = OooO00o3.intValue();
                }
            }
            C5237III extension = x509CertificateHolder.getExtension(C5237III.o00o00o0);
            if (extension != null && (intValue = C6513lIiI.OooO00o(extension.m15435OooO0O0()).m17647OooO0O0().intValue()) < this.OooO0OO) {
                this.OooO0OO = intValue;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6186iLi1
    public void OooO00o(AbstractC6186iLi1 r1) {
        C6457l1l l1l = (C6457l1l) r1;
    }
}
