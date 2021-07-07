package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.L11丨lli丨  reason: invalid class name and case insensitive filesystem */
public final class C5579L11lli {

    /* renamed from: com.pd.sdk.L11丨lli丨$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "XTEA IV";
        }
    }

    /* renamed from: com.pd.sdk.L11丨lli丨$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new LiLIIlI());
        }
    }

    /* renamed from: com.pd.sdk.L11丨lli丨$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("XTEA", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L11丨lli丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5580OooO0Oo extends II1ii1 {
        public static final String OooO00o = C5579L11lli.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.XTEA", OooO00o + "$ECB");
            r3.addAlgorithm("KeyGenerator.XTEA", OooO00o + "$KeyGen");
            r3.addAlgorithm("AlgorithmParameters.XTEA", OooO00o + "$AlgParams");
        }
    }
}
