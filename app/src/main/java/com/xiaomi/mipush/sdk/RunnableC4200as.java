package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.xiaomi.mipush.sdk.as */
public final class RunnableC4200as implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11237a;

    /* renamed from: a */
    public final /* synthetic */ Intent f11238a;

    public RunnableC4200as(Context context, Intent intent) {
        this.f11237a = context;
        this.f11238a = intent;
    }

    public void run() {
        PushMessageHandler.m11394b(this.f11237a, this.f11238a);
    }
}
