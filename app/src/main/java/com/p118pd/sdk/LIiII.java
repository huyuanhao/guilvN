package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIiII */
public class LIiII {

    /* renamed from: com.pd.sdk.LIiII$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new LLli1i());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new LLli1i((LLli1i) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.LIiII$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new LLli1i()));
        }
    }

    /* renamed from: com.pd.sdk.LIiII$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACMD2", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LIiII$OooO0Oo  reason: case insensitive filesystem */
    public static class C5628OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = LIiII.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.MD2", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5711LiLli.OooooOO, "MD2");
            OooO00o(r5, "MD2", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
        }
    }
}
