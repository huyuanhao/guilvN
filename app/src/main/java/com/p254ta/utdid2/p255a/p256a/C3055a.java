package com.p254ta.utdid2.p255a.p256a;

import androidx.exifinterface.media.ExifInterface;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* renamed from: com.ta.utdid2.a.a.a */
public class C3055a {
    /* renamed from: a */
    public static String m7111a(String str) {
        byte[] bArr;
        try {
            bArr = m7116a(m7114a(), str.getBytes());
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr != null) {
            return m7112a(bArr);
        }
        return null;
    }

    /* renamed from: b */
    public static String m7117b(String str) {
        try {
            return new String(m7119b(m7114a(), m7115a(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m7114a() throws Exception {
        return C3063f.m7130a(new byte[]{PublicSuffixDatabase.EXCEPTION_MARKER, 83, ExifInterface.OooOOOO, -89, -84, -114, 80, 99, 10, 63, 22, -65, -11, 30, 101, -118});
    }

    /* renamed from: b */
    public static byte[] m7119b(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, secretKeySpec, new IvParameterSpec(m7118b()));
        return instance.doFinal(bArr2);
    }

    /* renamed from: a */
    public static byte[] m7116a(byte[] bArr, byte[] bArr2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, secretKeySpec, new IvParameterSpec(m7118b()));
        return instance.doFinal(bArr2);
    }

    /* renamed from: b */
    public static byte[] m7118b() {
        try {
            byte[] decode = C3056b.decode("IUQSvE6r1TfFPdPEjfklLw==".getBytes("UTF-8"), 2);
            if (decode != null) {
                return C3063f.m7130a(decode);
            }
        } catch (Exception unused) {
        }
        return new byte[16];
    }

    /* renamed from: a */
    public static byte[] m7115a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = Integer.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m7112a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            m7113a(stringBuffer, b);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m7113a(StringBuffer stringBuffer, byte b) {
        stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15));
        stringBuffer.append("0123456789ABCDEF".charAt(b & 15));
    }
}
