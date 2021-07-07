package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.cms.ImprintDigestInvalidException;

/* renamed from: com.pd.sdk.IL丨1L丨L  reason: invalid class name and case insensitive filesystem */
public class C5329IL1LL {
    public final C6012i1I1Ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5497I1L[] f15647OooO00o;

    public C5329IL1LL(C6128iIlI r3) throws IOException {
        this.OooO00o = new C6012i1I1Ii(r3.OooO00o());
        this.f15647OooO00o = r3.m17028OooO00o().OooO00o().OooO00o();
    }

    public C5329IL1LL(C6393iiIiiL r3) {
        this.OooO00o = new C6012i1I1Ii(r3.OooO00o());
        this.f15647OooO00o = r3.m17512OooO00o().OooO00o().OooO00o();
    }

    private void OooO00o(C9448Il r2, byte[] bArr) throws ImprintDigestInvalidException {
        if (!C9586iIILl.m21627OooO00o(bArr, r2.OooO00o().m15626OooO0O0())) {
            throw new ImprintDigestInvalidException("hash calculated is different from MessageImprintDigest found in TimeStampToken", r2);
        }
    }

    public I111LIL OooO00o(AbstractC6290ii r4) throws OperatorCreationException {
        try {
            I111LIL OooO00o2 = r4.OooO00o(new C6456l1ilL(OooO00o(this.f15647OooO00o[0]).OooO00o().m15615OooO00o()));
            OooO00o(OooO00o2);
            return OooO00o2;
        } catch (CMSException e) {
            throw new OperatorCreationException("unable to extract algorithm ID: " + e.getMessage(), e);
        }
    }

    public C9448Il OooO00o(C5497I1L r4) throws CMSException {
        try {
            return new C9448Il(r4.m15734OooO00o());
        } catch (IOException e) {
            throw new CMSException("unable to parse token data: " + e.getMessage(), e);
        } catch (TSPException e2) {
            if (e2.getCause() instanceof CMSException) {
                throw ((CMSException) e2.getCause());
            }
            throw new CMSException("token data invalid: " + e2.getMessage(), e2);
        } catch (IllegalArgumentException e3) {
            throw new CMSException("token data invalid: " + e3.getMessage(), e3);
        }
    }

    public C9731lL1 OooO00o() {
        return new C9731lL1(this.OooO00o.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15531OooO00o() {
        return this.OooO00o.m16857OooO00o();
    }

    public void OooO00o(AbstractC6290ii r6, byte[] bArr) throws ImprintDigestInvalidException, CMSException {
        int i = 0;
        while (true) {
            C5497I1L[] r1 = this.f15647OooO00o;
            if (i < r1.length) {
                try {
                    C9448Il OooO00o2 = OooO00o(r1[i]);
                    if (i > 0) {
                        I111LIL OooO00o3 = r6.OooO00o(OooO00o2.OooO00o().m15618OooO00o());
                        OooO00o3.m21370OooO00o().write(this.f15647OooO00o[i - 1].OooO00o(AbstractC5533IiL.OooO00o));
                        bArr = OooO00o3.m21371OooO00o();
                    }
                    OooO00o(OooO00o2, bArr);
                    i++;
                } catch (IOException e) {
                    throw new CMSException("exception calculating hash: " + e.getMessage(), e);
                } catch (OperatorCreationException e2) {
                    throw new CMSException("cannot create digest: " + e2.getMessage(), e2);
                }
            } else {
                return;
            }
        }
    }

    public void OooO00o(AbstractC6290ii r7, byte[] bArr, C9448Il r9) throws ImprintDigestInvalidException, CMSException {
        try {
            byte[] OooO00o2 = r9.m21491OooO00o();
            int i = 0;
            while (true) {
                C5497I1L[] r2 = this.f15647OooO00o;
                if (i < r2.length) {
                    try {
                        C9448Il OooO00o3 = OooO00o(r2[i]);
                        if (i > 0) {
                            I111LIL OooO00o4 = r7.OooO00o(OooO00o3.OooO00o().m15618OooO00o());
                            OooO00o4.m21370OooO00o().write(this.f15647OooO00o[i - 1].OooO00o(AbstractC5533IiL.OooO00o));
                            bArr = OooO00o4.m21371OooO00o();
                        }
                        OooO00o(OooO00o3, bArr);
                        if (!C9586iIILl.m21627OooO00o(OooO00o3.m21491OooO00o(), OooO00o2)) {
                            i++;
                        } else {
                            return;
                        }
                    } catch (IOException e) {
                        throw new CMSException("exception calculating hash: " + e.getMessage(), e);
                    } catch (OperatorCreationException e2) {
                        throw new CMSException("cannot create digest: " + e2.getMessage(), e2);
                    }
                } else {
                    throw new ImprintDigestInvalidException("passed in token not associated with timestamps present", r9);
                }
            }
        } catch (IOException e3) {
            throw new CMSException("exception encoding timeStampToken: " + e3.getMessage(), e3);
        }
    }

    public void OooO00o(I111LIL r2) throws CMSException {
        this.OooO00o.OooO00o(r2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15532OooO00o(I111LIL r4) throws CMSException {
        C5497I1L[] r0 = this.f15647OooO00o;
        C5497I1L r02 = r0[r0.length - 1];
        OutputStream OooO00o2 = r4.m21370OooO00o();
        try {
            OooO00o2.write(r02.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o2.close();
            return r4.m21371OooO00o();
        } catch (IOException e) {
            throw new CMSException("exception calculating hash: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5497I1L[] m15533OooO00o() {
        return this.f15647OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9448Il[] m15534OooO00o() throws CMSException {
        C9448Il[] r0 = new C9448Il[this.f15647OooO00o.length];
        int i = 0;
        while (true) {
            C5497I1L[] r2 = this.f15647OooO00o;
            if (i >= r2.length) {
                return r0;
            }
            r0[i] = OooO00o(r2[i]);
            i++;
        }
    }

    public String OooO0O0() {
        return this.OooO00o.OooO0O0();
    }
}
