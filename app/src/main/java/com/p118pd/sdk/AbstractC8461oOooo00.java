package com.p118pd.sdk;

import android.util.Base64;
import java.nio.charset.Charset;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/* renamed from: com.pd.sdk.oOooo00  reason: case insensitive filesystem */
public abstract class AbstractC8461oOooo00 {
    public static String OooO00o(String str, String str2) {
        Cipher instance = Cipher.getInstance("DES");
        instance.init(2, OooO00o(str2));
        return new String(instance.doFinal(Base64.decode(str, 0)), Charset.defaultCharset()).trim();
    }

    public static Key OooO00o(String str) {
        return SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(Base64.decode(str, 0)));
    }

    public static String OooO0O0(String str, String str2) {
        SecureRandom secureRandom = new SecureRandom();
        Cipher instance = Cipher.getInstance("DES");
        instance.init(1, OooO00o(str2), secureRandom);
        return new String(Base64.encode(instance.doFinal(str.getBytes("UTF-8")), 0), Charset.defaultCharset()).trim();
    }
}
