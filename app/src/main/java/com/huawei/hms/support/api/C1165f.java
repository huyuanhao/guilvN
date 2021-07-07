package com.huawei.hms.support.api;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.AbstractC1160c;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.transport.DatagramTransport;

/* renamed from: com.huawei.hms.support.api.f */
public class C1165f implements DatagramTransport.AbstractC1200a {

    /* renamed from: a */
    public final /* synthetic */ AbstractC1160c.HandlerC1161a f1206a;

    /* renamed from: b */
    public final /* synthetic */ ResultCallback f1207b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC1160c f1208c;

    public C1165f(AbstractC1160c cVar, AbstractC1160c.HandlerC1161a aVar, ResultCallback resultCallback) {
        this.f1208c = cVar;
        this.f1206a = aVar;
        this.f1207b = resultCallback;
    }

    @Override // com.huawei.hms.support.api.transport.DatagramTransport.AbstractC1200a
    /* renamed from: a */
    public void mo15496a(int i, IMessageEntity iMessageEntity) {
        this.f1208c.m1144a(i, iMessageEntity);
        this.f1206a.mo15470a(this.f1207b, this.f1208c.f1191b);
    }
}
