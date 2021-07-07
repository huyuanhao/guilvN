package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;

/* renamed from: com.xiaomi.mipush.sdk.af */
public final class RunnableC4187af implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11219a;

    /* renamed from: a */
    public final /* synthetic */ String[] f11220a;

    public RunnableC4187af(String[] strArr, Context context) {
        this.f11220a = strArr;
        this.f11219a = context;
    }

    public void run() {
        try {
            String[] strArr = this.f11220a;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    PackageInfo packageInfo = this.f11219a.getPackageManager().getPackageInfo(str, 4);
                    if (packageInfo != null) {
                        MiPushClient.awakePushServiceByPackageInfo(this.f11219a, packageInfo);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
        }
    }
}
