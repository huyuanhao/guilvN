package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨1丨  reason: invalid class name */
public final class C1 {

    /* renamed from: com.pd.sdk.丨1丨$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "TEA IV";
        }
    }

    /* renamed from: com.pd.sdk.丨1丨$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6166iLIlL1());
        }
    }

    /* renamed from: com.pd.sdk.丨1丨$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("TEA", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨1丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C9315OooO0Oo extends II1ii1 {
        public static final String OooO00o = C1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.TEA", OooO00o + "$ECB");
            r3.addAlgorithm("KeyGenerator.TEA", OooO00o + "$KeyGen");
            r3.addAlgorithm("AlgorithmParameters.TEA", OooO00o + "$AlgParams");
        }
    }
}
