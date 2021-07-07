package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.llI1丨ii  reason: invalid class name */
public final class llI1ii {

    /* renamed from: com.pd.sdk.llI1丨ii$OooO */
    public static class OooO extends BaseBlockCipher {
        public OooO() {
            super(new C5803Ll(512));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Threefish-1024 IV";
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Threefish-256 IV";
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0OO */
    public static class OooO0OO extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Threefish-512 IV";
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0Oo  reason: case insensitive filesystem */
    public static class C6747OooO0Oo extends C9680lII1i {
        public C6747OooO0Oo() {
            super(new lLlLIi(new C5803Ll(1024)));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new lLlLIi(new C5803Ll(512)));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0o0  reason: case insensitive filesystem */
    public static class C6748OooO0o0 extends C9680lII1i {
        public C6748OooO0o0() {
            super(new lLlLIi(new C5803Ll(256)));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0oO  reason: case insensitive filesystem */
    public static class C6749OooO0oO extends BaseBlockCipher {
        public C6749OooO0oO() {
            super(new C5803Ll(1024));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooO0oo  reason: case insensitive filesystem */
    public static class C6750OooO0oo extends BaseBlockCipher {
        public C6750OooO0oo() {
            super(new C5803Ll(256));
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooOO0 */
    public static class OooOO0 extends C5597L11llL {
        public OooOO0() {
            super("Threefish-1024", 1024, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooOO0O */
    public static class OooOO0O extends C5597L11llL {
        public OooOO0O() {
            super("Threefish-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooOO0o  reason: case insensitive filesystem */
    public static class C6751OooOO0o extends C5597L11llL {
        public C6751OooOO0o() {
            super("Threefish-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.llI1丨ii$OooOOO0 */
    public static class OooOOO0 extends II1ii1 {
        public static final String OooO00o = llI1ii.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Mac.Threefish-256CMAC", OooO00o + "$CMAC_256");
            r3.addAlgorithm("Mac.Threefish-512CMAC", OooO00o + "$CMAC_512");
            r3.addAlgorithm("Mac.Threefish-1024CMAC", OooO00o + "$CMAC_1024");
            r3.addAlgorithm("Cipher.Threefish-256", OooO00o + "$ECB_256");
            r3.addAlgorithm("Cipher.Threefish-512", OooO00o + "$ECB_512");
            r3.addAlgorithm("Cipher.Threefish-1024", OooO00o + "$ECB_1024");
            r3.addAlgorithm("KeyGenerator.Threefish-256", OooO00o + "$KeyGen_256");
            r3.addAlgorithm("KeyGenerator.Threefish-512", OooO00o + "$KeyGen_512");
            r3.addAlgorithm("KeyGenerator.Threefish-1024", OooO00o + "$KeyGen_1024");
            r3.addAlgorithm("AlgorithmParameters.Threefish-256", OooO00o + "$AlgParams_256");
            r3.addAlgorithm("AlgorithmParameters.Threefish-512", OooO00o + "$AlgParams_512");
            r3.addAlgorithm("AlgorithmParameters.Threefish-1024", OooO00o + "$AlgParams_1024");
        }
    }
}
