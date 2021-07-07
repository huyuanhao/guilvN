package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LI丨11丨I  reason: invalid class name */
public class LI11I {

    /* renamed from: com.pd.sdk.LI丨11丨I$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new i1l11II());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new i1l11II((i1l11II) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.LI丨11丨I$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new i1l11II()));
        }
    }

    /* renamed from: com.pd.sdk.LI丨11丨I$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACMD5", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LI丨11丨I$OooO0Oo  reason: case insensitive filesystem */
    public static class C5644OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = LI11I.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.MD5", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5711LiLli.Oooooo0, "MD5");
            OooO00o(r5, "MD5", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r5, "MD5", AbstractC5604L1ll.OooOOO);
        }
    }
}
