package com.p118pd.sdk;

import android.util.Log;
import com.p273uc.crashsdk.JNIBridge;

/* renamed from: com.pd.sdk.ooOooo0O  reason: case insensitive filesystem */
public final class C9090ooOooo0O {
    public static void OooO00o(String str) {
        C9120oooO00oO.m20855OooO0OO();
    }

    public static void OooO0O0(String str) {
        C9120oooO00oO.m20855OooO0OO();
    }

    public static void OooO0OO(String str, String str2) {
        if (C9112oooO000O.f22506OooO0Oo) {
            JNIBridge.nativeLog(5, str, str2);
        }
    }

    public static void OooO0Oo(String str, String str2) {
        if (C9112oooO000O.f22506OooO0Oo) {
            JNIBridge.nativeLog(6, str, str2);
        }
    }

    public static void OooO00o(String str, String str2) {
        if (C9120oooO00oO.m20855OooO0OO()) {
            Log.i(str, str2);
        }
    }

    public static void OooO0O0(String str, String str2) {
        if (C9112oooO000O.f22506OooO0Oo) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    public static void OooO00o(String str, String str2, Throwable th) {
        if (!C9120oooO00oO.m20855OooO0OO() || th == null) {
        }
    }
}
