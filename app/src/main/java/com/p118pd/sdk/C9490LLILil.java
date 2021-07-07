package com.p118pd.sdk;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.丨LLILil  reason: invalid class name and case insensitive filesystem */
public class C9490LLILil extends SignatureSpi {
    public C5185I1li OooO00o;

    /* renamed from: com.pd.sdk.丨LLILil$OooO */
    public static class OooO extends C9490LLILil {
        public OooO() {
            super(C5427IlI1.OooOO0o(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO00o */
    public static class OooO00o extends C9490LLILil {
        public OooO00o() {
            super(C5427IlI1.OooO00o(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0O0 */
    public static class OooO0O0 extends C9490LLILil {
        public OooO0O0() {
            super(new C9706liLi(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0OO */
    public static class OooO0OO extends C9490LLILil {
        public OooO0OO() {
            super(C5427IlI1.OooO0O0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0Oo  reason: case insensitive filesystem */
    public static class C9491OooO0Oo extends C9490LLILil {
        public C9491OooO0Oo() {
            super(C5427IlI1.OooO0OO(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0o */
    public static class OooO0o extends C9490LLILil {
        public OooO0o() {
            super(C5427IlI1.OooO0o0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0o0  reason: case insensitive filesystem */
    public static class C9492OooO0o0 extends C9490LLILil {
        public C9492OooO0o0() {
            super(C5427IlI1.OooO0Oo(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0oO  reason: case insensitive filesystem */
    public static class C9493OooO0oO extends C9490LLILil {
        public C9493OooO0oO() {
            super(C5427IlI1.OooOO0(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooO0oo  reason: case insensitive filesystem */
    public static class C9494OooO0oo extends C9490LLILil {
        public C9494OooO0oo() {
            super(C5427IlI1.OooOO0O(), new C6114iIiI());
        }
    }

    /* renamed from: com.pd.sdk.丨LLILil$OooOO0 */
    public static class OooOO0 extends C9490LLILil {
        public OooOO0() {
            super(new i1lILlii(), new C6114iIiI());
        }
    }

    public C9490LLILil(AbstractC6436l11LI r3, Ii1IliL r4) {
        this.OooO00o = new C5185I1li(r4, r3, true);
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        this.OooO00o.OooO00o(true, (AbstractC6370iIIIl) C6703lill.OooO00o((RSAPrivateKey) privateKey));
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        this.OooO00o.OooO00o(false, (AbstractC6370iIIIl) C6703lill.OooO00o((RSAPublicKey) publicKey));
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
        return this.OooO00o.m15308OooO00o(bArr);
    }
}
