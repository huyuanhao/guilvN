package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.pd.sdk.oo0O00O0  reason: case insensitive filesystem */
public class C8592oo0O00O0 {
    public static SharedPreferences OooO00o(Context context, String str) {
        return context.getSharedPreferences(m20237OooO00o(context, str), 0);
    }

    public static Object OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        if (sharedPreferences == null || str == null || str.isEmpty()) {
            return "";
        }
        try {
            if (obj instanceof Boolean) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if (obj instanceof Float) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if (obj instanceof Integer) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if (obj instanceof Long) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
            if (obj instanceof String) {
                return sharedPreferences.getString(str, (String) obj);
            }
            return obj;
        } catch (ClassCastException unused) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalyticsSharedPreference", "getInfoFromSP() class cast Exception !");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20237OooO00o(Context context, String str) {
        String packageName = context.getPackageName();
        return "hianalytics_" + str + "_" + packageName;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m20238OooO00o(SharedPreferences sharedPreferences, String str, Object obj) {
        if (sharedPreferences != null && str != null && !str.isEmpty()) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (obj instanceof Boolean) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                edit.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                edit.putLong(str, ((Long) obj).longValue());
            } else {
                edit.putString(str, (String) obj);
            }
            edit.commit();
        }
    }
}
