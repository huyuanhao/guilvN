package com.p118pd.sdk;

import com.google.android.gms.stats.CodePackage;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.lL1L丨丨丨  reason: invalid class name and case insensitive filesystem */
public final class C6549lL1L {

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO */
    public static class OooO extends C6338illll {
        public OooO() {
            super("ARIA", null);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("ARIA");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for ARIA parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0O0 */
    public static class OooO0O0 extends L1llLI {
        @Override // com.p118pd.sdk.L1llLI
        public String engineToString() {
            return "ARIA IV";
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0OO */
    public static class OooO0OO extends lI11lI {
        public C1675IL OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || IILIll1.OooO00o(cls)) {
                return IILIll1.OooO00o() ? IILIll1.OooO00o(this.OooO00o.m15464OooO0O0()) : new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == C5363IiiI.class) {
                return new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.OooO00o.OooO00o());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.OooO00o.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return this.OooO00o.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (IILIll1.m15378OooO00o(algorithmParameterSpec)) {
                this.OooO00o = C1675IL.OooO00o(IILIll1.OooO00o(algorithmParameterSpec));
            } else if (algorithmParameterSpec instanceof C5363IiiI) {
                C5363IiiI iiiI = (C5363IiiI) algorithmParameterSpec;
                this.OooO00o = new C1675IL(iiiI.OooO0O0(), iiiI.OooO00o() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = C1675IL.OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                this.OooO00o = C1675IL.OooO00o(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return "CCM";
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6550OooO0Oo extends lI11lI {
        public IlLLII1I OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == AlgorithmParameterSpec.class || IILIll1.OooO00o(cls)) {
                return IILIll1.OooO00o() ? IILIll1.OooO00o(this.OooO00o.m15670OooO0O0()) : new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == C5363IiiI.class) {
                return new C5363IiiI(this.OooO00o.OooO00o(), this.OooO00o.OooO0O0() * 8);
            }
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.OooO00o.OooO00o());
            }
            throw new InvalidParameterSpecException("AlgorithmParameterSpec not recognized: " + cls.getName());
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() throws IOException {
            return this.OooO00o.getEncoded();
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                return this.OooO00o.getEncoded();
            }
            throw new IOException("unknown format specified");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (IILIll1.m15378OooO00o(algorithmParameterSpec)) {
                this.OooO00o = IILIll1.OooO00o(algorithmParameterSpec);
            } else if (algorithmParameterSpec instanceof C5363IiiI) {
                C5363IiiI iiiI = (C5363IiiI) algorithmParameterSpec;
                this.OooO00o = new IlLLII1I(iiiI.OooO0O0(), iiiI.OooO00o() / 8);
            } else {
                throw new InvalidParameterSpecException("AlgorithmParameterSpec class not recognized: " + algorithmParameterSpec.getClass().getName());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = IlLLII1I.OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                this.OooO00o = IlLLII1I.OooO00o(bArr);
                return;
            }
            throw new IOException("unknown format specified");
        }

        public String engineToString() {
            return CodePackage.GCM;
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C6744ll1L(new C9750I(new C9650iiILl(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0o0  reason: case insensitive filesystem */
    public static class C6551OooO0o0 extends BaseBlockCipher {
        public C6551OooO0o0() {
            super(new C6927lll1(new C9650iiILl()), 128);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0oO  reason: case insensitive filesystem */
    public static class C6552OooO0oO extends BaseBlockCipher {

        /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0oO$OooO00o */
        public class OooO00o implements iL1Il {
            @Override // com.p118pd.sdk.iL1Il
            public li1l11I1 OooO00o() {
                return new C9650iiILl();
            }
        }

        public C6552OooO0oO() {
            super(new OooO00o());
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooO0oo  reason: case insensitive filesystem */
    public static class C6553OooO0oo extends C9680lII1i {
        public C6553OooO0oo() {
            super(new C1IILlI(new iLIli1(new C9650iiILl())));
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOO0 */
    public static class OooOO0 extends OooOOO0 {
        public OooOO0() {
            super(128);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOO0O */
    public static class OooOO0O extends OooOOO0 {
        public OooOO0O() {
            super(192);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOO0o  reason: case insensitive filesystem */
    public static class C6554OooOO0o extends OooOOO0 {
        public C6554OooOO0o() {
            super(256);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOO */
    public static class OooOOO extends AbstractC5307ILiI {
        public static final String OooO00o = C6549lL1L.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r11) {
            r11.addAlgorithm("AlgorithmParameters.ARIA", OooO00o + "$AlgParams");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameters", AbstractC1680LI.OooO0oo, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameters", AbstractC1680LI.OooOOO0, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameters", AbstractC1680LI.OooOOo, "ARIA");
            r11.addAlgorithm("AlgorithmParameterGenerator.ARIA", OooO00o + "$AlgParamGen");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooO0oo, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOOO0, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOOo, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOO0, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOOOO, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOo00, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooO, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOOO, "ARIA");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator", AbstractC1680LI.OooOOoo, "ARIA");
            r11.addAlgorithm("Cipher.ARIA", OooO00o + "$ECB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooO0oO, OooO00o + "$ECB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOO0o, OooO00o + "$ECB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOo0, OooO00o + "$ECB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooO0oo, OooO00o + "$CBC");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOO0, OooO00o + "$CBC");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOo, OooO00o + "$CBC");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooO, OooO00o + "$CFB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOO, OooO00o + "$CFB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOoo, OooO00o + "$CFB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOO0, OooO00o + "$OFB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOOOO, OooO00o + "$OFB");
            r11.addAlgorithm("Cipher", AbstractC1680LI.OooOo00, OooO00o + "$OFB");
            r11.addAlgorithm("Cipher.ARIARFC3211WRAP", OooO00o + "$RFC3211Wrap");
            r11.addAlgorithm("Cipher.ARIAWRAP", OooO00o + "$Wrap");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo00o, "ARIAWRAP");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo0, "ARIAWRAP");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo0O0, "ARIAWRAP");
            r11.addAlgorithm("Alg.Alias.Cipher.ARIAKW", "ARIAWRAP");
            r11.addAlgorithm("Cipher.ARIAWRAPPAD", OooO00o + "$WrapPad");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo0OO, "ARIAWRAPPAD");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo0o0, "ARIAWRAPPAD");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo0o, "ARIAWRAPPAD");
            r11.addAlgorithm("Alg.Alias.Cipher.ARIAKWP", "ARIAWRAPPAD");
            r11.addAlgorithm("KeyGenerator.ARIA", OooO00o + "$KeyGen");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo00o, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo0, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo0O0, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo0OO, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo0o0, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo0o, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooO0oO, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOO0o, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOo0, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooO0oo, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOO0, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOo, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooO, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOO, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOoo, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOO0, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOOOO, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOo00, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOooo, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo000, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.Oooo00O, OooO00o + "$KeyGen256");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOoo0, OooO00o + "$KeyGen128");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOoo, OooO00o + "$KeyGen192");
            r11.addAlgorithm("KeyGenerator", AbstractC1680LI.OooOooO, OooO00o + "$KeyGen256");
            r11.addAlgorithm("SecretKeyFactory.ARIA", OooO00o + "$KeyFactory");
            r11.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC1680LI.OooO0oo, "ARIA");
            r11.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC1680LI.OooOOO0, "ARIA");
            r11.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC1680LI.OooOOo, "ARIA");
            r11.addAlgorithm("AlgorithmParameterGenerator.ARIACCM", OooO00o + "$AlgParamGenCCM");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.OooOooo, "CCM");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.Oooo000, "CCM");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.Oooo00O, "CCM");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.OooOooo, "CCM");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo000, "CCM");
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.Oooo00O, "CCM");
            r11.addAlgorithm("AlgorithmParameterGenerator.ARIAGCM", OooO00o + "$AlgParamGenGCM");
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.OooOoo0, CodePackage.GCM);
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.OooOoo, CodePackage.GCM);
            r11.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC1680LI.OooOooO, CodePackage.GCM);
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.OooOoo0, CodePackage.GCM);
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.OooOoo, CodePackage.GCM);
            r11.addAlgorithm("Alg.Alias.Cipher", AbstractC1680LI.OooOooO, CodePackage.GCM);
            OooO0O0(r11, "ARIA", OooO00o + "$GMAC", OooO00o + "$KeyGen");
            OooO0OO(r11, "ARIA", OooO00o + "$Poly1305", OooO00o + "$Poly1305KeyGen");
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOO0 */
    public static class OooOOO0 extends C5597L11llL {
        public OooOOO0() {
            this(256);
        }

        public OooOOO0(int i) {
            super("ARIA", i, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new C6744ll1L(new IlLilI(new C9650iiILl(), 128)), 128);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOOo  reason: case insensitive filesystem */
    public static class C6555OooOOOo extends C9680lII1i {
        public C6555OooOOOo() {
            super(new C6117iIl1(new C9650iiILl()));
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOo  reason: case insensitive filesystem */
    public static class C6556OooOOo extends Lll1IlI {
        public C6556OooOOo() {
            super(new C5691LLliL(new C9650iiILl()), 16);
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOo0  reason: case insensitive filesystem */
    public static class C6557OooOOo0 extends C5597L11llL {
        public C6557OooOOo0() {
            super("Poly1305-ARIA", 256, new C5576L11i());
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOOoo  reason: case insensitive filesystem */
    public static class C6558OooOOoo extends Lll1IlI {
        public C6558OooOOoo() {
            super(new C6264iiil());
        }
    }

    /* renamed from: com.pd.sdk.lL1L丨丨丨$OooOo00 */
    public static class OooOo00 extends Lll1IlI {
        public OooOo00() {
            super(new LLLi1L());
        }
    }
}
