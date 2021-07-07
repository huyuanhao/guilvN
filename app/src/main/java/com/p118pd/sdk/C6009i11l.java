package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i11l  reason: case insensitive filesystem */
public class C6009i11l {

    /* renamed from: com.pd.sdk.i11l$OooO00o */
    public static class OooO00o extends C5597L11llL {
        public OooO00o() {
            super("Poly1305", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.i11l$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6117iIl1());
        }
    }

    /* renamed from: com.pd.sdk.i11l$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C6009i11l.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Mac.POLY1305", OooO00o + "$Mac");
            r3.addAlgorithm("KeyGenerator.POLY1305", OooO00o + "$KeyGen");
        }
    }
}
