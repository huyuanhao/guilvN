package com.alibaba.sdk.android.utils.crashdefend;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.p118pd.sdk.C5982OoooOoO;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.e */
public class C0337e {
    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(2:29|30)|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a6, code lost:
        if (r0 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m627a(android.content.Context r8, com.alibaba.sdk.android.utils.crashdefend.C0332a r9, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C0335c> r10) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C0337e.m627a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|(2:21|22)|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        if (r1 != null) goto L_0x0049;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0066 A[Catch:{ FileNotFoundException -> 0x005d, IOException -> 0x005a, Exception -> 0x0057, all -> 0x004d, all -> 0x0054 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0068 A[SYNTHETIC, Splitter:B:41:0x0068] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m629a(android.content.Context r9, com.alibaba.sdk.android.utils.crashdefend.C0332a r10, java.util.List<com.alibaba.sdk.android.utils.crashdefend.C0335c> r11) {
        /*
        // Method dump skipped, instructions count: 238
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.crashdefend.C0337e.m629a(android.content.Context, com.alibaba.sdk.android.utils.crashdefend.a, java.util.List):boolean");
    }

    /* renamed from: a */
    public static boolean m628a(Context context) {
        return context.getPackageName().equalsIgnoreCase(m626a(context));
    }

    /* renamed from: a */
    public static String m626a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        int myPid = Process.myPid();
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }
}
