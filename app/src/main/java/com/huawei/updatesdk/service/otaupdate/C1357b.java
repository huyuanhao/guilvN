package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;

/* renamed from: com.huawei.updatesdk.service.otaupdate.b */
public class C1357b {

    /* renamed from: a */
    public static C1357b f1635a;

    /* renamed from: c */
    public static final Object f1636c = new Object();

    /* renamed from: b */
    public CheckUpdateCallBack f1637b;

    /* renamed from: a */
    public static C1357b m1992a() {
        C1357b bVar;
        synchronized (f1636c) {
            if (f1635a == null) {
                f1635a = new C1357b();
            }
            bVar = f1635a;
        }
        return bVar;
    }

    /* renamed from: a */
    public void mo16174a(int i) {
        CheckUpdateCallBack checkUpdateCallBack = this.f1637b;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketStoreError(i);
        }
    }

    /* renamed from: a */
    public void mo16175a(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.f1637b;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onMarketInstallInfo(intent);
        }
    }

    /* renamed from: a */
    public void mo16176a(CheckUpdateCallBack checkUpdateCallBack) {
        this.f1637b = checkUpdateCallBack;
    }

    /* renamed from: b */
    public void mo16177b(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack = this.f1637b;
        if (checkUpdateCallBack != null) {
            checkUpdateCallBack.onUpdateInfo(intent);
        }
    }
}
