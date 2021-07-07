package com.huawei.hms.p037c;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.huawei.hms.p035a.C1107a;
import com.huawei.hms.support.log.C1202a;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8701oo0o0O;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* renamed from: com.huawei.hms.c.j */
public class C1141j {
    /* renamed from: a */
    public static boolean m1094a() {
        String c = m1100c();
        if (!TextUtils.isEmpty(c)) {
            return "cn".equalsIgnoreCase(c);
        }
        String d = m1102d();
        if (!TextUtils.isEmpty(d)) {
            return d.toLowerCase(Locale.US).contains("cn");
        }
        String e = m1104e();
        if (!TextUtils.isEmpty(e)) {
            return "cn".equalsIgnoreCase(e);
        }
        return false;
    }

    /* renamed from: b */
    public static int m1097b(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getHmsVersion, Failed to get 'PackageManager' instance.");
            return 0;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.version")) == null)) {
                String valueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(valueOf)) {
                    return m1098b(valueOf);
                }
            }
            C1202a.m1318b(C8701oo0o0O.OooO00o, "In getHmsVersion, Failed to read meta data for the HMS VERSION.");
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getHmsVersion, Failed to read meta data for the HMS VERSION.");
            return 0;
        }
    }

    /* renamed from: c */
    public static String m1100c() {
        return m1092a("ro.product.locale.region", "");
    }

    /* renamed from: d */
    public static String m1102d() {
        return m1092a("ro.product.locale", "");
    }

    /* renamed from: e */
    public static String m1104e() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    /* renamed from: c */
    public static String m1101c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getMetaDataCpId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                String string = applicationInfo.metaData.getString("com.huawei.hms.client.cpid", "");
                if (string.startsWith("cpid=")) {
                    return string.substring(5);
                }
            }
            C1202a.m1318b(C8701oo0o0O.OooO00o, "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getMetaDataCpId, Failed to read meta data for the CpId.");
            return "";
        }
    }

    /* renamed from: d */
    public static boolean m1103d(Context context) {
        if (context == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getBiSetting, context is null.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getBiSetting, Failed to get 'PackageManager' instance.");
            return false;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData.getBoolean("com.huawei.hms.client.bi.setting");
            }
            C1202a.m1318b(C8701oo0o0O.OooO00o, "In getBiSetting, Failed to read meta data bisetting.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getBiSetting, Failed to read meta data bisetting.");
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m1105e(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (TextUtils.equals(runningAppProcessInfo.processName, context.getPackageName())) {
                C1202a.m1318b(C8701oo0o0O.OooO00o, "appProcess.importance is " + runningAppProcessInfo.importance);
                boolean z = runningAppProcessInfo.importance == 100;
                boolean inKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                C1202a.m1318b(C8701oo0o0O.OooO00o, "isForground is " + z + "***  isLockedState is " + inKeyguardRestrictedInputMode);
                if (!z || inKeyguardRestrictedInputMode) {
                    return true;
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m1092a(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "An exception occurred while reading: getSystemProperties:" + str);
            return str2;
        }
    }

    /* renamed from: b */
    public static int m1098b(String str) {
        if (!m1096a(str)) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length < 3) {
            return 0;
        }
        int parseInt = (Integer.parseInt(split[0]) * 10000000) + (Integer.parseInt(split[1]) * 100000) + (Integer.parseInt(split[2]) * 1000);
        return split.length == 4 ? parseInt + Integer.parseInt(split[3]) : parseInt;
    }

    /* renamed from: a */
    public static String m1090a(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getMetaDataAppId, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("com.huawei.hms.client.appid")) == null) {
                C1202a.m1320d(C8701oo0o0O.OooO00o, "In getMetaDataAppId, Failed to read meta data for the AppID.");
                return "";
            }
            String valueOf = String.valueOf(obj);
            return valueOf.startsWith("appid=") ? valueOf.substring(6) : valueOf;
        } catch (PackageManager.NameNotFoundException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getMetaDataAppId, Failed to read meta data for the AppID.");
            return "";
        }
    }

    /* renamed from: b */
    public static boolean m1099b() {
        C1202a.m1318b(C8701oo0o0O.OooO00o, "is Emui :" + C1107a.C1108a.f1094a);
        return C1107a.C1108a.f1094a > 0;
    }

    /* renamed from: a */
    public static boolean m1096a(String str) {
        return Pattern.compile("(^([0-9]{1,2}.){2}[0-9]{1,2}$)|(^([0-9]{1,2}.){3}[0-9]{1,3}$)").matcher(str).find();
    }

    /* renamed from: a */
    public static String m1091a(Context context, String str) {
        if (context == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getAppName, context is null.");
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getAppName, Failed to get 'PackageManager' instance.");
            return "";
        }
        try {
            if (TextUtils.isEmpty(str)) {
                str = context.getPackageName();
            }
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0));
            if (applicationLabel == null) {
                return "";
            }
            return applicationLabel.toString();
        } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "In getAppName, Failed to get app name.");
            return "";
        }
    }

    /* renamed from: a */
    public static void m1093a(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (Exception e) {
            C1202a.m1320d(C8701oo0o0O.OooO00o, "On unBindServiceException:" + e.getMessage());
        }
    }

    /* renamed from: a */
    public static Activity m1089a(Activity activity, Activity activity2) {
        if (activity != null && !activity.isFinishing()) {
            return activity;
        }
        if (activity2 == null || activity2.isFinishing()) {
            return null;
        }
        return activity2;
    }

    /* renamed from: a */
    public static boolean m1095a(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }
}
