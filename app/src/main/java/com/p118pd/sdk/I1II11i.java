package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import org.bouncycastle.cert.CertRuntimeException;
import org.bouncycastle.cert.X509CertificateHolder;

/* renamed from: com.pd.sdk.I1II11i */
public class I1II11i {
    public I111LIL OooO00o;

    public I1II11i(I111LIL r1) {
        this.OooO00o = r1;
    }

    private byte[] OooO00o(C6888ll r4) {
        byte[] OooO00o2 = r4.OooO00o().m15475OooO00o();
        OutputStream OooO00o3 = this.OooO00o.m21370OooO00o();
        try {
            OooO00o3.write(OooO00o2);
            OooO00o3.close();
            return this.OooO00o.m21371OooO00o();
        } catch (IOException e) {
            throw new CertRuntimeException("unable to calculate identifier: " + e.getMessage(), e);
        }
    }

    private byte[] OooO00o(X509CertificateHolder x509CertificateHolder) {
        if (x509CertificateHolder.getVersionNumber() != 3) {
            return OooO00o(x509CertificateHolder.getSubjectPublicKeyInfo());
        }
        C5237III extension = x509CertificateHolder.getExtension(C5237III.o00OoOo);
        return extension != null ? AbstractC6804llL1ii.OooO00o(extension.m15435OooO0O0()).m17938OooO00o() : OooO00o(x509CertificateHolder.getSubjectPublicKeyInfo());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ilililIi m15256OooO00o(C6888ll r2) {
        return new ilililIi(OooO00o(r2));
    }

    public ilililIi OooO00o(C6888ll r2, C5845LIillll r3, BigInteger bigInteger) {
        return new ilililIi(OooO00o(r2), r3, bigInteger);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public ilililIi m15257OooO00o(X509CertificateHolder x509CertificateHolder) {
        return new ilililIi(OooO00o(x509CertificateHolder), new C5845LIillll(new ILI(x509CertificateHolder.getIssuer())), x509CertificateHolder.getSerialNumber());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6584lLLL m15258OooO00o(C6888ll r2) {
        return new C6584lLLL(OooO00o(r2));
    }

    public C6584lLLL OooO0O0(C6888ll r5) {
        byte[] OooO00o2 = OooO00o(r5);
        byte[] bArr = new byte[8];
        System.arraycopy(OooO00o2, OooO00o2.length - 8, bArr, 0, 8);
        bArr[0] = (byte) (bArr[0] & 15);
        bArr[0] = (byte) (bArr[0] | 64);
        return new C6584lLLL(bArr);
    }
}
