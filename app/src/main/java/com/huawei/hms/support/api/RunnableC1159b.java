package com.huawei.hms.support.api;

import com.huawei.hms.support.api.client.ResultCallback;

/* renamed from: com.huawei.hms.support.api.b */
public class RunnableC1159b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ResultCallback f1188a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1155a f1189b;

    public RunnableC1159b(AbstractC1155a aVar, ResultCallback resultCallback) {
        this.f1189b = aVar;
        this.f1188a = resultCallback;
    }

    public void run() {
        ResultCallback resultCallback = this.f1188a;
        AbstractC1155a aVar = this.f1189b;
        resultCallback.onResult(AbstractC1155a.m1135a(aVar, AbstractC1155a.m1133a(aVar)));
    }
}
