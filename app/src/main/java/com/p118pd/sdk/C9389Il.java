package com.p118pd.sdk;

import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨Il  reason: invalid class name and case insensitive filesystem */
public final class C9389Il {
    public static final Map<String, String> OooO00o;

    /* renamed from: com.pd.sdk.丨Il$OooO */
    public static class OooO extends lI11lI {
        public C1675IL OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || IILIll1.OooO00o(cls)) {
                return IILIll1.OooO00o() ? IILIll1.OooO00o(this.OooO00o.m15464OooO0O0()) : new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == C5363IiiI.class) {
                return new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.OooO00o.OooO00o());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.OooO00o.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return this.OooO00o.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (IILIll1.m15378OooO00o(algorithmParameterSpec)) {
                this.OooO00o = C1675IL.OooO00o(IILIll1.OooO00o(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof C5363IiiI) {
                C5363IiiI iiiI = (C5363IiiI) algorithmParameterSpec;
                this.OooO00o = new C1675IL(iiiI.OooO0O0(), iiiI.OooO00o() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = C1675IL.OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                this.OooO00o = C1675IL.OooO00o(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return "CCM";
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {

        /* renamed from: com.pd.sdk.丨Il$OooO0O0$OooO00o */
        public static class OooO00o implements AbstractC6769llL1L {
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final LlLLI1 f22946OooO00o;

            public OooO00o() {
                this.f22946OooO00o = new LlLLI1(new C5586L1i());
                this.OooO00o = 8;
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
            public int OooO00o() {
                return this.OooO00o;
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L
            public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
                try {
                    return this.f22946OooO00o.OooO00o(bArr, 0);
                } catch (InvalidCipherTextException e) {
                    throw new IllegalStateException("exception on doFinal(): " + e.toString());
                }
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
            /* renamed from: OooO00o  reason: collision with other method in class */
            public String m21463OooO00o() {
                return this.f22946OooO00o.m16392OooO00o() + "Mac";
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L
            public void OooO00o(AbstractC6370iIIIl r3) throws IllegalArgumentException {
                this.f22946OooO00o.OooO00o(true, r3);
                this.OooO00o = this.f22946OooO00o.m16393OooO00o().length;
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L
            public void reset() {
                this.f22946OooO00o.reset();
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L
            public void update(byte b) throws IllegalStateException {
                this.f22946OooO00o.OooO00o(b);
            }

            @Override // com.p118pd.sdk.AbstractC6769llL1L
            public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
                this.f22946OooO00o.OooO00o(bArr, i, i2);
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new lLlLIi(new C5586L1i()));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0Oo  reason: case insensitive filesystem */
    public static class C9390OooO0Oo extends C9680lII1i {
        public C9390OooO0Oo() {
            super(new C1IILlI(new iLIli1(new C5586L1i())));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0o */
    public static class OooO0o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = new SecureRandom();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("CCM");
                OooO00o.init(new C1675IL(bArr, 12).getEncoded());
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0o0  reason: case insensitive filesystem */
    public static class C9391OooO0o0 extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = new SecureRandom();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("AES");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0oO  reason: case insensitive filesystem */
    public static class C9392OooO0oO extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = new SecureRandom();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o(CodePackage.GCM);
                OooO00o.init(new IlLLII1I(bArr, 16).getEncoded());
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooO0oo  reason: case insensitive filesystem */
    public static class C9393OooO0oo extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "AES IV";
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOO0 */
    public static class OooOO0 extends lI11lI {
        public IlLLII1I OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || IILIll1.OooO00o(cls)) {
                return IILIll1.OooO00o() ? IILIll1.OooO00o(this.OooO00o.m15670OooO0O0()) : new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == C5363IiiI.class) {
                return new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.OooO00o.OooO00o());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.OooO00o.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return this.OooO00o.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (IILIll1.m15378OooO00o(algorithmParameterSpec)) {
                this.OooO00o = IILIll1.OooO00o(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof C5363IiiI) {
                C5363IiiI iiiI = (C5363IiiI) algorithmParameterSpec;
                this.OooO00o = new IlLLII1I(iiiI.OooO0O0(), iiiI.OooO00o() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = IlLLII1I.OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                this.OooO00o = IlLLII1I.OooO00o(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return CodePackage.GCM;
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOO0O */
    public static class OooOO0O extends BaseBlockCipher {
        public OooOO0O() {
            super(new C6927lll1(new C5586L1i()), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOO0o  reason: case insensitive filesystem */
    public static class C9394OooOO0o extends BaseBlockCipher {
        public C9394OooOO0o() {
            super((LLLi1iII) new LlLLI1(new C5586L1i()), false, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOO */
    public static class OooOOO extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.丨Il$OooOOO$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C5586L1i();
            }
        }

        public OooOOO() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOO0 */
    public static class OooOOO0 extends BaseBlockCipher {
        public OooOOO0() {
            super(new C6744ll1L(new C9750I(new C5586L1i(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new iLIli1(new C5586L1i()));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOOo  reason: case insensitive filesystem */
    public static class C9395OooOOOo extends C6338illll {
        public C9395OooOOOo() {
            super("AES", null);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOo  reason: case insensitive filesystem */
    public static class C9396OooOOo extends OooOo00 {
        public C9396OooOOo() {
            super(192);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOo0  reason: case insensitive filesystem */
    public static class C9397OooOOo0 extends OooOo00 {
        public C9397OooOOo0() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOOoo  reason: case insensitive filesystem */
    public static class C9398OooOOoo extends OooOo00 {
        public C9398OooOOoo() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOo */
    public static class OooOo extends C5788LlL1i {
        public OooOo() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", null, true, 3, 0, 128, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOo0  reason: case insensitive filesystem */
    public static class C9399OooOo0 extends AbstractC5307ILiI {
        public static final String OooO00o = C9389Il.class.getName();
        public static final String OooO0O0 = "2.16.840.1.101.3.4.2";
        public static final String OooO0OO = "2.16.840.1.101.3.4.22";
        public static final String OooO0Oo = "2.16.840.1.101.3.4.42";

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r13) {
            r13.addAlgorithm("AlgorithmParameters.AES", OooO00o + "$AlgParams");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.OooOo0, "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.OooOoo, "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.Oooo0OO, "AES");
            r13.addAlgorithm("AlgorithmParameters.GCM", OooO00o + "$AlgParamsGCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.OooOoO0, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.Oooo00O, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.Oooo0oo, CodePackage.GCM);
            r13.addAlgorithm("AlgorithmParameters.CCM", OooO00o + "$AlgParamsCCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.OooOoO, "CCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.Oooo00o, "CCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5905LllI.Oooo, "CCM");
            r13.addAlgorithm("AlgorithmParameterGenerator.AES", OooO00o + "$AlgParamGen");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.OooOo0, "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.OooOoo, "AES");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.Oooo0OO, "AES");
            r13.addAttributes("Cipher.AES", C9389Il.OooO00o);
            r13.addAlgorithm("Cipher.AES", OooO00o + "$ECB");
            r13.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            r13.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            r13.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOo00, OooO00o + "$ECB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOoo0, OooO00o + "$ECB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.Oooo0O0, OooO00o + "$ECB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOo0, OooO00o + "$CBC");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOoo, OooO00o + "$CBC");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.Oooo0OO, OooO00o + "$CBC");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOo0O, OooO00o + "$OFB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOooO, OooO00o + "$OFB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.Oooo0o0, OooO00o + "$OFB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOo0o, OooO00o + "$CFB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.OooOooo, OooO00o + "$CFB");
            r13.addAlgorithm("Cipher", AbstractC5905LllI.Oooo0o, OooO00o + "$CFB");
            r13.addAttributes("Cipher.AESWRAP", C9389Il.OooO00o);
            r13.addAlgorithm("Cipher.AESWRAP", OooO00o + "$Wrap");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.OooOo, "AESWRAP");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo000, "AESWRAP");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo0oO, "AESWRAP");
            r13.addAlgorithm("Alg.Alias.Cipher.AESKW", "AESWRAP");
            r13.addAttributes("Cipher.AESWRAPPAD", C9389Il.OooO00o);
            r13.addAlgorithm("Cipher.AESWRAPPAD", OooO00o + "$WrapPad");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.OooOoOO, "AESWRAPPAD");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo0, "AESWRAPPAD");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.OoooO00, "AESWRAPPAD");
            r13.addAlgorithm("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            r13.addAlgorithm("Cipher.AESRFC3211WRAP", OooO00o + "$RFC3211Wrap");
            r13.addAlgorithm("Cipher.AESRFC5649WRAP", OooO00o + "$RFC5649Wrap");
            r13.addAlgorithm("AlgorithmParameterGenerator.CCM", OooO00o + "$AlgParamGenCCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.OooOoO, "CCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.Oooo00o, "CCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.Oooo, "CCM");
            r13.addAttributes("Cipher.CCM", C9389Il.OooO00o);
            r13.addAlgorithm("Cipher.CCM", OooO00o + "$CCM");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.OooOoO, "CCM");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo00o, "CCM");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo, "CCM");
            r13.addAlgorithm("AlgorithmParameterGenerator.GCM", OooO00o + "$AlgParamGenGCM");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.OooOoO0, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.Oooo00O, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5905LllI.Oooo0oo, CodePackage.GCM);
            r13.addAttributes("Cipher.GCM", C9389Il.OooO00o);
            r13.addAlgorithm("Cipher.GCM", OooO00o + "$GCM");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.OooOoO0, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo00O, CodePackage.GCM);
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5905LllI.Oooo0oo, CodePackage.GCM);
            r13.addAlgorithm("KeyGenerator.AES", OooO00o + "$KeyGen");
            r13.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOo00, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOo0, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOo0O, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOo0o, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOoo0, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOoo, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOooO, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOooo, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0O0, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0OO, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0o0, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0o, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator.AESWRAP", OooO00o + "$KeyGen");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOo, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo000, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0oO, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOoO0, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo00O, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0oo, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOoO, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo00o, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo, OooO00o + "$KeyGen256");
            r13.addAlgorithm("KeyGenerator.AESWRAPPAD", OooO00o + "$KeyGen");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OooOoOO, OooO00o + "$KeyGen128");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.Oooo0, OooO00o + "$KeyGen192");
            r13.addAlgorithm("KeyGenerator", AbstractC5905LllI.OoooO00, OooO00o + "$KeyGen256");
            r13.addAlgorithm("Mac.AESCMAC", OooO00o + "$AESCMAC");
            r13.addAlgorithm("Mac.AESCCMMAC", OooO00o + "$AESCCMMAC");
            r13.addAlgorithm("Alg.Alias.Mac." + AbstractC5905LllI.OooOoO.m16387OooO0O0(), "AESCCMMAC");
            r13.addAlgorithm("Alg.Alias.Mac." + AbstractC5905LllI.Oooo00o.m16387OooO0O0(), "AESCCMMAC");
            r13.addAlgorithm("Alg.Alias.Mac." + AbstractC5905LllI.Oooo.m16387OooO0O0(), "AESCCMMAC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOO0o, "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOOO0, "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOOO, "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOOOO, "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOOOo, "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher", AbstractC5701Li1l.OooOOo0, "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", OooO00o + "$PBEWithSHA1AESCBC128");
            r13.addAlgorithm("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", OooO00o + "$PBEWithSHA1AESCBC192");
            r13.addAlgorithm("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", OooO00o + "$PBEWithSHA1AESCBC256");
            r13.addAlgorithm("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", OooO00o + "$PBEWithSHA256AESCBC128");
            r13.addAlgorithm("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", OooO00o + "$PBEWithSHA256AESCBC192");
            r13.addAlgorithm("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", OooO00o + "$PBEWithSHA256AESCBC256");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", OooO00o + "$PBEWithAESCBC");
            r13.addAlgorithm("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", OooO00o + "$PBEWithAESCBC");
            r13.addAlgorithm("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", OooO00o + "$PBEWithAESCBC");
            r13.addAlgorithm("SecretKeyFactory.AES", OooO00o + "$KeyFactory");
            r13.addAlgorithm("SecretKeyFactory", AbstractC5905LllI.OooOOoo, OooO00o + "$KeyFactory");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", OooO00o + "$PBEWithMD5And128BitAESCBCOpenSSL");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", OooO00o + "$PBEWithMD5And192BitAESCBCOpenSSL");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", OooO00o + "$PBEWithMD5And256BitAESCBCOpenSSL");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", OooO00o + "$PBEWithSHAAnd128BitAESBC");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", OooO00o + "$PBEWithSHAAnd192BitAESBC");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", OooO00o + "$PBEWithSHAAnd256BitAESBC");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", OooO00o + "$PBEWithSHA256And128BitAESBC");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", OooO00o + "$PBEWithSHA256And192BitAESBC");
            r13.addAlgorithm("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", OooO00o + "$PBEWithSHA256And256BitAESBC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOO0o, "PBEWITHSHAAND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOOO0, "PBEWITHSHAAND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOOO, "PBEWITHSHAAND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOOOO, "PBEWITHSHA256AND128BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOOOo, "PBEWITHSHA256AND192BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5701Li1l.OooOOo0, "PBEWITHSHA256AND256BITAES-CBC-BC");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOO0o.m16387OooO0O0(), "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOOO0.m16387OooO0O0(), "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOOO.m16387OooO0O0(), "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOOOO.m16387OooO0O0(), "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOOOo.m16387OooO0O0(), "PKCS12PBE");
            r13.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5701Li1l.OooOOo0.m16387OooO0O0(), "PKCS12PBE");
            OooO0O0(r13, "AES", OooO00o + "$AESGMAC", OooO00o + "$KeyGen128");
            OooO0OO(r13, "AES", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOo00 */
    public static class OooOo00 extends C5597L11llL {
        public OooOo00() {
            this(192);
        }

        public OooOo00(int i) {
            super("AES", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOo0O  reason: case insensitive filesystem */
    public static class C9400OooOo0O extends BaseBlockCipher {
        public C9400OooOo0O() {
            super(new C6744ll1L(new IlLilI(new C5586L1i(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOo0o  reason: case insensitive filesystem */
    public static class C9401OooOo0o extends BaseBlockCipher {
        public C9401OooOo0o() {
            super(new C6927lll1(new C5586L1i()));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOoO  reason: case insensitive filesystem */
    public static class C9402OooOoO extends C5788LlL1i {
        public C9402OooOoO() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", null, true, 3, 0, 256, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOoO0  reason: case insensitive filesystem */
    public static class C9403OooOoO0 extends C5788LlL1i {
        public C9403OooOoO0() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", null, true, 3, 0, 192, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOoOO  reason: case insensitive filesystem */
    public static class C9404OooOoOO extends BaseBlockCipher {
        public C9404OooOoOO() {
            super(new C6927lll1(new C5586L1i()), 2, 1, 128, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOoo  reason: case insensitive filesystem */
    public static class C9405OooOoo extends BaseBlockCipher {
        public C9405OooOoo() {
            super(new C6927lll1(new C5586L1i()), 2, 1, 256, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOoo0  reason: case insensitive filesystem */
    public static class C9406OooOoo0 extends BaseBlockCipher {
        public C9406OooOoo0() {
            super(new C6927lll1(new C5586L1i()), 2, 1, 192, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOooO  reason: case insensitive filesystem */
    public static class C9407OooOooO extends BaseBlockCipher {
        public C9407OooOooO() {
            super(new C6927lll1(new C5586L1i()), 2, 4, 128, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OooOooo  reason: case insensitive filesystem */
    public static class C9408OooOooo extends BaseBlockCipher {
        public C9408OooOooo() {
            super(new C6927lll1(new C5586L1i()), 2, 4, 192, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo  reason: case insensitive filesystem */
    public static class C9409Oooo extends Lll1IlI {
        public C9409Oooo() {
            super(new C5672LLlL(new C5586L1i()));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0 */
    public static class Oooo0 extends C5788LlL1i {
        public Oooo0() {
            super("PBEWithSHA256And256BitAES-CBC-BC", null, true, 2, 4, 256, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo000 */
    public static class Oooo000 extends BaseBlockCipher {
        public Oooo000() {
            super(new C6927lll1(new C5586L1i()), 2, 4, 256, 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo00O  reason: case insensitive filesystem */
    public static class C9410Oooo00O extends C5788LlL1i {
        public C9410Oooo00O() {
            super("PBEWithSHA256And128BitAES-CBC-BC", null, true, 2, 4, 128, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo00o  reason: case insensitive filesystem */
    public static class C9411Oooo00o extends C5788LlL1i {
        public C9411Oooo00o() {
            super("PBEWithSHA256And192BitAES-CBC-BC", null, true, 2, 4, 192, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0O0  reason: case insensitive filesystem */
    public static class C9412Oooo0O0 extends C5788LlL1i {
        public C9412Oooo0O0() {
            super("PBEWithSHA1And128BitAES-CBC-BC", null, true, 2, 1, 128, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0OO  reason: case insensitive filesystem */
    public static class C9413Oooo0OO extends C5788LlL1i {
        public C9413Oooo0OO() {
            super("PBEWithSHA1And192BitAES-CBC-BC", null, true, 2, 1, 192, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0o  reason: case insensitive filesystem */
    public static class C9414Oooo0o extends C9680lII1i {
        public C9414Oooo0o() {
            super(new C6117iIl1(new C5586L1i()));
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0o0  reason: case insensitive filesystem */
    public static class C9415Oooo0o0 extends C5788LlL1i {
        public C9415Oooo0o0() {
            super("PBEWithSHA1And256BitAES-CBC-BC", null, true, 2, 1, 256, 128);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0oO  reason: case insensitive filesystem */
    public static class C9416Oooo0oO extends C5597L11llL {
        public C9416Oooo0oO() {
            super("Poly1305-AES", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.丨Il$Oooo0oo  reason: case insensitive filesystem */
    public static class C9417Oooo0oo extends Lll1IlI {
        public C9417Oooo0oo() {
            super(new C5691LLliL(new C5586L1i()), 16);
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OoooO0  reason: case insensitive filesystem */
    public static class C9418OoooO0 extends Lll1IlI {
        public C9418OoooO0() {
            super(new IIilL1());
        }
    }

    /* renamed from: com.pd.sdk.丨Il$OoooO00  reason: case insensitive filesystem */
    public static class C9419OoooO00 extends Lll1IlI {
        public C9419OoooO00() {
            super(new C6503lIL1l());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        OooO00o.put("SupportedKeyFormats", "RAW");
    }
}
