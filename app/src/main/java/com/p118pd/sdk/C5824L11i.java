package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.L丨11i  reason: invalid class name and case insensitive filesystem */
public class C5824L11i {
    public IIIL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5650LIL f16782OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public lI111ll f16783OooO00o;

    public C5824L11i(lI111ll li111ll, AbstractC5650LIL r3) {
        this(li111ll, r3, null);
    }

    public C5824L11i(lI111ll li111ll, AbstractC5650LIL r2, IIIL1L r3) {
        this.f16783OooO00o = li111ll;
        this.f16782OooO00o = r2;
        this.OooO00o = r3;
    }

    private C5187I1l OooO00o(byte[] bArr) throws CRMFException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream OooO00o2 = this.f16782OooO00o.OooO00o(byteArrayOutputStream);
        try {
            OooO00o2.write(bArr);
            OooO00o2.close();
            C6456l1ilL OooO00o3 = this.f16782OooO00o.m16163OooO00o();
            try {
                this.f16783OooO00o.OooO00o(this.f16782OooO00o.OooO00o());
                return new C5187I1l(null, OooO00o3, new iIilII1(this.f16783OooO00o.OooO00o(this.f16782OooO00o.OooO00o())), this.f16783OooO00o.OooO00o(), null, new iIilII1(byteArrayOutputStream.toByteArray()));
            } catch (OperatorException e) {
                throw new CRMFException("cannot wrap key: " + e.getMessage(), e);
            }
        } catch (IOException e2) {
            throw new CRMFException("cannot process data: " + e2.getMessage(), e2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private byte[] m16418OooO00o(byte[] bArr) {
        IIIL1L r0 = this.OooO00o;
        return r0 != null ? r0.OooO0O0(bArr) : bArr;
    }

    public C5187I1l OooO00o(C5464IlilIi r9) throws CRMFException {
        C6805llLL r0 = new C6805llLL(r9);
        try {
            return new C5187I1l(r9.m15707OooO0O0(), this.f16782OooO00o.m16163OooO00o(), new iIilII1(this.f16783OooO00o.OooO00o(this.f16782OooO00o.OooO00o())), this.f16783OooO00o.OooO00o(), null, new iIilII1(r0.OooO00o(this.f16782OooO00o).OooO0O0()));
        } catch (IllegalStateException e) {
            throw new CRMFException("cannot encode key: " + e.getMessage(), e);
        } catch (OperatorException e2) {
            throw new CRMFException("cannot wrap key: " + e2.getMessage(), e2);
        }
    }

    public C5187I1l OooO00o(X509CertificateHolder x509CertificateHolder) throws CRMFException {
        try {
            return OooO00o(m16418OooO00o(x509CertificateHolder.getEncoded()));
        } catch (IOException e) {
            throw new CRMFException("cannot encode certificate: " + e.getMessage(), e);
        }
    }

    public C5187I1l OooO00o(char[] cArr) throws CRMFException {
        return OooO00o(m16418OooO00o(Strings.OooO0O0(cArr)));
    }
}
