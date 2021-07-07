package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨Lll  reason: invalid class name and case insensitive filesystem */
public final class C5857LLll {

    /* renamed from: com.pd.sdk.L丨Lll$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C9607iLLLi(), 16);
        }
    }

    /* renamed from: com.pd.sdk.L丨Lll$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("VMPC", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L丨Lll$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new C5494I1I());
        }
    }

    /* renamed from: com.pd.sdk.L丨Lll$OooO0Oo  reason: case insensitive filesystem */
    public static class C5858OooO0Oo extends II1ii1 {
        public static final String OooO00o = C5857LLll.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.VMPC", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.VMPC", OooO00o + "$KeyGen");
            r3.addAlgorithm("Mac.VMPCMAC", OooO00o + "$Mac");
            r3.addAlgorithm("Alg.Alias.Mac.VMPC", "VMPCMAC");
            r3.addAlgorithm("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
        }
    }
}
