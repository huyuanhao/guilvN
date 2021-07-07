package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨1ii1lL  reason: invalid class name */
public final class C1ii1lL {

    /* renamed from: com.pd.sdk.丨1ii1lL$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C6134iI1L(), 12);
        }
    }

    /* renamed from: com.pd.sdk.丨1ii1lL$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("Grain128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨1ii1lL$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C1ii1lL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.Grain128", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.Grain128", OooO00o + "$KeyGen");
        }
    }
}
