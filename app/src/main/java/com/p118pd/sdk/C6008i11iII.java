package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.ExtCertificateEncodingException;

/* renamed from: com.pd.sdk.i11iI丨I  reason: invalid class name and case insensitive filesystem */
public class C6008i11iII {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f17336OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f17337OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6504lILI f17338OooO00o = new C6504lILI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6889lllIL f17339OooO00o = new C6889lllIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f17340OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CertificateFactory f17341OooO00o = new CertificateFactory();

    private C5314ILlLL OooO00o() {
        if (!this.f17339OooO00o.m18044OooO00o()) {
            this.f17338OooO00o.OooO00o(this.f17339OooO00o.OooO00o());
        }
        return this.f17338OooO00o.OooO00o();
    }

    private iIilII1 OooO00o(boolean[] zArr) {
        byte[] bArr = new byte[((zArr.length + 7) / 8)];
        for (int i = 0; i != zArr.length; i++) {
            int i2 = i / 8;
            bArr[i2] = (byte) (bArr[i2] | (zArr[i] ? 1 << (7 - (i % 8)) : 0));
        }
        int length = zArr.length % 8;
        return length == 0 ? new iIilII1(bArr) : new iIilII1(bArr, 8 - length);
    }

    private X509Certificate OooO00o(C5314ILlLL iLlLL, byte[] bArr) throws Exception {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(iLlLL);
        r0.OooO00o(this.f17337OooO00o);
        r0.OooO00o(new iIilII1(bArr));
        return (X509Certificate) this.f17341OooO00o.engineGenerateCertificate(new ByteArrayInputStream(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o)));
    }

    public X509Certificate OooO00o(PrivateKey privateKey) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, (SecureRandom) null);
    }

    public X509Certificate OooO00o(PrivateKey privateKey, String str) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, str, (SecureRandom) null);
    }

    public X509Certificate OooO00o(PrivateKey privateKey, String str, SecureRandom secureRandom) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C5314ILlLL OooO00o2 = OooO00o();
        try {
            try {
                return OooO00o(OooO00o2, C93211ll.OooO00o(this.OooO00o, this.f17340OooO00o, str, privateKey, secureRandom, OooO00o2));
            } catch (Exception e) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e);
            }
        } catch (IOException e2) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e2);
        }
    }

    public X509Certificate OooO00o(PrivateKey privateKey, SecureRandom secureRandom) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C5314ILlLL OooO00o2 = OooO00o();
        try {
            try {
                return OooO00o(OooO00o2, C93211ll.OooO00o(this.OooO00o, this.f17340OooO00o, privateKey, secureRandom, OooO00o2));
            } catch (Exception e) {
                throw new ExtCertificateEncodingException("exception producing certificate object", e);
            }
        } catch (IOException e2) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e2);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterator m16849OooO00o() {
        return C93211ll.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16850OooO00o() {
        this.f17338OooO00o = new C6504lILI();
        this.f17339OooO00o.m18043OooO00o();
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r5) {
        this.f17339OooO00o.OooO00o(new LlLI1(llLI1.m16387OooO0O0()), z, r5);
    }

    public void OooO00o(LlLI1 llLI1, boolean z, X509Certificate x509Certificate) throws CertificateParsingException {
        OooO00o(llLI1.m16387OooO0O0(), z, x509Certificate);
    }

    public void OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        this.f17339OooO00o.OooO00o(new LlLI1(llLI1.m16387OooO0O0()), z, bArr);
    }

    public void OooO00o(C929811Li1 r2) {
        this.f17338OooO00o.OooO00o(r2);
    }

    public void OooO00o(String str) {
        this.f17340OooO00o = str;
        try {
            LlLI1 OooO00o2 = C93211ll.OooO00o(str);
            this.OooO00o = OooO00o2;
            C6456l1ilL OooO00o3 = C93211ll.OooO00o(OooO00o2, str);
            this.f17337OooO00o = OooO00o3;
            this.f17338OooO00o.OooO00o(OooO00o3);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested: " + str);
        }
    }

    public void OooO00o(String str, boolean z, AbstractC6854lLi1LL r4) {
        OooO00o(new LlLI1(str), z, r4);
    }

    public void OooO00o(String str, boolean z, X509Certificate x509Certificate) throws CertificateParsingException {
        byte[] extensionValue = x509Certificate.getExtensionValue(str);
        if (extensionValue != null) {
            try {
                OooO00o(str, z, C9385IilIiL.OooO00o(extensionValue));
            } catch (IOException e) {
                throw new CertificateParsingException(e.toString());
            }
        } else {
            throw new CertificateParsingException("extension " + str + " not present");
        }
    }

    public void OooO00o(String str, boolean z, byte[] bArr) {
        OooO00o(new LlLI1(str), z, bArr);
    }

    public void OooO00o(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            this.f17338OooO00o.OooO00o(new C6513lIiI(bigInteger));
            return;
        }
        throw new IllegalArgumentException("serial number must be a positive integer");
    }

    public void OooO00o(PublicKey publicKey) throws IllegalArgumentException {
        try {
            this.f17338OooO00o.OooO00o(C6888ll.OooO00o(new C5805Ll1(publicKey.getEncoded()).OooO00o()));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to process key - " + e.toString());
        }
    }

    public void OooO00o(Date date) {
        this.f17338OooO00o.OooO00o(new C5432IlIlIlL(date));
    }

    public void OooO00o(X500Principal x500Principal) {
        try {
            this.f17338OooO00o.OooO00o(new C6790lll1I11(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16851OooO00o(boolean[] zArr) {
        this.f17338OooO00o.OooO00o(OooO00o(zArr));
    }

    public X509Certificate OooO0O0(PrivateKey privateKey) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return OooO0O0(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public X509Certificate OooO0O0(PrivateKey privateKey, String str) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return OooO0O0(privateKey, str, null);
    }

    public X509Certificate OooO0O0(PrivateKey privateKey, String str, SecureRandom secureRandom) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        try {
            return OooO00o(privateKey, str, secureRandom);
        } catch (NoSuchProviderException e) {
            throw e;
        } catch (SignatureException e2) {
            throw e2;
        } catch (InvalidKeyException e3) {
            throw e3;
        } catch (GeneralSecurityException e4) {
            throw new SecurityException("exception: " + e4);
        }
    }

    public X509Certificate OooO0O0(PrivateKey privateKey, SecureRandom secureRandom) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return OooO0O0(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public void OooO0O0(C929811Li1 r2) {
        this.f17338OooO00o.OooO0O0(r2);
    }

    public void OooO0O0(Date date) {
        this.f17338OooO00o.OooO0O0(new C5432IlIlIlL(date));
    }

    public void OooO0O0(X500Principal x500Principal) {
        try {
            this.f17338OooO00o.OooO0O0(new C6790lll1I11(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }

    public void OooO0O0(boolean[] zArr) {
        this.f17338OooO00o.OooO0O0(OooO00o(zArr));
    }
}
