package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

/* renamed from: com.pd.sdk.Iii丨iL丨1  reason: invalid class name and case insensitive filesystem */
public final class C5369IiiiL1 {

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO */
    public static class OooO extends C9680lII1i {
        public OooO() {
            super(new C9657l1I1(new C6293il1I()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO00o */
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

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0O0 */
    public static class OooO0O0 extends BaseBlockCipher {
        public OooO0O0() {
            super(new C6927lll1(new C6293il1I()), 64);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0OO */
    public static class OooO0OO extends C9680lII1i {
        public OooO0OO() {
            super(new C6170iLLL(new C6293il1I()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5370OooO0Oo extends C9680lII1i {
        public C5370OooO0Oo() {
            super(new lLlLIi(new C6293il1I()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0o */
    public static class OooO0o extends C9680lII1i {
        public OooO0o() {
            super(new C6170iLLL(new C6293il1I(), 64, new C5415Iii1()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0o0  reason: case insensitive filesystem */
    public static class C5371OooO0o0 extends C9680lII1i {
        public C5371OooO0o0() {
            super(new C6170iLLL(new C6293il1I(), 64));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0oO  reason: case insensitive filesystem */
    public static class C5372OooO0oO extends C9680lII1i {
        public C5372OooO0oO() {
            super(new C5352IiIl(new C6293il1I()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooO0oo  reason: case insensitive filesystem */
    public static class C5373OooO0oo extends C9680lII1i {
        public C5373OooO0oo() {
            super(new C5352IiIl(new C6293il1I(), new C5415Iii1()));
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOO0 */
    public static class OooOO0 extends C6338illll {
        public boolean OooO0O0;
        public int o00oO0O;
        public int o0ooOO0;
        public int o0ooOOo;
        public int o0ooOoO;

        public OooOO0(String str, LlLI1 llLI1, boolean z, int i, int i2, int i3, int i4) {
            super(str, llLI1);
            this.OooO0O0 = z;
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
            this.o0ooOOo = i3;
            this.o0ooOoO = i4;
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    int i = this.o00oO0O;
                    if (i != 0 && i != 4) {
                        return new BCPBEKey(super.o0ooOOo, this.o00OoOOo, i, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO, pBEKeySpec, null);
                    }
                    return new PBKDF1Key(pBEKeySpec.getPassword(), this.o00oO0O == 0 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
                }
                AbstractC6370iIIIl OooO00o = this.OooO0O0 ? AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO) : AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, this.o0ooOO0, this.o0ooOOo);
                C9841ill1Ii.OooO00o((OooO00o instanceof C6274iilL1L ? (C6642li1LI) ((C6274iilL1L) OooO00o).OooO00o() : (C6642li1LI) OooO00o).OooO00o());
                return new BCPBEKey(super.o0ooOOo, this.o00OoOOo, this.o00oO0O, this.o0ooOO0, this.o0ooOOo, this.o0ooOoO, pBEKeySpec, OooO00o);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOO0O */
    public static class OooOO0O extends BaseBlockCipher {
        public OooOO0O() {
            super(new C6293il1I());
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOO0o  reason: case insensitive filesystem */
    public static class C5374OooOO0o extends C6338illll {
        public C5374OooOO0o() {
            super("DES", null);
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            return keySpec instanceof DESKeySpec ? new SecretKeySpec(((DESKeySpec) keySpec).getKey(), "DES") : super.engineGenerateSecret(keySpec);
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
                if (DESKeySpec.class.isAssignableFrom(cls)) {
                    try {
                        return new DESKeySpec(secretKey.getEncoded());
                    } catch (Exception e) {
                        throw new InvalidKeySpecException(e.toString());
                    }
                } else {
                    throw new InvalidKeySpecException("Invalid KeySpec");
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOO */
    public static class OooOOO extends II1ii1 {
        public static final String OooO00o = C5369IiiiL1.class.getName();
        public static final String OooO0O0 = "org.bouncycastle.jcajce.provider.symmetric";

        private void OooO00o(l1I1L r3, LlLI1 llLI1, String str) {
            r3.addAlgorithm("Alg.Alias.KeyGenerator." + llLI1.m16387OooO0O0(), str);
            r3.addAlgorithm("Alg.Alias.KeyFactory." + llLI1.m16387OooO0O0(), str);
        }

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r7) {
            r7.addAlgorithm("Cipher.DES", OooO00o + "$ECB");
            LlLI1 llLI1 = AbstractC9733l.OooO0o0;
            r7.addAlgorithm("Cipher", llLI1, OooO00o + "$CBC");
            OooO00o(r7, AbstractC9733l.OooO0o0, "DES");
            r7.addAlgorithm("Cipher.DESRFC3211WRAP", OooO00o + "$RFC3211");
            r7.addAlgorithm("KeyGenerator.DES", OooO00o + "$KeyGenerator");
            r7.addAlgorithm("SecretKeyFactory.DES", OooO00o + "$KeyFactory");
            r7.addAlgorithm("Mac.DESCMAC", OooO00o + "$CMAC");
            r7.addAlgorithm("Mac.DESMAC", OooO00o + "$CBCMAC");
            r7.addAlgorithm("Alg.Alias.Mac.DES", "DESMAC");
            r7.addAlgorithm("Mac.DESMAC/CFB8", OooO00o + "$DESCFB8");
            r7.addAlgorithm("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
            r7.addAlgorithm("Mac.DESMAC64", OooO00o + "$DES64");
            r7.addAlgorithm("Alg.Alias.Mac.DES64", "DESMAC64");
            r7.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", OooO00o + "$DES64with7816d4");
            r7.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            r7.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            r7.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
            r7.addAlgorithm("Mac.DESWITHISO9797", OooO00o + "$DES9797Alg3");
            r7.addAlgorithm("Alg.Alias.Mac.DESISO9797MAC", "DESWITHISO9797");
            r7.addAlgorithm("Mac.ISO9797ALG3MAC", OooO00o + "$DES9797Alg3");
            r7.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3", "ISO9797ALG3MAC");
            r7.addAlgorithm("Mac.ISO9797ALG3WITHISO7816-4PADDING", OooO00o + "$DES9797Alg3with7816d4");
            r7.addAlgorithm("Alg.Alias.Mac.ISO9797ALG3MACWITHISO7816-4PADDING", "ISO9797ALG3WITHISO7816-4PADDING");
            r7.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
            r7.addAlgorithm("Alg.Alias.AlgorithmParameters", AbstractC9733l.OooO0o0, "DES");
            r7.addAlgorithm("AlgorithmParameterGenerator.DES", OooO00o + "$AlgParamGen");
            r7.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + AbstractC9733l.OooO0o0, "DES");
            r7.addAlgorithm("Cipher.PBEWITHMD2ANDDES", OooO00o + "$PBEWithMD2");
            r7.addAlgorithm("Cipher.PBEWITHMD5ANDDES", OooO00o + "$PBEWithMD5");
            r7.addAlgorithm("Cipher.PBEWITHSHA1ANDDES", OooO00o + "$PBEWithSHA1");
            r7.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.OoooO0, "PBEWITHMD2ANDDES");
            r7.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.OoooO, "PBEWITHMD5ANDDES");
            r7.addAlgorithm("Alg.Alias.Cipher", AbstractC5711LiLli.o000oOoO, "PBEWITHSHA1ANDDES");
            r7.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            r7.addAlgorithm("Alg.Alias.Cipher.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            r7.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            r7.addAlgorithm("SecretKeyFactory.PBEWITHMD2ANDDES", OooO00o + "$PBEWithMD2KeyFactory");
            r7.addAlgorithm("SecretKeyFactory.PBEWITHMD5ANDDES", OooO00o + "$PBEWithMD5KeyFactory");
            r7.addAlgorithm("SecretKeyFactory.PBEWITHSHA1ANDDES", OooO00o + "$PBEWithSHA1KeyFactory");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD2ANDDES-CBC", "PBEWITHMD2ANDDES");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHMD5ANDDES-CBC", "PBEWITHMD5ANDDES");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory.PBEWITHSHA1ANDDES-CBC", "PBEWITHSHA1ANDDES");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5711LiLli.OoooO0, "PBEWITHMD2ANDDES");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5711LiLli.OoooO, "PBEWITHMD5ANDDES");
            r7.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5711LiLli.o000oOoO, "PBEWITHSHA1ANDDES");
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOO0 */
    public static class OooOOO0 extends C5597L11llL {
        public OooOOO0() {
            super("DES", 64, new C6203iLIl1());
        }

        @Override // com.p118pd.sdk.C5597L11llL
        public SecretKey engineGenerateKey() {
            if (((C5597L11llL) this).f16236OooO00o) {
                ((C5597L11llL) this).f16234OooO00o.OooO00o(new C6470l1i(IIllii.OooO00o(), this.OooO0O0));
                ((C5597L11llL) this).f16236OooO00o = false;
            }
            return new SecretKeySpec(((C5597L11llL) this).f16234OooO00o.OooO00o(), ((C5597L11llL) this).f16235OooO00o);
        }

        @Override // javax.crypto.KeyGeneratorSpi, com.p118pd.sdk.C5597L11llL
        public void engineInit(int i, SecureRandom secureRandom) {
            super.engineInit(i, secureRandom);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOOO */
    public static class OooOOOO extends BaseBlockCipher {
        public OooOOOO() {
            super(new C6927lll1(new C6293il1I()), 0, 5, 64, 8);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOOo  reason: case insensitive filesystem */
    public static class C5375OooOOOo extends OooOO0 {
        public C5375OooOOOo() {
            super("PBEwithMD2andDES", AbstractC5711LiLli.OoooO0, true, 0, 5, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOo  reason: case insensitive filesystem */
    public static class C5376OooOOo extends OooOO0 {
        public C5376OooOOo() {
            super("PBEwithMD5andDES", AbstractC5711LiLli.OoooO, true, 0, 0, 64, 64);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOo0  reason: case insensitive filesystem */
    public static class C5377OooOOo0 extends BaseBlockCipher {
        public C5377OooOOo0() {
            super(new C6927lll1(new C6293il1I()), 0, 0, 64, 8);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOOoo  reason: case insensitive filesystem */
    public static class C5378OooOOoo extends BaseBlockCipher {
        public C5378OooOOoo() {
            super(new C6927lll1(new C6293il1I()), 0, 1, 64, 8);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOo0  reason: case insensitive filesystem */
    public static class C5379OooOo0 extends Lll1IlI {
        public C5379OooOo0() {
            super(new C5691LLliL(new C6293il1I()), 8);
        }
    }

    /* renamed from: com.pd.sdk.Iii丨iL丨1$OooOo00 */
    public static class OooOo00 extends OooOO0 {
        public OooOo00() {
            super("PBEwithSHA1andDES", AbstractC5711LiLli.o000oOoO, true, 0, 1, 64, 64);
        }
    }
}
