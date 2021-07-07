package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.FullLifecycleObserverAdapter;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.pd.sdk.o00oOo0o  reason: case insensitive filesystem */
public class C7204o00oOo0o {
    public static final int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Map<Class, Integer> f19693OooO00o = new HashMap();
    public static final int OooO0O0 = 2;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static Map<Class, List<Constructor<? extends AbstractC7197o00oOOOo>>> f19694OooO0O0 = new HashMap();

    @NonNull
    public static AbstractC7199o00oOOo0 OooO00o(Object obj) {
        if (obj instanceof AbstractC7196o00oOOOO) {
            return new FullLifecycleObserverAdapter((AbstractC7196o00oOOOO) obj);
        }
        if (obj instanceof AbstractC7199o00oOOo0) {
            return (AbstractC7199o00oOOo0) obj;
        }
        Class<?> cls = obj.getClass();
        if (OooO00o(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List<Constructor<? extends AbstractC7197o00oOOOo>> list = f19694OooO0O0.get(cls);
        if (list.size() == 1) {
            return new SingleGeneratedAdapterObserver(OooO00o(list.get(0), obj));
        }
        AbstractC7197o00oOOOo[] o00oooooArr = new AbstractC7197o00oOOOo[list.size()];
        for (int i = 0; i < list.size(); i++) {
            o00oooooArr[i] = OooO00o(list.get(i), obj);
        }
        return new CompositeGeneratedAdaptersObserver(o00oooooArr);
    }

    public static int OooO0O0(Class<?> cls) {
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends AbstractC7197o00oOOOo> OooO00o2 = m18689OooO00o(cls);
        if (OooO00o2 != null) {
            f19694OooO0O0.put(cls, Collections.singletonList(OooO00o2));
            return 2;
        } else if (C7194o00oOO.f19685OooO00o.m18686OooO00o((Class) cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (m18690OooO00o((Class<?>) superclass)) {
                if (OooO00o((Class<?>) superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f19694OooO0O0.get(superclass));
            }
            Class<?>[] interfaces = cls.getInterfaces();
            for (Class<?> cls2 : interfaces) {
                if (m18690OooO00o(cls2)) {
                    if (OooO00o(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f19694OooO0O0.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f19694OooO0O0.put(cls, arrayList);
            return 2;
        }
    }

    public static AbstractC7197o00oOOOo OooO00o(Constructor<? extends AbstractC7197o00oOOOo> constructor, Object obj) {
        try {
            return (AbstractC7197o00oOOOo) constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Constructor<? extends AbstractC7197o00oOOOo> m18689OooO00o(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String OooO00o2 = OooO00o(canonicalName);
            if (!name.isEmpty()) {
                OooO00o2 = name + C9058ooOoOoOO.OooOO0 + OooO00o2;
            }
            Constructor declaredConstructor = Class.forName(OooO00o2).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static int OooO00o(Class<?> cls) {
        if (f19693OooO00o.containsKey(cls)) {
            return f19693OooO00o.get(cls).intValue();
        }
        int OooO0O02 = OooO0O0(cls);
        f19693OooO00o.put(cls, Integer.valueOf(OooO0O02));
        return OooO0O02;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18690OooO00o(Class<?> cls) {
        return cls != null && AbstractC7200o00oOOoO.class.isAssignableFrom(cls);
    }

    public static String OooO00o(String str) {
        return str.replace(C9058ooOoOoOO.OooOO0, "_") + "_LifecycleAdapter";
    }
}
