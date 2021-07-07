package com.xiaomi.push;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C6996o000OOo0;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.xiaomi.push.g */
public class C4442g {

    /* renamed from: com.xiaomi.push.g$a */
    public enum EnumC4443a {
        f11987a(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        

        /* renamed from: a */
        public final int f11991a;

        /* access modifiers changed from: public */
        EnumC4443a(int i) {
            this.f11991a = i;
        }

        /* renamed from: a */
        public int mo41918a() {
            return this.f11991a;
        }
    }

    /* renamed from: a */
    public static int m12696a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo.versionCode;
        }
        return 0;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static EnumC4443a m12697a(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str) || Build.VERSION.SDK_INT < 19) {
            return EnumC4443a.f11987a;
        }
        try {
            Integer num = (Integer) C4278ba.m11769a((Class<? extends Object>) AppOpsManager.class, C6996o000OOo0.f19224OooO0OO);
            if (num == null) {
                return EnumC4443a.f11987a;
            }
            Integer num2 = (Integer) C4278ba.m11772a((AppOpsManager) context.getSystemService("appops"), C6996o000OOo0.f19223OooO0O0, num, Integer.valueOf(context.getPackageManager().getApplicationInfo(str, 0).uid), str);
            return (num2 == null || num2.intValue() != 0) ? EnumC4443a.NOT_ALLOWED : EnumC4443a.ALLOWED;
        } catch (Throwable unused) {
            return EnumC4443a.f11987a;
        }
    }

    /* renamed from: a */
    public static String m12698a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses()) == null) {
            return null;
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m12699a(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "1.0";
    }

    /* renamed from: a */
    public static boolean m12700a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (runningAppProcesses != null && runningAppProcesses.size() >= 1) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == Process.myPid() && runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12701a(Context context, String str) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Arrays.asList(runningAppProcessInfo.pkgList).contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static String m12702b(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (runningAppProcesses != null && runningAppProcesses.size() > 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                String[] strArr = runningAppProcessInfo.pkgList;
                int i = 0;
                while (strArr != null && i < strArr.length) {
                    if (!arrayList.contains(strArr[i])) {
                        arrayList.add(strArr[i]);
                        if (arrayList.size() == 1) {
                            str = (String) arrayList.get(0);
                        } else {
                            sb.append("#");
                            str = strArr[i];
                        }
                        sb.append(str.hashCode() % 100000);
                    }
                    i++;
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m12703b(Context context, String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null) ? str : packageManager.getApplicationLabel(applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC4163b.m11303a(e);
            return str;
        }
    }

    /* renamed from: b */
    public static boolean m12704b(Context context, String str) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        return packageInfo != null;
    }

    /* renamed from: c */
    public static boolean m12705c(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
