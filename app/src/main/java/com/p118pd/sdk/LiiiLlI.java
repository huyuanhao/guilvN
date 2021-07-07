package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨iiiLlI  reason: invalid class name */
public final class LiiiLlI {

    /* renamed from: com.pd.sdk.L丨iiiLlI$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C6762llL(), 32);
        }
    }

    /* renamed from: com.pd.sdk.L丨iiiLlI$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("HC256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L丨iiiLlI$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = LiiiLlI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.HC256", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.HC256", OooO00o + "$KeyGen");
        }
    }
}
