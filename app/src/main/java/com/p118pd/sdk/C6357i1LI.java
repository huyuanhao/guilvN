package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i丨1LI  reason: invalid class name and case insensitive filesystem */
public class C6357i1LI {

    /* renamed from: com.pd.sdk.i丨1LI$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C5520ILi());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C5520ILi((C5520ILi) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i丨1LI$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C5520ILi()));
        }
    }

    /* renamed from: com.pd.sdk.i丨1LI$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACRIPEMD256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i丨1LI$OooO0Oo  reason: case insensitive filesystem */
    public static class C6358OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6357i1LI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.RIPEMD256", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC9468L1lL.OooO0Oo, "RIPEMD256");
            OooO00o(r5, "RIPEMD256", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
        }
    }
}
