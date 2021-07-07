package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iiII  reason: case insensitive filesystem */
public class C6226iiII {

    /* renamed from: com.pd.sdk.iiII$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C5797LliL());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C5797LliL((C5797LliL) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.iiII$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C5797LliL()));
        }
    }

    /* renamed from: com.pd.sdk.iiII$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACMD4", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.iiII$OooO0Oo  reason: case insensitive filesystem */
    public static class C6227OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6226iiII.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.MD4", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5711LiLli.OooooOo, "MD4");
            OooO00o(r5, "MD4", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
        }
    }
}
