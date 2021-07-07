package com.p118pd.sdk;

/* renamed from: com.pd.sdk.lii1LL  reason: case insensitive filesystem */
public class C6686lii1LL {

    /* renamed from: com.pd.sdk.lii1LL$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new I1LILLl(128));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new I1LILLl((I1LILLl) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lii1LL$OooO0O0 */
    public static class OooO0O0 extends Ll1lii implements Cloneable {
        public OooO0O0() {
            super(new I1LILLl(160));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0O0 oooO0O0 = (OooO0O0) super.clone();
            oooO0O0.OooO00o = new I1LILLl((I1LILLl) this.OooO00o);
            return oooO0O0;
        }
    }

    /* renamed from: com.pd.sdk.lii1LL$OooO0OO */
    public static class OooO0OO extends Ll1lii implements Cloneable {
        public OooO0OO() {
            super(new I1LILLl((int) C7967oO0oOo00.Ooooo0o));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO0OO oooO0OO = (OooO0OO) super.clone();
            oooO0OO.OooO00o = new I1LILLl((I1LILLl) this.OooO00o);
            return oooO0OO;
        }
    }

    /* renamed from: com.pd.sdk.lii1LL$OooO0Oo  reason: case insensitive filesystem */
    public static class C6687OooO0Oo extends Ll1lii implements Cloneable {
        public C6687OooO0Oo() {
            super(new I1LILLl(256));
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            C6687OooO0Oo oooO0Oo = (C6687OooO0Oo) super.clone();
            oooO0Oo.OooO00o = new I1LILLl((I1LILLl) this.OooO00o);
            return oooO0Oo;
        }
    }

    /* renamed from: com.pd.sdk.lii1LL$OooO0o0  reason: case insensitive filesystem */
    public static class C6688OooO0o0 extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6686lii1LL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.BLAKE2S-256", OooO00o + "$Blake2s256");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo0OO, "BLAKE2S-256");
            r4.addAlgorithm("MessageDigest.BLAKE2S-224", OooO00o + "$Blake2s224");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo0O0, "BLAKE2S-224");
            r4.addAlgorithm("MessageDigest.BLAKE2S-160", OooO00o + "$Blake2s160");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo0, "BLAKE2S-160");
            r4.addAlgorithm("MessageDigest.BLAKE2S-128", OooO00o + "$Blake2s128");
            r4.addAlgorithm("Alg.Alias.MessageDigest." + AbstractC5702Li111.Oooo00o, "BLAKE2S-128");
        }
    }
}
