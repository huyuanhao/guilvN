package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.i1丨丨II  reason: invalid class name and case insensitive filesystem */
public final class C6068i1II {

    /* renamed from: com.pd.sdk.i1丨丨II$OooO */
    public static class OooO extends OooOO0 {
        public OooO() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("Camellia");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Camellia parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Camellia IV";
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new C6165iLIIlIL()), 128);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0Oo  reason: case insensitive filesystem */
    public static class C6069OooO0Oo extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.i1丨丨II$OooO0Oo$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C6165iLIIlIL();
            }
        }

        public C6069OooO0Oo() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0o */
    public static class OooO0o extends C6338illll {
        public OooO0o() {
            super("Camellia", null);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0o0  reason: case insensitive filesystem */
    public static class C6070OooO0o0 extends C9680lII1i {
        public C6070OooO0o0() {
            super(new C1IILlI(new iLIli1(new C6165iLIIlIL())));
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0oO  reason: case insensitive filesystem */
    public static class C6071OooO0oO extends OooOO0 {
        public C6071OooO0oO() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooO0oo  reason: case insensitive filesystem */
    public static class C6072OooO0oo extends OooOO0 {
        public C6072OooO0oo() {
            super(192);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOO0 */
    public static class OooOO0 extends C5597L11llL {
        public OooOO0() {
            this(256);
        }

        public OooOO0(int i) {
            super("Camellia", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOO0O */
    public static class OooOO0O extends AbstractC5307ILiI {
        public static final String OooO00o = C6068i1II.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r10) {
            r10.addAlgorithm("AlgorithmParameters.CAMELLIA", OooO00o + "$AlgParams");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameters", lILIiLL.OooO00o, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameters", lILIiLL.OooO0O0, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameters", lILIiLL.OooO0OO, "CAMELLIA");
            r10.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", OooO00o + "$AlgParamGen");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", lILIiLL.OooO00o, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", lILIiLL.OooO0O0, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", lILIiLL.OooO0OO, "CAMELLIA");
            r10.addAlgorithm("Cipher.CAMELLIA", OooO00o + "$ECB");
            r10.addAlgorithm("Cipher", lILIiLL.OooO00o, OooO00o + "$CBC");
            r10.addAlgorithm("Cipher", lILIiLL.OooO0O0, OooO00o + "$CBC");
            r10.addAlgorithm("Cipher", lILIiLL.OooO0OO, OooO00o + "$CBC");
            r10.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", OooO00o + "$RFC3211Wrap");
            r10.addAlgorithm("Cipher.CAMELLIAWRAP", OooO00o + "$Wrap");
            r10.addAlgorithm("Alg.Alias.Cipher", lILIiLL.OooO0Oo, "CAMELLIAWRAP");
            r10.addAlgorithm("Alg.Alias.Cipher", lILIiLL.OooO0o0, "CAMELLIAWRAP");
            r10.addAlgorithm("Alg.Alias.Cipher", lILIiLL.OooO0o, "CAMELLIAWRAP");
            r10.addAlgorithm("SecretKeyFactory.CAMELLIA", OooO00o + "$KeyFactory");
            r10.addAlgorithm("Alg.Alias.SecretKeyFactory", lILIiLL.OooO00o, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.SecretKeyFactory", lILIiLL.OooO0O0, "CAMELLIA");
            r10.addAlgorithm("Alg.Alias.SecretKeyFactory", lILIiLL.OooO0OO, "CAMELLIA");
            r10.addAlgorithm("KeyGenerator.CAMELLIA", OooO00o + "$KeyGen");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO0Oo, OooO00o + "$KeyGen128");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO0o0, OooO00o + "$KeyGen192");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO0o, OooO00o + "$KeyGen256");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO00o, OooO00o + "$KeyGen128");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO0O0, OooO00o + "$KeyGen192");
            r10.addAlgorithm("KeyGenerator", lILIiLL.OooO0OO, OooO00o + "$KeyGen256");
            OooO0O0(r10, "CAMELLIA", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r10, "CAMELLIA", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOO0o  reason: case insensitive filesystem */
    public static class C6073OooOO0o extends C9680lII1i {
        public C6073OooOO0o() {
            super(new C6117iIl1(new C6165iLIIlIL()));
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOOO */
    public static class OooOOO extends Lll1IlI {
        public OooOOO() {
            super(new C5691LLliL(new C6165iLIIlIL()), 16);
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOOO0 */
    public static class OooOOO0 extends C5597L11llL {
        public OooOOO0() {
            super("Poly1305-Camellia", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.i1丨丨II$OooOOOO */
    public static class OooOOOO extends Lll1IlI {
        public OooOOOO() {
            super(new C6430i1I1L());
        }
    }
}
