package com.umeng.commonsdk.proguard;

import android.content.Context;
import java.lang.reflect.Method;

/* renamed from: com.umeng.commonsdk.proguard.i */
public class C3609i implements AbstractC3605e {

    /* renamed from: a */
    public static Object f9300a;

    /* renamed from: b */
    public static Class<?> f9301b;

    /* renamed from: c */
    public static Method f9302c;

    public C3609i() {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            f9301b = cls;
            f9300a = cls.newInstance();
            f9302c = f9301b.getMethod("getOAID", Context.class);
        } catch (Exception unused) {
        }
    }

    @Override // com.umeng.commonsdk.proguard.AbstractC3605e
    /* renamed from: a */
    public String mo38983a(Context context) {
        return m9490a(context, f9302c);
    }

    /* renamed from: a */
    public static String m9490a(Context context, Method method) {
        Object obj = f9300a;
        if (obj == null || method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(obj, context);
            if (invoke != null) {
                return (String) invoke;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
