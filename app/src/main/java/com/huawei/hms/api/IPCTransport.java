package com.huawei.hms.api;

import android.os.Bundle;
import com.huawei.hms.core.aidl.AbstractC1146d;
import com.huawei.hms.core.aidl.C1142a;
import com.huawei.hms.core.aidl.C1144b;
import com.huawei.hms.core.aidl.C1152f;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.C1202a;

public class IPCTransport implements DatagramTransport {

    /* renamed from: a */
    public final String f1139a;

    /* renamed from: b */
    public final IMessageEntity f1140b;

    /* renamed from: c */
    public final Class<? extends IMessageEntity> f1141c;

    public IPCTransport(String str, IMessageEntity iMessageEntity, Class<? extends IMessageEntity> cls) {
        this.f1139a = str;
        this.f1140b = iMessageEntity;
        this.f1141c = cls;
    }

    /* renamed from: a */
    private int m1038a(ApiClient apiClient, AbstractC1146d dVar) {
        C1144b bVar = new C1144b(this.f1139a, ProtocolNegotiate.getInstance().getVersion());
        C1152f a = C1142a.m1106a(bVar.mo15436c());
        bVar.mo15434a(a.mo15450a(this.f1140b, new Bundle()));
        RequestHeader requestHeader = new RequestHeader();
        requestHeader.setAppID(apiClient.getAppID());
        requestHeader.setPackageName(apiClient.getPackageName());
        requestHeader.setSdkVersion(HuaweiApiAvailability.HMS_SDK_VERSION_CODE);
        requestHeader.setApiNameList(((HuaweiApiClientImpl) apiClient).getApiNameList());
        if (apiClient instanceof HuaweiApiClientImpl) {
            requestHeader.setSessionId(apiClient.getSessionId());
        }
        bVar.f1180b = a.mo15450a(requestHeader, new Bundle());
        try {
            ((HuaweiApiClientImpl) apiClient).getService().mo15447a(bVar, dVar);
            return 0;
        } catch (Exception e) {
            C1202a.m1320d("transport", "sync call ex:" + e.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void post(ApiClient apiClient, DatagramTransport.AbstractC1200a aVar) {
        send(apiClient, aVar);
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport
    public final void send(ApiClient apiClient, DatagramTransport.AbstractC1200a aVar) {
        int a = m1038a(apiClient, new IPCCallback(this.f1141c, aVar));
        if (a != 0) {
            aVar.mo15496a(a, null);
        }
    }
}
