package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨iI丨i  reason: invalid class name and case insensitive filesystem */
public final class C9593iIi {

    /* renamed from: com.pd.sdk.丨iI丨i$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("Poly1305-Serpent", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Serpent IV";
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6927lll1(new C9797L1()), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6744ll1L(new C9750I(new C9797L1(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0Oo  reason: case insensitive filesystem */
    public static class C9594OooO0Oo extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.丨iI丨i$OooO0Oo$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C9797L1();
            }
        }

        public C9594OooO0Oo() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0o */
    public static class OooO0o extends AbstractC5307ILiI {
        public static final String OooO00o = C9593iIi.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r8) {
            r8.addAlgorithm("Cipher.Serpent", OooO00o + "$ECB");
            r8.addAlgorithm("KeyGenerator.Serpent", OooO00o + "$KeyGen");
            r8.addAlgorithm("AlgorithmParameters.Serpent", OooO00o + "$AlgParams");
            r8.addAlgorithm("Cipher.Tnepres", OooO00o + "$TECB");
            r8.addAlgorithm("KeyGenerator.Tnepres", OooO00o + "$TKeyGen");
            r8.addAlgorithm("AlgorithmParameters.Tnepres", OooO00o + "$TAlgParams");
            r8.addAlgorithm("Cipher", iI1ILI.OooOO0, OooO00o + "$ECB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOO, OooO00o + "$ECB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOo, OooO00o + "$ECB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOO0O, OooO00o + "$CBC");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOOO, OooO00o + "$CBC");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOoo, OooO00o + "$CBC");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOO0, OooO00o + "$CFB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOo0, OooO00o + "$CFB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOo0, OooO00o + "$CFB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOO0o, OooO00o + "$OFB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOOOo, OooO00o + "$OFB");
            r8.addAlgorithm("Cipher", iI1ILI.OooOo00, OooO00o + "$OFB");
            OooO0O0(r8, "SERPENT", OooO00o + "$SerpentGMAC", OooO00o + "$KeyGen");
            OooO0O0(r8, "TNEPRES", OooO00o + "$TSerpentGMAC", OooO00o + "$TKeyGen");
            OooO0OO(r8, "SERPENT", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0o0  reason: case insensitive filesystem */
    public static class C9595OooO0o0 extends C5597L11llL {
        public C9595OooO0o0() {
            super("Serpent", 192, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0oO  reason: case insensitive filesystem */
    public static class C9596OooO0oO extends BaseBlockCipher {
        public C9596OooO0oO() {
            super(new C6744ll1L(new IlLilI(new C9797L1(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooO0oo  reason: case insensitive filesystem */
    public static class C9597OooO0oo extends C9680lII1i {
        public C9597OooO0oo() {
            super(new C6117iIl1(new iI1iII()));
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0() {
            super(new C1IILlI(new iLIli1(new C9797L1())));
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooOO0O */
    public static class OooOO0O extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Tnepres IV";
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooOO0o  reason: case insensitive filesystem */
    public static class C9598OooOO0o extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.丨iI丨i$OooOO0o$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C6319ilLll();
            }
        }

        public C9598OooOO0o() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooOOO */
    public static class OooOOO extends C9680lII1i {
        public OooOOO() {
            super(new C1IILlI(new iLIli1(new C6319ilLll())));
        }
    }

    /* renamed from: com.pd.sdk.丨iI丨i$OooOOO0 */
    public static class OooOOO0 extends C5597L11llL {
        public OooOOO0() {
            super("Tnepres", 192, new C5706LiL());
        }
    }
}
