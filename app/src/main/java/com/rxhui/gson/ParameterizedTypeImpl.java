package com.rxhui.gson;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ParameterizedTypeImpl implements ParameterizedType {
    public final Type[] args;
    public final Class raw;

    public ParameterizedTypeImpl(Class cls, Type[] typeArr) {
        this.raw = cls;
        this.args = typeArr == null ? new Type[0] : typeArr;
    }

    public Type[] getActualTypeArguments() {
        return this.args;
    }

    public Type getOwnerType() {
        return null;
    }

    public Type getRawType() {
        return this.raw;
    }
}
