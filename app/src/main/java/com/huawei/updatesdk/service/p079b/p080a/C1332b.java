package com.huawei.updatesdk.service.p079b.p080a;

import com.huawei.updatesdk.p059a.p060a.C1267a;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import com.huawei.updatesdk.support.p082b.C1369c;

/* renamed from: com.huawei.updatesdk.service.b.a.b */
public class C1332b {
    /* renamed from: a */
    public static C1302d m1902a(C1301c cVar) {
        return new AsyncTaskC1333c(cVar, null).mo15933a();
    }

    /* renamed from: a */
    public static AsyncTaskC1333c m1903a(C1267a aVar, AbstractC1298a aVar2) {
        AsyncTaskC1333c cVar = new AsyncTaskC1333c(aVar, aVar2);
        m1904a(cVar, aVar);
        return cVar;
    }

    /* renamed from: a */
    public static void m1904a(AsyncTaskC1333c cVar, C1267a aVar) {
        C1278a.m1580a("StoreAgent", "executeTask, ActiveCount:" + C1369c.f1662a.getActiveCount() + ", TaskCount:" + C1369c.f1662a.getTaskCount());
        cVar.mo15936a(aVar.mo15837c() ? C1369c.f1663b : C1369c.f1662a);
    }
}
