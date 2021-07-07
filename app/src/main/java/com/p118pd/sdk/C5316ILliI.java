package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.ILliI  reason: case insensitive filesystem */
public class C5316ILliI {

    /* renamed from: com.pd.sdk.ILliI$OooO */
    public static class OooO extends BaseBlockCipher {
        public OooO() {
            super(new C6744ll1L(new iIi11II(new C6391ii1LIl())), false, 128);
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO00o */
    public static class OooO00o extends BaseBlockCipher {
        public OooO00o() {
            super((li1l11I1) new C6361i1l(new C6391ii1LIl()), false, 128);
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6744ll1L(new IIIIL1I(new C6391ii1LIl())), 128);
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6391ii1LIl());
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0Oo  reason: case insensitive filesystem */
    public static class C5317OooO0Oo extends BaseBlockCipher {
        public C5317OooO0Oo() {
            super(new C6744ll1L(new C6625lL1(new C6391ii1LIl(), 8)), false, 128);
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0o */
    public static class OooO0o extends C5597L11llL {
        public OooO0o() {
            this(256);
        }

        public OooO0o(int i) {
            super("GOST3412-2015", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0o0  reason: case insensitive filesystem */
    public static class C5318OooO0o0 extends BaseBlockCipher {
        public C5318OooO0o0() {
            super(new C6744ll1L(new C6625lL1(new C6391ii1LIl())), false, 128);
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0oO  reason: case insensitive filesystem */
    public static class C5319OooO0oO extends C9680lII1i {
        public C5319OooO0oO() {
            super(new lLlLIi(new C6391ii1LIl()));
        }
    }

    /* renamed from: com.pd.sdk.ILliI$OooO0oo  reason: case insensitive filesystem */
    public static class C5320OooO0oo extends II1ii1 {
        public static final String OooO00o = C5316ILliI.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("Cipher.GOST3412-2015", OooO00o + "$ECB");
            r3.addAlgorithm("Cipher.GOST3412-2015/CFB", OooO00o + "$GCFB");
            r3.addAlgorithm("Cipher.GOST3412-2015/CFB8", OooO00o + "$GCFB8");
            r3.addAlgorithm("Cipher.GOST3412-2015/OFB", OooO00o + "$OFB");
            r3.addAlgorithm("Cipher.GOST3412-2015/CBC", OooO00o + "$CBC");
            r3.addAlgorithm("Cipher.GOST3412-2015/CTR", OooO00o + "$CTR");
            r3.addAlgorithm("KeyGenerator.GOST3412-2015", OooO00o + "$KeyGen");
            r3.addAlgorithm("Mac.GOST3412MAC", OooO00o + "$Mac");
            r3.addAlgorithm("Alg.Alias.Mac.GOST3412-2015", "GOST3412MAC");
        }
    }
}
