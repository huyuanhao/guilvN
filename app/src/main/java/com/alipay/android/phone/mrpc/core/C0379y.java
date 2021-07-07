package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.alipay.android.phone.mrpc.core.y */
public final class C0379y implements InvocationHandler {

    /* renamed from: a */
    public AbstractC0360g f856a;

    /* renamed from: b */
    public Class<?> f857b;

    /* renamed from: c */
    public C0380z f858c;

    public C0379y(AbstractC0360g gVar, Class<?> cls, C0380z zVar) {
        this.f856a = gVar;
        this.f857b = cls;
        this.f858c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f858c.mo4183a(method, objArr);
    }
}
