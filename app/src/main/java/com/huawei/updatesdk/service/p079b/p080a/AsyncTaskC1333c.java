package com.huawei.updatesdk.service.p079b.p080a;

import android.text.TextUtils;
import com.huawei.updatesdk.p059a.p060a.C1267a;
import com.huawei.updatesdk.p059a.p060a.p061a.C1268a;
import com.huawei.updatesdk.p059a.p060a.p061a.C1269b;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p076c.AsyncTaskC1304b;
import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1298a;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1301c;
import com.huawei.updatesdk.sdk.service.p076c.p077a.C1302d;
import com.huawei.updatesdk.service.p078a.C1325a;
import com.huawei.updatesdk.support.p081a.C1365a;

/* renamed from: com.huawei.updatesdk.service.b.a.c */
public class AsyncTaskC1333c extends AsyncTaskC1304b {

    /* renamed from: b */
    public int f1586b = 0;

    /* renamed from: com.huawei.updatesdk.service.b.a.c$a */
    public static class C1334a {
        /* renamed from: a */
        public static boolean m1909a() {
            C1302d b = new AsyncTaskC1333c(C1268a.m1540f(), null).mo15937b();
            if (!(b instanceof C1269b) || b.mo15930d() != 0) {
                return false;
            }
            ((C1269b) b).mo15865b();
            return true;
        }

        /* renamed from: a */
        public static boolean m1911a(C1301c cVar, C1302d dVar) {
            if (cVar instanceof C1267a) {
                return (dVar.mo15930d() == 0 && dVar.mo15929c() == 0) ? false : true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m1912b(int i) {
            return i == 1022 || i == 1021 || i == 1012 || i == 1011;
        }
    }

    public AsyncTaskC1333c(C1301c cVar, AbstractC1298a aVar) {
        super(cVar, aVar);
    }

    /* renamed from: d */
    private void m1906d() {
        C1301c cVar = this.f1474a;
        if (cVar != null && (cVar instanceof C1267a)) {
            C1267a aVar = (C1267a) cVar;
            if (aVar.mo15835b()) {
                C1278a.m1583c("StoreTaskEx", "checkSign failed! recall front and set sign and hcrid again");
                aVar.mo15845i(C1325a.m1873a().mo16068d());
            }
        }
    }

    @Override // com.huawei.updatesdk.sdk.service.p076c.AsyncTaskC1304b
    /* renamed from: a */
    public void mo15935a(C1302d dVar) {
        if (this.f1474a instanceof C1268a) {
            return;
        }
        if (C1334a.m1912b(dVar.mo15930d()) || C1334a.m1911a(this.f1474a, dVar)) {
            int i = this.f1586b;
            this.f1586b = i + 1;
            if (i < 3) {
                C1278a.m1584d("StoreTaskEx", "reCallFrontSync, hcrID or sign error! method:" + this.f1474a.mo15920g() + ", rtnCode:" + dVar.mo15930d());
                if (C1334a.m1909a()) {
                    m1906d();
                    dVar.mo15925a(1);
                }
            }
        }
    }

    @Override // com.huawei.updatesdk.sdk.service.p076c.AsyncTaskC1304b
    /* renamed from: c */
    public String mo15939c() {
        String b = C1365a.m2026b();
        return TextUtils.isEmpty(b) ? super.mo15939c() : b;
    }
}
