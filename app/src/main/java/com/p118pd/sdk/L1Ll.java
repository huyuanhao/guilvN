package com.p118pd.sdk;

import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.L1Ll */
public final class L1Ll {

    /* renamed from: com.pd.sdk.L1Ll$OooO00o */
    public static class OooO00o extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.L1Ll$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4917OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new ILLlI1();
            }
        }

        public OooO00o() {
            super(new C4917OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.L1Ll$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C1IILlI(new iLIli1(new ILLlI1())));
        }
    }

    /* renamed from: com.pd.sdk.L1Ll$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("CAST6", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.L1Ll$OooO0Oo  reason: case insensitive filesystem */
    public static class C5582OooO0Oo extends AbstractC5307ILiI {
        public static final String OooO00o = L1Ll.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("Cipher.CAST6", OooO00o + "$ECB");
            r5.addAlgorithm("KeyGenerator.CAST6", OooO00o + "$KeyGen");
            OooO0O0(r5, "CAST6", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r5, "CAST6", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.L1Ll$OooO0o */
    public static class OooO0o extends C5597L11llL {
        public OooO0o() {
            super("Poly1305-CAST6", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.L1Ll$OooO0o0  reason: case insensitive filesystem */
    public static class C5583OooO0o0 extends C9680lII1i {
        public C5583OooO0o0() {
            super(new C6117iIl1(new ILLlI1()));
        }
    }
}
