package com.p118pd.sdk;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.C4841b;

/* renamed from: com.pd.sdk.o0oOo0o0  reason: case insensitive filesystem */
public final class C7640o0oOo0o0 implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        TreeMap treeMap = new TreeMap();
        Class<?> cls = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (cls.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object obj2 = null;
                    if (!(field == null || obj == null || "this$0".equals(field.getName()))) {
                        boolean isAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj3 = field.get(obj);
                        if (obj3 != null) {
                            field.setAccessible(isAccessible);
                            obj2 = C7460o0Oo0OOO.OooO00o(obj3);
                        }
                    }
                    if (obj2 != null) {
                        treeMap.put(field.getName(), obj2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        if (!obj.getClass().equals(C4841b.class)) {
            return null;
        }
        C4841b bVar = (C4841b) obj;
        Class cls = (Class) type;
        Object newInstance = cls.newInstance();
        while (!cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (bVar.mo45547b(name)) {
                        field.setAccessible(true);
                        field.set(newInstance, C7633o0oOo000.OooO00o(bVar.mo45545a(name), genericType));
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return newInstance;
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return true;
    }
}
