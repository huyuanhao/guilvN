package com.p118pd.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.json.alipay.C4840a;

/* renamed from: com.pd.sdk.o0Oo0OO  reason: case insensitive filesystem */
public final class C7458o0Oo0OO implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    public static Collection<Object> OooO00o(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf(type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class);
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            arrayList.add(C7460o0Oo0OOO.OooO00o(obj2));
        }
        return arrayList;
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        if (!obj.getClass().equals(C4840a.class)) {
            return null;
        }
        C4840a aVar = (C4840a) obj;
        Collection<Object> OooO00o = OooO00o(C7471o0Oo0oOo.OooO00o(type), type);
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            for (int i = 0; i < aVar.mo45542a(); i++) {
                OooO00o.add(C7633o0oOo000.OooO00o(aVar.mo45543a(i), type2));
            }
            return OooO00o;
        }
        throw new IllegalArgumentException("Does not support the implement for generics.");
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
