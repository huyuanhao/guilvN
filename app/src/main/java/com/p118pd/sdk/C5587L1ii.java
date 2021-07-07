package com.p118pd.sdk;

/* renamed from: com.pd.sdk.L1ii  reason: case insensitive filesystem */
public class C5587L1ii {

    /* renamed from: com.pd.sdk.L1ii$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C9495LLIl());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C9495LLIl((C9495LLIl) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.L1ii$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C9495LLIl()));
        }
    }

    /* renamed from: com.pd.sdk.L1ii$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACSHA224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L1ii$OooO0Oo  reason: case insensitive filesystem */
    public static class C5588OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C5587L1ii.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.SHA-224", OooO00o + "$Digest");
            r4.addAlgorithm("Alg.Alias.MessageDigest.SHA224", LL1i.OooO0OO);
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0o, LL1i.OooO0OO);
            r4.addAlgorithm("Mac.PBEWITHHMACSHA224", OooO00o + "$HashMac");
            OooO00o(r4, "SHA224", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r4, "SHA224", AbstractC5711LiLli.OoooooO);
        }
    }
}
