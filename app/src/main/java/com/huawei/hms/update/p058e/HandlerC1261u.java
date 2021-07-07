package com.huawei.hms.update.p058e;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.huawei.hms.update.e.u */
public class HandlerC1261u extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C1259t f1395a;

    public HandlerC1261u(C1259t tVar) {
        this.f1395a = tVar;
    }

    public void handleMessage(Message message) {
        Bundle bundle = (Bundle) message.obj;
        switch (message.what) {
            case 101:
                this.f1395a.m1466a((C1259t) bundle);
                return;
            case 102:
                this.f1395a.m1471b((C1259t) bundle);
                return;
            case 103:
                this.f1395a.m1474c((C1259t) bundle);
                return;
            default:
                return;
        }
    }
}
