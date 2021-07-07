package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIlI  reason: case insensitive filesystem */
public final class C5638LIlI {

    /* renamed from: com.pd.sdk.LIlI$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new IIIli1L(), 12);
        }
    }

    /* renamed from: com.pd.sdk.LIlI$OooO0O0 */
    public static class OooO0O0 extends C5718LiiL {
        public OooO0O0() {
            super(new C5512IIll1(), 8);
        }
    }

    /* renamed from: com.pd.sdk.LIlI$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("ChaCha7539", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LIlI$OooO0Oo  reason: case insensitive filesystem */
    public static class C5639OooO0Oo extends C5597L11llL {
        public C5639OooO0Oo() {
            super("ChaCha", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LIlI$OooO0o0  reason: case insensitive filesystem */
    public static class C5640OooO0o0 extends II1ii1 {
        public static final String OooO00o = C5638LIlI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.CHACHA", OooO00o + "$Base");
            r3.addAlgorithm("KeyGenerator.CHACHA", OooO00o + "$KeyGen");
            r3.addAlgorithm("Cipher.CHACHA7539", OooO00o + "$Base7539");
            r3.addAlgorithm("KeyGenerator.CHACHA7539", OooO00o + "$KeyGen7539");
        }
    }
}
