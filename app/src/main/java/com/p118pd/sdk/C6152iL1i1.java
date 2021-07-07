package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cert.cmp.CMPException;

/* renamed from: com.pd.sdk.iL1i丨1  reason: invalid class name and case insensitive filesystem */
public class C6152iL1i1 {
    public C6777llL1 OooO00o;

    public C6152iL1i1(C5704LiI1 liI1) {
        if (liI1.m16299OooO00o()) {
            this.OooO00o = liI1.m16297OooO00o();
            return;
        }
        throw new IllegalArgumentException("PKIMessage not protected");
    }

    public C6152iL1i1(C6777llL1 r2) {
        if (r2.OooO00o().m16143OooO00o() != null) {
            this.OooO00o = r2;
            return;
        }
        throw new IllegalArgumentException("PKIMessage not protected");
    }

    private boolean OooO00o(byte[] bArr, lliLLL r5) throws IOException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.OooO00o.OooO00o());
        r0.OooO00o(this.OooO00o.m17898OooO00o());
        OutputStream OooO00o2 = r5.m17912OooO00o();
        OooO00o2.write(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o));
        OooO00o2.close();
        return r5.verify(bArr);
    }

    public C5646LII1 OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6777llL1 m17064OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C97411 m17065OooO00o() {
        return this.OooO00o.m17898OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17066OooO00o() {
        return this.OooO00o.OooO00o().m16143OooO00o().OooO00o().equals(lILIlI.OooO00o);
    }

    public boolean OooO00o(AbstractC9449II r4) throws CMPException {
        try {
            return OooO00o(this.OooO00o.m17897OooO00o().m15475OooO00o(), r4.OooO00o(this.OooO00o.OooO00o().m16143OooO00o()));
        } catch (Exception e) {
            throw new CMPException("unable to verify signature: " + e.getMessage(), e);
        }
    }

    public boolean OooO00o(C9539LliII r3, char[] cArr) throws CMPException {
        if (lILIlI.OooO00o.equals(this.OooO00o.OooO00o().m16143OooO00o().OooO00o())) {
            try {
                r3.OooO00o(C5612LI1l.OooO00o(this.OooO00o.OooO00o().m16143OooO00o().m17587OooO0O0()));
                AbstractC6296il1il1 OooO00o2 = r3.OooO00o(cArr);
                OutputStream OooO00o3 = OooO00o2.m17322OooO00o();
                iILLL1 r0 = new iILLL1();
                r0.OooO00o(this.OooO00o.OooO00o());
                r0.OooO00o(this.OooO00o.m17898OooO00o());
                OooO00o3.write(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o));
                OooO00o3.close();
                return C9586iIILl.m21627OooO00o(OooO00o2.m17323OooO00o(), this.OooO00o.m17897OooO00o().m15475OooO00o());
            } catch (Exception e) {
                throw new CMPException("unable to verify MAC: " + e.getMessage(), e);
            }
        } else {
            throw new CMPException("protection algorithm not mac based");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder[] m17067OooO00o() {
        C9826LllL[] OooO00o2 = this.OooO00o.m17899OooO00o();
        if (OooO00o2 == null) {
            return new X509CertificateHolder[0];
        }
        X509CertificateHolder[] x509CertificateHolderArr = new X509CertificateHolder[OooO00o2.length];
        for (int i = 0; i != OooO00o2.length; i++) {
            x509CertificateHolderArr[i] = new X509CertificateHolder(OooO00o2[i].m21915OooO00o());
        }
        return x509CertificateHolderArr;
    }
}
