package com.megvii.apo.util;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.megvii.apo.util.a */
public final class C1491a {

    /* renamed from: a */
    public static IvParameterSpec f2013a;

    /* renamed from: b */
    public static SecretKeySpec f2014b;

    /* renamed from: a */
    public static String m2249a() {
        try {
            KeyGenerator instance = KeyGenerator.getInstance("AES");
            instance.init(64);
            byte[] encoded = instance.generateKey().getEncoded();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : encoded) {
                String hexString = Integer.toHexString(b);
                if (hexString.length() > 3) {
                    stringBuffer.append(hexString.substring(6));
                } else if (hexString.length() < 2) {
                    stringBuffer.append("0".concat(String.valueOf(hexString)));
                } else {
                    stringBuffer.append(hexString);
                }
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static byte[] m2250a(byte[] bArr, byte[] bArr2) {
        try {
            byte[] bArr3 = new byte[16];
            int i = 0;
            while (i < bArr2.length && i < 16) {
                bArr3[i] = bArr2[i];
                i++;
            }
            f2014b = new SecretKeySpec(bArr3, "AES");
            f2013a = new IvParameterSpec(bArr2);
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, f2014b, f2013a);
            return instance.doFinal(bArr);
        } catch (Throwable th2) {
            C1495e.m2258a(th2);
            return null;
        }
    }
}
