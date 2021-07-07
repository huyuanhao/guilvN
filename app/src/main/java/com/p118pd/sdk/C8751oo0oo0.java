package com.p118pd.sdk;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: com.pd.sdk.oo0oo0  reason: case insensitive filesystem */
public final class C8751oo0oo0 {
    public static final String OooO00o = "PackerNg";
    public static final String OooO0O0 = "";
    public static String OooO0OO;

    public static String OooO00o(File file) {
        try {
            return C8754oo0oo00O.OooO00o(file);
        } catch (Exception unused) {
            return "";
        }
    }

    public static synchronized String OooO0O0(Context context) throws IOException {
        String OooO00o2;
        synchronized (C8751oo0oo0.class) {
            OooO00o2 = C8754oo0oo00O.OooO00o(new File(context.getApplicationInfo().sourceDir));
        }
        return OooO00o2;
    }

    public static String OooO00o(Context context) {
        try {
            return OooO0O0(context);
        } catch (Exception unused) {
            return "";
        }
    }
}
