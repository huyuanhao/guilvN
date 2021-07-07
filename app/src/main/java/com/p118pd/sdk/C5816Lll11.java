package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.Ll丨l11丨  reason: invalid class name and case insensitive filesystem */
public final class C5816Lll11 {

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Skipjack IV";
        }
    }

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new II1Li1I());
        }
    }

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("Skipjack", 80, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5817OooO0Oo extends C9680lII1i {
        public C5817OooO0Oo() {
            super(new C6170iLLL(new II1Li1I()));
        }
    }

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO0o */
    public static class OooO0o extends II1ii1 {
        public static final String OooO00o = C5816Lll11.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.SKIPJACK", OooO00o + "$ECB");
            r3.addAlgorithm("KeyGenerator.SKIPJACK", OooO00o + "$KeyGen");
            r3.addAlgorithm("AlgorithmParameters.SKIPJACK", OooO00o + "$AlgParams");
            r3.addAlgorithm("Mac.SKIPJACKMAC", OooO00o + "$Mac");
            r3.addAlgorithm("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
            r3.addAlgorithm("Mac.SKIPJACKMAC/CFB8", OooO00o + "$MacCFB8");
            r3.addAlgorithm("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
        }
    }

    /* renamed from: com.pd.sdk.Ll丨l11丨$OooO0o0  reason: case insensitive filesystem */
    public static class C5818OooO0o0 extends C9680lII1i {
        public C5818OooO0o0() {
            super(new C9657l1I1(new II1Li1I()));
        }
    }
}
