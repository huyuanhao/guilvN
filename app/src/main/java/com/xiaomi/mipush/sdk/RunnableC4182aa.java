package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.mipush.sdk.aa */
public final class RunnableC4182aa implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11213a;

    /* renamed from: a */
    public final /* synthetic */ Intent f11214a;

    public RunnableC4182aa(Context context, Intent intent) {
        this.f11213a = context;
        this.f11214a = intent;
    }

    public void run() {
        try {
            this.f11213a.startService(this.f11214a);
        } catch (Exception e) {
            AbstractC4163b.m11301a(e.getMessage());
        }
    }
}
