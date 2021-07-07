package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSPublicKey;

/* renamed from: com.pd.sdk.lI1iiI  reason: case insensitive filesystem */
public class C6482lI1iiI extends Signature implements AbstractC5609LI1lii {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public l1L1i f18347OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18348OooO00o;
    public LlLI1 o00OoOOo;

    /* renamed from: com.pd.sdk.lI1iiI$OooO00o */
    public static class OooO00o extends C6482lI1iiI {
        public OooO00o() {
            super("SHA256withXMSS", new I1li1Ll(), new l1L1i());
        }
    }

    /* renamed from: com.pd.sdk.lI1iiI$OooO0O0 */
    public static class OooO0O0 extends C6482lI1iiI {
        public OooO0O0() {
            super("SHA512withXMSS", new C5622LILlL(), new l1L1i());
        }
    }

    /* renamed from: com.pd.sdk.lI1iiI$OooO0OO */
    public static class OooO0OO extends C6482lI1iiI {
        public OooO0OO() {
            super("SHAKE128withXMSSMT", new C6423iIii(128), new l1L1i());
        }
    }

    /* renamed from: com.pd.sdk.lI1iiI$OooO0Oo  reason: case insensitive filesystem */
    public static class C6483OooO0Oo extends C6482lI1iiI {
        public C6483OooO0Oo() {
            super("SHAKE256withXMSS", new C6423iIii(256), new l1L1i());
        }
    }

    public C6482lI1iiI(String str) {
        super(str);
    }

    public C6482lI1iiI(String str, AbstractC6436l11LI r2, l1L1i l1l1i) {
        super(str);
        this.OooO00o = r2;
        this.f18347OooO00o = l1l1i;
    }

    @Override // com.p118pd.sdk.AbstractC5609LI1lii, com.p118pd.sdk.AbstractC5609LI1lii
    public PrivateKey OooO00o() {
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            BCXMSSPrivateKey bCXMSSPrivateKey = new BCXMSSPrivateKey(llLI1, (C5844LI1L) this.f18347OooO00o.OooO00o());
            this.o00OoOOo = null;
            return bCXMSSPrivateKey;
        }
        throw new IllegalStateException("signature object not in a signing state");
    }

    @Override // com.p118pd.sdk.AbstractC5609LI1lii, com.p118pd.sdk.AbstractC5609LI1lii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17622OooO00o() {
        return this.o00OoOOo != null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCXMSSPrivateKey) {
            BCXMSSPrivateKey bCXMSSPrivateKey = (BCXMSSPrivateKey) privateKey;
            AbstractC6370iIIIl keyParams = bCXMSSPrivateKey.getKeyParams();
            this.o00OoOOo = bCXMSSPrivateKey.getTreeDigestOID();
            SecureRandom secureRandom = this.f18348OooO00o;
            if (secureRandom != null) {
                keyParams = new liLL1l(keyParams, secureRandom);
            }
            this.OooO00o.reset();
            this.f18347OooO00o.OooO00o(true, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown private key passed to XMSS");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f18348OooO00o = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCXMSSPublicKey) {
            AbstractC6370iIIIl keyParams = ((BCXMSSPublicKey) publicKey).getKeyParams();
            this.o00OoOOo = null;
            this.OooO00o.reset();
            this.f18347OooO00o.OooO00o(false, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown public key passed to XMSS");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f18347OooO00o.OooO00o(C6194iLlil.m17164OooO00o(this.OooO00o));
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                throw new SignatureException(e.getMessage());
            }
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f18347OooO00o.OooO00o(C6194iLlil.m17164OooO00o(this.OooO00o), bArr);
    }
}
