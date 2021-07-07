package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.transport.DatagramTransport;

/* renamed from: com.huawei.hms.support.api.d */
public class C1163d implements DatagramTransport.AbstractC1200a {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1160c f1202a;

    public C1163d(AbstractC1160c cVar) {
        this.f1202a = cVar;
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport.AbstractC1200a
    /* renamed from: a */
    public void mo15496a(int i, IMessageEntity iMessageEntity) {
        this.f1202a.m1144a(i, iMessageEntity);
        this.f1202a.f1190a.countDown();
    }
}
