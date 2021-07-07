package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.LII111丨  reason: invalid class name */
public final class LII111 {

    /* renamed from: com.pd.sdk.LII111丨$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("Noekeon");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for Noekeon parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "Noekeon IV";
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.LII111丨$OooO0OO$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C5498I1i();
            }
        }

        public OooO0OO() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C5614OooO0Oo extends C9680lII1i {
        public C5614OooO0Oo() {
            super(new C1IILlI(new iLIli1(new C5498I1i())));
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0o */
    public static class OooO0o extends AbstractC5307ILiI {
        public static final String OooO00o = LII111.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("AlgorithmParameters.NOEKEON", OooO00o + "$AlgParams");
            r5.addAlgorithm("AlgorithmParameterGenerator.NOEKEON", OooO00o + "$AlgParamGen");
            r5.addAlgorithm("Cipher.NOEKEON", OooO00o + "$ECB");
            r5.addAlgorithm("KeyGenerator.NOEKEON", OooO00o + "$KeyGen");
            OooO0O0(r5, "NOEKEON", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r5, "NOEKEON", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0o0  reason: case insensitive filesystem */
    public static class C5615OooO0o0 extends C5597L11llL {
        public C5615OooO0o0() {
            super("Noekeon", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0oO  reason: case insensitive filesystem */
    public static class C5616OooO0oO extends C9680lII1i {
        public C5616OooO0oO() {
            super(new C6117iIl1(new C5498I1i()));
        }
    }

    /* renamed from: com.pd.sdk.LII111丨$OooO0oo  reason: case insensitive filesystem */
    public static class C5617OooO0oo extends C5597L11llL {
        public C5617OooO0oo() {
            super("Poly1305-Noekeon", 256, new C5576L11i());
        }
    }
}
