package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.LL丨LI丨  reason: invalid class name and case insensitive filesystem */
public final class C5676LLLI {

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO */
    public static class OooO extends C9680lII1i {
        public OooO() {
            super(new C6170iLLL(new C6793lllIil()));
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("RC5");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC5 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "RC5 IV";
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new C6793lllIil()), 64);
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5677OooO0Oo extends C9680lII1i {
        public C5677OooO0Oo() {
            super(new C9657l1I1(new C6793lllIil()));
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C6839lIl());
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0o0  reason: case insensitive filesystem */
    public static class C5678OooO0o0 extends BaseBlockCipher {
        public C5678OooO0o0() {
            super(new C6793lllIil());
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0oO  reason: case insensitive filesystem */
    public static class C5679OooO0oO extends C5597L11llL {
        public C5679OooO0oO() {
            super("RC5", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooO0oo  reason: case insensitive filesystem */
    public static class C5680OooO0oo extends C5597L11llL {
        public C5680OooO0oo() {
            super("RC5-64", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LL丨LI丨$OooOO0 */
    public static class OooOO0 extends II1ii1 {
        public static final String OooO00o = C5676LLLI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("Cipher.RC5", OooO00o + "$ECB32");
            r4.addAlgorithm("Alg.Alias.Cipher.RC5-32", "RC5");
            r4.addAlgorithm("Cipher.RC5-64", OooO00o + "$ECB64");
            r4.addAlgorithm("KeyGenerator.RC5", OooO00o + "$KeyGen32");
            r4.addAlgorithm("Alg.Alias.KeyGenerator.RC5-32", "RC5");
            r4.addAlgorithm("KeyGenerator.RC5-64", OooO00o + "$KeyGen64");
            r4.addAlgorithm("AlgorithmParameters.RC5", OooO00o + "$AlgParams");
            r4.addAlgorithm("AlgorithmParameters.RC5-64", OooO00o + "$AlgParams");
            r4.addAlgorithm("Mac.RC5MAC", OooO00o + "$Mac32");
            r4.addAlgorithm("Alg.Alias.Mac.RC5", "RC5MAC");
            r4.addAlgorithm("Mac.RC5MAC/CFB8", OooO00o + "$CFB8Mac32");
            r4.addAlgorithm("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
        }
    }
}
