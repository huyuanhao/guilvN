package com.p118pd.sdk;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.l丨I1lL  reason: invalid class name and case insensitive filesystem */
public final class C6821lI1lL {

    /* renamed from: com.pd.sdk.l丨I1lL$OooO */
    public static class OooO extends BaseBlockCipher {
        public OooO() {
            super(new C6927lll1(new iLlLiLi()));
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("IDEA");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for IDEA parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0O0 */
    public static class OooO0O0 extends lI11lI {
        public byte[] OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.OooO00o);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to IV parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return new C9346I1II1(engineGetEncoded("RAW")).getEncoded();
            }
            if (!str.equals("RAW")) {
                return null;
            }
            byte[] bArr = this.OooO00o;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.OooO00o = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            byte[] bArr2 = new byte[bArr.length];
            this.OooO00o = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (str.equals("RAW")) {
                engineInit(bArr);
            } else if (str.equals("ASN.1")) {
                engineInit(new C9346I1II1((I11li1) new C5805Ll1(bArr).OooO00o()).OooO00o());
            } else {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "IDEA Parameters";
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new iLlLiLi()), 64);
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0Oo  reason: case insensitive filesystem */
    public static class C6822OooO0Oo extends C9680lII1i {
        public C6822OooO0Oo() {
            super(new C9657l1I1(new iLlLiLi()));
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0o */
    public static class OooO0o extends C5597L11llL {
        public OooO0o() {
            super("IDEA", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0o0  reason: case insensitive filesystem */
    public static class C6823OooO0o0 extends BaseBlockCipher {
        public C6823OooO0o0() {
            super(new iLlLiLi());
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0oO  reason: case insensitive filesystem */
    public static class C6824OooO0oO extends C9680lII1i {
        public C6824OooO0oO() {
            super(new C6170iLLL(new iLlLiLi()));
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooO0oo  reason: case insensitive filesystem */
    public static class C6825OooO0oo extends II1ii1 {
        public static final String OooO00o = C6821lI1lL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("AlgorithmParameterGenerator.IDEA", OooO00o + "$AlgParamGen");
            r5.addAlgorithm("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", OooO00o + "$AlgParamGen");
            r5.addAlgorithm("AlgorithmParameters.IDEA", OooO00o + "$AlgParams");
            r5.addAlgorithm("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", OooO00o + "$AlgParams");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
            r5.addAlgorithm("Cipher.IDEA", OooO00o + "$ECB");
            LlLI1 llLI1 = AbstractC5702Li111.OooOo0O;
            r5.addAlgorithm("Cipher", llLI1, OooO00o + "$CBC");
            r5.addAlgorithm("Cipher.PBEWITHSHAANDIDEA-CBC", OooO00o + "$PBEWithSHAAndIDEA");
            r5.addAlgorithm("KeyGenerator.IDEA", OooO00o + "$KeyGen");
            LlLI1 llLI12 = AbstractC5702Li111.OooOo0O;
            r5.addAlgorithm("KeyGenerator", llLI12, OooO00o + "$KeyGen");
            r5.addAlgorithm("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", OooO00o + "$PBEWithSHAAndIDEAKeyGen");
            r5.addAlgorithm("Mac.IDEAMAC", OooO00o + "$Mac");
            r5.addAlgorithm("Alg.Alias.Mac.IDEA", "IDEAMAC");
            r5.addAlgorithm("Mac.IDEAMAC/CFB8", OooO00o + "$CFB8Mac");
            r5.addAlgorithm("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
        }
    }

    /* renamed from: com.pd.sdk.l丨I1lL$OooOO0 */
    public static class OooOO0 extends C5788LlL1i {
        public OooOO0() {
            super("PBEwithSHAandIDEA-CBC", null, true, 2, 1, 128, 64);
        }
    }
}
