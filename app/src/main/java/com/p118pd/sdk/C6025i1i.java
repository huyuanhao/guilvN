package com.p118pd.sdk;

/* renamed from: com.pd.sdk.i1i  reason: case insensitive filesystem */
public class C6025i1i {

    /* renamed from: com.pd.sdk.i1i$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("HMACGOST3411", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C6760llIiL());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C6760llIiL((C6760llIiL) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0O0 */
    public static class OooO0O0 extends Ll1lii implements Cloneable {
        public OooO0O0() {
            super(new ILilILi());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = (OooO0O0) super.clone();
            oooO0O0.OooO00o = new ILilILi((ILilILi) this.OooO00o);
            return oooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0OO */
    public static class OooO0OO extends Ll1lii implements Cloneable {
        public OooO0OO() {
            super(new C6846lLIlii());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0OO oooO0OO = (OooO0OO) super.clone();
            oooO0OO.OooO00o = new C6846lLIlii((C6846lLIlii) this.OooO00o);
            return oooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0Oo  reason: case insensitive filesystem */
    public static class C6026OooO0Oo extends C9680lII1i {
        public C6026OooO0Oo() {
            super(new C6383iLl1(new C6760llIiL()));
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C6383iLl1(new C6846lLIlii()));
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0o0  reason: case insensitive filesystem */
    public static class C6027OooO0o0 extends C9680lII1i {
        public C6027OooO0o0() {
            super(new C6383iLl1(new ILilILi()));
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0oO  reason: case insensitive filesystem */
    public static class C6028OooO0oO extends C5597L11llL {
        public C6028OooO0oO() {
            super("HMACGOST3411", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooO0oo  reason: case insensitive filesystem */
    public static class C6029OooO0oo extends C5597L11llL {
        public C6029OooO0oo() {
            super("HMACGOST3411", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooOO0 */
    public static class OooOO0 extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6025i1i.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("MessageDigest.GOST3411", OooO00o + "$Digest");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST", "GOST3411");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411", "GOST3411");
            r6.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5331ILi.OooO0O0, "GOST3411");
            OooO00o(r6, "GOST3411", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r6, "GOST3411", AbstractC5331ILi.OooO0O0);
            r6.addAlgorithm("MessageDigest.GOST3411-2012-256", OooO00o + "$Digest2012_256");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-256", "GOST3411-2012-256");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-256", "GOST3411-2012-256");
            r6.addAlgorithm("Alg.Alias.MessageDigest." + LLiII.OooO0OO, "GOST3411-2012-256");
            OooO00o(r6, "GOST3411-2012-256", OooO00o + "$HashMac2012_256", OooO00o + "$KeyGenerator2012_256");
            OooO00o(r6, "GOST3411-2012-256", LLiII.OooO0o0);
            r6.addAlgorithm("MessageDigest.GOST3411-2012-512", OooO00o + "$Digest2012_512");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST-2012-512", "GOST3411-2012-512");
            r6.addAlgorithm("Alg.Alias.MessageDigest.GOST-3411-2012-512", "GOST3411-2012-512");
            r6.addAlgorithm("Alg.Alias.MessageDigest." + LLiII.OooO0Oo, "GOST3411-2012-512");
            OooO00o(r6, "GOST3411-2012-512", OooO00o + "$HashMac2012_512", OooO00o + "$KeyGenerator2012_512");
            OooO00o(r6, "GOST3411-2012-512", LLiII.OooO0o);
            r6.addAlgorithm("SecretKeyFactory.PBEWITHHMACGOST3411", OooO00o + "$PBEWithMacKeyFactory");
            r6.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5331ILi.OooO0O0, "PBEWITHHMACGOST3411");
        }
    }

    /* renamed from: com.pd.sdk.i1i$OooOO0O */
    public static class OooOO0O extends C5788LlL1i {
        public OooOO0O() {
            super("PBEwithHmacGOST3411", null, false, 2, 6, 256, 0);
        }
    }
}
