package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ll1iI  reason: case insensitive filesystem */
public class C6733ll1iI {

    /* renamed from: com.pd.sdk.ll1iI$OooO */
    public static class OooO extends C9680lII1i {
        public OooO() {
            super(new C6383iLl1(new C5524IL1I1L(288)));
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO00o */
    public static class OooO00o extends OooO0o {
        public OooO00o() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0O0 */
    public static class OooO0O0 extends OooO0o {
        public OooO0O0() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0OO */
    public static class OooO0OO extends OooO0o {
        public OooO0OO() {
            super(288);
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0Oo  reason: case insensitive filesystem */
    public static class C6734OooO0Oo extends OooO0o {
        public C6734OooO0Oo() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0o */
    public static class OooO0o extends Ll1lii implements Cloneable {
        public OooO0o(int i) {
            super(new C5524IL1I1L(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new C5524IL1I1L((C5524IL1I1L) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0o0  reason: case insensitive filesystem */
    public static class C6735OooO0o0 extends OooO0o {
        public C6735OooO0o0() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0oO  reason: case insensitive filesystem */
    public static class C6736OooO0oO extends C9680lII1i {
        public C6736OooO0oO() {
            super(new C6383iLl1(new C5524IL1I1L((int) C7967oO0oOo00.Ooooo0o)));
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooO0oo  reason: case insensitive filesystem */
    public static class C6737OooO0oo extends C9680lII1i {
        public C6737OooO0oo() {
            super(new C6383iLl1(new C5524IL1I1L(256)));
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0() {
            super(new C6383iLl1(new C5524IL1I1L(384)));
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOO0O */
    public static class OooOO0O extends C9680lII1i {
        public OooOO0O() {
            super(new C6383iLl1(new C5524IL1I1L(512)));
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOO0o  reason: case insensitive filesystem */
    public static class C6738OooOO0o extends C5597L11llL {
        public C6738OooOO0o() {
            super("HMACKECCAK224", C7967oO0oOo00.Ooooo0o, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOOO */
    public static class OooOOO extends C5597L11llL {
        public OooOOO() {
            super("HMACKECCAK288", 288, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOOO0 */
    public static class OooOOO0 extends C5597L11llL {
        public OooOOO0() {
            super("HMACKECCAK256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOOOO */
    public static class OooOOOO extends C5597L11llL {
        public OooOOOO() {
            super("HMACKECCAK384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOOOo  reason: case insensitive filesystem */
    public static class C6739OooOOOo extends C5597L11llL {
        public C6739OooOOOo() {
            super("HMACKECCAK512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ll1iI$OooOOo0  reason: case insensitive filesystem */
    public static class C6740OooOOo0 extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6733ll1iI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.KECCAK-224", OooO00o + "$Digest224");
            r4.addAlgorithm("MessageDigest.KECCAK-288", OooO00o + "$Digest288");
            r4.addAlgorithm("MessageDigest.KECCAK-256", OooO00o + "$Digest256");
            r4.addAlgorithm("MessageDigest.KECCAK-384", OooO00o + "$Digest384");
            r4.addAlgorithm("MessageDigest.KECCAK-512", OooO00o + "$Digest512");
            OooO00o(r4, "KECCAK224", OooO00o + "$HashMac224", OooO00o + "$KeyGenerator224");
            OooO00o(r4, "KECCAK256", OooO00o + "$HashMac256", OooO00o + "$KeyGenerator256");
            OooO00o(r4, "KECCAK288", OooO00o + "$HashMac288", OooO00o + "$KeyGenerator288");
            OooO00o(r4, "KECCAK384", OooO00o + "$HashMac384", OooO00o + "$KeyGenerator384");
            OooO00o(r4, "KECCAK512", OooO00o + "$HashMac512", OooO00o + "$KeyGenerator512");
        }
    }
}
