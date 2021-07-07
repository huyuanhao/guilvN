package com.huawei.hms.support.api.transport;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;

public interface DatagramTransport {

    /* renamed from: com.huawei.hms.support.api.transport.DatagramTransport$a */
    public interface AbstractC1200a {
        /* renamed from: a */
        void mo15496a(int i, IMessageEntity iMessageEntity);
    }

    void post(ApiClient apiClient, AbstractC1200a aVar);

    void send(ApiClient apiClient, AbstractC1200a aVar);
}
