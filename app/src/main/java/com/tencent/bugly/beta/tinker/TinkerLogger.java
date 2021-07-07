package com.tencent.bugly.beta.tinker;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import com.tencent.tinker.lib.util.TinkerLog;

public class TinkerLogger implements TinkerLog.TinkerLogImp {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_NONE = 5;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARNING = 3;
    public static final String TAG = "Tinker.TinkerLogger";
    public static int level;

    public static int getLogLevel() {
        return level;
    }

    public static void setLevel(int i) {
        level = i;
        String str = "new log level: " + i;
    }

    /* renamed from: d */
    public void mo37937d(String str, String str2, Object... objArr) {
        if (level <= 1 && objArr != null) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: e */
    public void mo37938e(String str, String str2, Object... objArr) {
        if (level <= 4 && objArr != null) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: i */
    public void mo37939i(String str, String str2, Object... objArr) {
        if (level <= 2) {
            if (objArr != null) {
                str2 = String.format(str2, objArr);
            }
            Log.i(str, str2);
        }
    }

    public void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        if (objArr != null) {
            str2 = String.format(str2, objArr);
        }
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2 + GlideException.OooO00o.o0ooOoO + Log.getStackTraceString(th);
    }

    /* renamed from: v */
    public void mo37941v(String str, String str2, Object... objArr) {
        if (level <= 0 && objArr != null) {
            String.format(str2, objArr);
        }
    }

    /* renamed from: w */
    public void mo37942w(String str, String str2, Object... objArr) {
        if (level <= 3 && objArr != null) {
            String.format(str2, objArr);
        }
    }
}
