package com.qiyukf.nimlib.p179d;

import com.qiyukf.nimlib.sdk.AbortableFuture;
import com.qiyukf.unicorn.api.RequestCallback;

/* renamed from: com.qiyukf.nimlib.d.f */
public abstract class AbstractC2215f<T> implements AbortableFuture {

    /* renamed from: c */
    public T f4413c;

    public AbstractC2215f(T t) {
        this.f4413c = t;
    }

    @Override // com.qiyukf.nimlib.sdk.InvocationFuture
    public void setCallback(RequestCallback requestCallback) {
    }
}
