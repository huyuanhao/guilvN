package com.alibaba.sdk.android.beacon;

import android.content.Context;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alibaba.sdk.android.beacon.c */
public final class C0250c {

    /* renamed from: a */
    public static final char[] f560a = "0123456789abcdef".toCharArray();

    /* renamed from: a */
    public static String m414a(Context context) {
        if (context == null) {
            return "";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m415a(String str, String str2) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str.getBytes(), "HmacSHA1");
        try {
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            return m416a(instance.doFinal(str2.getBytes()));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m416a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = f560a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }
}
