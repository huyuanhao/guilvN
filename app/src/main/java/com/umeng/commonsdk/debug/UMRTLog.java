package com.umeng.commonsdk.debug;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

public class UMRTLog {
    public static final String RTLOG_ENABLE = "1";
    public static final String RTLOG_PROP = "debug.umeng.rtlog";
    public static final String RTLOG_TAG = "MobclickRT";

    /* renamed from: d */
    public static void m9010d(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* renamed from: e */
    public static void m9011e(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static String getSystemProperty(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    /* renamed from: i */
    public static void m9012i(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, false));
        }
    }

    /* renamed from: sd */
    public static void m9013sd(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* renamed from: se */
    public static void m9014se(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    public static boolean shouldOutput() {
        return "1".equals(getSystemProperty(RTLOG_PROP, "0"));
    }

    /* renamed from: si */
    public static void m9015si(String str, String str2) {
        if (shouldOutput()) {
            Log.i(str, warpperMsg(str2, true));
        }
    }

    /* renamed from: sv */
    public static void m9016sv(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* renamed from: sw */
    public static void m9017sw(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, true);
        }
    }

    /* renamed from: v */
    public static void m9018v(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    /* renamed from: w */
    public static void m9019w(String str, String str2) {
        if (shouldOutput()) {
            warpperMsg(str2, false);
        }
    }

    public static String warpperMsg(String str, boolean z) {
        if (!z) {
            return str;
        }
        StringBuffer stringBuffer = null;
        try {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length >= 3) {
                String fileName = stackTrace[2].getFileName();
                String methodName = stackTrace[2].getMethodName();
                int lineNumber = stackTrace[2].getLineNumber();
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("<");
                stringBuffer2.append(fileName);
                stringBuffer2.append(Constants.COLON_SEPARATOR);
                stringBuffer2.append(methodName);
                stringBuffer2.append(Constants.COLON_SEPARATOR);
                stringBuffer2.append(lineNumber);
                stringBuffer2.append("> ");
                stringBuffer2.append(str);
                stringBuffer = stringBuffer2;
            }
            return stringBuffer.toString();
        } catch (Throwable unused) {
            return str;
        }
    }
}
