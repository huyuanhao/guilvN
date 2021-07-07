package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.mipush.sdk.au */
public class RunnableC4202au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11243a;

    /* renamed from: a */
    public final /* synthetic */ C4201at f11244a;

    /* renamed from: a */
    public final /* synthetic */ String[] f11245a;

    public RunnableC4202au(C4201at atVar, String[] strArr, Context context) {
        this.f11244a = atVar;
        this.f11245a = strArr;
        this.f11243a = context;
    }

    public void run() {
        for (int i = 0; i < this.f11245a.length; i++) {
            try {
                if (!TextUtils.isEmpty(this.f11245a[i])) {
                    if (i > 0) {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                    }
                    PackageInfo packageInfo = this.f11243a.getPackageManager().getPackageInfo(this.f11245a[i], 4);
                    if (packageInfo != null) {
                        this.f11244a.m11424a((C4201at) this.f11243a, (Context) packageInfo);
                    }
                }
            } catch (Throwable th) {
                AbstractC4163b.m11303a(th);
                return;
            }
        }
    }
}
