package com.qiyukf.nimlib.p198j.p202d;

import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.p118pd.sdk.C8876ooO0oOOo;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.nimlib.C2180b;
import java.util.UUID;

/* renamed from: com.qiyukf.nimlib.j.d.b */
public final class C2351b {
    /* renamed from: a */
    public static String m5135a() {
        try {
            return Settings.System.getString(C2180b.m4471a().getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m5136b() {
        if (Build.VERSION.SDK_INT > 28) {
            return "";
        }
        try {
            ((TelephonyManager) C2180b.m4471a().getSystemService("phone")).getDeviceId();
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m5137c() {
        String b = m5136b();
        if (!b.equals("")) {
            return b;
        }
        String a = m5135a();
        if (a != null && !a.toLowerCase().equals(C8876ooO0oOOo.OooO00o) && !a.equals("")) {
            return a;
        }
        String str = Build.VERSION.SDK_INT >= 26 ? "unknown" : Build.SERIAL;
        if (str != null) {
            return str;
        }
        String g = C1861b.m3534g(C2180b.m4471a());
        return (g == null || g.equals("")) ? m5138d() : g;
    }

    /* renamed from: d */
    public static String m5138d() {
        try {
            SharedPreferences sharedPreferences = C2180b.m4471a().getSharedPreferences("OpenUdid", 0);
            String string = sharedPreferences.getString("OpenUdid", "");
            try {
                if (!string.equals("")) {
                    return string;
                }
                String uuid = UUID.randomUUID().toString();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("OpenUdid", uuid);
                edit.commit();
                return uuid;
            } catch (Exception unused) {
                return string;
            }
        } catch (Exception unused2) {
            return null;
        }
    }
}
