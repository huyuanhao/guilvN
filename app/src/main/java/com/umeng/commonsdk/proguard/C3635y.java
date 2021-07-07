package com.umeng.commonsdk.proguard;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.umeng.commonsdk.proguard.y */
public class C3635y {
    /* renamed from: a */
    public static AbstractC3634x m9653a(Class<? extends AbstractC3634x> cls, int i) {
        try {
            return (AbstractC3634x) cls.getMethod("findByValue", Integer.TYPE).invoke(null, Integer.valueOf(i));
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
