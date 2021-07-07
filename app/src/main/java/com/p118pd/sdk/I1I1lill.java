package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1I1lill */
public class I1I1lill {

    /* renamed from: com.pd.sdk.I1I1lill$OooO */
    public static class OooO extends OooOO0 {
        public OooO() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO00o */
    public static class OooO00o extends C5166OooO0o0 {
        public OooO00o() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0O0 */
    public static class OooO0O0 extends C5166OooO0o0 {
        public OooO0O0() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0OO */
    public static class OooO0OO extends C5166OooO0o0 {
        public OooO0OO() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0Oo  reason: case insensitive filesystem */
    public static class C5165OooO0Oo extends C5166OooO0o0 {
        public C5165OooO0Oo() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0o */
    public static class OooO0o extends OooOO0 {
        public OooO0o() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0o0  reason: case insensitive filesystem */
    public static class C5166OooO0o0 extends Ll1lii implements Cloneable {
        public C5166OooO0o0(int i) {
            super(new C6249iiLi(i));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            Ll1lii r0 = (Ll1lii) super.clone();
            r0.OooO00o = new C6249iiLi((C6249iiLi) this.OooO00o);
            return r0;
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0oO  reason: case insensitive filesystem */
    public static class C5167OooO0oO extends OooOO0 {
        public C5167OooO0oO() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooO0oo  reason: case insensitive filesystem */
    public static class C5168OooO0oo extends OooOO0 {
        public C5168OooO0oo() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0(int i) {
            super(new C6383iLl1(new C6249iiLi(i)));
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOO0O */
    public static class OooOO0O extends OooOOOO {
        public OooOO0O() {
            super(C7967oO0oOo00.Ooooo0o);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOO0o  reason: case insensitive filesystem */
    public static class C5169OooOO0o extends OooOOOO {
        public C5169OooOO0o() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOOO */
    public static class OooOOO extends OooOOOO {
        public OooOOO() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOOO0 */
    public static class OooOOO0 extends OooOOOO {
        public OooOOO0() {
            super(384);
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOOOO */
    public static class OooOOOO extends C5597L11llL {
        public OooOOOO(int i) {
            super("HMACSHA3-" + i, i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.I1I1lill$OooOOOo  reason: case insensitive filesystem */
    public static class C5170OooOOOo extends AbstractC6146iIIi1 {
        public static final String OooO00o = I1I1lill.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r8) {
            r8.addAlgorithm("MessageDigest.SHA3-224", OooO00o + "$Digest224");
            r8.addAlgorithm("MessageDigest.SHA3-256", OooO00o + "$Digest256");
            r8.addAlgorithm("MessageDigest.SHA3-384", OooO00o + "$Digest384");
            r8.addAlgorithm("MessageDigest.SHA3-512", OooO00o + "$Digest512");
            r8.addAlgorithm("MessageDigest", AbstractC5905LllI.OooO, OooO00o + "$Digest224");
            r8.addAlgorithm("MessageDigest", AbstractC5905LllI.OooOO0, OooO00o + "$Digest256");
            r8.addAlgorithm("MessageDigest", AbstractC5905LllI.OooOO0O, OooO00o + "$Digest384");
            r8.addAlgorithm("MessageDigest", AbstractC5905LllI.OooOO0o, OooO00o + "$Digest512");
            OooO00o(r8, "SHA3-224", OooO00o + "$HashMac224", OooO00o + "$KeyGenerator224");
            OooO00o(r8, "SHA3-224", AbstractC5905LllI.OooOOOO);
            OooO00o(r8, C6229iiIL.OooO0OO, OooO00o + "$HashMac256", OooO00o + "$KeyGenerator256");
            OooO00o(r8, C6229iiIL.OooO0OO, AbstractC5905LllI.OooOOOo);
            OooO00o(r8, "SHA3-384", OooO00o + "$HashMac384", OooO00o + "$KeyGenerator384");
            OooO00o(r8, "SHA3-384", AbstractC5905LllI.OooOOo0);
            OooO00o(r8, "SHA3-512", OooO00o + "$HashMac512", OooO00o + "$KeyGenerator512");
            OooO00o(r8, "SHA3-512", AbstractC5905LllI.OooOOo);
        }
    }
}
