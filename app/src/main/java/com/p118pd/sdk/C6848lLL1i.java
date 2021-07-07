package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨LL1i  reason: invalid class name and case insensitive filesystem */
public final class C6848lLL1i {

    /* renamed from: com.pd.sdk.l丨LL1i$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C5393IiL(), 16);
        }
    }

    /* renamed from: com.pd.sdk.l丨LL1i$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("VMPC-KSA3", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.l丨LL1i$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C6848lLL1i.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.VMPC-KSA3", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.VMPC-KSA3", OooO00o + "$KeyGen");
        }
    }
}
