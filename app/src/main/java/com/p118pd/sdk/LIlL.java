package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9523Ll1LI;
import com.qiyukf.basesdk.sdk.ResponseCode;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.LIlL */
public class LIlL {
    public static final Illiiil OooO00o = C9702liIIL.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map f16345OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final short[] f16346OooO00o = {189, 86, 234, 242, 162, 241, 172, 42, 176, 147, 209, 156, 27, 51, 253, 208, 48, 4, 182, 220, 125, 223, 50, 75, 247, 203, 69, 155, 49, 187, 33, 90, 65, 159, 225, 217, 74, 77, 158, 218, 160, 104, 44, 195, 39, 95, 128, 54, 62, 238, 251, 149, 26, 254, 206, 168, 52, 169, 19, 240, 166, 63, 216, 12, 120, 36, 175, 35, 82, 193, 103, 23, 245, 102, 144, 231, 232, 7, 184, 96, 72, 230, 30, 83, 243, 146, 164, C6728ll11.OooOoo, 140, 8, 21, C6728ll11.OooOoO0, 134, 0, 132, 250, 244, 127, 138, 66, 25, 246, 219, 205, 20, 141, 80, 18, 186, 60, 6, 78, 236, 179, 53, 17, 161, 136, 142, 43, 148, 153, 183, C6728ll11.OooOoo0, 116, 211, 228, 191, 58, 222, 150, 14, 188, 10, 237, 119, 252, 55, 107, 3, 121, 137, 98, 198, 215, 192, 210, 124, 106, 139, 34, 163, 91, 5, 93, 2, 117, 213, 97, 227, 24, 143, 85, 81, 173, 31, 11, 94, 133, 229, 194, 87, 99, 202, 61, 108, 180, 197, 204, C6728ll11.OooOoOO, 178, 145, 89, 13, 71, 32, ResponseCode.RES_SUCCESS, 79, 88, 224, 1, 226, 22, 56, 196, C6728ll11.OooOoO, 59, 15, 101, 70, 190, 126, 45, 123, 130, 249, 64, 181, 29, C6728ll11.OooOooO, 248, 235, 38, 199, 135, 151, 37, 84, 177, 40, 170, 152, 157, 165, 100, 109, 122, 212, 16, 129, 68, 239, 73, 214, 174, 46, 221, 118, 92, 47, 167, 28, 201, 9, 105, 154, 131, 207, 41, 57, 185, 233, 76, 255, 67, 171};
    public static final Map OooO0O0 = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final short[] f16347OooO0O0 = {93, 190, 155, 139, 17, 153, C6728ll11.OooOoO0, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, C6728ll11.OooOooO, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, 165, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, C6728ll11.OooOoo, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, C6728ll11.OooOoO, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, 148, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, 135, 64, 140, 226, 203, 147, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, 164, 234, 66, 8, 218, 180, C6728ll11.OooOoo0, 176, 207, 18, 122, 78, 250, 108, 29, 132, 0, ResponseCode.RES_SUCCESS, 127, 145, 69, 170, 43, 194, 177, 143, 213, 186, 242, 173, 25, 178, 103, 54, 247, 15, 10, 146, 125, 227, 157, 233, 144, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, C6728ll11.OooOoOO, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
    public static final Map OooO0OO = new HashMap();
    public static final Map OooO0Oo = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6712liI f16348OooO00o;

    /* renamed from: com.pd.sdk.LIlL$OooO00o */
    public class OooO00o implements OooO0OO {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f16349OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f16350OooO00o;

        public OooO00o(C6456l1ilL r2, Key key) {
            this.f16349OooO00o = r2;
            this.f16350OooO00o = key;
        }

        @Override // com.p118pd.sdk.LIlL.OooO0OO
        public Object OooO00o() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
            Cipher OooO00o2 = LIlL.this.m16122OooO00o(this.f16349OooO00o.OooO00o());
            AbstractC6854lLi1LL OooO0O0 = this.f16349OooO00o.m17587OooO0O0();
            String OooO0O02 = this.f16349OooO00o.OooO00o().m16387OooO0O0();
            if (OooO0O0 != null && !(OooO0O0 instanceof AbstractC5335ILl)) {
                try {
                    AlgorithmParameters OooO00o3 = LIlL.this.m16119OooO00o(this.f16349OooO00o.OooO00o());
                    C5334IL1.OooO00o(OooO00o3, OooO0O0);
                    OooO00o2.init(2, this.f16350OooO00o, OooO00o3);
                } catch (NoSuchAlgorithmException e) {
                    if (OooO0O02.equals(L1lI1i.OooO00o.m16387OooO0O0()) || OooO0O02.equals(C1L1l.OooO00o) || OooO0O02.equals(C1L1l.OooO0OO) || OooO0O02.equals(C1L1l.OooO0o0) || OooO0O02.equals(C1L1l.OooO0o) || OooO0O02.equals(C1L1l.OooO0oO)) {
                        OooO00o2.init(2, this.f16350OooO00o, new IvParameterSpec(AbstractC6804llL1ii.OooO00o(OooO0O0).m17938OooO00o()));
                    } else {
                        throw e;
                    }
                }
            } else if (OooO0O02.equals(L1lI1i.OooO00o.m16387OooO0O0()) || OooO0O02.equals(C1L1l.OooO00o) || OooO0O02.equals(C1L1l.OooO0OO) || OooO0O02.equals(C1L1l.OooO0Oo)) {
                OooO00o2.init(2, this.f16350OooO00o, new IvParameterSpec(new byte[8]));
            } else {
                OooO00o2.init(2, this.f16350OooO00o);
            }
            return OooO00o2;
        }
    }

