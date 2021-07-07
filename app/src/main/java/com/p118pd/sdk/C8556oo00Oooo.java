package com.p118pd.sdk;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.oo00Oooo  reason: case insensitive filesystem */
public class C8556oo00Oooo {
    public static String OooO00o(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0Oo);
            instance.update(str.getBytes("UTF-8"));
            return C8586oo0O00.OooO00o(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            str2 = "getSHA256StrJava, getInstance - No such algorithm,transformation!";
        } catch (UnsupportedEncodingException unused2) {
            str2 = "getSHA256StrJava, getBytes - Unsupported coding format!";
        }
        AbstractC8536oo00OO0O.OooO0Oo("LogCrypter", str2);
        return "";
    }

    public static String OooO00o(Key key) {
        return C8586oo0O00.OooO00o(key.getEncoded());
    }

    public static Key OooO00o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher OooO00o(int i, Key key, byte[] bArr) {
        String str;
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(i, key, ivParameterSpec);
            return instance;
        } catch (NoSuchPaddingException unused) {
            str = "AES:getCipher() No such filling parameters !";
            AbstractC8536oo00OO0O.OooO0OO("LogCrypter", str);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            str = "AES:getCipher() getInstance - No such algorithm,transformation!";
            AbstractC8536oo00OO0O.OooO0OO("LogCrypter", str);
            return null;
        } catch (InvalidAlgorithmParameterException unused3) {
            str = "AES:getCipher() Invalid algorithm parameters";
            AbstractC8536oo00OO0O.OooO0OO("LogCrypter", str);
            return null;
        } catch (InvalidKeyException unused4) {
            str = "AES:getCipher() init - Invalid key!";
            AbstractC8536oo00OO0O.OooO0OO("LogCrypter", str);
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m20211OooO00o() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}
