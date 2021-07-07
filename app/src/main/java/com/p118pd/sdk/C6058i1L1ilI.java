package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1丨L1ilI  reason: invalid class name and case insensitive filesystem */
public class C6058i1L1ilI {

    /* renamed from: com.pd.sdk.i1丨L1ilI$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new i1lILlii());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new i1lILlii((i1lILlii) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i1丨L1ilI$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new i1lILlii()));
        }
    }

    /* renamed from: com.pd.sdk.i1丨L1ilI$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACWHIRLPOOL", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i1丨L1ilI$OooO0Oo  reason: case insensitive filesystem */
    public static class C6059OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6058i1L1ilI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.WHIRLPOOL", OooO00o + "$Digest");
            r5.addAlgorithm("MessageDigest", AbstractC9849l1i1L.OooO0o0, OooO00o + "$Digest");
            OooO00o(r5, "WHIRLPOOL", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
        }
    }
}
