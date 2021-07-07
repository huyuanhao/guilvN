package com.qiyukf.basesdk.p138c.p143d;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.qiyukf.basesdk.p119a.C1709a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.c.d.d */
public final class C1863d {
    /* renamed from: a */
    public static String m3546a(Context context) {
        return m3550c(context);
    }

    /* renamed from: a */
    public static void m3547a(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (Throwable th) {
            C1709a.m3011a("service", "start service: " + intent.getComponent() + "error: " + th);
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public static <Params, Progress, Result> void m3548a(AsyncTask<Params, Progress, Result> asyncTask, Params... paramsArr) {
        if (Build.VERSION.SDK_INT <= 10) {
            asyncTask.execute(paramsArr);
        } else {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramsArr);
        }
    }

    /* renamed from: b */
    public static boolean m3549b(Context context) {
        return TextUtils.equals(context.getApplicationInfo().processName, m3550c(context));
    }

    /* renamed from: c */
    public static String m3550c(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        String str = null;
        for (int i = 0; i < 2; i++) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == Process.myPid()) {
                        str = next.processName;
                        break;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
