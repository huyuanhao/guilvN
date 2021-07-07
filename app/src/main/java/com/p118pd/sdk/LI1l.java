package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.LI1l */
public class LI1l extends SignatureSpi {
    public AbstractC6436l11LI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9446Iil f16263OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f16264OooO00o;

    /* renamed from: com.pd.sdk.LI1l$OooO00o */
    public static class OooO00o extends LI1l {
        public OooO00o() {
            super(new C9495LLIl(), new C9446Iil());
        }
    }

    /* renamed from: com.pd.sdk.LI1l$OooO0O0 */
    public static class OooO0O0 extends LI1l {
        public OooO0O0() {
            super(new I1li1Ll(), new C9446Iil());
        }
    }

    /* renamed from: com.pd.sdk.LI1l$OooO0OO */
    public static class OooO0OO extends LI1l {
        public OooO0OO() {
            super(new i1iLLll(), new C9446Iil());
        }
    }

    /* renamed from: com.pd.sdk.LI1l$OooO0Oo  reason: case insensitive filesystem */
    public static class C5608OooO0Oo extends LI1l {
        public C5608OooO0Oo() {
            super(new C5622LILlL(), new C9446Iil());
        }
    }

    public LI1l(AbstractC6436l11LI r1, C9446Iil r2) {
        this.OooO00o = r1;
        this.f16263OooO00o = r2;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        AbstractC6370iIIIl OooO00o2 = C5206IIi.OooO00o(privateKey);
        SecureRandom secureRandom = this.f16264OooO00o;
        if (secureRandom != null) {
            OooO00o2 = new liLL1l(OooO00o2, secureRandom);
        }
        this.OooO00o.reset();
        this.f16263OooO00o.OooO00o(true, OooO00o2);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f16264OooO00o = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        C6213iL11I OooO00o2 = C5206IIi.OooO00o(publicKey);
        this.OooO00o.reset();
        this.f16263OooO00o.OooO00o(false, (AbstractC6370iIIIl) OooO00o2);
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
        byte[] bArr = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr, 0);
        try {
            return this.f16263OooO00o.m21485OooO00o(bArr);
        } catch (Exception e) {
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
        byte[] bArr2 = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr2, 0);
        return this.f16263OooO00o.OooO00o(bArr2, bArr);
    }
}
