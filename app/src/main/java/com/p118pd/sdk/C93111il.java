package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPrivateKey;
import org.bouncycastle.pqc.jcajce.provider.xmss.BCXMSSMTPublicKey;

/* renamed from: com.pd.sdk.丨1il  reason: invalid class name and case insensitive filesystem */
public class C93111il extends Signature implements AbstractC5609LI1lii {
    public C5602L1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f22813OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f22814OooO00o;
    public LlLI1 o00OoOOo;

    /* renamed from: com.pd.sdk.丨1il$OooO00o */
    public static class OooO00o extends C93111il {
        public OooO00o() {
            super("SHA256withXMSSMT", new I1li1Ll(), new C5602L1l());
        }
    }

    /* renamed from: com.pd.sdk.丨1il$OooO0O0 */
    public static class OooO0O0 extends C93111il {
        public OooO0O0() {
            super("SHA512withXMSSMT", new C5622LILlL(), new C5602L1l());
        }
    }

    /* renamed from: com.pd.sdk.丨1il$OooO0OO */
    public static class OooO0OO extends C93111il {
        public OooO0OO() {
            super("SHAKE128withXMSSMT", new C6423iIii(128), new C5602L1l());
        }
    }

    /* renamed from: com.pd.sdk.丨1il$OooO0Oo  reason: case insensitive filesystem */
    public static class C9312OooO0Oo extends C93111il {
        public C9312OooO0Oo() {
            super("SHAKE256withXMSSMT", new C6423iIii(256), new C5602L1l());
        }
    }

    public C93111il(String str) {
        super(str);
    }

    public C93111il(String str, AbstractC6436l11LI r2, C5602L1l r3) {
        super(str);
        this.f22813OooO00o = r2;
        this.OooO00o = r3;
    }

    @Override // com.p118pd.sdk.AbstractC5609LI1lii, com.p118pd.sdk.AbstractC5609LI1lii
    public PrivateKey OooO00o() {
        LlLI1 llLI1 = this.o00OoOOo;
        if (llLI1 != null) {
            BCXMSSMTPrivateKey bCXMSSMTPrivateKey = new BCXMSSMTPrivateKey(llLI1, (C6643li1l) this.OooO00o.OooO00o());
            this.o00OoOOo = null;
            return bCXMSSMTPrivateKey;
        }
        throw new IllegalStateException("signature object not in a signing state");
    }

    @Override // com.p118pd.sdk.AbstractC5609LI1lii, com.p118pd.sdk.AbstractC5609LI1lii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21330OooO00o() {
        return this.o00OoOOo != null;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCXMSSMTPrivateKey) {
            BCXMSSMTPrivateKey bCXMSSMTPrivateKey = (BCXMSSMTPrivateKey) privateKey;
            AbstractC6370iIIIl keyParams = bCXMSSMTPrivateKey.getKeyParams();
            this.o00OoOOo = bCXMSSMTPrivateKey.getTreeDigestOID();
            SecureRandom secureRandom = this.f22814OooO00o;
            if (secureRandom != null) {
                keyParams = new liLL1l(keyParams, secureRandom);
            }
            this.f22813OooO00o.reset();
            this.OooO00o.OooO00o(true, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown private key passed to XMSSMT");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f22814OooO00o = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCXMSSMTPublicKey) {
            AbstractC6370iIIIl keyParams = ((BCXMSSMTPublicKey) publicKey).getKeyParams();
            this.o00OoOOo = null;
            this.f22813OooO00o.reset();
            this.OooO00o.OooO00o(false, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown public key passed to XMSSMT");
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
            return this.OooO00o.OooO00o(C6194iLlil.m17164OooO00o(this.f22813OooO00o));
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                throw new SignatureException(e.getMessage());
            }
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f22813OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f22813OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.OooO00o.OooO00o(C6194iLlil.m17164OooO00o(this.f22813OooO00o), bArr);
    }
}
