package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.C4840a;

/* renamed from: com.pd.sdk.o0Oo0OO0  reason: case insensitive filesystem */
public final class C7459o0Oo0OO0 implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
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
        if (!(type instanceof GenericArrayType)) {
            Class<?> componentType = ((Class) type).getComponentType();
            int a = aVar.mo45542a();
            Object newInstance = Array.newInstance(componentType, a);
            for (int i = 0; i < a; i++) {
                Array.set(newInstance, i, C7633o0oOo000.OooO00o(aVar.mo45543a(i), componentType));
            }
            return newInstance;
        }
        throw new IllegalArgumentException("Does not support generic array!");
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return cls.isArray();
    }
}
