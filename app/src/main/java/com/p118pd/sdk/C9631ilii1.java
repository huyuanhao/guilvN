package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.丨ilii1  reason: invalid class name and case insensitive filesystem */
public class C9631ilii1 extends SignatureSpi {
    public byte OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23210OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final ii1I11l f23211OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23212OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f23213OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9684lIl f23214OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AlgorithmParameters f23215OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PSSParameterSpec f23216OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23217OooO00o;
    public AbstractC6436l11LI OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public PSSParameterSpec f23218OooO0O0;

    /* renamed from: com.pd.sdk.丨ilii1$OooO */
    public static class OooO extends C9631ilii1 {
        public OooO() {
            super(new C6114iIiI(), new PSSParameterSpec("SHA3-384", "MGF1", new MGF1ParameterSpec("SHA3-384"), 48, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO00o */
    public class OooO00o implements AbstractC6436l11LI {
        public AbstractC6436l11LI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public ByteArrayOutputStream f23220OooO00o = new ByteArrayOutputStream();

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f23221OooO00o = true;

        public OooO00o(AbstractC6436l11LI r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public int OooO00o() {
            return 0;
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public int OooO00o(byte[] bArr, int i) {
            byte[] byteArray = this.f23220OooO00o.toByteArray();
            if (this.f23221OooO00o) {
                System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
            } else {
                this.OooO00o.update(byteArray, 0, byteArray.length);
                this.OooO00o.OooO00o(bArr, i);
            }
            reset();
            this.f23221OooO00o = !this.f23221OooO00o;
            return byteArray.length;
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        /* renamed from: OooO00o  reason: collision with other method in class */
        public String m21695OooO00o() {
            return "NULL";
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public int OooO0O0() {
            return this.OooO00o.OooO0O0();
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public void reset() {
            this.f23220OooO00o.reset();
            this.OooO00o.reset();
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public void update(byte b) {
            this.f23220OooO00o.write(b);
        }

        @Override // com.p118pd.sdk.AbstractC6436l11LI
        public void update(byte[] bArr, int i, int i2) {
            this.f23220OooO00o.write(bArr, i, i2);
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0O0 */
    public static class OooO0O0 extends C9631ilii1 {
        public OooO0O0() {
            super(new C6114iIiI(), null);
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0OO */
    public static class OooO0OO extends C9631ilii1 {
        public OooO0OO() {
            super(new C6114iIiI(), PSSParameterSpec.DEFAULT);
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0Oo  reason: case insensitive filesystem */
    public static class C9632OooO0Oo extends C9631ilii1 {
        public C9632OooO0Oo() {
            super(new C6114iIiI(), new PSSParameterSpec(LL1i.OooO0OO, "MGF1", new MGF1ParameterSpec(LL1i.OooO0OO), 28, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0o */
    public static class OooO0o extends C9631ilii1 {
        public OooO0o() {
            super(new C6114iIiI(), new PSSParameterSpec(LL1i.f16409OooO0o0, "MGF1", new MGF1ParameterSpec(LL1i.f16409OooO0o0), 48, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0o0  reason: case insensitive filesystem */
    public static class C9633OooO0o0 extends C9631ilii1 {
        public C9633OooO0o0() {
            super(new C6114iIiI(), new PSSParameterSpec(LL1i.OooO0Oo, "MGF1", new MGF1ParameterSpec(LL1i.OooO0Oo), 32, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0oO  reason: case insensitive filesystem */
    public static class C9634OooO0oO extends C9631ilii1 {
        public C9634OooO0oO() {
            super(new C6114iIiI(), new PSSParameterSpec("SHA3-224", "MGF1", new MGF1ParameterSpec("SHA3-224"), 28, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooO0oo  reason: case insensitive filesystem */
    public static class C9635OooO0oo extends C9631ilii1 {
        public C9635OooO0oo() {
            super(new C6114iIiI(), new PSSParameterSpec(C6229iiIL.OooO0OO, "MGF1", new MGF1ParameterSpec(C6229iiIL.OooO0OO), 32, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooOO0 */
    public static class OooOO0 extends C9631ilii1 {
        public OooOO0() {
            super(new C6114iIiI(), new PSSParameterSpec("SHA3-512", "MGF1", new MGF1ParameterSpec("SHA3-512"), 64, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooOO0O */
    public static class OooOO0O extends C9631ilii1 {
        public OooOO0O() {
            super(new C6114iIiI(), new PSSParameterSpec("SHA-512(224)", "MGF1", new MGF1ParameterSpec("SHA-512(224)"), 28, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooOO0o  reason: case insensitive filesystem */
    public static class C9636OooOO0o extends C9631ilii1 {
        public C9636OooOO0o() {
            super(new C6114iIiI(), new PSSParameterSpec("SHA-512(256)", "MGF1", new MGF1ParameterSpec("SHA-512(256)"), 32, 1));
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooOOO */
    public static class OooOOO extends C9631ilii1 {
        public OooOOO() {
            super(new C6114iIiI(), null, true);
        }
    }

    /* renamed from: com.pd.sdk.丨ilii1$OooOOO0 */
    public static class OooOOO0 extends C9631ilii1 {
        public OooOOO0() {
            super(new C6114iIiI(), new PSSParameterSpec(LL1i.f16408OooO0o, "MGF1", new MGF1ParameterSpec(LL1i.f16408OooO0o), 64, 1));
        }
    }

    public C9631ilii1(Ii1IliL r2, PSSParameterSpec pSSParameterSpec) {
        this(r2, pSSParameterSpec, false);
    }

    public C9631ilii1(Ii1IliL r2, PSSParameterSpec pSSParameterSpec, boolean z) {
        this.f23211OooO00o = new C6640li1lI();
        this.f23213OooO00o = r2;
        this.f23218OooO0O0 = pSSParameterSpec;
        if (pSSParameterSpec == null) {
            this.f23216OooO00o = PSSParameterSpec.DEFAULT;
        } else {
            this.f23216OooO00o = pSSParameterSpec;
        }
        this.OooO0O0 = C9487LL1i.m21539OooO00o(this.f23216OooO00o.getDigestAlgorithm());
        this.f23210OooO00o = this.f23216OooO00o.getSaltLength();
        this.OooO00o = OooO00o(this.f23216OooO00o.getTrailerField());
        this.f23217OooO00o = z;
        OooO00o();
    }

    private byte OooO00o(int i) {
        if (i == 1) {
            return C9684lIl.OooO0O0;
        }
        throw new IllegalArgumentException("unknown trailer field");
    }

    private void OooO00o() {
        this.f23212OooO00o = this.f23217OooO00o ? new OooO00o(this.OooO0O0) : this.OooO0O0;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f23215OooO00o == null && this.f23216OooO00o != null) {
            try {
                AlgorithmParameters OooO00o2 = this.f23211OooO00o.m17217OooO00o("PSS");
                this.f23215OooO00o = OooO00o2;
                OooO00o2.init(this.f23216OooO00o);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.f23215OooO00o;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            C9684lIl r0 = new C9684lIl(this.f23213OooO00o, this.f23212OooO00o, this.OooO0O0, this.f23210OooO00o, this.OooO00o);
            this.f23214OooO00o = r0;
            r0.OooO00o(true, (AbstractC6370iIIIl) C6703lill.OooO00o((RSAPrivateKey) privateKey));
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            C9684lIl r0 = new C9684lIl(this.f23213OooO00o, this.f23212OooO00o, this.OooO0O0, this.f23210OooO00o, this.OooO00o);
            this.f23214OooO00o = r0;
            r0.OooO00o(true, (AbstractC6370iIIIl) new liLL1l(C6703lill.OooO00o((RSAPrivateKey) privateKey), secureRandom));
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof RSAPublicKey) {
            C9684lIl r0 = new C9684lIl(this.f23213OooO00o, this.f23212OooO00o, this.OooO0O0, this.f23210OooO00o, this.OooO00o);
            this.f23214OooO00o = r0;
            r0.OooO00o(false, (AbstractC6370iIIIl) C6703lill.OooO00o((RSAPublicKey) publicKey));
            return;
        }
        throw new InvalidKeyException("Supplied key is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof PSSParameterSpec) {
            PSSParameterSpec pSSParameterSpec = (PSSParameterSpec) algorithmParameterSpec;
            PSSParameterSpec pSSParameterSpec2 = this.f23218OooO0O0;
            if (pSSParameterSpec2 != null && !C9487LL1i.OooO00o(pSSParameterSpec2.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                throw new InvalidAlgorithmParameterException("parameter must be using " + this.f23218OooO0O0.getDigestAlgorithm());
            } else if (!pSSParameterSpec.getMGFAlgorithm().equalsIgnoreCase("MGF1") && !pSSParameterSpec.getMGFAlgorithm().equals(AbstractC5711LiLli.Oooo000.m16387OooO0O0())) {
                throw new InvalidAlgorithmParameterException("unknown mask generation function specified");
            } else if (pSSParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec) {
                MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec) pSSParameterSpec.getMGFParameters();
                if (C9487LL1i.OooO00o(mGF1ParameterSpec.getDigestAlgorithm(), pSSParameterSpec.getDigestAlgorithm())) {
                    AbstractC6436l11LI OooO00o2 = C9487LL1i.m21539OooO00o(mGF1ParameterSpec.getDigestAlgorithm());
                    if (OooO00o2 != null) {
                        this.f23215OooO00o = null;
                        this.f23216OooO00o = pSSParameterSpec;
                        this.OooO0O0 = OooO00o2;
                        this.f23210OooO00o = pSSParameterSpec.getSaltLength();
                        this.OooO00o = OooO00o(this.f23216OooO00o.getTrailerField());
                        OooO00o();
                        return;
                    }
                    throw new InvalidAlgorithmParameterException("no match on MGF digest algorithm: " + mGF1ParameterSpec.getDigestAlgorithm());
                }
                throw new InvalidAlgorithmParameterException("digest algorithm for MGF should be the same as for PSS parameters.");
            } else {
                throw new InvalidAlgorithmParameterException("unknown MGF parameters");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Only PSSParameterSpec supported");
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        try {
            return this.f23214OooO00o.OooO0O0();
        } catch (CryptoException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) throws SignatureException {
        this.f23214OooO00o.update(b);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.f23214OooO00o.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.f23214OooO00o.OooO00o(bArr);
    }
}
