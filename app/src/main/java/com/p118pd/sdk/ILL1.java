package com.p118pd.sdk;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.ILL1丨丨  reason: invalid class name */
public class ILL1 {
    public ILI OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f15591OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f15592OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.ILL1丨丨$OooO00o */
    public class OooO00o {

        /* renamed from: OooO00o  reason: collision with other field name */
        public iI11IL f15593OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6390ii1 f15594OooO00o;

        public OooO00o(C6390ii1 r2, iI11IL r3) {
            this.f15594OooO00o = r2;
            this.f15593OooO00o = r3;
        }

        public C6132iI1 OooO00o() throws Exception {
            return new C6132iI1(this.f15594OooO00o.m17503OooO00o(), this.f15593OooO00o);
        }
    }

    private C5537Iiili OooO0O0(Lii1ii1 r6, X509CertificateHolder[] x509CertificateHolderArr) throws OCSPException {
        C6714lil r7;
        iILLL1 r1 = new iILLL1();
        for (OooO00o oooO00o : this.f15592OooO00o) {
            try {
                r1.OooO00o(oooO00o.OooO00o());
            } catch (Exception e) {
                throw new OCSPException("exception creating Request", e);
            }
        }
        C6322ili ili = new C6322ili(this.OooO00o, new C5707LiL1(r1), this.f15591OooO00o);
        C6714lil r12 = null;
        if (r6 != null) {
            if (this.OooO00o != null) {
                try {
                    OutputStream OooO00o2 = r6.m16310OooO00o();
                    OooO00o2.write(ili.OooO00o(AbstractC5533IiL.OooO00o));
                    OooO00o2.close();
                    iIilII1 iiilii1 = new iIilII1(r6.getSignature());
                    C6456l1ilL OooO00o3 = r6.OooO00o();
                    if (x509CertificateHolderArr == null || x509CertificateHolderArr.length <= 0) {
                        r7 = new C6714lil(OooO00o3, iiilii1);
                    } else {
                        iILLL1 r2 = new iILLL1();
                        for (int i = 0; i != x509CertificateHolderArr.length; i++) {
                            r2.OooO00o(x509CertificateHolderArr[i].toASN1Structure());
                        }
                        r7 = new C6714lil(OooO00o3, iiilii1, new C5707LiL1(r2));
                    }
                    r12 = r7;
                } catch (Exception e2) {
                    throw new OCSPException("exception processing TBSRequest: " + e2, e2);
                }
            } else {
                throw new OCSPException("requestorName must be specified if request is signed.");
            }
        }
        return new C5537Iiili(new C6318ilLlL(ili, r12));
    }

    public ILL1 OooO00o(ILI ili) {
        this.OooO00o = ili;
        return this;
    }

    public ILL1 OooO00o(iI11IL r1) {
        this.f15591OooO00o = r1;
        return this;
    }

    public ILL1 OooO00o(C6390ii1 r4) {
        this.f15592OooO00o.add(new OooO00o(r4, null));
        return this;
    }

    public ILL1 OooO00o(C6390ii1 r3, iI11IL r4) {
        this.f15592OooO00o.add(new OooO00o(r3, r4));
        return this;
    }

    public ILL1 OooO00o(l1LILI1 r3) {
        this.OooO00o = new ILI(4, r3);
        return this;
    }

    public C5537Iiili OooO00o() throws OCSPException {
        return OooO0O0(null, null);
    }

    public C5537Iiili OooO00o(Lii1ii1 r1, X509CertificateHolder[] x509CertificateHolderArr) throws OCSPException, IllegalArgumentException {
        if (r1 != null) {
            return OooO0O0(r1, x509CertificateHolderArr);
        }
        throw new IllegalArgumentException("no signer specified");
    }
}
