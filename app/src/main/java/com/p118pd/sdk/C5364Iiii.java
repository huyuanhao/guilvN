package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.Iiii  reason: case insensitive filesystem */
public class C5364Iiii extends SignatureSpi {
    public C9689lLii OooO00o;

    /* renamed from: com.pd.sdk.Iiii$OooO */
    public static class OooO extends C5364Iiii {
        public OooO() {
            super(C5427IlI1.OooOO0o(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO00o */
    public static class OooO00o extends C5364Iiii {
        public OooO00o() {
            super(new C93241IIlL(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0O0 */
    public static class OooO0O0 extends C5364Iiii {
        public OooO0O0() {
            super(new C9706liLi(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0OO */
    public static class OooO0OO extends C5364Iiii {
        public OooO0OO() {
            super(C5427IlI1.OooO0O0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0Oo  reason: case insensitive filesystem */
    public static class C5365OooO0Oo extends C5364Iiii {
        public C5365OooO0Oo() {
            super(C5427IlI1.OooO0OO(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0o */
    public static class OooO0o extends C5364Iiii {
        public OooO0o() {
            super(C5427IlI1.OooO0o0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0o0  reason: case insensitive filesystem */
    public static class C5366OooO0o0 extends C5364Iiii {
        public C5366OooO0o0() {
            super(C5427IlI1.OooO0Oo(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0oO  reason: case insensitive filesystem */
    public static class C5367OooO0oO extends C5364Iiii {
        public C5367OooO0oO() {
            super(C5427IlI1.OooOO0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooO0oo  reason: case insensitive filesystem */
    public static class C5368OooO0oo extends C5364Iiii {
        public C5368OooO0oo() {
            super(C5427IlI1.OooOO0O(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.Iiii$OooOO0 */
    public static class OooOO0 extends C5364Iiii {
        public OooOO0() {
            super(new i1lILlii(), new C6114iIiI());
        }
    }

    public C5364Iiii(AbstractC6436l11LI r2, Ii1IliL r3) {
        this.OooO00o = new C9689lLii(r3, r2);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.OooO00o.OooO00o(true, C6703lill.OooO00o((RSAPrivateKey) privateKey));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.OooO00o.OooO00o(false, C6703lill.OooO00o((RSAPublicKey) publicKey));
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
            return this.OooO00o.OooO0O0();
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
        return this.OooO00o.OooO00o(bArr);
    }
}
