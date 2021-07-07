package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.Ii丨ilLL  reason: invalid class name */
public final class IiilLL {

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO */
    public static class OooO extends BaseBlockCipher {
        public OooO() {
            super(new C6744ll1L(new IlLilI(new C6177iLi1(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("RC6");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC6 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "RC6 IV";
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new C6177iLi1()), 128);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0Oo  reason: case insensitive filesystem */
    public static class C5410OooO0Oo extends BaseBlockCipher {
        public C5410OooO0Oo() {
            super(new C6744ll1L(new C9750I(new C6177iLi1(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C1IILlI(new iLIli1(new C6177iLi1())));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0o0  reason: case insensitive filesystem */
    public static class C5411OooO0o0 extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0o0$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C6177iLi1();
            }
        }

        public C5411OooO0o0() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0oO  reason: case insensitive filesystem */
    public static class C5412OooO0oO extends C5597L11llL {
        public C5412OooO0oO() {
            super("RC6", 256, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooO0oo  reason: case insensitive filesystem */
    public static class C5413OooO0oo extends AbstractC5307ILiI {
        public static final String OooO00o = IiilLL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r5) {
            r5.addAlgorithm("Cipher.RC6", OooO00o + "$ECB");
            r5.addAlgorithm("KeyGenerator.RC6", OooO00o + "$KeyGen");
            r5.addAlgorithm("AlgorithmParameters.RC6", OooO00o + "$AlgParams");
            OooO0O0(r5, "RC6", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r5, "RC6", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooOO0 */
    public static class OooOO0 extends C9680lII1i {
        public OooOO0() {
            super(new C6117iIl1(new C6177iLi1()));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨ilLL$OooOO0O */
    public static class OooOO0O extends C5597L11llL {
        public OooOO0O() {
            super("Poly1305-RC6", 256, new C5576L11i());
        }
    }
}
