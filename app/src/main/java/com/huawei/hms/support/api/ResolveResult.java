package com.huawei.hms.support.api;

import com.huawei.hms.support.api.client.Result;

public class ResolveResult<T> extends Result {

    /* renamed from: a */
    public T f1185a;

    public ResolveResult() {
        this.f1185a = null;
    }

    public T getValue() {
        return this.f1185a;
    }

    public ResolveResult(T t) {
        this.f1185a = t;
    }
}
