package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC6840lI;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;

/* renamed from: com.pd.sdk.llL1I11丨  reason: invalid class name */
public class llL1I11 {
    public static final Map OooO00o;

    /* renamed from: com.pd.sdk.llL1I11丨$OooO */
    public static class OooO extends OooO0O0 {
        public OooO() {
            super("PBKDF2", 5, 10);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO00o */
    public static class OooO00o extends lI11lI {
        public C5772LlIII OooO00o;

        @Override // com.p118pd.sdk.lI11lI
        public AlgorithmParameterSpec OooO00o(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.OooO00o.m16367OooO00o(), this.OooO00o.m16365OooO00o().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.OooO00o.OooO00o(AbstractC5533IiL.OooO00o);
            } catch (IOException e) {
                throw new RuntimeException("Oooops! " + e.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (OooO00o(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                this.OooO00o = new C5772LlIII(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return;
            }
            throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.OooO00o = C5772LlIII.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (OooO00o(str)) {
                engineInit(bArr);
                return;
            }
            throw new IOException("Unknown parameters format in PBKDF2 parameters object");
        }

        public String engineToString() {
            return "PBKDF2 Parameters";
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0O0 */
    public static class OooO0O0 extends C6338illll {
        public int o00oO0O;
        public int o0ooOO0;

        public OooO0O0(String str, int i) {
            this(str, i, 1);
        }

        public OooO0O0(String str, int i, int i2) {
            super(str, AbstractC5711LiLli.OoooOo0);
            this.o00oO0O = i;
            this.o0ooOO0 = i2;
        }

        private int OooO00o(LlLI1 llLI1) throws InvalidKeySpecException {
            Integer num = (Integer) llL1I11.OooO00o.get(llLI1);
            if (num != null) {
                return num.intValue();
            }
            throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm " + llLI1);
        }

        @Override // javax.crypto.SecretKeyFactorySpi, com.p118pd.sdk.C6338illll
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof PBEKeySpec) {
                PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
                if (pBEKeySpec.getSalt() == null) {
                    return new PBKDF2Key(pBEKeySpec.getPassword(), this.o00oO0O == 1 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
                } else if (pBEKeySpec.getIterationCount() <= 0) {
                    throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
                } else if (pBEKeySpec.getKeyLength() <= 0) {
                    throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
                } else if (pBEKeySpec.getPassword().length == 0) {
                    throw new IllegalArgumentException("password empty");
                } else if (pBEKeySpec instanceof C6143iIlIii) {
                    int OooO00o = OooO00o(((C6143iIlIii) pBEKeySpec).OooO00o().OooO00o());
                    int keyLength = pBEKeySpec.getKeyLength();
                    return new BCPBEKey(this.o0ooOOo, this.o00OoOOo, this.o00oO0O, OooO00o, keyLength, -1, pBEKeySpec, AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, OooO00o, keyLength));
                } else {
                    int i = this.o0ooOO0;
                    int keyLength2 = pBEKeySpec.getKeyLength();
                    return new BCPBEKey(this.o0ooOOo, this.o00OoOOo, this.o00oO0O, i, keyLength2, -1, pBEKeySpec, AbstractC6840lI.OooO00o.OooO00o(pBEKeySpec, this.o00oO0O, i, keyLength2));
                }
            } else {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0OO */
    public static class OooO0OO extends II1ii1 {
        public static final String OooO00o = llL1I11.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("AlgorithmParameters.PBKDF2", OooO00o + "$AlgParams");
            r4.addAlgorithm("Alg.Alias.AlgorithmParameters." + AbstractC5711LiLli.OoooOo0, "PBKDF2");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2", OooO00o + "$PBKDF2withUTF8");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory." + AbstractC5711LiLli.OoooOo0, "PBKDF2");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHASCII", OooO00o + "$PBKDF2with8BIT");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
            r4.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA224", OooO00o + "$PBKDF2withSHA224");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA256", OooO00o + "$PBKDF2withSHA256");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA384", OooO00o + "$PBKDF2withSHA384");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA512", OooO00o + "$PBKDF2withSHA512");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-224", OooO00o + "$PBKDF2withSHA3_224");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", OooO00o + "$PBKDF2withSHA3_256");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-384", OooO00o + "$PBKDF2withSHA3_384");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", OooO00o + "$PBKDF2withSHA3_512");
            r4.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACGOST3411", OooO00o + "$PBKDF2withGOST3411");
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0Oo  reason: case insensitive filesystem */
    public static class C6764OooO0Oo extends OooO0O0 {
        public C6764OooO0Oo() {
            super("PBKDF2", 1);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0o */
    public static class OooO0o extends OooO0O0 {
        public OooO0o() {
            super("PBKDF2", 5, 7);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0o0  reason: case insensitive filesystem */
    public static class C6765OooO0o0 extends OooO0O0 {
        public C6765OooO0o0() {
            super("PBKDF2", 5, 6);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0oO  reason: case insensitive filesystem */
    public static class C6766OooO0oO extends OooO0O0 {
        public C6766OooO0oO() {
            super("PBKDF2", 5, 4);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooO0oo  reason: case insensitive filesystem */
    public static class C6767OooO0oo extends OooO0O0 {
        public C6767OooO0oo() {
            super("PBKDF2", 5, 8);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooOO0 */
    public static class OooOO0 extends OooO0O0 {
        public OooOO0() {
            super("PBKDF2", 5, 11);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooOO0O */
    public static class OooOO0O extends OooO0O0 {
        public OooOO0O() {
            super("PBKDF2", 5, 12);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooOO0o  reason: case insensitive filesystem */
    public static class C6768OooOO0o extends OooO0O0 {
        public C6768OooOO0o() {
            super("PBKDF2", 5, 13);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooOOO */
    public static class OooOOO extends OooO0O0 {
        public OooOOO() {
            super("PBKDF2", 5);
        }
    }

    /* renamed from: com.pd.sdk.llL1I11丨$OooOOO0 */
    public static class OooOOO0 extends OooO0O0 {
        public OooOOO0() {
            super("PBKDF2", 5, 9);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5331ILi.OooO0OO, I11I.OooO00o(6));
        OooO00o.put(AbstractC5711LiLli.Oooooo, I11I.OooO00o(1));
        OooO00o.put(AbstractC5711LiLli.Ooooooo, I11I.OooO00o(4));
        OooO00o.put(AbstractC5711LiLli.OoooooO, I11I.OooO00o(7));
        OooO00o.put(AbstractC5711LiLli.o0OoOo0, I11I.OooO00o(8));
        OooO00o.put(AbstractC5711LiLli.ooOO, I11I.OooO00o(9));
        OooO00o.put(AbstractC5905LllI.OooOOOo, I11I.OooO00o(11));
        OooO00o.put(AbstractC5905LllI.OooOOOO, I11I.OooO00o(10));
        OooO00o.put(AbstractC5905LllI.OooOOo0, I11I.OooO00o(12));
        OooO00o.put(AbstractC5905LllI.OooOOo, I11I.OooO00o(13));
    }
}
