package com.huawei.hms.api;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.huawei.hms.api.a */
public class C1114a implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ BindingFailedResolution f1144a;

    public C1114a(BindingFailedResolution bindingFailedResolution) {
        this.f1144a = bindingFailedResolution;
    }

    public boolean handleMessage(Message message) {
        if (message == null || message.what != 3) {
            return false;
        }
        BindingFailedResolution.m999a(this.f1144a, 8);
        return true;
    }
}
