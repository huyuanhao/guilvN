package com.huawei.hms.support.log;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.huawei.hms.support.log.a */
public class C1202a {

    /* renamed from: a */
    public static final C1204b f1305a = new C1204b();

    /* renamed from: a */
    public static void m1315a(Context context, int i, String str) {
        f1305a.mo15712a(context, i, str);
        f1305a.mo15713a(str, "============================================================================" + '\n' + "====== " + m1314a(context) + '\n' + "============================================================================");
    }

    /* renamed from: b */
    public static void m1318b(String str, String str2) {
        f1305a.mo15710a(4, str, str2);
    }

    /* renamed from: c */
    public static void m1319c(String str, String str2) {
        f1305a.mo15710a(5, str, str2);
    }

    /* renamed from: d */
    public static void m1320d(String str, String str2) {
        f1305a.mo15710a(6, str, str2);
    }

    /* renamed from: a */
    public static String m1314a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                return "HMS-" + packageInfo.versionName + C3848l.f10401s + packageInfo.versionCode + C3848l.f10402t;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return "HMS-[unknown-version]";
    }

    /* renamed from: a */
    public static void m1316a(String str, String str2) {
        f1305a.mo15710a(3, str, str2);
    }

    /* renamed from: a */
    public static void m1317a(String str, String str2, Throwable th) {
        f1305a.mo15711a(6, str, str2, th);
    }
}
