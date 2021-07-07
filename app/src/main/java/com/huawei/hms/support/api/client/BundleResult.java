package com.huawei.hms.support.api.client;

import android.os.Bundle;

public class BundleResult {

    /* renamed from: a */
    public int f1195a;

    /* renamed from: b */
    public Bundle f1196b;

    public BundleResult(int i, Bundle bundle) {
        this.f1195a = i;
        this.f1196b = bundle;
    }

    public int getResultCode() {
        return this.f1195a;
    }

    public Bundle getRspBody() {
        return this.f1196b;
    }

    public void setResultCode(int i) {
        this.f1195a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.f1196b = bundle;
    }
}
