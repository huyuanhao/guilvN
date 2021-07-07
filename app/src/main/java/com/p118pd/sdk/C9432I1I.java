package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨I丨1I  reason: invalid class name and case insensitive filesystem */
public class C9432I1I {

    /* renamed from: com.pd.sdk.丨I丨1I$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new i1iLLll());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new i1iLLll((i1iLLll) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.丨I丨1I$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new i1iLLll()));
        }
    }

    /* renamed from: com.pd.sdk.丨I丨1I$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACSHA384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨I丨1I$OooO0Oo  reason: case insensitive filesystem */
    public static class C9433OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C9432I1I.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.SHA-384", OooO00o + "$Digest");
            r4.addAlgorithm("Alg.Alias.MessageDigest.SHA384", LL1i.f16409OooO0o0);
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0Oo, LL1i.f16409OooO0o0);
            r4.addAlgorithm("Mac.OLDHMACSHA384", OooO00o + "$OldSHA384");
            r4.addAlgorithm("Mac.PBEWITHHMACSHA384", OooO00o + "$HashMac");
            OooO00o(r4, "SHA384", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r4, "SHA384", AbstractC5711LiLli.o0OoOo0);
        }
    }

    /* renamed from: com.pd.sdk.丨I丨1I$OooO0o0  reason: case insensitive filesystem */
    public static class C9434OooO0o0 extends C9680lII1i {
        public C9434OooO0o0() {
            super(new C6381iLiIi1(new i1iLLll()));
        }
    }
}
