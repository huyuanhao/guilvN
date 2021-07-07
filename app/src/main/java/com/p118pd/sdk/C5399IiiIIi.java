package com.p118pd.sdk;

import com.p118pd.sdk.C5369IiiiL1;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.Ii丨iIIi  reason: invalid class name and case insensitive filesystem */
public final class C5399IiiIIi {

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO */
    public static class OooO extends C6338illll {
        public OooO() {
            super("DESede", null);
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESedeKeySpec ? new SecretKeySpec(((DESedeKeySpec) keySpec).getKey(), "DESede") : super.engineGenerateSecret(keySpec);
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public KeySpec engineGetKeySpec(SecretKey secretKey, Class cls) throws InvalidKeySpecException {
            if (cls == null) {
                throw new InvalidKeySpecException("keySpec parameter is null");
            } else if (secretKey == null) {
                throw new InvalidKeySpecException("key parameter is null");
            } else if (SecretKeySpec.class.isAssignableFrom(cls)) {
                return new SecretKeySpec(secretKey.getEncoded(), this.o0ooOOo);
            } else {
                if (DESedeKeySpec.class.isAssignableFrom(cls)) {
                    byte[] encoded = secretKey.getEncoded();
                    try {
                        if (encoded.length != 16) {
                            return new DESedeKeySpec(encoded);
                        }
                        byte[] bArr = new byte[24];
                        System.arraycopy(encoded, 0, bArr, 0, 16);
                        System.arraycopy(encoded, 0, bArr, 16, 8);
                        return new DESedeKeySpec(bArr);
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                } else {
                    throw new InvalidKeySpecException("Invalid KeySpec");
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO00o */
    public static class OooO00o extends AbstractC6384iLll1 {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[8];
            if (((AbstractC6384iLll1) this).f18184OooO00o == null) {
                ((AbstractC6384iLll1) this).f18184OooO00o = IIllii.OooO00o();
            }
            ((AbstractC6384iLll1) this).f18184OooO00o.nextBytes(bArr);
            try {
                AlgorithmParameters OooO00o = OooO00o("DES");
                OooO00o.init(new IvParameterSpec(bArr));
                return OooO00o;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        @Override // java.security.AlgorithmParameterGeneratorSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6927lll1(new C1LliI()), 64);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new C6170iLLL(new C1LliI()));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0Oo  reason: case insensitive filesystem */
    public static class C5400OooO0Oo extends C9680lII1i {
        public C5400OooO0Oo() {
            super(new lLlLIi(new C1LliI()));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C6170iLLL(new C1LliI(), 64, new C5415Iii1()));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0o0  reason: case insensitive filesystem */
    public static class C5401OooO0o0 extends C9680lII1i {
        public C5401OooO0o0() {
            super(new C6170iLLL(new C1LliI(), 64));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0oO  reason: case insensitive filesystem */
    public static class C5402OooO0oO extends C9680lII1i {
        public C5402OooO0oO() {
            super(new C9657l1I1(new C1LliI()));
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooO0oo  reason: case insensitive filesystem */
    public static class C5403OooO0oo extends BaseBlockCipher {
        public C5403OooO0oo() {
            super(new C1LliI());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOO0 */
    public static class OooOO0 extends C5597L11llL {
        public OooOO0() {
            super("DESede3", 192, new I1IiLL());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOO0O */
    public static class OooOO0O extends C5597L11llL {
        public boolean OooO0O0 = false;

        public OooOO0O() {
            super("DESede", 192, new I1IiLL());
        }

        @Override // com.p118pd.sdk.C5597L11llL
        public SecretKey engineGenerateKey() {
            if (((C5597L11llL) this).f16236OooO00o) {
                ((C5597L11llL) this).f16234OooO00o.OooO00o(new C6470l1i(IIllii.OooO00o(), super.OooO0O0));
                ((C5597L11llL) this).f16236OooO00o = false;
            }
            if (this.OooO0O0) {
                return new SecretKeySpec(((C5597L11llL) this).f16234OooO00o.OooO00o(), ((C5597L11llL) this).f16235OooO00o);
            }
            byte[] OooO00o = ((C5597L11llL) this).f16234OooO00o.OooO00o();
            System.arraycopy(OooO00o, 0, OooO00o, 16, 8);
            return new SecretKeySpec(OooO00o, ((C5597L11llL) this).f16235OooO00o);
        }

        @Override // javax.crypto.KeyGeneratorSpi, com.p118pd.sdk.C5597L11llL
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
            this.OooO0O0 = true;
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOO0o  reason: case insensitive filesystem */
    public static class C5404OooOO0o extends II1ii1 {
        public static final String OooO00o = C5399IiiIIi.class.getName();
        public static final String OooO0O0 = "org.bouncycastle.jcajce.provider.symmetric";

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r8) {
            r8.addAlgorithm("Cipher.DESEDE", OooO00o + "$ECB");
            r8.addAlgorithm("Cipher", AbstractC5711LiLli.OoooOoo, OooO00o + "$CBC");
            r8.addAlgorithm("Cipher.DESEDEWRAP", OooO00o + "$Wrap");
            r8.addAlgorithm("Cipher", AbstractC5711LiLli.o000oo00, OooO00o + "$Wrap");
            r8.addAlgorithm("Cipher.DESEDERFC3211WRAP", OooO00o + "$RFC3211");
            r8.addAlgorithm("Alg.Alias.Cipher.DESEDERFC3217WRAP", "DESEDEWRAP");
            r8.addAlgorithm("Alg.Alias.Cipher.TDEA", "DESEDE");
            r8.addAlgorithm("Alg.Alias.Cipher.TDEAWRAP", "DESEDEWRAP");
            r8.addAlgorithm("Alg.Alias.KeyGenerator.TDEA", "DESEDE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.TDEA", "DESEDE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.TDEA", "DESEDE");
            r8.addAlgorithm("Alg.Alias.SecretKeyFactory.TDEA", "DESEDE");
            if (r8.hasAlgorithm("MessageDigest", LL1i.OooO0O0)) {
                r8.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", OooO00o + "$PBEWithSHAAndDES3Key");
                r8.addAlgorithm("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", OooO00o + "$BrokePBEWithSHAAndDES3Key");
                r8.addAlgorithm("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", OooO00o + "$OldPBEWithSHAAndDES3Key");
                r8.addAlgorithm("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", OooO00o + "$PBEWithSHAAndDES2Key");
                r8.addAlgorithm("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", OooO00o + "$BrokePBEWithSHAAndDES2Key");
                r8.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0o0, "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000o0o, "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHAAND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYDESEDE-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
                r8.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            }
            r8.addAlgorithm("KeyGenerator.DESEDE", OooO00o + "$KeyGenerator");
            r8.addAlgorithm("KeyGenerator." + AbstractC5711LiLli.OoooOoo, OooO00o + "$KeyGenerator3");
            r8.addAlgorithm("KeyGenerator.DESEDEWRAP", OooO00o + "$KeyGenerator");
            r8.addAlgorithm("SecretKeyFactory.DESEDE", OooO00o + "$KeyFactory");
            r8.addAlgorithm("SecretKeyFactory", AbstractC9733l.OooO0oo, OooO00o + "$KeyFactory");
            r8.addAlgorithm("Mac.DESEDECMAC", OooO00o + "$CMAC");
            r8.addAlgorithm("Mac.DESEDEMAC", OooO00o + "$CBCMAC");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
            r8.addAlgorithm("Mac.DESEDEMAC/CFB8", OooO00o + "$DESedeCFB8");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
            r8.addAlgorithm("Mac.DESEDEMAC64", OooO00o + "$DESede64");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
            r8.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", OooO00o + "$DESede64with7816d4");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            r8.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
            r8.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooOoo, "DESEDE");
            r8.addAlgorithm("AlgorithmParameterGenerator.DESEDE", OooO00o + "$AlgParamGen");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC5711LiLli.OoooOoo, "DESEDE");
            r8.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", OooO00o + "$PBEWithSHAAndDES3KeyFactory");
            r8.addAlgorithm("SecretKeyFactory.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", OooO00o + "$PBEWithSHAAndDES2KeyFactory");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES3KEY-CBC", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDDES2KEY-CBC", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.3", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            r8.addAlgorithm("Alg.Alias.SecretKeyFactory.1.2.840.113549.1.12.1.4", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            r8.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.3", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.AlgorithmParameters.1.2.840.113549.1.12.1.4", "PKCS12PBE");
            r8.addAlgorithm("Alg.Alias.Cipher.PBEWithSHAAnd3KeyTripleDES", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOO */
    public static class OooOOO extends C5369IiiiL1.OooOO0 {
        public OooOOO() {
            super("PBEwithSHAandDES2Key-CBC", AbstractC5711LiLli.o000o0o, true, 2, 1, 128, 64);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOO0 */
    public static class OooOOO0 extends BaseBlockCipher {
        public OooOOO0() {
            super(new C6927lll1(new C1LliI()), 2, 1, 128, 8);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new C6927lll1(new C1LliI()), 2, 1, 192, 8);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOOo  reason: case insensitive filesystem */
    public static class C5405OooOOOo extends C5369IiiiL1.OooOO0 {
        public C5405OooOOOo() {
            super("PBEwithSHAandDES3Key-CBC", AbstractC5711LiLli.o000o0o0, true, 2, 1, 192, 64);
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOo  reason: case insensitive filesystem */
    public static class C5406OooOOo extends Lll1IlI {
        public C5406OooOOo() {
            super(new C9705liLI());
        }
    }

    /* renamed from: com.pd.sdk.Ii丨iIIi$OooOOo0  reason: case insensitive filesystem */
    public static class C5407OooOOo0 extends Lll1IlI {
        public C5407OooOOo0() {
            super(new C5691LLliL(new C1LliI()), 8);
        }
    }
}
