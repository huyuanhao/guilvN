package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.L丨1i丨  reason: invalid class name and case insensitive filesystem */
public final class C5831L1i {

    /* renamed from: com.pd.sdk.L丨1i丨$OooO */
    public static class OooO extends AbstractC5307ILiI {
        public static final String OooO00o = C5831L1i.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r7) {
            r7.addAlgorithm("AlgorithmParameters.SEED", OooO00o + "$AlgParams");
            r7.addAlgorithm("Alg.Alias.AlgorithmParameters." + ll1IL1.OooO00o, "SEED");
            r7.addAlgorithm("AlgorithmParameterGenerator.SEED", OooO00o + "$AlgParamGen");
            r7.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + ll1IL1.OooO00o, "SEED");
            r7.addAlgorithm("Cipher.SEED", OooO00o + "$ECB");
            r7.addAlgorithm("Cipher", ll1IL1.OooO00o, OooO00o + "$CBC");
            r7.addAlgorithm("Cipher.SEEDWRAP", OooO00o + "$Wrap");
            r7.addAlgorithm("Alg.Alias.Cipher", ll1IL1.OooO0Oo, "SEEDWRAP");
            r7.addAlgorithm("Alg.Alias.Cipher.SEEDKW", "SEEDWRAP");
            r7.addAlgorithm("KeyGenerator.SEED", OooO00o + "$KeyGen");
            r7.addAlgorithm("KeyGenerator", ll1IL1.OooO00o, OooO00o + "$KeyGen");
            r7.addAlgorithm("KeyGenerator", ll1IL1.OooO0Oo, OooO00o + "$KeyGen");
            r7.addAlgorithm("SecretKeyFactory.SEED", OooO00o + "$KeyFactory");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory", ll1IL1.OooO00o, "SEED");
            OooO00o(r7, "SEED", OooO00o + "$CMAC", OooO00o + "$KeyGen");
            OooO0O0(r7, "SEED", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r7, "SEED", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("SEED");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "SEED IV";
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new C6658liL()), 128);
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5832OooO0Oo extends C9680lII1i {
        public C5832OooO0Oo() {
            super(new lLlLIi(new C6658liL()));
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C1IILlI(new iLIli1(new C6658liL())));
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0o0  reason: case insensitive filesystem */
    public static class C5833OooO0o0 extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.L丨1i丨$OooO0o0$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C6658liL();
            }
        }

        public C5833OooO0o0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0oO  reason: case insensitive filesystem */
    public static class C5834OooO0oO extends C6338illll {
        public C5834OooO0oO() {
            super("SEED", null);
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooO0oo  reason: case insensitive filesystem */
    public static class C5835OooO0oo extends C5597L11llL {
        public C5835OooO0oo() {
            super("SEED", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0() {
            super(new C6117iIl1(new C6658liL()));
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooOO0O */
    public static class OooOO0O extends C5597L11llL {
        public OooOO0O() {
            super("Poly1305-SEED", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.L丨1i丨$OooOO0o  reason: case insensitive filesystem */
    public static class C5836OooOO0o extends Lll1IlI {
        public C5836OooOO0o() {
            super(new II1li1());
        }
    }
}
