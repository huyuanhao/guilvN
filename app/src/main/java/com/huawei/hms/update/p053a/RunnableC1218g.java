package com.huawei.hms.update.p053a;

import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;

/* renamed from: com.huawei.hms.update.a.g */
public class RunnableC1218g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1210b f1343a;

    /* renamed from: b */
    public final /* synthetic */ C1211c f1344b;

    /* renamed from: c */
    public final /* synthetic */ C1214c f1345c;

    public RunnableC1218g(C1214c cVar, AbstractC1210b bVar, C1211c cVar2) {
        this.f1345c = cVar;
        this.f1343a = bVar;
        this.f1344b = cVar2;
    }

    public void run() {
        C1214c.m1357a(this.f1345c).mo15729a(C1214c.m1358a(this.f1343a), this.f1344b);
    }
}
