package com.p118pd.sdk;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;

/* renamed from: com.pd.sdk.丨Ili1  reason: invalid class name and case insensitive filesystem */
public class C9424Ili1 extends ilililIi {
    public C9424Ili1(C5237III r1) {
        super((I11li1) r1.m15435OooO0O0());
    }

    public C9424Ili1(C5551IiL r1) {
        super((I11li1) r1.m15828OooO00o());
    }

    public C9424Ili1(PublicKey publicKey) throws InvalidKeyException {
        super(OooO00o(publicKey));
    }

    public C9424Ili1(X509Certificate x509Certificate) throws CertificateParsingException {
        super(OooO00o(x509Certificate));
    }

    public C9424Ili1(byte[] bArr) throws IOException {
        super((I11li1) C9385IilIiL.OooO00o(bArr));
    }

    public static I11li1 OooO00o(PublicKey publicKey) throws InvalidKeyException {
        try {
            return (I11li1) new ilililIi(C6888ll.OooO00o(publicKey.getEncoded())).OooO0O0();
        } catch (Exception e) {
            throw new InvalidKeyException("can't process key: " + e);
        }
    }

    public static I11li1 OooO00o(X509Certificate x509Certificate) throws CertificateParsingException {
        try {
            if (x509Certificate.getVersion() != 3) {
                return (I11li1) new ilililIi(C6888ll.OooO00o(x509Certificate.getPublicKey().getEncoded()), new C5845LIillll(new ILI(C1IIlL.OooO00o(x509Certificate))), x509Certificate.getSerialNumber()).OooO0O0();
            }
            ILI ili = new ILI(C1IIlL.OooO00o(x509Certificate));
            byte[] extensionValue = x509Certificate.getExtensionValue(C5237III.o00OoOo.m16387OooO0O0());
            return extensionValue != null ? (I11li1) new ilililIi(((AbstractC6804llL1ii) C9385IilIiL.OooO00o(extensionValue)).m17938OooO00o(), new C5845LIillll(ili), x509Certificate.getSerialNumber()).OooO0O0() : (I11li1) new ilililIi(C6888ll.OooO00o(x509Certificate.getPublicKey().getEncoded()), new C5845LIillll(ili), x509Certificate.getSerialNumber()).OooO0O0();
        } catch (Exception e) {
            throw new CertificateParsingException("Exception extracting certificate details: " + e.toString());
        }
    }
}
