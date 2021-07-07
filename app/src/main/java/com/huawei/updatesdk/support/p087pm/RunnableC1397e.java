package com.huawei.updatesdk.support.p087pm;

import android.content.Context;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.support.p087pm.C1392c;

/* renamed from: com.huawei.updatesdk.support.pm.e */
public class RunnableC1397e implements Runnable {

    /* renamed from: a */
    public C1391b f1721a;

    /* renamed from: b */
    public Context f1722b;

    public RunnableC1397e(Context context, C1391b bVar) {
        this.f1722b = context;
        this.f1721a = bVar;
    }

    public void run() {
        C1278a.m1580a("PackageManagerRunnable", "PackageManagerRunnable run!!!!" + this.f1721a.toString());
        if (this.f1721a.mo16245g() == C1392c.EnumC1394b.INSTALL) {
            C1390a.m2107a(this.f1722b, this.f1721a);
        }
    }
}
