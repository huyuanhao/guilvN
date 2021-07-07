package com.xiaomi.push.service;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

/* renamed from: com.xiaomi.push.service.bn */
public class HandlerC4649bn extends Handler {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13309a;

    public HandlerC4649bn(XMPushService xMPushService) {
        this.f13309a = xMPushService;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message != null) {
            try {
                int i = message.what;
                if (i != 17) {
                    if (i == 18) {
                        Message obtain = Message.obtain((Handler) null, 0);
                        obtain.what = 18;
                        Bundle bundle = new Bundle();
                        bundle.putString("xmsf_region", XMPushService.m13757a(this.f13309a));
                        obtain.setData(bundle);
                        message.replyTo.send(obtain);
                    }
                } else if (message.obj != null) {
                    this.f13309a.onStart((Intent) message.obj, XMPushService.f13075a);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
