package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨iII  reason: invalid class name and case insensitive filesystem */
public final class C9832iII {

    /* renamed from: com.pd.sdk.丨丨iII$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C9611iLlI(), 8);
        }
    }

    /* renamed from: com.pd.sdk.丨丨iII$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("Salsa20", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨丨iII$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C9832iII.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.SALSA20", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.SALSA20", OooO00o + "$KeyGen");
        }
    }
}
