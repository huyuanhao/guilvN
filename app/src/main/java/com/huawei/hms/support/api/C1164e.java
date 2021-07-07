package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.transport.DatagramTransport;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.huawei.hms.support.api.e */
public class C1164e implements DatagramTransport.AbstractC1200a {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f1203a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC1160c f1204b;

    public C1164e(AbstractC1160c cVar, AtomicBoolean atomicBoolean) {
        this.f1204b = cVar;
        this.f1203a = atomicBoolean;
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport.AbstractC1200a
    /* renamed from: a */
    public void mo15496a(int i, IMessageEntity iMessageEntity) {
        if (!this.f1203a.get()) {
            this.f1204b.m1144a(i, iMessageEntity);
        }
        this.f1204b.f1190a.countDown();
    }
}
