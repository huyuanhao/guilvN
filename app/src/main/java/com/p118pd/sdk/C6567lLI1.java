package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lLI1  reason: case insensitive filesystem */
public class C6567lLI1 {

    /* renamed from: com.pd.sdk.lLI1$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C6795llli1L(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C6795llli1L((C6795llli1L) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lLI1$OooO0O0 */
    public static class OooO0O0 extends Ll1lii implements Cloneable {
        public OooO0O0() {
            super(new C6795llli1L(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = (OooO0O0) super.clone();
            oooO0O0.OooO00o = new C6795llli1L((C6795llli1L) this.OooO00o);
            return oooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.lLI1$OooO0OO */
    public static class OooO0OO extends Ll1lii implements Cloneable {
        public OooO0OO() {
            super(new C6795llli1L(384));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0OO oooO0OO = (OooO0OO) super.clone();
            oooO0OO.OooO00o = new C6795llli1L((C6795llli1L) this.OooO00o);
            return oooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.lLI1$OooO0Oo  reason: case insensitive filesystem */
    public static class C6568OooO0Oo extends Ll1lii implements Cloneable {
        public C6568OooO0Oo() {
            super(new C6795llli1L(512));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            C6568OooO0Oo oooO0Oo = (C6568OooO0Oo) super.clone();
            oooO0Oo.OooO00o = new C6795llli1L((C6795llli1L) this.OooO00o);
            return oooO0Oo;
        }
    }

    /* renamed from: com.pd.sdk.lLI1$OooO0o0  reason: case insensitive filesystem */
    public static class C6569OooO0o0 extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6567lLI1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.BLAKE2B-512", OooO00o + "$Blake2b512");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo00O, "BLAKE2B-512");
            r4.addAlgorithm("MessageDigest.BLAKE2B-384", OooO00o + "$Blake2b384");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo000, "BLAKE2B-384");
            r4.addAlgorithm("MessageDigest.BLAKE2B-256", OooO00o + "$Blake2b256");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.OooOooo, "BLAKE2B-256");
            r4.addAlgorithm("MessageDigest.BLAKE2B-160", OooO00o + "$Blake2b160");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.OooOooO, "BLAKE2B-160");
        }
    }
}
