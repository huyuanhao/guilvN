package com.p118pd.sdk;

import android.os.Environment;
import java.io.File;

/* renamed from: com.pd.sdk.o0o00o  reason: case insensitive filesystem */
public final class C7564o0o00o {
    public static String OooO00o(String str) {
        try {
            if (!OooO00o()) {
                return null;
            }
            File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), str);
            if (!file.exists()) {
                return null;
            }
            file.delete();
            return "";
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean OooO00o() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }
}
