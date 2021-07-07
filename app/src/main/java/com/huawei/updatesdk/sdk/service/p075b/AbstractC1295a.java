package com.huawei.updatesdk.sdk.service.p075b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.huawei.updatesdk.sdk.service.b.a */
public abstract class AbstractC1295a extends BroadcastReceiver {
    /* renamed from: a */
    public abstract void mo15902a(Context context, C1296b bVar);

    public final void onReceive(Context context, Intent intent) {
        mo15902a(context, C1296b.m1655a(intent));
    }
}
