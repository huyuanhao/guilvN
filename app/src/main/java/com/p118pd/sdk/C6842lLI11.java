package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l丨LI11丨  reason: invalid class name and case insensitive filesystem */
public final class C6842lLI11 {

    /* renamed from: com.pd.sdk.l丨LI11丨$OooO00o */
    public static class OooO00o extends C5597L11llL {
        public OooO00o() {
            super("SipHash", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.l丨LI11丨$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C5423Il1Li());
        }
    }

    /* renamed from: com.pd.sdk.l丨LI11丨$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new C5423Il1Li(4, 8));
        }
    }

    /* renamed from: com.pd.sdk.l丨LI11丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6843OooO0Oo extends II1ii1 {
        public static final String OooO00o = C6842lLI11.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Mac.SIPHASH-2-4", OooO00o + "$Mac24");
            r3.addAlgorithm("Alg.Alias.Mac.SIPHASH", "SIPHASH-2-4");
            r3.addAlgorithm("Mac.SIPHASH-4-8", OooO00o + "$Mac48");
            r3.addAlgorithm("KeyGenerator.SIPHASH", OooO00o + "$KeyGen");
            r3.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-2-4", "SIPHASH");
            r3.addAlgorithm("Alg.Alias.KeyGenerator.SIPHASH-4-8", "SIPHASH");
        }
    }
}
