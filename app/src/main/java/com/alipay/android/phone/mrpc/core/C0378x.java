package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* renamed from: com.alipay.android.phone.mrpc.core.x */
public final class C0378x {

    /* renamed from: a */
    public AbstractC0360g f854a;

    /* renamed from: b */
    public C0380z f855b = new C0380z(this);

    public C0378x(AbstractC0360g gVar) {
        this.f854a = gVar;
    }

    /* renamed from: a */
    public final AbstractC0360g mo4180a() {
        return this.f854a;
    }

    /* renamed from: a */
    public final <T> T mo4181a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0379y(this.f854a, cls, this.f855b));
    }
}
