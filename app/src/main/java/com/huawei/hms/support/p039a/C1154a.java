package com.huawei.hms.support.p039a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.huawei.hms.support.a.a */
public final class C1154a {
    /* renamed from: a */
    public static Class<?> m1132a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            if (typeVariable.getBounds().length == 0) {
                return Object.class;
            }
            return m1132a(typeVariable.getBounds()[0]);
        }
        throw new IllegalArgumentException("not supported: " + type.getClass());
    }
}
