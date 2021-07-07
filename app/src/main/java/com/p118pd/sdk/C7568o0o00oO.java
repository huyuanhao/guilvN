package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: com.pd.sdk.o0o00oO  reason: case insensitive filesystem */
public final class C7568o0o00oO {
    public static String OooO00o(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void OooO00o(Context context, String str, Map<String, String> map) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        if (edit != null) {
            for (String str2 : map.keySet()) {
                edit.putString(str2, map.get(str2));
            }
            edit.commit();
        }
    }
}
