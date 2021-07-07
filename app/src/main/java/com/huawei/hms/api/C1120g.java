package com.huawei.hms.api;

import android.os.Handler;
import android.os.Message;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.api.g */
public class C1120g implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ HuaweiApiClientImpl f1151a;

    public C1120g(HuaweiApiClientImpl huaweiApiClientImpl) {
        this.f1151a = huaweiApiClientImpl;
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 2) {
            return false;
        }
        C1202a.m1320d("HuaweiApiClientImpl", "In connect, bind core service time out");
        if (this.f1151a.f1122k.get() == 5) {
            this.f1151a.m1012a((HuaweiApiClientImpl) 1);
            this.f1151a.m1011a();
        }
        return true;
    }
}
