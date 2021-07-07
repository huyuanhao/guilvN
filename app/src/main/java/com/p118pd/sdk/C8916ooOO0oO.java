package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.util.Log;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.commonsdk.proguard.C3617o;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.ooOO0oO  reason: case insensitive filesystem */
public class C8916ooOO0oO {
    public static double OooO00o;

    public static Map<String, String> OooO00o(Context context, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", str);
        hashMap.put(C3617o.f9393v, m20567OooO00o());
        hashMap.put(C8912ooOO0o0.OooOO0O, OooO0Oo(context));
        hashMap.put("device_current_memory", OooO0OO(context));
        hashMap.put("batLevel", OooO00o(context));
        hashMap.put("diskTotal", Long.toString(OooO0O0() + OooO0Oo()));
        hashMap.put("diskCurrent", Long.toString(m20566OooO00o() + OooO0OO()));
        hashMap.put("onLine", OooO0o(context));
        hashMap.put("orientation", OooO0O0(context));
        hashMap.put(C8912ooOO0o0.OooOO0o, OooO0o0(context));
        return hashMap;
    }

    public static long OooO0O0() {
        if (Build.VERSION.SDK_INT < 18) {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
        }
        StatFs statFs2 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
    }

    public static String OooO0OO(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
        double OooO00o2 = OooO00o();
        double d = (double) ((memoryInfo.availMem / 1048576) / 1024);
        Double.isNaN(d);
        return Double.toString(OooO00o2 - d);
    }

    public static String OooO0Oo(Context context) {
        return Double.toString(OooO00o());
    }

    public static String OooO0o(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isAvailable() || !connectivityManager.getActiveNetworkInfo().isConnected()) ? "false" : "true";
        } catch (Exception unused) {
            if (!C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                return null;
            }
            String str = LogCollectorManager.TAG;
            return null;
        }
    }

    public static String OooO0o0(Context context) {
        return String.valueOf(((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss() / 1024);
    }

    public static long OooO0Oo() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 18) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1048576;
        }
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        return (statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / 1048576;
    }

    public static long OooO0OO() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 18) {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
            return ((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) - (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) / 1048576;
        }
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        return ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) - (statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong())) / 1048576;
    }

    public static String OooO0O0(Context context) {
        int i = context.getResources().getConfiguration().orientation;
        if (i == 0) {
            return "Unknown";
        }
        if (i == 1) {
            return "Portrait";
        }
        if (i == 2) {
            return "Landscape";
        }
        if (i != 3) {
            return null;
        }
        return "Square";
    }

    @TargetApi(21)
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20567OooO00o() {
        if (Build.VERSION.SDK_INT < 21) {
            return Build.CPU_ABI;
        }
        return Build.SUPPORTED_ABIS[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[SYNTHETIC, Splitter:B:23:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e A[SYNTHETIC, Splitter:B:35:0x006e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static double OooO00o() {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8916ooOO0oO.OooO00o():double");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m20566OooO00o() {
        if (Build.VERSION.SDK_INT < 18) {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            return ((((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) - (((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()))) / 1048576;
        }
        StatFs statFs2 = new StatFs(Environment.getRootDirectory().getAbsolutePath());
        return ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) - (statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong())) / 1048576;
    }

    public static String OooO00o(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra(C8912ooOO0o0.OooO0O0, -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    return Float.toString((((float) intExtra) / ((float) intExtra2)) * 100.0f);
                }
            }
        } catch (Exception unused) {
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                Log.i(LogCollectorManager.TAG, "Can't get batter level");
            }
        }
        return null;
    }
}
