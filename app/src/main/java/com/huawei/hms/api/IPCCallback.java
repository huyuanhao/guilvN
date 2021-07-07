package com.huawei.hms.api;

import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.AbstractC1146d;
import com.huawei.hms.core.aidl.C1142a;
import com.huawei.hms.core.aidl.C1144b;
import com.huawei.hms.core.aidl.C1152f;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.log.C1202a;

public class IPCCallback extends AbstractC1146d.AbstractBinderC1147a {

    /* renamed from: a */
    public final Class<? extends IMessageEntity> f1137a;

    /* renamed from: b */
    public final DatagramTransport.AbstractC1200a f1138b;

    public IPCCallback(Class<? extends IMessageEntity> cls, DatagramTransport.AbstractC1200a aVar) {
        this.f1137a = cls;
        this.f1138b = aVar;
    }

    @Override // com.huawei.hms.core.aidl.AbstractC1146d
    public void call(C1144b bVar) throws RemoteException {
        if (bVar == null || TextUtils.isEmpty(bVar.f1179a)) {
            C1202a.m1320d("IPCCallback", "In call, URI cannot be empty.");
            throw new RemoteException();
        }
        C1152f a = C1142a.m1106a(bVar.mo15436c());
        ResponseHeader responseHeader = new ResponseHeader();
        a.mo15451a(bVar.f1180b, responseHeader);
        IMessageEntity iMessageEntity = null;
        if (bVar.mo15435b() > 0 && (iMessageEntity = newResponseInstance()) != null) {
            a.mo15451a(bVar.mo15433a(), iMessageEntity);
        }
        this.f1138b.mo15496a(responseHeader.getStatusCode(), iMessageEntity);
    }

    public IMessageEntity newResponseInstance() {
        Class<? extends IMessageEntity> cls = this.f1137a;
        if (cls == null) {
            return null;
        }
        try {
            return (IMessageEntity) cls.newInstance();
        } catch (IllegalAccessException | InstantiationException e) {
            C1202a.m1320d("IPCCallback", "In newResponseInstance, instancing exception." + e.getMessage());
            return null;
        }
    }
}
