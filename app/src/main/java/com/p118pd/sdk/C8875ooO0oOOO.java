package com.p118pd.sdk;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.ooO0oOOO  reason: case insensitive filesystem */
public class C8875ooO0oOOO {
    public static final String OooO00o = "ReflectionUtil";

    public static Object OooO00o(Object obj, String str, Object[] objArr) {
        return OooO00o(obj, str, objArr, null);
    }

    public static Object OooO00o(Object obj, String str, Object[] objArr, Class<?>[] clsArr) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            Class<?> cls = obj.getClass();
            if (clsArr == null && objArr != null) {
                try {
                    clsArr = new Class[objArr.length];
                    for (int i = 0; i < objArr.length; i++) {
                        clsArr[i] = objArr[i].getClass();
                    }
                } catch (NoSuchMethodException unused) {
                    AbstractC8796ooO0000o.OooO0O0(OooO00o, "method " + str + " not found in " + obj.getClass().getName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            Method method = cls.getMethod(str, clsArr);
            method.setAccessible(true);
            return method.invoke(obj, objArr);
        }
        return null;
    }

    public static Object OooO00o(Object obj, String str) {
        if (obj != null && !TextUtils.isEmpty(str)) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField.get(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AbstractC8796ooO0000o.OooO0O0(OooO00o, "get field " + str + " not found in " + obj.getClass().getName());
        }
        return null;
    }

    public static void OooO00o(Object obj, String str, Object obj2) {
        if (!(obj == null || TextUtils.isEmpty(str))) {
            for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    declaredField.set(obj, obj2);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            AbstractC8796ooO0000o.OooO0O0(OooO00o, "set field " + str + " not found in " + obj.getClass().getName());
        }
    }
}
