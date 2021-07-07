package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.L丨丨iI  reason: invalid class name and case insensitive filesystem */
public final class C5913LiI {

    /* renamed from: com.pd.sdk.L丨丨iI$OooO00o */
    public static class OooO00o extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Rijndael IV";
        }
    }

    /* renamed from: com.pd.sdk.L丨丨iI$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.L丨丨iI$OooO0O0$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new IIL1();
            }
        }

        public OooO0O0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.L丨丨iI$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("Rijndael", 192, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L丨丨iI$OooO0Oo  reason: case insensitive filesystem */
    public static class C5914OooO0Oo extends II1ii1 {
        public static final String OooO00o = C5913LiI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.RIJNDAEL", OooO00o + "$ECB");
            r3.addAlgorithm("KeyGenerator.RIJNDAEL", OooO00o + "$KeyGen");
            r3.addAlgorithm("AlgorithmParameters.RIJNDAEL", OooO00o + "$AlgParams");
        }
    }
}
