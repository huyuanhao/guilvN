package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.I丨iIl  reason: invalid class name and case insensitive filesystem */
public final class C5527IiIl {
    public static Map<LlLI1, String> OooO00o = new HashMap();
    public static Map<String, LlLI1> OooO0O0 = new HashMap();

    /* renamed from: com.pd.sdk.I丨iIl$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            this(256);
        }

        public OooO(int i) {
            super("GOST28147", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public byte[] OooO00o = new byte[8];
        public byte[] OooO0O0 = C5539Iil.OooO00o("E-A");

        public AlgorithmParameters engineGenerateParameters() {
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(this.OooO00o);
            try {
                AlgorithmParameters OooO00o2 = OooO00o("GOST28147");
                OooO00o2.init(new C9873i1(this.OooO0O0, this.OooO00o));
                return OooO00o2;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof C9873i1) {
                this.OooO0O0 = ((C9873i1) algorithmParameterSpec).OooO0O0();
                return;
            }
            throw new InvalidAlgorithmParameterException("parameter spec not supported");
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0O0 */
    public static class OooO0O0 extends OooO0OO {
        public LlLI1 OooO0O0 = AbstractC5331ILi.OooO0oo;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public byte[] f16041OooO0O0;

        @Override // com.p118pd.sdk.lI11lI, com.p118pd.sdk.C5527IiIl.OooO0OO
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f16041OooO0O0);
            }
            if (cls == C9873i1.class || cls == AlgorithmParameterSpec.class) {
                return new C9873i1(this.OooO0O0, this.f16041OooO0O0);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // com.p118pd.sdk.C5527IiIl.OooO0OO
        public void OooO00o(byte[] bArr) throws IOException {
            AbstractC6122iIlLiL OooO00o = AbstractC6122iIlLiL.OooO00o(bArr);
            if (OooO00o instanceof AbstractC6804llL1ii) {
                this.f16041OooO0O0 = AbstractC6804llL1ii.OooO00o((Object) OooO00o).m17938OooO00o();
            } else if (OooO00o instanceof I11li1) {
                C9437II OooO00o2 = C9437II.OooO00o(OooO00o);
                this.OooO0O0 = OooO00o2.OooO00o();
                this.f16041OooO0O0 = OooO00o2.m21474OooO00o();
            } else {
                throw new IOException("Unable to recognize parameters");
            }
        }

        @Override // com.p118pd.sdk.C5527IiIl.OooO0OO
        public byte[] OooO00o() throws IOException {
            return new C9437II(this.f16041OooO0O0, this.OooO0O0).getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi, com.p118pd.sdk.C5527IiIl.OooO0OO
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f16041OooO0O0 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof C9873i1) {
                this.f16041OooO0O0 = ((C9873i1) algorithmParameterSpec).OooO00o();
                try {
                    this.OooO0O0 = OooO0OO.OooO00o(((C9873i1) algorithmParameterSpec).OooO0O0());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }

        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0OO */
    public static abstract class OooO0OO extends lI11lI {
        public LlLI1 OooO00o = AbstractC5331ILi.OooO0oo;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16042OooO00o;

        public static LlLI1 OooO00o(String str) {
            LlLI1 llLI1 = (LlLI1) C5527IiIl.OooO0O0.get(str);
            if (llLI1 != null) {
                return llLI1;
            }
            throw new IllegalArgumentException("Unknown SBOX name: " + str);
        }

        public static LlLI1 OooO00o(byte[] bArr) {
            return OooO00o(C5539Iil.OooO00o(bArr));
        }

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.f16042OooO00o);
            }
            if (cls == C9873i1.class || cls == AlgorithmParameterSpec.class) {
                return new C9873i1(this.OooO00o, this.f16042OooO00o);
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public abstract void m15803OooO00o(byte[] bArr) throws IOException;

        public byte[] OooO00o() throws IOException {
            return new C9437II(this.f16042OooO00o, this.OooO00o).getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return OooO00o();
            }
            throw new IOException("Unknown parameter format: " + str);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f16042OooO00o = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof C9873i1) {
                this.f16042OooO00o = ((C9873i1) algorithmParameterSpec).OooO00o();
                try {
                    this.OooO00o = OooO00o(((C9873i1) algorithmParameterSpec).OooO0O0());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public final void engineInit(byte[] bArr, String str) throws IOException {
            if (bArr == null) {
                throw new NullPointerException("Encoded parameters cannot be null");
            } else if (OooO00o(str)) {
                try {
                    m15803OooO00o(bArr);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException("Parameter parsing failed: " + e2.getMessage());
                }
            } else {
                throw new IOException("Unknown parameter format: " + str);
            }
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0Oo  reason: case insensitive filesystem */
    public static class C5528OooO0Oo extends BaseBlockCipher {
        public C5528OooO0Oo() {
            super(new C6927lll1(new C5539Iil()), 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C5539Iil());
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0o0  reason: case insensitive filesystem */
    public static class C5529OooO0o0 extends Lll1IlI {
        public C5529OooO0o0() {
            super(new iLiiLL());
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0oO  reason: case insensitive filesystem */
    public static class C5530OooO0oO extends BaseBlockCipher {
        public C5530OooO0oO() {
            super(new C6744ll1L(new C6542lL1(new C5539Iil())), 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooO0oo  reason: case insensitive filesystem */
    public static class C5531OooO0oo extends Lll1IlI {
        public C5531OooO0oo() {
            super(new C11l());
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0() {
            super(new C5910L1I());
        }
    }

    /* renamed from: com.pd.sdk.I丨iIl$OooOO0O */
    public static class OooOO0O extends II1ii1 {
        public static final String OooO00o = C5527IiIl.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("Cipher.GOST28147", OooO00o + "$ECB");
            r6.addAlgorithm("Alg.Alias.Cipher.GOST", "GOST28147");
            r6.addAlgorithm("Alg.Alias.Cipher.GOST-28147", "GOST28147");
            r6.addAlgorithm("Cipher." + AbstractC5331ILi.OooO0o, OooO00o + "$GCFB");
            r6.addAlgorithm("KeyGenerator.GOST28147", OooO00o + "$KeyGen");
            r6.addAlgorithm("Alg.Alias.KeyGenerator.GOST", "GOST28147");
            r6.addAlgorithm("Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            r6.addAlgorithm("Alg.Alias.KeyGenerator." + AbstractC5331ILi.OooO0o, "GOST28147");
            r6.addAlgorithm("AlgorithmParameters.GOST28147", OooO00o + "$AlgParams");
            r6.addAlgorithm("AlgorithmParameterGenerator.GOST28147", OooO00o + "$AlgParamGen");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5331ILi.OooO0o, "GOST28147");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5331ILi.OooO0o, "GOST28147");
            r6.addAlgorithm("Cipher." + AbstractC5331ILi.OooO0o0, OooO00o + "$CryptoProWrap");
            r6.addAlgorithm("Cipher." + AbstractC5331ILi.OooO0Oo, OooO00o + "$GostWrap");
            r6.addAlgorithm("Mac.GOST28147MAC", OooO00o + "$Mac");
            r6.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        OooO00o.put(AbstractC5331ILi.OooO0oO, "E-TEST");
        OooO00o.put(AbstractC5331ILi.OooO0oo, "E-A");
        OooO00o.put(AbstractC5331ILi.OooO, "E-B");
        OooO00o.put(AbstractC5331ILi.OooOO0, "E-C");
        OooO00o.put(AbstractC5331ILi.OooOO0O, "E-D");
        OooO0O0.put("E-A", AbstractC5331ILi.OooO0oo);
        OooO0O0.put("E-B", AbstractC5331ILi.OooO);
        OooO0O0.put("E-C", AbstractC5331ILi.OooOO0);
        OooO0O0.put("E-D", AbstractC5331ILi.OooOO0O);
    }
}
