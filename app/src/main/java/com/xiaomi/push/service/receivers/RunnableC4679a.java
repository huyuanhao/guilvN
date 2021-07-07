package com.xiaomi.push.service.receivers;

import android.content.Context;

/* renamed from: com.xiaomi.push.service.receivers.a */
public class RunnableC4679a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f13384a;

    /* renamed from: a */
    public final /* synthetic */ NetworkStatusReceiver f13385a;

    public RunnableC4679a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f13385a = networkStatusReceiver;
        this.f13384a = context;
    }

    public void run() {
        this.f13385a.m14192a(this.f13384a);
    }
}
