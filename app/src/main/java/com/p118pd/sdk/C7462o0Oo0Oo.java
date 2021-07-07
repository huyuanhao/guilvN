package com.p118pd.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.C4840a;

/* renamed from: com.pd.sdk.o0Oo0Oo  reason: case insensitive filesystem */
public final class C7462o0Oo0Oo implements AbstractC7461o0Oo0OOo {
    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        if (!obj.getClass().equals(C4840a.class)) {
            return null;
        }
        C4840a aVar = (C4840a) obj;
        HashSet hashSet = new HashSet();
        Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < aVar.mo45542a(); i++) {
            hashSet.add(C7633o0oOo000.OooO00o(aVar.mo45543a(i), cls));
        }
        return hashSet;
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
