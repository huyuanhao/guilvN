package com.huawei.hms.update.p058e;

import android.content.Intent;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.update.p053a.p054a.AbstractC1210b;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;

/* renamed from: com.huawei.hms.update.e.y */
public class C1265y implements CheckUpdateCallBack {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1210b f1409a;

    /* renamed from: b */
    public final /* synthetic */ C1263w f1410b;

    public C1265y(C1263w wVar, AbstractC1210b bVar) {
        this.f1410b = wVar;
        this.f1409a = bVar;
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onMarketInstallInfo(Intent intent) {
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onMarketStoreError(int i) {
        C1202a.m1320d("UpdateWizard", "onMarketStoreError responseCode: " + i);
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onUpdateInfo(Intent intent) {
        if (intent != null) {
            this.f1410b.m1497a((C1263w) intent, (Intent) this.f1409a);
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onUpdateStoreError(int i) {
        C1202a.m1320d("UpdateWizard", "onUpdateStoreError responseCode: " + i);
    }
}
