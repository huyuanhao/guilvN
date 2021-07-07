package com.p118pd.sdk;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.oo0o0O0  reason: case insensitive filesystem */
public final class C8702oo0o0O0 {
    public static final String OooO00o = "EnvironmentCompat";
    public static final String OooO0O0 = "unknown";

    public static String OooO00o(File file) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
            return "unknown";
        } catch (IOException e) {
            String str = "Failed to resolve canonical path: " + e;
            return "unknown";
        }
    }
}
