package com.huawei.hms.api;

import android.content.Intent;
import com.huawei.hms.support.log.C1202a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;

/* renamed from: com.huawei.hms.api.f */
public class C1119f implements CheckUpdateCallBack {

    /* renamed from: a */
    public final /* synthetic */ HuaweiApiClientImpl f1150a;

    public C1119f(HuaweiApiClientImpl huaweiApiClientImpl) {
        this.f1150a = huaweiApiClientImpl;
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onMarketInstallInfo(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra(UpdateKey.MARKET_DLD_STATUS, -99);
            int intExtra2 = intent.getIntExtra(UpdateKey.MARKET_INSTALL_STATE, -99);
            int intExtra3 = intent.getIntExtra(UpdateKey.MARKET_INSTALL_TYPE, -99);
            C1202a.m1318b("HuaweiApiClientImpl", "onMarketInstallInfo installState: " + intExtra2 + ",installType: " + intExtra3 + ",downloadCode: " + intExtra);
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onMarketStoreError(int i) {
        C1202a.m1320d("HuaweiApiClientImpl", "onMarketStoreError responseCode: " + i);
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onUpdateInfo(Intent intent) {
        if (intent != null && this.f1150a.f1132u != null) {
            try {
                int intExtra = intent.getIntExtra("status", -99);
                int intExtra2 = intent.getIntExtra(UpdateKey.FAIL_CODE, -99);
                boolean booleanExtra = intent.getBooleanExtra(UpdateKey.MUST_UPDATE, false);
                C1202a.m1318b("HuaweiApiClientImpl", "onUpdateInfo status: " + intExtra + ",failcause: " + intExtra2 + ",isExit: " + booleanExtra);
                if (intExtra == 7) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) intent.getSerializableExtra(UpdateKey.INFO);
                    if (apkUpgradeInfo != null) {
                        C1202a.m1318b("HuaweiApiClientImpl", "onUpdateInfo: " + apkUpgradeInfo.toString());
                    }
                    this.f1150a.f1132u.onResult(1);
                } else if (intExtra == 3) {
                    this.f1150a.f1132u.onResult(0);
                } else {
                    this.f1150a.f1132u.onResult(-1);
                }
                this.f1150a.f1132u = null;
            } catch (Exception e) {
                C1202a.m1320d("HuaweiApiClientImpl", "intent has some error" + e.getMessage());
                this.f1150a.f1132u.onResult(-1);
            }
        }
    }

    @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
    public void onUpdateStoreError(int i) {
        C1202a.m1320d("HuaweiApiClientImpl", "onUpdateStoreError responseCode: " + i);
    }
}
