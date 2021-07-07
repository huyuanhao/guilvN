package com.megvii.meglive_sdk.p106f;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.megvii.meglive_sdk.f.z */
public final class C1585z {
    /* renamed from: a */
    public static void m2694a(Context context, String str, Object obj) {
        if (context != null) {
            SharedPreferences.Editor edit = context.getSharedPreferences("meglive_data", 0).edit();
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

    /* renamed from: b */
    public static Object m2695b(Context context, String str, Object obj) {
        if (context == null) {
            return obj;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("meglive_data", 0);
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
        return obj instanceof String ? sharedPreferences.getString(str, (String) obj) : obj;
    }
}
