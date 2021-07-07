package com.megvii.apo.util;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.megvii.apo.util.k */
public final class C1501k {
    /* renamed from: a */
    public static void m2274a(Context context, String str, Object obj) {
        try {
            String simpleName = obj.getClass().getSimpleName();
            SharedPreferences.Editor edit = context.getSharedPreferences("m_p_f", 0).edit();
            if ("Integer".equals(simpleName)) {
                edit.putInt(str, ((Integer) obj).intValue());
            } else if ("Boolean".equals(simpleName)) {
                edit.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if ("String".equals(simpleName)) {
                edit.putString(str, (String) obj);
            } else if ("Float".equals(simpleName)) {
                edit.putFloat(str, ((Float) obj).floatValue());
            } else if ("Long".equals(simpleName)) {
                edit.putLong(str, ((Long) obj).longValue());
            }
            edit.apply();
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }

    /* renamed from: b */
    public static Object m2275b(Context context, String str, Object obj) {
        try {
            String simpleName = obj.getClass().getSimpleName();
            SharedPreferences sharedPreferences = context.getSharedPreferences("m_p_f", 0);
            if ("Integer".equals(simpleName)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(simpleName)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, Boolean.valueOf(obj.toString()).booleanValue()));
            }
            if ("String".equals(simpleName)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Float".equals(simpleName)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(simpleName)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
            return obj;
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }
}
