package com.xiaomi.push;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.push.ba */
public class C4278ba {

    /* renamed from: a */
    public static final Map<Class<?>, Class<?>> f11415a;

    /* renamed from: com.xiaomi.push.ba$a */
    public static class C4279a<T> {

        /* renamed from: a */
        public final Class<? extends T> f11416a;

        /* renamed from: a */
        public final T f11417a;
    }

    static {
        HashMap hashMap = new HashMap();
        f11415a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        f11415a.put(Byte.class, Byte.TYPE);
        f11415a.put(Character.class, Character.TYPE);
        f11415a.put(Short.class, Short.TYPE);
        f11415a.put(Integer.class, Integer.TYPE);
        f11415a.put(Float.class, Float.TYPE);
        f11415a.put(Long.class, Long.TYPE);
        f11415a.put(Double.class, Double.TYPE);
        Map<Class<?>, Class<?>> map = f11415a;
        Class<?> cls = Boolean.TYPE;
        map.put(cls, cls);
        Map<Class<?>, Class<?>> map2 = f11415a;
        Class<?> cls2 = Byte.TYPE;
        map2.put(cls2, cls2);
        Map<Class<?>, Class<?>> map3 = f11415a;
        Class<?> cls3 = Character.TYPE;
        map3.put(cls3, cls3);
        Map<Class<?>, Class<?>> map4 = f11415a;
        Class<?> cls4 = Short.TYPE;
        map4.put(cls4, cls4);
        Map<Class<?>, Class<?>> map5 = f11415a;
        Class<?> cls5 = Integer.TYPE;
        map5.put(cls5, cls5);
        Map<Class<?>, Class<?>> map6 = f11415a;
        Class<?> cls6 = Float.TYPE;
        map6.put(cls6, cls6);
        Map<Class<?>, Class<?>> map7 = f11415a;
        Class<?> cls7 = Long.TYPE;
        map7.put(cls7, cls7);
        Map<Class<?>, Class<?>> map8 = f11415a;
        Class<?> cls8 = Double.TYPE;
        map8.put(cls8, cls8);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:7:0x0010 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0010 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Class<? extends java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Class] */
    /* renamed from: a */
    public static <T> T m11768a(Class<? extends Object> cls, Object obj, String str) {
        Field field = null;
        while (field == null) {
            try {
                field = cls.getDeclaredField(str);
                field.setAccessible(true);
                continue;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
                continue;
            }
            if (cls == 0) {
                throw new NoSuchFieldException();
            }
        }
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    /* renamed from: a */
    public static <T> T m11769a(Class<? extends Object> cls, String str) {
        try {
            return (T) m11768a(cls, (Object) null, str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m11770a(Class<?> cls, String str, Object... objArr) {
        return (T) m11775a(cls, str, m11778a(objArr)).invoke(null, m11779a(objArr));
    }

    /* renamed from: a */
    public static <T> T m11771a(Object obj, String str) {
        try {
            return (T) m11768a((Class<? extends Object>) obj.getClass(), obj, str);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m11772a(Object obj, String str, Object... objArr) {
        try {
            return (T) m11780b(obj, str, objArr);
        } catch (Exception unused) {
            String str2 = "Meet exception when call Method '" + str + "' in " + obj;
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m11773a(String str, String str2) {
        try {
            return (T) m11768a((Class<? extends Object>) C4688t.m14219a(null, str), (Object) null, str2);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (ClassNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static <T> T m11774a(String str, String str2, Object... objArr) {
        try {
            return (T) m11770a(C4688t.m14219a(null, str), str2, objArr);
        } catch (Exception unused) {
            String str3 = "Meet exception when call Method '" + str2 + "' in " + str;
            return null;
        }
    }

    /* renamed from: a */
    public static Method m11775a(Class<?> cls, String str, Class<?>... clsArr) {
        Method a = m11776a(cls.getDeclaredMethods(), str, clsArr);
        if (a != null) {
            a.setAccessible(true);
            return a;
        } else if (cls.getSuperclass() != null) {
            return m11775a((Class<?>) cls.getSuperclass(), str, clsArr);
        } else {
            throw new NoSuchMethodException();
        }
    }

    /* renamed from: a */
    public static Method m11776a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m11777a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    public static boolean m11777a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!(clsArr2[i] == null || clsArr[i].isAssignableFrom(clsArr2[i]) || (f11415a.containsKey(clsArr[i]) && f11415a.get(clsArr[i]).equals(f11415a.get(clsArr2[i]))))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static Class<?>[] m11778a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C4279a)) {
                clsArr[i] = obj == null ? null : obj.getClass();
            } else {
                clsArr[i] = ((C4279a) obj).f11416a;
            }
        }
        return clsArr;
    }

    /* renamed from: a */
    public static Object[] m11779a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null || !(obj instanceof C4279a)) {
                objArr2[i] = obj;
            } else {
                objArr2[i] = ((C4279a) obj).f11417a;
            }
        }
        return objArr2;
    }

    /* renamed from: b */
    public static <T> T m11780b(Object obj, String str, Object... objArr) {
        return (T) m11775a(obj.getClass(), str, m11778a(objArr)).invoke(obj, m11779a(objArr));
    }
}
