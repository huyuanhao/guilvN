package org.android.spdy;

import android.util.Log;

public class spduLog {
    public static long savedTraffic;

    public static void Logd(String str, String str2) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Loge(String str, String str2) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Logf(String str, String str2) {
        if (str != null && str2 != null) {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Logi(String str, String str2) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            Log.i(str, Thread.currentThread().getId() + " - " + str2);
        }
    }

    public static void Logv(String str, String str2) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void Logw(String str, String str2) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            String str3 = Thread.currentThread().getId() + " - " + str2;
        }
    }

    public static void addTraffic(long j) {
        savedTraffic += j;
    }

    public static long getSavedTraffic() {
        return savedTraffic;
    }

    public static long now() {
        if (SpdyAgent.enableDebug) {
            return System.nanoTime();
        }
        return 0;
    }

    public static void Logd(String str, String str2, long j) {
        if (SpdyAgent.enableDebug && str != null && str2 != null) {
            Log.i(str, Thread.currentThread().getId() + " - " + str2 + ((System.nanoTime() - j) / 1000000));
        }
    }
}
