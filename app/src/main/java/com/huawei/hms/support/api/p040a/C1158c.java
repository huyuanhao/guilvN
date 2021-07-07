package com.huawei.hms.support.api.p040a;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.a.c */
public final class C1158c extends AbstractC1160c<ResolveResult<JosGetNoticeResp>, JosGetNoticeResp> {
    public C1158c(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        super(apiClient, str, iMessageEntity);
    }

    /* renamed from: a */
    public ResolveResult<JosGetNoticeResp> onComplete(JosGetNoticeResp josGetNoticeResp) {
        if (josGetNoticeResp == null) {
            C1202a.m1320d("connectservice", "JosNoticeResp is null");
            return null;
        }
        C1202a.m1318b("connectservice", "josNoticeResp status code :" + josGetNoticeResp.getStatusCode());
        ResolveResult<JosGetNoticeResp> resolveResult = new ResolveResult<>(josGetNoticeResp);
        resolveResult.setStatus(Status.SUCCESS);
        return resolveResult;
    }
}
