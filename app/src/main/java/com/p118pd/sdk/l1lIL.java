package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1lIL */
public final class l1lIL {

    /* renamed from: com.pd.sdk.l1lIL$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C6277iili(), 8);
        }
    }

    /* renamed from: com.pd.sdk.l1lIL$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("Grainv1", 80, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.l1lIL$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = l1lIL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.Grainv1", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.Grainv1", OooO00o + "$KeyGen");
        }
    }
}
