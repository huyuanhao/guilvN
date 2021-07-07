package com.huawei.hms.api;

import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.support.api.ResolveResult;

/* renamed from: com.huawei.hms.api.i */
public class RunnableC1122i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResolveResult f1154a;

    /* renamed from: b */
    public final /* synthetic */ HuaweiApiClientImpl.C1111a f1155b;

    public RunnableC1122i(HuaweiApiClientImpl.C1111a aVar, ResolveResult resolveResult) {
        this.f1155b = aVar;
        this.f1154a = resolveResult;
    }

    public void run() {
        HuaweiApiClientImpl.this.m1020b((HuaweiApiClientImpl) this.f1154a);
    }
}
