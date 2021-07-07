package com.umeng.socialize.utils;

import android.os.Bundle;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import org.json.JSONArray;
import org.json.JSONObject;

public class SLog {
    public static boolean DEBUG = true;

    /* renamed from: E */
    public static final int f10864E = 0;

    /* renamed from: I */
    public static final int f10865I = 2;
    public static final String PRIVATE = "priviteSocial";
    public static final String TAG = "Social";

    /* renamed from: AQ */
    public static void m10855AQ(String str, String str2) {
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.m9006aq(TAG, 0, str, str2);
    }

    public static void BUNDLE(Bundle bundle) {
        if (UMConfigure.umDebugLog != null) {
            UMLog.bundle(TAG, 2, bundle);
        }
    }

    /* renamed from: E */
    public static void m10856E(String str) {
        if (UMConfigure.umDebugLog != null) {
            String[] split = str.split("\n");
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, split);
        }
    }

    /* renamed from: I */
    public static void m10857I(String str) {
        if (UMConfigure.umDebugLog != null) {
            String[] split = str.split("\n");
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 2, split);
        }
    }

    public static void JARRY(JSONArray jSONArray) {
        if (UMConfigure.umDebugLog != null) {
            UMLog.jsonArry(TAG, jSONArray);
        }
    }

    public static void JSON(JSONObject jSONObject) {
        if (UMConfigure.umDebugLog != null) {
            UMLog.jsonObject(TAG, jSONObject);
        }
    }

    /* renamed from: TE */
    public static void m10858TE(String str, String str2) {
        if (UMConfigure.umDebugLog != null) {
            String[] split = str2.split("\n");
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo("Social_" + str, 0, split);
        }
    }

    /* renamed from: TI */
    public static void m10859TI(String str, String str2) {
        if (UMConfigure.umDebugLog != null) {
            String[] split = str2.split("\n");
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo("Social_" + str, 2, split);
        }
    }

    public static void debug(String str) {
        if (UMConfigure.umDebugLog != null && DEBUG) {
            UMLog.mutlInfo(PRIVATE, 2, "[private log]  " + str);
        }
    }

    public static void error(Throwable th) {
        if (UMConfigure.umDebugLog != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = 2;
            String[] strArr = new String[(stackTrace.length + 2)];
            strArr[0] = "错误信息如下:";
            strArr[1] = "错误类型:" + th.getMessage();
            for (StackTraceElement stackTraceElement : stackTrace) {
                strArr[i] = "        at\t " + stackTraceElement.toString();
                i++;
            }
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, strArr);
        }
    }

    public static boolean isDebug() {
        if (UMConfigure.umDebugLog != null) {
            return UMConfigure.isDebugLog();
        }
        return false;
    }

    public static void mutlE(String... strArr) {
        UMLog uMLog = UMConfigure.umDebugLog;
        UMLog.mutlInfo(TAG, 0, strArr);
    }

    public static void mutlI(String... strArr) {
        if (UMConfigure.umDebugLog != null) {
            UMLog.mutlInfo(TAG, 2, strArr);
        }
    }

    public static void runtimePrint(String str) {
        UMRTLog.m9011e(PRIVATE, str);
    }

    public static void selfLog(String str) {
    }

    public static void welcome() {
        UMConfigure.isDebugLog();
    }

    public static void error(String str, Throwable th) {
        if (!(UMConfigure.umDebugLog == null || th == null)) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = 2;
            String[] strArr = new String[(stackTrace.length + 2)];
            strArr[0] = str;
            strArr[1] = "错误类型:" + th.getMessage();
            for (StackTraceElement stackTraceElement : stackTrace) {
                strArr[i] = "        at\t " + stackTraceElement.toString();
                i++;
            }
            UMLog uMLog = UMConfigure.umDebugLog;
            UMLog.mutlInfo(TAG, 0, strArr);
        }
    }
}
