package com.taobao.accs.utl;

import android.util.Log;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.xiaomi.mipush.sdk.Constants;

public class ALog {
    public static final String REFLECT_TLOG = "com.taobao.tlog.adapter.AdapterForTLog";
    public static volatile boolean isUseTlog = false;
    public static String preTag = "NAccs.";

    public enum Level {
        f7183V,
        D,
        I,
        f7184W,
        f7180E,
        L
    }

    static {
        try {
            Class.forName(REFLECT_TLOG);
            isUseTlog = true;
        } catch (ClassNotFoundException unused) {
            isUseTlog = false;
        }
    }

    public static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(formatKv(objArr[i], objArr[i2]));
                i = i2 + 1;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    public static String buildLogTag(String str) {
        return preTag + str;
    }

    /* renamed from: d */
    public static void m7597d(String str, String str2, Object... objArr) {
        if (!isPrintLog(Level.D)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.logd(buildLogTag(str), buildLogMsg(str2, objArr));
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }

    /* renamed from: e */
    public static void m7599e(String str, String str2, Object... objArr) {
        if (!isPrintLog(Level.f7180E)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }

    public static String formatKv(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(Constants.COLON_SEPARATOR);
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    /* renamed from: i */
    public static void m7600i(String str, String str2, Object... objArr) {
        if (!isPrintLog(Level.I)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.logi(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.i(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    @Deprecated
    public static void initALog(String str, int i) {
        preTag = str;
    }

    @Deprecated
    public static boolean isPrintLog() {
        return false;
    }

    public static boolean isPrintLog(Level level) {
        if (!isUseTlog) {
            return true;
        }
        Level level2 = Level.L;
        try {
            level2 = Level.valueOf(AdapterForTLog.getLogLevel());
        } catch (Exception unused) {
        }
        if (level.ordinal() >= level2.ordinal()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static void setEnableTLog(boolean z) {
    }

    @Deprecated
    public static void setPrintLog(boolean z) {
    }

    @Deprecated
    public static void setUseTlog(boolean z) {
        isUseTlog = z;
    }

    /* renamed from: v */
    public static void m7601v(String str, String str2, Object... objArr) {
        if (!isPrintLog(Level.f7183V)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.logv(buildLogTag(str), buildLogMsg(str2, objArr));
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }

    /* renamed from: w */
    public static void m7603w(String str, String str2, Object... objArr) {
        if (!isPrintLog(Level.f7184W)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr));
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }

    /* renamed from: e */
    public static void m7598e(String str, String str2, Throwable th, Object... objArr) {
        if (!isPrintLog(Level.f7180E)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr), th);
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }

    /* renamed from: w */
    public static void m7602w(String str, String str2, Throwable th, Object... objArr) {
        if (!isPrintLog(Level.f7184W)) {
            return;
        }
        if (isUseTlog) {
            AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr), th);
            return;
        }
        buildLogTag(str);
        buildLogMsg(str2, objArr);
    }
}
