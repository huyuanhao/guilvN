package com.huawei.hms.support.api.p040a;

import android.text.TextUtils;
import com.huawei.hms.support.api.ResolvePendingResult;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CheckConnectResp;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.CoreNaming;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeReq;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;

/* renamed from: com.huawei.hms.support.api.a.a */
public final class C1156a {
    /* renamed from: a */
    public static PendingResult<ResolveResult<ConnectResp>> m1139a(ApiClient apiClient, ConnectInfo connectInfo) {
        return new C1157b(apiClient, CoreNaming.CONNECT, connectInfo);
    }

    /* renamed from: a */
    public static ResolvePendingResult<DisconnectResp> m1136a(ApiClient apiClient, DisconnectInfo disconnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.DISCONNECT, disconnectInfo, DisconnectResp.class);
    }

    /* renamed from: a */
    public static InnerPendingResult<ResolveResult<CheckConnectResp>> m1137a(ApiClient apiClient, CheckConnectInfo checkConnectInfo) {
        return ResolvePendingResult.build(apiClient, CoreNaming.CHECKCONNECT, checkConnectInfo, CheckConnectResp.class);
    }

    /* renamed from: a */
    public static PendingResult<ResolveResult<JosGetNoticeResp>> m1138a(ApiClient apiClient, int i, String str) {
        JosGetNoticeReq josGetNoticeReq = new JosGetNoticeReq();
        josGetNoticeReq.setNoticeType(i);
        josGetNoticeReq.setHmsSdkVersionName(str);
        if (!TextUtils.isEmpty(apiClient.getCpID())) {
            josGetNoticeReq.setCpID(apiClient.getCpID());
        }
        return new C1158c(apiClient, CoreNaming.GETNOTICE, josGetNoticeReq);
    }
}
