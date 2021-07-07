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
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.x509.CertificateFactory;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.x509.ExtCertificateEncodingException;

/* renamed from: com.pd.sdk.ILi11lL */
public class ILi11lL {
    public LlLI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1Lii f15603OooO00o = new i1Lii();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f15604OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f15605OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f15606OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CertificateFactory f15607OooO00o = new CertificateFactory();

    private X509Certificate OooO00o(C5314ILlLL iLlLL, byte[] bArr) throws CertificateEncodingException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(iLlLL);
        r0.OooO00o(this.f15605OooO00o);
        r0.OooO00o(new iIilII1(bArr));
        try {
            return (X509Certificate) this.f15607OooO00o.engineGenerateCertificate(new ByteArrayInputStream(new C5707LiL1(r0).OooO00o(AbstractC5533IiL.OooO00o)));
        } catch (Exception e) {
            throw new ExtCertificateEncodingException("exception producing certificate object", e);
        }
    }

    public X509Certificate OooO00o(PrivateKey privateKey) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, (SecureRandom) null);
    }

    public X509Certificate OooO00o(PrivateKey privateKey, String str) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, str, null);
    }

    public X509Certificate OooO00o(PrivateKey privateKey, String str, SecureRandom secureRandom) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C5314ILlLL OooO00o2 = this.f15603OooO00o.OooO00o();
        try {
            return OooO00o(OooO00o2, C93211ll.OooO00o(this.OooO00o, this.f15606OooO00o, str, privateKey, secureRandom, OooO00o2));
        } catch (IOException e) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e);
        }
    }

    public X509Certificate OooO00o(PrivateKey privateKey, SecureRandom secureRandom) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C5314ILlLL OooO00o2 = this.f15603OooO00o.OooO00o();
        try {
            return OooO00o(OooO00o2, C93211ll.OooO00o(this.OooO00o, this.f15606OooO00o, privateKey, secureRandom, OooO00o2));
        } catch (IOException e) {
            throw new ExtCertificateEncodingException("exception encoding TBS cert", e);
        }
    }

    public Iterator OooO00o() {
        return C93211ll.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15505OooO00o() {
        this.f15603OooO00o = new i1Lii();
    }

    public void OooO00o(C929811Li1 r2) {
        this.f15603OooO00o.OooO00o(r2);
    }

    public void OooO00o(String str) {
        this.f15606OooO00o = str;
        try {
            LlLI1 OooO00o2 = C93211ll.OooO00o(str);
            this.OooO00o = OooO00o2;
            C6456l1ilL OooO00o3 = C93211ll.OooO00o(OooO00o2, str);
            this.f15605OooO00o = OooO00o3;
            this.f15603OooO00o.OooO00o(OooO00o3);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void OooO00o(BigInteger bigInteger) {
        if (bigInteger.compareTo(BigInteger.ZERO) > 0) {
            this.f15603OooO00o.OooO00o(new C6513lIiI(bigInteger));
            return;
        }
        throw new IllegalArgumentException("serial number must be a positive integer");
    }

    public void OooO00o(PublicKey publicKey) {
        try {
            this.f15603OooO00o.OooO00o(C6888ll.OooO00o(publicKey.getEncoded()));
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to process key - " + e.toString());
        }
    }

    public void OooO00o(Date date) {
        this.f15603OooO00o.OooO00o(new C5432IlIlIlL(date));
    }

    public void OooO00o(X500Principal x500Principal) {
        try {
            this.f15603OooO00o.OooO00o(new C6790lll1I11(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
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
        this.f15603OooO00o.OooO0O0(r2);
    }

    public void OooO0O0(Date date) {
        this.f15603OooO00o.OooO0O0(new C5432IlIlIlL(date));
    }

    public void OooO0O0(X500Principal x500Principal) {
        try {
            this.f15603OooO00o.OooO0O0(new C6790lll1I11(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }
}
