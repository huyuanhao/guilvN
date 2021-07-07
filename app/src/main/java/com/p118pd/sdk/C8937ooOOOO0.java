package com.p118pd.sdk;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import java.util.List;

/* renamed from: com.pd.sdk.ooOOOO0  reason: case insensitive filesystem */
public class C8937ooOOOO0 {
    public C8937ooOOOO0() {
        throw new UnsupportedOperationException("can't create this object...");
    }

    public static String OooO00o(Context context) {
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getRunningAppProcesses();
        if (!runningAppProcesses.isEmpty() && runningAppProcesses.size() != 0) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
        }
        return "";
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20596OooO00o(Context context) {
        return context.getPackageName().equals(OooO00o(context));
    }
}
