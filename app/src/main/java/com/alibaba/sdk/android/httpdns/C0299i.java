package com.alibaba.sdk.android.httpdns;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alibaba.sdk.android.httpdns.i */
public class C0299i {

    /* renamed from: a */
    public static ILogger f651a = null;

    /* renamed from: c */
    public static int f652c = -1;

    /* renamed from: c */
    public static boolean f653c;

    /* renamed from: a */
    public static void m532a(Throwable th) {
        if (f653c && th != null) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    public static String m533b() {
        try {
            if (f652c == -1) {
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (stackTrace[i].getMethodName().equals("getTraceInfo")) {
                        f652c = i2 + 1;
                        break;
                    } else {
                        i2++;
                        i++;
                    }
                }
            }
            StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[f652c + 1];
            return stackTraceElement.getFileName() + Constants.COLON_SEPARATOR + stackTraceElement.getLineNumber() + " - [" + stackTraceElement.getMethodName() + "]";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static void m534d(String str) {
        if (f653c && str != null) {
            String str2 = Thread.currentThread().getId() + " - " + m533b() + " - " + str;
        }
        ILogger iLogger = f651a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: e */
    public static void m535e(String str) {
        if (f653c && str != null) {
            Log.i("HttpDnsSDK", Thread.currentThread().getId() + " - " + m533b() + " - " + str);
        }
        ILogger iLogger = f651a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    /* renamed from: f */
    public static void m536f(String str) {
        if (f653c && str != null) {
            String str2 = Thread.currentThread().getId() + " - " + m533b() + " - " + str;
        }
        ILogger iLogger = f651a;
        if (iLogger != null) {
            iLogger.log(str);
        }
    }

    public static synchronized void setLogEnabled(boolean z) {
        synchronized (C0299i.class) {
            f653c = z;
        }
    }

    public static void setLogger(ILogger iLogger) {
        f651a = iLogger;
    }
}
