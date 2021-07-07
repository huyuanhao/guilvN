package com.huawei.updatesdk.support.p083c;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.p118pd.sdk.C8413oOoo0o;
import com.p118pd.sdk.C8742oo0oOo00;
import java.io.File;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* renamed from: com.huawei.updatesdk.support.c.a */
public class C1371a {

    /* renamed from: a */
    public static Integer f1664a;

    /* renamed from: b */
    public static boolean f1665b;

    /* renamed from: c */
    public static boolean f1666c;

    /* renamed from: d */
    public static Field f1667d;

    /* renamed from: com.huawei.updatesdk.support.c.a$a */
    public enum EnumC1372a {
        NOT_INSTALLED,
        INSTALLED,
        INSTALLED_LOWCODE
    }

    /* renamed from: a */
    public static PackageInfo m2047a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (PackageManager.NameNotFoundException unused) {
            C1278a.m1584d(C8742oo0oOo00.OooO00o, "not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static EnumC1372a m2048a(Context context, String str) {
        StringBuilder sb;
        String str2;
        EnumC1372a aVar = EnumC1372a.NOT_INSTALLED;
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
                return packageInfo != null ? packageInfo.versionCode < 70203000 ? EnumC1372a.INSTALLED_LOWCODE : EnumC1372a.INSTALLED : aVar;
            } catch (PackageManager.NameNotFoundException e) {
                sb = new StringBuilder();
                sb.append("isInstallByPackage NameNotFoundException:");
                str2 = e.toString();
                sb.append(str2);
                C1278a.m1582b(C8742oo0oOo00.OooO00o, sb.toString());
                return aVar;
            } catch (UnsupportedOperationException e2) {
                sb = new StringBuilder();
                sb.append("isInstallByPackage UnsupportedOperationException:");
                str2 = e2.toString();
                sb.append(str2);
                C1278a.m1582b(C8742oo0oOo00.OooO00o, sb.toString());
                return aVar;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public static Integer m2049a() {
        String str;
        StringBuilder sb;
        String str2;
        if (f1665b) {
            return f1664a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            f1664a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (NoSuchFieldException e) {
            sb = new StringBuilder();
            sb.append("isDelApp error NoSuchFieldException:");
            str2 = e.toString();
        } catch (ClassNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("isDelApp error ClassNotFoundException:");
            str2 = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append("isDelApp error IllegalAccessException:");
            str2 = e3.toString();
        } catch (IllegalArgumentException e4) {
            sb = new StringBuilder();
            sb.append("isDelApp error IllegalArgumentException:");
            str2 = e4.toString();
        } catch (Exception e5) {
            str = e5.toString();
            C1278a.m1580a(C8742oo0oOo00.OooO00o, str);
            f1665b = true;
            return f1664a;
        }
        f1665b = true;
        return f1664a;
        sb.append(str2);
        str = sb.toString();
        C1278a.m1580a(C8742oo0oOo00.OooO00o, str);
        f1665b = true;
        return f1664a;
    }

    /* renamed from: a */
    public static boolean m2050a(Context context) {
        String str;
        StringBuilder sb;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(C8413oOoo0o.f21545OooO0O0, 0);
            return packageInfo != null && packageInfo.versionCode > 90000000;
        } catch (PackageManager.NameNotFoundException e) {
            sb = new StringBuilder();
            sb.append("isInstallByPackage NameNotFoundException:");
            str = e.toString();
            sb.append(str);
            C1278a.m1582b(C8742oo0oOo00.OooO00o, sb.toString());
        } catch (UnsupportedOperationException e2) {
            sb = new StringBuilder();
            sb.append("isInstallByPackage UnsupportedOperationException:");
            str = e2.toString();
            sb.append(str);
            C1278a.m1582b(C8742oo0oOo00.OooO00o, sb.toString());
        }
    }

    /* renamed from: a */
    public static boolean m2051a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!Pattern.compile("(\\.)+[\\\\/]+").matcher(str).find()) {
            return new File(str).delete();
        }
        C1278a.m1580a(C8742oo0oOo00.OooO00o, "remov APK fail. the apk path is not valid");
        return false;
    }

    /* renamed from: b */
    public static Field m2052b() {
        if (f1666c) {
            return f1667d;
        }
        try {
            f1667d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            C1278a.m1580a(C8742oo0oOo00.OooO00o, "can not find hwFlags");
        }
        f1666c = true;
        return f1667d;
    }

    /* renamed from: b */
    public static boolean m2053b(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0) != null;
            } catch (Exception e) {
                C1278a.m1582b(C8742oo0oOo00.OooO00o, "isAppInstalled NameNotFoundException:" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m2054c() {
        return Build.VERSION.SDK_INT >= 23 && new ContextWrapper(C1294a.m1650a().mo15900b()).checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
