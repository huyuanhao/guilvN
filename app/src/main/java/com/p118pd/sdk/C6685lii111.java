package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.lii11丨1  reason: invalid class name and case insensitive filesystem */
public class C6685lii111 implements i11ILLIi {
    public I1IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1 f18624OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f18625OooO00o;

    public C6685lii111(I1IL i1il) {
        this.OooO00o = i1il;
        this.f18624OooO00o = i1il.m15261OooO00o();
        this.f18625OooO00o = iI11IL.OooO00o((Object) i1il.m15261OooO00o().m15996OooO00o());
    }

    public int OooO00o() {
        return this.f18624OooO00o.m15997OooO00o().m17647OooO0O0().intValue() + 1;
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        iI11IL r0 = this.f18625OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17760OooO00o() {
        return this.OooO00o.m15263OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17761OooO00o() {
        return this.OooO00o.m15263OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9613ii m17762OooO00o() {
        return new C9613ii(this.f18624OooO00o.m15998OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m17763OooO00o() {
        return C5787LlL1.OooO00o(this.f18624OooO00o.m15999OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m17764OooO00o() {
        return C5787LlL1.OooO00o(this.f18625OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m17765OooO00o() {
        return C5787LlL1.m16383OooO00o(this.f18625OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17766OooO00o() {
        return this.f18625OooO00o != null;
    }

    public boolean OooO00o(AbstractC9449II r4) throws OCSPException {
        try {
            lliLLL OooO00o2 = r4.OooO00o(this.OooO00o.m15263OooO00o());
            OutputStream OooO00o3 = OooO00o2.m17912OooO00o();
            OooO00o3.write(this.OooO00o.m15261OooO00o().OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o3.close();
            return OooO00o2.verify(m17767OooO00o());
        } catch (Exception e) {
            throw new OCSPException("exception processing sig: " + e, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17767OooO00o() {
        return this.OooO00o.m15262OooO00o().OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5359IiLlL[] m17768OooO00o() {
        I11li1 OooO00o2 = this.f18624OooO00o.OooO00o();
        int size = OooO00o2.size();
        C5359IiLlL[] iiLlLArr = new C5359IiLlL[size];
        for (int i = 0; i != size; i++) {
            iiLlLArr[i] = new C5359IiLlL(C6286iii.OooO00o(OooO00o2.OooO00o(i)));
        }
        return iiLlLArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder[] m17769OooO00o() {
        if (this.OooO00o.OooO00o() == null) {
            return C5787LlL1.f16719OooO00o;
        }
        I11li1 OooO00o2 = this.OooO00o.OooO00o();
        if (OooO00o2 == null) {
            return C5787LlL1.f16719OooO00o;
        }
        int size = OooO00o2.size();
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[size];
        for (int i = 0; i != size; i++) {
            x509CertificateHolderArr[i] = new X509CertificateHolder(LilIiIl.OooO00o(OooO00o2.OooO00o(i)));
        }
        return x509CertificateHolderArr;
    }

    public Set OooO0O0() {
        return C5787LlL1.OooO0O0(this.f18625OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m17770OooO0O0() {
        try {
            return this.OooO00o.m15261OooO00o().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6685lii111)) {
            return false;
        }
        return this.OooO00o.equals(((C6685lii111) obj).OooO00o);
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }
}
