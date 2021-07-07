package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p262d.C3108a;

/* renamed from: com.taobao.accs.utl.w */
public class C3194w {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* renamed from: a */
    public static int f7260a = -1;

    /* renamed from: b */
    public static final byte[] f7261b = new byte[0];

    /* renamed from: c */
    public static int f7262c = -1;

    /* renamed from: a */
    public static boolean m7715a(Context context) {
        if (context == null) {
            return false;
        }
        if (f7262c == -1) {
            f7262c = context.getApplicationInfo().targetSdkVersion;
        }
        if (f7262c < 26 || Build.VERSION.SDK_INT < 26) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m7716b(Context context) {
        int i;
        Throwable th;
        int i2;
        int i3 = f7260a;
        if (i3 != -1) {
            return i3;
        }
        try {
            synchronized (f7261b) {
                try {
                    i = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                } catch (Throwable th2) {
                    th = th2;
                    i2 = context;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            ALog.m7598e("Utils", "getMode", th, new Object[0]);
            return i;
        }
    }

    /* renamed from: c */
    public static void m7718c(Context context) {
        try {
            synchronized (f7261b) {
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.clear();
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m7598e("Utils", "clearAllSharePreferences", th, new Object[0]);
        }
    }

    /* renamed from: d */
    public static void m7719d(Context context) {
        try {
            Class<?> loadClass = C3108a.m7327a().mo37554b().loadClass("com.taobao.accs.utl.UtilityImpl");
            loadClass.getMethod("killService", Context.class).invoke(loadClass, context);
        } catch (Throwable th) {
            ALog.m7598e("Utils", "killService", th, new Object[0]);
        }
    }

    /* renamed from: e */
    public static boolean m7720e(Context context) {
        boolean z;
        try {
            Class<?> loadClass = C3108a.m7327a().mo37554b().loadClass("com.taobao.accs.utl.UtilityImpl");
            z = ((Boolean) loadClass.getMethod("isMainProcess", Context.class).invoke(loadClass, context)).booleanValue();
        } catch (Throwable th) {
            ALog.m7598e("Utils", "killservice", th, new Object[0]);
            th.printStackTrace();
            z = true;
        }
        ALog.m7600i("Utils", "isMainProcess", "result", Boolean.valueOf(z));
        return z;
    }

    /* renamed from: f */
    public static void m7721f(Context context) {
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences("AGOO_BIND", 0).edit();
            edit.clear();
            edit.apply();
        } catch (Exception e) {
            ALog.m7598e("Utils", "clearAgooBindCache", e, new Object[0]);
        }
    }

    /* renamed from: g */
    public static Bundle m7722g(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null) {
                return applicationInfo.metaData;
            }
            return null;
        } catch (Throwable th) {
            ALog.m7598e("Utils", "getMetaInfo", th, new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public static void m7712a(Context context, int i) {
        try {
            synchronized (f7261b) {
                f7260a = i;
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putInt(Constants.SP_KEY_DEBUG_MODE, i);
                edit.apply();
            }
        } catch (Throwable th) {
            ALog.m7598e("Utils", "setMode", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public static String m7717b(Context context, String str, String str2) {
        String str3 = null;
        try {
            synchronized (f7261b) {
                str3 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(str, null);
            }
            ALog.m7600i("Utils", "getSpValue", "value", str3);
            if (TextUtils.isEmpty(str3)) {
                ALog.m7599e("Utils", "getSpValue use default!", new Object[0]);
                return str2;
            }
        } catch (Throwable th) {
            ALog.m7598e("Utils", "getSpValue fail", th, new Object[0]);
        }
        return str3;
    }

    /* renamed from: a */
    public static void m7713a(Context context, String str) {
        try {
            Class<?> loadClass = C3108a.m7327a().mo37554b().loadClass("org.android.agoo.common.Config");
            loadClass.getMethod("setAgooAppKey", Context.class, String.class).invoke(loadClass, context, str);
        } catch (Throwable th) {
            ALog.m7598e("Utils", "setAgooAppkey", th, new Object[0]);
            th.printStackTrace();
        }
    }

    @Deprecated
    /* renamed from: a */
    public static void m7711a() {
        try {
            Class<?> loadClass = C3108a.m7327a().mo37554b().loadClass("com.taobao.accs.client.AccsConfig");
            loadClass.getMethod("build", new Class[0]).invoke(loadClass, new Object[0]);
        } catch (Throwable th) {
            ALog.m7598e("Utils", "initConfig", th, new Object[0]);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m7714a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            ALog.m7599e("Utils", "setSpValue null", new Object[0]);
            return;
        }
        try {
            synchronized (f7261b) {
                SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                edit.putString(str, str2);
                edit.apply();
            }
            ALog.m7600i("Utils", "setSpValue", "key", str, "value", str2);
        } catch (Exception e) {
            ALog.m7598e("Utils", "setSpValue fail", e, new Object[0]);
        }
    }
}
