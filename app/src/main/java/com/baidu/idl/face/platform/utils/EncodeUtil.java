package com.baidu.idl.face.platform.utils;

import android.text.TextUtils;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class EncodeUtil {
    public static String aesDecrypt(String str, String str2) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return aesDecryptByBytes(base64Decode(str), str2);
    }

    public static String aesDecryptByBytes(byte[] bArr, String str) throws Exception {
        Cipher instance = Cipher.getInstance("AES");
        instance.init(2, new SecretKeySpec(base64Decode(str), "AES"));
        return new String(instance.doFinal(bArr));
    }

    public static String aesEncrypt(String str, String str2) throws Exception {
        return base64Encode(aesEncryptToBytes(str, str2));
    }

    public static byte[] aesEncryptToBytes(String str, String str2) throws Exception {
        Cipher instance = Cipher.getInstance("AES");
        instance.init(1, new SecretKeySpec(base64Decode(str2), "AES"));
        return instance.doFinal(str.getBytes("utf-8"));
    }

    public static byte[] base64Decode(String str) throws Exception {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 2);
    }

    public static String base64Encode(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }
}
