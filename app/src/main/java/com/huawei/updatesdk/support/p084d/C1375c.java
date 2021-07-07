package com.huawei.updatesdk.support.p084d;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.service.p075b.C1296b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.updatesdk.support.d.c */
public final class C1375c {

    /* renamed from: a */
    public static C1375c f1672a = new C1375c();

    /* renamed from: b */
    public static AbstractC1373a f1673b = new AbstractC1373a() {
        /* class com.huawei.updatesdk.support.p084d.C1375c.C13761 */

        /* renamed from: a */
        public final List<AbstractC1374b> f1674a = new ArrayList();

        @Override // com.huawei.updatesdk.support.p084d.AbstractC1373a
        /* renamed from: a */
        public void mo16202a(int i, C1296b bVar) {
            synchronized (this.f1674a) {
                for (AbstractC1374b bVar2 : this.f1674a) {
                    bVar2.mo16157a(i, bVar);
                }
            }
        }

        @Override // com.huawei.updatesdk.support.p084d.AbstractC1373a
        /* renamed from: a */
        public void mo16203a(AbstractC1374b bVar) {
            String str;
            String str2;
            synchronized (this.f1674a) {
                if (bVar != null) {
                    if (!this.f1674a.contains(bVar)) {
                        try {
                            this.f1674a.add(bVar);
                        } catch (UnsupportedOperationException unused) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver UnsupportedOperationException";
                        } catch (ClassCastException unused2) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver ClassCastException";
                        } catch (IllegalArgumentException unused3) {
                            str = "InstallObserverManager";
                            str2 = "registerObserver IllegalArgumentException";
                        }
                    }
                }
                return;
            }
            C1278a.m1584d(str, str2);
        }

        @Override // com.huawei.updatesdk.support.p084d.AbstractC1373a
        /* renamed from: b */
        public void mo16204b(AbstractC1374b bVar) {
            synchronized (this.f1674a) {
                try {
                    this.f1674a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    C1278a.m1584d("InstallObserverManager", "unRegisterObserver UnsupportedOperationException");
                }
            }
        }
    };

    /* renamed from: a */
    public static C1375c m2059a() {
        return f1672a;
    }

    /* renamed from: b */
    public static AbstractC1373a m2060b() {
        return f1673b;
    }

    /* renamed from: a */
    public void mo16205a(C1296b bVar) {
        f1673b.mo16202a(0, bVar);
    }

    /* renamed from: b */
    public void mo16206b(C1296b bVar) {
        f1673b.mo16202a(1, bVar);
    }

    /* renamed from: c */
    public void mo16207c(C1296b bVar) {
        f1673b.mo16202a(2, bVar);
    }
}
