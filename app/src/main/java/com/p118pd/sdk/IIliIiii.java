package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.IIliIiii */
public class IIliIiii {
    public C5187I1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public IIIL1L f15515OooO00o;

    public IIliIiii(C5187I1l r1) {
        this.OooO00o = r1;
    }

    public IIliIiii(C5187I1l r1, IIIL1L r2) {
        this.OooO00o = r1;
        this.f15515OooO00o = r2;
    }

    private byte[] OooO00o(AbstractC9663l1 r4) throws CRMFException {
        if (this.OooO00o.m15316OooO00o() == null) {
            try {
                byte[] OooO00o2 = C6304ilIi1.m17339OooO00o(r4.OooO00o(this.OooO00o.m15318OooO0O0(), this.OooO00o.OooO0OO(), this.OooO00o.OooO00o().m15475OooO00o()).OooO00o(new ByteArrayInputStream(this.OooO00o.OooO0O0().m15475OooO00o())));
                return this.f15515OooO00o != null ? this.f15515OooO00o.OooO00o(OooO00o2) : OooO00o2;
            } catch (IOException e) {
                throw new CRMFException("Cannot parse decrypted data: " + e.getMessage(), e);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5464IlilIi m15414OooO00o(AbstractC9663l1 r1) throws CRMFException {
        return C5464IlilIi.OooO00o(OooO00o(r1));
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o.m15315OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder m15415OooO00o(AbstractC9663l1 r2) throws CRMFException {
        return new X509CertificateHolder(LilIiIl.OooO00o(OooO00o(r2)));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public char[] m15416OooO00o(AbstractC9663l1 r1) throws CRMFException {
        return Strings.OooO0O0(OooO00o(r1)).toCharArray();
    }
}
