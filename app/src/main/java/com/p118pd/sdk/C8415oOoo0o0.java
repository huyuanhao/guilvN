package com.p118pd.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;

/* renamed from: com.pd.sdk.oOoo0o0  reason: case insensitive filesystem */
public class C8415oOoo0o0 {
    public static final int OooO00o = 26;

    public static int OooO00o(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int OooO00o(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("getVersionCode--Exception:" + e.getMessage());
            return 0;
        }
    }

    public static int OooO00o(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                C8409oOoo0OOo.OooO0O0("parseInt--NumberFormatException" + e.getMessage());
            }
        }
        return -1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20081OooO00o(Context context) {
        try {
            return context.getResources().getString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.labelRes);
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return "app";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20082OooO00o(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o("getVersionName--Exception:" + e.getMessage());
            return null;
        }
    }

    public static String OooO00o(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return str2;
        }
    }

    public static String OooO00o(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append((char) i);
        }
        return sb.toString();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20083OooO00o(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            C8409oOoo0OOo.OooO0O0("isExistPackage NameNotFoundException:" + e.getMessage());
            return false;
        }
    }

    public static boolean OooO00o(Context context, String str, String str2) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
        } catch (PackageManager.NameNotFoundException e) {
            C8409oOoo0OOo.OooO0O0("isSupportPush NameNotFoundException:" + e.getMessage());
            applicationInfo = null;
        }
        return applicationInfo != null && applicationInfo.metaData.getBoolean(str2, false);
    }

    public static String OooO0O0(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return "0";
        }
    }

    public static String OooO0OO(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "0";
        }
    }
}
