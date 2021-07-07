package com.huawei.hms.support.api.p040a;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.a.b */
public final class C1157b extends AbstractC1160c<ResolveResult<ConnectResp>, ConnectResp> {
    public C1157b(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
    }

    /* renamed from: a */
    public ResolveResult<ConnectResp> onComplete(ConnectResp connectResp) {
        ResolveResult<ConnectResp> resolveResult = new ResolveResult<>(connectResp);
        resolveResult.setStatus(Status.SUCCESS);
        C1202a.m1316a("connectservice", "connect - onComplete: success");
        return resolveResult;
    }

    @Override // com.huawei.hms.support.api.AbstractC1160c
    public boolean checkApiClient(ApiClient apiClient) {
        return apiClient != null;
    }
}
