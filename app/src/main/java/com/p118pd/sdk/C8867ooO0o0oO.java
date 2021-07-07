package com.p118pd.sdk;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.pd.sdk.ooO0o0oO  reason: case insensitive filesystem */
public class C8867ooO0o0oO {
    public static final String OooO00o = "UTF-8";
    public static final String OooO0O0 = "GB2312";

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20505OooO00o(String str, String str2) {
        byte[] OooO00o2 = OooO00o(str);
        byte[] bytes = str2.getBytes();
        int length = OooO00o2.length;
        int length2 = bytes.length;
        for (int i = 0; i < length; i++) {
            OooO00o2[i] = (byte) (OooO00o2[i] ^ bytes[i % length2]);
        }
        try {
            return new String(OooO00o2, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0O0(String str, String str2) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            bArr = null;
        }
        byte[] bytes = str2.getBytes();
        int length = bArr.length;
        int length2 = bytes.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ bytes[i % length2]);
            String hexString = Integer.toHexString(bArr[i] & 255);
            hexString.toUpperCase(Locale.US);
            if (hexString.length() == 1) {
                sb.append("0");
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    public static byte[] OooO00o(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 1;
            bArr[i] = OooO00o(str.substring(i2, i3), str.substring(i3, i3 + 1));
        }
        return bArr;
    }

    public static byte OooO00o(String str, String str2) {
        return (byte) (((byte) (Byte.decode("0x" + str).byteValue() << 4)) | Byte.decode("0x" + str2).byteValue());
    }

    public static byte[] OooO00o(String str, byte[] bArr) {
        if (!TextUtils.isEmpty(str) && bArr != null) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "DES");
                Cipher instance = Cipher.getInstance("DES");
                instance.init(1, secretKeySpec);
                return instance.doFinal(str.getBytes("utf-8"));
            } catch (Exception e) {
                AbstractC8796ooO0000o.OooO00o("shaobo", "encrypt http content error, key: " + C8870ooO0oO00.OooO0O0(bArr) + " err: " + e);
            }
        }
        return null;
    }

    public static byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        if (!(bArr == null || bArr2 == null)) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DES");
                Cipher instance = Cipher.getInstance("DES");
                instance.init(1, secretKeySpec);
                return instance.doFinal(bArr);
            } catch (Exception e) {
                AbstractC8796ooO0000o.OooO00o("shaobo", "encrypt http content error, key: " + C8870ooO0oO00.OooO0O0(bArr2) + " err: " + e);
            }
        }
        return null;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2) throws Exception {
        if (bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "DES");
            Cipher instance = Cipher.getInstance("DES");
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        }
        throw new Exception("Decrpty failed, skey = null");
    }
}
