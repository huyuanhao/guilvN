package com.huawei.hms.api;

import android.os.Handler;
import android.os.Message;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.api.b */
public class C1115b implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ BindingFailedResolution f1145a;

    public C1115b(BindingFailedResolution bindingFailedResolution) {
        this.f1145a = bindingFailedResolution;
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 2) {
            return false;
        }
        C1202a.m1320d("BindingFailedResolution", "In connect, bind core try timeout");
        BindingFailedResolution.m1000a(this.f1145a, false);
        return true;
    }
}
