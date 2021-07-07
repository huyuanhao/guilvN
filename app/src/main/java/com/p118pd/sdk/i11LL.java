package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.i11LL丨  reason: invalid class name */
public final class i11LL {

    /* renamed from: com.pd.sdk.i11LL丨$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("Poly1305-Twofish", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Twofish IV";
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.i11LL丨$OooO0O0$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new iI1iII();
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new C1IILlI(new iLIli1(new iI1iII())));
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6002OooO0Oo extends C5597L11llL {
        public C6002OooO0Oo() {
            super("Twofish", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C6927lll1(new iI1iII()), 2, 1, 256, 16);
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0o0  reason: case insensitive filesystem */
    public static class C6003OooO0o0 extends AbstractC5307ILiI {
        public static final String OooO00o = i11LL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("Cipher.Twofish", OooO00o + "$ECB");
            r5.addAlgorithm("KeyGenerator.Twofish", OooO00o + "$KeyGen");
            r5.addAlgorithm("AlgorithmParameters.Twofish", OooO00o + "$AlgParams");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH", "PKCS12PBE");
            r5.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDTWOFISH-CBC", "PKCS12PBE");
            r5.addAlgorithm("Cipher.PBEWITHSHAANDTWOFISH-CBC", OooO00o + "$PBEWithSHA");
            r5.addAlgorithm("SecretKeyFactory.PBEWITHSHAANDTWOFISH-CBC", OooO00o + "$PBEWithSHAKeyFactory");
            OooO0O0(r5, "Twofish", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r5, "Twofish", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0oO  reason: case insensitive filesystem */
    public static class C6004OooO0oO extends C5788LlL1i {
        public C6004OooO0oO() {
            super("PBEwithSHAandTwofish-CBC", null, true, 2, 1, 256, 128);
        }
    }

    /* renamed from: com.pd.sdk.i11LL丨$OooO0oo  reason: case insensitive filesystem */
    public static class C6005OooO0oo extends C9680lII1i {
        public C6005OooO0oo() {
            super(new C6117iIl1(new iI1iII()));
        }
    }
}
