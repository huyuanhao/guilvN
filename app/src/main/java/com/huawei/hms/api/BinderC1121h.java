package com.huawei.hms.api;

import com.huawei.hms.core.aidl.AbstractC1146d;
import com.huawei.hms.core.aidl.C1142a;
import com.huawei.hms.core.aidl.C1144b;
import com.huawei.hms.core.aidl.C1152f;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.api.h */
public class BinderC1121h extends AbstractC1146d.AbstractBinderC1147a {

    /* renamed from: a */
    public final /* synthetic */ ResultCallback f1152a;

    /* renamed from: b */
    public final /* synthetic */ HuaweiApiClientImpl f1153b;

    public BinderC1121h(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
        this.f1153b = huaweiApiClientImpl;
        this.f1152a = resultCallback;
    }

    @Override // com.huawei.hms.core.aidl.AbstractC1146d
    public void call(C1144b bVar) {
        if (bVar != null) {
            C1152f a = C1142a.m1106a(bVar.mo15436c());
            ResponseHeader responseHeader = new ResponseHeader();
            a.mo15451a(bVar.f1180b, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), bVar.mo15433a());
            C1202a.m1318b("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f1152a.onResult(bundleResult);
            return;
        }
        C1202a.m1318b("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
        this.f1152a.onResult(new BundleResult(-1, null));
    }
}
