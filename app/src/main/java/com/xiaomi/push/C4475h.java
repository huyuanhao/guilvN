package com.xiaomi.push;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.xiaomi.push.h */
public class C4475h {

    /* renamed from: a */
    public static final byte[] f12134a = {100, 23, 84, 114, 72, 0, 4, 97, 73, 97, 2, 52, 84, 102, 18, 32};

    /* renamed from: a */
    public static Cipher m12855a(byte[] bArr, int i) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f12134a);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(i, secretKeySpec, ivParameterSpec);
        return instance;
    }

    /* renamed from: a */
    public static byte[] m12856a(byte[] bArr, byte[] bArr2) {
        return m12855a(bArr, 2).doFinal(bArr2);
    }

    /* renamed from: b */
    public static byte[] m12857b(byte[] bArr, byte[] bArr2) {
        return m12855a(bArr, 1).doFinal(bArr2);
    }
}
