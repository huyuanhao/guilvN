package com.huawei.hms.api;

import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.support.api.ResolveResult;

/* renamed from: com.huawei.hms.api.j */
public class RunnableC1123j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResolveResult f1156a;

    /* renamed from: b */
    public final /* synthetic */ HuaweiApiClientImpl.C1112b f1157b;

    public RunnableC1123j(HuaweiApiClientImpl.C1112b bVar, ResolveResult resolveResult) {
        this.f1157b = bVar;
        this.f1156a = resolveResult;
    }

    public void run() {
        HuaweiApiClientImpl.this.m1015a((HuaweiApiClientImpl) this.f1156a);
    }
}
