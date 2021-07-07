package com.p118pd.sdk;

import java.lang.reflect.Type;

/* renamed from: com.pd.sdk.o0ooOOOO  reason: case insensitive filesystem */
public final class C7723o0ooOOOO implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
