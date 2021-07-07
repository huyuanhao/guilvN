package com.huawei.hms.support.api.push.p046b.p049b;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.p046b.p047a.p048a.AbstractC1189a;
import com.huawei.hms.support.log.C1202a;
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

/* renamed from: com.huawei.hms.support.api.push.b.b.a */
public class C1194a {
    @SuppressLint({"TrulyRandom"})
    /* renamed from: a */
    public static String m1290a(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null && bArr.length > 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                byte[] bArr2 = new byte[16];
                new SecureRandom().nextBytes(bArr2);
                instance.init(1, secretKeySpec, new IvParameterSpec(bArr2));
                return m1289a(AbstractC1189a.m1269a(bArr2), AbstractC1189a.m1269a(instance.doFinal(str.getBytes("UTF-8"))));
            } catch (UnsupportedEncodingException | IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                C1202a.m1320d("AES128_CBC", "aes cbc encrypter data error");
            }
        }
        return "";
    }

    /* renamed from: b */
    public static String m1292b(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && str.length() >= 32 && bArr != null && bArr.length > 0) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                String a = m1288a(str);
                String b = m1291b(str);
                if (!TextUtils.isEmpty(a)) {
                    if (!TextUtils.isEmpty(b)) {
                        instance.init(2, secretKeySpec, new IvParameterSpec(AbstractC1189a.m1273b(a)));
                        return new String(instance.doFinal(AbstractC1189a.m1273b(b)), "UTF-8");
                    }
                }
                C1202a.m1319c("AES128_CBC", "iv or enData is null");
                return "";
            } catch (UnsupportedEncodingException | IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException unused) {
                C1202a.m1320d("AES128_CBC", "aes cbc decrypter data error");
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m1289a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str2.length() >= 16 && str.length() >= 16) {
            stringBuffer.append(str2.substring(0, 6));
            stringBuffer.append(str.substring(0, 6));
            stringBuffer.append(str2.substring(6, 10));
            stringBuffer.append(str.substring(6, 16));
            stringBuffer.append(str2.substring(10, 16));
            stringBuffer.append(str.substring(16));
            stringBuffer.append(str2.substring(16));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m1291b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() >= 48) {
            stringBuffer.append(str.substring(0, 6));
            stringBuffer.append(str.substring(12, 16));
            stringBuffer.append(str.substring(26, 32));
            stringBuffer.append(str.substring(48));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m1288a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() >= 48) {
            stringBuffer.append(str.substring(6, 12));
            stringBuffer.append(str.substring(16, 26));
            stringBuffer.append(str.substring(32, 48));
        }
        return stringBuffer.toString();
    }
}
