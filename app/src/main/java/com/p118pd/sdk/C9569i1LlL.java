package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨i1LlL  reason: invalid class name and case insensitive filesystem */
public final class C9569i1LlL {

    /* renamed from: com.pd.sdk.丨i1LlL$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Blowfish IV";
        }
    }

    /* renamed from: com.pd.sdk.丨i1LlL$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6927lll1(new C9459L1L1I()), 64);
        }
    }

    /* renamed from: com.pd.sdk.丨i1LlL$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new lLlLIi(new C9459L1L1I()));
        }
    }

    /* renamed from: com.pd.sdk.丨i1LlL$OooO0Oo  reason: case insensitive filesystem */
    public static class C9570OooO0Oo extends BaseBlockCipher {
        public C9570OooO0Oo() {
            super(new C9459L1L1I());
        }
    }

    /* renamed from: com.pd.sdk.丨i1LlL$OooO0o */
    public static class OooO0o extends II1ii1 {
        public static final String OooO00o = C9569i1LlL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("Mac.BLOWFISHCMAC", OooO00o + "$CMAC");
            r4.addAlgorithm("Cipher.BLOWFISH", OooO00o + "$ECB");
            LlLI1 llLI1 = AbstractC5702Li111.OooOoO;
            r4.addAlgorithm("Cipher", llLI1, OooO00o + "$CBC");
            r4.addAlgorithm("KeyGenerator.BLOWFISH", OooO00o + "$KeyGen");
            r4.addAlgorithm("Alg.Alias.KeyGenerator", AbstractC5702Li111.OooOoO, "BLOWFISH");
            r4.addAlgorithm("AlgorithmParameters.BLOWFISH", OooO00o + "$AlgParams");
            r4.addAlgorithm("Alg.Alias.AlgorithmParameters", AbstractC5702Li111.OooOoO, "BLOWFISH");
        }
    }

    /* renamed from: com.pd.sdk.丨i1LlL$OooO0o0  reason: case insensitive filesystem */
    public static class C9571OooO0o0 extends C5597L11llL {
        public C9571OooO0o0() {
            super("Blowfish", 128, new C5706LiL());
        }
    }
}
