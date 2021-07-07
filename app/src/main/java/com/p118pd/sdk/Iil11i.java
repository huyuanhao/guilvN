package com.p118pd.sdk;

import com.qiyukf.basesdk.sdk.ResponseCode;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.I丨il11i  reason: invalid class name */
public final class Iil11i {

    /* renamed from: com.pd.sdk.I丨il11i$OooO */
    public static class OooO extends C5788LlL1i {
        public OooO() {
            super("PBEwithMD2andRC2", AbstractC5711LiLli.OoooO0O, true, 0, 5, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public RC2ParameterSpec OooO00o = null;

        public AlgorithmParameters engineGenerateParameters() {
            if (this.OooO00o == null) {
                byte[] bArr = new byte[8];
                if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                    ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
                }
                ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
                try {
                    AlgorithmParameters OooO00o2 = OooO00o("RC2");
                    OooO00o2.init(new IvParameterSpec(bArr));
                    return OooO00o2;
                } catch (Exception e) {
                    throw new RuntimeException(e.getMessage());
                }
            } else {
                try {
                    AlgorithmParameters OooO00o3 = OooO00o("RC2");
                    OooO00o3.init(this.OooO00o);
                    return OooO00o3;
                } catch (Exception e2) {
                    throw new RuntimeException(e2.getMessage());
                }
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                this.OooO00o = (RC2ParameterSpec) algorithmParameterSpec;
                return;
            }
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0O0 */
    public static class OooO0O0 extends lI11lI {
        public static final short[] OooO00o = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, C6728ll11.OooOoo, 140, 8, 21, C6728ll11.OooOoO0, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, C6728ll11.OooOoo0, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, C6728ll11.OooOoOO, 178, 145, 89, 13, 71, 32, ResponseCode.RES_SUCCESS, 79, 88, 224, 1, 226, 22, 56, 196, C6728ll11.OooOoO, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, C6728ll11.OooOooO, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
        public static final short[] OooO0O0 = {93, 190, 155, 139, 17, 153, C6728ll11.OooOoO0, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, C6728ll11.OooOooO, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, C6728ll11.OooOoo, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, C6728ll11.OooOoO, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, C6728ll11.OooOoo0, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, ResponseCode.RES_SUCCESS, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, C6728ll11.OooOoOO, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};

        /* renamed from: OooO00o  reason: collision with other field name */
        public int f16057OooO00o = 58;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16058OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            int i;
            if ((cls == RC2ParameterSpec.class || cls == AlgorithmParameterSpec.class) && (i = this.f16057OooO00o) != -1) {
                return i < 256 ? new RC2ParameterSpec(OooO0O0[this.f16057OooO00o], this.f16058OooO00o) : new RC2ParameterSpec(this.f16057OooO00o, this.f16058OooO00o);
            }
            if (cls == IvParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return new IvParameterSpec(this.f16058OooO00o);
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to RC2 parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            return C9586iIILl.m21630OooO00o(this.f16058OooO00o);
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) throws IOException {
            if (OooO00o(str)) {
                int i = this.f16057OooO00o;
                return i == -1 ? new C6721liiLIL(engineGetEncoded()).getEncoded() : new C6721liiLIL(i, engineGetEncoded()).getEncoded();
            } else if (str.equals("RAW")) {
                return engineGetEncoded();
            } else {
                return null;
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.f16058OooO00o = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
                if (effectiveKeyBits != -1) {
                    short s = effectiveKeyBits;
                    if (effectiveKeyBits < 256) {
                        s = OooO00o[effectiveKeyBits];
                    }
                    this.f16057OooO00o = s == 1 ? 1 : 0;
                }
                this.f16058OooO00o = rC2ParameterSpec.getIV();
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec or RC2ParameterSpec required to initialise a RC2 parameters algorithm parameters object");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f16058OooO00o = C9586iIILl.m21630OooO00o(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                C6721liiLIL OooO00o2 = C6721liiLIL.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
                if (OooO00o2.OooO00o() != null) {
                    this.f16057OooO00o = OooO00o2.OooO00o().intValue();
                }
                this.f16058OooO00o = OooO00o2.m17818OooO00o();
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw new IOException("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "RC2 Parameters";
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0OO */
    public static class OooO0OO extends BaseBlockCipher {
        public OooO0OO() {
            super(new C6927lll1(new C5591L1l()), 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0Oo  reason: case insensitive filesystem */
    public static class C5540OooO0Oo extends C9680lII1i {
        public C5540OooO0Oo() {
            super(new C6170iLLL(new C5591L1l()));
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0o */
    public static class OooO0o extends BaseBlockCipher {
        public OooO0o() {
            super(new C5591L1l());
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0o0  reason: case insensitive filesystem */
    public static class C5541OooO0o0 extends C9680lII1i {
        public C5541OooO0o0() {
            super(new C9657l1I1(new C5591L1l()));
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0oO  reason: case insensitive filesystem */
    public static class C5542OooO0oO extends C5597L11llL {
        public C5542OooO0oO() {
            super("RC2", 128, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooO0oo  reason: case insensitive filesystem */
    public static class C5543OooO0oo extends II1ii1 {
        public static final String OooO00o = Iil11i.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r9) {
            r9.addAlgorithm("AlgorithmParameterGenerator.RC2", OooO00o + "$AlgParamGen");
            r9.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", OooO00o + "$AlgParamGen");
            r9.addAlgorithm("KeyGenerator.RC2", OooO00o + "$KeyGenerator");
            r9.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", OooO00o + "$KeyGenerator");
            r9.addAlgorithm("AlgorithmParameters.RC2", OooO00o + "$AlgParams");
            r9.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", OooO00o + "$AlgParams");
            r9.addAlgorithm("Cipher.RC2", OooO00o + "$ECB");
            r9.addAlgorithm("Cipher.RC2WRAP", OooO00o + "$Wrap");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000oo0, "RC2WRAP");
            LlLI1 llLI1 = AbstractC5711LiLli.Ooooo00;
            r9.addAlgorithm("Cipher", llLI1, OooO00o + "$CBC");
            r9.addAlgorithm("Mac.RC2MAC", OooO00o + "$CBCMAC");
            r9.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
            r9.addAlgorithm("Mac.RC2MAC/CFB8", OooO00o + "$CFB8MAC");
            r9.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDRC2-CBC", "PBEWITHMD2ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5711LiLli.OoooO0O, "PBEWITHMD2ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5711LiLli.OoooOO0, "PBEWITHMD5ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory", AbstractC5711LiLli.OoooOOO, "PBEWITHSHA1ANDRC2");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.5", "PBEWITHSHAAND128BITRC2-CBC");
            r9.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.6", "PBEWITHSHAAND40BITRC2-CBC");
            r9.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDRC2", OooO00o + "$PBEWithMD2KeyFactory");
            r9.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDRC2", OooO00o + "$PBEWithMD5KeyFactory");
            r9.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDRC2", OooO00o + "$PBEWithSHA1KeyFactory");
            r9.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND128BITRC2-CBC", OooO00o + "$PBEWithSHAAnd128BitKeyFactory");
            r9.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND40BITRC2-CBC", OooO00o + "$PBEWithSHAAnd40BitKeyFactory");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.OoooO0O, "PBEWITHMD2ANDRC2");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.OoooOO0, "PBEWITHMD5ANDRC2");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.OoooOOO, "PBEWITHSHA1ANDRC2");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.5", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.6", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWithSHAAnd3KeyTripleDES", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0oO, "PBEWITHSHAAND128BITRC2-CBC");
            r9.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0oo, "PBEWITHSHAAND40BITRC2-CBC");
            r9.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND128BITRC2-CBC", "PBEWITHSHAAND128BITRC2-CBC");
            r9.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND40BITRC2-CBC", "PBEWITHSHAAND40BITRC2-CBC");
            r9.addAlgorithm("Cipher.PBEWITHSHA1ANDRC2", OooO00o + "$PBEWithSHA1AndRC2");
            r9.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            r9.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDRC2-CBC", "PBEWITHSHA1ANDRC2");
            r9.addAlgorithm("Cipher.PBEWITHSHAAND128BITRC2-CBC", OooO00o + "$PBEWithSHAAnd128BitRC2");
            r9.addAlgorithm("Cipher.PBEWITHSHAAND40BITRC2-CBC", OooO00o + "$PBEWithSHAAnd40BitRC2");
            r9.addAlgorithm("Cipher.PBEWITHMD5ANDRC2", OooO00o + "$PBEWithMD5AndRC2");
            r9.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDRC2-CBC", "PBEWITHMD5ANDRC2");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDRC2", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHA1ANDRC2-CBC", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND40BITRC2-CBC", "PKCS12PBE");
            r9.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITRC2-CBC", "PKCS12PBE");
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOO0 */
    public static class OooOO0 extends BaseBlockCipher {
        public OooOO0() {
            super(new C6927lll1(new C5591L1l()), 0, 0, 64, 8);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOO0O */
    public static class OooOO0O extends C5788LlL1i {
        public OooOO0O() {
            super("PBEwithMD5andRC2", AbstractC5711LiLli.OoooOO0, true, 0, 0, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOO0o  reason: case insensitive filesystem */
    public static class C5544OooOO0o extends BaseBlockCipher {
        public C5544OooOO0o() {
            super(new C6927lll1(new C5591L1l()), 0, 1, 64, 8);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOO */
    public static class OooOOO extends C5788LlL1i {
        public OooOOO() {
            super("PBEwithSHAand128BitRC2-CBC", AbstractC5711LiLli.o000o0oO, true, 2, 1, 128, 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOO0 */
    public static class OooOOO0 extends C5788LlL1i {
        public OooOOO0() {
            super("PBEwithSHA1andRC2", AbstractC5711LiLli.OoooOOO, true, 0, 1, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new C6927lll1(new C5591L1l()), 2, 1, 128, 8);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOOo  reason: case insensitive filesystem */
    public static class C5545OooOOOo extends C5788LlL1i {
        public C5545OooOOOo() {
            super("PBEwithSHAand40BitRC2-CBC", AbstractC5711LiLli.o000o0oo, true, 2, 1, 40, 64);
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOo  reason: case insensitive filesystem */
    public static class C5546OooOOo extends Lll1IlI {
        public C5546OooOOo() {
            super(new C5565I1I());
        }
    }

    /* renamed from: com.pd.sdk.I丨il11i$OooOOo0  reason: case insensitive filesystem */
    public static class C5547OooOOo0 extends BaseBlockCipher {
        public C5547OooOOo0() {
            super(new C6927lll1(new C5591L1l()), 2, 1, 40, 8);
        }
    }
}
