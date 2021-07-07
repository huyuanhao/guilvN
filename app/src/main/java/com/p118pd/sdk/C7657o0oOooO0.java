package com.p118pd.sdk;

import java.lang.reflect.Type;
import java.util.Date;

/* renamed from: com.pd.sdk.o0oOooO0  reason: case insensitive filesystem */
public final class C7657o0oOooO0 implements AbstractC7461o0Oo0OOo, AbstractC7463o0Oo0Oo0 {
    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0
    public final Object OooO00o(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final Object OooO00o(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.p118pd.sdk.AbstractC7463o0Oo0Oo0, com.p118pd.sdk.AbstractC7461o0Oo0OOo
    public final boolean OooO00o(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
