package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨1iiII1  reason: invalid class name */
public final class C1iiII1 {

    /* renamed from: com.pd.sdk.丨1iiII1$OooO */
    public static class OooO extends C5597L11llL {
        public OooO() {
            super("Poly1305-SM4", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("SM4");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SM4 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "SM4 IV";
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new lLlLIi(new C9438III1()));
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0Oo  reason: case insensitive filesystem */
    public static class C9306OooO0Oo extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.丨1iiII1$OooO0Oo$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C9438III1();
            }
        }

        public C9306OooO0Oo() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0o */
    public static class OooO0o extends C5597L11llL {
        public OooO0o() {
            super("SM4", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0o0  reason: case insensitive filesystem */
    public static class C9307OooO0o0 extends C9680lII1i {
        public C9307OooO0o0() {
            super(new C1IILlI(new iLIli1(new C9438III1())));
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0oO  reason: case insensitive filesystem */
    public static class C9308OooO0oO extends AbstractC5307ILiI {
        public static final String OooO00o = C1iiII1.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r6) {
            r6.addAlgorithm("AlgorithmParameters.SM4", OooO00o + "$AlgParams");
            r6.addAlgorithm("AlgorithmParameterGenerator.SM4", OooO00o + "$AlgParamGen");
            r6.addAlgorithm("Cipher.SM4", OooO00o + "$ECB");
            r6.addAlgorithm("KeyGenerator.SM4", OooO00o + "$KeyGen");
            OooO00o(r6, "SM4", OooO00o + "$CMAC", OooO00o + "$KeyGen");
            OooO0O0(r6, "SM4", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r6, "SM4", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.丨1iiII1$OooO0oo  reason: case insensitive filesystem */
    public static class C9309OooO0oo extends C9680lII1i {
        public C9309OooO0oo() {
            super(new C6117iIl1(new C9438III1()));
        }
    }
}
