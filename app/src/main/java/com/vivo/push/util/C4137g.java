package com.vivo.push.util;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.vivo.push.util.g */
public final class C4137g {
    /* renamed from: a */
    public static String m11167a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] ^ 16);
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static byte[] m11168a(String str, String str2, byte[] bArr) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes("utf-8"), "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(str.getBytes("utf-8")));
        return instance.doFinal(bArr);
    }
}
