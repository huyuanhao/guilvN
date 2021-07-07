package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.tsp.TSPException;
import org.bouncycastle.tsp.TSPValidationException;

/* renamed from: com.pd.sdk.Il1i1L丨  reason: invalid class name */
public class Il1i1L {
    public C9448Il OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9590iIl f15790OooO00o;

    public Il1i1L(C6120iIlL1 iill1) throws TSPException, IOException {
        try {
            this.f15790OooO00o = C9590iIl.OooO00o(iill1);
            this.OooO00o = new C9448Il(C5753LiI1.OooO00o(iill1.OooO00o(1)));
        } catch (IllegalArgumentException e) {
            throw new TSPException("malformed timestamp response: " + e, e);
        } catch (ClassCastException e2) {
            throw new TSPException("malformed timestamp response: " + e2, e2);
        }
    }

    public Il1i1L(C9590iIl r2) throws TSPException, IOException {
        this.f15790OooO00o = r2;
        if (r2.m21658OooO00o() != null) {
            this.OooO00o = new C9448Il(r2.m21658OooO00o());
        }
    }

    public Il1i1L(InputStream inputStream) throws TSPException, IOException {
        this(OooO00o(inputStream));
    }

    public Il1i1L(byte[] bArr) throws TSPException, IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public static C9590iIl OooO00o(InputStream inputStream) throws IOException, TSPException {
        try {
            return C9590iIl.OooO00o(new C5805Ll1(inputStream).OooO00o());
        } catch (IllegalArgumentException e) {
            throw new TSPException("malformed timestamp response: " + e, e);
        } catch (ClassCastException e2) {
            throw new TSPException("malformed timestamp response: " + e2, e2);
        }
    }

    public int OooO00o() {
        return this.f15790OooO00o.OooO00o().m15461OooO00o().intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6218ii1 m15642OooO00o() {
        if (this.f15790OooO00o.OooO00o().OooO00o() != null) {
            return new C6218ii1(this.f15790OooO00o.OooO00o().OooO00o());
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9448Il m15643OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15644OooO00o() {
        if (this.f15790OooO00o.OooO00o().m15460OooO00o() == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        C9752I11 OooO00o2 = this.f15790OooO00o.OooO00o().m15460OooO00o();
        for (int i = 0; i != OooO00o2.size(); i++) {
            stringBuffer.append(OooO00o2.OooO00o(i).OooO00o());
        }
        return stringBuffer.toString();
    }

    public void OooO00o(C1LI1l r6) throws TSPException {
        C9448Il OooO00o2 = m15643OooO00o();
        if (OooO00o2 != null) {
            IilIL OooO00o3 = OooO00o2.OooO00o();
            if (r6.m21829OooO00o() != null && !r6.m21829OooO00o().equals(OooO00o3.m15620OooO00o())) {
                throw new TSPValidationException("response contains wrong nonce value.");
            } else if (OooO00o() != 0 && OooO00o() != 1) {
                throw new TSPValidationException("time stamp token found in failed request.");
            } else if (!C9586iIILl.OooO0O0(r6.m21836OooO0O0(), OooO00o3.m15626OooO0O0())) {
                throw new TSPValidationException("response for different message imprint digest.");
            } else if (OooO00o3.m15615OooO00o().equals(r6.m21827OooO00o())) {
                C9476LIL1li OooO00o4 = OooO00o2.m21489OooO00o().m21787OooO00o(AbstractC5711LiLli.o000OoO);
                C9476LIL1li OooO00o5 = OooO00o2.m21489OooO00o().m21787OooO00o(AbstractC5711LiLli.o000O0o);
                if (OooO00o4 == null && OooO00o5 == null) {
                    throw new TSPValidationException("no signing certificate attribute present.");
                } else if (r6.OooO0O0() != null && !r6.OooO0O0().equals(OooO00o3.OooO0O0())) {
                    throw new TSPValidationException("TSA policy wrong for request.");
                }
            } else {
                throw new TSPValidationException("response for different message imprint algorithm.");
            }
        } else if (OooO00o() == 0 || OooO00o() == 1) {
            throw new TSPValidationException("no time stamp token found and one expected.");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15645OooO00o() throws IOException {
        return this.f15790OooO00o.getEncoded();
    }

    public byte[] OooO00o(String str) throws IOException {
        AbstractC5738Lil lil;
        if (AbstractC5533IiL.OooO0O0.equals(str)) {
            lil = new C6120iIlL1(new AbstractC6854lLi1LL[]{this.f15790OooO00o.OooO00o(), this.OooO00o.m21487OooO00o().m17281OooO00o()});
        } else {
            lil = this.f15790OooO00o;
        }
        return lil.OooO00o(str);
    }
}
