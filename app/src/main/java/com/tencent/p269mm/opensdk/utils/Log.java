package com.tencent.p269mm.opensdk.utils;

/* renamed from: com.tencent.mm.opensdk.utils.Log */
public class Log {
    public static ILog logImpl;

    /* renamed from: d */
    public static void m8650d(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo38612d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m8651e(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo38613e(str, str2);
        }
    }

    /* renamed from: i */
    public static void m8652i(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog == null) {
            android.util.Log.i(str, str2);
        } else {
            iLog.mo38614i(str, str2);
        }
    }

    public static void setLogImpl(ILog iLog) {
        logImpl = iLog;
    }

    /* renamed from: v */
    public static void m8653v(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo38615v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m8654w(String str, String str2) {
        ILog iLog = logImpl;
        if (iLog != null) {
            iLog.mo38616w(str, str2);
        }
    }
}
