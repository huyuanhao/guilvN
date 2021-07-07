package com.p254ta.utdid2.p255a.p256a;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Random;

/* renamed from: com.ta.utdid2.a.a.e */
public class C3062e {
    /* renamed from: a */
    public static String m7123a() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = C3061d.getBytes(currentTimeMillis);
        byte[] bytes2 = C3061d.getBytes(nanoTime);
        byte[] bytes3 = C3061d.getBytes(nextInt);
        byte[] bytes4 = C3061d.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return C3056b.encodeToString(bArr, 2);
    }

    /* renamed from: b */
    public static String m7126b(Context context) {
        String str = "";
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            try {
                return (TextUtils.isEmpty(string) || string.equalsIgnoreCase("a5f5faddde9e9f02") || string.equalsIgnoreCase("8e17f7422b35fbea") || string.equalsIgnoreCase("0000000000000000")) ? str : string;
            } catch (Throwable unused) {
                str = string;
                return str;
            }
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* renamed from: c */
    public static String m7127c() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m7128c(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Exception unused) {
            }
        }
        return C3066g.m7133a(str) ? m7123a() : str;
    }

    /* renamed from: b */
    public static String m7125b() {
        String str = C3067h.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = C3067h.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? m7127c() : str;
    }

    /* renamed from: a */
    public static String m7124a(Context context) {
        String str = null;
        if (!C3060c.m7122a() && context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getDeviceId();
                }
            } catch (Exception unused) {
            }
        }
        if (C3066g.m7133a(str)) {
            str = m7125b();
        }
        if (C3066g.m7133a(str)) {
            str = m7126b(context);
        }
        return C3066g.m7133a(str) ? m7123a() : str;
    }
}
