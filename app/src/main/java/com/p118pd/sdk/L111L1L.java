package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨L111L1L  reason: invalid class name */
public class L111L1L {

    /* renamed from: com.pd.sdk.丨L111L1L$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("HMACSHA512/224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C5622LILlL());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C5622LILlL((C5622LILlL) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0O0 */
    public static class OooO0O0 extends C9452OooO0Oo {
        public OooO0O0() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0OO */
    public static class OooO0OO extends C9452OooO0Oo {
        public OooO0OO() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0Oo  reason: case insensitive filesystem */
    public static class C9452OooO0Oo extends Ll1lii implements Cloneable {
        public C9452OooO0Oo(int i) {
            super(new I1llii(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            C9452OooO0Oo oooO0Oo = (C9452OooO0Oo) super.clone();
            oooO0Oo.OooO00o = new I1llii((I1llii) this.OooO00o);
            return oooO0Oo;
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C6383iLl1(new I1llii((int) C7967oO0oOo00.Ooooo0o)));
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0o0  reason: case insensitive filesystem */
    public static class C9453OooO0o0 extends C9680lII1i {
        public C9453OooO0o0() {
            super(new C6383iLl1(new C5622LILlL()));
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0oO  reason: case insensitive filesystem */
    public static class C9454OooO0oO extends C9680lII1i {
        public C9454OooO0oO() {
            super(new C6383iLl1(new I1llii(256)));
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooO0oo  reason: case insensitive filesystem */
    public static class C9455OooO0oo extends C5597L11llL {
        public C9455OooO0oo() {
            super("HMACSHA512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooOO0 */
    public static class OooOO0 extends C5597L11llL {
        public OooOO0() {
            super("HMACSHA512/256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooOO0O */
    public static class OooOO0O extends AbstractC6146iIIi1 {
        public static final String OooO00o = L111L1L.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("MessageDigest.SHA-512", OooO00o + "$Digest");
            r5.addAlgorithm("Alg.Alias.MessageDigest.SHA512", LL1i.f16408OooO0o);
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0o0, LL1i.f16408OooO0o);
            r5.addAlgorithm("MessageDigest.SHA-512/224", OooO00o + "$DigestT224");
            r5.addAlgorithm("Alg.Alias.MessageDigest.SHA512/224", "SHA-512/224");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0oO, "SHA-512/224");
            r5.addAlgorithm("MessageDigest.SHA-512/256", OooO00o + "$DigestT256");
            r5.addAlgorithm("Alg.Alias.MessageDigest.SHA512256", "SHA-512/256");
            r5.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5905LllI.OooO0oo, "SHA-512/256");
            r5.addAlgorithm("Mac.OLDHMACSHA512", OooO00o + "$OldSHA512");
            r5.addAlgorithm("Mac.PBEWITHHMACSHA512", OooO00o + "$HashMac");
            OooO00o(r5, "SHA512", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
            OooO00o(r5, "SHA512", AbstractC5711LiLli.ooOO);
            OooO00o(r5, "SHA512/224", OooO00o + "$HashMacT224", OooO00o + "$KeyGeneratorT224");
            OooO00o(r5, "SHA512/256", OooO00o + "$HashMacT256", OooO00o + "$KeyGeneratorT256");
        }
    }

    /* renamed from: com.pd.sdk.丨L111L1L$OooOO0o  reason: case insensitive filesystem */
    public static class C9456OooOO0o extends C9680lII1i {
        public C9456OooOO0o() {
            super(new C6381iLiIi1(new C5622LILlL()));
        }
    }
}
