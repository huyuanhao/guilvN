package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.oo00  reason: case insensitive filesystem */
public abstract class AbstractC8486oo00 {
    public static Pair<byte[], String> OooO00o(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return new Pair<>(new byte[0], str);
        }
        String substring = str.substring(0, 32);
        return new Pair<>(AbstractC8522oo00O000.OooO00o(substring), str.substring(32));
    }

    public static String OooO00o(String str, Context context) {
        String OooO00o = C8518oo000oo.OooO00o(context).m20188OooO00o();
        Pair<byte[], String> OooO00o2 = OooO00o(str);
        return OooO0O0(OooO00o, (byte[]) OooO00o2.first, (String) OooO00o2.second);
    }

    public static String OooO00o(String str, byte[] bArr, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && bArr != null && bArr.length != 0) {
            try {
                return AbstractC8522oo00O000.OooO00o(m20168OooO00o(str, bArr, str2.getBytes("UTF-8")));
            } catch (UnsupportedEncodingException unused) {
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", "aesEncrypt():getBytes - Unsupported coding format!");
            }
        }
        return "";
    }

    public static String OooO00o(String str, byte[] bArr, byte[] bArr2) {
        return (bArr2 == null || TextUtils.isEmpty(str) || bArr == null || bArr.length == 0) ? "" : AbstractC8522oo00O000.OooO00o(m20168OooO00o(str, bArr, bArr2));
    }

    public static String OooO00o(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0) {
            return str;
        }
        if (str == null) {
            str = "";
        }
        return AbstractC8522oo00O000.OooO00o(bArr).concat(str);
    }

    public static byte[] OooO00o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20168OooO00o(String str, byte[] bArr, byte[] bArr2) {
        String str2;
        if (TextUtils.isEmpty(str) || bArr == null || bArr.length == 0) {
            return new byte[0];
        }
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, new SecretKeySpec(AbstractC8522oo00O000.OooO00o(str), "AES"), new IvParameterSpec(bArr));
            return instance.doFinal(bArr2);
        } catch (NoSuchAlgorithmException unused) {
            str2 = "aesEncrypt(): getInstance - No such algorithm,transformation";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        } catch (InvalidKeyException unused2) {
            str2 = "aesEncrypt(): init - Invalid key!";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        } catch (InvalidAlgorithmParameterException unused3) {
            str2 = "aesEncrypt(): init - Invalid algorithm parameters !";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        } catch (NoSuchPaddingException unused4) {
            str2 = "aesEncrypt(): No such filling parameters ";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        } catch (BadPaddingException unused5) {
            str2 = "aesEncrypt(): False filling parameters!";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        } catch (IllegalBlockSizeException unused6) {
            str2 = "aesEncrypt(): doFinal - The provided block is not filled with";
            AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str2);
            return new byte[0];
        }
    }

    public static String OooO0O0(String str, Context context) {
        String OooO00o = C8518oo000oo.OooO00o(context).m20188OooO00o();
        byte[] OooO00o2 = OooO00o();
        return OooO00o(OooO00o2, OooO00o(OooO00o, OooO00o2, str));
    }

    public static String OooO0O0(String str, byte[] bArr, String str2) {
        String str3;
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length != 0 && !TextUtils.isEmpty(str2)) {
            try {
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, new SecretKeySpec(AbstractC8522oo00O000.OooO00o(str), "AES"), new IvParameterSpec(bArr));
                return new String(instance.doFinal(AbstractC8522oo00O000.OooO00o(str2)), "UTF-8");
            } catch (NoSuchAlgorithmException unused) {
                str3 = "aesDecrypt(): getInstance - No such algorithm,transformation";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (InvalidKeyException unused2) {
                str3 = "aesDecrypt(): init - Invalid key!";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (InvalidAlgorithmParameterException unused3) {
                str3 = "aesDecrypt(): init - Invalid algorithm parameters !";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (NoSuchPaddingException unused4) {
                str3 = "aesDecrypt():  No such filling parameters ";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (BadPaddingException unused5) {
                str3 = "aesDecrypt(): False filling parameters!";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (UnsupportedEncodingException unused6) {
                str3 = "aesDecrypt(): getBytes - Unsupported coding format!";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            } catch (IllegalBlockSizeException unused7) {
                str3 = "aesDecrypt(): doFinal - The provided block is not filled with";
                AbstractC8536oo00OO0O.OooO0OO("AesCrypter", str3);
                return "";
            }
        }
        return "";
    }
}
