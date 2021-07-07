package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Date;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;

/* renamed from: com.pd.sdk.丨I丨l丨  reason: invalid class name and case insensitive filesystem */
public class C9448Il {
    public IilIL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5510IIl f22998OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iiiLLi1 f22999OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f23000OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f23001OooO00o;

    /* renamed from: com.pd.sdk.丨I丨l丨$OooO00o */
    public class OooO00o {
        public C6172iLLlI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public i1Ii11l f23002OooO00o;

        public OooO00o(C6172iLLlI illli) {
            this.OooO00o = illli;
            this.f23002OooO00o = null;
        }

        public OooO00o(i1Ii11l r2) {
            this.f23002OooO00o = r2;
            this.OooO00o = null;
        }

        public C6456l1ilL OooO00o() {
            return this.f23002OooO00o != null ? new C6456l1ilL(AbstractC9733l.OooO) : this.OooO00o.OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public C93041iI1l m21493OooO00o() {
            i1Ii11l r0 = this.f23002OooO00o;
            return r0 != null ? r0.OooO00o() : this.OooO00o.m17124OooO00o();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m21494OooO00o() {
            return this.f23002OooO00o != null ? LL1i.OooO0O0 : AbstractC5905LllI.OooO0OO.equals(this.OooO00o.OooO00o().OooO00o()) ? LL1i.OooO0Oo : this.OooO00o.OooO00o().OooO00o().m16387OooO0O0();
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m21495OooO00o() {
            i1Ii11l r0 = this.f23002OooO00o;
            return r0 != null ? r0.m17447OooO00o() : this.OooO00o.m17125OooO00o();
        }
    }

    public C9448Il(C5753LiI1 r1) throws TSPException, IOException {
        this(OooO00o(r1));
    }

    public C9448Il(iiiLLi1 r4) throws TSPException, IOException {
        OooO00o oooO00o;
        this.f22999OooO00o = r4;
        if (r4.m17283OooO00o().equals(AbstractC5711LiLli.o000OO.m16387OooO0O0())) {
            Collection<C5510IIl> OooO00o2 = this.f22999OooO00o.m17280OooO00o().OooO00o();
            if (OooO00o2.size() == 1) {
                this.f22998OooO00o = OooO00o2.iterator().next();
                try {
                    AbstractC5563Il OooO00o3 = this.f22999OooO00o.m17279OooO00o();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    OooO00o3.write(byteArrayOutputStream);
                    this.OooO00o = new IilIL(C6188iLl1.OooO00o(new C5805Ll1(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).OooO00o()));
                    C9476LIL1li OooO00o4 = this.f22998OooO00o.m15767OooO00o().m21787OooO00o(AbstractC5711LiLli.o000OoO);
                    if (OooO00o4 != null) {
                        oooO00o = new OooO00o(i1Ii11l.OooO00o(C9606iLL.OooO00o(OooO00o4.OooO00o().OooO00o(0)).OooO00o()[0]));
                    } else {
                        C9476LIL1li OooO00o5 = this.f22998OooO00o.m15767OooO00o().m21787OooO00o(AbstractC5711LiLli.o000O0o);
                        if (OooO00o5 != null) {
                            oooO00o = new OooO00o(C6172iLLlI.OooO00o(C6272iilIl.OooO00o(OooO00o5.OooO00o().OooO00o(0)).OooO00o()[0]));
                        } else {
                            throw new TSPValidationException("no signing certificate attribute found, time stamp invalid.");
                        }
                    }
                    this.f23000OooO00o = oooO00o;
                } catch (CMSException e) {
                    throw new TSPException(e.getMessage(), e.getUnderlyingException());
                }
            } else {
                throw new IllegalArgumentException("Time-stamp token signed by " + OooO00o2.size() + " signers, but it must contain just the TSA signature.");
            }
        } else {
            throw new TSPValidationException("ContentInfo object not for a time stamp.");
        }
    }

    public static iiiLLi1 OooO00o(C5753LiI1 r3) throws TSPException {
        try {
            return new iiiLLi1(r3);
        } catch (CMSException e) {
            throw new TSPException("TSP parsing error: " + e.getMessage(), e.getCause());
        }
    }

    public IilIL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1679L1 m21486OooO00o() {
        return this.f22998OooO00o.m15762OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iiiLLi1 m21487OooO00o() {
        return this.f22999OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6271iilI m21488OooO00o() {
        return this.f22999OooO00o.m17282OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m21489OooO00o() {
        return this.f22998OooO00o.m15767OooO00o();
    }

    public void OooO00o(iIiIliLi iiiilili) throws TSPException, TSPValidationException {
        if (iiiilili.m16972OooO00o()) {
            try {
                X509CertificateHolder OooO00o2 = iiiilili.OooO00o();
                I111LIL OooO00o3 = iiiilili.OooO00o(this.f23000OooO00o.OooO00o());
                OutputStream OooO00o4 = OooO00o3.m21370OooO00o();
                OooO00o4.write(OooO00o2.getEncoded());
                OooO00o4.close();
                if (C9586iIILl.OooO0O0(this.f23000OooO00o.m21495OooO00o(), OooO00o3.m21371OooO00o())) {
                    if (this.f23000OooO00o.m21493OooO00o() != null) {
                        IIllLll1 iIllLll1 = new IIllLll1(OooO00o2.toASN1Structure());
                        if (this.f23000OooO00o.m21493OooO00o().m21308OooO00o().equals(iIllLll1.m15417OooO00o())) {
                            ILI[] OooO00o5 = this.f23000OooO00o.m21493OooO00o().OooO00o().OooO00o();
                            boolean z = false;
                            int i = 0;
                            while (true) {
                                if (i != OooO00o5.length) {
                                    if (OooO00o5[i].OooO00o() == 4 && l1LILI1.OooO00o(OooO00o5[i].m15483OooO0O0()).equals(l1LILI1.OooO00o(iIllLll1.OooO00o()))) {
                                        z = true;
                                        break;
                                    }
                                    i++;
                                } else {
                                    break;
                                }
                            }
                            if (!z) {
                                throw new TSPValidationException("certificate name does not match certID for signature. ");
                            }
                        } else {
                            throw new TSPValidationException("certificate serial number does not match certID for signature.");
                        }
                    }
                    IL11iL.OooO00o(OooO00o2);
                    if (!OooO00o2.isValidOn(this.OooO00o.m15621OooO00o())) {
                        throw new TSPValidationException("certificate not valid when time stamp created.");
                    } else if (!this.f22998OooO00o.OooO00o(iiiilili)) {
                        throw new TSPValidationException("signature not created by certificate.");
                    }
                } else {
                    throw new TSPValidationException("certificate hash does not match certID hash.");
                }
            } catch (CMSException e) {
                if (e.getUnderlyingException() != null) {
                    throw new TSPException(e.getMessage(), e.getUnderlyingException());
                }
                throw new TSPException("CMS exception: " + e, e);
            } catch (IOException e2) {
                throw new TSPException("problem processing certificate: " + e2, e2);
            } catch (OperatorCreationException e3) {
                throw new TSPException("unable to create digest: " + e3.getMessage(), e3);
            }
        } else {
            throw new IllegalArgumentException("verifier provider needs an associated certificate");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21490OooO00o(iIiIliLi iiiilili) throws TSPException {
        try {
            return this.f22998OooO00o.OooO00o(iiiilili);
        } catch (CMSException e) {
            if (e.getUnderlyingException() != null) {
                throw new TSPException(e.getMessage(), e.getUnderlyingException());
            }
            throw new TSPException("CMS exception: " + e, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21491OooO00o() throws IOException {
        return this.f22999OooO00o.getEncoded();
    }

    public AbstractC6271iilI OooO0O0() {
        return this.f22999OooO00o.OooO0O0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C9731lL1 m21492OooO0O0() {
        return this.f22998OooO00o.OooO0O0();
    }

    public AbstractC6271iilI OooO0OO() {
        return this.f22999OooO00o.OooO0OO();
    }
}
