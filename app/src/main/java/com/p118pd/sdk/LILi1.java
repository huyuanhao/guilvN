package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIL丨丨i1  reason: invalid class name */
public class LILi1 {

    /* renamed from: com.pd.sdk.LIL丨丨i1$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new I1li1Ll());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new I1li1Ll((I1li1Ll) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.LIL丨丨i1$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new I1li1Ll()));
        }
    }

    /* renamed from: com.pd.sdk.LIL丨丨i1$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACSHA256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LIL丨丨i1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5623OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = LILi1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.SHA-256", OooO00o + "$Digest");
            r4.addAlgorithm("Alg.Alias.MessageDigest.SHA256", LL1i.OooO0Oo);
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0OO, LL1i.OooO0Oo);
            r4.addAlgorithm("SecretKeyFactory.PBEWITHHMACSHA256", OooO00o + "$PBEWithMacKeyFactory");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHHMACSHA-256", "PBEWITHHMACSHA256");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5905LllI.OooO0OO, "PBEWITHHMACSHA256");
            r4.addAlgorithm("Mac.PBEWITHHMACSHA256", OooO00o + "$HashMac");
            OooO00o(r4, "SHA256", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r4, "SHA256", AbstractC5711LiLli.Ooooooo);
            OooO00o(r4, "SHA256", AbstractC5905LllI.OooO0OO);
        }
    }

    /* renamed from: com.pd.sdk.LIL丨丨i1$OooO0o0  reason: case insensitive filesystem */
    public static class C5624OooO0o0 extends C5788LlL1i {
        public C5624OooO0o0() {
            super("PBEwithHmacSHA256", null, false, 2, 4, 256, 0);
        }
    }
}
