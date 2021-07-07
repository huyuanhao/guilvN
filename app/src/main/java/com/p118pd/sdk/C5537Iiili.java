package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.I丨iil丨i  reason: invalid class name and case insensitive filesystem */
public class C5537Iiili {
    public static final X509CertificateHolder[] OooO00o = new X509CertificateHolder[0];

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6318ilLlL f16051OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f16052OooO00o;

    public C5537Iiili(C5805Ll1 r4) throws IOException {
        try {
            C6318ilLlL OooO00o2 = C6318ilLlL.OooO00o(r4.OooO00o());
            this.f16051OooO00o = OooO00o2;
            if (OooO00o2 != null) {
                this.f16052OooO00o = OooO00o2.OooO00o().m17369OooO00o();
                return;
            }
            throw new CertIOException("malformed request: no request data found");
        } catch (IllegalArgumentException e) {
            throw new CertIOException("malformed request: " + e.getMessage(), e);
        } catch (ClassCastException e2) {
            throw new CertIOException("malformed request: " + e2.getMessage(), e2);
        } catch (ASN1Exception e3) {
            throw new CertIOException("malformed request: " + e3.getMessage(), e3);
        }
    }

    public C5537Iiili(C6318ilLlL illll) {
        this.f16051OooO00o = illll;
        this.f16052OooO00o = illll.OooO00o().m17369OooO00o();
    }

    public C5537Iiili(byte[] bArr) throws IOException {
        this(new C5805Ll1(bArr));
    }

    public int OooO00o() {
        return this.f16051OooO00o.OooO00o().m17370OooO00o().m17647OooO0O0().intValue() + 1;
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        iI11IL r0 = this.f16052OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ILI m15814OooO00o() {
        return ILI.OooO00o(this.f16051OooO00o.OooO00o().m17368OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15815OooO00o() {
        if (!m15822OooO0O0()) {
            return null;
        }
        return this.f16051OooO00o.m17360OooO00o().m17817OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m15816OooO00o() {
        return C5787LlL1.OooO00o(this.f16052OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15817OooO00o() {
        return C5787LlL1.m16383OooO00o(this.f16052OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15818OooO00o() {
        return this.f16052OooO00o != null;
    }

    public boolean OooO00o(AbstractC9449II r4) throws OCSPException {
        if (m15822OooO0O0()) {
            try {
                lliLLL OooO00o2 = r4.OooO00o(this.f16051OooO00o.m17360OooO00o().m17817OooO00o());
                OooO00o2.m17912OooO00o().write(this.f16051OooO00o.OooO00o().OooO00o(AbstractC5533IiL.OooO00o));
                return OooO00o2.verify(m15823OooO0O0());
            } catch (Exception e) {
                throw new OCSPException("exception processing signature: " + e, e);
            }
        } else {
            throw new OCSPException("attempt to verify signature on unsigned object");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15819OooO00o() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new C6103iIi1(byteArrayOutputStream).OooO00o(this.f16051OooO00o);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Li1Li[] m15820OooO00o() {
        I11li1 OooO00o2 = this.f16051OooO00o.OooO00o().OooO00o();
        int size = OooO00o2.size();
        Li1Li[] li1LiArr = new Li1Li[size];
        for (int i = 0; i != size; i++) {
            li1LiArr[i] = new Li1Li(C6132iI1.OooO00o(OooO00o2.OooO00o(i)));
        }
        return li1LiArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder[] m15821OooO00o() {
        if (this.f16051OooO00o.m17360OooO00o() == null) {
            return OooO00o;
        }
        I11li1 OooO00o2 = this.f16051OooO00o.m17360OooO00o().OooO00o();
        if (OooO00o2 == null) {
            return OooO00o;
        }
        int size = OooO00o2.size();
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[size];
        for (int i = 0; i != size; i++) {
            x509CertificateHolderArr[i] = new X509CertificateHolder(LilIiIl.OooO00o(OooO00o2.OooO00o(i)));
        }
        return x509CertificateHolderArr;
    }

    public Set OooO0O0() {
        return C5787LlL1.OooO0O0(this.f16052OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m15822OooO0O0() {
        return this.f16051OooO00o.m17360OooO00o() != null;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15823OooO0O0() {
        if (!m15822OooO0O0()) {
            return null;
        }
        return this.f16051OooO00o.m17360OooO00o().m17816OooO00o().OooO0O0();
    }
}
