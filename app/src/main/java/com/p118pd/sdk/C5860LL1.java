package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L丨L丨丨1  reason: invalid class name and case insensitive filesystem */
public class C5860LL1 {

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C6461l1liI());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C6461l1liI((C6461l1liI) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C6461l1liI()));
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACSHA1", 160, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5861OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C5860LL1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.SHA-1", OooO00o + "$Digest");
            r4.addAlgorithm("Alg.Alias.MessageDigest.SHA1", LL1i.OooO0O0);
            r4.addAlgorithm("Alg.Alias.MessageDigest.SHA", LL1i.OooO0O0);
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC9733l.OooO, LL1i.OooO0O0);
            OooO00o(r4, "SHA1", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r4, "SHA1", AbstractC5711LiLli.Oooooo);
            OooO00o(r4, "SHA1", AbstractC5604L1ll.OooOOOO);
            r4.addAlgorithm("Mac.PBEWITHHMACSHA", OooO00o + "$SHA1Mac");
            r4.addAlgorithm("Mac.PBEWITHHMACSHA1", OooO00o + "$SHA1Mac");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA", "PBEWITHHMACSHA1");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC9733l.OooO, "PBEWITHHMACSHA1");
            r4.addAlgorithm("Alg.Alias.Mac." + AbstractC9733l.OooO, "PBEWITHHMACSHA");
            r4.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA1", OooO00o + "$PBEWithMacKeyFactory");
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C6383iLl1(new C6461l1liI()));
        }
    }

    /* renamed from: com.pd.sdk.L丨L丨丨1$OooO0o0  reason: case insensitive filesystem */
    public static class C5862OooO0o0 extends C5788LlL1i {
        public C5862OooO0o0() {
            super("PBEwithHmacSHA", null, false, 2, 1, 160, 0);
        }
    }
}
