package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨lII1  reason: invalid class name and case insensitive filesystem */
public final class C9678lII1 {

    /* renamed from: com.pd.sdk.丨lII1$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C5868Li1lll(), 16);
        }
    }

    /* renamed from: com.pd.sdk.丨lII1$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("HC128", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨lII1$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C9678lII1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.HC128", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.HC128", OooO00o + "$KeyGen");
        }
    }
}
