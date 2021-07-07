package com.megvii.meglive_sdk.p098d;

import android.content.Context;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.megvii.meglive_sdk.d.c */
public final class C1523c {

    /* renamed from: a */
    public static C1523c f2155a;

    /* renamed from: b */
    public Object f2156b = null;

    /* renamed from: c */
    public Class f2157c = null;

    public C1523c(Context context) {
        try {
            Class<?> cls = Class.forName("com.megvii.apo.PhoneFingerManager");
            this.f2157c = cls;
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AccessibleObject.setAccessible(declaredConstructors, true);
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.isAccessible()) {
                    this.f2156b = constructor.newInstance(context);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C1523c m2305a(Context context) {
        C1523c cVar;
        synchronized (C1523c.class) {
            if (f2155a == null) {
                f2155a = new C1523c(context);
            }
            cVar = f2155a;
        }
        return cVar;
    }

    /* renamed from: a */
    public final String mo17000a() {
        Class cls = this.f2157c;
        if (!(cls == null || this.f2156b == null)) {
            try {
                return (String) cls.getMethod("xx", new Class[0]).invoke(this.f2156b, new Object[0]);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return "";
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return "";
            }
        }
        return "";
    }
}
