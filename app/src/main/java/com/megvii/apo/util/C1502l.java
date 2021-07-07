package com.megvii.apo.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.umeng.message.proguard.C3848l;
import java.lang.reflect.Method;

/* renamed from: com.megvii.apo.util.l */
public final class C1502l {
    /* renamed from: a */
    public static Class[] m2278a(String str, int i) {
        Class<?>[] clsArr = null;
        try {
            Method[] declaredMethods = TelephonyManager.class.getDeclaredMethods();
            for (int i2 = 0; i2 < declaredMethods.length; i2++) {
                if (str.equals(declaredMethods[i2].getName())) {
                    clsArr = declaredMethods[i2].getParameterTypes();
                    if (clsArr.length >= i) {
                        break;
                    }
                }
            }
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return clsArr;
    }

    /* renamed from: a */
    public static String m2277a(Context context, int i, int i2, String str, int i3) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT < i3) {
                return null;
            }
            Method method = telephonyManager.getClass().getMethod(str, m2278a(str, i2));
            if (i2 == 0) {
                return String.valueOf(method.invoke(telephonyManager, new Object[0]));
            }
            if (i < 0) {
                return null;
            }
            return String.valueOf(method.invoke(telephonyManager, Integer.valueOf(i)));
        } catch (Throwable th) {
            C1495e.m2258a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static int m2276a(Context context, int i) {
        Uri parse = Uri.parse(C1493c.m2253a("mJwG/DRqhwoKX/pOfZwtH+C6a/IUNtL8+dtMacFKxXQ="));
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(parse, new String[]{C3848l.f10389g, "sim_id"}, "sim_id = ?", new String[]{String.valueOf(i)}, null);
            if (cursor == null || !cursor.moveToFirst()) {
                if (cursor == null) {
                    return -1;
                }
                cursor.close();
                return -1;
            }
            int i2 = cursor.getInt(cursor.getColumnIndex(C3848l.f10389g));
            if (cursor != null) {
                cursor.close();
            }
            return i2;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
