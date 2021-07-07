package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.I1III */
public final class I1III {

    /* renamed from: com.pd.sdk.I1III$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[32];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("Shacal2");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Shacal2 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Shacal2 IV";
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new lIliIl()), 256);
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0Oo  reason: case insensitive filesystem */
    public static class C5171OooO0Oo extends C9680lII1i {
        public C5171OooO0Oo() {
            super(new lLlLIi(new lIliIl()));
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0o */
    public static class OooO0o extends C5597L11llL {
        public OooO0o() {
            super("SHACAL-2", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0o0  reason: case insensitive filesystem */
    public static class C5172OooO0o0 extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.I1III$OooO0o0$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new lIliIl();
            }
        }

        public C5172OooO0o0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.I1III$OooO0oO  reason: case insensitive filesystem */
    public static class C5173OooO0oO extends AbstractC5307ILiI {
        public static final String OooO00o = I1III.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("Mac.Shacal-2CMAC", OooO00o + "$CMAC");
            r6.addAlgorithm("Cipher.Shacal2", OooO00o + "$ECB");
            r6.addAlgorithm("Cipher.SHACAL-2", OooO00o + "$ECB");
            r6.addAlgorithm("KeyGenerator.Shacal2", OooO00o + "$KeyGen");
            r6.addAlgorithm("AlgorithmParameterGenerator.Shacal2", OooO00o + "$AlgParamGen");
            r6.addAlgorithm("AlgorithmParameters.Shacal2", OooO00o + "$AlgParams");
            r6.addAlgorithm("KeyGenerator.SHACAL-2", OooO00o + "$KeyGen");
            r6.addAlgorithm("AlgorithmParameterGenerator.SHACAL-2", OooO00o + "$AlgParamGen");
            r6.addAlgorithm("AlgorithmParameters.SHACAL-2", OooO00o + "$AlgParams");
        }
    }
}
