package com.p118pd.sdk;

import android.content.Context;

/* renamed from: com.pd.sdk.o0o00Oo  reason: case insensitive filesystem */
public final class C7560o0o00Oo {
    public static C7560o0o00Oo OooO00o = new C7560o0o00Oo();

    public static C7560o0o00Oo OooO00o() {
        return OooO00o;
    }

    public static String OooO00o(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
