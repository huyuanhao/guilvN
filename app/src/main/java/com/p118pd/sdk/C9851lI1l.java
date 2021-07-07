package com.p118pd.sdk;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.丨丨lI1l  reason: invalid class name and case insensitive filesystem */
public class C9851lI1l {
    public iI11IL OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9613ii f23464OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f23465OooO00o = new ArrayList();

    /* renamed from: com.pd.sdk.丨丨lI1l$OooO00o */
    public class OooO00o {
        public iI11IL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C6390ii1 f23466OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9450IL1L f23467OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9623il f23468OooO00o;
        public C9623il OooO0O0;

        public OooO00o(C6390ii1 r5, AbstractC6294il1LI il1li, Date date, Date date2, iI11IL r9) {
            C9450IL1L r52;
            this.f23466OooO00o = r5;
            C6139iILilI r4 = null;
            if (il1li == null) {
                r52 = new C9450IL1L();
            } else if (il1li instanceof C6409ilIl) {
                r52 = new C9450IL1L(2, C6452l1Lll.OooO00o);
            } else {
                LIil1ii lIil1ii = (LIil1ii) il1li;
                r52 = lIil1ii.m16100OooO00o() ? new C9450IL1L(new LIiLLLiL(new C9623il(lIil1ii.m16099OooO00o()), LLl111.OooO00o(lIil1ii.OooO00o()))) : new C9450IL1L(new LIiLLLiL(new C9623il(lIil1ii.m16099OooO00o()), null));
            }
            this.f23467OooO00o = r52;
            this.f23468OooO00o = new C6139iILilI(date);
            this.OooO0O0 = date2 != null ? new C6139iILilI(date2) : r4;
            this.OooO00o = r9;
        }

        public C6286iii OooO00o() throws Exception {
            return new C6286iii(this.f23466OooO00o.m17503OooO00o(), this.f23467OooO00o, this.f23468OooO00o, this.OooO0O0, this.OooO00o);
        }
    }

    public C9851lI1l(C6888ll r2, I111LIL r3) throws OCSPException {
        this.f23464OooO00o = new C9613ii(r2, r3);
    }

    public C9851lI1l(C9613ii r2) {
        this.f23464OooO00o = r2;
    }

    public C6685lii111 OooO00o(Lii1ii1 r5, X509CertificateHolder[] x509CertificateHolderArr, Date date) throws OCSPException {
        iILLL1 r1 = new iILLL1();
        for (OooO00o oooO00o : this.f23465OooO00o) {
            try {
                r1.OooO00o(oooO00o.OooO00o());
            } catch (Exception e) {
                throw new OCSPException("exception creating Request", e);
            }
        }
        L1 r0 = new L1(this.f23464OooO00o.OooO00o(), new C9623il(date), new C5707LiL1(r1), this.OooO00o);
        try {
            OutputStream OooO00o2 = r5.m16310OooO00o();
            OooO00o2.write(r0.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o2.close();
            iIilII1 iiilii1 = new iIilII1(r5.getSignature());
            C6456l1ilL OooO00o3 = r5.OooO00o();
            C5707LiL1 liL1 = null;
            if (x509CertificateHolderArr != null && x509CertificateHolderArr.length > 0) {
                iILLL1 r12 = new iILLL1();
                for (int i = 0; i != x509CertificateHolderArr.length; i++) {
                    r12.OooO00o(x509CertificateHolderArr[i].toASN1Structure());
                }
                liL1 = new C5707LiL1(r12);
            }
            return new C6685lii111(new I1IL(r0, OooO00o3, iiilii1, liL1));
        } catch (Exception e2) {
            throw new OCSPException("exception processing TBSRequest: " + e2.getMessage(), e2);
        }
    }

    public C9851lI1l OooO00o(iI11IL r1) {
        this.OooO00o = r1;
        return this;
    }

    public C9851lI1l OooO00o(C6390ii1 r7, AbstractC6294il1LI il1li) {
        OooO00o(r7, il1li, new Date(), null, null);
        return this;
    }

    public C9851lI1l OooO00o(C6390ii1 r7, AbstractC6294il1LI il1li, iI11IL r9) {
        OooO00o(r7, il1li, new Date(), null, r9);
        return this;
    }

    public C9851lI1l OooO00o(C6390ii1 r7, AbstractC6294il1LI il1li, Date date, iI11IL r10) {
        OooO00o(r7, il1li, new Date(), date, r10);
        return this;
    }

    public C9851lI1l OooO00o(C6390ii1 r7, AbstractC6294il1LI il1li, Date date, Date date2) {
        OooO00o(r7, il1li, date, date2, null);
        return this;
    }

    public C9851lI1l OooO00o(C6390ii1 r10, AbstractC6294il1LI il1li, Date date, Date date2, iI11IL r14) {
        this.f23465OooO00o.add(new OooO00o(r10, il1li, date, date2, r14));
        return this;
    }
}
