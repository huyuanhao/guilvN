package com.p118pd.sdk;

/* renamed from: com.pd.sdk.li丨lI  reason: invalid class name and case insensitive filesystem */
public final class C6716lilI {

    /* renamed from: com.pd.sdk.li丨lI$OooO00o */
    public static class OooO00o extends C5718LiiL {
        public OooO00o() {
            super(new C5739Lil1(), 0);
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0O0 */
    public static class OooO0O0 extends C5597L11llL {
        public OooO0O0() {
            super("RC4", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = C6716lilI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("Cipher.ARC4", OooO00o + "$Base");
            r6.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.Ooooo0o, "ARC4");
            r6.addAlgorithm("Alg.Alias.Cipher.ARCFOUR", "ARC4");
            r6.addAlgorithm("Alg.Alias.Cipher.RC4", "ARC4");
            r6.addAlgorithm("KeyGenerator.ARC4", OooO00o + "$KeyGen");
            r6.addAlgorithm("Alg.Alias.KeyGenerator.RC4", "ARC4");
            r6.addAlgorithm("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
            r6.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC4", OooO00o + "$PBEWithSHAAnd128BitKeyFactory");
            r6.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC4", OooO00o + "$PBEWithSHAAnd40BitKeyFactory");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.o000o0OO, "PKCS12PBE");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.o000o0Oo, "PKCS12PBE");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC4", "PKCS12PBE");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC4", "PKCS12PBE");
            r6.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC4", "PKCS12PBE");
            r6.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC4", OooO00o + "$PBEWithSHAAnd128Bit");
            r6.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC4", OooO00o + "$PBEWithSHAAnd40Bit");
            r6.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5711LiLli.o000o0OO, "PBEWITHSHAAND128BITRC4");
            r6.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5711LiLli.o000o0Oo, "PBEWITHSHAAND40BITRC4");
            r6.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC4", "PBEWITHSHAAND128BITRC4");
            r6.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC4", "PBEWITHSHAAND40BITRC4");
            r6.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0OO, "PBEWITHSHAAND128BITRC4");
            r6.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0Oo, "PBEWITHSHAAND40BITRC4");
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0Oo  reason: case insensitive filesystem */
    public static class C6717OooO0Oo extends C5718LiiL {
        public C6717OooO0Oo() {
            super(new C5739Lil1(), 0, 128, 1);
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0o */
    public static class OooO0o extends C5718LiiL {
        public OooO0o() {
            super(new C5739Lil1(), 0, 40, 1);
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0o0  reason: case insensitive filesystem */
    public static class C6718OooO0o0 extends C5788LlL1i {
        public C6718OooO0o0() {
            super("PBEWithSHAAnd128BitRC4", AbstractC5711LiLli.o000o0OO, true, 2, 1, 128, 0);
        }
    }

    /* renamed from: com.pd.sdk.li丨lI$OooO0oO  reason: case insensitive filesystem */
    public static class C6719OooO0oO extends C5788LlL1i {
        public C6719OooO0oO() {
            super("PBEWithSHAAnd128BitRC4", AbstractC5711LiLli.o000o0OO, true, 2, 1, 40, 0);
        }
    }
}
