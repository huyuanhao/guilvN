package com.p118pd.sdk;

/* renamed from: com.pd.sdk.Il丨l  reason: invalid class name and case insensitive filesystem */
public class C5482Ill {

    /* renamed from: com.pd.sdk.Il丨l$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("HMACDSTU7564-384", 384, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO00o */
    public static class OooO00o extends C5483OooO0Oo {
        public OooO00o() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0O0 */
    public static class OooO0O0 extends C5483OooO0Oo {
        public OooO0O0() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0OO */
    public static class OooO0OO extends C5483OooO0Oo {
        public OooO0OO() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0Oo  reason: case insensitive filesystem */
    public static class C5483OooO0Oo extends Ll1lii implements Cloneable {
        public C5483OooO0Oo(int i) {
            super(new Ilii1(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new Ilii1((Ilii1) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new ili1L(384));
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0o0  reason: case insensitive filesystem */
    public static class C5484OooO0o0 extends C9680lII1i {
        public C5484OooO0o0() {
            super(new ili1L(256));
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0oO  reason: case insensitive filesystem */
    public static class C5485OooO0oO extends C9680lII1i {
        public C5485OooO0oO() {
            super(new ili1L(512));
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooO0oo  reason: case insensitive filesystem */
    public static class C5486OooO0oo extends C5597L11llL {
        public C5486OooO0oo() {
            super("HMACDSTU7564-256", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooOO0 */
    public static class OooOO0 extends C5597L11llL {
        public OooOO0() {
            super("HMACDSTU7564-512", 512, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Il丨l$OooOO0O */
    public static class OooOO0O extends AbstractC6146iIIi1 {
        public static final String OooO00o = C5482Ill.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r7) {
            r7.addAlgorithm("MessageDigest.DSTU7564-256", OooO00o + "$Digest256");
            r7.addAlgorithm("MessageDigest.DSTU7564-384", OooO00o + "$Digest384");
            r7.addAlgorithm("MessageDigest.DSTU7564-512", OooO00o + "$Digest512");
            r7.addAlgorithm("MessageDigest", AbstractC6781lli.OooO0Oo, OooO00o + "$Digest256");
            r7.addAlgorithm("MessageDigest", AbstractC6781lli.OooO0o0, OooO00o + "$Digest384");
            r7.addAlgorithm("MessageDigest", AbstractC6781lli.OooO0o, OooO00o + "$Digest512");
            OooO00o(r7, "DSTU7564-256", OooO00o + "$HashMac256", OooO00o + "$KeyGenerator256");
            OooO00o(r7, "DSTU7564-384", OooO00o + "$HashMac384", OooO00o + "$KeyGenerator384");
            OooO00o(r7, "DSTU7564-512", OooO00o + "$HashMac512", OooO00o + "$KeyGenerator512");
            OooO00o(r7, "DSTU7564-256", AbstractC6781lli.OooO0oO);
            OooO00o(r7, "DSTU7564-384", AbstractC6781lli.OooO0oo);
            OooO00o(r7, "DSTU7564-512", AbstractC6781lli.OooO);
        }
    }
}
