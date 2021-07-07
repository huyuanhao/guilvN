package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lI丨  reason: invalid class name and case insensitive filesystem */
public class C6524lI {

    /* renamed from: com.pd.sdk.lI丨$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C9706liLi());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C9706liLi((C9706liLi) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lI丨$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C9706liLi()));
        }
    }

    /* renamed from: com.pd.sdk.lI丨$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACRIPEMD160", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.lI丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6525OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6524lI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.RIPEMD160", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC9468L1lL.OooO0O0, "RIPEMD160");
            OooO00o(r5, "RIPEMD160", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r5, "RIPEMD160", AbstractC5604L1ll.OooOOo0);
            r5.addAlgorithm("SecretKeyFactory.PBEWITHHMACRIPEMD160", OooO00o + "$PBEWithHmacKeyFactory");
            r5.addAlgorithm("Mac.PBEWITHHMACRIPEMD160", OooO00o + "$PBEWithHmac");
        }
    }

    /* renamed from: com.pd.sdk.lI丨$OooO0o */
    public static class OooO0o extends C5788LlL1i {
        public OooO0o() {
            super("PBEwithHmacRIPEMD160", null, false, 2, 2, 160, 0);
        }
    }

    /* renamed from: com.pd.sdk.lI丨$OooO0o0  reason: case insensitive filesystem */
    public static class C6526OooO0o0 extends C9680lII1i {
        public C6526OooO0o0() {
            super(new C6383iLl1(new C9706liLi()), 2, 2, 160);
        }
    }
}
