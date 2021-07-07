package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.iL1liLl */
public class iL1liLl extends AbstractC5199IIL1 {
    public static AbstractC5430IlIl OooO00o = new C6516lIl1Li();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Illiiil f17680OooO00o = new C9702liIIL();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LIlL f17681OooO00o = new LIlL(new C6858liI());

    /* renamed from: OooO00o  reason: collision with other field name */
    public KeyPair f17682OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PrivateKey f17683OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PublicKey f17684OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17685OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f17686OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17687OooO00o;
    public List OooO0O0 = new ArrayList();

    public iL1liLl(LlLI1 llLI1, PrivateKey privateKey, PublicKey publicKey, LlLI1 llLI12) {
        super(llLI1, C6888ll.OooO00o(publicKey.getEncoded()), llLI12);
        this.f17684OooO00o = publicKey;
        this.f17683OooO00o = privateKey;
    }

    private void OooO00o(LlLI1 llLI1) throws CMSException {
        if (this.f17685OooO00o == null) {
            this.f17685OooO00o = new SecureRandom();
        }
        if (C5334IL1.OooO0OO(llLI1) && this.f17682OooO00o == null) {
            try {
                C6888ll OooO00o2 = C6888ll.OooO00o(this.f17684OooO00o.getEncoded());
                AlgorithmParameters OooO00o3 = this.f17681OooO00o.m16119OooO00o(llLI1);
                OooO00o3.init(OooO00o2.m18041OooO00o().m17587OooO0O0().OooO0O0().getEncoded());
                KeyPairGenerator OooO00o4 = this.f17681OooO00o.m16121OooO00o(llLI1);
                OooO00o4.initialize(OooO00o3.getParameterSpec(AlgorithmParameterSpec.class), this.f17685OooO00o);
                this.f17682OooO00o = OooO00o4.generateKeyPair();
            } catch (Exception e) {
                throw new CMSException("cannot determine MQV ephemeral key pair parameters from public key: " + e, e);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5199IIL1
    public I11li1 OooO00o(C6456l1ilL r12, C6456l1ilL r13, LIiI11 r14) throws CMSException {
        AlgorithmParameterSpec algorithmParameterSpec;
        C6487lIIiIlL r6;
        if (!this.f17686OooO00o.isEmpty()) {
            OooO00o(r12.OooO00o());
            PrivateKey privateKey = this.f17683OooO00o;
            LlLI1 OooO00o2 = r12.OooO00o();
            iILLL1 r1 = new iILLL1();
            for (int i = 0; i != this.f17686OooO00o.size(); i++) {
                PublicKey publicKey = (PublicKey) this.OooO0O0.get(i);
                C6731ll1i ll1i = (C6731ll1i) this.f17686OooO00o.get(i);
                try {
                    LlLI1 OooO00o3 = r13.OooO00o();
                    if (C5334IL1.OooO0OO(OooO00o2)) {
                        algorithmParameterSpec = new IilLi1(this.f17682OooO00o, publicKey, this.f17687OooO00o);
                    } else if (C5334IL1.OooO00o(OooO00o2)) {
                        algorithmParameterSpec = new C6350illI1i(OooO00o.OooO00o(r13, this.f17680OooO00o.OooO00o(OooO00o3), this.f17687OooO00o));
                    } else if (C5334IL1.OooO0Oo(OooO00o2)) {
                        if (this.f17687OooO00o != null) {
                            algorithmParameterSpec = new C6350illI1i(this.f17687OooO00o);
                        } else if (!OooO00o2.equals(AbstractC5711LiLli.o000oo0o)) {
                            algorithmParameterSpec = null;
                        } else {
                            throw new CMSException("User keying material must be set for static keys.");
                        }
                    } else if (!C5334IL1.OooO0O0(OooO00o2)) {
                        throw new CMSException("Unknown key agreement algorithm: " + OooO00o2);
                    } else if (this.f17687OooO00o != null) {
                        algorithmParameterSpec = new C6350illI1i(this.f17687OooO00o);
                    } else {
                        throw new CMSException("User keying material must be set for static keys.");
                    }
                    KeyAgreement OooO00o4 = this.f17681OooO00o.m16123OooO00o(OooO00o2);
                    OooO00o4.init(privateKey, algorithmParameterSpec, this.f17685OooO00o);
                    OooO00o4.doPhase(publicKey, true);
                    SecretKey generateSecret = OooO00o4.generateSecret(OooO00o3.m16387OooO0O0());
                    Cipher OooO00o5 = this.f17681OooO00o.m16122OooO00o(OooO00o3);
                    if (OooO00o3.equals(AbstractC5331ILi.OooO0Oo) || OooO00o3.equals(AbstractC5331ILi.OooO0o0)) {
                        OooO00o5.init(3, generateSecret, new C5621LILiI(AbstractC5331ILi.OooO0oo, this.f17687OooO00o));
                        byte[] wrap = OooO00o5.wrap(this.f17681OooO00o.OooO00o(r14));
                        r6 = new C6487lIIiIlL(new C6702lili(C9586iIILl.m21632OooO00o(wrap, 0, wrap.length - 4), C9586iIILl.m21632OooO00o(wrap, wrap.length - 4, wrap.length)).OooO00o(AbstractC5533IiL.OooO00o));
                    } else {
                        OooO00o5.init(3, generateSecret, this.f17685OooO00o);
                        r6 = new C6487lIIiIlL(OooO00o5.wrap(this.f17681OooO00o.OooO00o(r14)));
                    }
                    r1.OooO00o(new C9697li(ll1i, r6));
                } catch (GeneralSecurityException e) {
                    throw new CMSException("cannot perform agreement step: " + e.getMessage(), e);
                } catch (IOException e2) {
                    throw new CMSException("unable to encode wrapped key: " + e2.getMessage(), e2);
                }
            }
            return new C5707LiL1(r1);
        }
        throw new CMSException("No recipients associated with generator - use addRecipient()");
    }

    public iL1liLl OooO00o(String str) {
        this.f17681OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public iL1liLl OooO00o(Provider provider) {
        this.f17681OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    public iL1liLl OooO00o(SecureRandom secureRandom) {
        this.f17685OooO00o = secureRandom;
        return this;
    }

    public iL1liLl OooO00o(X509Certificate x509Certificate) throws CertificateEncodingException {
        this.f17686OooO00o.add(new C6731ll1i(C5334IL1.OooO00o(x509Certificate)));
        this.OooO0O0.add(x509Certificate.getPublicKey());
        return this;
    }

    public iL1liLl OooO00o(byte[] bArr) {
        this.f17687OooO00o = C9586iIILl.m21630OooO00o(bArr);
        return this;
    }

    public iL1liLl OooO00o(byte[] bArr, PublicKey publicKey) throws CertificateEncodingException {
        this.f17686OooO00o.add(new C6731ll1i(new L1I1Ll(bArr)));
        this.OooO0O0.add(publicKey);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5199IIL1
    public byte[] OooO00o(C6456l1ilL r4) throws CMSException {
        OooO00o(r4.OooO00o());
        KeyPair keyPair = this.f17682OooO00o;
        if (keyPair == null) {
            return this.f17687OooO00o;
        }
        C6413ili OooO00o2 = OooO00o(C6888ll.OooO00o(keyPair.getPublic().getEncoded()));
        try {
            return this.f17687OooO00o != null ? new C5794LliLiLl(OooO00o2, new C6487lIIiIlL(this.f17687OooO00o)).getEncoded() : new C5794LliLiLl(OooO00o2, null).getEncoded();
        } catch (IOException e) {
            throw new CMSException("unable to encode user keying material: " + e.getMessage(), e);
        }
    }
}
