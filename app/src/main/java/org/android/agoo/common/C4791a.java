package org.android.agoo.common;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C8027oOO00oo;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: org.android.agoo.common.a */
public final class C4791a {

    /* renamed from: a */
    public static byte[] f13432a = {82, 22, 50, 44, -16, 124, ExifInterface.OooO0OO, -114, -87, ExifInterface.OooO0OO, C8027oOO00oo.OooO0OO, 23, -56, 23, -33, 75};

    /* renamed from: b */
    public static ThreadLocal<Cipher> f13433b = new ThreadLocal<>();

    /* renamed from: c */
    public static final AlgorithmParameterSpec f13434c = new IvParameterSpec(f13432a);

    /* renamed from: a */
    public static final byte[] m14284a(byte[] bArr, SecretKeySpec secretKeySpec, byte[] bArr2) throws IllegalArgumentException {
        try {
            return m14281a(secretKeySpec, bArr2, 2).doFinal(bArr);
        } catch (IllegalBlockSizeException e) {
            throw new IllegalArgumentException("AES decrypt error:" + e.getMessage(), e);
        } catch (BadPaddingException e2) {
            throw new IllegalArgumentException("AES decrypt error:" + e2.getMessage(), e2);
        }
    }

    /* renamed from: a */
    public static final Cipher m14281a(SecretKeySpec secretKeySpec, byte[] bArr, int i) {
        Cipher a = m14280a();
        try {
            a.init(i, secretKeySpec, new IvParameterSpec(bArr));
            return a;
        } catch (InvalidKeyException e) {
            throw new RuntimeException("init Chipher error:" + e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new RuntimeException("init Chipher error:" + e2.getMessage(), e2);
        } catch (IllegalArgumentException e3) {
            throw new RuntimeException("init Chipher error:" + e3.getMessage(), e3);
        }
    }

    /* renamed from: a */
    public static final Cipher m14280a() {
        Cipher cipher = f13433b.get();
        if (cipher == null) {
            try {
                cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                f13433b.set(cipher);
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException("get Chipher error:" + e.getMessage(), e);
            } catch (NoSuchPaddingException e2) {
                throw new RuntimeException("get Chipher error:" + e2.getMessage(), e2);
            }
        }
        return cipher;
    }

    /* renamed from: a */
    public static final byte[] m14283a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable th) {
            throw new RuntimeException("md5 value Throwable", th);
        }
    }

    /* renamed from: a */
    public static byte[] m14285a(byte[] bArr, byte[] bArr2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return instance.doFinal(bArr2);
        } catch (Throwable th) {
            throw new RuntimeException("HmacSHA1 Throwable", th);
        }
    }

    /* renamed from: a */
    public static byte[] m14282a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }
}
