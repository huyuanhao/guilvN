package com.p118pd.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.o0Oo0oOo  reason: case insensitive filesystem */
public final class C7471o0Oo0oOo {
    public static Class<?> OooO00o(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                type = ((ParameterizedType) type).getRawType();
            } else {
                throw new IllegalArgumentException("TODO");
            }
        }
        return (Class) type;
    }

    public static boolean OooO00o(Class<?> cls) {
        return cls.isPrimitive() || cls.equals(String.class) || cls.equals(Integer.class) || cls.equals(Long.class) || cls.equals(Double.class) || cls.equals(Float.class) || cls.equals(Boolean.class) || cls.equals(Short.class) || cls.equals(Character.class) || cls.equals(Byte.class) || cls.equals(Void.class);
    }
}
