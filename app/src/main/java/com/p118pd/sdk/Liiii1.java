package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Liii丨i丨1  reason: invalid class name */
public class Liiii1 {

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new iIlLIll());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new iIlLIll((iIlLIll) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new iIlLIll()));
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACTIGER", 192, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5721OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = Liiii1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.TIGER", OooO00o + "$Digest");
            r4.addAlgorithm("MessageDigest.Tiger", OooO00o + "$Digest");
            OooO00o(r4, "TIGER", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r4, "TIGER", AbstractC5604L1ll.OooOOOo);
            r4.addAlgorithm("SecretKeyFactory.PBEWITHHMACTIGER", OooO00o + "$PBEWithMacKeyFactory");
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0o */
    public static class OooO0o extends C5788LlL1i {
        public OooO0o() {
            super("PBEwithHmacTiger", null, false, 2, 3, 192, 0);
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0o0  reason: case insensitive filesystem */
    public static class C5722OooO0o0 extends C9680lII1i {
        public C5722OooO0o0() {
            super(new C6383iLl1(new iIlLIll()), 2, 3, 192);
        }
    }

    /* renamed from: com.pd.sdk.Liii丨i丨1$OooO0oO  reason: case insensitive filesystem */
    public static class C5723OooO0oO extends C9680lII1i {
        public C5723OooO0oO() {
            super(new C6383iLl1(new iIlLIll()));
        }
    }
}
