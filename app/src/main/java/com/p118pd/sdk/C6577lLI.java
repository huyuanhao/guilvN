package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PrivateKey;
import org.bouncycastle.pqc.jcajce.provider.sphincs.BCSphincs256PublicKey;

/* renamed from: com.pd.sdk.lLI丨  reason: invalid class name and case insensitive filesystem */
public class C6577lLI extends SignatureSpi {
    public L11L1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18493OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18494OooO00o;

    /* renamed from: com.pd.sdk.lLI丨$OooO00o */
    public static class OooO00o extends C6577lLI {
        public OooO00o() {
            super(new C6249iiLi(512), new L11L1(new C6249iiLi(256), new C6249iiLi(512)));
        }
    }

    /* renamed from: com.pd.sdk.lLI丨$OooO0O0 */
    public static class OooO0O0 extends C6577lLI {
        public OooO0O0() {
            super(new C5622LILlL(), new L11L1(new I1llii(256), new C5622LILlL()));
        }
    }

    public C6577lLI(AbstractC6436l11LI r1, L11L1 r2) {
        this.f18493OooO00o = r1;
        this.OooO00o = r2;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCSphincs256PrivateKey) {
            AbstractC6370iIIIl keyParams = ((BCSphincs256PrivateKey) privateKey).getKeyParams();
            SecureRandom secureRandom = this.f18494OooO00o;
            if (secureRandom != null) {
                keyParams = new liLL1l(keyParams, secureRandom);
            }
            this.f18493OooO00o.reset();
            this.OooO00o.OooO00o(true, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown private key passed to SPHINCS-256");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        this.f18494OooO00o = secureRandom;
        engineInitSign(privateKey);
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCSphincs256PublicKey) {
            AbstractC6370iIIIl keyParams = ((BCSphincs256PublicKey) publicKey).getKeyParams();
            this.f18493OooO00o.reset();
            this.OooO00o.OooO00o(false, keyParams);
            return;
        }
        throw new InvalidKeyException("unknown public key passed to SPHINCS-256");
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
        byte[] bArr = new byte[this.f18493OooO00o.OooO0O0()];
        this.f18493OooO00o.OooO00o(bArr, 0);
        try {
            return this.OooO00o.OooO00o(bArr);
        } catch (Exception e) {
            throw new SignatureException(e.toString());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f18493OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f18493OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        byte[] bArr2 = new byte[this.f18493OooO00o.OooO0O0()];
        this.f18493OooO00o.OooO00o(bArr2, 0);
        return this.OooO00o.OooO00o(bArr2, bArr);
    }
}
