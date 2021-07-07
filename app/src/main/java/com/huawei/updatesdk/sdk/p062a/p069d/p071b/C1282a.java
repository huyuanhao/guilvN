package com.huawei.updatesdk.sdk.p062a.p069d.p071b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.p073c.C1291b;
import com.huawei.updatesdk.sdk.service.p074a.C1294a;
import com.p118pd.sdk.C5982OoooOoO;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.sdk.a.d.b.a */
public class C1282a {

    /* renamed from: a */
    public static Map<String, Object> f1433a = new HashMap();

    /* renamed from: a */
    public static String m1592a() {
        return Build.DISPLAY;
    }

    /* renamed from: a */
    public static void m1593a(Context context) {
        m1594b(context);
    }

    /* renamed from: b */
    public static long m1594b(Context context) {
        long j;
        Long l = (Long) f1433a.get("TotalMem");
        if (l != null) {
            j = l.longValue();
        } else {
            long f = Build.VERSION.SDK_INT >= 16 ? m1602f(context) : m1605g(context);
            if (f > 0) {
                f1433a.put("TotalMem", Long.valueOf(f));
            }
            j = f;
        }
        C1278a.m1580a("DeviceUtil", "getTotalMem, totalMem:" + j);
        return j;
    }

    /* renamed from: b */
    public static String m1595b() {
        DisplayMetrics h = m1606h(C1294a.m1650a().mo15900b());
        return h != null ? String.valueOf(h.densityDpi) : "";
    }

    /* renamed from: c */
    public static int m1596c(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + "");
        } catch (PackageManager.NameNotFoundException | NumberFormatException unused) {
            return 1;
        }
    }

    /* renamed from: c */
    public static String m1597c() {
        String str;
        String str2;
        Locale locale = Locale.getDefault();
        String str3 = "";
        if (locale != null) {
            str = locale.getLanguage();
            if (Build.VERSION.SDK_INT >= 21) {
                str3 = locale.getScript();
            }
            str2 = locale.getCountry();
        } else {
            str = SocializeProtocolConstants.PROTOCOL_KEY_EN;
            str2 = "US";
        }
        if (TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str + "_" + str3 + "_" + str2;
    }

    /* renamed from: d */
    public static String m1598d() {
        DisplayMetrics h = m1606h(C1294a.m1650a().mo15900b());
        if (h == null) {
            return "";
        }
        String valueOf = String.valueOf(h.widthPixels);
        String valueOf2 = String.valueOf(h.heightPixels);
        return valueOf + "_" + valueOf2;
    }

    /* renamed from: d */
    public static String m1599d(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + "";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m1600e(Context context) {
        String d = m1599d(context);
        if (d == null) {
            return d;
        }
        int i = 0;
        int i2 = 0;
        while (i < d.length() && i2 < 3) {
            if (d.charAt(i) == '.') {
                i2++;
            }
            i++;
        }
        return 3 == i2 ? d.substring(0, i - 1) : d;
    }

    /* renamed from: e */
    public static boolean m1601e() {
        if (C1294a.m1650a() == null) {
            return false;
        }
        return C1291b.m1636a(C1294a.m1650a().mo15900b());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: f */
    public static long m1602f(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem;
        } catch (Exception e) {
            C1278a.m1584d("DeviceUtil", e.getMessage());
            return 0;
        }
    }

    /* renamed from: f */
    public static boolean m1603f() {
        PackageManager packageManager = C1294a.m1650a().mo15900b().getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            return (packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo.flags & 1) != 0;
        } catch (PackageManager.NameNotFoundException e) {
            C1278a.m1584d("DeviceUtil", e.getMessage());
            return false;
        }
    }

    /* renamed from: g */
    public static int m1604g() {
        String str;
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        try {
            Class<?> cls = Class.forName("android.os.UserHandle");
            return ((Integer) cls.getMethod("myUserId", new Class[0]).invoke(cls, new Object[0])).intValue();
        } catch (IllegalArgumentException e) {
            sb = new StringBuilder();
            sb.append("get current uid IllegalArgumentException! ");
            str2 = e.toString();
        } catch (ClassNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("get current uid ClassNotFoundException! ");
            str2 = e2.toString();
        } catch (NoSuchMethodException e3) {
            sb = new StringBuilder();
            sb.append("get current uid NoSuchMethodException! ");
            str2 = e3.toString();
        } catch (InvocationTargetException e4) {
            sb = new StringBuilder();
            sb.append("get current uid InvocationTargetException! ");
            str2 = e4.toString();
        } catch (IllegalAccessException e5) {
            sb2 = new StringBuilder();
            sb2.append("get current uid IllegalAccessException! ");
            str3 = e5.toString();
            sb2.append(str3);
            str = sb2.toString();
            C1278a.m1584d("DeviceUtil", str);
            return 0;
        } catch (Exception e6) {
            sb2 = new StringBuilder();
            sb2.append("get current uid IllegalAccessException! ");
            str3 = e6.toString();
            sb2.append(str3);
            str = sb2.toString();
            C1278a.m1584d("DeviceUtil", str);
            return 0;
        }
        sb.append(str2);
        str = sb.toString();
        C1278a.m1584d("DeviceUtil", str);
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[SYNTHETIC, Splitter:B:40:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x009d A[SYNTHETIC, Splitter:B:50:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00bc A[SYNTHETIC, Splitter:B:60:0x00bc] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00db A[SYNTHETIC, Splitter:B:70:0x00db] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f4 A[SYNTHETIC, Splitter:B:80:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102 A[SYNTHETIC, Splitter:B:85:0x0102] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m1605g(android.content.Context r8) {
        /*
        // Method dump skipped, instructions count: 271
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.sdk.p062a.p069d.p071b.C1282a.m1605g(android.content.Context):long");
    }

    /* renamed from: h */
    public static DisplayMetrics m1606h(Context context) {
        Display defaultDisplay;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: h */
    public static String m1607h() {
        return Build.VERSION.RELEASE.trim();
    }
}
