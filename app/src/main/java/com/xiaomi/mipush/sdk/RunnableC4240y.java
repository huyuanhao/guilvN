package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.p118pd.sdk.C7992oO0ooO0;

/* renamed from: com.xiaomi.mipush.sdk.y */
public final class RunnableC4240y implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11334a;

    public RunnableC4240y(Context context) {
        this.f11334a = context;
    }

    public void run() {
        try {
            PackageInfo packageInfo = this.f11334a.getPackageManager().getPackageInfo(this.f11334a.getPackageName(), C7992oO0ooO0.OooOOOO);
            C4237x.m11614c(this.f11334a);
            C4237x.m11616d(this.f11334a, packageInfo);
            C4237x.m11615c(this.f11334a, packageInfo);
        } catch (Throwable unused) {
        }
    }
}
