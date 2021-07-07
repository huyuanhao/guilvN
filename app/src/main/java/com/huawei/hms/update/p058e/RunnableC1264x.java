package com.huawei.hms.update.p058e;

import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;

/* renamed from: com.huawei.hms.update.e.x */
public final class RunnableC1264x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1210b f1406a;

    /* renamed from: b */
    public final /* synthetic */ int f1407b;

    /* renamed from: c */
    public final /* synthetic */ C1211c f1408c;

    public RunnableC1264x(AbstractC1210b bVar, int i, C1211c cVar) {
        this.f1406a = bVar;
        this.f1407b = i;
        this.f1408c = cVar;
    }

    public void run() {
        this.f1406a.mo15731a(this.f1407b, this.f1408c);
    }
}
