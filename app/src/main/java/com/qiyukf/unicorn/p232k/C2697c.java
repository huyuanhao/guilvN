package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.unicorn.p209b.C2437b;
import java.io.UnsupportedEncodingException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.qiyukf.unicorn.k.c */
public final class C2697c {
    /* renamed from: a */
    public static String m6240a(Context context, byte[] bArr, String str) {
        byte[] b = m6243b(context, bArr, str);
        if (b == null) {
            return null;
        }
        try {
            return new String(b, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m6241a(Context context, String str) {
        String f = C2437b.m5276f();
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        String str2 = (str.substring(0, Math.min(8, str.length() - 1)) + f.substring(0, Math.min(8, f.length() - 1))) + string.substring(0, Math.min(8, string.length() - 1));
        if (str2.length() != 24) {
            str2 = str2 + str.substring(8, 24 - str2.length());
        }
        return str2.getBytes();
    }

    /* renamed from: a */
    public static byte[] m6242a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(m6241a(context, str2), "AES");
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(1, secretKeySpec);
            return instance.doFinal(str.getBytes("UTF-8"));
        } catch (Exception e) {
            C1709a.m3016c("ENC", "AES cipher error, enc failed");
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m6243b(Context context, byte[] bArr, String str) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(m6241a(context, str), "AES");
        try {
            Cipher instance = Cipher.getInstance("AES/ECB/NoPadding");
            instance.init(2, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Exception e) {
            C1709a.m3016c("ENC", "AES cipher error, dec failed");
            e.printStackTrace();
            return null;
        }
    }
}
