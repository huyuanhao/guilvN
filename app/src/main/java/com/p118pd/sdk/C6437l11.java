package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.openssl.EncryptionException;
import org.bouncycastle.openssl.PEMException;

/* renamed from: com.pd.sdk.l11丨  reason: invalid class name and case insensitive filesystem */
public class C6437l11 {
    public static final Map OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f18247OooO00o = new HashSet();
    public static final Map OooO0O0 = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Set f18248OooO0O0 = new HashSet();
    public static final Map OooO0OO = new HashMap();

    static {
        f18247OooO00o.add(AbstractC5711LiLli.OoooO0);
        f18247OooO00o.add(AbstractC5711LiLli.OoooO0O);
        f18247OooO00o.add(AbstractC5711LiLli.OoooO);
        f18247OooO00o.add(AbstractC5711LiLli.OoooOO0);
        f18247OooO00o.add(AbstractC5711LiLli.o000oOoO);
        f18247OooO00o.add(AbstractC5711LiLli.OoooOOO);
        f18248OooO0O0.add(AbstractC5711LiLli.OoooOOo);
        f18248OooO0O0.add(AbstractC5711LiLli.OoooOoo);
        f18248OooO0O0.add(AbstractC5905LllI.OooOo0);
        f18248OooO0O0.add(AbstractC5905LllI.OooOoo);
        f18248OooO0O0.add(AbstractC5905LllI.Oooo0OO);
        OooO00o.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.OooOo0.m16387OooO0O0(), I11I.OooO00o(128));
        OooO00o.put(AbstractC5905LllI.OooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.Oooo0OO.m16387OooO0O0(), I11I.OooO00o(256));
        OooO00o.put(AbstractC5711LiLli.o000o0OO.m16387OooO0O0(), I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0Oo, I11I.OooO00o(40));
        OooO00o.put(AbstractC5711LiLli.o000o0o, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0o0, I11I.OooO00o(192));
        OooO00o.put(AbstractC5711LiLli.o000o0oO, I11I.OooO00o(128));
        OooO00o.put(AbstractC5711LiLli.o000o0oo, I11I.OooO00o(40));
        OooO0O0.put(AbstractC5711LiLli.Oooooo, "PBKDF2withHMACSHA1");
        OooO0O0.put(AbstractC5711LiLli.Ooooooo, "PBKDF2withHMACSHA256");
        OooO0O0.put(AbstractC5711LiLli.ooOO, "PBKDF2withHMACSHA512");
        OooO0O0.put(AbstractC5711LiLli.OoooooO, "PBKDF2withHMACSHA224");
        OooO0O0.put(AbstractC5711LiLli.o0OoOo0, "PBKDF2withHMACSHA384");
        OooO0O0.put(AbstractC5905LllI.OooOOOO, "PBKDF2withHMACSHA3-224");
        OooO0O0.put(AbstractC5905LllI.OooOOOo, "PBKDF2withHMACSHA3-256");
        OooO0O0.put(AbstractC5905LllI.OooOOo0, "PBKDF2withHMACSHA3-384");
        OooO0O0.put(AbstractC5905LllI.OooOOo, "PBKDF2withHMACSHA3-512");
        OooO0O0.put(AbstractC5331ILi.OooO0OO, "PBKDF2withHMACGOST3411");
        OooO0OO.put(AbstractC5711LiLli.Oooooo, I11I.OooO00o(20));
        OooO0OO.put(AbstractC5711LiLli.Ooooooo, I11I.OooO00o(32));
        OooO0OO.put(AbstractC5711LiLli.ooOO, I11I.OooO00o(64));
        OooO0OO.put(AbstractC5711LiLli.OoooooO, I11I.OooO00o(28));
        OooO0OO.put(AbstractC5711LiLli.o0OoOo0, I11I.OooO00o(48));
        OooO0OO.put(AbstractC5905LllI.OooOOOO, I11I.OooO00o(28));
        OooO0OO.put(AbstractC5905LllI.OooOOOo, I11I.OooO00o(32));
        OooO0OO.put(AbstractC5905LllI.OooOOo0, I11I.OooO00o(48));
        OooO0OO.put(AbstractC5905LllI.OooOOo, I11I.OooO00o(64));
        OooO0OO.put(AbstractC5331ILi.OooO0OO, I11I.OooO00o(32));
    }

    public static int OooO00o(LlLI1 llLI1) {
        if (OooO0OO.containsKey(llLI1)) {
            return ((Integer) OooO0OO.get(llLI1)).intValue();
        }
        throw new IllegalStateException("no salt size for algorithm: " + llLI1);
    }

    public static int OooO00o(String str) {
        if (OooO00o.containsKey(str)) {
            return ((Integer) OooO00o.get(str)).intValue();
        }
        throw new IllegalStateException("no key size for algorithm: " + str);
    }

    public static SecretKey OooO00o(ii1I11l ii1i11l, String str, char[] cArr, byte[] bArr, int i) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        return new SecretKeySpec(ii1i11l.m17228OooO00o("PBKDF2with8BIT").generateSecret(new PBEKeySpec(cArr, bArr, i, OooO00o(str))).getEncoded(), str);
    }

    public static SecretKey OooO00o(ii1I11l ii1i11l, String str, char[] cArr, byte[] bArr, int i, C6456l1ilL r7) throws NoSuchProviderException, NoSuchAlgorithmException, InvalidKeySpecException {
        String str2 = (String) OooO0O0.get(r7.OooO00o());
        if (str2 != null) {
            return new SecretKeySpec(ii1i11l.m17228OooO00o(str2).generateSecret(new PBEKeySpec(cArr, bArr, i, OooO00o(str))).getEncoded(), str);
        }
        throw new NoSuchAlgorithmException("unknown PRF in PKCS#2: " + r7.OooO00o());
    }

    public static SecretKey OooO00o(ii1I11l ii1i11l, char[] cArr, String str, int i, byte[] bArr) throws PEMException {
        return OooO00o(ii1i11l, cArr, str, i, bArr, false);
    }

    public static SecretKey OooO00o(ii1I11l ii1i11l, char[] cArr, String str, int i, byte[] bArr, boolean z) throws PEMException {
        try {
            byte[] encoded = ii1i11l.m17228OooO00o("PBKDF-OpenSSL").generateSecret(new PBEKeySpec(cArr, bArr, 1, i * 8)).getEncoded();
            if (z && encoded.length >= 24) {
                System.arraycopy(encoded, 0, encoded, 16, 8);
            }
            return new SecretKeySpec(encoded, str);
        } catch (GeneralSecurityException e) {
            throw new PEMException("Unable to create OpenSSL PBDKF: " + e.getMessage(), e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17554OooO00o(LlLI1 llLI1) {
        return llLI1.m16387OooO0O0().startsWith(AbstractC5711LiLli.o000o0O.m16387OooO0O0());
    }

    public static boolean OooO00o(C6456l1ilL r1) {
        return r1 == null || r1.OooO00o().equals(AbstractC5711LiLli.Oooooo);
    }

    public static byte[] OooO00o(boolean z, ii1I11l ii1i11l, byte[] bArr, char[] cArr, String str, byte[] bArr2) throws PEMException {
        String str2;
        String str3;
        String str4;
        String str5;
        SecretKey secretKey;
        byte[] bArr3;
        RC2ParameterSpec rC2ParameterSpec;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
        if (str.endsWith("-CFB")) {
            str3 = "CFB";
            str2 = "NoPadding";
        } else {
            str3 = "CBC";
            str2 = "PKCS5Padding";
        }
        if (str.endsWith("-ECB") || "DES-EDE".equals(str) || "DES-EDE3".equals(str)) {
            ivParameterSpec = null;
            str3 = "ECB";
        }
        RC2ParameterSpec rC2ParameterSpec2 = ivParameterSpec;
        if (str.endsWith("-OFB")) {
            str5 = "OFB";
            str4 = "NoPadding";
        } else {
            str4 = str2;
            str5 = str3;
        }
        String str6 = "AES";
        int i = 1;
        if (str.startsWith("DES-EDE")) {
            secretKey = OooO00o(ii1i11l, cArr, "DESede", 24, bArr2, !str.startsWith("DES-EDE3"));
            str6 = "DESede";
        } else if (str.startsWith("DES-")) {
            str6 = "DES";
            secretKey = OooO00o(ii1i11l, cArr, str6, 8, bArr2);
        } else if (str.startsWith("BF-")) {
            str6 = "Blowfish";
            secretKey = OooO00o(ii1i11l, cArr, str6, 16, bArr2);
        } else {
            int i2 = 128;
            if (str.startsWith("RC2-")) {
                str6 = "RC2";
                if (str.startsWith("RC2-40-")) {
                    i2 = 40;
                } else if (str.startsWith("RC2-64-")) {
                    i2 = 64;
                }
                secretKey = OooO00o(ii1i11l, cArr, str6, i2 / 8, bArr2);
                if (rC2ParameterSpec2 != null) {
                    rC2ParameterSpec = new RC2ParameterSpec(i2, bArr2);
                }
                rC2ParameterSpec2 = rC2ParameterSpec;
            } else if (str.startsWith("AES-")) {
                if (bArr2.length > 8) {
                    bArr3 = new byte[8];
                    System.arraycopy(bArr2, 0, bArr3, 0, 8);
                } else {
                    bArr3 = bArr2;
                }
                if (!str.startsWith("AES-128-")) {
                    if (str.startsWith("AES-192-")) {
                        i2 = 192;
                    } else if (str.startsWith("AES-256-")) {
                        i2 = 256;
                    } else {
                        throw new EncryptionException("unknown AES encryption with private key");
                    }
                }
                secretKey = OooO00o(ii1i11l, cArr, str6, i2 / 8, bArr3);
            } else {
                throw new EncryptionException("unknown encryption with private key");
            }
        }
        try {
            Cipher OooO00o2 = ii1i11l.m17224OooO00o(str6 + C8932ooOOO0o.OooO0OO + str5 + C8932ooOOO0o.OooO0OO + str4);
            if (!z) {
                i = 2;
            }
            if (rC2ParameterSpec2 == null) {
                OooO00o2.init(i, secretKey);
            } else {
                OooO00o2.init(i, secretKey, rC2ParameterSpec2);
            }
            return OooO00o2.doFinal(bArr);
        } catch (Exception e) {
            throw new EncryptionException("exception using cipher - please check password and data.", e);
        }
    }

    public static boolean OooO0O0(LlLI1 llLI1) {
        return f18247OooO00o.contains(llLI1);
    }

    public static boolean OooO0OO(LlLI1 llLI1) {
        return f18248OooO0O0.contains(llLI1);
    }
}
