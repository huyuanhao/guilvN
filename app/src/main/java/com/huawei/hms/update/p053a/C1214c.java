package com.huawei.hms.update.p053a;

import com.huawei.hms.p037c.C1131a;
import com.huawei.hms.update.p053a.p054a.AbstractC1209a;
import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.hms.update.p053a.p054a.C1211c;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.huawei.hms.update.a.c */
public class C1214c implements AbstractC1209a {

    /* renamed from: a */
    public static final Executor f1332a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    public final AbstractC1209a f1333b;

    public C1214c(AbstractC1209a aVar) {
        C1131a.m1062a(aVar, "update must not be null.");
        this.f1333b = aVar;
    }

    /* renamed from: b */
    public static AbstractC1210b m1359b(AbstractC1210b bVar) {
        return new C1215d(bVar);
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1209a
    /* renamed from: a */
    public void mo15728a() {
        this.f1333b.mo15728a();
    }

    @Override // com.huawei.hms.update.p053a.p054a.AbstractC1209a
    /* renamed from: a */
    public void mo15729a(AbstractC1210b bVar, C1211c cVar) {
        f1332a.execute(new RunnableC1218g(this, bVar, cVar));
    }
}
