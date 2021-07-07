package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.pd.sdk.oo0ooOoo  reason: case insensitive filesystem */
public class C8773oo0ooOoo {
    public static int OooO00o(Context context) {
        ActivityManager activityManager;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)) == null) {
            return -1;
        }
        String str = context.getApplicationInfo().processName;
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null && str2.equals(str)) {
                return runningAppProcessInfo.uid;
            }
        }
        return -1;
    }

    @TargetApi(24)
    public static boolean OooO00o(int i) {
        boolean z = false;
        if (Build.VERSION.SDK_INT < 24 || i <= 0) {
            C8783oo0oooOO.OooO0o("unable to get app foreground status, uid=" + i + ",  build version" + Build.VERSION.SDK_INT);
        } else {
            try {
                Object invoke = Class.forName("android.app.ActivityManagerNative").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                z = ((Boolean) invoke.getClass().getMethod("isAppForeground", Integer.TYPE).invoke(invoke, Integer.valueOf(i))).booleanValue();
                StringBuilder sb = new StringBuilder();
                sb.append("app is ");
                sb.append(z ? "foreground" : "background");
                sb.append(", uid=");
                sb.append(i);
                C8783oo0oooOO.OooO0o(sb.toString());
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (IllegalAccessException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20410OooO00o(Context context) {
        return OooO00o(OooO00o(context));
    }
}
