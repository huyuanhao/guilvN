package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.丨丨IlL  reason: invalid class name and case insensitive filesystem */
public class C9765IlL {

    /* renamed from: com.pd.sdk.丨丨IlL$OooO */
    public static class OooO extends BaseBlockCipher {
        public OooO() {
            super(new C5456IlLi(new I1iIii(128)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO00o */
    public static class OooO00o extends C9766OooO0Oo {
        public OooO00o() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0O0 */
    public static class OooO0O0 extends C9766OooO0Oo {
        public OooO0O0() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0OO */
    public static class OooO0OO extends C9766OooO0Oo {
        public OooO0OO() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0Oo  reason: case insensitive filesystem */
    public static class C9766OooO0Oo extends AbstractC6384iLll1 {
        public final int OooO0O0;

        public C9766OooO0Oo(int i) {
            this.OooO0O0 = i / 8;
        }

        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[this.OooO0O0];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("DSTU7624");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSTU7624 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C6927lll1(new I1iIii(128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0o0  reason: case insensitive filesystem */
    public static class C9767OooO0o0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "DSTU7624 IV";
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0oO  reason: case insensitive filesystem */
    public static class C9768OooO0oO extends BaseBlockCipher {
        public C9768OooO0oO() {
            super(new C6927lll1(new I1iIii(256)), 256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooO0oo  reason: case insensitive filesystem */
    public static class C9769OooO0oo extends BaseBlockCipher {
        public C9769OooO0oo() {
            super(new C6927lll1(new I1iIii(512)), 512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOO0 */
    public static class OooOO0 extends BaseBlockCipher {
        public OooOO0() {
            super(new C5456IlLi(new I1iIii(256)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOO0O */
    public static class OooOO0O extends BaseBlockCipher {
        public OooOO0O() {
            super(new C5456IlLi(new I1iIii(512)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOO0o  reason: case insensitive filesystem */
    public static class C9770OooOO0o extends BaseBlockCipher {
        public C9770OooOO0o() {
            super(new C6744ll1L(new C9750I(new I1iIii(128), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOO */
    public static class OooOOO extends BaseBlockCipher {
        public OooOOO() {
            super(new C6744ll1L(new C9750I(new I1iIii(512), 512)), 512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOO0 */
    public static class OooOOO0 extends BaseBlockCipher {
        public OooOOO0() {
            super(new C6744ll1L(new C9750I(new I1iIii(256), 256)), 256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new C6744ll1L(new C1l1i(new I1iIii(128))), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOOo  reason: case insensitive filesystem */
    public static class C9771OooOOOo extends BaseBlockCipher {
        public C9771OooOOOo() {
            super(new C6744ll1L(new C1l1i(new I1iIii(256))), 256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOo  reason: case insensitive filesystem */
    public static class C9772OooOOo extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.丨丨IlL$OooOOo$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new I1iIii(128);
            }
        }

        public C9772OooOOo() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOo0  reason: case insensitive filesystem */
    public static class C9773OooOOo0 extends BaseBlockCipher {
        public C9773OooOOo0() {
            super(new C6744ll1L(new C1l1i(new I1iIii(512))), 512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOOoo  reason: case insensitive filesystem */
    public static class C9774OooOOoo extends BaseBlockCipher {
        public C9774OooOOoo() {
            super(new I1iIii(128));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOo */
    public static class OooOo extends BaseBlockCipher {
        public OooOo() {
            super(new I1iIii(512));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOo0  reason: case insensitive filesystem */
    public static class C9775OooOo0 extends BaseBlockCipher {
        public C9775OooOo0() {
            super(new I1iIii(512));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOo00 */
    public static class OooOo00 extends BaseBlockCipher {
        public OooOo00() {
            super(new I1iIii(256));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOo0O  reason: case insensitive filesystem */
    public static class C9776OooOo0O extends BaseBlockCipher {
        public C9776OooOo0O() {
            super(new I1iIii(128));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOo0o  reason: case insensitive filesystem */
    public static class C9777OooOo0o extends BaseBlockCipher {
        public C9777OooOo0o() {
            super(new I1iIii(256));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOoO  reason: case insensitive filesystem */
    public static class C9778OooOoO extends BaseBlockCipher {
        public C9778OooOoO() {
            super(new L1ILII(new I1iIii(256)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOoO0  reason: case insensitive filesystem */
    public static class C9779OooOoO0 extends BaseBlockCipher {
        public C9779OooOoO0() {
            super(new L1ILII(new I1iIii(128)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOoOO  reason: case insensitive filesystem */
    public static class C9780OooOoOO extends BaseBlockCipher {
        public C9780OooOoOO() {
            super(new L1ILII(new I1iIii(512)));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOoo  reason: case insensitive filesystem */
    public static class C9781OooOoo extends C9680lII1i {
        public C9781OooOoo() {
            super(new C9861li(new L1ILII(new I1iIii(256)), 256));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOoo0  reason: case insensitive filesystem */
    public static class C9782OooOoo0 extends C9680lII1i {
        public C9782OooOoo0() {
            super(new C9861li(new L1ILII(new I1iIii(128)), 128));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOooO  reason: case insensitive filesystem */
    public static class C9783OooOooO extends C9680lII1i {
        public C9783OooOooO() {
            super(new C9861li(new L1ILII(new I1iIii(512)), 512));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OooOooo  reason: case insensitive filesystem */
    public static class C9784OooOooo extends C9680lII1i {
        public C9784OooOooo() {
            super(new C9861li(new L1ILII(new I1iIii(128)), 128));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo  reason: case insensitive filesystem */
    public static class C9785Oooo extends Lll1IlI {
        public C9785Oooo() {
            super(new C9541Ll(512));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0 */
    public static class Oooo0 extends C5597L11llL {
        public Oooo0() {
            this(256);
        }

        public Oooo0(int i) {
            super("DSTU7624", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo000 */
    public static class Oooo000 extends Oooo0 {
        public Oooo000() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo00O  reason: case insensitive filesystem */
    public static class C9786Oooo00O extends Oooo0 {
        public C9786Oooo00O() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo00o  reason: case insensitive filesystem */
    public static class C9787Oooo00o extends Oooo0 {
        public C9787Oooo00o() {
            super(512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0O0  reason: case insensitive filesystem */
    public static class C9788Oooo0O0 extends AbstractC5307ILiI {
        public static final String OooO00o = C9765IlL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r8) {
            r8.addAlgorithm("AlgorithmParameters.DSTU7624", OooO00o + "$AlgParams128");
            LlLI1 llLI1 = AbstractC6781lli.OooOo0O;
            r8.addAlgorithm("AlgorithmParameters", llLI1, OooO00o + "$AlgParams");
            LlLI1 llLI12 = AbstractC6781lli.OooOo0o;
            r8.addAlgorithm("AlgorithmParameters", llLI12, OooO00o + "$AlgParams");
            LlLI1 llLI13 = AbstractC6781lli.OooOo;
            r8.addAlgorithm("AlgorithmParameters", llLI13, OooO00o + "$AlgParams");
            r8.addAlgorithm("AlgorithmParameterGenerator.DSTU7624", OooO00o + "$AlgParamGen128");
            LlLI1 llLI14 = AbstractC6781lli.OooOo0O;
            r8.addAlgorithm("AlgorithmParameterGenerator", llLI14, OooO00o + "$AlgParamGen128");
            LlLI1 llLI15 = AbstractC6781lli.OooOo0o;
            r8.addAlgorithm("AlgorithmParameterGenerator", llLI15, OooO00o + "$AlgParamGen256");
            LlLI1 llLI16 = AbstractC6781lli.OooOo;
            r8.addAlgorithm("AlgorithmParameterGenerator", llLI16, OooO00o + "$AlgParamGen512");
            r8.addAlgorithm("Cipher.DSTU7624", OooO00o + "$ECB_128");
            r8.addAlgorithm("Cipher.DSTU7624-128", OooO00o + "$ECB_128");
            r8.addAlgorithm("Cipher.DSTU7624-256", OooO00o + "$ECB_256");
            r8.addAlgorithm("Cipher.DSTU7624-512", OooO00o + "$ECB_512");
            LlLI1 llLI17 = AbstractC6781lli.OooOO0;
            r8.addAlgorithm("Cipher", llLI17, OooO00o + "$ECB128");
            LlLI1 llLI18 = AbstractC6781lli.OooOO0O;
            r8.addAlgorithm("Cipher", llLI18, OooO00o + "$ECB256");
            LlLI1 llLI19 = AbstractC6781lli.OooOO0o;
            r8.addAlgorithm("Cipher", llLI19, OooO00o + "$ECB512");
            LlLI1 llLI110 = AbstractC6781lli.OooOo0O;
            r8.addAlgorithm("Cipher", llLI110, OooO00o + "$CBC128");
            LlLI1 llLI111 = AbstractC6781lli.OooOo0o;
            r8.addAlgorithm("Cipher", llLI111, OooO00o + "$CBC256");
            LlLI1 llLI112 = AbstractC6781lli.OooOo;
            r8.addAlgorithm("Cipher", llLI112, OooO00o + "$CBC512");
            LlLI1 llLI113 = AbstractC6781lli.OooOoO0;
            r8.addAlgorithm("Cipher", llLI113, OooO00o + "$OFB128");
            LlLI1 llLI114 = AbstractC6781lli.OooOoO;
            r8.addAlgorithm("Cipher", llLI114, OooO00o + "$OFB256");
            LlLI1 llLI115 = AbstractC6781lli.OooOoOO;
            r8.addAlgorithm("Cipher", llLI115, OooO00o + "$OFB512");
            LlLI1 llLI116 = AbstractC6781lli.OooOOOo;
            r8.addAlgorithm("Cipher", llLI116, OooO00o + "$CFB128");
            LlLI1 llLI117 = AbstractC6781lli.OooOOo0;
            r8.addAlgorithm("Cipher", llLI117, OooO00o + "$CFB256");
            LlLI1 llLI118 = AbstractC6781lli.OooOOo;
            r8.addAlgorithm("Cipher", llLI118, OooO00o + "$CFB512");
            LlLI1 llLI119 = AbstractC6781lli.OooOOO0;
            r8.addAlgorithm("Cipher", llLI119, OooO00o + "$CTR128");
            LlLI1 llLI120 = AbstractC6781lli.OooOOO;
            r8.addAlgorithm("Cipher", llLI120, OooO00o + "$CTR256");
            LlLI1 llLI121 = AbstractC6781lli.OooOOOO;
            r8.addAlgorithm("Cipher", llLI121, OooO00o + "$CTR512");
            LlLI1 llLI122 = AbstractC6781lli.OooOooo;
            r8.addAlgorithm("Cipher", llLI122, OooO00o + "$CCM128");
            LlLI1 llLI123 = AbstractC6781lli.Oooo000;
            r8.addAlgorithm("Cipher", llLI123, OooO00o + "$CCM256");
            LlLI1 llLI124 = AbstractC6781lli.Oooo00O;
            r8.addAlgorithm("Cipher", llLI124, OooO00o + "$CCM512");
            r8.addAlgorithm("Cipher.DSTU7624KW", OooO00o + "$Wrap");
            r8.addAlgorithm("Alg.Alias.Cipher.DSTU7624WRAP", "DSTU7624KW");
            r8.addAlgorithm("Cipher.DSTU7624-128KW", OooO00o + "$Wrap128");
            r8.addAlgorithm("Alg.Alias.Cipher." + AbstractC6781lli.Oooo0OO.m16387OooO0O0(), "DSTU7624-128KW");
            r8.addAlgorithm("Alg.Alias.Cipher.DSTU7624-128WRAP", "DSTU7624-128KW");
            r8.addAlgorithm("Cipher.DSTU7624-256KW", OooO00o + "$Wrap256");
            r8.addAlgorithm("Alg.Alias.Cipher." + AbstractC6781lli.Oooo0o0.m16387OooO0O0(), "DSTU7624-256KW");
            r8.addAlgorithm("Alg.Alias.Cipher.DSTU7624-256WRAP", "DSTU7624-256KW");
            r8.addAlgorithm("Cipher.DSTU7624-512KW", OooO00o + "$Wrap512");
            r8.addAlgorithm("Alg.Alias.Cipher." + AbstractC6781lli.Oooo0o.m16387OooO0O0(), "DSTU7624-512KW");
            r8.addAlgorithm("Alg.Alias.Cipher.DSTU7624-512WRAP", "DSTU7624-512KW");
            r8.addAlgorithm("Mac.DSTU7624GMAC", OooO00o + "$GMAC");
            r8.addAlgorithm("Mac.DSTU7624-128GMAC", OooO00o + "$GMAC128");
            r8.addAlgorithm("Alg.Alias.Mac." + AbstractC6781lli.OooOoo0.m16387OooO0O0(), "DSTU7624-128GMAC");
            r8.addAlgorithm("Mac.DSTU7624-256GMAC", OooO00o + "$GMAC256");
            r8.addAlgorithm("Alg.Alias.Mac." + AbstractC6781lli.OooOoo.m16387OooO0O0(), "DSTU7624-256GMAC");
            r8.addAlgorithm("Mac.DSTU7624-512GMAC", OooO00o + "$GMAC512");
            r8.addAlgorithm("Alg.Alias.Mac." + AbstractC6781lli.OooOooO.m16387OooO0O0(), "DSTU7624-512GMAC");
            r8.addAlgorithm("KeyGenerator.DSTU7624", OooO00o + "$KeyGen");
            LlLI1 llLI125 = AbstractC6781lli.Oooo0OO;
            r8.addAlgorithm("KeyGenerator", llLI125, OooO00o + "$KeyGen128");
            LlLI1 llLI126 = AbstractC6781lli.Oooo0o0;
            r8.addAlgorithm("KeyGenerator", llLI126, OooO00o + "$KeyGen256");
            LlLI1 llLI127 = AbstractC6781lli.Oooo0o;
            r8.addAlgorithm("KeyGenerator", llLI127, OooO00o + "$KeyGen512");
            LlLI1 llLI128 = AbstractC6781lli.OooOO0;
            r8.addAlgorithm("KeyGenerator", llLI128, OooO00o + "$KeyGen128");
            LlLI1 llLI129 = AbstractC6781lli.OooOO0O;
            r8.addAlgorithm("KeyGenerator", llLI129, OooO00o + "$KeyGen256");
            LlLI1 llLI130 = AbstractC6781lli.OooOO0o;
            r8.addAlgorithm("KeyGenerator", llLI130, OooO00o + "$KeyGen512");
            LlLI1 llLI131 = AbstractC6781lli.OooOo0O;
            r8.addAlgorithm("KeyGenerator", llLI131, OooO00o + "$KeyGen128");
            LlLI1 llLI132 = AbstractC6781lli.OooOo0o;
            r8.addAlgorithm("KeyGenerator", llLI132, OooO00o + "$KeyGen256");
            LlLI1 llLI133 = AbstractC6781lli.OooOo;
            r8.addAlgorithm("KeyGenerator", llLI133, OooO00o + "$KeyGen512");
            LlLI1 llLI134 = AbstractC6781lli.OooOoO0;
            r8.addAlgorithm("KeyGenerator", llLI134, OooO00o + "$KeyGen128");
            LlLI1 llLI135 = AbstractC6781lli.OooOoO;
            r8.addAlgorithm("KeyGenerator", llLI135, OooO00o + "$KeyGen256");
            LlLI1 llLI136 = AbstractC6781lli.OooOoOO;
            r8.addAlgorithm("KeyGenerator", llLI136, OooO00o + "$KeyGen512");
            LlLI1 llLI137 = AbstractC6781lli.OooOOOo;
            r8.addAlgorithm("KeyGenerator", llLI137, OooO00o + "$KeyGen128");
            LlLI1 llLI138 = AbstractC6781lli.OooOOo0;
            r8.addAlgorithm("KeyGenerator", llLI138, OooO00o + "$KeyGen256");
            LlLI1 llLI139 = AbstractC6781lli.OooOOo;
            r8.addAlgorithm("KeyGenerator", llLI139, OooO00o + "$KeyGen512");
            LlLI1 llLI140 = AbstractC6781lli.OooOOO0;
            r8.addAlgorithm("KeyGenerator", llLI140, OooO00o + "$KeyGen128");
            LlLI1 llLI141 = AbstractC6781lli.OooOOO;
            r8.addAlgorithm("KeyGenerator", llLI141, OooO00o + "$KeyGen256");
            LlLI1 llLI142 = AbstractC6781lli.OooOOOO;
            r8.addAlgorithm("KeyGenerator", llLI142, OooO00o + "$KeyGen512");
            LlLI1 llLI143 = AbstractC6781lli.OooOooo;
            r8.addAlgorithm("KeyGenerator", llLI143, OooO00o + "$KeyGen128");
            LlLI1 llLI144 = AbstractC6781lli.Oooo000;
            r8.addAlgorithm("KeyGenerator", llLI144, OooO00o + "$KeyGen256");
            LlLI1 llLI145 = AbstractC6781lli.Oooo00O;
            r8.addAlgorithm("KeyGenerator", llLI145, OooO00o + "$KeyGen512");
            LlLI1 llLI146 = AbstractC6781lli.OooOoo0;
            r8.addAlgorithm("KeyGenerator", llLI146, OooO00o + "$KeyGen128");
            LlLI1 llLI147 = AbstractC6781lli.OooOoo;
            r8.addAlgorithm("KeyGenerator", llLI147, OooO00o + "$KeyGen256");
            LlLI1 llLI148 = AbstractC6781lli.OooOooO;
            r8.addAlgorithm("KeyGenerator", llLI148, OooO00o + "$KeyGen512");
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0OO  reason: case insensitive filesystem */
    public static class C9789Oooo0OO extends BaseBlockCipher {
        public C9789Oooo0OO() {
            super(new C6744ll1L(new IlLilI(new I1iIii(128), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0o  reason: case insensitive filesystem */
    public static class C9790Oooo0o extends BaseBlockCipher {
        public C9790Oooo0o() {
            super(new C6744ll1L(new IlLilI(new I1iIii(512), 512)), 512);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0o0  reason: case insensitive filesystem */
    public static class C9791Oooo0o0 extends BaseBlockCipher {
        public C9791Oooo0o0() {
            super(new C6744ll1L(new IlLilI(new I1iIii(256), 256)), 256);
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0oO  reason: case insensitive filesystem */
    public static class C9792Oooo0oO extends Lll1IlI {
        public C9792Oooo0oO() {
            super(new C9541Ll(128));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$Oooo0oo  reason: case insensitive filesystem */
    public static class C9793Oooo0oo extends Lll1IlI {
        public C9793Oooo0oo() {
            super(new C9541Ll(256));
        }
    }

    /* renamed from: com.pd.sdk.丨丨IlL$OoooO00  reason: case insensitive filesystem */
    public static class C9794OoooO00 extends Lll1IlI {
        public C9794OoooO00() {
            super(new C9541Ll(128));
        }
    }
}
