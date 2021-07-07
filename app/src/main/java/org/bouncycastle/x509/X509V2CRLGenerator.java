package org.bouncycastle.x509;

import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.C5190I1lIiL;
import com.p118pd.sdk.C5432IlIlIlL;
import com.p118pd.sdk.C5492I1;
import com.p118pd.sdk.C5707LiL1;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C6159iLII;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6513lIiI;
import com.p118pd.sdk.C6640li1lI;
import com.p118pd.sdk.C6782lli11;
import com.p118pd.sdk.C6790lll1I11;
import com.p118pd.sdk.C6889lllIL;
import com.p118pd.sdk.C929811Li1;
import com.p118pd.sdk.C93211ll;
import com.p118pd.sdk.C9431I;
import com.p118pd.sdk.C9623il;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iI11IL;
import com.p118pd.sdk.iILLL1;
import com.p118pd.sdk.iIilII1;
import com.p118pd.sdk.ii1I11l;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class X509V2CRLGenerator {
    public C5492I1 OooO00o = new C5492I1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f23986OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f23987OooO00o = new C6640li1lI();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f23988OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6889lllIL f23989OooO00o = new C6889lllIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f23990OooO00o;

    public static class ExtCRLException extends CRLException {
        public Throwable cause;

        public ExtCRLException(String str, Throwable th) {
            super(str);
            this.cause = th;
        }

        public Throwable getCause() {
            return this.cause;
        }
    }

    private C6782lli11 OooO00o() {
        if (!this.f23989OooO00o.m18044OooO00o()) {
            this.OooO00o.OooO00o(this.f23989OooO00o.OooO00o());
        }
        return this.OooO00o.OooO00o();
    }

    private X509CRL OooO00o(C6782lli11 lli11, byte[] bArr) throws CRLException {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(lli11);
        r0.OooO00o(this.f23988OooO00o);
        r0.OooO00o(new iIilII1(bArr));
        return new C6159iLII(new C5190I1lIiL(new C5707LiL1(r0)));
    }

    public X509CRL OooO00o(PrivateKey privateKey) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, (SecureRandom) null);
    }

    public X509CRL OooO00o(PrivateKey privateKey, String str) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return OooO00o(privateKey, str, (SecureRandom) null);
    }

    public X509CRL OooO00o(PrivateKey privateKey, String str, SecureRandom secureRandom) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C6782lli11 OooO00o2 = OooO00o();
        try {
            return OooO00o(OooO00o2, C93211ll.OooO00o(this.f23986OooO00o, this.f23990OooO00o, str, privateKey, secureRandom, OooO00o2));
        } catch (IOException e) {
            throw new ExtCRLException("cannot generate CRL encoding", e);
        }
    }

    public X509CRL OooO00o(PrivateKey privateKey, SecureRandom secureRandom) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        C6782lli11 OooO00o2 = OooO00o();
        try {
            return OooO00o(OooO00o2, C93211ll.OooO00o(this.f23986OooO00o, this.f23990OooO00o, privateKey, secureRandom, OooO00o2));
        } catch (IOException e) {
            throw new ExtCRLException("cannot generate CRL encoding", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Iterator m22988OooO00o() {
        return C93211ll.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m22989OooO00o() {
        this.OooO00o = new C5492I1();
        this.f23989OooO00o.m18043OooO00o();
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r5) {
        this.f23989OooO00o.OooO00o(new LlLI1(llLI1.m16387OooO0O0()), z, r5);
    }

    public void OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        this.f23989OooO00o.OooO00o(new LlLI1(llLI1.m16387OooO0O0()), z, bArr);
    }

    public void OooO00o(C929811Li1 r2) {
        this.OooO00o.OooO00o(r2);
    }

    public void OooO00o(String str) {
        this.f23990OooO00o = str;
        try {
            LlLI1 OooO00o2 = C93211ll.OooO00o(str);
            this.f23986OooO00o = OooO00o2;
            C6456l1ilL OooO00o3 = C93211ll.OooO00o(OooO00o2, str);
            this.f23988OooO00o = OooO00o3;
            this.OooO00o.OooO00o(OooO00o3);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unknown signature type requested");
        }
    }

    public void OooO00o(String str, boolean z, AbstractC6854lLi1LL r4) {
        OooO00o(new LlLI1(str), z, r4);
    }

    public void OooO00o(String str, boolean z, byte[] bArr) {
        OooO00o(new LlLI1(str), z, bArr);
    }

    public void OooO00o(BigInteger bigInteger, Date date, int i) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), i);
    }

    public void OooO00o(BigInteger bigInteger, Date date, int i, Date date2) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), i, new C9623il(date2));
    }

    public void OooO00o(BigInteger bigInteger, Date date, C9431I r5) {
        this.OooO00o.OooO00o(new C6513lIiI(bigInteger), new C5432IlIlIlL(date), iI11IL.OooO00o(r5));
    }

    public void OooO00o(X509CRL x509crl) throws CRLException {
        Set<? extends X509CRLEntry> revokedCertificates = x509crl.getRevokedCertificates();
        if (revokedCertificates != null) {
            for (X509CRLEntry x509CRLEntry : revokedCertificates) {
                try {
                    this.OooO00o.OooO00o(I11li1.OooO00o((Object) new C5805Ll1(x509CRLEntry.getEncoded()).OooO00o()));
                } catch (IOException e) {
                    throw new CRLException("exception processing encoding of CRL: " + e.toString());
                }
            }
        }
    }

    public void OooO00o(Date date) {
        this.OooO00o.OooO00o(new C5432IlIlIlL(date));
    }

    public void OooO00o(X500Principal x500Principal) {
        try {
            this.OooO00o.OooO00o(new C6790lll1I11(x500Principal.getEncoded()));
        } catch (IOException e) {
            throw new IllegalArgumentException("can't process principal: " + e);
        }
    }

    public X509CRL OooO0O0(PrivateKey privateKey) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return OooO0O0(privateKey, BouncyCastleProvider.PROVIDER_NAME, null);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public X509CRL OooO0O0(PrivateKey privateKey, String str) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return OooO0O0(privateKey, str, null);
    }

    public X509CRL OooO0O0(PrivateKey privateKey, String str, SecureRandom secureRandom) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
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

    public X509CRL OooO0O0(PrivateKey privateKey, SecureRandom secureRandom) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return OooO0O0(privateKey, BouncyCastleProvider.PROVIDER_NAME, secureRandom);
        } catch (NoSuchProviderException unused) {
            throw new SecurityException("BC provider not installed!");
        }
    }

    public void OooO0O0(Date date) {
        this.OooO00o.OooO0O0(new C5432IlIlIlL(date));
    }
}
