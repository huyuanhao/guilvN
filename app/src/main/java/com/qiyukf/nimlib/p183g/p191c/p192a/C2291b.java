package com.qiyukf.nimlib.p183g.p191c.p192a;

import java.security.PublicKey;
import javax.crypto.Cipher;

/* renamed from: com.qiyukf.nimlib.g.c.a.b */
public final class C2291b {
    /* renamed from: a */
    public static byte[] m4867a(PublicKey publicKey, byte[] bArr, int i, int i2) {
        if (bArr != null && i2 >= 0 && i2 <= bArr.length) {
            try {
                Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                instance.init(1, publicKey);
                byte[] bArr2 = new byte[((((i2 - 1) / 117) << 7) + 128)];
                int i3 = 0;
                while (i < i2) {
                    int min = Math.min(i2 - (i3 * 117), 117);
                    byte[] doFinal = instance.doFinal(bArr, i, min);
                    System.arraycopy(doFinal, 0, bArr2, i3 << 7, doFinal.length);
                    i3++;
                    i += min;
                }
                return bArr2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
