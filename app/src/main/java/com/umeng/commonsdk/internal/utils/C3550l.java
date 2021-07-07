package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3745b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.l */
public class C3550l {

    /* renamed from: a */
    public static final String f9146a = "UM_PROBE_DATA";

    /* renamed from: b */
    public static final String f9147b = "_dsk_s";

    /* renamed from: c */
    public static final String f9148c = "_thm_z";

    /* renamed from: d */
    public static final String f9149d = "_gdf_r";

    /* renamed from: e */
    public static Object f9150e = new Object();

    /* renamed from: b */
    public static void m9221b(final Context context) {
        if (!m9224c(context)) {
            final String[] strArr = {"unknown", "unknown", "unknown"};
            new Thread() {
                /* class com.umeng.commonsdk.internal.utils.C3550l.C35511 */

                public void run() {
                    super.run();
                    try {
                        if (FieldManager.allow(C3745b.f9822L)) {
                            strArr[0] = C3550l.m9223c();
                        }
                        if (FieldManager.allow(C3745b.f9823M)) {
                            strArr[1] = C3550l.m9217a();
                        }
                        if (FieldManager.allow(C3745b.f9824N)) {
                            strArr[2] = C3550l.m9220b();
                        }
                        ULog.m9829i("diskType = " + strArr[0] + "; ThremalZone = " + strArr[1] + "; GoldFishRc = " + strArr[2]);
                        C3550l.m9222b(context, strArr);
                    } catch (Throwable th) {
                        UMCrashManager.reportCrash(context, th);
                    }
                }
            }.start();
        }
    }

    /* renamed from: c */
    public static boolean m9224c(Context context) {
        SharedPreferences sharedPreferences;
        if (context == null || (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9146a, 0)) == null || TextUtils.isEmpty(sharedPreferences.getString(f9147b, ""))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m9218a(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(f9146a, 0);
            if (sharedPreferences == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            synchronized (f9150e) {
                jSONObject.put(f9147b, sharedPreferences.getString(f9147b, ""));
                jSONObject.put(f9148c, sharedPreferences.getString(f9148c, ""));
                jSONObject.put(f9149d, sharedPreferences.getString(f9149d, ""));
            }
            return jSONObject.toString();
        } catch (Exception e) {
            UMCrashManager.reportCrash(context, e);
            return null;
        }
    }

    /* renamed from: b */
    public static void m9222b(Context context, String[] strArr) {
        SharedPreferences sharedPreferences;
        if (context != null && (sharedPreferences = context.getApplicationContext().getSharedPreferences(f9146a, 0)) != null) {
            synchronized (f9150e) {
                sharedPreferences.edit().putString(f9147b, strArr[0]).putString(f9148c, strArr[1]).putString(f9149d, strArr[2]).commit();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0039 A[SYNTHETIC, Splitter:B:21:0x0039] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m9223c() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0034 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "/proc/diskstats"
            r2.<init>(r3)     // Catch:{ all -> 0x0034 }
            r1.<init>(r2)     // Catch:{ all -> 0x0034 }
        L_0x000d:
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "mtd"
            java.lang.String r3 = "sda"
            java.lang.String r4 = "mmcblk"
            if (r0 == 0) goto L_0x0030
            boolean r5 = r0.contains(r4)
            if (r5 == 0) goto L_0x0021
            r2 = r4
            goto L_0x0037
        L_0x0021:
            boolean r4 = r0.contains(r3)
            if (r4 == 0) goto L_0x0029
            r2 = r3
            goto L_0x0037
        L_0x0029:
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x000d
            goto L_0x0037
        L_0x0030:
            java.lang.String r2 = "unknown"
            goto L_0x0037
        L_0x0033:
            r0 = r1
        L_0x0034:
            java.lang.String r2 = "noper"
            r1 = r0
        L_0x0037:
            if (r1 == 0) goto L_0x003c
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3550l.m9223c():java.lang.String");
    }

    /* renamed from: b */
    public static String m9220b() {
        int i;
        try {
            i = m9216a("ls /", "goldfish");
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return "goldfish";
        }
        return i < 0 ? "noper" : "unknown";
    }

    /* renamed from: a */
    public static int m9216a(String str, String str2) throws IOException {
        int i;
        if (Build.VERSION.SDK_INT > 28) {
            return -1;
        }
        Process exec = Runtime.getRuntime().exec(str);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (readLine.contains(str2)) {
                    i = 1;
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        try {
            if (exec.waitFor() != 0) {
                return -1;
            }
            return i;
        } catch (InterruptedException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static String m9217a() {
        int i;
        try {
            i = m9216a("ls /sys/class/thermal", "thermal_zone");
        } catch (Throwable unused) {
            i = -1;
        }
        if (i > 0) {
            return "thermal_zone";
        }
        return i < 0 ? "noper" : "unknown";
    }
}