    /* renamed from: com.pd.sdk.LIlL$OooO0O0 */
    public class OooO0O0 implements OooO0OO {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6456l1ilL f16351OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Key f16352OooO00o;

        public OooO0O0(C6456l1ilL r2, Key key) {
            this.f16351OooO00o = r2;
            this.f16352OooO00o = key;
        }

        @Override // com.p118pd.sdk.LIlL.OooO0OO
        public Object OooO00o() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
            Mac OooO00o2 = LIlL.this.m16125OooO00o(this.f16351OooO00o.OooO00o());
            AbstractC6854lLi1LL OooO0O0 = this.f16351OooO00o.m17587OooO0O0();
            this.f16351OooO00o.OooO00o().m16387OooO0O0();
            if (OooO0O0 == null || (OooO0O0 instanceof AbstractC5335ILl)) {
                OooO00o2.init(this.f16352OooO00o);
            } else {
                try {
                    AlgorithmParameters OooO00o3 = LIlL.this.m16119OooO00o(this.f16351OooO00o.OooO00o());
                    C5334IL1.OooO00o(OooO00o3, OooO0O0);
                    OooO00o2.init(this.f16352OooO00o, OooO00o3.getParameterSpec(AlgorithmParameterSpec.class));
                } catch (NoSuchAlgorithmException e) {
                    throw e;
                }
            }
            return OooO00o2;
        }
    }

    /* renamed from: com.pd.sdk.LIlL$OooO0OO */
    public interface OooO0OO {
        Object OooO00o() throws CMSException, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
    }

    static {
        f16345OooO00o.put(L1lI1i.OooO00o, "DES");
        f16345OooO00o.put(L1lI1i.OooO0O0, "DESEDE");
        f16345OooO00o.put(L1lI1i.OooO0o, "AES");
        f16345OooO00o.put(L1lI1i.OooO0oO, "AES");
        f16345OooO00o.put(L1lI1i.OooO0oo, "AES");
        f16345OooO00o.put(L1lI1i.OooO0OO, "RC2");
        f16345OooO00o.put(L1lI1i.OooO0o0, "CAST5");
        f16345OooO00o.put(L1lI1i.OooOOo, "Camellia");
        f16345OooO00o.put(L1lI1i.OooOOoo, "Camellia");
        f16345OooO00o.put(L1lI1i.OooOo00, "Camellia");
        f16345OooO00o.put(L1lI1i.OooOo0O, "SEED");
        f16345OooO00o.put(AbstractC5711LiLli.Ooooo0o, "RC4");
        f16345OooO00o.put(AbstractC5331ILi.OooO0o, "GOST28147");
        OooO0O0.put(L1lI1i.OooO00o, "DES/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0OO, "RC2/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0O0, "DESEDE/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0o, "AES/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0oO, "AES/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooO0oo, "AES/CBC/PKCS5Padding");
        OooO0O0.put(AbstractC5711LiLli.OooOoO0, "RSA/ECB/PKCS1Padding");
        OooO0O0.put(L1lI1i.OooO0o0, "CAST5/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooOOo, "Camellia/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooOOoo, "Camellia/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooOo00, "Camellia/CBC/PKCS5Padding");
        OooO0O0.put(L1lI1i.OooOo0O, "SEED/CBC/PKCS5Padding");
        OooO0O0.put(AbstractC5711LiLli.Ooooo0o, "RC4");
        OooO0OO.put(L1lI1i.OooO0O0, "DESEDEMac");
        OooO0OO.put(L1lI1i.OooO0o, "AESMac");
        OooO0OO.put(L1lI1i.OooO0oO, "AESMac");
        OooO0OO.put(L1lI1i.OooO0oo, "AESMac");
        OooO0OO.put(L1lI1i.OooO0OO, "RC2Mac");
        OooO0Oo.put(AbstractC9523Ll1LI.OooO00o.OooO00o.OooO00o(), "PBKDF2WITHHMACSHA1");
        OooO0Oo.put(AbstractC9523Ll1LI.OooO00o.OooO0O0.OooO00o(), "PBKDF2WITHHMACSHA224");
        OooO0Oo.put(AbstractC9523Ll1LI.OooO00o.OooO0OO.OooO00o(), "PBKDF2WITHHMACSHA256");
        OooO0Oo.put(AbstractC9523Ll1LI.OooO00o.OooO0Oo.OooO00o(), "PBKDF2WITHHMACSHA384");
        OooO0Oo.put(AbstractC9523Ll1LI.OooO00o.OooO0o0.OooO00o(), "PBKDF2WITHHMACSHA512");
    }

    public LIlL(AbstractC6712liI r1) {
        this.f16348OooO00o = r1;
    }

    public static Object OooO00o(OooO0OO oooO0OO) throws CMSException {
        try {
            return oooO0OO.OooO00o();
        } catch (NoSuchAlgorithmException e) {
            throw new CMSException("can't find algorithm.", e);
        } catch (InvalidKeyException e2) {
            throw new CMSException("key invalid in message.", e2);
        } catch (NoSuchProviderException e3) {
            throw new CMSException("can't find provider.", e3);
        } catch (NoSuchPaddingException e4) {
            throw new CMSException("required padding not supported.", e4);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new CMSException("algorithm parameters invalid.", e5);
        } catch (InvalidParameterSpecException e6) {
            throw new CMSException("MAC algorithm parameter spec invalid.", e6);
        }
    }

    public I1l1I OooO00o(C6456l1ilL r2, PrivateKey privateKey, byte[] bArr, byte[] bArr2) {
        return this.f16348OooO00o.OooO00o(r2, privateKey, bArr, bArr2);
    }

    public Ll1L1i OooO00o(C6456l1ilL r2, SecretKey secretKey) {
        return this.f16348OooO00o.OooO00o(r2, secretKey);
    }

    public iLLl1I OooO00o(C6456l1ilL r2, PrivateKey privateKey) {
        return this.f16348OooO00o.OooO00o(r2, privateKey);
    }

    public C6456l1ilL OooO00o(LlLI1 llLI1, AlgorithmParameters algorithmParameters) throws CMSException {
        return new C6456l1ilL(llLI1, algorithmParameters != null ? C5334IL1.OooO00o(algorithmParameters) : C6452l1Lll.OooO00o);
    }

    public C6456l1ilL OooO00o(LlLI1 llLI1, AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            return new C6456l1ilL(llLI1, new C6487lIIiIlL(((IvParameterSpec) algorithmParameterSpec).getIV()));
        }
        if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            int effectiveKeyBits = rC2ParameterSpec.getEffectiveKeyBits();
            if (effectiveKeyBits == -1) {
                return new C6456l1ilL(llLI1, new C6721liiLIL(rC2ParameterSpec.getIV()));
            }
            short s = effectiveKeyBits;
            if (effectiveKeyBits < 256) {
                s = f16346OooO00o[effectiveKeyBits];
            }
            return new C6456l1ilL(llLI1, new C6721liiLIL(s == 1 ? 1 : 0, rC2ParameterSpec.getIV()));
        }
        throw new IllegalStateException("unknown parameter spec: " + algorithmParameterSpec);
    }

    public String OooO00o(LlLI1 llLI1) {
        String str = (String) f16345OooO00o.get(llLI1);
        return str == null ? llLI1.m16387OooO0O0() : str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameterGenerator m16118OooO00o(LlLI1 llLI1) throws GeneralSecurityException {
        String str = (String) f16345OooO00o.get(llLI1);
        if (str != null) {
            try {
                return this.f16348OooO00o.OooO00o(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.f16348OooO00o.OooO00o(llLI1.m16387OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AlgorithmParameters m16119OooO00o(LlLI1 llLI1) throws NoSuchAlgorithmException, NoSuchProviderException {
        String str = (String) f16345OooO00o.get(llLI1);
        if (str != null) {
            try {
                return this.f16348OooO00o.m17217OooO00o(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.f16348OooO00o.m17217OooO00o(llLI1.m16387OooO0O0());
    }

    public AlgorithmParameters OooO00o(LlLI1 llLI1, SecretKey secretKey, SecureRandom secureRandom) throws CMSException {
        try {
            AlgorithmParameterGenerator OooO00o2 = m16118OooO00o(llLI1);
            if (llLI1.equals(L1lI1i.OooO0OO)) {
                byte[] bArr = new byte[8];
                secureRandom.nextBytes(bArr);
                try {
                    OooO00o2.init(new RC2ParameterSpec(secretKey.getEncoded().length * 8, bArr), secureRandom);
                } catch (InvalidAlgorithmParameterException e) {
                    throw new CMSException("parameters generation error: " + e, e);
                }
            }
            return OooO00o2.generateParameters();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        } catch (GeneralSecurityException e2) {
            throw new CMSException("exception creating algorithm parameter generator: " + e2, e2);
        }
    }

    public Key OooO00o(LIiI11 r3) {
        if (r3.m16085OooO00o() instanceof Key) {
            return (Key) r3.m16085OooO00o();
        }
        if (r3.m16085OooO00o() instanceof byte[]) {
            return new SecretKeySpec((byte[]) r3.m16085OooO00o(), "ENC");
        }
        throw new IllegalArgumentException("unknown generic key type");
    }

    public Key OooO00o(LlLI1 llLI1, LIiI11 r3) {
        if (r3.m16085OooO00o() instanceof Key) {
            return (Key) r3.m16085OooO00o();
        }
        if (r3.m16085OooO00o() instanceof byte[]) {
            return new SecretKeySpec((byte[]) r3.m16085OooO00o(), OooO00o(llLI1));
        }
        throw new IllegalArgumentException("unknown generic key type");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyFactory m16120OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) f16345OooO00o.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17218OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17218OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key factory: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyPairGenerator m16121OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) f16345OooO00o.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17219OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17219OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key pair generator: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Cipher m16122OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) OooO0O0.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17224OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17224OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create cipher: " + e.getMessage(), e);
        }
    }

    public Cipher OooO00o(Key key, C6456l1ilL r3) throws CMSException {
        return (Cipher) OooO00o(new OooO00o(r3, key));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyAgreement m16123OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) f16345OooO00o.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17225OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17225OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key agreement: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public KeyGenerator m16124OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) f16345OooO00o.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17226OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17226OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create key generator: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m16125OooO00o(LlLI1 llLI1) throws CMSException {
        try {
            String str = (String) OooO0OO.get(llLI1);
            if (str != null) {
                try {
                    return this.f16348OooO00o.m17227OooO00o(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.f16348OooO00o.m17227OooO00o(llLI1.m16387OooO0O0());
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot create mac: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Mac m16126OooO00o(Key key, C6456l1ilL r3) throws CMSException {
        return (Mac) OooO00o(new OooO0O0(r3, key));
    }

    public SecretKeyFactory OooO00o(String str) throws NoSuchProviderException, NoSuchAlgorithmException {
        return this.f16348OooO00o.m17228OooO00o(str);
    }

    public void OooO00o(C6456l1ilL r2, Key key) throws CMSException {
        int OooO00o2 = OooO00o.OooO00o(r2);
        if (OooO00o2 > 0) {
            byte[] bArr = null;
            try {
                bArr = key.getEncoded();
            } catch (Exception unused) {
            }
            if (bArr != null && bArr.length * 8 != OooO00o2) {
                throw new CMSException("Expected key size for algorithm OID not found in recipient.");
            }
        }
    }

    public byte[] OooO00o(int i, char[] cArr, C6456l1ilL r5, int i2) throws CMSException {
        AbstractC6712liI r3;
        String str;
        C5772LlIII OooO00o2 = C5772LlIII.OooO00o(r5.m17587OooO0O0());
        if (i == 0) {
            try {
                r3 = this.f16348OooO00o;
                str = "PBKDF2with8BIT";
            } catch (GeneralSecurityException e) {
                throw new CMSException("Unable to calculate derived key from password: " + e.getMessage(), e);
            }
        } else {
            r3 = this.f16348OooO00o;
            str = (String) OooO0Oo.get(OooO00o2.OooO00o());
        }
        return r3.m17228OooO00o(str).generateSecret(new PBEKeySpec(cArr, OooO00o2.m16367OooO00o(), OooO00o2.m16365OooO00o().intValue(), i2)).getEncoded();
    }

    public Cipher OooO0O0(LlLI1 llLI1) throws CMSException {
        String str = (String) f16345OooO00o.get(llLI1);
        if (str != null) {
            try {
                return this.f16348OooO00o.m17224OooO00o(str + "RFC3211Wrap");
            } catch (GeneralSecurityException e) {
                throw new CMSException("cannot create cipher: " + e.getMessage(), e);
            }
        } else {
            throw new CMSException("no name for " + llLI1);
        }
    }
}
